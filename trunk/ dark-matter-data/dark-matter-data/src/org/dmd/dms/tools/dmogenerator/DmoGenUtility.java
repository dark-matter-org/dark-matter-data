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
import org.dmd.dms.doc.web.DmsHtmlDocGenerator;
import org.dmd.dms.util.DmoGenerator;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.util.BooleanVar;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Classifier;
import org.dmd.util.parsing.CommandLine;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.StringArrayList;
import org.dmd.util.parsing.TokenArrayList;

/**
 * The DmgGenUtility is a commandline utility that lets you trigger code generation
 * for a variety of purposes.
 */
public class DmoGenUtility {

	// Our base schema manager
	SchemaManager		dmsSchema;
	
	// The schema manager that will hold definitions read by the schema parser
	SchemaManager		readSchemas;
	
	// Finds our available schemas
//	DmsSchemaFinder	finder;
	ConfigFinder		finder;
	
	// The thing that parses the available schemas
	DmsSchemaParser		parser;
	
	// The thing that will generate our DMO code
	DmoGenerator		codeGenerator;
	
	DmsHtmlDocGenerator	docGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	Classifier		classifier;
	
	CommandLine		cl;
	StringBuffer  	help;
	BooleanVar		helpFlag	= new BooleanVar();
	StringArrayList	srcdir 		= new StringArrayList();
	StringBuffer	workspace	= new StringBuffer();
	BooleanVar		autogen 	= new BooleanVar();
	StringBuffer	cfg			= new StringBuffer();
	BooleanVar		debug 		= new BooleanVar();
	StringBuffer	docdir		= new StringBuffer();
	
	public DmoGenUtility(String[] args) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		initHelp();
		cl = new CommandLine();
        cl.addOption("-h",     		helpFlag,	"Dumps the help message.");
        cl.addOption("-srcdir",		srcdir,  	"The source directories to search.");
        cl.addOption("-workspace", 	workspace, 	"The workspace prefix");
        cl.addOption("-autogen", 	autogen, 	"Indicates that you want to generate from all configs automatically.");
        cl.addOption("-cfg",   		cfg,     	"The configuration file to load.");
        cl.addOption("-docdir",   	docdir,     "The documentation directory.");
        cl.addOption("-debug",   	debug,     	"Dump debug information.");
		
		cl.parseArgs(args);
		
		dmsSchema = new SchemaManager();
		
		if (helpFlag.booleanValue()){
			System.out.println(help.toString());
		}
		
		readSchemas = null;
		
		if (srcdir.size() > 0){
			StringArrayList search = srcdir;
			if (workspace.length() > 0){
				StringArrayList augmented = new StringArrayList();
				for(String dir: srcdir){
					augmented.add(workspace.toString() + "/" + dir);
				}
				search = augmented;
			}
			finder = new ConfigFinder(search.iterator());
		}
		else
			finder = new ConfigFinder();
		
		if (debug.booleanValue())
			finder.debug(true);
		
		finder.addSuffix(".dms");
//		finder.addJarEnding("DMSchema.jar");
		finder.findConfigs();
		
		parser = new DmsSchemaParser(dmsSchema, finder);
		
		codeGenerator = new DmoGenerator(System.out);
		int longest = finder.getLongestName() + 4;
		
		docGenerator = new DmsHtmlDocGenerator();
		
		String f = "%-" + longest + "s";
		format = new PrintfFormat(f);
		
		classifier = new Classifier();
	}
	
	void initHelp(){
		String userHome = System.getProperty("user.home");

		help = new StringBuffer();
		help.append("dmogen -h -cfg -workspace -srcdir\n\n");
		help.append("The dmogen tool generates Dark Matter Objects based on a specified schema.\n");
        help.append("Schemas configurations (that end with a .dms extension) are recursivley discovered\n");
        help.append("in your development environment using information you provide in one of several ways.\n");
        help.append("\n");
        help.append("The default behaviour is to look for a .darkmatter folder in " + userHome + "\n");
        help.append("and to read the sourcedirs.txt file that resides there. The sourcedirs.txt file\n");
        help.append("specifies file paths to search, one path per line. The path must be fully qualified\n");
        help.append("i.e. C:/mydev/myproject/src\n");
        help.append("\n");
        help.append("The tool can also search .jar files that contain schemas defined by others. \n");
        help.append("Just specify a line with the jar file name (or the last part thereof). As long\n");
        help.append("the line ends with .jar, all jars that end with tha suffix will be searched for\n");
        help.append("schema configurations.\n");
        help.append("\n");
        help.append("You can also specify code locations on the command line via the -srcdir option.\n");
        help.append("\n");
        help.append("If you specify the -workspace option, this prefix will be placed in front of all \n");
        help.append("arguments to the -srcdir option.\n");
        help.append("\n");
        help.append("Or you can specify a configuration file (formatted like sourcedirs.txt) to load.\n");
        help.append("via the -cfg option.\n");
        help.append("\n");
        help.append("-h dumps the help information.\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("example: dmogen -workspace C:/eclipse/workspace -srcdir proj1/src proj2/src proj3/src\n");
        help.append("\n");
        help.append("\n");
	}
	
	public void run() throws DmcValueExceptionSet {
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;
        TokenArrayList	tokens		= null;
//        boolean			shared		= false;
        
        if (autogen.booleanValue()){
        	
        	for(ConfigVersion version: finder.getVersions().values()){
        		ConfigLocation loc = version.getLatestVersion();
        		if (!loc.isFromJAR()){
        			// Wasn't in a jar, so try to generate
        			generateFromConfig(loc);
        		}
        	}
        	
        	System.exit(0);
        }

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
                	
                	try {
                		// Create a new manager into which the parsed schemas will be loaded
                		readSchemas = new SchemaManager();
                		
                		// Parse the specified schema
						SchemaDefinition sd = parser.parseSchema(readSchemas, tokens.nth(0).getValue(), false);
						
						// Generate the code
						
						FileUpdateManager.instance().reportProgress(System.out);
						FileUpdateManager.instance().reportErrors(System.err);
						FileUpdateManager.instance().generationStarting();
						
						codeGenerator.generateCode(readSchemas, sd, currLoc);
						
						FileUpdateManager.instance().generationComplete();
						
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
	
	void generateFromConfig(ConfigLocation location){
    	try {
    		// Create a new manager into which the parsed schemas will be loaded
    		readSchemas = new SchemaManager();
    		
    		// Parse the specified schema
			SchemaDefinition sd = parser.parseSchema(readSchemas, location.getConfigName(), false);
			
			if (docdir.length() > 0){
				if (workspace.length() > 0)
					docGenerator.dumpSchemaDoc(workspace.toString() + "/" + docdir.toString(), readSchemas);
				else
					docGenerator.dumpSchemaDoc(docdir.toString(), readSchemas);
			}
			else{
				// Generate the code
				
				FileUpdateManager.instance().reportProgress(System.out);
				FileUpdateManager.instance().reportErrors(System.err);
				FileUpdateManager.instance().generationStarting();
				
				codeGenerator.generateCode(readSchemas, sd, location);
				
				FileUpdateManager.instance().generationComplete();
			}
						
		} catch (ResultException e) {
			System.err.println(e.toString());
			System.exit(1);
		} catch (DmcValueException e) {
			System.out.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.err.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}

	}
}
