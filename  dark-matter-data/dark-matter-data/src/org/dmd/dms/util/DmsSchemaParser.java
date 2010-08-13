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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.exceptions.ResultSet;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;


/**
 * This class parses files that conform to the Information Model Definition
 * (IMD) schema and stores them in an SchemaManager.
 */

public class DmsSchemaParser implements DmcUncheckedOIFHandlerIF {

    /**
     * Schema manager that recognizes the IMD schema.
     */
    SchemaManager    		dmsSchema;

    /**
     * Schema manager that recognizes the IMD schema and the loaded schemas.
     */
    SchemaManager    		allSchema;

    /**
     * The schema that's currently being loaded.
     */
    SchemaDefinition        schemaLoading;

    /**
     * Stack of schemas being loaded.
     */
    Stack<SchemaDefinition>	schemaStack;

    /**
     * The file that's currently being parsed.
     */
    String              	currFile;

    /**
     * The files that have been loaded already.
     * Key:   String (filename)
     * Value: SchemaDefinition
     */
    HashMap<String,SchemaDefinition>	loadedFiles;

    /**
     * The schemas that have been loaded already.
     */
//    HashSet             loadedSchemas;

    /**
     * The directory where the schemas reside.
     */
    String              		schemaDir;

    /**
     * The parser that will read basic objects from our information model
     * definition files that contain schemas.
     */
    DmcUncheckedOIFParser     	schemaParser;

    /**
     * The parser that will read basic objects from our information model
     * definition files that contain the other types of definitions.
     */
    DmcUncheckedOIFParser       defParser;
    
    DmsSchemaFinder				finder;

    /**
     * The rule manager that has been configured with the rule for the Information
     * Model Definition schema. See com.dmc.tools.imdutil for details.
     */
//    BrfRuleManager      rules;

    /**
     * Indicates if detailed trace output is required.
     */
    boolean             terseV;
    
    // Our object factory that instantiates wrappers and populates their attributes
    DmwObjectFactory	dmwfactory;

//    /**
//     * Creates a new Object Instance Format parser. As new BasicObjects are created,
//     * they will be passed to the object handler for processing.
//     * @throws ResultException 
//     */
//    public DmsSchemaParser(ResultSet rs, SchemaManager sm, BrfRuleManager brm) {
    
    /**
     * Creates a new schema parser. 
     * @param sm A base level schema manager.
     * @param f  A schema finder that has already been called up to find schemas.
     * @throws ResultException
     */
    public DmsSchemaParser(SchemaManager sm, DmsSchemaFinder f) throws ResultException {
        dmsSchema       = sm;
        allSchema       = new SchemaManager();
        schemaLoading   = null;
        currFile        = null;
        loadedFiles     = new HashMap<String,SchemaDefinition>();
        // schemaParser    = new ImdOIFParser(this);
        schemaParser    = new DmcUncheckedOIFParser(this);
        // defParser       = new ImdOIFParser(this);
        defParser       = new DmcUncheckedOIFParser(this);
        schemaStack     = new Stack<SchemaDefinition>();
        
        
        // The factory is built to only recognize an and all objects because the
        // schema definitions might use auxiliary classes defined in other schemas
        dmwfactory		= new DmwObjectFactory(allSchema);
        
        finder			= f;
//        rules           = brm;
    }

    /**
     * Returns the schema manager that contains all of the definitions that resulted
     * from the last call to parseSchema.
     */
    public SchemaManager getManager(){
        return(allSchema);
    }

    /**
     * Parses the specified DMS file and any other schemas on which it depends.
     * <P>
     * This function calls on itself recursively to parse the specified
     * schema file and the schemas on which it depends.
     * @param schemaName The name of the schema. Schema specifications are found in
     * files with a .dms extension that have been found by the DmsSchemaFinder.
     * @param terse If true, only the name of the schema being parsed is displayed
     * on System.out otherwise, the name of each file being read is printed.
     * @throws ResultException 
     * @throws DmcValueException 
     * @returns The requested schema is returned if all goes well, otherwise
     * null is returned.
     * NOTE: If WARNINGs are encountered, we still the schema - just check for the
     * presence of WARNINGs on the result set when parsing is complete.
     */
    public SchemaDefinition parseSchema(String schemaName, boolean terse) throws ResultException, DmcValueException{
        SchemaDefinition rc;

        terseV = terse;
        rc = parseSchemaInternal(schemaName);

        schemaLoading = null;

        return(rc);
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
     * @returns The requested schema is returned if all goes well, otherwise
     * null is returned.
     * NOTE: If WARNINGs are encountered, we still the schema - just check for the
     * presence of WARNINGs on the result set when parsing is complete.
     */
    SchemaDefinition parseSchemaInternal(String schemaName) throws ResultException, DmcValueException {
    	DmsSchemaLocation	location	= finder.getLocation(schemaName);
        SchemaDefinition    currSchema = null;
        String          	currFile = null;
        SchemaDefinition    nativeSchema = null;
        
        if (location == null){
        	ResultException ex = new ResultException();
        	ex.addError("The specified schema couldn't be found: " + schemaName);
        	throw(ex);
        }
        
        currFile = location.getFileName();

        if (terseV)
            System.out.println("Parsing schema: " + schemaName);
        else
            System.out.println("\nParsing schema: " + schemaName);
        // Hold the directory name globally so that we can use it later
        schemaDir = new String(location.getDirectory());

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
            
        	schemaParser.parseFile(currFile);
            currSchema = (SchemaDefinition)schemaStack.pop();
            loadedFiles.remove(currFile);
            loadedFiles.put(currFile,currSchema);
            
//            if (rc == true){
//            allSchema.addDefinition(rs,currSchema);
            allSchema.manageSchema(currSchema);
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

        return(currSchema);
    }

    /**
     * This function is called each time a basic object is identified in
     * a file that's being parsed. All objects should be one of the IMD
     * objects i.e. Type, Attribute, Class or Schema.
     * @throws ResultException 
     * @throws DmcValueException 
     */
//    public boolean handleObject(ResultSet rs, ImdBasicObject obj, String infile){
    public void handleObject(DmcUncheckedObject uco, String infile) throws ResultException, DmcValueException{
//        boolean             rc                  = true;
        ClassDefinition     cd                  = null;
        boolean             isSchema            = false;
        DmsDefinition    	newObj              = null;
        Iterator<String>    dependsOnSchemas    = null;
        Iterator<String>    defFiles            = null;
        SchemaDefinition    currSchema          = null;
        String              depSchema           = null;
//        Result              result              = null;
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
				newObj = (DmsDefinition)dmwfactory.createWrapper(uco);
			} catch (ResultException e) {
				throw(e);
			} catch (DmcValueException e) {
				throw(e);
			} catch (ClassCastException e){
				ResultException ex = new ResultException();
				ex.addError("Invalid object in a schema definition: " + uco.classes.get(0));
				throw(ex);
			}
        	
//        	newObj = cd.newInstance();
        	
//            if ( (newObj = cd.newInstance()) == null){
//                rs.lastResult().moreMessages("This occurred while trying to instantiate an object of class: " + obj.classes.get(0));
//                rs.lastResult().lineNumber(obj.lineNumber);
//                rs.lastResult().fileName(infile);
//                rc = false;
//            }
//            else{
                if (cd.getName().compareTo("SchemaDefinition") == 0)
                    isSchema = true;

                if (schemaLoading == null){
                    // We're not loading a schema, so this had better be a new schema
                    // object - if not, we complain and return false
                    if (isSchema == true){
                        // This is a new schema, so indicate that we're loading one
                        schemaLoading = (SchemaDefinition)newObj;

                        // Populate the attribute values
//                        if ( (rc = this.fillAttributes(rs,uco,newObj,infile)) == true){
                        	
                            // We got the attributes sucessfully, so now try to load
                            // any other schemas that this one depends on

//                            // We apply the initialization rules first
//                            rules.applyInitRules(rs,newObj);
//
//                            // Apply the business rules
//                            if (rules.applyNewInstanceRules(rs,newObj) == false)
//                                return(false);

                            schemaStack.push(schemaLoading);
                            if ((dependsOnSchemas = schemaLoading.getDependsOn()) != null){
                                // This schema depends on others, make a recursive call
                                // to load them

                                // Hold on to the current schema
                                currSchema = schemaLoading;

                                // Reset the global schema pointer for now
                                schemaLoading = null;

                                while(dependsOnSchemas.hasNext()){
                                    depSchema = dependsOnSchemas.next();

//                                    currFile = new String(schemaDir + "/" + depSchema + "/" + depSchema + ".imd");
                                    DmsSchemaLocation location = finder.getLocation(depSchema);
                                    if (location == null){
                                    	ResultException ex = new ResultException();
                                    	ex.addError("Couldn't find schema: " + depSchema + " on which schema: " + currSchema.getName() + " depends.");
                                    	throw(ex);
                                    }
                                    currFile = location.getFileName();
                                    
                                    
                                    if (loadedFiles.containsKey(currFile) == false){
                                        // Only load the schema if we haven't already parsed it
                                        if ( (newSchema = this.parseSchemaInternal(depSchema)) == null){
                                        	ResultException ex = new ResultException();
                                        	ex.result.addResult(Result.FATAL,"Failed to parse schema: " + depSchema);
                                            throw(ex);
                                        }

                                        currSchema.addDependsOnRef(newSchema);
//                                        if (!currSchema.add(rs,ImdMetaSchema.meta_efDependsOnRef,newSchema)){
//                                            break;
//                                        }

                                        // Now reset schemaLoading to be null once more to
                                        // mask the schema that we just read
                                        schemaLoading = null;
                                    }
                                    else{
                                        // We've already loaded this file, but we still
                                        // need to update the dependsOnRef
// System.out.println("Adding ref to previously parsed schema: " + ((SchemaDefinition)loadedFiles.get(currFile)).getName());
                                    	
                                    	
                                        currSchema.addDependsOnRef(loadedFiles.get(currFile));
//                                        currSchema.add(rs,ImdMetaSchema.meta_efDependsOnRef,(SchemaDefinition)loadedFiles.get(currFile));
                                        
                                        
                                        // currSchema.add(rs,ImdMetaSchema.meta_efDependsOnRef,(SchemaDefinition)loadedFiles.get(infile));
                                    }
                                }

                                // Switch back to the schema at this level of parsing
                                schemaLoading = currSchema;
                            }

                            if ((defFiles = schemaLoading.getDefFiles()) != null){
                                // And now load the files associated with this schema
                                while(defFiles.hasNext()){
                                    currFile = schemaDir + "/" + schemaLoading.getName() + "/" + defFiles.next();
                                    if (!terseV)
                                        System.out.println("      Reading " + currFile);
//                                    defParser.parseFile(rs,currFile);
                                    defParser.parseFile(currFile);
                                }
                            }
                        }

//                    } // fill attributes
//                    else{
//                        rs.addResult(Result.FATAL,"Expecting an efSchemaDef instance but found: " + cd.getName());
//                        rs.lastResult().lineNumber(uco.lineNumber);
//                        rs.lastResult().fileName(infile);
//                        rc = false;
//                    }
                }
                else{
                    // We're currently loading a schema, so if this object is another
                    // schema, things are screwy. Complain and return false.
                    if (isSchema == true){
                    	ResultException ex = new ResultException();
                    	ex.result.addResult(Result.FATAL,"Already loading schema: " + schemaLoading.getName());
                    	ex.result.lastResult().moreMessages("This may have occurred because you have two schema definitions in the same file.");
                    	ex.result.lastResult().fileName(infile);
                    	throw(ex);
                    }
                    else{
                        // The object isn't a schema, so it must be another IMD
                        // class - go ahead and populate its attributes
                    	
//                        if ((rc = this.fillAttributes(rs,uco,newObj,infile)) == true){
                        	
                        	
//                             Apply the business rules

//                            // We apply the initialization rules first
//                            rules.applyInitRules(rs,newObj);
//
//                            if (rules.applyNewInstanceRules(rs,newObj) == false){
//                                if (newObj.getName() != null)
//                                    rs.lastResult().moreMessages("Definition for: " + newObj.getName());
//                                rs.lastResult().fileName(infile);
//                                rs.lastResult().nearLineNumber(uco.lineNumber);
//                                return(false);
//                            }

                    		newObj.setDefinedIn(schemaLoading);
                    		allSchema.addDefinition(newObj);
                    		schemaLoading.addDefinition(newObj);
                    		
//                            // Set the schema that this definition was defined in
//                            if (!newObj.set(rs,ImdMetaSchema.meta_efDefinedIn,schemaLoading)){
//                                rs.lastResult().moreMessages("This occurred while setting the efDefinedIn attribute of a schema definition.");
//                                rc = false;
//                            }
//                            else if ( (rc = allSchema.addDefinition(rs,newObj)) == true)
//                                rc = schemaLoading.addDefinition(rs, newObj);
//
//							if (newObj instanceof ImdAttributeDef){
//							    if ( ((ImdAttributeDef)newObj).getDefinedIn() == null){
//							        System.out.println("ImdIMDParser - NULL");
//							    }
//							}
							
//                        } // fill attributes
                    }
                }
//            }
        }

//       return(rc);
    }

//    /**
//     * This function takes the string-based attributes of the basic object
//     * and populates the generic object.
//     */
//    boolean fillAttributes(ResultSet rs, DmcUncheckedObject bo, DmwWrapperBase go, String infile){
//        Iterator            it          = bo.attributes.keySet().iterator();
//        ArrayList           attrVals    = null;
//        String              attrName    = null;
//        AttributeDefinition     ad          = null;
//        ImdGenericAttribute ga          = null;
//        ImdGenericObject    refObj      = null;
//        ImdGenericAttribute ourName     = null;
//        ImdGenericObject    ourSelf     = null;
//        boolean             rc          = true;
//        boolean             attrRC      = true;
//        ClassDefinition     cd          = null;
//
//        // Add in an aux classes - we start at 1 because we're skipping the
//        // construction class.
//        for(int i=1; i<bo.classes.size();i++){
//            if ( (cd = allSchema.isClass((String)bo.classes.get(i))) == null){
//                rs.addResult(Result.ERROR,"Unknown auxiliary class: " + (String)bo.classes.get(i));
//                rs.lastResult().nearLineNumber(bo.lineNumber);
//                rs.lastResult().fileName(infile);
//                rc = false;
//            }
//            else{
//                go.add(rs,ImdMetaSchemaAG.meta_efObjectClass,cd);
//            }
//        }
//
//        while(it.hasNext()){
//            attrName = (String)it.next();
//            attrVals = (ArrayList)bo.attributes.get(attrName);
//
//            if ((ad = allSchema.isAttribute(attrName)) == null){
//                rs.addResult(Result.ERROR,"Unknown attribute name: " + attrName);
//                rs.lastResult().nearLineNumber(bo.lineNumber);
//                rs.lastResult().fileName(infile);
//                rc = false;
//                break;
//            }
//            else{
//                // We found a valid attribute definition, so set the values
//                // on the generic object. NOTE: At this stage, we don't
//                // try to figure out if the attribute is valid for this
//                // type of object - that's handled by our business rule
//                // checking.
//
//                // THIS IS A HUMUNGOUS HACK TO PROPERLY SET THE NAME OF THE ATTRIBUTE!
//                if (go instanceof ImdAttributeDef){
//                    if (attrName.equals("efName")){
//                        ((ImdAttributeDef)go).name = new String((String)attrVals.get(0));
//                    }
//                }
//
//                if ((ad.getIsSingleValued().booleanValue() == true) && (attrVals.size() > 1)){
//                    // This is a singled valued attribute with multiple
//                    // values, so generate a warning
//                    rs.addResult(Result.WARNING,"Single-valued attribute has multiple values.");
//                    rs.lastResult().moreMessages("The value of the attribute will be the last value set.");
//                    rs.lastResult().attrName(attrName);
//                    rs.lastResult().nearLineNumber(bo.lineNumber);
//                    rs.lastResult().fileName(infile);
//                }
//
//                for(int i=0; i<attrVals.size();i++){
//                    attrRC = true;
//                    // Cycle through each attribute value
//                    if (ad.getType().getIsRefType().booleanValue() == true){
//                        // This is a reference type, so we'll see if we
//                        // can find the referenced object
//
//                        // BIG HACK: We allow an object to refer to itself at
//                        // this stage of things.
//                        ourSelf = null;
//                        if (ourName == null){
//                            ourName = go.getAttr(ImdMetaSchema.meta_efName);
//                        }
//
//                        if (ourName != null){
//                            if (ourName.getString().equals((String)attrVals.get(i))){
//                                ourSelf = go;
//                            }
//                        }
//
//                        if ( ((refObj = allSchema.isDefinition((String)attrVals.get(i))) == null) && (ourSelf == null)){
//                            // This isn't a valid class, attribute or type definition name
//                            rs.addResult(Result.ERROR,"Invalid reference to object: " + attrVals.get(i));
//                            rs.lastResult().moreMessages("Reference attributes must refer to objects defined in a schema.");
//                            rs.lastResult().nearLineNumber(bo.lineNumber);
//                            rs.lastResult().attrName(attrName);
//                            rs.lastResult().fileName(infile);
//                            rc = false;
//                            break;
//                        }
//                        else{
//                            // We could only get here if one of these isn't null
//                            if (refObj == null)
//                                refObj = ourSelf;
//
//                            // This is a valid reference, attempt to add it to the object
//                            if (ad.getIsSingleValued().booleanValue() == true){
//                                // This is a single value attribute, so use the set
//                                // interface
//                                attrRC = go.set(rs,ad,refObj);
//                            }
//                            else{
//                                // This is a multi-valued attribute, so use the
//                                // add interface
//                                attrRC = go.add(rs,ad,refObj);
//                            }
//                        }
//                    }
//                    else if (ad.getIsSingleValued().booleanValue() == true){
//                        // This is a single value attribute, so use the set
//                        // interface
//                        attrRC = go.set(rs,ad,(String)attrVals.get(i));
//                    }
//                    else{
//                        // This is a multi-valued attribute, so use the
//                        // add interface
//                        attrRC = go.add(rs,ad,(String)attrVals.get(i));
//                    }
//
//                    if (attrRC == false){
//                        rs.lastResult().moreMessages("This occurred while setting the value of the specified attribute.");
//                        rs.lastResult().attrName(attrName);
//                        rs.lastResult().nearLineNumber(bo.lineNumber);
//                        rs.lastResult().fileName(infile);
//                        rc = false;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if (rc){
//            String justFile = infile.substring(infile.lastIndexOf("/")+1,infile.length());
//            go.set(rs,ImdMetaSchema.meta_efFile,justFile);
//        }
//        return(rc);
//    }

}

