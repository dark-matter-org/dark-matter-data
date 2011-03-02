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
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.exceptions.ResultSet;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Dictionary;
import org.dmd.util.parsing.DmcUncheckedObject;
import org.dmd.util.parsing.Token;

/**
 * The SchemaManager class manages the elements that comprise schemas: types, attributes,
 * classes and schemas themselves.
 */

public class SchemaManager implements DmcNameResolverIF {

    /**
     * The schema of classes that are used to describe schemas.
     */
    SchemaDefinition  							meta;

    /**
     * This map contains all type, attribute, class and schema definitions keyed on
     * their respective name attributes.
     * Key: String
     * Value: TypeDefinition, ClassDefinition, AttributeDefinition, ActionDefinition, SchemaDefinition, EnumDefinition
     */
    public HashMap<String,DmsDefinition>    	allDefs;

    /**
     * This map contains all enum  definitions keyed on their respective name attributes.
     * Key: String
     * Value: DmdEnumValueDef
     */
    public HashMap<String,EnumDefinition>     	enumDefs;
    public int  longestEnumName;

    /**
     * This map contains all type definitions keyed on their respective name attributes.
     * Key: String
     * Value: TypeDefinition
     */
    public HashMap<String,TypeDefinition>     	typeDefs;
    public int  longestTypeName;

    /**
     * This map contains all attribute definitions keyed on their respective name attributes.
     * Key: String
     * Value: AttributeDefinition
     */
    public HashMap<String,AttributeDefinition>	attrDefs;
    public int  longestAttrName;
    
    public TreeMap<Integer,AttributeDefinition>	attrByID;

    /**
     * This map contains all action definitions keyed on their respective name attributes.
     * Key: String
     * Value: ActionDefinition
     */
    public HashMap<String,ActionDefinition>     actionDefs;
    public int  longestActionName;

    /**
     * This map contains all class definitions keyed on their respective name attributes.
     * Key: String
     * Value: ClassDefinition
     */
    public HashMap<String,ClassDefinition>     classDefs;
    public int  longestClassName;

    /**
     * This map contains all class abbreviations.
     * Key:   String
     * Value: ClassDefinition
     */
    public HashMap<String,ClassDefinition>     classAbbrevs;

    /**
     * This map contains all attribute abbreviations.
     * Key:   String
     * Value: ClassDefinition
     */
    public HashMap<String,AttributeDefinition>	attrAbbrevs;

    /**
     * This map contains all repository names.
     * Key:   String
     * Value: AttributeDefinition
     */
    public HashMap<String,DmsDefinition>     	reposNames;

    /**
     * This map contains all schema definitions keyed on their respective name attributes.
     * Key:   String (schema name)
     * Value: SchemaDefinition
     */
    TreeMap<String,SchemaDefinition>     		schemaDefs;
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
    
    // Counter for assigning dmdID to attributes if required
    static int									uniqueID;

    /**
     * Creates a new SchemaManager.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public SchemaManager() throws ResultException, DmcValueException {
        // Create our various hashmaps
        allDefs     = new HashMap<String,DmsDefinition>();
        enumDefs 	= new HashMap<String,EnumDefinition>();
        typeDefs    = new HashMap<String,TypeDefinition>();
        attrDefs    = new HashMap<String,AttributeDefinition>();
        attrByID	= new TreeMap<Integer, AttributeDefinition>();
        actionDefs  = new HashMap<String,ActionDefinition>();
        classDefs   = new HashMap<String,ClassDefinition>();
        schemaDefs  = new TreeMap<String,SchemaDefinition>();
        classAbbrevs= new HashMap<String,ClassDefinition>();
        attrAbbrevs = new HashMap<String,AttributeDefinition>();
        reposNames  = new HashMap<String,DmsDefinition>();
        dict        = null;
        extensions	= new TreeMap<String, SchemaExtensionIF>();
        
        uniqueID = 1;

        // Create the global metaschema
        if (MetaSchema._metaSchema == null)
            meta = new MetaSchema();
        else
            meta = MetaSchema._metaSchema;

        ((MetaSchema)meta).setSchemaManager(this);

        /**
         * TODO set debug levels
         */
//        ((MetaSchema)meta).traceLog.setDebugLevels(MetaSchema._DEBUGE.getIntToStringMap().size(),MetaSchema._DEBUGE.getIntToStringMap().values().iterator());

//        if (rs.worst() == Result.NONE){
            // There should be no warnings/errors during the creation of the
            // meta-schema

            // Manage the meta schema so that we have a starting point for schema management
            manageSchemaInternal(meta);
//        }
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
    @SuppressWarnings("unchecked")
	public void schemaPreAdd(DmcUncheckedObject sd) throws ResultException, DmcValueException {
    	DmcAttribute attr = sd.get(MetaSchema._schemaExtension.getName());
    	
     	if (attr != null){
    		Class extclass;
    		Iterator<String> extList = attr.getMV();
    		
    		while(extList.hasNext()){
    			String ext = extList.next();
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
    @SuppressWarnings("unchecked")
	private void loadGeneratedSchema(SchemaDefinition sd) throws ResultException, DmcValueException {
    	
    	DebugInfo.debug(sd.getClass().getName());
    	
    	for(String schemaName : sd.dependsOnSchemaClasses.keySet()){
    		String schemaClassName = sd.dependsOnSchemaClasses.get(schemaName);
    		
			SchemaDefinition depSchema = isSchema(schemaName);
			
			if (depSchema == null){
				Class schemaClass = null;
				
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
    	
    	DebugInfo.debug(sd.getName() + " is being managed...\n");
    	
        manageSchemaInternal(theInstance);
        resolveReferences(theInstance);

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
    	if (sd.isGeneratedSchema()){
    		// This method will automatically instantiate/load any schemas on which the
    		// specified schema depends.
    		loadGeneratedSchema(sd);
    	}
    	else{
    		manageSchemaInternal(sd);
    	}
    }
    
    /**
     * This function integrates a new set of definitions into the schema manager.
     * @param sd The schema definition to be managed.
     * @throws DmcValueException 
     * @throws DmcValueExceptionSet 
     */
    public void manageSchemaInternal(SchemaDefinition sd) throws ResultException, DmcValueException {
        ClassDefinition         		cd  = null;
        EnumDefinition     				evd = null;
        TypeDefinition          		td  = null;
        AttributeDefinition     		ad  = null;
        ActionDefinition        		actd= null;
        Iterator<ActionDefinition>		itACD  = null;
        Iterator<AttributeDefinition>	itATD  = null;
        Iterator<ClassDefinition>		itCD  = null;
        Iterator<EnumDefinition>		itEVD  = null;
        Iterator<TypeDefinition>		itTD  = null;

        currentSchema       = sd;
        // schemaDefs.put(sd.getName(),sd);

//System.out.println("The schema object:\n\n" + sd.toOIF(20) + "\n\n");

        if ( (itTD = sd.getTypeDefList()) != null){
            while(itTD.hasNext()){
                td = itTD.next();
                this.addType(td);
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
        return((TypeDefinition)typeDefs.get(name));
    }

    /**
     * This function indicates if the specified string the name of an AttributeDefinition.
     * @param name the name of a suspected attribute definition.
     * @return If the name is an attribute, its AttributeDefinition is returned; otherwise null is returned.
     */
    public AttributeDefinition isAttribute(String name){
        return((AttributeDefinition)attrDefs.get(name));
    }

    /**
     * This function indicates if the specified string the name of an ActionDefinition.
     * @param name the name of a suspected action definition.
     * @return If the name is an action, its ActionDefinition is returned; otherwise null is returned.
     */
    public ActionDefinition isAction(String name){
        return((ActionDefinition)actionDefs.get(name));
    }

    /**
     * This function indicates if the specified string the name of a ClassDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a class, its ClassDefinition is returned; otherwise null is returned.
     */
    public ClassDefinition isClass(String name){
        return((ClassDefinition)classDefs.get(name));
    }

    /**
     * This function indicates if the specified string the name of a SchemaDefinition.
     * @param name the name of a suspected class definition.
     * @return If the name is a schema, its SchemaDefinition is returned; otherwise null is returned.
     */
    public SchemaDefinition isSchema(String name){
        return((SchemaDefinition)schemaDefs.get(name));
    }

    /**
     * This function indicates if the specified string the name of any class,
     * attribute or type definition.
     * @param name the name of a suspected definition.
     * @return If the name is that of any kind of definition, the definition is
     * returned as a generic object; otherwise null is returned.
     */
    public DmsDefinition isDefinition(String name){
        return(allDefs.get(name));
    }

    /**
     * Adds the specified schema definition if it doesn't already exist.
     * @throws DmcValueException 
     */
    void addSchema(SchemaDefinition sd) throws ResultException, DmcValueException {
//DebugInfo.debug("    addSchema " + sd.staticRefName);
// System.out.println("    the name " + sd.getName());
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

        if (sd.getObjectName().length() > longestSchemaName)
            longestSchemaName = sd.getObjectName().length();

        currentSchema = null;
        
        if (extensions.size() > 0){
        	for(SchemaExtensionIF ext : extensions.values()){
        		ext.addSchema(sd);
        	}
        }

    }

    /**
     * Adds the specified class definition to the schema it doesn't already exist.
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
            if (checkAndAdd(cd.getAbbrev(),cd,classDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(cd.getAbbrev(),cd,classDefs,"class abbreviations"));
            	throw(ex);
            }
            if (checkAndAdd(cd.getAbbrev(),cd,allDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(cd.getAbbrev(),cd,allDefs,"definition names"));
            	throw(ex);
            }
            classAbbrevs.put(cd.getAbbrev(),cd);
        }
        
     // reposName moved to the DMR SCHEMA
//        if (cd.getReposName() != null){
//            // We have a repository name - so it must also be unique and
//            // added to the appropriate maps
//            if (checkAndAdd(cd.getReposName(),cd,classDefs) == false){
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsg(cd.getObjectName(),cd,classDefs,"repository names"));
//            	throw(ex);
//            }
//            if (checkAndAdd(cd.getReposName(),cd,allDefs) == false){
//            	ResultException ex = new ResultException();
//            	ex.addError(clashMsg(cd.getObjectName(),cd,allDefs,"definition names"));
//            	throw(ex);
//            }
//            reposNames.put(cd.getReposName(),cd);
//        }

        if (cd.getObjectName().length() > longestClassName)
            longestClassName = cd.getObjectName().length();

        // Another bit of trickiness here. We don't resolve references for the entire schema
        // until we've loaded the whole thing, but, in this case, we need to pre-resolve
        // the ClassDefinition - which should be okay, because classes are the last things
        // that're loaded.
        try {
			cd.resolveReferences(this);
		} catch (DmcValueExceptionSet e) {
			ResultException ex = new ResultException();
			ex.addError("Unresolved references in ClassDefinition: " + cd.getName());
			ex.setLocationInfo(cd.getFile(), cd.getLineNumber());
			
			for(DmcValueException dve : e.getExceptions()){
				ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
			}
			throw(ex);
		}
        
        if (cd.getDerivedFrom() != null){
            cd.getDerivedFrom().updateDerived(cd);
        }
        
        cd.setDmoImport(cd.getDefinedIn().getSchemaPackage() + ".generated.dmo." + cd.getName() + "DMO");
        
        cd.setDmwImport(cd.getDefinedIn().getSchemaPackage() + ".generated.dmw." + cd.getName() + "DMW");
        cd.setDmwClass(cd.getName() + "DMW");
        
        cd.setDmtImport(cd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + cd.getName() + "REF");
        cd.setDmtClass(cd.getName() + "REF");
        
        cd.setDmeImport(cd.getDefinedIn().getSchemaPackage() + ".extended." + cd.getName());
        cd.setDmeClass(cd.getName());
        
        if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
        	cd.setDmoAuxClass(cd.getName() + "DMO");
        	cd.setDmoAuxClassImport(cd.getDefinedIn().getSchemaPackage() + ".generated.auxw." + cd.getName() + "DMO");
        	
        	if (cd.getDefinedIn().getDmwPackage() != null){
            	cd.setDmwAuxClass(cd.getName());
            	cd.setDmwAuxClassImport(cd.getDefinedIn().getDmwPackage() + ".generated.auxw." + cd.getName());
        	}
        }
        
        cd.updateImplemented();

        // And now, set the java class that will be used with the DmwObjectFactory
        if (cd.getJavaClass() == null){
        	if (cd.getUseWrapperType() == WrapperTypeEnum.BASE)
        		cd.setJavaClass(cd.getDmwImport());
        	else if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED)
        		cd.setJavaClass(cd.getDmeImport());
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
        
        if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
	        // Things get a little tricky here - we want to be able to refer to objects without
	        // having to manually define wrapper types for them, so we create internal TypeDefinitions
	        // for them. The internal type is DmcType<classname>REF.
	        
        	
//DebugInfo.debug(cd.toOIF(20));
	        TypeDefinition td  = new TypeDefinition();
	        td.addObjectClass(MetaSchemaAG._TypeDefinition);
	        
	        td.setInternallyGenerated(true);
	        td.setName(cd.getName());
	        td.setDescription("This is an internally generated type to allow references to " + cd.getName() + " values.");
	        td.setIsEnumType(false);
	        td.setIsRefType(true);
	        
//	        td.setIsTransportable(cd.getIsTransportable());
	        
	        if (cd.getIsNamedBy() != null){
	        	// We only need a help class when we have named objects - regular old object references
	        	// can get by without this
	        	td.setHelperClassName(cd.getDefinedIn().getSchemaPackage() + ".generated.types." + cd.getName() + "REF");
	        }
	        
	        td.setTypeClassName(cd.getDmtImport());
//	        td.setTypeClassName(cd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + cd.getName() + "REF");
	        td.setPrimitiveType(cd.getDmoImport());
//	        td.setPrimitiveType(cd.getDefinedIn().getSchemaPackage() + ".generated.dmo." + cd.getName() + "DMO");
	        td.setDefinedIn(cd.getDefinedIn());
	        
	        if (cd.getJavaClass() != null){
	        	// Tricky stuff needed for code generation. If the ClassDefinition has a javaClass specified,
	        	// it means that the object is wrapped and we need this javaClass to know what the auxHolder
	        	// type should be in the generated wrapper class.
	        	td.setAuxHolderImport(cd.getJavaClass());
	        }
	        
	        // Set a reference to the original class so that we can get any of its info
	        // if required.
	        td.setOriginalClass(cd);

	        // Set the class's internally generated type so that we can resolve references
	        // to the class used as a type
	        cd.setInternalTypeRef(td);
	        
	        // We add the new type to the schema's list of internally generated types
	        cd.getDefinedIn().addInternalTypeDefList(td);
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
        
//        if (ad.getDmdID() == null)
//        	ad.setDmdID(uniqueID++);
//        
//    	DebugInfo.debug(ad.getName() + " " + ad.getDmdID());
//        
//    	if (attrByID.get(ad.getDmdID()) != null){
//        	ResultException ex = new ResultException();
//        	ex.addError(clashMsg(ad.getDmdID(),ad,attrByID,"dmdID"));
//        	throw(ex);
//        }
//        attrByID.put(ad.getDmdID(), ad);
        
        if (ad.getAbbrev() != null){
            // We have an abbreviation - so it must also be unique and
            // added to the appropriate maps
            if (checkAndAdd(ad.getAbbrev(),ad,attrDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(ad.getObjectName(),ad,attrDefs,"attribute abbreviation"));
            	throw(ex);
            }
            if (checkAndAdd(ad.getAbbrev(),ad,allDefs) == false){
            	ResultException ex = new ResultException();
            	ex.addError(clashMsg(ad.getObjectName(),ad,allDefs,"definition names"));
            	throw(ex);
            }
            attrAbbrevs.put(ad.getAbbrev(),ad);
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

        if (ad.getObjectName().length() > longestAttrName)
            longestAttrName = ad.getObjectName().length();
        
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
        if (checkAndAdd(td.getObjectName(),td,allDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(td.getObjectName(),td,allDefs,"definition names"));
            throw(ex);
        }

        if (td.getObjectName().length() > longestTypeName)
            longestTypeName = td.getObjectName().length();
        
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
    	else if (def instanceof SchemaDefinition)
    		this.addSchema((SchemaDefinition) def);
        else{
        	ResultException ex = new ResultException();
        	ex.addError("The specified object is not a DMD object: " + def.getObjectName());
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
     * Adds the specified attribute definition to the schema it doesn't already exist.
     * @throws DmcValueException 
     */
    boolean addEnum(EnumDefinition evd)  throws ResultException, DmcValueException {
        if (checkAndAdd(evd.getObjectName(),evd,enumDefs) == false){
        	ResultException ex = new ResultException();
        	ex.addError(clashMsg(evd.getObjectName(),evd,enumDefs,"enum value names"));
            throw(ex);
        }
        
        // Things get a little tricky here - although EnumDefinitions are enums, they get
        // turned into internally generated TypeDefinitions, so we don't add them to the
        // allDefs map as EnumDefinitions.
        
        TypeDefinition td  = new TypeDefinition();
        td.setInternallyGenerated(true);
        td.setName(evd.getName());
        td.setDescription("This is an internally generated type to allow references to " + evd.getName() + " values.");
        td.setIsEnumType(true);
        td.setTypeClassName(evd.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + evd.getName());
        td.setPrimitiveType(evd.getDefinedIn().getSchemaPackage() + ".generated.enums." + evd.getName());
        td.addObjectClass(MetaSchemaAG._TypeDefinition);
        td.setDefinedIn(evd.getDefinedIn());
        
        
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

        if (evd.getObjectName().length() > longestEnumName)
            longestActionName = evd.getObjectName().length();
        
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

        if (actd.getObjectName().length() > longestActionName)
            longestActionName = actd.getObjectName().length();

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

//    /**
//     * Attempts to add the specified generic object, assuming that it is a
//     * class, attribute, type or schema definition.
//     * @returns true If the object is an ClassDefinition, AttributeDefinition,
//     * TypeDefinition or SchemaDefinition and the definition isn't currently defined.
//     * Otherwise returns false.
//     */
//    public void addDefinition(GenericObject obj) throws ResultException {
//        ClassDefinition cd = obj.getConstructionClass();
//
//        if (cd == MetaSchema._AttributeDefinition)
//            this.addAttribute((AttributeDefinition)obj);
//        else if (cd == MetaSchema._ClassDefinition)
//            this.addClass((ClassDefinition)obj);
//        else if (cd == MetaSchema._ActionDefinition)
//            this.addAction((ActionDefinition)obj);
//        else if (cd == MetaSchema._TypeDefinition)
//            this.addType((TypeDefinition)obj);
//        else if (cd == MetaSchema._EnumDefinition)
//            this.addEnum((EnumDefinition)obj);
//        else if (cd == MetaSchema._SchemaDefinition)
//            this.addSchema((SchemaDefinition)obj);
//        else{
//        	ResultException ex = new ResultException();
//        	ex.addError("The specified object is not a DMD object: " + obj.getName());
//        	throw(ex);
//        }
//
//    }

    /**
     * This function checks to see whether the specified key exists in the hashmap. If not,
     * the key and the obj are added.
     * @param key the key of the object being checked for
     * @param obj the object that may be adde to the map
     * @param map the map that may be updated
     * @returns false if the key already exists and true otherwise
     */
//    private boolean checkAndAdd(Object key, Object obj, HashMap map){
    @SuppressWarnings("unchecked")
	private boolean checkAndAdd(String key, DmsDefinition obj, HashMap map){
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
	private boolean checkAndAdd(Object key, Object obj, TreeMap map){
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
        TreeMap<String,AttributeDefinition> sattrs = new TreeMap<String, AttributeDefinition>();
        
        for(AttributeDefinition ad : attrDefs.values())
        	sattrs.put(ad.getName(), ad);
        
        for(AttributeDefinition ad : sattrs.values())
            sb.append(format.sprintf(ad.getObjectName()) + ad.getDefinedIn().getName() + "\n");
        

        sb.append("*** Classes\n");
        TreeMap<String,ClassDefinition> scdefs = new TreeMap<String, ClassDefinition>();
        
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

    /**
     * Returns the definition with the specified name if it exists.
     */
    public DmcNamedObjectIF findNamedObject(String name){
        return((DmcNamedObjectIF)allDefs.get(name));
    }

    /**
     * If the global dictionary hasn't been created, it's generated from the
     * hash of all identifiers.
     */
    public Dictionary getDict(){
        if (dict == null){
            Iterator<String>    it  = allDefs.keySet().iterator();
            int         id = Token.CUSTOM+1;
            String      key = null;

            dict = new Dictionary();
            while(it.hasNext()){
                key = (String)it.next();
                dict.add(new Token(key,id++,allDefs.get(key)));
            }
        }
        return(dict);
    }

//    /**
//     * Performs the initializeDefs() on the specified schemas in the appropriate
//     * order, taking into account dependencies.
//     * @param schemas A HashMap of schemas keyed on the schema name with an SchemaDefinition
//     * as the value. The schema def should have had the initialize() method called
//     * on it previously.
//     */
//    public void initializeDefs(ResultSet rs, HashMap<String,SchemaDefinition> schemas) throws ResultException {
//        Iterator<SchemaDefinition>    it  = schemas.values().iterator();
//
////System.out.println("SchemaManager.initializeDefs() ==>");
///**
// * TODO implement proper schema tracing        
// */
////        if (MetaSchema.traceLog.debugLevelEnabled(DmdDebugEnumAG.IMDSCHEMA))
////            System.out.println("Initializing defs for all schemas...");
//
//        while(it.hasNext()){
//            SchemaDefinition sd = (SchemaDefinition)it.next();
//
//            if (!sd.defsComplete()){
//                initSchemaDefs(schemas,sd);
//            }
//        }
//
////        if (MetaSchema.traceLog.debugLevelEnabled(DmdDebugEnumAG.)
////System.out.println(rs.toString());
//
////System.out.println("SchemaManager.initializeDefs() <== rc = " + rc);
//    }

//    /**
//     * This function initializes the definitions for the specified schema and
//     * recursively calls itself to ensure that the schemas that this schema depends
//     * on are initialized.
//     */
//    void initSchemaDefs(HashMap<String,SchemaDefinition> allSchemas, SchemaDefinition schema) throws ResultException {
////DebugInfo.debug("SchemaManager.initSchemaDefs() ==>");
//        if (schema.defsComplete()){
////DebugInfo.debug("    Initialization already complete for " + schema.getName());
//        }
//        else{
////DebugInfo.debug("    Initializing defs for schema: " + schema.getName());
//
//        	/**
//        	 * TODO implement proper schema tracing        
//        	 */
////            MetaSchema.traceLog.milestone("Initializing defs for schema: " + schema.getName());
//            Iterator<String>    it  = schema.getDependsOn();
//
//            if (it != null){
////DebugInfo.debug("    - have dependencies ");
//                while(it.hasNext()){
//                    String          sn = it.next();
////DebugInfo.debug("    - depends on " + sn);
//                    SchemaDefinition    sd = (SchemaDefinition) allSchemas.get(sn);
//
//                    if (sd == null){
//                        // The schema wasn't included in this set of schemas
//                        // being added, so check to see if it has already been
//                        // managed.
//                        sd = this.isSchema(sn);
//                    }
//                    if (sd == null){
////DebugInfo.debug("    - missing schema: " + sn);
//                        // A required schema hasn't been loaded
//                    	ResultException ex = new ResultException();
//                    	ex.addError("Schema " + schema.getObjectName() + " depends on schema " + sn + " that hasn't been loaded.");
//                    	throw(ex);
//                    }
//                    else{
////DebugInfo.debug("    - checking " + sd.getName());
//                        initSchemaDefs(allSchemas,sd);
//                    }
//                }
//            }
//            
//            schema.initializeDefs();
//        }
//    }


    /**
     * Returns a nice error message for a clashing definition name.
     */
    String clashMsg(String defName, DmsDefinition newDef, HashMap<String, ? extends DmsDefinition> defMap, String defType){
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
    String clashMsg(String defName, DmsDefinition newDef, TreeMap<String, ? extends DmsDefinition> defMap, String defType){
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
        	/**
        	 * TODO proper schema tracing
        	 */
//            MetaSchema.traceLog.error("Attribute definition not found - corresponding schema may not be loaded: " + n);
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
    public ClassDefinition cdef(String n){
        ClassDefinition rc = isClass(n);
        if (rc == null){
        	/**
        	 * TODO proper schema tracing
        	 */
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
        	/**
        	 * TODO proper schema tracing
        	 */
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
        	/**
        	 * TODO proper schema tracing
        	 */
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
    @SuppressWarnings("unchecked")
	public void resolveReferences(SchemaDefinition sd) throws ResultException {
    	
//    	DebugInfo.debug("Resolving types in attributes...");
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
    			DmcAttribute attr = d.getDmcObject().get("type");
    			
    			if (attr == null){
					ResultException ex = new ResultException();
					ex.addError("The AttributeDefinition " + d.getName() + " has no type attribute.");
					ex.result.lastResult().fileName(d.getFile());
					ex.result.lastResult().lineNumber(d.getLineNumber());
					throw(ex);
    			}
    			
    			DmcNamedObjectREF ref = (DmcNamedObjectREF) attr.getSV();
    			
    			// It might be a "real" type, so try that first
    			TypeDefinition td = tdef(ref.getObjectName());
    			
    			if( td == null){
    				ClassDefinition cd = cdef(ref.getObjectName());
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
    	
    	
//    	DebugInfo.debug("Resolving actions...");
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
						ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
//    	DebugInfo.debug("Resolving attributes...");
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
						ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
//    	DebugInfo.debug("Resolving classes...");
    	Iterator<ClassDefinition> cdl = sd.getClassDefList();
    	if (cdl != null){
    		while(cdl.hasNext()){
    			ClassDefinition d = cdl.next();
    			try {
					d.resolveReferences(this);
				} catch (DmcValueExceptionSet e) {
					ResultException ex = new ResultException();
					ex.addError("Unresolved references in ClassDefinition: " + d.getName());
					ex.setLocationInfo(d.getFile(), d.getLineNumber());
					
					for(DmcValueException dve : e.getExceptions()){
						ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
//    	DebugInfo.debug("Resolving enums...");
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
						ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
//    	DebugInfo.debug("Resolving types...");
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
						ex.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
					}
					throw(ex);
				}
    		}
    	}
    	
    	
    	
//    	DebugInfo.debug("\n" + sd.toOIF(15));
    }
    
}

