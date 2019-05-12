//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.templates.server.util;

import java.io.IOException;

/**
 * The FormattedArtifactIF interface should be implemented by whatever mechanism
 * you want to use to gathers the formatted output of the dark-matter templating
 * mechanisms. A FormattedArtifactIF interface is injected into the FormattingContext
 * before the formatting of your output begins. It is then used as Sections are
 * added to the TextualArtifact.
 * <p/>
 * For the sake of convenience, 
 */
public interface FormattedArtifactIF {

	public void addText(String text) throws IOException;
}
