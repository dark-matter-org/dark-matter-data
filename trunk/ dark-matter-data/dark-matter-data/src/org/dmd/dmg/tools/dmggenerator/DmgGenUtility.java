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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.types.Generator;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoGenerator;
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
	
	String			fileHeader;
	
	public DmgGenUtility() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		baseSchema = new SchemaManager();
		
		baseWithDMGSchema = new SchemaManager();
		
		// Schemas that are read on the basis of the schemaToLoad attribute
		readSchemas = null;
		
		schemaFinder = new ConfigFinder();
		schemaFinder.addSuffix(".dms");
		schemaFinder.addJarEnding("DMSchema.jar");
		schemaFinder.findConfigs();
		
		schemaParser = new DmsSchemaParser(baseSchema, schemaFinder);
		schemaParser.parseSchema(baseWithDMGSchema, "dmg", true);
		
		configFinder = new ConfigFinder();
		configFinder.addSuffix(".dmg");
		
		configFinder.findConfigs();
		
		parser = new DmgParser(baseWithDMGSchema, configFinder);
		
		codeGenerator = new DmoGenerator(System.out);
		
		String f = "%-" + configFinder.getLongestName() + "s";
		format = new PrintfFormat(f);
		
		fileHeader = "";
	}
	
	public void run() throws DmcValueExceptionSet {
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
                	
                	System.out.println(configFinder.getSearchInfo() + "\n");

                	Iterator<ConfigVersion> it = configFinder.getVersions().values().iterator();
                	while(it.hasNext()){
                		ConfigVersion version = it.next();
                		ConfigLocation loc = version.getLatestVersion();
                		
                		if (loc.getJarFilename() == null){
                    		System.out.println(format.sprintf(loc.getConfigName()) + "   version: " + loc.getVersion());
	                		System.out.println(format.sprintf("") + " " + loc.getConfigParentDirectory() + "\n");
                		}
                		else{
	                		System.out.println(format.sprintf("JAR " + loc.getConfigName()) + " " + loc.getDirectory());
	                		System.out.println(format.sprintf("") + " " + loc.getConfigParentDirectory() + "\n");
                		}
                	}
                	System.out.println("");
                }
                else if (currConfig == null){
                	System.err.println("\n" + currLine + " is not a recoginized config name.\n\n");
                }
                else{
                	try {
						parser.parseConfig(currConfig.getLatestVersion());
						
						loadRequiredSchemas();
						
						Iterator<Generator> generators = parser.getTheConfig().getGenerator();
						
						// Get the generated file header if there is one
						readFileHeader(parser.getTheConfig(), currConfig.getLatestVersion());
						
						if (generators != null){
							while(generators.hasNext()){
								Generator g = generators.next();
								
								g.getGenerator().setProgressStream(System.out);
								
								g.getGenerator().setFileHeader(fileHeader);
								
								g.getGenerator().generateCode(parser.getTheConfig(), currConfig.getLatestVersion(), configFinder, readSchemas);
							}
						}
					} catch (ResultException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DmcValueException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	
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
	
	void loadRequiredSchemas() throws ResultException, DmcValueException, DmcValueExceptionSet {
		Iterator<String> schemas = parser.getTheConfig().getSchemaToLoad();
		if (schemas != null){
			readSchemas = new SchemaManager();
			
			while(schemas.hasNext()){
				String currSchema = schemas.next();
				
				schemaParser.parseSchema(readSchemas, currSchema, true);
			}
		}
	}
	
	/**
	 * If the schema has a generatedFileHeader specified, we try to read the file.
	 * @param sd The schema definition.
	 * @param sl The schema location.
	 * @throws IOException
	 */
	void readFileHeader(DmgConfigDMO config, ConfigLocation sl) throws IOException {
		fileHeader = "";
		
		if (config.getGeneratedFileHeader() != null){
            // Read the license header
            StringBuffer sb = new StringBuffer();
            
            if (sl.getJarFilename() != null){
            	URL url = new URL("jar:file:" + sl.getJarFilename() + "!/" + sl.getJarDirectory() + "/" + config.getGeneratedFileHeader());
        		LineNumberReader in = new LineNumberReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str = in.readLine()) != null) {
                	sb.append(str + "\n");
                }
                in.close();
            }
            else{
	            LineNumberReader in = new LineNumberReader(new FileReader(sl.getDirectory() + File.separator + config.getGeneratedFileHeader()));
	            String str;
	            while ((str = in.readLine()) != null) {
	            	sb.append(str + "\n");
	            }
	            in.close();
            }
            
            fileHeader = sb.toString();
		}
	}
	

}
