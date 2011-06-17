	//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.gxt.dmw.generators;

import java.io.File;
import java.io.IOException;

import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.generators.BaseDMWGenerator;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class GxtDMWGenerator extends BaseDMWGenerator {


	public GxtDMWGenerator(){
//		sformatter = new SchemaFormatter();
		
		genContext			= "gxt";
		genSuffix			= "GXT";
		baseWrapperImport 		= "org.dmd.mvw.client.gxt.dmw.GxtWrapper";
		namedWrapperImport		= "org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper";
		hierarchicWrapperImport	= "org.dmd.mvw.client.gxt.dmw.GxtHierarchicObjectWrapper";
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DarkMatterGeneratorIF implementation

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// Nothing for now
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "gxt";
		auxwdir = gendir + File.separator + "auxw";
		
		schema = sm;
		
		createGenDirs();
		
//		createTypeIterables(config, loc, f, sm);
		
		createWrappers(config, loc, f, sm);
		
//		sformatter.setFileHeader(fileHeader);
//		sformatter.setProgressStream(progress);
//		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
//		sformatter.dumpSchema(gendir, config.getGenPackage(), sd, sm);
	}

	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(dmwdir);
		if (!ddf.exists())
			ddf.mkdir();
		
		File adf = new File(auxwdir);
		if (!adf.exists())
			adf.mkdir();
		
	}


}
