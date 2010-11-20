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
package org.dmd.features.extgwt.tools.mvcgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.features.extgwt.util.MvcDefinitionManager;
import org.dmd.features.extgwt.util.MvcGenerator;
import org.dmd.features.extgwt.util.MvcParser;
import org.dmd.features.extgwt.util.doc.MvcDoc;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Classifier;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.TokenArrayList;

/**
 * The MvcGenUtility is a commandline utility that lets you generate classes that make
 * use of the ExtGWT Model View COntroller framework.
 */
public class MvcGenUtility {

	// Our base schema manager
	SchemaManager	baseSchema;
	
	SchemaManager	baseWithMVCSchema;
	
	// The schema manager that will hold definitions read by the schema parser
//	SchemaManager	readSchemas;
	
	// Finds our dmg config files
	ConfigFinder			schemaFinder;
	
	ConfigFinder			configFinder;
	
	DmsSchemaParser			schemaParser;
	
	MvcDefinitionManager	defManager;
	
	// The thing that parses MVC configs
	MvcParser				parser;
	
	// The thing that will generate our DMO code
	MvcGenerator			codeGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	public MvcGenUtility() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		baseSchema = new SchemaManager();
		
		baseWithMVCSchema = new SchemaManager();
		
		// Schemas that are read on the basis of the schemaToLoad attribute
//		readSchemas = null;
		
		schemaFinder = new ConfigFinder();
		schemaFinder.addSuffix(".dms");
		schemaFinder.addJarEnding("DMSchema.jar");
		schemaFinder.findConfigs();
		
		schemaParser = new DmsSchemaParser(baseSchema, schemaFinder);
		schemaParser.parseSchema(baseWithMVCSchema, "extgwt", true);
		
		defManager = new MvcDefinitionManager(baseWithMVCSchema);
		
		configFinder = new ConfigFinder();
		configFinder.addSuffix(".mvc");
		
		configFinder.findConfigs();
		
		parser = new MvcParser(baseWithMVCSchema, configFinder, defManager);
		
		codeGenerator = new MvcGenerator(System.out);
		
		String f = "%-" + configFinder.getLongestName() + "s";
		format = new PrintfFormat(f);
	}
	
	public void run(){
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;
        Classifier		classifier 	= new Classifier();
        TokenArrayList	tokens 		= null;
        MvcDoc			mvcdoc		= new MvcDoc();
        
        System.out.println("\nmvc generator - enter the name of a Model View Controller config\n");
        System.out.println("Enter ? for a list of configs...\n\n");
        
        while(true){
            try{
            	String s = in.readLine();
            	if (s == null)
            		return;
            	
                currLine = s.trim();

                if (currLine.length() == 0)
                    continue;
                
                tokens = classifier.classify(currLine, false);
                
                if (tokens.size() == 0)
                	continue;
                
                ConfigVersion currConfig = configFinder.getConfig(tokens.nth(0).getValue());

                if (tokens.nth(0).getValue().equals("?")){
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
						
						codeGenerator.setDefinitionManager(defManager);
						
	                	if (tokens.size() == 2){
	                		// Might be a doc request
	                		if (tokens.nth(1).getValue().equals("doc")){
	                			if (defManager.getTheApplication() == null){
	                				System.err.println("\n" + "The doc option is only valid for application definitions.\n\n");
	                			}
	                			else{
	                				mvcdoc.dumpAppDoc(currConfig.getLatestVersion(), defManager);
	                			}
	                		}
	                		else{
	                        	System.err.println("\n" + currLine + " is not a recoginized command option.\n\n");
	                		}
	                	}
	                	else{
	                		codeGenerator.generateCode(null, currConfig.getLatestVersion(), configFinder, baseWithMVCSchema);
	                	}
						
					} catch (ResultException e) {
						System.err.println("\n" + e.toString());
					} catch (DmcValueException e) {
						e.printStackTrace();
					}
                }
            }
            catch (IOException e){
                System.out.println("IOException:\n" + e.getMessage());
                System.exit(1);
            }

        }


	}
	
}
