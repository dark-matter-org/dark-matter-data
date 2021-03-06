//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmg;

import java.io.IOException;
import java.io.PrintStream;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DarkMatterGeneratorIF interface must be implemented by classes that
 * are referred to in Dark Matter Generator (DMG) configurations as objects
 * that will generate code based on Dark Matter Schemas (DMS) or other kinds
 * of configuration files.
 */
public interface DarkMatterGeneratorIF {

	/**
	 * In cases where your generator requires some further input from the user,
	 * you can overload this method to perform that interaction.
	 * @param config The generator config.
	 * @param loc The location where the config was found. Code if often generated relative to
	 * this location.
	 * @param f The configuration finder
	 * @param sm The schema manager that contains the base schema plus any others that
	 * were requested in the .dmg config file via the schemaToLoad attribute.
	 */
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm);
	
	/**
	 * This method should be overloaded to generate whatever code you need to generate.
	 * @param config The generator config.
	 * @param loc The location where the config was found. Code if often generated relative to
	 * this location.
	 * @param f The configuration finder
	 * @param sm The schema manager that contains the base schema plus any others that
	 * were requested in the .dmg config file via the schemaToLoad attribute.
	 * @throws IOException 
	 * @throws ResultException 
	 * @throws DmcNameClashException 
	 * @throws DmcValueException 
	 */
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException, DmcNameClashException, DmcValueException;
	
	/**
	 * If the overall generation process wants you to provide feedback, this method will be
	 * called with a handle to the print stream where you should display progress messages.
	 * @param ps The print stream
	 */
	public void setProgressStream(PrintStream ps);
	
	/**
	 * In some cases, it's convenient to be able to dump a common header to your generated
	 * files. This method lets you set that header.
	 * @param fh The header text.
	 */
	public void setFileHeader(String fh);
	
}
