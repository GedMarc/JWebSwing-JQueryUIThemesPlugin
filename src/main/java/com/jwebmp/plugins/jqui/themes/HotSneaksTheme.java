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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * Implements the UI Darkness Theme
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
public class HotSneaksTheme
		extends Theme
{


	/**
	 * New hot sneaks theme
	 */
	public HotSneaksTheme()
	{
		super("Hot Sneaks", "uihotsneaks", "bower_components/jquery-ui/themes/images/theme_30_hot_sneaks.png", "",
		      "bower_components/jquery-ui/themes/images/theme_90_hot_sneaks.png");
		getCssReferences().add(new CSSReference("hotsneaksTheme", 1.121, "bower_components/jquery-ui/themes/hot-sneaks/theme.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/hot-sneaks/theme.min.css").setSpecifiedClassName("jquitheme"));
		getCssReferences().add(new CSSReference("hotsneaksTheme2", 1.121, "bower_components/jquery-ui/themes/hot-sneaks/jquery-ui.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/hot-sneaks/jquery-ui.min.css").setSpecifiedClassName("jquitheme"));
	}

}
