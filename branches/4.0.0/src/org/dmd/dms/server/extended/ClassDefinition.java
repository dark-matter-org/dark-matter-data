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
package org.dmd.dms.server.extended;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.schema.DmcClassInfo;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.dms.server.generated.dmw.ClassDefinitionDMW;
import org.dmd.dms.shared.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;
import org.dmd.dms.shared.generated.dmo.RuleDataDMO;
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;
import org.dmd.dms.shared.generated.enums.WrapperTypeEnum;
import org.dmd.dms.shared.generated.types.DmwTypeToWrapperType;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;


public class ClassDefinition extends ClassDefinitionDMW {

	// The shortest name for this class
    String shortest;

    /**
     * This Class is set to contain an instance of the correct DmcObject
     * subclass to store data associated with this class definition.
     */
	Class<?>       genobjclass;
    
	Class<?>		dmoClass;

    /**
     * Maintains a hash of all attributes supported by this class. It is
     * only initialized if the hasAttribute() function is called.
     * Key:   String - attribute name
     * Value: AttributeDefinition
     */
    TreeMap<DefinitionName,AttributeDefinition>     attrMap;
    
    // The fullAttrMap maintains the complete set of attributes supported by this
    // clas and any of it parent classes.
    // Key: attribute name
    TreeMap<DefinitionName,AttributeDefinition>		fullAttrMap;

    /**
     * Stores the definitions of required attributes whose dataType is PERSISTENT,
     * just for this class.
     */
    ArrayList<AttributeDefinition>   		persistentMust;

    /**
     * Stores the definitions of required attributes whose dataType is PERSISTENT,
     * for this class and all its base classes.
     */
    ArrayList<AttributeDefinition>   		allPersistentMust;

    /**
     * Stores the definitions of optional attributes whose dataType is PERSISTENT,
     * for this class and all its base classes.
     */
    ArrayList<AttributeDefinition>   		persistentMay;

    /**
     * Stores the definitions of optional attributes whose dataType is PERSISTENT,
     * just for this class.
     */
    ArrayList<AttributeDefinition>   allPersistentMay;

    /**
     * Stores the definitions of attributes whose dataType is CACHED.
     */
    ArrayList<AttributeDefinition>   cached;

    /**
     * Stores the definitions of attributes whose dataType is ONDEMAND for
     * this class and the classes from which it is derived.
     */
    ArrayList<AttributeDefinition>   allOnDemand;

    /**
     * Stores the definitions of attributes whose dataType is TRANSIENTREPLICATED
     * for this class and the classes from which it is derived.
     */
    ArrayList<AttributeDefinition>   allTransReplicated;

    /**
     * Stores the definitions of attributes whose dataType is TRANSIENT or CACHED
     * for this class and the classes from which it is derived.
     */
    ArrayList<AttributeDefinition>   allTransientAndCached;

    /**
     * Stores the definitions of all mustHave attributes for this class and
     * the classes from which it is derived.
     */
    TreeMap<DefinitionName,AttributeDefinition>     allMust;

    /**
     * Stores the definitions of all mayHave attributes for this class and
     * the classes from which it is derived.
     */
    TreeMap<DefinitionName,AttributeDefinition>     allMay;

    /**
     * The complete list of the classes from which this class is derived.
     */
    ArrayList<ClassDefinition>   baseClasses;

    /**
     * All classes that are derived from this class, either immediately derived
     * or any number of levels down the inheritance hierarchy. The derivedClasses
     * attribute maintains a list of the immediate derivatives of a class.
     */
    TreeMap<DefinitionName,ClassDefinition>     allDerived;

    /**
     * The classes of objects that may be contained by this class of object if
     * the class is involved in a hierarchic structure.
     * Key:   String (class name)
     * Value: ClassDefinition
     */
    TreeMap<DefinitionName,ClassDefinition>     allowedSubcomps;

    /**
     * These are actions that have been attached from other schemas.
     */
    ArrayList<ActionDefinition>   attachedActions;

    /**
     * All actions defined for this class, either directly or via the
     * attachment mechanism.
     */
    HashMap<DefinitionName,ActionDefinition>     allActions;
    
    HashMap<String,DmwTypeToWrapperType>	wrapperTypeMap;

    /**
     * Contains a list of all implemented interfaces from the most generic to the most
     * specific ones
     */
    private ArrayList<ClassDefinition> allImplemented;
    private ArrayList<ClassDefinition> allImplementors;
        
    DefinitionName nameKey;
    
    // This is initialized in the SchemaAG for a class so that we can easily access it
    DmcClassInfo	classInfo;
    
    // Rules applied to this attribute within the scope of a particular class
    ArrayList<RuleDataDMO>		classRules;
    

    /**
     * Default constructor.
     */
    public ClassDefinition(){
    	super();
    	init();
    	classInfo = null;
    }
    
    public ClassDefinition(ClassDefinitionDMO obj, ClassDefinition cd){
    	super(obj,cd);
    	init();
    	classInfo = null;
    }
    
    /**
     * This constructor is used when instantiated the meta schema.
     * @param obj the DMO associated with this class definition.
     * @param dci the class info from the DMO compact schema
     */
    public ClassDefinition(ClassDefinitionDMO obj, DmcClassInfo dci){
    	super(obj);
    	init();
    	classInfo = dci;
    }
    
    /**
     * @return the DmcClassInfo that was associated with this definition when it was constructed as
     * part of the SchemaAG.
     */
    public DmcClassInfo getClassInfo(){
    	return(classInfo);
    }
    
    /**
     * @return the DmcClassInfo that was associated with this definition when it was constructed as
     * part of the SchemaAG.
     */
    public DmcClassInfo getDynamicClassInfo(){
    	if (classInfo == null){
    		DmcAttributeInfo na = null;
    		if (this.getIsNamedBy() != null){
    			na = this.getIsNamedBy().getAttributeInfo();
    		}
    		
    		if (getDerivedFrom() == null)
        		classInfo = new DmcClassInfo(getName().getNameString(), getDmoImport(), getDmdID(), getClassType(), getDataType(), null, na);
    		else
    			classInfo = new DmcClassInfo(getName().getNameString(), getDmoImport(), getDmdID(), getClassType(), getDataType(), getDerivedFrom().getDynamicClassInfo(), na);

    		if (getMaySize() > 0){
    			for(AttributeDefinition ad: getMay())
    				classInfo.addMay(ad.getAttributeInfo());
    		}

    		if (getMustSize() > 0){
    			for(AttributeDefinition ad: getMust())
    				classInfo.addMust(ad.getAttributeInfo());
    		}
    	}
    	return(classInfo);
    }
    
    /**
     * Checks if the specified class of object is a valid parent for this class of object.
     * @param parent The parent class.
     * @return true if it's an allowed parent.
     */
    public boolean allowsParent(ClassDefinition parent){
    	boolean rc = false;
    	
    	if (getAllowedParentsSize() > 0){
    		for(ClassDefinition cd: getAllowedParents()){
    			if (cd == parent){
    				rc = true;
    				break;
    			}
    		}
    	}
    	
    	return(rc);
    }
    
//    /**
//	 * Default constructor used in creating the meta schema.
//	 * @param mn The meta name of the definition.
//     * @throws DMFeedbackSet 
//	 */
//	protected ClassDefinition(String mn) throws DMFeedbackSet{
//		super(mn);
//		init();
//	}
	
    private void init(){
        attrMap = null;
        persistentMust  = null;
        persistentMay   = null;
        cached          = null;
        allOnDemand     = null;
        allMust         = null;
        allMay          = null;
        baseClasses     = null;
        allDerived      = null;
        allowedSubcomps = null;
        attachedActions = null;
        allActions      = null;
    	nameKey 		= new DefinitionName();
    }
    
    public AttributeDefinition hasAttribute(String name){
    	try {
			nameKey.setNameString(name);
		} catch (DMFeedbackSet e) {
			e.printStackTrace();
		}
    	return(hasAttribute(nameKey));
    }
    
    /**
     * @param name the name of an attribute.
     * @return true if the attribute is a must have attribute in this class and false otherwise.
     */
    public boolean isMust(DefinitionName name){
    	if (fullAttrMap == null)
    		getFullAttrMap();
    	
    	if (allMust.get(name) == null)
    		return(false);
    	else
    		return(true);
    }
    
    public boolean isAllowedAttribute(DefinitionName name){
    	if (fullAttrMap == null)
    		getFullAttrMap();
    	if (fullAttrMap.get(name) == null)
    		return(false);
    	return(true);
    }
    
    private void initAttrMap(){
        if (attrMap == null){
            Iterator<AttributeDefinition> it;
            AttributeDefinition ad;

            attrMap = new TreeMap<DefinitionName, AttributeDefinition>();
            if ( (it = this.getMust()) != null){
                while(it.hasNext()){
                    ad = (AttributeDefinition)it.next();
                    attrMap.put(ad.getName(),ad);
                }
            }

            if ( (it = this.getMay()) != null){
                while(it.hasNext()){
                    ad = (AttributeDefinition)it.next();
                    attrMap.put(ad.getName(),ad);
                }
            }
        }
    	
    }
    
    /**
     * Returns the attribute definition is this class uses the specified attribute.
     * @param attrName The attribute name.
     * @return The attribute definition or null if we don't have the attribute for this class.
     */
    public AttributeDefinition hasAttribute(DefinitionName attrName){
    	AttributeDefinition rc = null;

    	initAttrMap();
    	
//        if (attrMap == null){
//            Iterator<AttributeDefinition> it;
//            AttributeDefinition ad;
//
//            attrMap = new TreeMap<DefinitionName, AttributeDefinition>();
//            if ( (it = this.getMust()) != null){
//                while(it.hasNext()){
//                    ad = (AttributeDefinition)it.next();
//                    attrMap.put(ad.getName(),ad);
//                }
//            }
//
//            if ( (it = this.getMay()) != null){
//                while(it.hasNext()){
//                    ad = (AttributeDefinition)it.next();
//                    attrMap.put(ad.getName(),ad);
//                }
//            }
//        }

        if ( (rc = (AttributeDefinition)attrMap.get(attrName)) == null){
            // We couldn't find the attribute at this level. If we're
            // derived from another class, see if it has it.
            if (this.getDerivedFrom() != null){
                rc = this.getDerivedFrom().hasAttribute(attrName);
            }
        }

//        if (rc == null && this.getImplements() != null) {
//            for (Iterator<ClassDefinition> iter = this.getImplements(); iter.hasNext(); ) {
//                ClassDefinition id = iter.next();
//                if ((rc = id.hasAttribute(attrName)) != null) {
//                    break;
//                }
//            }
//        }

        return(rc);
    }
    
    /**
     * This method will populate the specified maps with the attribute information for this
     * class and any parent classes.
     * @param map
     */
    void initFullAttrMap(TreeMap<DefinitionName,AttributeDefinition> map, TreeMap<DefinitionName,AttributeDefinition> must, TreeMap<DefinitionName,AttributeDefinition> may){
        Iterator<AttributeDefinition> it;
        AttributeDefinition ad;

        if ( (it = this.getMust()) != null){
            while(it.hasNext()){
                ad = (AttributeDefinition)it.next();
                map.put(ad.getName(),ad);
                must.put(ad.getName(), ad);
            }
        }

        if ( (it = this.getMay()) != null){
            while(it.hasNext()){
                ad = (AttributeDefinition)it.next();
                map.put(ad.getName(),ad);
                may.put(ad.getName(), ad);
            }
        }
        if (this.getDerivedFrom() != null){
            this.getDerivedFrom().initFullAttrMap(map,must,may);
        }

    }
     
    public TreeMap<DefinitionName,AttributeDefinition> getAllMust(){
    	getFullAttrMap();
    	return(allMust);
    }
    
    public TreeMap<DefinitionName,AttributeDefinition> getAllMay(){
    	getFullAttrMap();
    	return(allMay);
    }
    
    /**
     * @return all must/may attributes just for this class
     */
    public TreeMap<DefinitionName,AttributeDefinition> getAllAttributesAtThisLevel(){
    	initAttrMap();
    	return(attrMap);
    }
    
    /**
     * @return the complete set of attributes for this class and all of its parent classes.
     */
    public TreeMap<DefinitionName,AttributeDefinition> getFullAttrMap(){
    	if (fullAttrMap == null){
    		fullAttrMap = new TreeMap<DefinitionName, AttributeDefinition>();
    		if (allMust == null)
    			allMust = new TreeMap<DefinitionName, AttributeDefinition>();
    		if (allMay == null)
    			allMay = new TreeMap<DefinitionName, AttributeDefinition>();
    		initFullAttrMap(fullAttrMap,allMust,allMay);
    	}
    	return(fullAttrMap);
    }

    /**
     * Updates the derivedClasses attribute and the allDerived map and, if
     * this class is derived from another, calls its updateAllDerived() function.
     * @throws DMFeedbackSet 
     */
    void updateDerived(ClassDefinition derived) throws DMFeedbackSet, DMFeedbackSet {
    	this.addDerivedClasses(derived);

        updateAllDerived(derived);
    }

    /**
     * Updates the complete set of derived classes and, if this class is derived,
     * passes the class up the hierarchy.
     */
    void updateAllDerived(ClassDefinition derived){
        if (allDerived == null)
            allDerived = new TreeMap<DefinitionName,ClassDefinition>();

        allDerived.put(derived.getObjectName(),derived);

        if (this.getDerivedFrom() != null)
            this.getDerivedFrom().updateAllDerived(derived);
    }

	/**
	 * Returns all implemented interfaces.
	 * @return A list of all implemented interfaces.
	 */
    public ArrayList<ClassDefinition> getAllImplemented() {
        return allImplemented;
    }

    /**
     * Updates the set of allowed subcomponents for this class.
     */
    void addSubcomp(ClassDefinition subcomp){
        if (allowedSubcomps == null)
            allowedSubcomps = new TreeMap<DefinitionName,ClassDefinition>();

        allowedSubcomps.put(subcomp.getObjectName(), subcomp);
    }

    /**
     * Returns the allderived variable which holds a Hashmap of all
     * classes that derive from this class
     */
    public TreeMap<DefinitionName,ClassDefinition> getAllDerived() {
    	if (allDerived == null)
    		updateAllDerived(this);
    	
        return allDerived;
    } 

    public ArrayList<ClassDefinition> getAllImplementors() {
        return allImplementors;
    }
    

    /**
     * Returns the set of allowed subcomponents for this class.
     */
    public TreeMap<DefinitionName,ClassDefinition> getAllowedSubcomps(){
        return(allowedSubcomps);
    }

    /**
     * This function instantiates a new instance of the object type defined
     * by this class definition.
     * @throws DMFeedbackSet 
     */
    public DmwWrapper newInstance() throws DMFeedbackSet
    {
    	DmwWrapper rc = null;

        if (genobjclass == null){
            // The first time we try to create an object this way, get our
            // object class so we can call Class.newInstance()
            try{
            	synchronized(this){	
	            	adjustJavaClass(getDMWPackage(),true);
	                genobjclass = Class.forName(this.getJavaClass());
				}
            }
            catch(Exception e){
            	DMFeedback	error = new DMFeedback("Couldn't load Java class: " + this.getJavaClass());
            	error.addToMessage(e.getMessage());
            	error.addToMessage(DebugInfo.extractTheStack(e));
            	DMFeedbackSet ex = new DMFeedbackSet(error);
                throw(ex);
            }
        }

        if (genobjclass != null){
        	if (this.getClassType() == ClassTypeEnum.ABSTRACT){
            	DMFeedbackSet ex = new DMFeedbackSet("Can't instantiate an ABSTRACT class: " + this.getObjectName());
                throw(ex);
            }
            else{
                try{
                    rc = (DmwWrapper) genobjclass.newInstance();
                }
                catch(Exception e){
                	DMFeedback	error = new DMFeedback("Couldn't instantiate Java class: " + this.getJavaClass());
                	error.addToMessage("This may be because the class doesn't have a constructor that takes no arguments.");
                	error.addToMessage(DebugInfo.getCurrentStack());
                	DMFeedbackSet ex = new DMFeedbackSet(error);
                	throw(ex);
                }
            }
        }

        return(rc);
    }

    /**
     * This function instantiates a new instance of the object type defined
     * by this class definition.
     * @throws DMFeedbackSet 
     */
    public DmcObject newDMOInstance() throws DMFeedbackSet
    {
    	DmcObject rc = null;

        if (dmoClass == null){
            // The first time we try to create an object this way, get our
            // object class so we can call Class.newInstance()
            try{
            	synchronized (this) {
                	dmoClass = Class.forName(this.getDmoImport());
				}
            }
            catch(Exception e){
            	DMFeedback	error = new DMFeedback("Couldn't load Java class: " + this.getJavaClass());
            	error.addToMessage(e.getMessage());
            	error.addToMessage(DebugInfo.extractTheStack(e));
            	DMFeedbackSet ex = new DMFeedbackSet(error);
                throw(ex);
            }
        }

        if (dmoClass != null){
        	if (this.getClassType() == ClassTypeEnum.ABSTRACT){
            	DMFeedbackSet ex = new DMFeedbackSet("Can't instantiate an ABSTRACT class: " + this.getObjectName());
                throw(ex);
            }
            else{
                try{
                    rc = (DmcObject) dmoClass.newInstance();
                }
                catch(Exception e){
                	DMFeedback	error = new DMFeedback("Couldn't instantiate Java class: " + this.getJavaClass());
                	error.addToMessage("This may be because the class doesn't have a constructor that takes no arguments.");
                	error.addToMessage(DebugInfo.getCurrentStack());
                	DMFeedbackSet ex = new DMFeedbackSet(error);
                	throw(ex);
                }
            }
        }

        return(rc);
    }
    
    /**
     * @param cd the class against which we're testing
     * @return true if we are the specific class or we're derived from it.
     */
    public boolean isInstanceOfThis(ClassDefinition cd){
    	boolean rc = false;
    	
    	if (this.getObjectName().getNameString().equals(cd.getName().getNameString()))
    		rc = true;
    	else{
    		ArrayList<ClassDefinition> classes = getBaseClasses();
    		
    		if (classes != null){
	    		for(ClassDefinition cdef: classes){
	    			if (cd.getObjectName().getNameString().equals(cdef.getName().getNameString())){
	    				rc = true;
	    				break;
	    			}
	    		}
    		}
    	}
    	
    	return(rc);
    }

    /**
     * Returns the complete set of base classes from which this class is derived.
     * @return The array of base classes or null if this class isn't derived from
     * any class.
     */
    public ArrayList<ClassDefinition> getBaseClasses(){
        if (baseClasses == null){
            if (this.getDerivedFrom() != null){
                baseClasses = new ArrayList<ClassDefinition>();
                ArrayList<ClassDefinition>   b = this.getDerivedFrom().getBaseClasses();

                if (b != null){
                    // Add in the base classes or our base class
                    for(int i=0; i<b.size(); i++)
                        baseClasses.add(b.get(i));
                }

                // Add in our base class
                baseClasses.add(getDerivedFrom());
            }
        }
        return(baseClasses);
    }
    

	/**
	 * Complicated stuff to handle generation of wrapper classes in packages other than where
	 * the DMOs are generated. This should only be used on internally generated type ref classes.
	 * @throws DMFeedbackSet  
	 */
	public void adjustJavaClass() {
		String genPackage = getDMWPackage();
		adjustJavaClass(genPackage,false);
	}

	/**
	 * Complicated stuff to handle generation of wrapper classes in packages other than where
	 * the DMOs are generated. This should only be used on internally generated type ref classes.
	 * @throws DMFeedbackSet  
	 */
	private void adjustJavaClass(String genPackage, boolean instantiating) {
		
		// If this is a schema related definition, don't fool with the class name
		// if we're instantiating an object
		if (instantiating && (getJavaClass().startsWith("org.dmd.dms")))
			return;
		
		if (getUseWrapperType() == WrapperTypeEnum.BASE){
			try {
				setJavaClass(genPackage + ".generated.dmw." + getName() + "DMW");
			} catch (DMFeedbackSet e) {
				e.printStackTrace();
			}
		}
		else if (getUseWrapperType() == WrapperTypeEnum.EXTENDED){
			try {
				if (getSubpackage() != null){
					setJavaClass(genPackage + ".extended." + getSubpackage() + "." + getName());
				}
				else
					setJavaClass(genPackage + ".extended." + getName());
			} catch (DMFeedbackSet e) {
				e.printStackTrace();
			}
		}
		else{
			return;
		}
		
		try {
			setDmwImport(getJavaClass());
		} catch (DMFeedbackSet e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * If the schema in which this class is defined has a dmwPackage attribute defined, this
	 * function returns that value.
	 * @return The dmwPackage or null is it isn't defined.
	 */
	public String getDMWPackage(){
		String rc = null;
		
		rc = getDefinedInDmsModule().getDmwPackage();
		
		return(rc);
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Complicated stuff to handle generation of wrapper classes in packages other than where
	 * the DMOs are generated for different generation contexts.
	 * @throws DMFeedbackSet  
	 */
	public void adjustJavaClass(String genContext, String genSuffix){
		String genPackage = getDmwPackage(genContext);
				
		if (getDmwWrapperType(genContext) == WrapperTypeEnum.BASE){
			try {
//				setJavaClass(genPackage + ".generated." + context + "." + getName() + "DMW");
				setJavaClass(genPackage + ".generated." + genContext + "." + getName() + genSuffix);
			} catch (DMFeedbackSet e) {
				e.printStackTrace();
			}
		}
		else if (getUseWrapperType() == WrapperTypeEnum.EXTENDED){
			try {
				if (getDefinedInDmsModule().getName().getNameString().equals(MetaDMSAG.instance().getSchemaName())){
					setJavaClass(genPackage + "." + getName());
					setDmeImport(genPackage + "." + getName());
				}
				else if (getSubpackage() != null){
					setJavaClass(genPackage + ".extended." + getSubpackage() + "." + getName());
					setDmeImport(genPackage + ".extended." + getSubpackage() + "." + getName());
				}
				else{
					setJavaClass(genPackage + ".extended." + getName());
					setDmeImport(genPackage + ".extended." + getName());
				}
			} catch (DMFeedbackSet e) {
				e.printStackTrace();
			}
		}
		else{
			return;
		}
		
		try {
			setDmwImport(getJavaClass());
		} catch (DMFeedbackSet e) {
			e.printStackTrace();
		}
	}
	
	public String getDmwPackage(String context){
		return(getDefinedInDmsModule().getDmwPackage(context));
	}
	
	public WrapperTypeEnum getDmwWrapperType(String context){
		if (wrapperTypeMap == null){
			wrapperTypeMap = new HashMap<String, DmwTypeToWrapperType>();
			Iterator<DmwTypeToWrapperType> it = getDmwWrapperTypeIterable();
			if (it != null){
				while(it.hasNext()){
					DmwTypeToWrapperType curr = it.next();
					DmwTypeToWrapperType existing = wrapperTypeMap.get(curr.getDmwType());
					if (existing != null)
						throw(new IllegalStateException("Multiple dmwWrapperType values with the same context on class " + getName()));
					wrapperTypeMap.put(curr.getDmwType(), curr);
				}
			}
			
			if (getUseWrapperType() == WrapperTypeEnum.EXTENDED){
				try {
					DmwTypeToWrapperType ttw = new DmwTypeToWrapperType("dmw", WrapperTypeEnum.EXTENDED);
					wrapperTypeMap.put(ttw.getDmwType(), ttw);
				} catch (DMFeedbackSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		DmwTypeToWrapperType existing = wrapperTypeMap.get(context);
		if (existing == null)
			return(WrapperTypeEnum.BASE);
		return(existing.getWrapperType());
	}
	
	/**
	 * Determines whether or not we want to generate a wrapper for this class of object
	 * in the specified context. We ascend the class hierarchy and return false if any
	 * of our base classes are excluded.
	 * @param context The context 
	 * @return true if we want to generate and false otherwise.
	 */
	public boolean generateWrapper(String context){
		boolean rc = true;
		
		if (getExcludeFromContextSize() > 0){
			DmcAttribute<?> exclude = getDMO().get(MetaDMSAG.__excludeFromContext);
			if (exclude.contains(context))
				rc = false;
		}
		
		if (rc && (getDerivedFrom() != null)){
			rc = getDerivedFrom().generateWrapper(context);
		}
		
		return(rc);
	}

	///////////////////////////////////////////////////////////////////////////////

	/**
     * Returns the shortest possible name for this class definition.
     */
    public String getShortestName(){
        if (shortest == null){
            shortest = getName().getNameString();
            if (getAbbrev() != null){
                // This might seem nuts, but we'll actually check which is shortest,
                // the name or the abbreviation. I've seen examples where the
                // abbreviation was longer.
                if (getAbbrev().length() < getName().getNameString().length())
                    shortest = getAbbrev();
            }
        }
        return(shortest);
    }    
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * This method is used in conjunction with the rule instantiation mechanisms.
     * It will determine whether or not additional type imports are required for
     * an extensible rule class, for example, the InitRule. These imports are
     * required because we have to use the basic DmcObject mechanisms to add the
     * values for the attributes to the extensible object.
     * <p/>
     * This method also provides basic must/may checking of the specified attributes
     * and will throw an exception for unknown attributes on a structural class.
     * @param imports where we'll add the required imports.
     * @param uco the rule data object.
     * @throws DMFeedbackSet 
     */
    public void addImportsForAdditionalAttributes(SchemaManager sm, ImportManager imports, DMUncheckedObject uco) throws DMFeedbackSet{
    	DMFeedbackSet ex = null;
    	
    	Iterator<String> attrNames = uco.getAttributeNames();
    	if (attrNames != null){
    		while(attrNames.hasNext()){
    			String		name = attrNames.next();
    			DefinitionName attr = null;
				try {
					attr = new DefinitionName(name);
				} catch (DMFeedbackSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			if (!isAllowedAttribute(attr)){
    				if (getClassType() == ClassTypeEnum.EXTENSIBLE){
    					// Add the appropriate import for the attribute's type
    					AttributeDefinition ad = sm.isAttribute(name);
    					
    					if (ad == null){
        					if (ex == null)
        						ex = new DMFeedbackSet();
        					DMFeedback dpf = new DMFeedback("The " + attr + " attribute is not defined, but used in " + uco.getConstructionClass());
        					setExceptionLocation(dpf, uco);
        					ex.add(dpf);
    					}
    					else
    						imports.addImport(ad.getTypeImport(), "Support for addition of " + name + " values to the extensible " + uco.getConstructionClass() + " class");
    				}
    				else{
    					if (ex == null)
    						ex = new DMFeedbackSet();
    					DMFeedback dpf = new DMFeedback("The " + attr + " attribute is not valid for class " + uco.getConstructionClass());
    					setExceptionLocation(dpf, uco);
    					ex.add(dpf);
    				}
    			}
    		}
    	}
    	
    	if (ex != null)
    		throw(ex);
    }
    
    void setExceptionLocation(DMFeedback ex, DMUncheckedObject uco){
    	try {
			int ln = Integer.parseInt(uco.getSV(MetaDMSAG.__lineNumber.name));
			String file = uco.getSV(MetaDMSAG.__file.name);
			ex.setLocation(file, ln);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public boolean hasRules(){
    	if (classRules == null)
    		getClassRules();
    	if (classRules.size() > 0)
    		return(true);
    	return(false);
    }    

    public Iterator<RuleDataDMO> getClassRules(){
    	if (classRules == null){
  
    		classRules = new ArrayList<RuleDataDMO>();
    		
    		// Get any objects that are referring to us via the applyToClass attribute
			ArrayList<DmcObject> referring = getDMO().getReferringObjectsViaAttribute(MetaDMSAG.__applyToClass);
			
			DebugInfo.debug("\n" +getDMO().getBackRefs());
			
			if (this.getName().getNameString().equals("ValueLengthRuleData")){
				DebugInfo.debug("HERE");
			}
			
			if (referring != null){
				for(DmcObject obj: referring){
					if (obj instanceof RuleDataDMO){
						RuleDataDMO rd = (RuleDataDMO) obj;
						
						if (rd.get(MetaDMSAG.__applyToAttribute) == null)
							classRules.add(rd);
					}
				}
			}
    	}
    	
    	return(classRules.iterator());
    }

}
