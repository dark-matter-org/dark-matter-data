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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNameClashObjectSet;
import org.dmd.dmc.DmcNameClashResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.SourceInfo;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.MetaSchema;
import org.dmd.dms.MetaSchemaAG;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaDefinitionListenerIF;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;
import org.dmd.dms.generated.dmo.DmsDefinitionDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dmv.server.DmvDynamicRuleManager;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.UtilityOptions;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;


/**
 * This class parses files that conform to the Information Model Definition
 * (IMD) schema and stores them in an SchemaManager.
 */

public class DmsSchemaParser implements DmcUncheckedOIFHandlerIF, SchemaDefinitionListenerIF, DmcNameClashResolverIF {

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

    // Our DMO factory that we use to load rule instances
    DmoObjectFactory			dmofactory;
    
    // The rule manager for our basic rules, defined in DMV
    DmvRuleManager				ruleManager;
    
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
        
        initialize();
    }

    /**
     * Parses the specified DMS file and any other schemas on which it depends.
     * <p/>
     * If the checkRules flag is true, we also dynamically instantiate and validate
     * the defined rules against themselves, which is tricky. The other aspect of this which
     * is tricky has to do with the fact that the class path must be configured properly for
     * this to work in situations where there are other code packages beyond the base
     * dark-matter ones i.e. in situations where you're building a code base using just the dark-matter JARs.
     * Code generation/compilation has to take place first and then the rules have to be checked
     * separately. See the DmoGenUtility on how to accomplish this.
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
     * @throws DmcRuleExceptionSet 
     * @throws DmcNameClashException 
     */
    public SchemaDefinition parseSchema(SchemaManager am, String schemaName, boolean terse) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        SchemaDefinition rc;
        
        allSchema = am;
        initialize();

        terseV = terse;
        rc = parseSchemaInternal(schemaName);
        
//        // We only do this if we've been asked to from
//        if ((rc != null) && checkRules){
//	        // And finally, after everything has been parsed and resolved, we go back over the rule instances
//	        // and sanity check them. Well, it's not quite that simple. We are applying rules to the rules
//	        // themselves and we have to dynamically instantiate the rules and initialize them with rule data.
//	        // All that interesting stuff is done in the dynamic rule manager.
//	        DmvDynamicRuleManager drm = new DmvDynamicRuleManager();
//	        drm.loadAndCheckRules(allSchema, rc);
//        }
        
        return(rc);
    }
    
    public void checkRules(SchemaDefinition sd) throws DmcRuleExceptionSet, DmcNameClashException, DmcValueException {
        // And finally, after everything has been parsed and resolved, we go back over the rule instances
        // and sanity check them. Well, it's not quite that simple. We are applying rules to the rules
        // themselves and we have to dynamically instantiate the rules and initialize them with rule data.
        // All that interesting stuff is done in the dynamic rule manager.
        DmvDynamicRuleManager drm = new DmvDynamicRuleManager();
        drm.loadAndCheckRules(allSchema, sd);    	
    }
    
    void initialize(){
        schemaLoading   = null;
        currFile        = null;
        loadedFiles     = new HashMap<String,SchemaDefinition>();
        schemaParser    = new DmcUncheckedOIFParser(this);
        defParser       = new DmcUncheckedOIFParser(this);
        
        for (AttributeDefinition def: MetaSchemaAG._metaSchema.getAttributeDefList()){
        	if (def.getPreserveNewlines()){
        		schemaParser.addPreserveNewlinesAttribute(def.getName().getNameString());
        		defParser.addPreserveNewlinesAttribute(def.getName().getNameString());
        	}
        }
        schemaStack     = new Stack<SchemaDefinition>();
        
        // The factory is built to recognize all objects because the
        // schema definitions might use auxiliary classes defined in other schemas
        dmwfactory		= new DmwObjectFactory(allSchema);
    	
        dmofactory		= new DmoObjectFactory(allSchema);
        
        // Note: the rule manager automatically loads the meta schema and DMV rules.
        ruleManager		= new DmvRuleManager();
        
//        if (!terseV)
//        	DebugInfo.debug("\n\n*** RULE TRACING DISABLED ***\n\n");
//        DmcOmni.instance().ruleTracer(new ConsoleRuleTracer());
//        DmcOmni.instance().ruleTracing(true);
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
     * @throws DmcRuleExceptionSet 
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     * @returns The requested schema is returned if all goes well, otherwise
     * null is returned.
     * NOTE: If WARNINGs are encountered, we still the schema - just check for the
     * presence of WARNINGs on the result set when parsing is complete.
     */
    SchemaDefinition parseSchemaInternal(String schemaName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
//    	DmsSchemaLocation	location	= finder.getLocation(schemaName);
    	ConfigVersion		config		= finder.getConfig(schemaName);
    	ConfigLocation		location	= null;
        SchemaDefinition    currSchema = null;
        String          	currFile = null;
        SchemaDefinition    nativeSchema = null;
        
        if (config == null){
        	ResultException ex = new ResultException();
        	ex.addError("The specified schema couldn't be found: " + schemaName);
        	ex.addError(DebugInfo.getCurrentStack());
        	throw(ex);
        }
        
        location = config.getLatestVersion();
        
        currFile = location.getFileName();

        if (!terseV) {
        	if (!UtilityOptions.instance().quietProgress())
        		System.out.println("\nParsing schema: " + schemaName);
        }
        
        // Hold the directory name globally so that we can use it later
        schemaDir = new String(location.getDirectory());

        if ( (loadedFiles.containsKey(currFile) == false) &&
             ( (nativeSchema = allSchema.isSchema(schemaName)) == null)){
            // System.out.println("Opening " + currFile);
            // We didn't have the file, so add it to our loadedFiles set
            // and proceed with parsing.
            loadedFiles.put(currFile,null);

            if (!terseV) {
            	if (!UtilityOptions.instance().quietProgress())
            		System.out.println("    Reading " + currFile);
            }
            
        	schemaParser.parseFile(currFile, location.isFromJAR());
            currSchema = (SchemaDefinition)schemaStack.pop();
            
            loadedFiles.remove(currFile);
            loadedFiles.put(currFile,currSchema);
            
            allSchema.addDefinition(currSchema,this);
            
            // Some of our rules have to be run once we have the entire context, so we perform a final
            // pass to ensure that those rules are followed. This is a bit of hack for now. Changes in
            // definition loading, internal object creation and object resolution have to be studied.
            for(DmsDefinition def : allSchema.globallyUniqueMAP.values()){
            	ruleManager.executeAttributeValidation(def.getDmcObject());
            }
            
            // And now check to see if everything is resolved
            allSchema.resolveReferences(currSchema,this);
            
            Iterator<AttributeDefinition> adl = currSchema.getAttributeDefList();
            if (adl != null){
            	allSchema.resolveNameTypes(adl);
            }
            
            // And now we have to check that any TypeDefinitions that have
            // isNameType set to true have had their nameAttributeDef set
            Iterator<TypeDefinition> tdl = currSchema.getTypeDefList();
            if (tdl != null){
            	while(tdl.hasNext()){
            		TypeDefinition td = tdl.next();
            		if (td.getIsNameType()){
            			if (td.getNameAttributeDef() == null){
            				ResultException ex = new ResultException("The " + td.getName() + " TypeDefinition is flagged as a name type but doesn't have a corresponding attribute of the same type with the designatedNameAttribute flag set to true.");
            				ex.setLocationInfo(td.getFile(), td.getLineNumber());
            				throw(ex);
            			}
            		}
            	}
            }
            
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
     * @throws DmcRuleExceptionSet 
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        ClassDefinition     cd                  = null;
        boolean             isSchema            = false;
        DmsDefinition    	newDef              = null;
        Iterator<String>    dependsOnSchemas    = null;
        Iterator<String>    defFiles            = null;
        SchemaDefinition    currSchema          = null;
        String              depSchema           = null;
        SchemaDefinition    newSchema           = null;
        String              currFile            = null;
        String 				srcFile 			= "";
        // Determine if we have a valid class
        if ((cd = allSchema.isClass((String)uco.classes.get(0))) == null){
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
        		}
        		
        		// If we're underneath a standard eclipse project, we ignore everything before
        		// the /src folder name.
				int srcloc = infile.indexOf("/src");
				srcFile = "";
				if (srcloc != -1)
					srcFile = infile.substring(srcloc);
				else
					srcFile = infile;
				
				if (schemaLoading == null){
					if (uco.getSV(MetaDMSAG.__name.name) != null){
						uco.addValue(MetaDMSAG.__dotName.name, uco.getSV(MetaDMSAG.__name.name) + "." + uco.getConstructionClass());
//						uco.addValue(MetaDMSAG.__nameAndTypeName.name, uco.getSV(MetaDMSAG.__name.name) + "." + uco.getConstructionClass());
					}
				}
				else{
					if (uco.getSV(MetaDMSAG.__name.name) != null){
						uco.addValue(MetaDMSAG.__dotName.name, schemaLoading.getName() + "." + uco.getSV(MetaDMSAG.__name.name) + "." + uco.getConstructionClass());
//						uco.addValue(MetaDMSAG.__nameAndTypeName.name, uco.getSV(MetaDMSAG.__name.name) + "." + uco.getConstructionClass());
					}
				}

				// More interesting hand waving to handle rule instances. For most of the 
        		// objects that are found in schema definitions everything can be handled
        		// in the usual way i.e. for ClassDefinitions, AttributeDefinitions,
        		// RuleDefinitions etc. all of those classes are defined as part of the
        		// meta schema and we have loaded the MetaSchemaAG. This means that we
        		// can use the dmwfactory to instantiate these objects. However, for
        		// instances of RuleDefinition, we're dealing with objects that are read
        		// from the schema definition files and not using the loaded schemas. In
        		// that case, we don't have all the information required to instantiate
        		// objects. 
				//
				// Rule data objects are stored against the schema for processing once 
				// all schemas have been read. 
        		ClassDefinition checkClass = allSchema.isClass(uco.classes.get(0));
        		if (checkClass != null){
        			if (checkClass.getRuleDefinition() != null){
        				uco.addValue(MetaDMSAG.__lineNumber.name, lineNumber + "");
        				uco.addValue(MetaDMSAG.__file.name, srcFile);
        				uco.addValue(MetaDMSAG.__definedIn.name, schemaLoading.getName().getNameString());
        				
        				schemaLoading.addParsedRule(uco);
        				
        				return;
        			}
        		}
        		
        		DmwWrapper newObj = dmwfactory.createWrapper(uco);
        		newDef 		= null;

    			newDef = (DmsDefinition) newObj;
    			newDef.setFile(srcFile);
    			newDef.setLineNumber(lineNumber);
				
//				DmvDMSAG.__dmvAllowedAttributes.execute(newDef.getDMO());
				
				// NOTE: We used to be able to resolve objects as we went, but, because
				// we now generate the TypeDefinitions for object references internally,
				// we run into issues with attributes (which are loaded first) referring 
				// to classes that aren't yet defined. So, we have to do our object resolution
				// in a second pass.
				
				// TODO: Apply rules to the object
//    			DebugInfo.debug("APPLYING RULES");
    			
				ruleManager.executeAttributeValidation(newDef.getDmcObject());
				ruleManager.executeObjectValidation(newDef.getDmcObject());
				
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
			} catch(DmcRuleExceptionSet e){
				e.source(new SourceInfo(srcFile, lineNumber + ""));
				throw(e);
			}
        	
            if (cd.getObjectName().getNameString().compareTo("SchemaDefinition") == 0)
                isSchema = true;

            if (schemaLoading == null){
                // We're not loading a schema, so this had better be a new schema
                // object - if not, we complain and return false
                if (isSchema == true){
                    // This is a new schema, so indicate that we're loading one
                    schemaLoading = (SchemaDefinition)newDef;
                    
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
//if (depSchema.equals("dmv"))
//	DebugInfo.debugWithTrace("Parsing DMV");

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
                            	if (!UtilityOptions.instance().quietProgress()) {
	                            	if (location.isFromJAR())
	                            		System.out.println("      Reading " + currFile + " - from " + location.getJarFilename());
	                            	else
	                            		System.out.println("      Reading " + currFile);
                            	}
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
            		
//            		if (newDef == null){
//            			newRuleData.setDefinedIn(schemaLoading);
//            			allSchema.addRuleData(newRuleData);
//            			schemaLoading.addRuleDataList(newRuleData);
//            		}
//            		else{
                		newDef.setDefinedIn(schemaLoading);
                    	allSchema.addDefinition(newDef,this);
                		schemaLoading.addDefinition(newDef);
//            		}                		
                }
            }
        }

    }

	@Override
	public void definitionAdded(DmsDefinitionDMO def) {
		if (def instanceof AttributeDefinitionDMO){
			AttributeDefinitionDMO attr = (AttributeDefinitionDMO) def;
			if (attr.getPreserveNewlines()){
				schemaParser.addPreserveNewlinesAttribute(attr.getName().getNameString());
				defParser.addPreserveNewlinesAttribute(attr.getName().getNameString());
			}
		}
		
	}

	@Override
	public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
		DmcNamedObjectIF rc = null;
		
		// This is our fallback - if one of the places we find the def is in the meta schema, we'll use that
		DmcNamedObjectIF fromMeta = null;
		
		Iterator<DmcNamedObjectIF> it = ncos.getMatches();
		while(it.hasNext()){
			try{
				DmsDefinition def = (DmsDefinition) it.next();
				
				// We get the source of the definition from the DMO, we don't know if these objects have been resolved as yet
				if (def.getDMO().getDefinedIn() == null){
					// This shouldn't happen, but if it does, just continue
					continue;
				}
				
				// If one of the definitions is in the schema we're currently loading, we're going
				// to choose that definition
				if (schemaLoading.getName().equals(def.getDMO().getDefinedIn().getObjectName().getNameString())){
					rc = def;
					break;
				}
				
				// If we have a meta definition - hold on to it
				if (def.getDefinedIn().getName().equals("meta"))
					fromMeta = def;
				
			}
			catch(ClassCastException e){
				// We could wind up here if someone is using the schema parser in an incorrect context
				// Complain!
				throw(new IllegalStateException("The DmsSchemaParser can only be used to resolve references to DmsDefinition objects!"));
			}
		}
		
		if (rc == null){
			if (fromMeta == null){
				// None of the definitions are in the schema we're loading, so the user is
				// going to have qualify the name of the thing they're referring to i.e.
				// instead of just defName, they'll have to specify schema.defName.
				StringBuffer sb = new StringBuffer();
				sb.append("You must qualify the name of the object you're referring to: ");
				it = ncos.getMatches();
				while(it.hasNext()){
					DmsDefinition def = (DmsDefinition) it.next();
					sb.append(def.getDMO().getDefinedIn().getObjectName() + "." + def.getName() + "  ");
				}
	
				DmcValueException ex = new DmcValueException(sb.toString());
				throw(ex);
			}
			else
				rc = fromMeta;
		}
		
		return(rc);
	}



}

