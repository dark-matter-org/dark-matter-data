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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcNameClashObjectSet;
import org.dmd.dmc.DmcNameClashResolverIF;
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcUniqueNameResolverIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.definitions.DmcDefinitionSet;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.RuleName;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.generated.dmo.DmsDefinitionDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmw.DSDefinitionModuleIterableDMW;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.RuleTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;


/**
 * The SchemaManager class manages the elements that comprise schemas: types, attributes,
 * classes and schemas themselves.
 */

public class SchemaManager implements DmcNameResolverWithClashSupportIF, DmcNameClashResolverIF, DmcUniqueNameResolverIF {

    /**
     * The schema of classes that are used to describe schemas.
     */
    SchemaDefinition  								meta;
    
    // Key: the fully qualified dotname of a definition i.e. schema.defname.type
    public HashMap<DotName, DmsDefinition>				globallyUniqueMAP;
    
    // Key: DotNames of the form definition_name.definition_type - these keys could potentially clash
    //      across schemas, so we maintain an array list of the defs at this level
    public HashMap<DotName, ArrayList<DmsDefinition>>	clashMAP;
    boolean	debugClashmap = false;
    
    // When definitions are being added via the schema parser, it will attempt to
    // to resolve clashes. If we're loading generated schemas, the SchemaManager will
    // act as the clash resolver.
    DmcNameClashResolverIF	currentResolver;

    /**
     * This map contains all enum  definitions keyed on their respective name attributes.
     * Key: DefinitionName
     * Value: DmdEnumValueDef
     */
    public HashMap<DefinitionName,EnumDefinition>     	enumDefs;
    public int  longestEnumName;

    /**
     * This map contains all type definitions keyed on their respective name attributes.
     * Key: DefinitionName
     * Value: TypeDefinition
     */
    public HashMap<DefinitionName,TypeDefinition>     	typeDefs;
    public int  longestTypeName;

    // Internally generated types for classes
    public HashMap<DefinitionName,TypeDefinition>     	internalTypeDefs;
    
    
    public DmcDefinitionSet<AttributeDefinition> 		attributeDefinitions;
    
    
    
    
    public TreeMap<Integer,ClassDefinition>			classesByID;

    // Key: the fully qualified java class name
    // Value: the class definition
    public TreeMap<String,ClassDefinition>			classesByJavaClass;

    public TreeMap<Integer,AttributeDefinition>		attrByID;

    
    
    
    /**
     * This map contains all action definitions keyed on their respective name attributes.
     * Key: DefinitionName
     * Value: ActionDefinition
     */
    public HashMap<DefinitionName,ActionDefinition>     		actionDefs;
    public int  longestActionName;

    /**
     * This map contains all class definitions keyed on their respective name attributes.
     * Key: DefinitionName
     * Value: ClassDefinition
     */
    DmcDefinitionSet<ClassDefinition>							classDefinitions;
//    public HashMap<DefinitionName,ClassDefinition>     			classDefs;
    public int  longestClassName;
    boolean debugClassAdditions;

    // Key: DefinitionName
    // Value: ComplexTypeDefinition
    public HashMap<DefinitionName,ComplexTypeDefinition>     	complexTypeDefs;
    public int  longestComplexTypeName;

    // Key: DefinitionName
    // Value: ExtendedReferenceTypeDefinition
    public HashMap<DefinitionName,ExtendedReferenceTypeDefinition>	extendedReferenceTypeDefs;
    public int  longestExtendedReferenceTypeName;

    // Key: DefinitionName
    // Value: SliceDefinition
    public HashMap<DefinitionName,SliceDefinition>     			sliceDefs;
    public int  longestSliceName;

    // Key: DefinitionName
    // Value: RuleCategory
    public HashMap<DefinitionName,RuleCategory>     			ruleCategoryDefs;
    public int  											longestRuleCategoryName;
    public TreeMap<Integer,RuleCategory>					ruleCategoriesByID;

    public TreeMap<RuleName,RuleData>						ruleData;


    // Key: DefinitionName
    // Value: RuleDefinition
    public HashMap<DefinitionName,RuleDefinition>     			ruleDefs;
    public HashMap<DotName,RuleDefinition>     				ruleDefsByDot;
    public int  longestRuleName;
    
    // The top level hierarchic objects i.e. ones that don't have allowedParents
    TreeMap<DefinitionName,ClassDefinition>						hierarchicObjects;

    /**
     * This map contains all class abbreviations.
     * Key:   DefinitionName
     * Value: ClassDefinition
     */
    public HashMap<DefinitionName,ClassDefinition>     			classAbbrevs;

    /**
     * This map contains all attribute abbreviations.
     * Key:   DefinitionName
     * Value: ClassDefinition
     */
    public HashMap<DefinitionName,AttributeDefinition>			attrAbbrevs;

    /**
     * This map contains all schema definitions keyed on their respective name attributes.
     * Key:   String (schema name)
     * Value: SchemaDefinition
     */
    TreeMap<DefinitionName,SchemaDefinition>     		schemaDefs;
    public int  longestSchemaName;
    
    /**
     * This map contains all Domain Specific Definition Modules. 
     * Key:   DefinitionName
     * Value: DSDefinitionModule
     */
    TreeMap<DefinitionName,DSDefinitionModule>			definitionModuleDefs;

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

    // Listeners that want to know when definitions have been added 
    ArrayList<SchemaDefinitionListenerIF>			listeners;
    
    /**
     * Creates a new SchemaManager.
     * @throws DmcValueException 
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    public SchemaManager() throws ResultException, DmcValueException, DmcNameClashException {
    	init();
    	
    	debugClashmap = false;
    	debugClassAdditions = false;
    }
    
    /**
     * A convenience constructor that lets you create the schema manager and manage
     * a single schema in one easy operation.
     * @param sd The schema to be managed.
     * @throws ResultException
     * @throws DmcValueException
     * @throws DmcNameClashException 
     */
    public SchemaManager(SchemaDefinition sd) throws ResultException, DmcValueException, DmcNameClashException {
    	init();
    	manageSchema(sd);
    }
    
    void init() throws ResultException, DmcValueException, DmcNameClashException {
        // Create our various hashmaps
        globallyUniqueMAP     				= new HashMap<DotName,DmsDefinition>();
        clashMAP				= new HashMap<DotName, ArrayList<DmsDefinition>>();
        
        // We default to use ourselves as the clash resolver
        currentResolver				= this;
        
        enumDefs 					= new HashMap<DefinitionName,EnumDefinition>();
        typeDefs    				= new HashMap<DefinitionName,TypeDefinition>();
        internalTypeDefs    		= new HashMap<DefinitionName,TypeDefinition>();
        
        attributeDefinitions		= new DmcDefinitionSet<AttributeDefinition>();
        classDefinitions			= new DmcDefinitionSet<ClassDefinition>();
        
        attrByID					= new TreeMap<Integer, AttributeDefinition>();
        classesByID					= new TreeMap<Integer, ClassDefinition>();
        classesByJavaClass			= new TreeMap<String, ClassDefinition>();
        actionDefs  				= new HashMap<DefinitionName,ActionDefinition>();
//        classDefs   				= new HashMap<DefinitionName,ClassDefinition>();
        complexTypeDefs   			= new HashMap<DefinitionName,ComplexTypeDefinition>();
        extendedReferenceTypeDefs   = new HashMap<DefinitionName,ExtendedReferenceTypeDefinition>();
        sliceDefs   				= new HashMap<DefinitionName,SliceDefinition>();
        ruleCategoryDefs   			= new HashMap<DefinitionName,RuleCategory>();
        ruleCategoriesByID			= new TreeMap<Integer, RuleCategory>();
        ruleDefs   					= new HashMap<DefinitionName,RuleDefinition>();
        ruleDefsByDot   			= new HashMap<DotName, RuleDefinition>();
        ruleData					= new TreeMap<RuleName, RuleData>();
        schemaDefs  				= new TreeMap<DefinitionName,SchemaDefinition>();
        definitionModuleDefs  		= new TreeMap<DefinitionName,DSDefinitionModule>();
        classAbbrevs				= new HashMap<DefinitionName,ClassDefinition>();
        attrAbbrevs 				= new HashMap<DefinitionName,AttributeDefinition>();
        hierarchicObjects			= null;
        
        extensions				= new TreeMap<String, SchemaExtensionIF>();
        
        performIDChecks = true;
        

        // Create the global metaschema
        if (MetaSchema._metaSchema == null){
            meta = new MetaSchema();
            
        }
        else
            meta = MetaSchema._metaSchema;
        
        // Manage the meta schema so that we have a starting point for schema management
        manageSchemaInternal(meta);
        
        resolveReferences(meta,this);

        // Now that everything's resolved, we have some unfinished business to take care of
    	Iterator<AttributeDefinition> adl = meta.getAttributeDefList();
    	resolveNameTypes(adl);
    }
    
    public void addDefinitionListener(SchemaDefinitionListenerIF listener){
    	if (listeners == null)
    		listeners = new ArrayList<SchemaDefinitionListenerIF>();
    	listeners.add(listener);
    }
    
    public TreeMap<DefinitionName, ClassDefinition> getHierarchicObjects(){
    	if (hierarchicObjects == null){
    		hierarchicObjects = new TreeMap<DefinitionName, ClassDefinition>();
    		
//    		for(ClassDefinition cd: classDefs.values()){
        	for(ClassDefinition cd: classDefinitions.values()){
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
     * @throws DmcNameClashException 
     * @throws DmcValueException 
     */
    public DmwWrapper wrapIt(DmcObject dmo) throws DmcNameClashException, DmcValueException {
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
    	
    	if (ai == null){
    		throw(new IllegalStateException("Tried to deserialize attribute with unknown ID: " + id));
    	}
    	
    	DmcAttribute<?> rc = (DmcAttribute<?>) ad.getType().getAttributeHolder(ai);
    	rc.setAttributeInfo(ai);
    	
    	return(rc);
    }
    
    /**
     * Finds the internally generated type definition with the specified name.
     * @param name the name of the type
     * @return the type definition or null if it's not found.
     */
    public TypeDefinition findInternalType(DefinitionName name){
    	return(internalTypeDefs.get(name));
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
     * @throws DmcNameClashException 
     */
	public void schemaPreAdd(DmcUncheckedObject sd) throws ResultException, DmcValueException, DmcNameClashException {
    	NamedStringArray attr = sd.get(MetaSchema._schemaExtension.getName().getNameString());
    	
     	if (attr != null){
    		Class<?> extclass;
    		
    		for(String ext: attr){
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
    		}
    	}
    }
    
    /**
     * This method will recursively load a set of generated schemas based on the 
     * schemas on which they depend.
     * @param sd A SchemaDefinition.
     * @throws DmcValueException 
     * @throws ResultException 
     * @throws DmcNameClashException 
     */
	private void loadGeneratedSchema(SchemaDefinition sd) throws ResultException, DmcValueException, DmcNameClashException {
    	
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
    	
        manageSchemaInternal(theInstance);
        
        resolveReferences(theInstance,this);
        
    	// Now that everything's resolved, we have some unfinished business to take care of
    	Iterator<AttributeDefinition> adl = sd.getAttributeDefList();
    	resolveNameTypes(adl);
   }

    /**
     * This function integrates a new set of definitions into the schema manager.
     * @param sd The schema definition to be managed.
     * @throws DmcValueException 
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    public void manageSchema(SchemaDefinition sd) throws ResultException, DmcValueException, DmcNameClashException {
    	
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
    
    public void manageSchemaInternal(SchemaDefinition sd, boolean checkIDs) throws ResultException, DmcValueException, DmcNameClashException {
    	performIDChecks = checkIDs;
    	manageSchemaInternal(sd);
    }
    	/**
     * This function integrates a new set of definitions into the schema manager.
     * @param sd The schema definition to be managed.
     * @throws DmcValueException 
    	 * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    public void manageSchemaInternal(SchemaDefinition sd) throws ResultException, DmcValueException, DmcNameClashException {
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
        DSDefinitionModule 				dsdModule	= null;
        
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
        Iterator<DSDefinitionModule>				dsdModuleIT		= null;

        currentSchema       = sd;
        
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

        if ( (ruleIT = sd.getRuleDefinitionList()) != null){
            while(ruleIT.hasNext()){
                rule = ruleIT.next();
                this.addRuleDefinition(rule);
            }
        }
        
        if ( (dsdModuleIT = sd.getDsdModuleList()) != null){
            while(dsdModuleIT.hasNext()){
            	dsdModule = dsdModuleIT.next();
                this.addDefinitionModule(dsdModule, true);
            }
        }
        
        if ( (itCD = sd.getClassDefList()) != null){
            while(itCD.hasNext()){
                cd = itCD.next();
                
                // Rules are added first so that the ruleDefinition attribute can
                // be resolved later. Adding the rule adds the internal RuleData class
                // so we don't attempt to re-add them here.
                // Note: we don't attempt to access the rule definition through the wrapper
                // because lazy resolution will be attempted and it will fail.
                if (cd.getDMO().getRuleDefinition() == null)
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
        
        this.addSchema(sd);
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
        return((TypeDefinition)typeDefs.get(getDefName(name)));
    }

    /**
     * This function indicates if the specified string the name of an AttributeDefinition.
     * @param name the name of a suspected attribute definition.
     * @return If the name is an attribute, its AttributeDefinition is returned; otherwise null is returned.
     */
    public AttributeDefinition isAttribute(String name){
    	AttributeDefinition rc = null;
		DotName dn;
		try {
			dn = new DotName(name + "." + MetaDMSAG.__AttributeDefinition.name);
			ArrayList<DmsDefinition> defs = clashMAP.get(dn);
			if (defs == null)
				return(rc);
			if (defs.size() == 1)
				rc = (AttributeDefinition) (defs.get(0));
			else{
				StringBuffer sb = new StringBuffer();
				for(DmsDefinition def : defs){
					sb.append(def.getDotName().getNameString() + " ");
				}
				throw(new IllegalStateException("Looking for attribute: " + name + " resulted in multiple definitions: " + sb.toString()));
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return(rc);
    }
    
    public EnumDefinition isEnum(String name){
    	return(enumDefs.get(getDefName(name)));
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
     * Gets the class definition based on the full java class name.
     * @param cn the construction class name
     * @return the class definition.
     */
    public ClassDefinition getClassByJavaClassName(String cn){
    	return(classesByJavaClass.get(cn));
    }

    /**
     * This function indicates if the specified string the name of an ActionDefinition.
     * @param name the name of a suspected action definition.
     * @return If the name is an action, its ActionDefinition is returned; otherwise null is returned.
     */
    public ActionDefinition isAction(String name){
        return((ActionDefinition)actionDefs.get(getDefName(name)));
    }

    /**
     * This function indicates if the specified string the name of a ClassDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a class, its ClassDefinition is returned; otherwise null is returned.
     * @throws DmcNameClashException  
     * @throws DmcValueException 
     */
    public ClassDefinition isClass(String name) throws DmcNameClashException, DmcValueException {
    	return(classDefinitions.getDefinition(name));
//        return((ClassDefinition)classDefs.get(getDefName(name)));
    }

    /**
     * This function indicates if the specified string the name of a SchemaDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a schema, its SchemaDefinition is returned; otherwise null is returned.
     */
    public SchemaDefinition isSchema(String name){
        return((SchemaDefinition)schemaDefs.get(getDefName(name)));
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

        if (checkAndAddDOT(sd.getDotName(),sd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(sd.getObjectName(),sd,globallyUniqueMAP,"definition names"));
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
     * Adds the definition module. If we're managing this as part of a loaded schema, we don't
     * attempt to generate the internal class that represents the module.
     * @param ddm the modulew being added 
     * @param managingSchema whether we're managing a schema or parsing a schema
     * @throws ResultException
     * @throws DmcValueException
     */
    void addDefinitionModule(DSDefinitionModule ddm, boolean managingSchema) throws ResultException, DmcValueException {

        if (checkAndAdd(ddm.getObjectName(),ddm,definitionModuleDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(ddm.getObjectName(),ddm,definitionModuleDefs,"DSDefinitionModule names"));
            currentSchema = null;
        	throw(ex);
        }
        
        if (checkAndAddDOT(ddm.getDotName(),ddm,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(ddm.getObjectName(),ddm,globallyUniqueMAP,"definition names"));
            throw(ex);
        }
        
        if (managingSchema)
        	return;
        
        ////////////////////////////////////////////////////////////////////////
        // Eventual rules
        
        if (ddm.getDmdID() != null){
        	if (ddm.getDmdID() != 1){
        		ResultException ex = new ResultException("The dmdID of a DSDefinitionModule must be 1");
        		ex.setLocationInfo(ddm.getFile(), ddm.getLineNumber());
        		throw(ex);
        	}
        }
        
        ///////////////////////////////////////////////////////////////////////
        
    	// Again, some trickiness, we have to resolve the module so that we can access and use the must/may
    	// attributes that are defined for it and add them to the class definition we create
        try {
        	ddm.resolveReferences(this,currentResolver);
		} catch (DmcValueExceptionSet e) {			
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in DSDefinitionModule: " + ddm.getName());
			
			for(DmcValueException dve : e.getExceptions()){
				ex.moreMessages(dve.getMessage());
			}
			throw(ex);
		}

    	DefinitionName moduleClassName = new DefinitionName(ddm.getModuleClassName());

    	// And now we generate a class that represents the module
        ClassDefinition cd = new ClassDefinition();
        cd.setName(moduleClassName);
        cd.setClassType(ClassTypeEnum.STRUCTURAL);
        cd.setDmdID(ddm.getDmdID());
        cd.setIsNamedBy(MetaSchemaAG._name);
        cd.setInternallyGenerated(true);
        cd.setDsdModuleDefinition(ddm);
        
        if (ddm.getSupportDynamicSchemaLoading()){
        	// If the module supports dynamic schema loading, we add the loadSchemaClass attribute to the module
        	cd.addMay(MetaSchema._loadSchemaClass);
        }
        
        // We derive the module from the base definition class for the module!
        cd.setDerivedFrom((ClassDefinition) ddm.getBaseDefinition());
        
        // The name of a domain specific definition module is schema.dsdmodulename.DSDefinitionModule
        // For the associated class, it will be schema.dsdmodulename.ClassDefinition
        DotName className = new DotName(((DotName) ddm.getDotName().getParentName()).getNameString() + ".ClassDefinition");
        DotName nameAndTypeName = new DotName(cd.getName() + ".ClassDefinition");
        cd.setDotName(className);
        cd.setNameAndTypeName(nameAndTypeName);

        cd.addMust(MetaSchemaAG._name);
        cd.addMay(MetaSchemaAG._description);
        cd.addMay(MetaSchemaAG._defFiles);

        cd.setFile(ddm.getFile());
        cd.setLineNumber(ddm.getLineNumber());
        cd.setDefinedIn(ddm.getDefinedIn());
        cd.setUseWrapperType(WrapperTypeEnum.EXTENDED);
        
        if (ddm.getDescription() != null){
	    	Iterator<String> it = ddm.getDescription();
	    	while(it.hasNext()){
	    		cd.addDescription(it.next());
	    	}
        }
        
        // Add the attribute that lets us refer to other modules of this kind
//        cd.addMay(ddm.getModuleDependenceAttribute());
        
        for(AttributeDefinition ad: ddm.getMay()){
        	cd.addMay(ad);
        }
        
        for(AttributeDefinition ad: ddm.getMust()){
        	cd.addMust(ad);
        }
        
        // Add the required attributes that indicate dependence on other modules
        addDependenceAttributes(cd, ddm, new TreeSet<String>());
        
        addClass(cd);
        
        // We add the new class to the schema's list of classes
        ddm.getDefinedIn().addClassDefList(cd);

    }
    
    /**
     * We recursively add the required dependence attribute to the class definition.
     * @param cd the class that represents the DSD module being added
     * @param module the current module
     * @param modules the set of modules for which we've already added the dependence attribute
     * @throws DmcValueException  
     */
    void addDependenceAttributes(ClassDefinition cd, DSDefinitionModule module, TreeSet<String> modules) throws DmcValueException {
    	cd.addMay(module.getModuleDependenceAttribute());
    	modules.add(module.getName().getNameString());
    	
		if (module.getRefersToDefsFromDSDSize() > 0){
			DSDefinitionModuleIterableDMW it = module.getRefersToDefsFromDSD();
			while(it.hasNext()){
				DSDefinitionModule mod = it.next();
				if (!modules.contains(mod.getName().getNameString()))
					addDependenceAttributes(cd, mod, modules);
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
        
        if (checkAndAddDOT(ctd.getDotName(),ctd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(ctd.getObjectName(),ctd,globallyUniqueMAP,"definition names"));
            currentSchema = null;
        	throw(ex);
        }        
        
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setName(ctd.getName());
        
        // The name of a complex type definition is schema.complextype.ComplexTypeDefinition
        // For the associated type, it will be schema.complextype.TypeDefinition
        DotName typeName = new DotName((DotName) ctd.getDotName().getParentName(),"TypeDefinition");
        DotName nameAndTypeName = new DotName(td.getName() + ".TypeDefinition");
        td.setDotName(typeName);
        td.setNameAndTypeName(nameAndTypeName);

        td.addDescription("This is an internally generated type to represent complex type " + ctd.getName() + " values.");
        td.setIsEnumType(false);
        td.setIsRefType(false);
        
        td.setTypeClassName(ctd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + ctd.getName());
        td.setPrimitiveType(ctd.getDefinedIn().getSchemaPackage() + ".generated.types." + ctd.getName());
        td.setDefinedIn(ctd.getDefinedIn());
                
        // We add the new type to the schema's list of internally generated types
        ctd.getDefinedIn().addInternalTypeDefList(td);
        
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
        
        if (checkAndAddDOT(ertd.getDotName(),ertd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(ertd.getObjectName(),ertd,globallyUniqueMAP,"definition names"));
            currentSchema = null;
        	throw(ex);
        }        
        
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setIsExtendedRefType(true);
        td.setName(ertd.getName());
        
        // NOTE: At this stage, the extendedReferenceClass attribute hasn't been resolved,
        // so we're setting the original class based on the name of the extendedReferenceClass
        td.getDMO().setOriginalClass(ertd.getDMO().getExtendedReferenceClass().cloneMe());
        
        // The name of an extended reference definition is schema.extreftype.ExtendedReferenceTypeDefinition
        // For the associated class, it will be schema.extreftype.TypeDefinition
        DotName typeName = new DotName((DotName) ertd.getDotName().getParentName(),"TypeDefinition");
        DotName nameAndTypeName = new DotName(td.getName() + ".TypeDefinition");
        td.setDotName(typeName);
        td.setNameAndTypeName(nameAndTypeName);

        td.addDescription("This is an internally generated type to represent extendedreference type " + ertd.getName() + " values.");
        td.setIsEnumType(false);
        td.setIsRefType(true);
        
        td.setTypeClassName(ertd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + ertd.getName());
        td.setPrimitiveType(ertd.getDefinedIn().getSchemaPackage() + ".generated.types." + ertd.getName());
        td.setDefinedIn(ertd.getDefinedIn());
                
        // We add the new type to the schema's list of internally generated types
        ertd.getDefinedIn().addInternalTypeDefList(td);
        ertd.getDefinedIn().addTypeDefList(td);
        
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
        
        if (checkAndAddDOT(sd.getDotName(),sd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(sd.getObjectName(),sd,globallyUniqueMAP,"definition names"));
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
        
        if (checkAndAddDOT(rc.getDotName(),rc,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(rc.getObjectName(),rc,globallyUniqueMAP,"definition names"));
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
        	ex.addError(clashingIDsMsg(rc.getRuleCategoryID(),rc,ruleCategoriesByID,"ruleCategoryID"));
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
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    void addRuleDefinition(RuleDefinition rd) throws ResultException, DmcValueException, DmcNameClashException {
    	// Again, some trickiness, we have to resolve the rule so that we can access and use the must/may
    	// attributes that are defined for it and add them to the class definition we create
        try {
			rd.resolveReferences(this,currentResolver);
		} catch (DmcValueExceptionSet e) {			
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in RuleDefinition: " + rd.getName());
			
			for(DmcValueException dve : e.getExceptions()){
				ex.moreMessages(dve.getMessage());
			}
			throw(ex);
		}
    	
    	DefinitionName ruleClassName = new DefinitionName(rd.getName().getNameString() + "Data");
    	
        if (checkAndAdd(rd.getObjectName(),rd,ruleDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(rd.getObjectName(),rd,ruleDefs,"rule definitions"));
        	throw(ex);
        }
        
        // dot name is current schema.ruledef.RuleDefinition. We want just schema.ruledef
        ruleDefsByDot.put((DotName) rd.getDotName().getParentName(), rd);
        
        if (checkAndAddDOT(rd.getDotName(),rd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(rd.getObjectName(),rd,globallyUniqueMAP,"definition names"));
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
        
//        ClassDefinition existing = classDefs.get(ruleClassName);
        ClassDefinition existing = classDefinitions.getDefinition(ruleClassName.getNameString());
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
        	ex.addError(clashingIDsMsg(rd.getDmdID(),rd,classesByID,"dmdID"));
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
        cd.setIsNamedBy(MetaSchemaAG._ruleName);
        
        // The name of a rule definition is schema.ruledef.RuleDefinition
        // For the associated class, it will be schema.ruledefData.ClassDefinition
        DotName className = new DotName(((DotName) rd.getDotName().getParentName()).getNameString() + "Data.ClassDefinition");
        DotName nameAndTypeName = new DotName(cd.getName() + "Data.ClassDefinition");
        cd.setDotName(className);
        cd.setNameAndTypeName(nameAndTypeName);

        cd.addMust(MetaSchemaAG._ruleName);
        cd.addMust(MetaSchemaAG._ruleTitle);
        cd.addMay(MetaSchemaAG._description);
        
		if (rd.getRuleType() == RuleTypeEnum.ATTRIBUTE)
			cd.addMust(MetaSchemaAG._applyToAttribute);

        cd.setFile(rd.getFile());
        cd.setLineNumber(rd.getLineNumber());
        cd.setDefinedIn(rd.getDefinedIn());
        
        if (rd.getDescription() != null){
        	Iterator<String> it = rd.getDescription();
        	while(it.hasNext()){
        		cd.addDescription(it.next());
        	}
        }
        
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

//        if (checkAndAdd(cd.getObjectName(),cd,classDefs) == false){
//        	ResultException ex = new ResultException();
//        	ex.addError(clashMsg(cd.getObjectName(),cd,classDefs,"class names"));
//        	throw(ex);
//        }
        
        classDefinitions.add(cd);
        
        // This name is used to identify references to the class
        DotName refName 	= new DotName((DotName) cd.getDotName().getParentName(),"ClassDefinitionREF");
               
        if (debugClassAdditions)
        	DebugInfo.debug("Adding class: " + cd.getDotName() + "   " + refName);
        
        if (checkAndAddDOT(cd.getDotName(),cd,globallyUniqueMAP,refName) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(cd.getObjectName(),cd,globallyUniqueMAP,"definition names"));
            throw(ex);
        }

        // TODO: revisit abbreviations - this was originally required for LDAP naming, which, if
        // it's ever done, should be handled in the LDAP mechanisms.
//        if (cd.getAbbrev() != null){
//            // We have an abbreviation - so it must also be unique and
//            // added to the appropriate maps
//        	DefinitionName abbrevName = new DefinitionName(cd.getAbbrev());
//            if (checkAndAdd(abbrevName,cd,classDefs) == false){
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsg(abbrevName,cd,classDefs,"class abbreviations"));
//            	throw(ex);
//            }
//            
//            DotName dotAbbrevName = new DotName(cd.getDefinedIn().getName() + "." + cd.getAbbrev());
//            
//            if (checkAndAddDOT(dotAbbrevName,cd,globallyUniqueMAP,null) == false){
//                DefinitionName errName = new DefinitionName(cd.getDefinedIn().getName() + "." + cd.getAbbrev());
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsgDOT(errName,cd,globallyUniqueMAP,"definition names"));
//                throw(ex);
//            }
//            
//            classAbbrevs.put(abbrevName,cd);
//        }
        
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
        	ex.addError(clashingIDsMsg(cd.getDmdID(),cd,classesByID,"dmdID"));
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
			cd.resolveReferences(this,currentResolver);
		} catch (DmcValueExceptionSet e) {			
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in ClassDefinition: " + cd.getName());
			ex.addError(cd.toOIF());
			
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
        
        // And now, set the java class that will be used with the DmwObjectFactory
        if (cd.getJavaClass() == null){
        	if (cd.getUseWrapperType() == WrapperTypeEnum.BASE)
        		cd.setJavaClass(cd.getDmwImport());
        	else if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
        		cd.setJavaClass(cd.getDmeImport());
        	}
        }
        
        // Add the class to our java class to class definition map
        classesByJavaClass.put(cd.getJavaClass(), cd);
        
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
	        
	        td.setInternallyGenerated(true);
	        td.setName(cd.getName());
	        
	        // The name of a class definition is schema.class.ClassDefinition
	        // For the associated type, it will be schema.class.TypeDefinition
	        DotName typeName 	= new DotName((DotName) cd.getDotName().getParentName(),"TypeDefinition");
	        DotName nameAndTypeName 	= new DotName(td.getName() + ".TypeDefinition");
	        
	        td.setDotName(typeName);
	        td.setNameAndTypeName(nameAndTypeName);
	        
	        td.addDescription("This is an internally generated type to allow references to " + cd.getName() + " values.");
	        td.setIsEnumType(false);
	        td.setIsRefType(true);
	        
	        if (cd.getIsNamedBy() != null){
	        	// We only need a helper class when we have named objects - regular old object references
	        	// can get by without this
	        	td.setHelperClassName(cd.getDefinedIn().getSchemaPackage() + ".generated.types." + cd.getName() + "REF");
	        	
	        	// TODO: MAKE THIS A RULE
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
	        
	        if (checkAndAddDOT(td.getDotName(),td,globallyUniqueMAP,null) == false){
	        	ResultException ex = new ResultException();
	        	ex.addError(clashMsgDOT(td.getObjectName(),td,globallyUniqueMAP,"definition names"));
	        	throw(ex);
	        }

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
    	
    	attributeDefinitions.add(ad);
    	
        if (checkAndAddDOT(ad.getDotName(),ad,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(ad.getObjectName(),ad,globallyUniqueMAP,"definition names"));
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
        	ex.addError(clashingIDsMsg(ad.getDmdID(),ad,attrByID,"dmdID"));
        	throw(ex);
        }
        attrByID.put(ad.getDmdID(), ad);
        
        if (ad.getAbbrev() != null){
            // We have an abbreviation - so it must also be unique and
            // added to the appropriate maps
        	DefinitionName abbrevName = new DefinitionName(ad.getAbbrev());
        	
            DotName dotAbbrevName = new DotName(ad.getDefinedIn().getName() + "." + ad.getAbbrev());
            if (checkAndAddDOT(dotAbbrevName,ad,globallyUniqueMAP,null) == false){
            	DefinitionName errName = new DefinitionName(ad.getDefinedIn().getName() + "." + ad.getAbbrev());
            	ResultException ex = new ResultException();
            	ex.addError(clashMsgDOT(errName,ad,globallyUniqueMAP,"definition names"));
            	throw(ex);
            }

            attrAbbrevs.put(abbrevName,ad);
        }
        
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

        if (checkAndAdd(td.getObjectName(),td,typeDefs) == false){
        	ResultException ex = new ResultException();
            ex.addError(clashMsg(td.getObjectName(),td,typeDefs,"type names"));
            throw(ex);
        }

        if (checkAndAddDOT(td.getDotName(),td,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(td.getObjectName(),td,globallyUniqueMAP,"definition names"));
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
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    public void addDefinition(DmsDefinition def, DmcNameClashResolverIF clashResolver) throws ResultException, DmcValueException, DmcNameClashException {
    	currentResolver = clashResolver;
    	
    	addDefinition(def);
    	
    	currentResolver = this;
    }
    
    /**
     * Attempts to add the specified definition. If the definition clashes with
     * any existing definition, we throw an exception.
     * @throws DmcValueException 
     * @throws DmcNameClashException 
     * @throws DmcValueExceptionSet 
     */
    void addDefinition(DmsDefinition def) throws ResultException, DmcValueException, DmcNameClashException {
    	
    	if (def.getDotName() == null)
    		DebugInfo.debug("NO DOT NAME");
    	
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
    	// Note: test for extended ref before complex type because it is derived from complex type
    	else if (def instanceof ExtendedReferenceTypeDefinition)
    		this.addExtendedReferenceType((ExtendedReferenceTypeDefinition) def);
    	else if (def instanceof ComplexTypeDefinition)
    		this.addComplexType((ComplexTypeDefinition) def);
    	else if (def instanceof SchemaDefinition)
    		this.addSchema((SchemaDefinition) def);
    	else if (def instanceof DSDefinitionModule)
    		this.addDefinitionModule((DSDefinitionModule) def, false);
        else{
        	ResultException ex = new ResultException();
        	ex.addError("The specified object is not a DmsDefinition object: \n" + def.toOIF());
        	throw(ex);
        }

    	if (listeners != null){
    		for(SchemaDefinitionListenerIF listener: listeners)
    			listener.definitionAdded(def.getDMO());
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
     * Adds the specified attribute definition to the schema if it doesn't already exist.
     * @throws DmcValueException 
     */
    boolean addEnum(EnumDefinition evd)  throws ResultException, DmcValueException {
        if (checkAndAdd(evd.getObjectName(),evd,enumDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(evd.getObjectName(),evd,enumDefs,"enum value names"));
            throw(ex);
        }
        
        if (checkAndAddDOT(evd.getDotName(),evd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(evd.getObjectName(),evd,globallyUniqueMAP,"definition names"));
        	throw(ex);
        }

        // Things get a little tricky here - although EnumDefinitions are enums, they get
        // turned into internally generated TypeDefinitions, so we don't add them to the
        // allDefs map as EnumDefinitions.
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setName(evd.getName());
        
        // The name of an enum definition is schema.enum.EnumDefinition
        // For the associated type, it will be schema.enum.TypeDefinition
        DotName typeName = new DotName((DotName) evd.getDotName().getParentName(),"TypeDefinition");
        DotName nameAndTypeName = new DotName(td.getName() + ".TypeDefinition");
        td.setDotName(typeName);
        td.setNameAndTypeName(nameAndTypeName);

        td.setEnumName(evd.getName().getNameString());
        td.addDescription("This is an internally generated type to allow references to " + evd.getName() + " values.");
        td.setIsEnumType(true);
        td.setTypeClassName(evd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + evd.getName());
        td.setPrimitiveType(evd.getDefinedIn().getSchemaPackage() + ".generated.enums." + evd.getName());
        td.setDefinedIn(evd.getDefinedIn());
        
        // Issue 4 fix
        if (evd.getNullReturnValue() != null)
        	td.setNullReturnValue(evd.getNullReturnValue());
        
        internalTypeDefs.put(td.getName(), td);
        
        // We add the new type to the schema's list of internally generated types
        evd.getDefinedIn().addInternalTypeDefList(td);
    
        // Add the type
        addType(td);

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
			actd.resolveReferences(this,currentResolver);
		} catch (DmcValueExceptionSet e) {
			e.printStackTrace();
		}
    	
        if (checkAndAdd(actd.getObjectName(),actd,actionDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(actd.getObjectName(),actd,actionDefs,"action names"));
            throw(ex);
        }

        if (checkAndAddDOT(actd.getDotName(),actd,globallyUniqueMAP,null) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsgDOT(actd.getObjectName(),actd,globallyUniqueMAP,"definition names"));
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
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean checkAndAdd(DefinitionName key, DmsDefinition obj, HashMap map){
        if (map.containsKey(key))
            return(false);
        else
            map.put(key,obj);

        return(true);
    }

    /**
     * 
     * @param key
     * @param obj
     * @param map
     * @param refName specified in the case of class definitions
     * @return
     */
	private boolean checkAndAddDOT(DotName key, DmsDefinition obj, HashMap<DotName,DmsDefinition> map, DotName refName){
//		defsByTypeDOT
//		DebugInfo.debug("Adding: " + key);
		
//		if (key.getNameString().contains("TypeDefinition.TypeDefinition")){
//			DebugInfo.debugWithTrace(key.getNameString());
//		}
//		if (refName != null)
//			DebugInfo.debug("Adding REF Type: " + refName);
			
        if (map.containsKey(key)){
    		DebugInfo.debug("Could not add to globallyUniqueMAP: " + key);
        	
            return(false);
        }
        else{
//    		DebugInfo.debug("Adding to globallyUniqueMAP - " + obj.getConstructionClassName() + ": " + key);
            map.put(key,obj);
    		if (refName != null)
    			map.put(refName, obj);
            
            DotName defAndType 	= key.trimRoot();
            
            //TODO: this should be generalized to handle any "module"
            if (obj instanceof SchemaDefinition){
            	defAndType = (DotName) key.getParentName();
            }
            
            ArrayList<DmsDefinition>	defs = clashMAP.get(defAndType);
            
            if (debugClashmap)
            	DebugInfo.debug("Adding to clashMAP - " + obj.getConstructionClassName() + ": " + defAndType + "\n\n");
    		
            if (defs == null){
            	defs = new ArrayList<DmsDefinition>(1);
            	defs.add(obj);
            	clashMAP.put(defAndType, defs);
            	
            	// When creating new domain specific definition modules, we need genericity when
            	// it comes to defining the modules and indicating which definitions are part
            	// of the module. The usesDefinition attribute is of type DSDefinition, but
            	// when a new ClassDefinition is added (which indicates new kind of domain related 
            	// definition, it's added as definition.ClassDefinition. However, when we try to 
            	// resolve a reference via the usesDefinition attribute, it's expecting to refer
            	// to definition.DSDefinition - so, we add these variants here.
            	if (obj.getConstructionClassInfo() == MetaDMSAG.__ClassDefinition){
            		addBaseClassVariants(obj, obj.getConstructionClassInfo().derivedFrom, map);
            	}
            }
            else{
            	if (debugClashmap)
            		DebugInfo.debug("CLASHING definition");
            	defs.add(obj);
            }
            
            //
            
            if (refName != null){
                DotName classRefKey 	= refName.trimRoot();
                
            	if (debugClashmap)
            		DebugInfo.debug("Adding REF Type: " + refName + "    *" + classRefKey + "*" + "   clashMap: " + System.identityHashCode(clashMAP));

                defs = clashMAP.get(classRefKey);            	
                if (defs == null){
                	defs = new ArrayList<DmsDefinition>(1);
                	defs.add(obj);
                	
                	clashMAP.put(classRefKey, defs);
                }
                else{
                	if (debugClashmap)
                		DebugInfo.debug("CLASHING CLASSREF definition");
                	
                	defs.add(obj);
                }
            }
            
        }

        return(true);
    }
	
	/**
	 * 
	 * @param obj the definition being added
	 * @param ci the class info for the variant being added
	 * @param map the map to which we're adding the definition
	 */
	void addBaseClassVariants(DmsDefinition obj, DmcClassInfo ci, HashMap<DotName,DmsDefinition> map){
		
		if (ci != null){
			try {
				DotName dn = new DotName(obj.getName() + "." + ci.name);				
	            ArrayList<DmsDefinition>	defs = clashMAP.get(dn);
	            
	            if (debugClassAdditions)
	            	DebugInfo.debug("Adding to VARIANT clashMAP - " + obj.getConstructionClassName() + ": " + dn + "\n\n");
	            
	            if (defs == null){
	            	defs = new ArrayList<DmsDefinition>(1);
	            	defs.add(obj);
	            	clashMAP.put(dn, defs);
	            }
	            else{
	                if (debugClassAdditions)
	                	DebugInfo.debug("CLASHING definition");
	                
	            	defs.add(obj);
	            }
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Couldn't construct a DotName from \"" + obj.getName() + "." + ci.name + "\""));
			}
		}
		
		if (ci.derivedFrom != null){
			addBaseClassVariants(obj, ci.derivedFrom, map);
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
        StringBuffer    sb  = new StringBuffer();
        PrintfFormat	format = null;
        
        if (attributeDefinitions.getLongestName() > longest)
        	longest = attributeDefinitions.getLongestName();
        
        String	longestStr = "" + longest;
        format = new PrintfFormat("%-" + longestStr + "s ");

        sb.append("*** Attributes\n");
        TreeMap<DefinitionName,AttributeDefinition> sattrs = new TreeMap<DefinitionName, AttributeDefinition>();
        
        for(AttributeDefinition ad: attributeDefinitions.values())
        	sattrs.put(ad.getName(), ad);
        
        for(AttributeDefinition ad : sattrs.values())
            sb.append(format.sprintf(ad.getObjectName()) + ad.getDefinedIn().getName() + "\n");
        
        sb.append("*** Classes\n");
//        TreeMap<DefinitionName,ClassDefinition> scdefs = new TreeMap<DefinitionName, ClassDefinition>();
//        
//        for(ClassDefinition cd : classDefs.values())
//        	scdefs.put(cd.getName(), cd);
//        
//        for(ClassDefinition cd : scdefs.values()){
//            sb.append(format.sprintf(cd.getObjectName()));
//            if (cd.getAbbrev() != null)
//                sb.append(" AB " + cd.getAbbrev());
//            sb.append(cd.getDefinedIn().getName() + "\n");
//        }
       
        for(ClassDefinition cd : classDefinitions.values()){
          sb.append(format.sprintf(cd.getObjectName()));
          if (cd.getAbbrev() != null)
              sb.append(" AB " + cd.getAbbrev());
          sb.append(cd.getDefinedIn().getName() + "\n");
        }
        
        return(new String(sb.toString()));
    }
    
    
	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		throw(new IllegalStateException("The SchemaManager is designed to work with ambiguous naming. Use DmcObject.resolveReferences(DmcNameResolverWithClashSupportIF, DmcNameClashResolverIF)\n\n" + DebugInfo.getCurrentStack()));
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
		
		// Added this after working on rules. Had a case where allowedType was defined as
		// type TypeDefinition but got DmcValueException when referring to AttributeDefinition.
		// This occurred because allowedType was not specified in the list above - so, to make
		// things extensible, added this chunk of code.
		AttributeDefinition ad = attrByID.get(attributeID);
		if (ad != null){
			if (ad.getDMO().getType().getObjectName().getNameString().equals(MetaDMSAG.__type_TypeDefinition.name)){
				DmcNamedObjectIF def = (DmcNamedObjectIF)internalTypeDefs.get(name);
				if (def != null)
					return(def);							
			}
		}
		
//		DmcAttributeInfo ai = DmcOmni.instance().getInfo(attributeID);
//		if (ai.type.equals(MetaDMSAG.__type_TypeDefinition.name)){
//			DmcNamedObjectIF def = (DmcNamedObjectIF)internalTypeDefs.get(name);
//			if (def != null)
//				return(def);			
//		}

		return(findNamedObject(name));
	}

    
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		throw(new IllegalStateException("The SchemaManager is designed to work with ambiguous naming. Use DmcObject.resolveReferences(DmcNameResolverWithClashSupportIF, DmcNameClashResolverIF)\n\n" + DebugInfo.getCurrentStack()));
	}

    /**
     * Returns the definition with the specified name if it exists.
     */
    public DmcNamedObjectIF findNamedObject(String name){
		throw(new IllegalStateException("The SchemaManager is designed to work with ambiguous naming. Use DmcObject.resolveReferences(DmcNameResolverWithClashSupportIF, DmcNameClashResolverIF)\n\n" + DebugInfo.getCurrentStack()));
    }

    /**
     * Returns a nice error message for a clashing definition name.
     */
    String clashMsg(DefinitionName defName, DmsDefinition newDef, HashMap<DefinitionName, ? extends DmsDefinition> defMap, String defType){
        DmsDefinition    existing = defMap.get(defName);
        SchemaDefinition ga1      = existing.getDefinedIn();
        SchemaDefinition ga2      = newDef.getDefinedIn();

        if (ga2 == null)
            return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + currentSchema.getObjectName()));
        else
            return(new String("Clashing " + defType + ": " + defName + " - Initially defined as part of " + ga1.getObjectName() + " - Redefined in " + ga2.getObjectName()));
    }

    String clashMsgDOT(DefinitionName defName, DmsDefinition newDef, HashMap<DotName, ? extends DmsDefinition> defMap, String defType){
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
    String clashMsg(DefinitionName defName, DmsDefinition newDef, TreeMap<DefinitionName, ? extends DmsDefinition> defMap, String defType){
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
    String clashingIDsMsg(Integer defID, DmsDefinition newDef, TreeMap<Integer, ? extends DmsDefinition> defMap, String defType){
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
        AttributeDefinition rc = isAttribute(n);
        if (rc == null){
            return(null);
        }
        else{
            return(rc);
        }
    }
    
    public AttributeDefinition adef(DotName dn){
    	return(attributeDefinitions.getDefinition(dn));
    }
    
    /**
     * This function will return the class definition associated with the
     * given name.
     * @throws DmcNameClashException 
     * @throws DmcValueException  
     */
    public ClassDefinition cdef(String n) throws DmcNameClashException, DmcValueException {
    	if (n.contains(".")){
    		try {
				DefinitionName dn = new DefinitionName(n);
	    		DmsDefinition def = globallyUniqueMAP.get(dn);
	    		if (def instanceof ClassDefinition)
	    			return (ClassDefinition) (def);
	    		return(null);
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
        ClassDefinition rc = isClass(n);
        if (rc == null){
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
            return(null);
        }
        else
            return(rc);
    }
    
    /**
     * Convenience method to create a DefinitionName.
     * @param n the name string
     * @return a defniition name based on the string.
     */
    DefinitionName getDefName(String n){
    	DefinitionName rc = null;
    	try {
			rc = new DefinitionName(n);
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
		return(rc);
    }

    /**
     * This method will ensure that all references in the specified schema can
     * be resolved.
     * @param sd The schema to be resolved.
     * @throws ResultException  
     * @throws DmcNameClashException 
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
	public void resolveReferences(SchemaDefinition sd, DmcNameClashResolverIF clashResolver) throws ResultException, DmcNameClashException, DmcValueException {

    	Iterator<AttributeDefinition> preadl = sd.getAttributeDefList();
    	if (preadl != null){
    		while(preadl.hasNext()){
    			AttributeDefinition d = preadl.next();
    			try {
					d.resolveReferences(this,clashResolver);
				} catch (DmcValueExceptionSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    	
    	Iterator<ComplexTypeDefinition> ctdl = sd.getComplexTypeDefList();
    	if (ctdl != null){
    		while(ctdl.hasNext()){
    			ComplexTypeDefinition ctd = ctdl.next();
    			
    			// And finally, the complex type def has to have it object class resolved so that
    			// we don't run into problems later when generating the DMW schema
    			try {
					ctd.resolveReferences(this,clashResolver);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError(e.toString());
					ex.result.lastResult().fileName(ctd.getFile());
					ex.result.lastResult().lineNumber(ctd.getLineNumber());
					throw(ex);
				}
    		}
    	}
    	
    	// And more of the same kind of magic with extended references types - we have to
    	// preresolve the type references in the same way as with attributes
    	Iterator<ExtendedReferenceTypeDefinition> ertdl = sd.getExtendedReferenceTypeDefList();
    	if (ertdl != null){
    		while(ertdl.hasNext()){
    			ExtendedReferenceTypeDefinition ertd = ertdl.next();
    			
    			try {
					ertd.resolveReferences(this, clashResolver);
				} catch (DmcValueExceptionSet e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			
    			// TODO: need a rule for this
				if (ertd.getExtendedReferenceClass().getIsNamedBy() == null){
					ResultException ex = new ResultException();
					ex.addError("The class: " + ertd.getExtendedReferenceClass().getObjectName().getNameString() + " referred to in ExtendedReferenceTypeDefinition " + ertd.getName() + " is not a named object.");
					ex.result.lastResult().fileName(ertd.getFile());
					ex.result.lastResult().lineNumber(ertd.getLineNumber());
					throw(ex);
				}
    		}
    	}
    	
    	Iterator<ActionDefinition> actdl = sd.getActionDefList();
    	if (actdl != null){
    		while(actdl.hasNext()){
    			ActionDefinition d = actdl.next();
    			try {
					d.resolveReferences(this,clashResolver);
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
					d.resolveReferences(this,clashResolver);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in AttributeDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getMessage());
					}
					throw(ex);
				}
				
				// TODO: MAKE THIS A RULE
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
					d.resolveReferences(this,clashResolver);
					
					// TODO: MAKE THIS A RULE
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
    				d.resolveReferences(this,clashResolver);
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
    				d.resolveReferences(this,clashResolver);
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
    	    	
    	Iterator<SliceDefinition> sdl = sd.getSliceDefList();
    	if (sdl != null){
    		while(sdl.hasNext()){
    			SliceDefinition s = sdl.next();
    			try {
    				s.resolveReferences(this,clashResolver);
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
    	
    	TreeMap<RuleName,RuleIF> theRules = sd.getRuleInstances(this);
    	for(RuleIF rule: theRules.values()){
    		try {
				rule.getRuleDataDMO().resolveReferences(this, clashResolver);
			} catch (DmcValueExceptionSet e) {
				ResultException ex = new ResultException();
				ex.addError("Unresolved references in rule data: " + rule.getRuleDataDMO().getRuleName());
//				ex.setLocationInfo(s.getFile(), s.getLineNumber());
				
				for(DmcValueException dve : e.getExceptions()){
					ex.moreMessages(dve.getMessage());
				}
				throw(ex);
			}
    	}
    	sd.setResolvedRules(theRules);
    	
    	///////////////////////////////////////////////////////////////////////
    	// Some additional work required to allow for name clash resolution
    	// mechanisms in auto generated definition managers. All structural 
    	// DSDefinition derived classes must have a standard mechanism to get
    	// the name of the  module from which they were loaded. In order to
    	// do this, we have to know the DSDModule with which they are associated
    	// so that we can get the definedInModuleAttribute. Tricky!
    	// We find the base definition for the module and then add the partOfDefinitionModule
    	// attribute so that we can use this information in the DMWGenerator later.
    	if (sd.isGeneratedSchema() == false){
    		// TODO: the module definitions need to be added to the schema - boy I wish
    		// I had the infrastructure for schemas that I do for other DSDs!
	    	cdl = sd.getClassDefList();
	    	if (cdl != null){
	    		while(cdl.hasNext()){
	    			ClassDefinition cd = cdl.next();
	    			if (cd.getDsdModuleDefinition() != null){
	    				// This is the base class definition that represents the module
	    				ClassDefinition base = (ClassDefinition) cd.getDsdModuleDefinition().getBaseDefinition();
	    				base.setPartOfDefinitionModule(cd.getDsdModuleDefinition());
	    				
	    				TreeMap<DefinitionName,ClassDefinition> derived = base.getAllDerived();
	    				for(ClassDefinition d: derived.values()){
	    					d.setPartOfDefinitionModule(cd.getDsdModuleDefinition());
	    				}
	    			}
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
     * @return the domain specific definition modules
     */
    public Iterator<DSDefinitionModule> getDSDefinitionModules(){
    	return(definitionModuleDefs.values().iterator());
    }
    
    public int getDSDefinitionModulesCount(){
    	return(definitionModuleDefs.size());
    }

    /**
     * @return the defined extended references.
     */
    public Iterator<ExtendedReferenceTypeDefinition> getExtendedReferenceTypes(){
    	return(extendedReferenceTypeDefs.values().iterator());
    }

	@Override
	public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
		DmcNamedObjectIF rc = null;
		DotName dn = null;
		try {
			
			dn = new DotName(name.getNameString() + "." + ai.type);
			
//			DebugInfo.debug("LOOKING FOR: *" + dn + "*" + "   clashMap: " + System.identityHashCode(clashMAP));
						
//	    	if (dn.getNameString().equals("ClassDefinition.ClassDefinitionREF")){
		    if (dn.getNameString().equals("ClassDefinition.ClassDefinition")){
	    		
//	    		DebugInfo.debug("\n\nHACK HACK HACK\n\n");
//	    		DebugInfo.debug(DebugInfo.getCurrentStack());
		    	// HACK HACK HACK
		    	// When we added actual support for the __objectClass attribute in DmcObject, we
		    	// got into a bit of trouble with the meta schema. We needed to resolve the objectClass,
		    	// but we hadn't yet loaded the ClassDefinition for ClassDefinition! We circumvent this
		    	// issue here by directly accessing the the meta schema's instantiated ClassDefinition.
	    		return(MetaSchema._ClassDefinition);
	    	}
//	    	else if (name.getNameString().equals("meta")){
//	    		// And another bit of magic - the class definitions of the metaSchema are
//	    		// loaded before the schema definition for the meta schema
//	    		return(MetaSchema._metaSchema);
//	    	}
			
			// We hunt for the definition in the possibly clashing map first. If we find it
			// and there's only one entry (the usual case) we're done. Otherwise, we'll have 
			// to call on the clash resolver.
			ArrayList<DmsDefinition> defs = clashMAP.get(dn);
			if (defs == null){
				// We couldn't find the definition based on just definition.type, so it may 
				// have been specified as module.definition (to which we've added the type)
				// to get the fully qualified name - so now search for that.
				rc = globallyUniqueMAP.get(dn);
				
//				if (rc != null)
//					DebugInfo.debug("FOUND IN GLOBAL MAP = " + dn);
//				else
//					DebugInfo.debug("NOT FOUND IN GLOBAL MAP = " + dn);
				
				// If rc is null at this point, that's fine, it's an unresolved reference
			}
			else{
				if (defs.size() == 1){
//					DebugInfo.debug("FOUND IN CLASH MAP = " + dn);
					rc = defs.get(0);
				}
				else{
					DmcNameClashObjectSet<DmsDefinition> nce = new DmcNameClashObjectSet<DmsDefinition>(defs);
					
					rc = resolver.resolveClash(object, ai, nce);
				}
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if (rc == null)
//			DebugInfo.debugWithTrace("    Couldn't find: " + dn + "\n");
		
		return(rc);
	}

	/**
	 * We implement this because we need to pass in a clash resolver when we resolve
	 * schema references on auto-generated schemas. There shouldn't be clashes, but
	 * there could be if someone is combining schemas that have been generated in
	 * entirely different environments.
	 * @param obj
	 * @param attr
	 * @param ex
	 * @return
	 * @throws DmcValueException
	 */
	@Override
	public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
		DmcNamedObjectIF rc = null;
		Iterator<DmcNamedObjectIF> matches = ncos.getMatches();
		
		DebugInfo.debug("\nResolving " + ai.name + " in:\n\n" + obj.toOIF() + "\n");
		
		obj.getConstructionClassInfo().getAttributeInfo(ai.name);
		
		if (obj instanceof DmsDefinitionDMO){
			// We're resolving references within a set of definitions, if we aren't, there's not much we can do
			DmsDefinitionDMO defObj = (DmsDefinitionDMO) obj;
			
			while(matches.hasNext()){
				DmcNamedObjectIF objif = matches.next();
				
				DebugInfo.debug(objif.toString());
				if (objif instanceof DmsDefinitionDMO){
					DmsDefinitionDMO matchDef = (DmsDefinitionDMO) objif;
					if (defObj.getDefinedIn().getObjectName().getNameString().equals(matchDef.getDefinedIn().getObjectName().getNameString())){
						rc = matchDef;
						break;
					}
					
				}
				else if (objif instanceof DmsDefinition){
					DmsDefinition matchDef = (DmsDefinition) objif;
					
					if (defObj.getDefinedIn().getObjectName().getNameString().equals(matchDef.getDefinedIn().getName().getNameString())){
						rc = matchDef;
						break;
					}
				}
			}
		}
		return(rc);
	}

	@Override
	public DmcObject findUniqueObject(DmcObjectName name) {
		// TODO Auto-generated method stub
		return null;
	}

}

