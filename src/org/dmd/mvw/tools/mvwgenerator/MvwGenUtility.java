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
package org.dmd.mvw.tools.mvwgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmg.generated.DmgSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.mvw.tools.mvwgenerator.doc.web.MvwHtmlDocGenerator;
import org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;
import org.dmd.mvw.tools.mvwgenerator.util.MvwGenerator;
import org.dmd.mvw.tools.mvwgenerator.util.MvwParser;
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
 * The MvwGenUtility is a commandline utility that lets you generate interfaces and base
 * implementations classes from Model View Whatever configurations.
 */
public class MvwGenUtility {

	// Our base schema manager
	SchemaManager			baseSchema;
	
	SchemaManager			baseWithMVWSchema;
	
	// The schema manager that will hold definitions read by the schema parser
//	SchemaManager	readSchemas;
	
	// Finds our dmg config files
	ConfigFinder			schemaFinder;
	
	ConfigFinder			configFinder;
	
	DmsSchemaParser			schemaParser;
	
	// Manager for definitions loaded from a single .mvw and the modules on which it depends
	MvwDefinitionManager	defManager;
	
	// An aggregate of all definitions used for documentation generation
	MvwDefinitionManager	aggregateManager;
	
	// The thing that parses MVC configs
	MvwParser				parser;
	
	// The thing that will generate our DMO code
	MvwGenerator			codeGenerator;
	
	MvwHtmlDocGenerator		docGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat			format;
	
	CommandLine				cl;
	StringBuffer  			help;
	BooleanVar				helpFlag	= new BooleanVar();
	StringArrayList			srcdir 		= new StringArrayList();
	StringBuffer			workspace	= new StringBuffer();
	BooleanVar				autogen 	= new BooleanVar();
	StringBuffer			cfg			= new StringBuffer();
	BooleanVar				debug 		= new BooleanVar();
	StringBuffer			docdir		= new StringBuffer();
	
	
	public MvwGenUtility(String[] args) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		initHelp();
		cl = new CommandLine();
        cl.addOption("-h",     		helpFlag,	"Dumps the help message.");
        cl.addOption("-srcdir",		srcdir,  	"The source directories to search.");
        cl.addOption("-workspace", 	workspace, 	"The workspace prefix");
        cl.addOption("-autogen", 	autogen, 	"Indicates that you want to generate from all configs automatically.");
        cl.addOption("-debug",   	debug,     	"Dump debug information.");
        cl.addOption("-docdir",   	docdir,     "The documentation directory.");
		
		cl.parseArgs(args);
		
		if (helpFlag.booleanValue()){
			System.out.println(help.toString());
		}

		
		baseSchema = new SchemaManager();
		
		baseWithMVWSchema = new SchemaManager();
		
		DmgSchemaAG	dmg = new DmgSchemaAG();
		baseWithMVWSchema.manageSchema(dmg);
		MvwSchemaAG mvw = new MvwSchemaAG();
		baseWithMVWSchema.manageSchema(mvw);
		
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
//		schemaParser.parseSchema(baseWithMVWSchema, "mvw", true);
		
		
		defManager = new MvwDefinitionManager(baseWithMVWSchema, schemaParser);
		
		aggregateManager = new MvwDefinitionManager(baseWithMVWSchema, schemaParser);
		
		configFinder = new ConfigFinder(searchdirs.iterator());
		
		docGenerator = new MvwHtmlDocGenerator(aggregateManager);
		
		if (debug.booleanValue())
			configFinder.debug(true);
		
		configFinder.addSuffix(".mvw");
		
		configFinder.findConfigs();
		
		parser = new MvwParser(baseWithMVWSchema, configFinder, defManager);
		
		codeGenerator = new MvwGenerator(defManager,System.out);
		
		String f = "%-" + configFinder.getLongestName() + "s";
		format = new PrintfFormat(f);
	}
	
	void initHelp(){
		help = new StringBuffer();
		help.append("mvwgen -h -cfg -workspace -srcdir -docdir <directory> -autogen\n\n");
		help.append("The mvwgen tool generates GWT MVP compatible interfaces and base implementation classes from\n");
        help.append("definitions found in .mvw configuration files. MVW configurations are recursivley discovered\n");
        help.append("in your development environment using commandline arguments:\n");
        help.append("\n");
        help.append("-workspace <path> indicates your Eclipse work space path.\n");
        help.append("\n");
        help.append("-srcdir <project/src> <project/src>... indicates the project source folder(s) to search\n");
        help.append("\n");
        help.append("-autogen indicates that you wish to generate code from all discovered .mvw files\n");
        help.append("\n");
        help.append("-docdir indicates that you wish to generate documentation from all discovered .mvw files\n");
        help.append("        This must be used in conjunction with -autogen.\n");
        help.append("        You should use the same doc directory as that used for the schema documentation.\n");
        help.append("\n");
        help.append("-h dumps the help information.\n");
        help.append("\n");
        help.append("example: mvwgen -workspace C:/eclipse/workspace -srcdir proj1/src proj2/src proj3/src\n");
        help.append("\n");
	}
	

	
	public void run(){
        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        String          currLine    = null;
        Classifier		classifier 	= new Classifier();
        TokenArrayList	tokens 		= null;
//        MvcDoc			mvcdoc		= new MvcDoc();
        
        
        if (autogen.booleanValue()){
        	
        	for(ConfigVersion version: configFinder.getVersions().values()){
        		ConfigLocation loc = version.getLatestVersion();
        		
//            		DebugInfo.debug(loc.toString());
        		
        		if (!loc.isFromJAR()){
        			// Wasn't in a jar, so try to generate
//            			DebugInfo.debug("Config is not from JAR - generating: " + loc.getConfigName());
        			generateFromConfig(version);
        		}
        		
        		aggregateManager.mergeDefinitions(defManager);
        	}
        	
        	System.out.println("DONE");
        	
			try {
				if (docdir.length() > 0){
					if (workspace.length() > 0)
							docGenerator.dumpDocumentation(workspace.toString() + "/" + docdir.toString());
					else
						docGenerator.dumpDocumentation(docdir.toString());
				}
			} catch (IOException e) {
				System.err.println(e.toString());
				e.printStackTrace();
				System.exit(1);
			}

        	System.exit(0);
        }
        
        
        System.out.println("\nmvw generator - enter the name of a Model View Whatever config\n");
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
						
//						codeGenerator.setDefinitionManager(defManager);
						
	                	if (tokens.size() == 2){
	                		// Might be a doc request
	                		if (tokens.nth(1).getValue().equals("doc")){
//	                			if (defManager.getTheApplication() == null){
//	                				System.err.println("\n" + "The doc option is only valid for application definitions.\n\n");
//	                			}
//	                			else{
//	                				mvcdoc.dumpAppDoc(currConfig.getLatestVersion(), defManager);
//	                			}
	                		}
	                		else{
	                        	System.err.println("\n" + currLine + " is not a recoginized command option.\n\n");
	                		}
	                	}
	                	else{
	                		FileUpdateManager.instance().reportProgress(System.out);
	                		FileUpdateManager.instance().reportErrors(System.err);
							FileUpdateManager.instance().generationStarting();
	                		
	                		codeGenerator.generateCode(currConfig.getLatestVersion());
	                		
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
			
//			codeGenerator.setDefinitionManager(defManager);
			
    		FileUpdateManager.instance().reportProgress(System.out);
    		FileUpdateManager.instance().reportErrors(System.err);
			FileUpdateManager.instance().generationStarting();
    		
    		codeGenerator.generateCode(currConfig.getLatestVersion());
    		
			FileUpdateManager.instance().generationComplete();
			
		} catch (ResultException e) {
			System.err.println("\n" + e.toString());
			System.exit(1);
		} catch (DmcValueException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
}
