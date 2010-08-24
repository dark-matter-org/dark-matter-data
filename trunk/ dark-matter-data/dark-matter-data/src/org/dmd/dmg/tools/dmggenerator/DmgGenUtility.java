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

/**
 * The DmoGenerator is a commandline utility that lets you generate Dark Matter Objects (DMOs)
 * from Dark Matter Schema (DMS) definitions.
 */
public class DmgGenUtility {

	// Our base schema manager
	SchemaManager	dmsSchema;
	
	// The schema manager that will hold definitions read by the schema parser
	SchemaManager	readSchemas;
	
	// Finds our available schemas
	DmsSchemaFinder	finder;
	
	// The thing that parses the available schemas
	DmsSchemaParser	parser;
	
	// The thing that will generate our DMO code
	DmoGenerator	codeGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	public DmgGenUtility() throws ResultException, IOException, DmcValueException {
		dmsSchema = new SchemaManager();
		
		readSchemas = null;
		
		finder = new DmsSchemaFinder();
//		finder.addSourceDirectory(getClass().getResource("/org/dmd/").getFile());
//		finder.addSourceDirectory("C:\\Dev\\svn-web1\\dark-matter-data\\src\\org\\dmd");
//		finder.addSourceDirectory("F:\\AASoftDev\\workspace\\dark-matter-data\\src\\org\\dmd");
		
		finder.findSchemas();
		
		parser = new DmsSchemaParser(dmsSchema, finder);
		
		codeGenerator = new DmoGenerator(System.out);
		
		String f = "%-" + finder.getLongestName() + "s";
		format = new PrintfFormat(f);
	}
	
	public void run(){
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;

        System.out.println("\ndmg generator - enter the name of the Dark Matter Generator config, ? for a list of configs...\n");
        while(true){
            try{
            	String s = in.readLine();
            	if (s == null)
            		return;
            	
                currLine = s.trim();

                if (currLine.length() == 0)
                    continue;
                
                DmsSchemaLocation currLoc = finder.getLocation(currLine);

                if (currLine.equals("?")){
                	System.out.println("");
                	Iterator<DmsSchemaLocation> it = finder.getLocations();
                	while(it.hasNext()){
                		DmsSchemaLocation loc = it.next();
                		System.out.println(format.sprintf(loc.getSchemaName()) + " " + loc.getDirectory());
                		System.out.println(format.sprintf("") + " " + loc.getSchemaParentDirectory() + "\n");
                	}
                	System.out.println("");
                }
                else if (currLoc == null){
                	System.err.println("\n" + currLine + " is not a recoginized schema name.\n\n");
                }
                else{
                	try {
                		// Create a new manager into which the parsed schemas will be loaded
                		readSchemas = new SchemaManager();
                		
                		// Parse the specified schema
						SchemaDefinition sd = parser.parseSchema(readSchemas, currLine, false);
						
						// Generate the code
						codeGenerator.generateLocalCode(sd, currLoc);
						
					} catch (ResultException e) {
						System.out.println(e.toString());
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
