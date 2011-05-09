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

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.features.extgwt.util.MvcDefinitionManager;
import org.dmd.features.extgwt.util.MvcGenerator;
import org.dmd.features.extgwt.util.MvcParser;
import org.dmd.features.extgwt.util.doc.MvcDoc;
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
	PrintfFormat			format;
	
	CommandLine		cl;
	StringBuffer  	help;
	BooleanVar		helpFlag	= new BooleanVar();
	StringArrayList	srcdir 		= new StringArrayList();
	StringBuffer	workspace	= new StringBuffer();
	BooleanVar		autogen 	= new BooleanVar();
	StringBuffer	cfg			= new StringBuffer();
	BooleanVar		debug 		= new BooleanVar();
	
	
	public MvcGenUtility(String[] args) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		initHelp();
		cl = new CommandLine();
        cl.addOption("-h",     		helpFlag,	"Dumps the help message.");
        cl.addOption("-srcdir",		srcdir,  	"The source directories to search.");
        cl.addOption("-workspace", 	workspace, 	"The workspace prefix");
        cl.addOption("-autogen", 	autogen, 	"Indicates that you want to generate from all configs automatically.");
//        cl.addOption("-cfg",   		cfg,     	"The configuration file to load.");
        cl.addOption("-debug",   	debug,     	"Dump debug information.");
		
		cl.parseArgs(args);
		
		if (helpFlag.booleanValue()){
			System.out.println(help.toString());
		}

		
		baseSchema = new SchemaManager();
		
		baseWithMVCSchema = new SchemaManager();
		
		// Schemas that are read on the basis of the schemaToLoad attribute
//		readSchemas = null;
		
		StringArrayList searchdirs = new StringArrayList();
		if (srcdir.size() > 0){
			searchdirs = new StringArrayList();
			for(String dir: srcdir){
				searchdirs.add(workspace.toString() + "/" + dir);
			}			
		}
		else{
			searchdirs = srcdir;
		}

		schemaFinder = new ConfigFinder(searchdirs.iterator());

		if (debug.booleanValue())
			schemaFinder.debug(true);
		
		schemaFinder.addSuffix(".dms");
//		schemaFinder.addJarEnding("DMSchema.jar");
		schemaFinder.findConfigs();
		
		schemaParser = new DmsSchemaParser(baseSchema, schemaFinder);
		schemaParser.parseSchema(baseWithMVCSchema, "extgwt", true);
		
		defManager = new MvcDefinitionManager(baseWithMVCSchema);
		
		configFinder = new ConfigFinder(searchdirs.iterator());
		
		if (debug.booleanValue())
			configFinder.debug(true);
		
		configFinder.addSuffix(".mvc");
		
		configFinder.findConfigs();
		
		parser = new MvcParser(baseWithMVCSchema, configFinder, defManager);
		
		codeGenerator = new MvcGenerator(System.out);
		
		String f = "%-" + configFinder.getLongestName() + "s";
		format = new PrintfFormat(f);
	}
	
	void initHelp(){
		String userHome = System.getProperty("user.home");

		help = new StringBuffer();
		help.append("mvcgen -h -cfg -workspace -srcdir -autogen\n\n");
		help.append("The mvcgen tool generates ExtGWT compatible MVC code from .mvc configuration files.\n");
        help.append("MVC configurations are recursivley discovered in your development environment using\n");
        help.append("information you provide in one of several ways.\n");
        help.append("\n");
        help.append("The default behaviour is to look for a .darkmatter folder in " + userHome + "\n");
        help.append("and to read the sourcedirs.txt file that resides there. The sourcedirs.txt file\n");
        help.append("specifies file paths to search, one path per line. The path must be fully qualified\n");
        help.append("i.e. C:/mydev/myproject/src\n");
        help.append("\n");
//        help.append("The tool can also search .jar files that contain schemas defined by others. \n");
//        help.append("Just specify a line with the jar file name (or the last part thereof). As long\n");
//        help.append("the line ends with .jar, all jars that end with that suffix will be searched for\n");
//        help.append("schema configurations.\n");
//        help.append("\n");
        help.append("You can also specify code locations on the command line via the -srcdir option.\n");
        help.append("\n");
        help.append("If you specify the -workspace option, this prefix will be placed in front of all \n");
        help.append("arguments to the -srcdir option.\n");
        help.append("\n");
//        help.append("Or you can specify a configuration file (formatted like sourcedirs.txt) to load.\n");
//        help.append("via the -cfg option.\n");
//        help.append("\n");
        help.append("-h dumps the help information.\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("example: mvcgen -workspace C:/eclipse/workspace -srcdir proj1/src proj2/src proj3/src\n");
        help.append("\n");
	}
	

	
	public void run(){
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;
        Classifier		classifier 	= new Classifier();
        TokenArrayList	tokens 		= null;
        MvcDoc			mvcdoc		= new MvcDoc();
        
        
        if (autogen.booleanValue()){
        	
            if (autogen.booleanValue()){
            	
            	for(ConfigVersion version: configFinder.getVersions().values()){
            		ConfigLocation loc = version.getLatestVersion();
            		
//            		DebugInfo.debug(loc.toString());
            		
            		if (!loc.isFromJAR()){
            			// Wasn't in a jar, so try to generate
//            			DebugInfo.debug("Generating: " + loc.getConfigName());
            			generateFromConfig(version);
            		}
            	}
            	
            	System.exit(0);
            }
        	
        	System.exit(0);
        }
        
        
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
	                		FileUpdateManager.instance().reportProgress(System.out);
	                		FileUpdateManager.instance().reportErrors(System.err);
							FileUpdateManager.instance().generationStarting();
	                		
	                		codeGenerator.generateCode(null, currConfig.getLatestVersion(), configFinder, baseWithMVCSchema);
	                		
							FileUpdateManager.instance().generationComplete();
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
	
	void generateFromConfig(ConfigVersion currConfig){
    	try {
			parser.parseConfig(currConfig.getLatestVersion());
			
			codeGenerator.setDefinitionManager(defManager);
			
    		FileUpdateManager.instance().reportProgress(System.out);
    		FileUpdateManager.instance().reportErrors(System.err);
			FileUpdateManager.instance().generationStarting();
    		
    		codeGenerator.generateCode(null, currConfig.getLatestVersion(), configFinder, baseWithMVCSchema);
    		
			FileUpdateManager.instance().generationComplete();
			
		} catch (ResultException e) {
			System.err.println("\n" + e.toString());
		} catch (DmcValueException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
