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
package org.dmd.dms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.RuleName;
import org.dmd.dmc.types.StringName;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.RuleScopeEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;
import org.dmd.dms.generated.types.Field;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.exceptions.ResultSet;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Dictionary;
import org.dmd.util.parsing.Token;


/**
 * The SchemaManager class manages the elements that comprise schemas: types, attributes,
 * classes and schemas themselves.
 */

public class SchemaManager implements DmcNameResolverIF {

    /**
     * The schema of classes that are used to describe schemas.
     */
    SchemaDefinition  								meta;

    /**
     * This map contains all type, attribute, class and schema definitions keyed on
     * their respective name attributes.
     * Key: StringName
     * Value: TypeDefinition, ClassDefinition, AttributeDefinition, ActionDefinition, SchemaDefinition, EnumDefinition
     */
    public HashMap<StringName,DmsDefinition>    	allDefs;

    /**
     * This map contains all enum  definitions keyed on their respective name attributes.
     * Key: StringName
     * Value: DmdEnumValueDef
     */
    public HashMap<StringName,EnumDefinition>     	enumDefs;
    public int  longestEnumName;

    /**
     * This map contains all type definitions keyed on their respective name attributes.
     * Key: StringName
     * Value: TypeDefinition
     */
    public HashMap<StringName,TypeDefinition>     	typeDefs;
    public int  longestTypeName;

    // Internally generated types for classes
    public HashMap<StringName,TypeDefinition>     	internalTypeDefs;
    
    /**
     * This map contains all attribute definitions keyed on their respective name attributes.
     * Key: StringName
     * Value: AttributeDefinition
     */
    public HashMap<StringName,AttributeDefinition>	attrDefs;
    public int  longestAttrName;
    
    public TreeMap<Integer,ClassDefinition>			classesByID;

    public TreeMap<Integer,AttributeDefinition>		attrByID;

    /**
     * This map contains all action definitions keyed on their respective name attributes.
     * Key: StringName
     * Value: ActionDefinition
     */
    public HashMap<StringName,ActionDefinition>     		actionDefs;
    public int  longestActionName;

    /**
     * This map contains all class definitions keyed on their respective name attributes.
     * Key: StringName
     * Value: ClassDefinition
     */
    public HashMap<StringName,ClassDefinition>     			classDefs;
    public int  longestClassName;

    // Key: StringName
    // Value: ComplexTypeDefinition
    public HashMap<StringName,ComplexTypeDefinition>     	complexTypeDefs;
    public int  longestComplexTypeName;

    // Key: StringName
    // Value: ExtendedReferenceTypeDefinition
    public HashMap<StringName,ExtendedReferenceTypeDefinition>	extendedReferenceTypeDefs;
    public int  longestExtendedReferenceTypeName;

    // Key: StringName
    // Value: SliceDefinition
    public HashMap<StringName,SliceDefinition>     			sliceDefs;
    public int  longestSliceName;

    // Key: StringName
    // Value: RuleCategory
    public HashMap<StringName,RuleCategory>     			ruleCategoryDefs;
    public int  											longestRuleCategoryName;
    public TreeMap<Integer,RuleCategory>					ruleCategoriesByID;

    public TreeMap<RuleName,RuleData>						ruleData;


    // Key: StringName
    // Value: RuleDefinition
    public HashMap<StringName,RuleDefinition>     			ruleDefs;
    public int  longestRuleName;
    
    // The top level hierarchic objects i.e. ones that don't have allowedParents
    TreeMap<StringName,ClassDefinition>						hierarchicObjects;

    /**
     * This map contains all class abbreviations.
     * Key:   StringName
     * Value: ClassDefinition
     */
    public HashMap<StringName,ClassDefinition>     			classAbbrevs;

    /**
     * This map contains all attribute abbreviations.
     * Key:   StringName
     * Value: ClassDefinition
     */
    public HashMap<StringName,AttributeDefinition>			attrAbbrevs;

//    /**
//     * This map contains all repository names.
//     * Key:   String
//     * Value: AttributeDefinition
//     */
//    public HashMap<String,DmsDefinition>     	reposNames;

    /**
     * This map contains all schema definitions keyed on their respective name attributes.
     * Key:   String (schema name)
     * Value: SchemaDefinition
     */
    TreeMap<StringName,SchemaDefinition>     		schemaDefs;
    public int  longestSchemaName;

    /**
     * A dictionary that can be used in conjunction with the Classifier class.
     */
    Dictionary  								dict;

    /**
     * The schema that we're in the process of managing.
     */
    SchemaDefinition    						currentSchema;
    
    // Key: the class name of the extension e.g. LDAPSchemaExtension
    // Value: 
    TreeMap<String,SchemaExtensionIF>			extensions;
    
    // A flag that indicates whether we should perform schemaID checks
    // when we're loading a schema - it's set to false if we're loading
    // a generated schema.
    boolean										performIDChecks;

//    StringName nameKey;
    
    /**
     * Creates a new SchemaManager.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public SchemaManager() throws ResultException, DmcValueException {
    	init();
    }
    
    /**
     * A convenience constructor that lets you create the schema manager and manage
     * a single schema in one easy operation.
     * @param sd The schema to be managed.
     * @throws ResultException
     * @throws DmcValueException
     */
    public SchemaManager(SchemaDefinition sd) throws ResultException, DmcValueException {
    	init();
    	manageSchema(sd);
    }
    
    void init() throws ResultException, DmcValueException{
        // Create our various hashmaps
        allDefs     				= new HashMap<StringName,DmsDefinition>();
        enumDefs 					= new HashMap<StringName,EnumDefinition>();
        typeDefs    				= new HashMap<StringName,TypeDefinition>();
        internalTypeDefs    		= new HashMap<StringName,TypeDefinition>();
        attrDefs    				= new HashMap<StringName,AttributeDefinition>();
        attrByID					= new TreeMap<Integer, AttributeDefinition>();
        classesByID					= new TreeMap<Integer, ClassDefinition>();
        actionDefs  				= new HashMap<StringName,ActionDefinition>();
        classDefs   				= new HashMap<StringName,ClassDefinition>();
        complexTypeDefs   			= new HashMap<StringName,ComplexTypeDefinition>();
        extendedReferenceTypeDefs   = new HashMap<StringName,ExtendedReferenceTypeDefinition>();
        sliceDefs   				= new HashMap<StringName,SliceDefinition>();
        ruleCategoryDefs   			= new HashMap<StringName,RuleCategory>();
        ruleCategoriesByID			= new TreeMap<Integer, RuleCategory>();
        ruleDefs   					= new HashMap<StringName,RuleDefinition>();
        ruleData					= new TreeMap<RuleName, RuleData>();
        schemaDefs  				= new TreeMap<StringName,SchemaDefinition>();
        classAbbrevs				= new HashMap<StringName,ClassDefinition>();
        attrAbbrevs 				= new HashMap<StringName,AttributeDefinition>();
        hierarchicObjects			= null;
        
//        reposNames  = new HashMap<String,DmsDefinition>();
        dict        			= null;
        extensions				= new TreeMap<String, SchemaExtensionIF>();
        
        performIDChecks = true;
        
//        nameKey = new StringName();
        
        // Create the global metaschema
        if (MetaSchema._metaSchema == null){
            meta = new MetaSchema();
            
        }
        else
            meta = MetaSchema._metaSchema;

        ((MetaSchema)meta).setSchemaManager(this);

//        ((MetaSchema)meta).traceLog.setDebugLevels(MetaSchema._DEBUGE.getIntToStringMap().size(),MetaSchema._DEBUGE.getIntToStringMap().values().iterator());

//        if (rs.worst() == Result.NONE){
            // There should be no warnings/errors during the creation of the
            // meta-schema

        DebugInfo.debugWithTrace("LOADING META");
        
            // Manage the meta schema so that we have a starting point for schema management
            manageSchemaInternal(meta);
            
            resolveReferences(meta);

            // Now that everything's resolved, we have some unfinished business to take care of
        	Iterator<AttributeDefinition> adl = meta.getAttributeDefList();
//        	DebugInfo.debug("\n\n*** Trying to resolve name attributes for schema " + meta.getName().getNameString() + "\n\n");
        	resolveNameTypes(adl);


//        }
    	
    }
    
    public TreeMap<StringName, ClassDefinition> getHierarchicObjects(){
    	if (hierarchicObjects == null){
    		hierarchicObjects = new TreeMap<StringName, ClassDefinition>();
    		
    		for(ClassDefinition cd: classDefs.values()){
    			if (cd.getIsNamedBy() != null){
    				if (cd.getIsNamedBy().getType().getIsHierarchicName()){
    					if (cd.getAllowedParentsSize() == 0)
    						hierarchicObjects.put(cd.getName(), cd);
    					else{
    						for(ClassDefinition parent: cd.getAllowedParents()){
    							parent.addSubcomp(cd);
    						}
    					}
    				}
    			}
    		}
    	}
    	return(hierarchicObjects);
    }
    
    /**
     * @param dmo the object to be wrapped.
     * @return the DMO wrapped with the appropriate wrapper type.
     */
    public DmwWrapper wrapIt(DmcObject dmo){
    	ClassDefinition cd = isClass(dmo.getConstructionClassName());
    	if (cd == null){
    		throw(new IllegalStateException("Cannot create DmwWrapper for unknown class: " + dmo.getConstructionClassName()));
    	}
    	DmwWrapper rc = null;
		try {
			rc = cd.newInstance();
		} catch (ResultException e) {
    		throw(new IllegalStateException("Cannot create DmwWrapper for class: " + dmo.getConstructionClassName(),e));
		}
    	rc.setDmcObject(dmo);
    	return(rc);
    }
    
//    public DmcAttributeInfo getAttributeInfo(Integer id){
//    	AttributeDefinition ad = attrByID.get(id);
//    	
//    	if (ad == null)
//    		return(null);
//    	
//    	return(ad.getAttributeInfo());
//    }
        
    public DmcObjectName getNameValueInstance(Integer id) throws Exception {
    	AttributeDefinition ad = attrByID.get(id);
    	
    	if (ad == null)
    		return(null);
    	
    	DmcObjectName rc = null;
    	
    	rc = ad.getType().getNameValue();
    	
    	return(rc);
    }
    
    /**
     * Create an instance of the attribute with the specified identifier.
     * @param id The dmdID.
     * @return The appropriate attribute instance.
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public DmcAttribute<?> getAttributeInstance(Integer id) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	AttributeDefinition ad = attrByID.get(id);
    	DmcAttributeInfo	ai = DmcOmni.instance().getInfo(id);
    	
    	if (ad == null){
    		throw(new IllegalStateException("Tried to deserialize attribute with unknown ID: " + id));
    	}
    	
//    	DmcAttribute<?> rc = (DmcAttribute<?>) ad.getType().getAttributeHolder(ad.getAttributeInfo());
//    	rc.setAttributeInfo(ad.getAttributeInfo());
    	
    	if (ai == null){
    		throw(new IllegalStateException("Tried to deserialize attribute with unknown ID: " + id));
    	}
    	
    	DmcAttribute<?> rc = (DmcAttribute<?>) ad.getType().getAttributeHolder(ai);
    	rc.setAttributeInfo(ai);
    	
    	return(rc);
    }
    
    /**
     * @param oni The object name.
     * @return a naming attribute of the appropriate type for the specified name.
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    @SuppressWarnings("unchecked")
	public DmcAttribute<DmcObjectNameIF> getNameAttributeInstance(DmcObjectName oni){
    	TypeDefinition td = isType(oni.getNameClass());
    	
    	if (td == null){
    		throw(new IllegalStateException("Unable to find type definition for type: " + oni.getNameClass()));
    	}
    	AttributeDefinition ad = td.getNameAttributeDef();
    	
    	if (ad == null){
    		throw(new IllegalStateException("No naming attribute has been defined of type: " + oni.getNameClass()));
    	}
    	
    	DmcAttributeInfo ai = DmcOmni.instance().getInfo(ad.getDmdID());
    	
    	if (ai == null){
    		throw(new IllegalStateException("No attribute info for attribute: " + ad.getName() + " id: " + ad.getDmdID()));
    	}
    	
    	DmcAttribute<DmcObjectNameIF> rc;
		try {
//			rc = (DmcAttribute<DmcObjectNameIF>) ad.getType().getAttributeHolder(ad.getAttributeInfo());
			rc = (DmcAttribute<DmcObjectNameIF>) ad.getType().getAttributeHolder(ai);
		} catch (Exception e) {
			throw(new IllegalStateException("Unable to instantiate naming attribute of type: " + oni.getNameClass(),e));
		}
		
    	return(rc);
    }
    
    /**
     * This method is called from the DmsSchemaParser to alert us that a new schema
     * is about to be read.
     * @param sd The schema about to be loaded.
     * @throws ResultException  
     */
	public void schemaBeingLoaded(SchemaDefinition sd) throws ResultException {
    	for(SchemaExtensionIF currext : extensions.values()){
    		currext.schemaBeingLoaded(sd);
    	}
    }
	
	/**
	 * Calls the schema extensions with this definition so that they can add
	 * auxiliary information if required.
	 * @param def the definition about to be added.
	 * @throws DmcValueException  
	 */
	public void definitionPreAdd(DmcUncheckedObject def) throws DmcValueException {
    	for(SchemaExtensionIF currext : extensions.values()){
    		currext.definitionPreAdd(def);
    	}
	}
    
    /**
     * This method is called from the DmsSchemaParser to alert us that a new schema
     * is about to be read. We check the schema for any schemaExtension attributes and,
     * if we find any, attempt to instantiate the extension class (if we don't already
     * have it). As well, we ensure that the schemas required for the schema extension
     * are loaded.
     * @param sd The schema about to be loaded.
     * @throws ResultException  
     * @throws DmcValueException 
     */
	public void schemaPreAdd(DmcUncheckedObject sd) throws ResultException, DmcValueException {
    	NamedStringArray attr = sd.get(MetaSchema._schemaExtension.getName().getNameString());
    	
     	if (attr != null){
    		Class<?> extclass;
//    		Iterator<String> extList = attr.getMV();
    		
    		for(String ext: attr){
//    		while(extList.hasNext()){
//    			String ext = extList.next();
                try{
                	extclass = Class.forName(ext);
                }
                catch(Exception e){
                	ResultException ex = new ResultException();
                	ex.result.addResult(Result.FATAL,"Couldn't load schemaExtension class: " + ext);
                    ex.result.lastResult().moreMessages(e.getMessage());
                    ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
                    throw(ex);
                }

                int lastDot = ext.lastIndexOf(".");
                String className = ext.substring(lastDot + 1);
                
                if (extensions.get(className) == null){
                	SchemaExtensionIF extInstance = null;
                	// We don't have the extension yet, try to instantiate it
                    try{
                    	extInstance = (SchemaExtensionIF) extclass.newInstance();
                    }
                    catch(Exception e){
                    	ResultException ex = new ResultException();
                    	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + ext);
                    	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
                    	ex.result.lastResult().moreMessages("Or it may be that the class doesn't implement the SchemaExtensionIF interface.");
                    	throw(ex);
                    }

                    // And now, load the schema(s) required by the schema extension
                    SchemaDefinition extschema = extInstance.getExtensionSchema();
                    loadGeneratedSchema(extschema);
                    
                    extensions.put(className, extInstance);
                    extInstance.setManager(this);

                    // Let the schema extension know that it has been instantiated against this schema
                    extInstance.definitionPreAdd(sd);
                }
                
//            	for(SchemaExtensionIF currext : extensions.values()){
//            		currext.schemaBeingLoaded(sd);
//            	}

    		}
    	}
    }
    
    /**
     * This method will recursively load a set of generated schemas based on the 
     * schemas on which they depend.
     * @param sd A SchemaDefinition.
     * @throws DmcValueException 
     * @throws ResultException 
     */
	private void loadGeneratedSchema(SchemaDefinition sd) throws ResultException, DmcValueException {
    	
//    	DebugInfo.debug(sd.getClass().getName());
    	
    	for(String schemaName : sd.dependsOnSchemaClasses.keySet()){
    		String schemaClassName = sd.dependsOnSchemaClasses.get(schemaName);
    		
			SchemaDefinition depSchema = isSchema(schemaName);
			
			if (depSchema == null){
				Class<?> schemaClass = null;
				
                try{
                	schemaClass = Class.forName(schemaClassName);
                }
                catch(Exception e){
                	ResultException ex = new ResultException();
                	ex.result.addResult(Result.FATAL,"Couldn't load generated schema class: " + schemaClassName);
                    ex.result.lastResult().moreMessages(e.getMessage());
                    ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
                    throw(ex);
                }

                try{
                	depSchema = (SchemaDefinition) schemaClass.newInstance();
                }
                catch(Exception e){
                	ResultException ex = new ResultException();
                	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + schemaClassName);
                	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
                	ex.result.lastResult().moreMessages("Or it may be that the class isn't derived from SchemaDefinition.");
                	throw(ex);
                }

                loadGeneratedSchema(depSchema);
			}

    	}
    	
    	SchemaDefinition theInstance = sd.getInstance();
    	
//    	DebugInfo.debug(sd.getName() + " is being managed...\n");
    	
        manageSchemaInternal(theInstance);
        
        resolveReferences(theInstance);
        
    	// Now that everything's resolved, we have some unfinished business to take care of
    	Iterator<AttributeDefinition> adl = sd.getAttributeDefList();
//    	DebugInfo.debug("\n\n*** Trying to resolve name attributes for schema " + sd.getName().getNameString() + "\n\n");
    	resolveNameTypes(adl);


        
        //    	Iterator<String> deps = sd.getDependsOn();
//    	if (deps != null){
//    		while(deps.hasNext()){
//    			String dep = deps.next();
//    			SchemaDefinition depSchema = isSchema(dep);
//    			
//    			if (depSchema == null){
//    				String depClass = sd.getDependsOnClass(dep);
//    				Class schemaClass = null;
//    				
//                    try{
//                    	schemaClass = Class.forName(depClass);
//                    }
//                    catch(Exception e){
//                    	ResultException ex = new ResultException();
//                    	ex.result.addResult(Result.FATAL,"Couldn't load generated schema class: " + depClass);
//                        ex.result.lastResult().moreMessages(e.getMessage());
//                        ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
//                        throw(ex);
//                    }
//
//                    try{
//                    	depSchema = (SchemaDefinition) schemaClass.newInstance();
//                    }
//                    catch(Exception e){
//                    	ResultException ex = new ResultException();
//                    	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + depClass);
//                    	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
//                    	ex.result.lastResult().moreMessages("Or it may be that the class isn't derived from SchemaDefinition.");
//                    	throw(ex);
//                    }
//
//                    loadGeneratedSchema(depSchema);
//    			}
//    		}
//    	}
//        manageSchemaInternal(sd);
//        resolveReferences(sd);
   }
    
    

//	public void schemaBeingLoaded(SchemaDefinition sd) throws ResultException {
//    	Iterator<String> extList = sd.getSchemaExtension();
//    	if (extList != null){
//    		Class extclass;
//    		
//    		while(extList.hasNext()){
//    			String ext = extList.next();
//                try{
//                	extclass = Class.forName(ext);
//                }
//                catch(Exception e){
//                	ResultException ex = new ResultException();
//                	ex.result.addResult(Result.FATAL,"Couldn't load schemaExtension class: " + ext);
//                    ex.result.lastResult().moreMessages(e.getMessage());
//                    ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
//                    throw(ex);
//                }
//
//                int lastDot = ext.lastIndexOf(".");
//                String className = ext.substring(lastDot + 1);
//                
//                if (extensions.get(className) == null){
//                	SchemaExtensionIF extInstance = null;
//                	// We don't have the extension yet, try to instantiate it
//                    try{
//                    	extInstance = (SchemaExtensionIF) extclass.newInstance();
//                    }
//                    catch(Exception e){
//                    	ResultException ex = new ResultException();
//                    	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + ext);
//                    	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
//                    	ex.result.lastResult().moreMessages("Or it may be that the class doesn't implement the SchemaExtensionIF interface.");
//                    	throw(ex);
//                    }
//
//                    extensions.put(className, extInstance);
//                    extInstance.setManager(this);
//                }
//                
//            	for(SchemaExtensionIF currext : extensions.values()){
//            		currext.schemaBeingLoaded(sd);
//            	}
//
//    		}
//    	}
//    }

    /**
     * This function integrates a new set of definitions into the schema manager.
     * @param sd The schema definition to be managed.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public void manageSchema(SchemaDefinition sd) throws ResultException, DmcValueException {
    	
    	if (sd.generatedSchema)
    		performIDChecks = false;
    	else
    		performIDChecks = true;
    	
    	if (sd.isGeneratedSchema()){
    		// This method will automatically instantiate/load any schemas on which the
    		// specified schema depends.
    		loadGeneratedSchema(sd);
    	}
    	else{
    		manageSchemaInternal(sd);
    	}
    	
    }
    
    public void manageSchemaInternal(SchemaDefinition sd, boolean checkIDs) throws ResultException, DmcValueException {
    	performIDChecks = checkIDs;
    	manageSchemaInternal(sd);
    }
    	/**
     * This function integrates a new set of definitions into the schema manager.
     * @param sd The schema definition to be managed.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public void manageSchemaInternal(SchemaDefinition sd) throws ResultException, DmcValueException {
        ClassDefinition         		cd  		= null;
        EnumDefinition     				evd 		= null;
        TypeDefinition          		td  		= null;
        AttributeDefinition     		ad  		= null;
        ActionDefinition        		actd		= null;
        ComplexTypeDefinition        	ctd			= null;
        ExtendedReferenceTypeDefinition exrtd		= null;
        SliceDefinition 				slice		= null;
        RuleCategory 					category	= null;
        RuleDefinition 					rule		= null;
        
        Iterator<ActionDefinition>					itACD  		= null;
        Iterator<AttributeDefinition>				itATD  		= null;
        Iterator<ClassDefinition>					itCD  		= null;
        Iterator<EnumDefinition>					itEVD  		= null;
        Iterator<TypeDefinition>					itTD  		= null;
        Iterator<ComplexTypeDefinition>				cTD  		= null;
        Iterator<ExtendedReferenceTypeDefinition>	exrTD  		= null;
        Iterator<SliceDefinition>					sliceIT		= null;
        Iterator<RuleCategory>						categoryIT	= null;
        Iterator<RuleDefinition>					ruleIT		= null;

        currentSchema       = sd;
        // schemaDefs.put(sd.getName(),sd);

//System.out.println("The schema object:\n\n" + sd.toOIF(20) + "\n\n");

        if ( (itTD = sd.getTypeDefList()) != null){
            while(itTD.hasNext()){
                td = itTD.next();
                this.addType(td);
            }
        }

        if ( (cTD = sd.getComplexTypeDefList()) != null){
            while(cTD.hasNext()){
                ctd = cTD.next();
                this.addComplexType(ctd);
            }
        }

        if ( (exrTD = sd.getExtendedReferenceTypeDefList()) != null){
            while(exrTD.hasNext()){
                exrtd = exrTD.next();
                this.addExtendedReferenceType(exrtd);
            }
        }
        
        if ( (itEVD = sd.getEnumDefList()) != null){
            while(itEVD.hasNext()){
                evd = itEVD.next();
                this.addEnum(evd);
            }
        }

        if ( (itATD = sd.getAttributeDefList()) != null){
            while(itATD.hasNext()){
                ad = itATD.next();
                this.addAttribute(ad);
            }
        }

        if ( (itACD = sd.getActionDefList()) != null){
            while(itACD.hasNext()){
                actd = itACD.next();
                this.addAction(actd);
            }
        }

        if ( (itCD = sd.getClassDefList()) != null){
            while(itCD.hasNext()){
                cd = itCD.next();
                this.addClass(cd);
            }
        }
        
        if ( (sliceIT = sd.getSliceDefList()) != null){
            while(sliceIT.hasNext()){
                slice = sliceIT.next();
                this.addSlice(slice);
            }
        }
        
        if ( (categoryIT = sd.getRuleCategoryList()) != null){
            while(categoryIT.hasNext()){
                category = categoryIT.next();
                this.addRuleCategory(category);
            }
        }
        
        if ( (ruleIT = sd.getRuleDefinitionList()) != null){
            while(ruleIT.hasNext()){
                rule = ruleIT.next();
                this.addRuleDefinition(rule);
            }
        }
        
        this.addSchema(sd);
        

    }

    /**
     * Resolves references between schemas.
     */
    public boolean resolveSchemaRefs(ResultSet rs){
    	// TODO The whole issue of unresolved references is up in the air.
    	
    	
//        // Iterator it = schemaDefs.values().iterator();
//        Iterator<DmsDefinition> it = allDefs.values().iterator();
//
//  //System.out.println("SchemaManager.resolveRefs() ==>");
//        while(it.hasNext()){
//            // SchemaDefinition sd = (SchemaDefinition)it.next();
//            GenericObject sd = (GenericObject)it.next();
//            // Resolve references to other schemas
//  //System.out.println("Resolving refs for: " + sd.getName());
//            if (!sd.resolveReferences(rs,this,"Unknown object: ")){
//  System.out.println("ERROR:\n " + rs);
//                return(false);
//            }
//
//            // We also do something tricky here. If we've loaded schemas from
//            // file, we make it so that we can instantiate the enums by ensuring
//            // that their genattrclass member is set. This was added to allow
//            // documentation generation that involved dynamically loaded rules
//            // that contained enum values.
//            if (sd instanceof TypeDefinition){
//                TypeDefinition td = (TypeDefinition)sd;
//                if (td.genattrclass == null){
//                    if (!td.initEnumClassAndValues(rs))
//                        return(false);
//                }
//            }
//        }
//
//        // More interesting bits! We have the concept of being able to extend
//        // the actions available on a class using the efAttachToClass member
//        // of the efActionDef. We now cycle through all actions to see if any
//        // of them need to be "attached" to classes from other schemas.
//        Iterator<ActionDefinition> actit = actionDefs.values().iterator();
//
//        while(actit.hasNext()){
//            Iterator<ClassDefinitionRefValue> attachIT;
//            ActionDefinition ad = actit.next();
//
//            if ( (attachIT = ad.getAttachToClass()) != null){
//                while(attachIT.hasNext()){
//                    ClassDefinition cd = attachIT.next().getRef();
//                    if (!cd.attachAction(rs,ad))
//                        return(false);
//                }
//            }
//        }
//
//  //System.out.println("SchemaManager.resolveRefs() <==");
        return(true);
    }

    /**
     * Returns an iterator over the schemas sorted by their name.
     */
    public Iterator<SchemaDefinition> getSchemas(){
        return(schemaDefs.values().iterator());
    }

    /**
     * This function indicates if the specified string the name of a TypeDefinition.
     * @param name the name of a suspected type definition.
     * @return If the name is a type, its TypeDefinition is returned; otherwise null is returned.
     */
    public TypeDefinition isType(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return((TypeDefinition)typeDefs.get(nameKey));
    }

    /**
     * This function indicates if the specified string the name of an AttributeDefinition.
     * @param name the name of a suspected attribute definition.
     * @return If the name is an attribute, its AttributeDefinition is returned; otherwise null is returned.
     */
    public AttributeDefinition isAttribute(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return((AttributeDefinition)attrDefs.get(nameKey));
    }
    
    public EnumDefinition isEnum(String name){
    	StringName nameKey = new StringName(name);
    	return(enumDefs.get(nameKey));
    }
    
    /**
     * Returns the attribute definition associated with the specified identifier.
     * @param id The identifier of the attribute.
     * @return The attribute definition.
     */
    public AttributeDefinition isAttribute(Integer id){
    	return(attrByID.get(id));
    }

    /**
     * Returns the class definition associated with the specified identifier.
     * @param id The identifier of the class.
     * @return The class definition.
     */
    public ClassDefinition isClass(Integer id){
    	return(classesByID.get(id));
    }

    /**
     * This function indicates if the specified string the name of an ActionDefinition.
     * @param name the name of a suspected action definition.
     * @return If the name is an action, its ActionDefinition is returned; otherwise null is returned.
     */
    public ActionDefinition isAction(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return((ActionDefinition)actionDefs.get(nameKey));
    }

    /**
     * This function indicates if the specified string the name of a ClassDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a class, its ClassDefinition is returned; otherwise null is returned.
     */
    public ClassDefinition isClass(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return((ClassDefinition)classDefs.get(nameKey));
    }

    /**
     * This function indicates if the specified string the name of a SchemaDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a schema, its SchemaDefinition is returned; otherwise null is returned.
     */
    public SchemaDefinition isSchema(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return((SchemaDefinition)schemaDefs.get(nameKey));
    }

    /**
     * This function indicates if the specified string the name of any class,
     * attribute or type definition.
     * @param name the name of a suspected definition.
     * @return If the name is that of any kind of definition, the definition is
     * returned as a generic object; otherwise null is returned.
     */
    public DmsDefinition isDefinition(String name){
    	StringName nameKey = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
        return(allDefs.get(nameKey));
    }

    /**
     * Adds the specified schema definition if it doesn't already exist.
     * @throws DmcValueException 
     */
    void addSchema(SchemaDefinition sd) throws ResultException, DmcValueException {
        currentSchema = sd;

        if (checkAndAdd(sd.getObjectName(),sd,schemaDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(sd.getObjectName(),sd,schemaDefs,"schema names"));
            currentSchema = null;
        	throw(ex);
        }
        if (checkAndAdd(sd.getObjectName(),sd,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(sd.getObjectName(),sd,allDefs,"definition names"));
            currentSchema = null;
        	throw(ex);
        }

        if (sd.getObjectName().getNameString().length() > longestSchemaName)
            longestSchemaName = sd.getObjectName().getNameString().length();

        currentSchema = null;
        
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addSchema(sd);
        	}
        }

    }
    

    /**
     * Adds the specified slice definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addComplexType(ComplexTypeDefinition ctd) throws ResultException, DmcValueException {
        if (checkAndAdd(ctd.getObjectName(),ctd,complexTypeDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ctd.getObjectName(),ctd,complexTypeDefs,"complex type names"));
        	throw(ex);
        }
        
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setName(ctd.getName());
        td.setDescription("This is an internally generated type to represent complex type " + ctd.getName() + " values.");
        td.setIsEnumType(false);
        td.setIsRefType(false);
        
        td.setTypeClassName(ctd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + ctd.getName());
        td.setPrimitiveType(ctd.getDefinedIn().getSchemaPackage() + ".generated.types." + ctd.getName());
        td.setDefinedIn(ctd.getDefinedIn());
                
//        td.setDmwIteratorClass(cd.getDmwIteratorClass());
//        td.setDmwIteratorImport(cd.getDmwIteratorImport());
                
        // We add the new type to the schema's list of internally generated types
        ctd.getDefinedIn().addInternalTypeDefList(td);
//        ctd.getDefinedIn().addTypeDefList(td);
        
        internalTypeDefs.put(td.getName(), td);
        
        // And then we add the type if it's not already there - this can happen when
        // we're managing a generated schema and the type definition has already been added
        // from the typedefList attribute
        if (typeDefs.get(td.getName()) == null)
        	addType(td);
    }

    /**
     * Adds the specified slice definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addExtendedReferenceType(ExtendedReferenceTypeDefinition ertd) throws ResultException, DmcValueException {
        if (checkAndAdd(ertd.getObjectName(),ertd,extendedReferenceTypeDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ertd.getObjectName(),ertd,extendedReferenceTypeDefs,"extended reference type names"));
        	throw(ex);
        }
        
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setIsExtendedRefType(true);
        td.setName(ertd.getName());
        td.setDescription("This is an internally generated type to represent extendedreference type " + ertd.getName() + " values.");
        td.setIsEnumType(false);
        td.setIsRefType(true);
        
        td.setTypeClassName(ertd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + ertd.getName());
        td.setPrimitiveType(ertd.getDefinedIn().getSchemaPackage() + ".generated.types." + ertd.getName());
        td.setDefinedIn(ertd.getDefinedIn());
                
//        td.setDmwIteratorClass(cd.getDmwIteratorClass());
//        td.setDmwIteratorImport(cd.getDmwIteratorImport());
                
        // We add the new type to the schema's list of internally generated types
        ertd.getDefinedIn().addInternalTypeDefList(td);
        ertd.getDefinedIn().addTypeDefList(td);
        
        DebugInfo.debug("\n\nAdding EXTENDED REF TYPE: " + td.getName().getNameString() + "  " +  System.identityHashCode(this) +"\n\n");
        
        internalTypeDefs.put(td.getName(), td);
        
        // And then we add the type if it's not already there - this can happen when
        // we're managing a generated schema and the type definition has already been added
        // from the typedefList attribute
        if (typeDefs.get(td.getName()) == null)
        	addType(td);
        
        // We hang on to this so that we can set some further info after the extendedReferenceClass has been resolved
        ertd.setInternalType(td);
    }

    /**
     * Adds the specified slice definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addSlice(SliceDefinition sd) throws ResultException, DmcValueException {
        if (checkAndAdd(sd.getObjectName(),sd,sliceDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(sd.getObjectName(),sd,sliceDefs,"slice names"));
        	throw(ex);
        }
        if (checkAndAdd(sd.getObjectName(),sd,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(sd.getObjectName(),sd,allDefs,"definition names"));
            throw(ex);
        }
    }

    /**
     * Adds the specified rule category definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addRuleCategory(RuleCategory rc) throws ResultException, DmcValueException {
        if (checkAndAdd(rc.getObjectName(),rc,ruleCategoryDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rc.getObjectName(),rc,ruleCategoryDefs,"rule categories"));
        	throw(ex);
        }
        if (checkAndAdd(rc.getObjectName(),rc,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rc.getObjectName(),rc,allDefs,"definition names"));
            throw(ex);
        }
        
        if (performIDChecks){
	        // Bump up the rule category ID by the amount of schemaBaseID
	        int base = rc.getDefinedIn().getSchemaBaseID();
	        int range = rc.getDefinedIn().getSchemaIDRange();
	        int current = rc.getRuleCategoryID();
	        
	        if (current >= range){
	        	ResultException ex = new ResultException("Number of rule categories exceeds schema ID range: " + rc.getName());
	        	throw(ex);        	
	        }
	        
	        rc.setRuleCategoryID(base + current);
        }

        if (ruleCategoriesByID.get(rc.getRuleCategoryID()) != null){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rc.getRuleCategoryID(),rc,ruleCategoriesByID,"ruleCategoryID"));
        	throw(ex);      	
        }
    }

    /**
     * Adds the specified rule definition to the schema if it doesn't already exist.
     * There's some trickiness involved here. The of the RuleDefinition is actually going
     * to be used as the name of the ClassDefinition that we use to represent the data
     * payload for the rule, so the name of the RuleDefinition will be changed to have DEF
     * added to it.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addRuleDefinition(RuleDefinition rd) throws ResultException, DmcValueException {
    	
    	if (rd.getName().getNameString().equals("IntegerRangeRule"))
    		DebugInfo.debug("ADDING RULE");
    	
    	// Again, some trickiness, we have to resolve the rule so that we can access and use the must/may
    	// attributes that are defined for it and add them to the class definition we create
        try {
			rd.resolveReferences(this);
		} catch (DmcValueExceptionSet e) {			
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in RuleDefinition: " + rd.getName());
			
			for(DmcValueException dve : e.getExceptions()){
				ex.moreMessages(dve.getMessage());
			}
			throw(ex);
		}
    	
    	StringName ruleClassName = new StringName(rd.getName().getNameString() + "Data");
    	
        if (checkAndAdd(rd.getObjectName(),rd,ruleDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rd.getObjectName(),rd,ruleDefs,"rule definitions"));
        	throw(ex);
        }
        if (checkAndAdd(rd.getObjectName(),rd,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rd.getObjectName(),rd,allDefs,"definition names"));
            throw(ex);
        }
        
        if (performIDChecks){
	        // Bump up the DMD ID by the amount of schemaBaseID
	        int base = rd.getDefinedIn().getSchemaBaseID();
	        int range = rd.getDefinedIn().getSchemaIDRange();
	        int current = rd.getDmdID();
	        
	        if (current >= range){
	        	ResultException ex = new ResultException("Number of rules exceeds schema ID range: " + rd.getName());
	        	throw(ex);        	
	        }
	        
	        rd.setDmdID(base + current);
        }
        
        ClassDefinition existing = classDefs.get(ruleClassName);
        if (existing != null){
        	// We have the class for this rule, just check that it's auto generated
        	if (existing.getInternallyGenerated()){
        		return;
        	}
        	else{
        		// We have some kind of clash
        	}
        }
        
        // We check that the ID of the rule doesn't clash with the class definitions, since we're
        // going to create a class for this rule with the rule's ID.
        if (classesByID.get(rd.getDmdID()) != null){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rd.getDmdID(),rd,classesByID,"dmdID"));
        	throw(ex);
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        ClassDefinition cd = new ClassDefinition();
        cd.setName(ruleClassName);
        if (rd.getIsExtensible())
        	cd.setClassType(ClassTypeEnum.EXTENSIBLE);
        else
        	cd.setClassType(ClassTypeEnum.STRUCTURAL);
        cd.setDmdID(rd.getDmdID());
        cd.setDerivedFrom(MetaSchemaAG._RuleData);
        cd.setDmdID(rd.getDmdID());
        cd.setInternallyGenerated(true);
        cd.setRuleDefinition(rd);
//        cd.setIsNamedBy(MetaSchemaAG._ruleName);
        cd.addMust(MetaSchemaAG._ruleName);
        cd.addMust(MetaSchemaAG._ruleTitle);
        cd.addMay(MetaSchemaAG._description);
        
        if (rd.getRuleType() == RuleTypeEnum.ATTRIBUTE){
        	cd.addMust(MetaSchemaAG._applyToAttribute);
        	if (rd.getRuleScope() == RuleScopeEnum.PERCLASS)
        		cd.addMay(MetaSchemaAG._applyToClasses);
        }
        else{
            if (rd.getRuleScope() == RuleScopeEnum.PERCLASS)
            	cd.addMust(MetaSchemaAG._applyToClass);
        }
        
        cd.setFile(rd.getFile());
        cd.setLineNumber(rd.getLineNumber());
        cd.setDefinedIn(rd.getDefinedIn());
        
        for(AttributeDefinition ad: rd.getMay()){
        	cd.addMay(ad);
        }
        
        for(AttributeDefinition ad: rd.getMust()){
        	cd.addMust(ad);
        }
        
        addClass(cd);
        
        // We add the new class to the schema's list of classes
        rd.getDefinedIn().addClassDefList(cd);
    }

    /**
     * Adds the specified class definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    void addClass(ClassDefinition cd) throws ResultException, DmcValueException {

        if (checkAndAdd(cd.getObjectName(),cd,classDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(cd.getObjectName(),cd,classDefs,"class names"));
        	throw(ex);
        }
        
        if (checkAndAdd(cd.getObjectName(),cd,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(cd.getObjectName(),cd,allDefs,"definition names"));
        	throw(ex);
        }
        
        if (cd.getAbbrev() != null){
            // We have an abbreviation - so it must also be unique and
            // added to the appropriate maps
        	StringName abbrevName = new StringName(cd.getAbbrev());
            if (checkAndAdd(abbrevName,cd,classDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(abbrevName,cd,classDefs,"class abbreviations"));
            	throw(ex);
            }
            if (checkAndAdd(abbrevName,cd,allDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(abbrevName,cd,allDefs,"definition names"));
            	throw(ex);
            }
            classAbbrevs.put(abbrevName,cd);
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        if (cd.getDmdID() == null){
        	ResultException ex = new ResultException("Missing dmdID for class: " + cd.getName());
        	ex.setLocationInfo(cd.getFile(), cd.getLineNumber());
        	throw(ex);
        }

        if (cd.getDefinedIn() == null){
        	ResultException ex = new ResultException("definedIn missing for class: " + cd.getName());
        	ex.setLocationInfo(cd.getFile(), cd.getLineNumber());
        	throw(ex);
        }
        else{
        	if (performIDChecks){
	        	if ( (cd.getDefinedIn().getSchemaBaseID()  == null) ||
	        		 (cd.getDefinedIn().getSchemaIDRange() == null) ){
	            	ResultException ex = new ResultException("schemaBaseID or schemaIDRange missing for schema: " + cd.getDefinedIn().getName());
	            	throw(ex);
	        	}
        	}
        	
        }
        
        if (performIDChecks){
	        // Bump up the DMD ID by the amount of schemaBaseID
	        int base = cd.getDefinedIn().getSchemaBaseID();
	        int range = cd.getDefinedIn().getSchemaIDRange();
	        int current = cd.getDmdID();
	        
	        if (current >= range){
	        	ResultException ex = new ResultException("Number of classes exceeds schema ID range: " + cd.getName());
	        	throw(ex);        	
	        }
	        
	        cd.setDmdID(base + current);
        }
        
        if (classesByID.get(cd.getDmdID()) != null){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(cd.getDmdID(),cd,classesByID,"dmdID"));
        	throw(ex);
        }
        classesByID.put(cd.getDmdID(), cd);
        
        ///////////////////////////////////////////////////////////////////////

        if (cd.getObjectName().getNameString().length() > longestClassName)
            longestClassName = cd.getObjectName().getNameString().length();

        // Another bit of trickiness here. We don't resolve references for the entire schema
        // until we've loaded the whole thing, but, in this case, we need to pre-resolve
        // the ClassDefinition - which should be okay, because classes are the last things
        // that're loaded.
        try {
			cd.resolveReferences(this);
		} catch (DmcValueExceptionSet e) {			
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in ClassDefinition: " + cd.getName());
//			ex.setLocationInfo(cd.getFile(), cd.getLineNumber());
			
			for(DmcValueException dve : e.getExceptions()){
				ex.moreMessages(dve.getMessage());
			}
			throw(ex);
		}
        
        if (cd.getDerivedFrom() != null){
            cd.getDerivedFrom().updateDerived(cd);
        }
        
        cd.setDmoImport(cd.getDefinedIn().getSchemaPackage() + ".generated.dmo." + cd.getName() + "DMO");
        cd.setDmoClass(cd.getName() + "DMO");
        
        cd.setDmwImport(cd.getDefinedIn().getDmwPackage() + ".generated.dmw." + cd.getName() + "DMW");
        cd.setDmwClass(cd.getName() + "DMW");
        
        cd.setDmwIteratorImport(cd.getDefinedIn().getDmwPackage() + ".generated.dmw." + cd.getName() + "IterableDMW");
        cd.setDmwIteratorClass(cd.getName() + "IterableDMW");
        
        cd.setDmtImport(cd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + cd.getName() + "REF");
        cd.setDmtREFImport(cd.getDefinedIn().getSchemaPackage() + ".generated.types." + cd.getName() + "REF");
        cd.setDmtClass(cd.getName() + "REF");
        
        if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
        	if (cd.getSubpackage() == null)
            	cd.setDmeImport(cd.getDefinedIn().getDmwPackage() + ".extended." + cd.getName());        		
        	else
            	cd.setDmeImport(cd.getDefinedIn().getDmwPackage() + ".extended." + cd.getSubpackage() + "." + cd.getName());
            cd.setDmeClass(cd.getName());
        }
        else{
            cd.setDmeImport("THE WRAPPER FOR " + cd.getName() + " ISN'T EXTENDED - YOU'VE GOT A CODE GENERATION ERROR! DWEEB!");        		
            cd.setDmeClass("THE WRAPPER FOR " + cd.getName() + " ISN'T EXTENDED - YOU'VE GOT A CODE GENERATION ERROR! DWEEB!");
        }
        
        if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
        	cd.setDmoAuxClass(cd.getName() + "DMO");
        	cd.setDmoAuxClassImport(cd.getDefinedIn().getSchemaPackage() + ".generated.auxw." + cd.getName() + "DMO");
        	
        	if (cd.getDefinedIn().getDmwPackage() != null){
            	cd.setDmwAuxClass(cd.getName());
            	cd.setDmwAuxClassImport(cd.getDefinedIn().getDmwPackage() + ".generated.auxw." + cd.getName());
        	}
        }
        
//        cd.updateImplemented();

        // And now, set the java class that will be used with the DmwObjectFactory
        if (cd.getJavaClass() == null){
        	if (cd.getUseWrapperType() == WrapperTypeEnum.BASE)
        		cd.setJavaClass(cd.getDmwImport());
        	else if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
//        		DebugInfo.debug("    --- JAVA CLASS  " + cd.getDmeImport());
        		cd.setJavaClass(cd.getDmeImport());
        	}
        }
        
        Iterator<AttributeDefinition> adit = null;
        if ( (adit = cd.getMay()) != null){
            while(adit.hasNext()){
                AttributeDefinition ad = adit.next();
                ad.addUsingClass(cd);
            }
        }

        if ( (adit = cd.getMust()) != null){
            while(adit.hasNext()){
                AttributeDefinition ad = adit.next();
                ad.addUsingClass(cd);
            }
        }
        

//        Iterator<ClassDefinition> cdit = null;
//        if ( (cdit = cd.getAllowedParents()) != null){
//            while(cdit.hasNext()){
//                ClassDefinition p = cdit.next();
//                p.updateAllowedSubcomps(cd);
//            }
//        }
//
//        if ( (cdit = cd.getAllowedChildren()) != null){
//            while(cdit.hasNext()){
//                ClassDefinition c = cdit.next();
//                cd.updateAllowedSubcomps(c);
//            }
//        }

        Iterator<ActionDefinition> acdit = null;
        if ( (acdit = cd.getActions()) != null){
            while(acdit.hasNext()){
                ActionDefinition ad = acdit.next();
                ad.addUsingClass(cd);
            }
        }
        
    	////////////////////////////////////////////////////////////////////////////////
    	// CREATE INTERNAL TYPE FOR REFERENCES
        
        if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
	        // Things get a little tricky here - we want to be able to refer to objects without
	        // having to manually define wrapper types for them, so we create internal TypeDefinitions
	        // for them. The internal type is DmcType<classname>REF.
	        
	        TypeDefinition td  = new TypeDefinition();
//	        td.addObjectClass(MetaSchemaAG._TypeDefinition);
	        
	        td.setInternallyGenerated(true);
	        td.setName(cd.getName());
	        td.setDescription("This is an internally generated type to allow references to " + cd.getName() + " values.");
	        td.setIsEnumType(false);
	        td.setIsRefType(true);
	        
	        if (cd.getIsNamedBy() != null){
	        	// We only need a help class when we have named objects - regular old object references
	        	// can get by without this
	        	td.setHelperClassName(cd.getDefinedIn().getSchemaPackage() + ".generated.types." + cd.getName() + "REF");
	        	
	        	if (cd.getIsNamedBy().getValueType() != ValueTypeEnum.SINGLE){
	        		ResultException ex = new ResultException();
	        		ex.addError("The naming attribute: " + cd.getIsNamedBy().getName() + " for class: " + cd.getName() + " must be valueType SINGLE");
	        		ex.result.lastResult().fileName(cd.getIsNamedBy().getFile());
	        		ex.result.lastResult().lineNumber(cd.getIsNamedBy().getLineNumber());
	        		throw(ex);
	        	}
	        }
	        
	        td.setTypeClassName(cd.getDmtImport());
	        td.setPrimitiveType(cd.getDmoImport());
	        td.setDefinedIn(cd.getDefinedIn());
	        
	        if (cd.getJavaClass() != null){
	        	// Tricky stuff needed for code generation. If the ClassDefinition has a javaClass specified,
	        	// it means that the object is wrapped and we need this javaClass to know what the auxHolder
	        	// type should be in the generated wrapper class.
	        	
//	        	DebugInfo.debug("    >>> AUX HOLDER  " + cd.getJavaClass());
	        	td.setAuxHolderImport(cd.getJavaClass());
	        }
	        
	        td.setDmwIteratorClass(cd.getDmwIteratorClass());
	        td.setDmwIteratorImport(cd.getDmwIteratorImport());
	        
	        // Set a reference to the original class so that we can get any of its info
	        // if required.
	        td.setOriginalClass(cd);

	        // Set the class's internally generated type so that we can resolve references
	        // to the class used as a type
	        cd.setInternalTypeRef(td);
	        
	        // We add the new type to the schema's list of internally generated types
	        cd.getDefinedIn().addInternalTypeDefList(td);
	        
	        internalTypeDefs.put(td.getName(), td);
        }

        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addClass(cd);
        	}
        }

    }

    /**
     * Adds the specified attribute definition to the schema it doesn't already exist.
     * @throws DmcValueException 
     */
    void addAttribute(AttributeDefinition ad) throws ResultException, DmcValueException {
    	
        if (checkAndAdd(ad.getObjectName(),ad,attrDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ad.getObjectName(),ad,attrDefs,"attribute names"));
        	throw(ex);
        }
        if (checkAndAdd(ad.getObjectName(),ad,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ad.getObjectName(),ad,allDefs,"definition names"));
        	throw(ex);
        }
        
        if (ad.getDmdID() == null){
        	ResultException ex = new ResultException("Missing dmdID for attribute: " + ad.getName());
        	throw(ex);
        }
        
        if (ad.getDefinedIn() == null){
        	ResultException ex = new ResultException("definedIn missing for attribute: " + ad.getName());
        	throw(ex);
        }
        else{
        	if (performIDChecks){
	        	if ( (ad.getDefinedIn().getSchemaBaseID()  == null) ||
	        		 (ad.getDefinedIn().getSchemaIDRange() == null) ){
	            	ResultException ex = new ResultException("schemaBaseID or schemaIDRange missing for schema: " + ad.getDefinedIn().getName());
	            	throw(ex);
	        	}
        	}
        	
        }
        
        if (performIDChecks){
	        // Bump up the DMD ID by the amount of schemaBaseID
	        int base = ad.getDefinedIn().getSchemaBaseID();
	        int range = ad.getDefinedIn().getSchemaIDRange();
	        int current = ad.getDmdID();
	        
	        if (current >= range){
	        	ResultException ex = new ResultException("Number of attributes exceeds schema ID range: " + ad.getName());
	        	throw(ex);        	
	        }
	        
	        ad.setDmdID(base + current);
        }
        
    	if (attrByID.get(ad.getDmdID()) != null){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ad.getDmdID(),ad,attrByID,"dmdID"));
        	throw(ex);
        }
        attrByID.put(ad.getDmdID(), ad);
        
        if (ad.getAbbrev() != null){
            // We have an abbreviation - so it must also be unique and
            // added to the appropriate maps
        	StringName abbrevName = new StringName(ad.getAbbrev());
            if (checkAndAdd(abbrevName,ad,attrDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(ad.getObjectName(),ad,attrDefs,"attribute abbreviation"));
            	throw(ex);
            }
            if (checkAndAdd(abbrevName,ad,allDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(ad.getObjectName(),ad,allDefs,"definition names"));
            	throw(ex);
            }
            attrAbbrevs.put(abbrevName,ad);
        }
        
// reposName moved to the DMR SCHEMA
//        if (ad.getReposName() != null){
//            // We have a repository name - so it must also be unique and
//            // added to the appropriate maps
//            if (checkAndAdd(ad.getReposName(),ad,attrDefs) == false){
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsg(ad.getObjectName(),ad,attrDefs,"repository names"));
//            	throw(ex);
//            }
//            if (checkAndAdd(ad.getReposName(),ad,allDefs) == false){
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsg(ad.getObjectName(),ad,allDefs,"definition names"));
//            	throw(ex);
//            }
//            reposNames.put(ad.getReposName(),ad);
//        }

        if (ad.getObjectName().getNameString().length() > longestAttrName)
            longestAttrName = ad.getObjectName().getNameString().length();
        
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addAttribute(ad);
        	}
        }
        
    }

    /**
     * Adds the specified attribute definition to the schema it doesn't already exist.
     * @throws DmcValueException 
     */
    void addType(TypeDefinition td) throws ResultException, DmcValueException {
    	
//    	if (td.getObjectName().getNameString().equals("SomeRelation")){
//    		DebugInfo.debug("HERE " + System.identityHashCode(this));
//    	}
    	
    	DebugInfo.debugWithTrace("addType() - " + td.getObjectName());
    	
        if (checkAndAdd(td.getObjectName(),td,typeDefs) == false){
        	ResultException ex = new ResultException();
            ex.addError(clashMsg(td.getObjectName(),td,typeDefs,"type names"));
            throw(ex);
        }
        if (checkAndAdd(td.getObjectName(),td,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(td.getObjectName(),td,allDefs,"definition names"));
            throw(ex);
        }

        if (td.getObjectName().getNameString().length() > longestTypeName)
            longestTypeName = td.getObjectName().getNameString().length();
     
        SchemaDefinition sd = td.getDefinedIn();
        if (sd != null){
        	if (sd.getDmwPackage() != null){
        		td.setDmwIteratorClass(td.getName().getNameString() + "IterableDMW");
        		td.setDmwIteratorImport(sd.getDmwPackage() + ".generated.dmw." + td.getDmwIteratorClass());
        	}
        }
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addType(td);
        	}
        }
    }
    
    /**
     * Attempts to add the specified definition. If the definition clashes with
     * any existing definition, we throw an exception.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public void addDefinition(DmsDefinition def) throws ResultException, DmcValueException {
    	
    	if (def instanceof AttributeDefinition)
    		this.addAttribute((AttributeDefinition) def);
    	else if (def instanceof ClassDefinition)
    		this.addClass((ClassDefinition) def);
    	else if (def instanceof ActionDefinition)
    		this.addAction((ActionDefinition) def);
    	else if (def instanceof TypeDefinition)
    		this.addType((TypeDefinition) def);
    	else if (def instanceof EnumDefinition)
    		this.addEnum((EnumDefinition) def);
    	else if (def instanceof SliceDefinition)
    		this.addSlice((SliceDefinition) def);
    	else if (def instanceof RuleCategory)
    		this.addRuleCategory((RuleCategory) def);
    	else if (def instanceof RuleDefinition)
    		this.addRuleDefinition((RuleDefinition) def);
    	// Note: test for extended ref before conplex type because it is derived from complex type
    	else if (def instanceof ExtendedReferenceTypeDefinition)
    		this.addExtendedReferenceType((ExtendedReferenceTypeDefinition) def);
    	else if (def instanceof ComplexTypeDefinition)
    		this.addComplexType((ComplexTypeDefinition) def);
    	else if (def instanceof SchemaDefinition)
    		this.addSchema((SchemaDefinition) def);
        else{
        	ResultException ex = new ResultException();
        	ex.addError("The specified object is not a DmsDefinition object: \n" + def.toOIF());
        	throw(ex);
        }

    }

    /**
     * Attempts to add the specified rule data. The rule data name must be globally unique.
     * @param rule
     */
    public void addRuleData(RuleData rule) throws ResultException {
    	RuleData existing = ruleData.get(rule.getObjectName());
    	
    	if (existing == null){
    		ruleData.put(rule.getObjectName(), rule);
    	}
    	else{
    		ResultException ex = new ResultException();
    		ex.addError("The following rules have a name clash:\n\n" + existing.toOIF() + "\n" + rule.toOIF());
    		throw(ex);
    	}
    }
    
    /**
     * This generic method checks that the name of the existing definition type doesn't
     * already exist in the specified map or in the allDefs map. If so, the
     * definition is added to the map and to the allDefs map, if not, an exception is thrown.
     * @param def     A definition to be added.
     * @param defmap  The map containing these types of definitions.
     * @param mapName The string to use in error messages to describe the type of definition
     * @param longest The length of the longest name of this type yet found.
     * being added e.g. "types names".
     * @throws ResultException
     */
//    void addDefinition(DmsDefinition def, HashMap<String,? extends DmsDefinition> defmap, String mapName, IntegerVar longest) throws ResultException {
//        if (checkAndAdd(def.getObjectName(),def,defmap) == false){
//        	ResultException ex = new ResultException();
//            ex.addError(clashMsg(def.getObjectName(),def,defmap,mapName));
//            throw(ex);
//        }
//        if (checkAndAdd(def.getObjectName(),def,allDefs) == false){
//        	ResultException ex = new ResultException();
//        	ex.addError(clashMsg(def.getObjectName(),def,allDefs,"definition names"));
//            throw(ex);
//        }
//
//        if (def.getObjectName().length() > longest.intValue())
//            longest.set(def.getObjectName().length());
//    
//    }

    /**
     * Adds the specified attribute definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     */
    boolean addEnum(EnumDefinition evd)  throws ResultException, DmcValueException {
        if (checkAndAdd(evd.getObjectName(),evd,enumDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(evd.getObjectName(),evd,enumDefs,"enum value names"));
            throw(ex);
        }
        
        DebugInfo.debug(evd.getName().toString());
        
//        if (evd.getDefinedIn() == MetaSchemaAG._metaSchema){
//        	
//        }
//        else{
            // Things get a little tricky here - although EnumDefinitions are enums, they get
            // turned into internally generated TypeDefinitions, so we don't add them to the
            // allDefs map as EnumDefinitions.
	        TypeDefinition td  = new TypeDefinition();
	        td.setInternallyGenerated(true);
	        td.setName(evd.getName());
	        td.setEnumName(evd.getName().getNameString());
	        td.setDescription("This is an internally generated type to allow references to " + evd.getName() + " values.");
	        td.setIsEnumType(true);
	        td.setTypeClassName(evd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + evd.getName());
	        td.setPrimitiveType(evd.getDefinedIn().getSchemaPackage() + ".generated.enums." + evd.getName());
	//        td.addObjectClass(MetaSchemaAG._TypeDefinition);
	        td.setDefinedIn(evd.getDefinedIn());
	        
	        internalTypeDefs.put(td.getName(), td);
	        
	        // We add the new type to the schema's list of internally generated types
	        evd.getDefinedIn().addInternalTypeDefList(td);
        
// Example
//        _ClassTypeEnumReference      .addObjectClass(_TypeDefinition);
//        _ClassTypeEnumReference      .setDescription("This is an internally generated type to allow references to ClassTypeEnum objects.");
//        _ClassTypeEnumReference      .setInternallyGenerated("true");
//        _ClassTypeEnumReference      .setIsEnumType("true");
//        _ClassTypeEnumReference      .setName("ClassTypeEnumReference");
//        _ClassTypeEnumReference      .setTypeClassName("org.dmd.dms.generated.types.DmcTypeClassTypeEnum");
//        _ClassTypeEnumReference      .setDefinedIn(this);

//        if (checkAndAdd(evd.getObjectName(),evd,allDefs) == false){
//        	ResultException ex = new ResultException();
//        	ex.addError(clashMsg(evd.getObjectName(),evd,allDefs,"definition names"));
//            throw(ex);
//        }
        
	        // Add the type
	        addType(td);
//        }

        if (evd.getObjectName().getNameString().length() > longestEnumName)
            longestActionName = evd.getObjectName().getNameString().length();
        
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addEnum(evd);
        	}
        }


        return(true);
    }

    /**
     * Adds the specified action definition to the schema it doesn't already exist.
     * @throws DmcValueException 
     */
    void addAction(ActionDefinition actd) throws ResultException, DmcValueException {
    	
    	// We have to resolve the action at this point because we iterate over 
    	// references that it contains. This should be okay because the attributes
    	// should have been loaded first
    	try {
			actd.resolveReferences(this);
		} catch (DmcValueExceptionSet e) {
			e.printStackTrace();
		}
    	
        if (checkAndAdd(actd.getObjectName(),actd,actionDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(actd.getObjectName(),actd,actionDefs,"action names"));
            throw(ex);
        }
        if (checkAndAdd(actd.getObjectName(),actd,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(actd.getObjectName(),actd,allDefs,"definition names"));
            throw(ex);
        }

        if (actd.getObjectName().getNameString().length() > longestActionName)
            longestActionName = actd.getObjectName().getNameString().length();

        Iterator<AttributeDefinition> it = null;
        if ( (it = actd.getMayParm()) != null){
            while(it.hasNext()){
                AttributeDefinition ad = it.next();
                ad.addUsingAction(actd);
            }
        }

        if ( (it = actd.getMustParm()) != null){
            while(it.hasNext()){
                AttributeDefinition ad = it.next();
                ad.addUsingAction(actd);
            }
        }

        Iterator<ClassDefinition> cdit = null;
        if ( (cdit = actd.getAttachToClass()) != null){
            while(cdit.hasNext()){
                ClassDefinition cd = cdit.next();
                actd.addAttachedToClass(cd);
            }
        }
        
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addAction(actd);
        	}
        }

    }

    /**
     * This function checks to see whether the specified key exists in the hashmap. If not,
     * the key and the obj are added.
     * @param key the key of the object being checked for
     * @param obj the object that may be adde to the map
     * @param map the map that may be updated
     * @returns false if the key already exists and true otherwise
     */
//    private boolean checkAndAdd(Object key, Object obj, HashMap map){
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean checkAndAdd(StringName key, DmsDefinition obj, HashMap map){
        if (map.containsKey(key))
            return(false);
        else
            map.put(key,obj);

        return(true);
    }

    /**
     * This function checks to see whether the specified key exists in the hashmap. If not,
     * the key and the obj are added.
     * @param key the key of the object being checked for
     * @param obj the object that may be adde to the map
     * @param map the map that may be updated
     * @returns false if the key already exists and true otherwise
     */
    @SuppressWarnings("unchecked")
	private boolean checkAndAdd(Object key, Object obj, @SuppressWarnings("rawtypes") TreeMap map){
        if (map.containsKey(key))
            return(false);
        else
            map.put(key,obj);

        return(true);
    }

    /**
     * Dumps the contents of the manager to a string.
     */
    public String toString(){
    	int longest = longestClassName;
//        Iterator<AttributeDefinition> adit = attrDefs.values().iterator();
//        Iterator<ClassDefinition> cdit = classDefs.values().iterator();
//        AttributeDefinition ad  = null;
//        ClassDefinition     cd  = null;
        StringBuffer    sb  = new StringBuffer();
        PrintfFormat	format = null;
        
        if (longestAttrName > longest)
        	longest = longestAttrName;
        
        String	longestStr = "" + longest;
        format = new PrintfFormat("%-" + longestStr + "s ");

        sb.append("*** Attributes\n");
        TreeMap<StringName,AttributeDefinition> sattrs = new TreeMap<StringName, AttributeDefinition>();
        
        for(AttributeDefinition ad : attrDefs.values())
        	sattrs.put(ad.getName(), ad);
        
        for(AttributeDefinition ad : sattrs.values())
            sb.append(format.sprintf(ad.getObjectName()) + ad.getDefinedIn().getName() + "\n");
        

        sb.append("*** Classes\n");
        TreeMap<StringName,ClassDefinition> scdefs = new TreeMap<StringName, ClassDefinition>();
        
        for(ClassDefinition cd : classDefs.values())
        	scdefs.put(cd.getName(), cd);
        
        for(ClassDefinition cd : scdefs.values()){
            sb.append(format.sprintf(cd.getObjectName()));
            if (cd.getAbbrev() != null)
                sb.append(" AB " + cd.getAbbrev());
            sb.append(cd.getDefinedIn().getName() + "\n");
        }
       
        return(new String(sb.toString()));
    }
    
    
	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
    	// HACK HACK HACK
    	// When we added actual support for the __objectClass attribute in DmcObject, we
    	// got into a bit of trouble with the meta schema. We needed to resolve the objectClass,
    	// but we hadn't yet loaded the ClassDefinition for ClassDefinition! We circumvent this
    	// issue here by directly accessing the the meta schema's instantiated ClassDefinition.
    	if (name.getNameString().equals("ClassDefinition")){
    		return(MetaSchema._ClassDefinition);
    	}
//    	else if (name.getNameString().equals("metaSchema")){
        else if (name.getNameString().equals("meta")){
//DebugInfo.debug("META SCHEMA NAME CHANGE!!!!");
    		// And another bit of magic - the class definitions of the metaSchema are
    		// loaded before the schema definition for the meta schema
//    		DebugInfo.debug("METASCHEMA");
    		return(MetaSchema._metaSchema);
    	}

        return((DmcNamedObjectIF)allDefs.get(name));
	}
	

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		if (attributeID == MetaDMSAG.__internalTypeRef.id){
//			DebugInfo.debug("internal type ref: " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)internalTypeDefs.get(name);
			return(def);
		}
		else if (attributeID == MetaDMSAG.__type.id){
//			DebugInfo.debug("type " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)internalTypeDefs.get(name);
			if (def != null)
				return(def);
		}
		else if (attributeID == MetaDMSAG.__internalTypeDefList.id){
//			DebugInfo.debug("internalTypeDefList " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)internalTypeDefs.get(name);
			if (def != null)
				return(def);
		}
		else if (attributeID == MetaDMSAG.__enumDefList.id){
//			DebugInfo.debug("enumDefList " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)enumDefs.get(name);
			if (def != null)
				return(def);
		}
		else if (attributeID == MetaDMSAG.__extendedReferenceTypeDefList.id){
//			DebugInfo.debug("extendedReferenceTypeDefList " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)extendedReferenceTypeDefs.get(name);
			if (def != null)
				return(def);
		}

		else if (attributeID == MetaDMSAG.__complexTypeDefList.id){
//			DebugInfo.debug("complexTypeDefList " + name.getNameString());
			DmcNamedObjectIF def = (DmcNamedObjectIF)complexTypeDefs.get(name);
			if (def != null)
				return(def);
		}

		return(findNamedObject(name));
	}

    
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmsDefinition def = allDefs.get(name);
		if (def == null)
			return(null);
		return(def.getDmcObject());
	}

    /**
     * Returns the definition with the specified name if it exists.
     */
    public DmcNamedObjectIF findNamedObject(String name){
//    	DebugInfo.debug("Looking for: " + name);
    	StringName key = new StringName(name);
//    	try {
//			nameKey.setNameString(name);
//		} catch (DmcValueException e) {
//			e.printStackTrace();
//		}
    	
    	// HACK HACK HACK
    	// When we added actual support for the __objectClass attribute in DmcObject, we
    	// got into a bit of trouble with the meta schema. We needed to resolve the objectClass,
    	// but we hadn't yet loaded the ClassDefinition for ClassDefinition! We circumvent this
    	// issue here by directly accessing the the meta schema's instantiated ClassDefinition.
    	if (name.equals("ClassDefinition")){
    		return(MetaSchema._ClassDefinition);
    	}
    	
        return((DmcNamedObjectIF)allDefs.get(key));
    }

    /**
     * If the global dictionary hasn't been created, it's generated from the
     * hash of all identifiers.
     */
    public Dictionary getDict(){
        if (dict == null){
            Iterator<StringName>    it  = allDefs.keySet().iterator();
            int         id = Token.CUSTOM+1;
            StringName  key = null;

            dict = new Dictionary();
            while(it.hasNext()){
                key = (StringName)it.next();
                dict.add(new Token(key.getNameString(),id++,allDefs.get(key)));
            }
        }
        return(dict);
    }

    /**
     * Returns a nice error message for a clashing definition name.
     */
    String clashMsg(StringName defName, DmsDefinition newDef, HashMap<StringName, ? extends DmsDefinition> defMap, String defType){
        DmsDefinition    existing = defMap.get(defName);
        SchemaDefinition ga1      = existing.getDefinedIn();
        SchemaDefinition ga2      = newDef.getDefinedIn();

        if (ga2 == null)
            return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + currentSchema.getObjectName()));
        else
            return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + ga2.getObjectName()));
    }

    /**
     * Returns a nice error message for a clashing definition name.
     */
    String clashMsg(StringName defName, DmsDefinition newDef, TreeMap<StringName, ? extends DmsDefinition> defMap, String defType){
    	DmsDefinition    existing = defMap.get(defName);
    	SchemaDefinition ga1      = existing.getDefinedIn();
    	SchemaDefinition ga2      = newDef.getDefinedIn();

        if (existing instanceof SchemaDefinition){
            return(new String("Clashing " + defType + ": " + defName));
        }
        else{
            if (ga2 == null)
                return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + currentSchema.getObjectName()));
            else
                return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + ga2.getObjectName()));
        }
    }

    /**
     * Returns a nice error message for a clashing definition identifier.
     */
    String clashMsg(Integer defID, DmsDefinition newDef, TreeMap<Integer, ? extends DmsDefinition> defMap, String defType){
    	DmsDefinition    existing = defMap.get(defID);
    	SchemaDefinition ga1      = existing.getDefinedIn();
    	SchemaDefinition ga2      = newDef.getDefinedIn();
    	
    	DebugInfo.debugWithTrace("clashMsg()");

        if (existing instanceof SchemaDefinition){
            return(new String("Clashing " + defType + ": " + defID));
        }
        else{
            if (ga2 == null)
                return(new String("Clashing " + defType + ": " + defID + " " + newDef.getName() + " - Initially defined in " + ga1.getObjectName() + " existing: " + existing.getName() + " - Redefined in " + currentSchema.getObjectName()));
            else
                return(new String("Clashing " + defType + ": " + defID + " " + newDef.getName() + " - Initially defined in " + ga1.getObjectName() + " existing: " + existing.getName() + " - Redefined in " + ga2.getObjectName()));
        }
    }

    /**
     * Performs a diff between this schema and the one passed as argument. The
     * schema passed in is assumed to be a predecessor of this schema.
     */
    public void diff(SchemaManager predecessor, StringBuffer sb){
        int added   = newSchemas(predecessor,sb);
        int deleted = deletedSchemas(predecessor,sb);

        if ( (added+deleted) == 0)
            sb.append("No schemas were added or deleted");
        sb.append("\n");

        if (newClasses(predecessor,sb) == 0)
            sb.append("No classes were added or deleted");
        sb.append("\n");

        if (newAttributes(predecessor,sb) == 0)
            sb.append("No attributes were added or deleted");
        sb.append("\n");

        if (newTypes(predecessor,sb) == 0)
            sb.append("No types were added or deleted");
        sb.append("\n");



    }

    /**
     * Determines if any new schemas have been added.
     */
    int newSchemas(SchemaManager predecessor, StringBuffer sb){
        Iterator<SchemaDefinition>    it  = schemaDefs.values().iterator();
        int         rc  =   0;

        while(it.hasNext()){
            SchemaDefinition sd = it.next();

            if (predecessor.schemaDefs.get(sd.getObjectName()) == null){
                sb.append("Schema added: " + sd.getObjectName() + "\n");
                rc++;
            }
        }

        return(rc);
    }

    /**
     * Determines if any schemas have been removed.
     */
    int deletedSchemas(SchemaManager predecessor, StringBuffer sb){
        Iterator<SchemaDefinition>    it  = predecessor.schemaDefs.values().iterator();
        int         rc  =   0;

        while(it.hasNext()){
            SchemaDefinition sd = it.next();

            if (schemaDefs.get(sd.getObjectName()) == null){
                sb.append("Schema removed: " + sd.getObjectName() + "\n");
                rc++;
            }
        }

        return(rc);
    }

    /**
     *
     */
    int newClasses(SchemaManager predecessor, StringBuffer sb){
        Iterator<SchemaDefinition>        it  = schemaDefs.values().iterator();
        int             rc  =   0;
        StringBuffer    classDiff   = new StringBuffer();

        while(it.hasNext()){
            SchemaDefinition curr = it.next();
            SchemaDefinition pred = predecessor.schemaDefs.get(curr.getObjectName());

            if (pred != null){
                int changes = curr.classChanges(pred,classDiff);

                if (changes > 0){
                    rc += changes;
                    sb.append("\nClass changes for schema: " + curr.getObjectName() + "\n");
                    sb.append(classDiff.toString());
                    classDiff.setLength(0);
                }
            }
        }

        return(rc);
    }

    /**
     *
     */
    int newAttributes(SchemaManager predecessor, StringBuffer sb){
        Iterator<SchemaDefinition>        it  = schemaDefs.values().iterator();
        int             rc  =   0;
        StringBuffer    attrDiff   = new StringBuffer();

        while(it.hasNext()){
            SchemaDefinition curr = (SchemaDefinition)it.next();
            SchemaDefinition pred = (SchemaDefinition)predecessor.schemaDefs.get(curr.getObjectName());

            if (pred != null){
                int changes = curr.attributeChanges(pred,attrDiff,this);

                if (changes > 0){
                    rc += changes;
                    sb.append("\nAttribute changes for schema: " + curr.getObjectName() + "\n");
                    sb.append(attrDiff.toString());
                    attrDiff.setLength(0);
                }
            }
        }

        return(rc);
    }

    /**
     *
     */
    int newTypes(SchemaManager predecessor, StringBuffer sb){
        Iterator<SchemaDefinition>        it  = schemaDefs.values().iterator();
        int             rc  =   0;
        StringBuffer    typeDiff   = new StringBuffer();

        while(it.hasNext()){
            SchemaDefinition curr = it.next();
            SchemaDefinition pred = predecessor.schemaDefs.get(curr.getObjectName());

            if (pred != null){
                int changes = curr.typeChanges(pred,typeDiff);

                if (changes > 0){
                    rc += changes;
                    sb.append("\nType changes for schema: " + curr.getObjectName() + "\n");
                    sb.append(typeDiff.toString());
                    typeDiff.setLength(0);
                }
            }
        }

        return(rc);
    }

    ////////////////////////////////////////////////////////////////////////////
    // This set of functions is used to provide access to definitions from the
    // schema manager, rather than hard coding static references. This prevents
    // the import dependencies that can made it difficult to move code to
    // different packages or move definitions between schemas.

    /**
     * This function will return the attribute definition associated with the
     * given name.
     */
    public AttributeDefinition adef(String n){
//    	DebugInfo.debug("Looking for attribute: " + n);
        AttributeDefinition rc = isAttribute(n);
        if (rc == null){
//        	DebugInfo.debug("    Couldn't find it\n");
//            MetaSchema.traceLog.error("Attribute definition not found - corresponding schema may not be loaded: " + n);
//            MetaSchema.traceLog.error(DebugInfo.getCurrentStack());
            return(null);
        }
        else{
//        	DebugInfo.debug("    Found it\n");
            return(rc);
        }
    }
    
    /**
     * This function will return the class definition associated with the
     * given name.
     */
    public ClassDefinition cdef(String n){
        ClassDefinition rc = isClass(n);
        if (rc == null){
//            MetaSchema.traceLog.error("Class definition not found - corresponding schema may not be loaded: " + n);
//            MetaSchema.traceLog.error(DebugInfo.getCurrentStack());
            return(null);
        }
        else
            return(rc);
    }

    /**
     * This function will return the type definition associated with the
     * given name.
     */
    public TypeDefinition tdef(String n){
        TypeDefinition rc = isType(n);
        if (rc == null){
//            MetaSchema.traceLog.error("Invalid type definition access: " + n);
//            MetaSchema.traceLog.error(DebugInfo.getCurrentStack());
            return(null);
        }
        else
            return(rc);
    }

    /**
     * This function will return the class definition associated with the
     * given name.
     */
    public ActionDefinition actdef(String n){
        ActionDefinition rc = isAction(n);
        if (rc == null){
//            MetaSchema.traceLog.error("Invalid action definition access: " + n);
//            MetaSchema.traceLog.error(DebugInfo.getCurrentStack());
            return(null);
        }
        else
            return(rc);
    }

    /**
     * This method will ensure that all references in the specified schema can
     * be resolved.
     * @param sd The schema to be resolved.
     * @throws ResultException  
     * @throws DmcValueExceptionSet 
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void resolveReferences(SchemaDefinition sd) throws ResultException {
    	// OK, here's some tricky stuff. Attributes can refer to defined classes
    	// as types e.g. 
    	// AttributeDefinition
    	// name something
    	// type SomeClassName
    	//
    	// Now, if SomeClassName is a valid class, when we try to resolve the references
    	// in the attribute, the resolver code is expecting SomeClassName to be the
    	// name of a TypeDefinition, and it is, but it's an internally generated type.
    	// So, we have to pre-resolve the type references by referring to the internally
    	// generated type of the class.
    	Iterator<AttributeDefinition> preadl = sd.getAttributeDefList();
    	if (preadl != null){
    		while(preadl.hasNext()){
    			AttributeDefinition d = preadl.next();
    			DmcAttribute<?> attr = d.getDmcObject().get("type");
    			
    			if (attr == null){
					ResultException ex = new ResultException();
					ex.addError("The AttributeDefinition " + d.getName() + " has no type attribute.");
					ex.result.lastResult().fileName(d.getFile());
					ex.result.lastResult().lineNumber(d.getLineNumber());
					throw(ex);
    			}
    			
    			DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getSV();
    			
    			// It might be a "real" type, so try that first
    			TypeDefinition td = tdef(ref.getObjectName().getNameString());
    			
    			if( td == null){
    				ClassDefinition cd = cdef(ref.getObjectName().getNameString());
    				if (cd == null){
    					ResultException ex = new ResultException();
    					ex.addError("The type: " + ref.getObjectName() + " referred to in AttributeDefinition " + d.getName() + " is invalid.");
    					ex.result.lastResult().fileName(d.getFile());
    					ex.result.lastResult().lineNumber(d.getLineNumber());
    					throw(ex);
    				}
    				else{
        				ref.setObject((DmcNamedObjectIF) cd.getInternalTypeRef().getDmcObject());
    				}
    			}
    			else{
    				ref.setObject((DmcNamedObjectIF) td.getDmcObject());
    			}
    		}
    	}
    	
    	// And more of the same kind of magic with complex types - we have to
    	// preresolve the type references in the same way as with attributes
    	Iterator<ComplexTypeDefinition> ctdl = sd.getComplexTypeDefList();
    	if (ctdl != null){
    		while(ctdl.hasNext()){
    			ComplexTypeDefinition ctd = ctdl.next();
    			
    			Iterator<Field> fields = ctd.getField();
    			while(fields.hasNext()){
    				Field field = fields.next();
    				DmcNamedObjectREF ref = (DmcNamedObjectREF)field.getType();
    				
        			// It might be a "real" type, so try that first
        			TypeDefinition td = tdef(ref.getObjectName().getNameString());
        			
        			if( td == null){
        				ClassDefinition cd = cdef(ref.getObjectName().getNameString());
        				if (cd == null){
        					ResultException ex = new ResultException();
        					ex.addError("The type: " + ref.getObjectName() + " referred to in ComplexTypeDefinition " + ctd.getName() + " is invalid.");
        					ex.result.lastResult().fileName(ctd.getFile());
        					ex.result.lastResult().lineNumber(ctd.getLineNumber());
        					throw(ex);
        				}
        				else{
            				ref.setObject((DmcNamedObjectIF) cd.getInternalTypeRef().getDmcObject());
        				}
        			}
        			else{
        				ref.setObject((DmcNamedObjectIF) td.getDmcObject());
        			}

    			}
    		}
    	}
    	
    	// And more of the same kind of magic with extended references types - we have to
    	// preresolve the type references in the same way as with attributes
    	Iterator<ExtendedReferenceTypeDefinition> ertdl = sd.getExtendedReferenceTypeDefList();
    	if (ertdl != null){
    		while(ertdl.hasNext()){
    			ExtendedReferenceTypeDefinition ertd = ertdl.next();
    			
    	        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) ertd.getDMO().get(MetaDMSAG.__extendedReferenceClass);
    			if (attr == null){
					ResultException ex = new ResultException();
					ex.addError("Missing extendedReferenceClass for ExtendedReferenceTypeDefinition: " + ertd.getName());
					ex.result.lastResult().fileName(ertd.getFile());
					ex.result.lastResult().lineNumber(ertd.getLineNumber());
					throw(ex);    				
    			}
    			
    			try {
					attr.resolveReferences(this);
				} catch (DmcValueException e) {
					ResultException ex = new ResultException();
					ex.addError("Unknown class referred to by extendedReferenceClass: " + attr.getSV().getObjectName().getNameString());
					ex.result.lastResult().fileName(ertd.getFile());
					ex.result.lastResult().lineNumber(ertd.getLineNumber());
					throw(ex);
				}
				
				try {
					ertd.getInternalType().setOriginalClass(ertd.getExtendedReferenceClass());
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

//				ClassDefinition cd = cdef(attr.getName());
//				if (cd == null){
//					ResultException ex = new ResultException();
//					ex.addError("Missing extendedReferenceClass for ExtendedReferenceTypeDefinition: " + ertd.getName());
//					ex.result.lastResult().fileName(ertd.getFile());
//					ex.result.lastResult().lineNumber(ertd.getLineNumber());
//					throw(ex);
//				}
    			
    			
				if (ertd.getExtendedReferenceClass().getIsNamedBy() == null){
					ResultException ex = new ResultException();
					ex.addError("The class: " + ertd.getExtendedReferenceClass().getObjectName().getNameString() + " referred to in ExtendedReferenceTypeDefinition " + ertd.getName() + " is not a named object.");
					ex.result.lastResult().fileName(ertd.getFile());
					ex.result.lastResult().lineNumber(ertd.getLineNumber());
					throw(ex);
				}

    			Iterator<Field> fields = ertd.getField();
    			while(fields.hasNext()){
    				Field field = fields.next();
    				DmcNamedObjectREF ref = (DmcNamedObjectREF)field.getType();
    				
        			// It might be a "real" type, so try that first
        			TypeDefinition td = tdef(ref.getObjectName().getNameString());
        			
        			if( td == null){
        				ClassDefinition cd = cdef(ref.getObjectName().getNameString());
        				if (cd == null){
        					ResultException ex = new ResultException();
        					ex.addError("The type: " + ref.getObjectName() + " referred to in ExtendedReferenceTypeDefinition " + ertd.getName() + " is invalid.");
        					ex.result.lastResult().fileName(ertd.getFile());
        					ex.result.lastResult().lineNumber(ertd.getLineNumber());
        					throw(ex);
        				}
        				else{
            				ref.setObject((DmcNamedObjectIF) cd.getInternalTypeRef().getDmcObject());
        				}
        			}
        			else{
        				ref.setObject((DmcNamedObjectIF) td.getDmcObject());
        			}
    			}
    		}
    	}
    	
    	Iterator<ActionDefinition> actdl = sd.getActionDefList();
    	if (actdl != null){
    		while(actdl.hasNext()){
    			ActionDefinition d = actdl.next();
    			try {
					d.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in ActionDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
    	Iterator<AttributeDefinition> adl = sd.getAttributeDefList();
    	if (adl != null){
    		while(adl.hasNext()){
    			AttributeDefinition d = adl.next();
    			try {
					d.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in AttributeDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
				
				// TODO move towards generic object validation mechanisms - this check should be a rule
		        if ( (d.getValueType() == ValueTypeEnum.HASHMAPPED) || (d.getValueType() == ValueTypeEnum.TREEMAPPED)){
		        	if (d.getType().getKeyClass() == null){
		        		if (d.getType().getIsRefType()){
		        			if (d.getType().getIsExtendedRefType()){
								ResultException ex = new ResultException();
								ex.addError("AttributeDefinition: " + d.getName() + " cannot have valueType HASHMAPPED/TREEMAPPED since extended reference types are not keyed.");
								ex.setLocationInfo(d.getFile(), d.getLineNumber());
				        		throw(ex);
		        			}
		        			if (d.getType().getOriginalClass().getIsNamedBy() == null){
								ResultException ex = new ResultException();
								ex.addError("AttributeDefinition: " + d.getName() + " cannot have valueType HASHMAPPED/TREEMAPPED since the " + d.getType().getName() + " type does not refer to a named object.");
								ex.setLocationInfo(d.getFile(), d.getLineNumber());
				        		throw(ex);
		        			}
		        		}
		        		else{
							ResultException ex = new ResultException();
							ex.addError("AttributeDefinition: " + d.getName() + " cannot have valueType HASHMAPPED/TREEMAPPED since the " + d.getType().getName() + " type does not have a specified keyClass.");
							ex.setLocationInfo(d.getFile(), d.getLineNumber());
			        		throw(ex);
		        		}
		        	}
		        }
		        
    		}
    	}
    	
    	Iterator<ClassDefinition> cdl = sd.getClassDefList();
    	if (cdl != null){
    		while(cdl.hasNext()){
    			ClassDefinition d = cdl.next();
    			try {
					d.resolveReferences(this);
					
		            if (d.getAllowedParentsSize() > 0){
		            	// The name must be hierarchic
		            	if (d.getIsNamedBy() == null){
		        			ResultException ex = new ResultException();
		        			ex.addError("The following class indicates that it has allowed parents, but isn't a named object: " + d.getName());
		            		throw(ex);
		            	}
		            	if (!d.getIsNamedBy().getType().getIsHierarchicName()){
		        			ResultException ex = new ResultException();
		        			ex.addError("The following class indicates that it has allowed parents, but its naming attribute isn't heirarchic: " + d.getName());
		        			ex.result.lastResult().moreMessages("isNamedBy: " + d.getIsNamedBy().getName());
		            		throw(ex);
		            	}
		            }

				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in ClassDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
    		}


    	}
    	
    	Iterator<EnumDefinition> edl = sd.getEnumDefList();
    	if (edl != null){
    		while(edl.hasNext()){
    			EnumDefinition d = edl.next();
    			try {
					d.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in EnumDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
    	Iterator<TypeDefinition> tdl = sd.getTypeDefList();
    	if (tdl != null){
    		while(tdl.hasNext()){
    			TypeDefinition d = tdl.next();
    			try {
					d.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in TypeDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
//    	ctdl = sd.getComplexTypeDefList();
//    	if (ctdl != null){
//    		while(ctdl.hasNext()){
//    			ComplexTypeDefinition d = ctdl.next();
//    			try {
//					d.resolveReferences(this);
//				} catch (DmcValueExceptionSet e) {
//					ResultException ex = new ResultException();
//					ex.addError("Unresolved references in ComplexTypeDefinition: " + d.getName());
//					ex.setLocationInfo(d.getFile(), d.getLineNumber());
//					
//					for(DmcValueException dve : e.getExceptions()){
//						ex.moreMessages(dve.getMessage());
//					}
//					throw(ex);
//				}
//    		}
//    	}
    	
    	Iterator<SliceDefinition> sdl = sd.getSliceDefList();
    	if (sdl != null){
    		while(sdl.hasNext()){
    			SliceDefinition s = sdl.next();
    			try {
					s.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in SliceDefinition: " + s.getName());
					ex.setLocationInfo(s.getFile(), s.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}    	
    	
    }

    
    public void resolveNameTypes(Iterator<AttributeDefinition> adl) throws ResultException{
    	if (adl != null){
    		while(adl.hasNext()){
    			AttributeDefinition ad = adl.next();
//DebugInfo.debug("1  " + ad.getName().getNameString());
		        if (ad.getType().getIsNameType() && ad.getDesignatedNameAttribute()){
//DebugInfo.debug("2  " + ad.getName().getNameString());
		        	// Really tricky stuff that provides the secret sauce for handling 
		        	// types that implement DmcObjectNameIF. Only one attribute can be 
		        	// defined as the designatedNameAttribute. That attribute
		        	// definition is set on the TypeDefinition as the nameAttributeDef.
		        	// If there's already a value stored in nameAttributeDef when we
		        	// reach here, it's an error.
		        	if (ad.getType().getNameAttributeDef() != null){
		        		// When loading the meta schema, we may get into the situation
		        		// where we already have the name attribute def, but as long as it's
		        		// equal to the definition we're checking, it's fine
		        		if (ad == ad.getType().getNameAttributeDef())
		        			continue;
		        		
		        		AttributeDefinition nd = ad.getType().getNameAttributeDef();
		        		String sn = ad.getDefinedIn().getName().getNameString();
		            	ResultException ex = new ResultException();
		            	ex.addError("Only one attribute may be defined of type: " + ad.getType().getName());
		            	ex.result.lastResult().moreMessages("You must use the \"" + nd.getName() + "\" attribute from the " + sn + " schema.");
		            	ex.result.lastResult().moreMessages("This error was caused by the " + ad.getName() + " attribute definition.");
		            	throw(ex);
		        	}
		        	
		        	try {
//DebugInfo.debug("Adding " + ad.getName() + " as nameAttributeDef for type " + ad.getType().getName());
						ad.getType().setNameAttributeDef(ad);
					} catch (DmcValueException e) {
						e.printStackTrace();
					}
		        }
    		}
    	}
    	else{
//    		DebugInfo.debug("\n\n*** NO ATTRIBUTES TO RESOLVE FOR NAME TYPES \n\n");
    	}
    	
    }

    /**
     * @return the defined slices.
     */
    public Iterator<SliceDefinition> getSlices(){
    	return(sliceDefs.values().iterator());
    }

    /**
     * @return the defined rule categories.
     */
    public Iterator<RuleCategory> getRuleCategories(){
    	return(ruleCategoryDefs.values().iterator());
    }

    /**
     * @return the defined rules.
     */
    public Iterator<RuleDefinition> getRuleDefinitions(){
    	return(ruleDefs.values().iterator());
    }

    /**
     * @return the defined complex types.
     */
    public Iterator<ComplexTypeDefinition> getComplexTypes(){
    	return(complexTypeDefs.values().iterator());
    }

    /**
     * @return the defined extended references.
     */
    public Iterator<ExtendedReferenceTypeDefinition> getExtendedReferenceTypes(){
    	return(extendedReferenceTypeDefs.values().iterator());
    }
}

