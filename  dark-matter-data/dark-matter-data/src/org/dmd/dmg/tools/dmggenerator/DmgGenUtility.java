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
package org.dmd.dmg.tools.dmggenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoGenerator;
import org.dmd.dms.util.DmsSchemaFinder;
import org.dmd.dms.util.DmsSchemaLocation;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;

/**
 * The DmoGenerator is a commandline utility that lets you generate Dark Matter Objects (DMOs)
 * from Dark Matter Schema (DMS) definitions.
 */
public class DmgGenUtility {

	// Our base schema manager
	SchemaManager	baseSchema;
	
	SchemaManager	baseWithDMGSchema;
	
	// The schema manager that will hold definitions read by the schema parser
	SchemaManager	readSchemas;
	
	// Finds our dmg config files
	ConfigFinder	schemaFinder;
	
	ConfigFinder	configFinder;
	
	DmsSchemaParser	schemaParser;
	
	// The thing that parses the available DMG configs
	DmgParser		parser;
	
	// The thing that will generate our DMO code
	DmoGenerator	codeGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	public DmgGenUtility() throws ResultException, IOException, DmcValueException {
		baseSchema = new SchemaManager();
		
		readSchemas = null;
		
		schemaFinder = new ConfigFinder();
		schemaFinder.addSuffix(".dms");
		schemaFinder.addJarEnding("DMSchema.jar");
		
		configFinder = new ConfigFinder();
		configFinder.addSuffix(".dmg");
		
		configFinder.findConfigs();
		
//		schemaParser = new DmsSchemaParser(dmsSchema, finder);
		
		parser = new DmgParser(baseSchema, configFinder);
		
		codeGenerator = new DmoGenerator(System.out);
		
//		String f = "%-" + finder.getLongestName() + "s";
//		format = new PrintfFormat(f);
	}
	
	public void run(){
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;

        System.out.println("\ndmg generator - enter the name of the Dark Matter Generator config\n");
        System.out.println("Enter ? for a list of configs...\n\n");
        
        while(true){
            try{
            	String s = in.readLine();
            	if (s == null)
            		return;
            	
                currLine = s.trim();

                if (currLine.length() == 0)
                    continue;
                
                ConfigVersion currConfig = configFinder.getConfig(currLine);

                if (currLine.equals("?")){
                	System.out.println("");
                	Iterator<ConfigVersion> it = configFinder.getVersions().values().iterator();
                	while(it.hasNext()){
                		ConfigLocation config = it.next().getLatestVersion();
                		System.out.println(format.sprintf(config.getConfigName()) + " " + config.getVersion());
                		System.out.println(format.sprintf("") + " " + config.getConfigParentDirectory() + "\n");
                	}
                	System.out.println("");
                }
                else if (currConfig == null){
                	System.err.println("\n" + currLine + " is not a recoginized config name.\n\n");
                }
                else{
//                	try {
//                		// Create a new manager into which the parsed schemas will be loaded
//                		readSchemas = new SchemaManager();
//                		
//                		// Parse the specified schema
//						SchemaDefinition sd = parser.parseSchema(readSchemas, currLine, false);
//						
//						// Generate the code
//						codeGenerator.generateCode(sd, currLoc);
//						
//					} catch (ResultException e) {
//						System.out.println(e.toString());
//					} catch (DmcValueException e) {
//						System.out.println(e.toString());
//						e.printStackTrace();
//					}
                }
            }
            catch (IOException e){
                System.out.println("IOException:\n" + e.getMessage());
                System.exit(1);
            }

        }


	}
}
