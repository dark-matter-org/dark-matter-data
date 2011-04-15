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
package org.dmd.dms.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;


/**
 * This class parses files that conform to the Information Model Definition
 * (IMD) schema and stores them in an SchemaManager.
 */

public class DmsSchemaParser implements DmcUncheckedOIFHandlerIF {

    // Schema manager that recognizes the DMS schema.
    SchemaManager    		dmsSchema;

    // Schema manager that recognizes the DMS schema and the loaded schemas.
    SchemaManager    		allSchema;

    // The schema that's currently being loaded.
    SchemaDefinition        schemaLoading;

    // Stack of schemas being loaded.
    Stack<SchemaDefinition>	schemaStack;

    // The file that's currently being parsed.
    String              	currFile;

    // The files that have been loaded already.
    // Key: filename
    HashMap<String,SchemaDefinition>	loadedFiles;

    // The schemas that have been loaded already.
//    HashSet             loadedSchemas;

    // The directory where the schemas reside.
    String              		schemaDir;

    // The parser that will read basic objects from our information model
    // definition files that contain schemas.
    DmcUncheckedOIFParser     	schemaParser;

    // The parser that will read basic objects from our information model
    // definition files that contain the other types of definitions.
    DmcUncheckedOIFParser       defParser;
    
    // The thing that find schemas for us
//    DmsSchemaFinder				finder;
    ConfigFinder				finder;

    // The rule manager that has been configured with the rule for the Information
    // Model Definition schema. See com.dmc.tools.imdutil for details.
//    BrfRuleManager      rules;

    // Indicates if detailed trace output is required.
    boolean             		terseV;
    
    // Our object factory that instantiates wrappers and populates their attributes
    DmwObjectFactory			dmwfactory;

//    /**
//     * Creates a new Object Instance Format parser. As new BasicObjects are created,
//     * they will be passed to the object handler for processing.
//     * @throws ResultException 
//     */
//    public DmsSchemaParser(ResultSet rs, SchemaManager sm, BrfRuleManager brm) {
    
    /**
     * Creates a new schema parser. 
     * @param sm A base level schema manager i.e. a newly created SchemaManager.
     * @param f  A schema finder that has already been called up to find schemas.
     * @throws ResultException
     */
//    public DmsSchemaParser(SchemaManager sm, DmsSchemaFinder f) throws ResultException {
    public DmsSchemaParser(SchemaManager sm, ConfigFinder f) throws ResultException {
        dmsSchema       = sm;
        finder			= f;
//        rules           = brm;
        
        initialize();
    }

    /**
     * Parses the specified DMS file and any other schemas on which it depends.
     * <P>
     * This function calls on itself recursively to parse the specified
     * schema file and the schemas on which it depends.
     * @param am A base level manager that will be populated with the schemas we parse. This should
     * be a newly constructed schema manager.
     * @param schemaName The name of the schema. Schema specifications are found in
     * files with a .dms extension that have been found by the DmsSchemaFinder.
     * @param terse If true, only the name of the schema being parsed is displayed
     * on System.out otherwise, the name of each file being read is printed.
     * @throws ResultException 
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     * @return The requested schema is returned if all goes well, otherwise
     * null is returned.
     * NOTE: If WARNINGs are encountered, we still the schema - just check for the
     * presence of WARNINGs on the result set when parsing is complete.
     */
    public SchemaDefinition parseSchema(SchemaManager am, String schemaName, boolean terse) throws ResultException, DmcValueException {
        SchemaDefinition rc;
        
        allSchema = am;
        initialize();

        terseV = terse;
        rc = parseSchemaInternal(schemaName);

        return(rc);
    }
    
    void initialize(){
        schemaLoading   = null;
        currFile        = null;
        loadedFiles     = new HashMap<String,SchemaDefinition>();
        schemaParser    = new DmcUncheckedOIFParser(this);
        defParser       = new DmcUncheckedOIFParser(this);
        schemaStack     = new Stack<SchemaDefinition>();
        
        // The factory is built to recognize all objects because the
        // schema definitions might use auxiliary classes defined in other schemas
        dmwfactory		= new DmwObjectFactory(allSchema);
    	
    }

    /**
     * Parses the specified DMS file and any other schemas on which it
     * depends.
     * <P>
     * This function calls on itself recursively to parse the specified
     * schema file and the schemas on which it depends.
     * @param schemaName The name of the schema. Schema specifications are found in
     * files with a .dms extension that have been found by the DmsSchemaFinder.
     * @throws ResultException 
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     * @returns The requested schema is returned if all goes well, otherwise
     * null is returned.
     * NOTE: If WARNINGs are encountered, we still the schema - just check for the
     * presence of WARNINGs on the result set when parsing is complete.
     */
    SchemaDefinition parseSchemaInternal(String schemaName) throws ResultException, DmcValueException {
//    	DmsSchemaLocation	location	= finder.getLocation(schemaName);
    	ConfigVersion		config		= finder.getConfig(schemaName);
    	ConfigLocation		location	= null;
        SchemaDefinition    currSchema = null;
        String          	currFile = null;
        SchemaDefinition    nativeSchema = null;
        
        if (config == null){
        	ResultException ex = new ResultException();
        	ex.addError("The specified schema couldn't be found: " + schemaName);
        	throw(ex);
        }
//        if (location == null){
//        	ResultException ex = new ResultException();
//        	ex.addError("The specified schema couldn't be found: " + schemaName);
//        	throw(ex);
//        }
        
        location = config.getLatestVersion();
        
        currFile = location.getFileName();

//        if (terseV)
//            System.out.println("Parsing schema: " + schemaName);
//        else
        if (!terseV)
            System.out.println("\nParsing schema: " + schemaName);
        
        // Hold the directory name globally so that we can use it later
        schemaDir = new String(location.getDirectory());
//DebugInfo.debug("schemaDir = " + schemaDir);

        // The PMF and BRF schemas are loaded before things get under way, so we
        // have to recognize these as "native" schemas - their file names won't
        // be in the loadedFiles list, but their schema defs are loaded. We don't
        // want to load them again.
        if ( (loadedFiles.containsKey(currFile) == false) &&
             ( (nativeSchema = allSchema.isSchema(schemaName)) == null)){
            // System.out.println("Opening " + currFile);
            // We didn't have the file, so add it to our loadedFiles set
            // and proceed with parsing.
            loadedFiles.put(currFile,null);

            if (!terseV)
                System.out.println("    Reading " + currFile);
            
        	schemaParser.parseFile(currFile, location.isFromJAR());
            currSchema = (SchemaDefinition)schemaStack.pop();
            
            loadedFiles.remove(currFile);
            loadedFiles.put(currFile,currSchema);
            
//            if (rc == true){
//            allSchema.addDefinition(rs,currSchema);
            allSchema.addDefinition(currSchema);
            
            // And now check to see if everything is resolved
            allSchema.resolveReferences(currSchema);
            
            Iterator<AttributeDefinition> adl = currSchema.getAttributeDefList();
            if (adl != null){
            	allSchema.resolveNameTypes(adl);
            }
            
//            }
//            else
//                currSchema = null;
        }
        else{
            if (nativeSchema == null){
                // If we already had the file - no problem.
                currSchema = (SchemaDefinition)loadedFiles.get(currFile);
            }
            else
                currSchema = nativeSchema;
        }
        
        currSchema.setVersion(location.getVersion());

        return(currSchema);
    }

    /**
     * We handle the various schema related objects.
     * @throws ResultException 
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
        ClassDefinition     cd                  = null;
        boolean             isSchema            = false;
        DmsDefinition    	newObj              = null;
        Iterator<String>    dependsOnSchemas    = null;
        Iterator<String>    defFiles            = null;
        SchemaDefinition    currSchema          = null;
        String              depSchema           = null;
        SchemaDefinition    newSchema           = null;
        String              currFile            = null;

        // Determine if we have a valid class
        if ((cd = dmsSchema.isClass((String)uco.classes.get(0))) == null){
        	ResultException ex = new ResultException();

            ex.result.addResult(Result.ERROR,"Unknown class: " + uco.classes.get(0));
            ex.result.lastResult().lineNumber(uco.lineNumber);
            ex.result.lastResult().fileName(infile);
            throw(ex);
        }
        else{
        	try {
        		if (uco.classes.get(0).equals(MetaSchema._SchemaDefinition.getName())){
        			// Okay, a bit of cheating to handle schema extensions - since the
        			// schema extensions are defined in schemas themselves, those schemas
        			// have to be loaded before we attempt to resolve the schema extension
        			// AUX class. So, we let the schema manager know that we're loading
        			// a new schema with just the unchecked object.
        			allSchema.schemaPreAdd(uco);
        			
//System.out.println(allSchema.toString());
        		}
//        		else{
//        			allSchema.definitionPreAdd(uco);
//        		}
        		
//System.out.println("SchemaParser:\n" + uco.toOIF(15) + "\n");
//        		if (uco.classes.get(0).equals("ActionDefinition")){
//        			DebugInfo.debug("Reading action...");
//        		}
        		
				newObj = (DmsDefinition)dmwfactory.createWrapper(uco);
				newObj.setFile(infile);
				newObj.setLineNumber(lineNumber);
				
//				DebugInfo.debug(newObj.toOIF(15));
				
				// We used to be able to resolve objects as we went, but, because
				// we now generate the TypeDefinitions for object references internally,
				// we run into issues with attributes (which are loaded first) referring 
				// to classes that aren't yet defined. So, we have to do our object resolution
				// in a second pass.
//				newObj.resolveReferences(allSchema);
				
				// TODO: Apply business rules to the object
				
			} catch (ResultException e) {
				e.result.lastResult().fileName(infile);
				e.result.lastResult().lineNumber(lineNumber);
				throw(e);
			} catch (DmcValueException e) {
				ResultException ex = new ResultException(e.getMessage());
				ex.result.lastResult().fileName(infile);
				ex.result.lastResult().lineNumber(lineNumber);
				throw(ex);
			} catch (ClassCastException e){
				ResultException ex = new ResultException();
				ex.addError("Invalid object in a schema definition: " + uco.classes.get(0));
				ex.result.lastResult().moreMessages(e.getMessage());
				ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
	            ex.result.lastResult().lineNumber(uco.lineNumber);
	            ex.result.lastResult().fileName(infile);
				throw(ex);
			} catch (ClassNotFoundException e) {
				ResultException ex = new ResultException();
				ex.addError(e.getMessage());
				ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
				throw(ex);
			}
        	
            if (cd.getObjectName().getNameString().compareTo("SchemaDefinition") == 0)
                isSchema = true;

            if (schemaLoading == null){
                // We're not loading a schema, so this had better be a new schema
                // object - if not, we complain and return false
                if (isSchema == true){
                    // This is a new schema, so indicate that we're loading one
                    schemaLoading = (SchemaDefinition)newObj;
                    
                    schemaStack.push(schemaLoading);
                    
                    if ((dependsOnSchemas = schemaLoading.getDependsOn()) != null){
                        // This schema depends on others, make a recursive call to load them

                        // Hold on to the current schema
                        currSchema = schemaLoading;

                        // Reset the global schema pointer for now
                        schemaLoading = null;

                        while(dependsOnSchemas.hasNext()){
                            depSchema = dependsOnSchemas.next();
//DebugInfo.debug("Reading dependsOn: " + depSchema);

                        	ConfigVersion	config		= finder.getConfig(depSchema);
                        	ConfigLocation	location	= null;
                            
                            if (config == null){
                            	ResultException ex = new ResultException();
                            	ex.addError("Couldn't find schema: " + depSchema + " on which schema: " + currSchema.getObjectName() + " depends.");
                            	throw(ex);
                            }

                            location = config.getLatestVersion();
                            
                            currFile = location.getFileName();
                            
                            if (loadedFiles.containsKey(currFile) == false){
                                // Only load the schema if we haven't already parsed it
                                if ( (newSchema = this.parseSchemaInternal(depSchema)) == null){
                                	ResultException ex = new ResultException();
                                	ex.result.addResult(Result.FATAL,"Failed to parse schema: " + depSchema);
                                    throw(ex);
                                }

                                currSchema.addDependsOnRef(newSchema);

                                // Now reset schemaLoading to be null once more to
                                // mask the schema that we just read
                                schemaLoading = null;
                            }
                            else{
                                // We've already loaded this file, but we still
                                // need to update the dependsOnRef
                            	// System.out.println("Adding ref to previously parsed schema: " + ((SchemaDefinition)loadedFiles.get(currFile)).getName());
                                currSchema.addDependsOnRef(loadedFiles.get(currFile));
                            }
                        }

                        // Switch back to the schema at this level of parsing
                        schemaLoading = currSchema;
//DebugInfo.debug("Switching back to : " + schemaLoading.getName());

						allSchema.schemaBeingLoaded(schemaLoading);
                    }

//                    // We let the SchemaManager know that we're loading a new schema.
//                    // This gives it the opportunity to notify its schema extensions
//                    // that this is happening.
//                    allSchema.schemaBeingLoaded(schemaLoading);

                    if ((defFiles = schemaLoading.getDefFiles()) != null){
                    	ConfigLocation location = finder.getConfig(schemaLoading.getName().getNameString()).getLatestVersion();
                    	
                        // And now load the files associated with this schema
                        while(defFiles.hasNext()){
                        	if (location.isFromJAR())
                        		currFile = "/" + location.getDirectory() + "/" + defFiles.next();
                        	else
                        		currFile = location.getDirectory() + File.separator + defFiles.next();
//                            currFile = schemaDir + File.separator + defFiles.next();
//DebugInfo.debug("Reading def file: " + currFile);

                            if (!terseV){
                            	if (location.isFromJAR())
                            		System.out.println("      Reading " + currFile + " - from " + location.getJarFilename());
                            	else
                            		System.out.println("      Reading " + currFile);
                            }
                            
                            if (location.isFromJAR()){
                            	defParser.parseFile(currFile,true);
                            }
                            else{
                            	defParser.parseFile(currFile);
                            }
                        }
                    }
                }

            }
            else{
                // We're currently loading a schema, so if this object is another
                // schema, things are screwy. Complain and return false.
                if (isSchema == true){
                	ResultException ex = new ResultException();
                	ex.result.addResult(Result.FATAL,"Already loading schema: " + schemaLoading.getObjectName());
                	ex.result.lastResult().moreMessages("This may have occurred because you have two schema definitions in the same file.");
                	ex.result.lastResult().fileName(infile);
                	throw(ex);
                }
                else{
                    // The object isn't a schema, so it must be another type of definition class
                		
                	// The definedIn attribute must be set before we add the schema to the SchemaManagers
                	// because it is used for a variety of purposes, including the generation of the
                	// internal types for enums and object references. The definedIn schema will have
                	// its internalTypeDefList attribute augmented with these types.
            		newObj.setDefinedIn(schemaLoading);
                	allSchema.addDefinition(newObj);
            		schemaLoading.addDefinition(newObj);
                		
                }
            }
        }

    }


}

