/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqui.themes;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@PluginInformation(pluginName = "JQuery UI Themes",
		pluginUniqueName = "jquery-ui-themes",
		pluginDescription = "A set of prebuilt themes from the theme roller set for jquery ui",
		pluginVersion = "1.12.1",
		pluginDependancyUniqueIDs = "jquery-ui",
		pluginCategories = "jquery, ui, jquery-ui",
		pluginSubtitle = "JQuery UI Default Themes",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIThemesPlugin",
		pluginSourceUrl = "http://jqueryui.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIThemesPlugin/wiki",
		pluginOriginalHomepage = "http://jqueryui.com/themeroller/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jqui-themes",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-jqui-themes",
		pluginModuleName = "com.jwebmp.plugins.jqueryui.themes",
		pluginStatus = PluginStatus.Released
)
public class JQUIThemesPageConfigurator
		implements IPageConfigurator<JQUIThemesPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static JQUIThemes theme = JQUIThemes.Base;

	public JQUIThemesPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQUIThemesPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQUIThemesPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Sets the default theme to load the page with
	 *
	 * @return
	 */
	@NotNull
	public static JQUIThemes getTheme()
	{
		return JQUIThemesPageConfigurator.theme;
	}

	/**
	 * Sets the default theme to load the page with
	 *
	 * @param theme
	 */
	public static void setTheme(@NotNull JQUIThemes theme)
	{
		JQUIThemesPageConfigurator.theme = theme;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQUIThemesPageConfigurator.theme.getTheme()
			                                .getCssReferences()
			                                .forEach(a -> page.getBody()
			                                                  .addCssReference(a));
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQUIThemesPageConfigurator.enabled;
	}
}
