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
package org.dmd.dms.tools.dmogenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoGenerator;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Classifier;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.TokenArrayList;

/**
 * The DmgGenUtility is a commandline utility that lets you trigger code generation
 * for a variety of purposes.
 */
public class DmoGenUtility {

	// Our base schema manager
	SchemaManager	dmsSchema;
	
	// The schema manager that will hold definitions read by the schema parser
	SchemaManager	readSchemas;
	
	// Finds our available schemas
//	DmsSchemaFinder	finder;
	ConfigFinder	finder;
	
	// The thing that parses the available schemas
	DmsSchemaParser	parser;
	
	// The thing that will generate our DMO code
	DmoGenerator	codeGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	Classifier		classifier;
	
	public DmoGenUtility() throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		dmsSchema = new SchemaManager();
		
		readSchemas = null;
		
//		finder = new DmsSchemaFinder();
//		finder.findSchemas();
		
		finder = new ConfigFinder();
		finder.addSuffix(".dms");
		finder.addJarEnding("DMSchema.jar");
		finder.findConfigs();
		
		parser = new DmsSchemaParser(dmsSchema, finder);
		
		codeGenerator = new DmoGenerator(System.out);
		int longest = finder.getLongestName() + 4;
		
		String f = "%-" + longest + "s";
		format = new PrintfFormat(f);
		
		classifier = new Classifier();
	}
	
	public void run() throws DmcValueExceptionSet {
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;
        TokenArrayList	tokens		= null;
//        boolean			shared		= false;

        System.out.println("\n-- dmo generator utility --\n");
        System.out.println("Enter the name of a local (non-JAR) schema to generate its code\n");
        System.out.println("Enter ? for a list of schemas...\n\n");
        while(true){
            try{
            	String s = in.readLine();
            	if (s == null)
            		return;
            	
                currLine = s.trim();

            	if (currLine.length() == 0)
                    continue;
                
            	tokens = classifier.classify(currLine, false);

//                DmsSchemaLocation currLoc = finder.getLocation(tokens.nth(0).getValue());
//                DmsSchemaLocation currLoc = finder.getLocation(tokens.nth(0).getValue());
            	ConfigVersion		config		= finder.getConfig(tokens.nth(0).getValue());
            	ConfigLocation		currLoc	= null;
            	
            	if (config != null)
            		currLoc = config.getLatestVersion();

                if (currLine.equals("?")){
                	
                	System.out.println("");
                	
                	System.out.println(finder.getSearchInfo() + "\n");
                	
                	Iterator<ConfigVersion> it = finder.getVersions().values().iterator();
                	while(it.hasNext()){
                		ConfigVersion version = it.next();
                		ConfigLocation loc = version.getLatestVersion();
                		
                		if (loc.getJarFilename() == null){
                    		System.out.println(format.sprintf(loc.getConfigName()) + "   version: " + loc.getVersion());
//	                		System.out.println(format.sprintf(loc.getConfigName()) + " " + loc.getDirectory());
	                		System.out.println(format.sprintf("") + " " + loc.getConfigParentDirectory() + "\n");
                		}
                		else{
	                		System.out.println(format.sprintf("JAR " + loc.getConfigName()) + " " + loc.getDirectory());
	                		System.out.println(format.sprintf("") + " " + loc.getConfigParentDirectory() + "\n");
                		}
                	}
                	System.out.println("");
                }
                else if (currLoc == null){
                	System.err.println("\n" + currLine + " is not a recoginized schema name.\n\n");
                }
                else{
                	if (currLoc.isFromJAR()){
                		System.out.println("You can only generate code from schemas in your local environment.\n\n");
                		continue;
                	}
//                	if (tokens.size() != 2){
//                		System.out.println("You must specify is the code is to be local or shared...\n\n");
//                		continue;
//                	}
//                	if (tokens.nth(1).getValue().equals("shared")){
//                		shared = true;
//                	}
//                	else if (tokens.nth(1).getValue().equals("local")){
//                		shared = false;
//                	}
//                	else{
//                		System.out.println("You must specify <schema local> or <schema shared>\n\n");
//                		continue;
//                	}
                	
                	try {
                		// Create a new manager into which the parsed schemas will be loaded
                		readSchemas = new SchemaManager();
                		
                		// Parse the specified schema
						SchemaDefinition sd = parser.parseSchema(readSchemas, tokens.nth(0).getValue(), false);
						
						// Generate the code
//						if (shared)
							codeGenerator.generateCode(readSchemas, sd, currLoc);
//						else
//							codeGenerator.generateLocalCode(sd, currLoc);
						
					} catch (ResultException e) {
						System.err.println(e.toString());
					} catch (DmcValueException e) {
						System.out.println(e.toString());
						e.printStackTrace();
					}
                }
            }
            catch (IOException e){
                System.out.println("IOException:\n" + e.getMessage());
                System.exit(1);
            }

            // Reset everything
//            reset(rs);
        }


	}
}
