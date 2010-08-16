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

import org.dmd.dms.generated.dmw.ClassDefinitionDMW;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dmw.DmwWrapperBase;
import org.dmd.util.exceptions.*;

public class ClassDefinition extends ClassDefinitionDMW {

    /**
     * This Class is set to contain an instance of the correct DmcObject
     * subclass to store data associated with this class definition.
     */
    @SuppressWarnings("unchecked")
	Class       genobjclass;

    /**
     * Maintains a hash of all attributes supported by this class. It is
     * only initialized if the hasAttribute() function is called.
     * Key:   String - attribute name
     * Value: AttributeDefinition
     */
    HashMap<String,AttributeDefinition>     attrMap;

    /**
     * Stores the definitions of required attributes whose dataType is PERSISTENT,
     * just for this class.
     */
    ArrayList<AttributeDefinition>   persistentMust;

    /**
     * Stores the definitions of required attributes whose dataType is PERSISTENT,
     * for this class and all its base classes.
     */
    ArrayList<AttributeDefinition>   allPersistentMust;

    /**
     * Stores the definitions of optional attributes whose dataType is PERSISTENT,
     * for this class and all its base classes.
     */
    ArrayList<AttributeDefinition>   persistentMay;

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
    HashMap<String,AttributeDefinition>     allMust;

    /**
     * Stores the definitions of all mayHave attributes for this class and
     * the classes from which it is derived.
     */
    HashMap<String,AttributeDefinition>     allMay;

    /**
     * The complete list of the classes from which this class is derived.
     */
    ArrayList<ClassDefinition>   baseClasses;

    /**
     * All classes that are derived from this class, either immediately derived
     * or any number of levels down the inheritance hierarchy. The derivedClasses
     * attribute maintains a list of the immediate derivatives of a class.
     */
    TreeMap<String,ClassDefinition>     allDerived;

    /**
     * The classes of objects that may be contained by this class of object if
     * the class is involved in a hierarchic structure.
     * Key:   String (class name)
     * Value: ClassDefinition
     */
    TreeMap<String,ClassDefinition>     allowedSubcomps;

    /**
     * These are actions that have been attached from other schemas.
     */
    ArrayList<ActionDefinition>   attachedActions;

    /**
     * All actions defined for this class, either directly or via the
     * attachment mechanism.
     */
    HashMap<String,ActionDefinition>     allActions;

    /**
     * Contains a list of all implemented interfaces from the most generic to the most
     * specific ones
     */
    private ArrayList<ClassDefinition> allImplemented;
    private ArrayList<ClassDefinition> allImplementors;

    /**
     * Default constructor.
     */
    public ClassDefinition(){
    	
    }
    
    /**
	 * Default constructor used in creating the meta schema.
	 * @param mn The meta name of the definition.
	 */
	protected ClassDefinition(String mn){
		super(mn);
		init();
	}
	
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
    }

    /**
     * Updates the derivedClasses attribute and the allDerived map and, if
     * this class is derived from another, calls its updateAllDerived() function.
     */
    void updateDerived(ClassDefinition derived) throws ResultException {
    	this.addDerivedClasses(derived);

        updateAllDerived(derived);
    }

    /**
     * Updates the complete set of derived classes and, if this class is derived,
     * passes the class up the hierarchy.
     */
    void updateAllDerived(ClassDefinition derived){
        if (allDerived == null)
            allDerived = new TreeMap<String,ClassDefinition>();

        allDerived.put(derived.getObjectName(),derived);

        if (this.getDerivedFrom() != null)
            this.getDerivedFrom().updateAllDerived(derived);
    }

    /**
     * updateImplemented
     *
     * @param rs ResultSet
     */
    void updateImplemented() throws ResultException {
        if ( (allImplemented == null) && (getClassType() != ClassTypeEnum.INTERFACE) ) {
            ArrayList<ClassDefinition> m = new ArrayList<ClassDefinition>();
            updateImplemented(m);

            // we only want to store the map if it has something in it
            if (m.size() > 0) {
                allImplemented = m;
            }
        }

        // now update all implemented interfaces
        if (getImplements() != null) {
            for (Iterator<ClassDefinition> iter = getImplements(); iter.hasNext(); ) {
            	ClassDefinition id = iter.next();
                id.updateImplementors(this);
            }
        }
    }

    /**
     * updateImplementors
     *
     * @param rs ResultSet
     * @param cd DmdClassDef
     */
    private void updateImplementors(ClassDefinition cd) {
        if (allImplementors == null) {
            allImplementors = new ArrayList<ClassDefinition>();
        }
        if (!allImplementors.contains(cd)) {
            allImplementors.add(cd);
        }
    }

	/**
	 * Updates the set of implemented interfaces.
	 * @param col
	 */
	private void updateImplemented(ArrayList<ClassDefinition> col) {
        // [yt] WARNING! the order of recursion is important as we want to create
        // the list of interfaces from the most generic ones to the most specific ones
        if (getClassType() == ClassTypeEnum.INTERFACE) {
            if (getDerivedFrom() != null) {
                getDerivedFrom().updateImplemented(col);
            }
            if (!col.contains(this))
                col.add(this);
        }
        else {
            if (getImplements() != null) {
                for (Iterator<ClassDefinition> iter = getImplements(); iter.hasNext(); ) {
                	ClassDefinition id = iter.next();
                    id.updateImplemented(col);
                }
            }

            if (getDerivedFrom() != null) {
                getDerivedFrom().updateImplemented(col);
            }
        }
    }

	/**
	 * Returns all implemented interfaces.
	 * @return
	 */
    public ArrayList<ClassDefinition> getAllImplemented() {
        return allImplemented;
    }

    /**
     * Updates the set of allowed subcomponents for this class.
     */
    void updateAllowedSubcomps(ClassDefinition subcomp){
        if (allowedSubcomps == null)
            allowedSubcomps = new TreeMap<String,ClassDefinition>();

        allowedSubcomps.put(subcomp.getObjectName(), subcomp);
    }

    /**
     * Returns the allderived variable which holds a Hashmap of all
     * classes that derive from this class
     */
    public TreeMap<String,ClassDefinition> getAllDerived() {
        return allDerived;
    } 

    public ArrayList<ClassDefinition> getAllImplementors() {
        return allImplementors;
    }

    /**
     * Returns the set of allowed subcomponents for this class.
     */
    public TreeMap<String,ClassDefinition> getAllowedSubcomps(){
        return(allowedSubcomps);
    }

    /**
     * This function instantiates a new instance of the object type defined
     * by this class definition.
     * @throws ResultException 
     */
    public DmwWrapperBase newInstance() throws ResultException
    {
    	DmwWrapperBase rc = null;

        if (genobjclass == null){
            // The first time we try to create an object this way, get our
            // object class so we can call Class.newInstance()
            try{
                genobjclass = Class.forName(this.getJavaClass());
            }
            catch(Exception e){
            	ResultException ex = new ResultException();
            	ex.result.addResult(Result.FATAL,"Couldn't load Java class: " + this.getJavaClass());
                ex.result.lastResult().moreMessages(e.getMessage());
                ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
                throw(ex);
            }
        }

        if (genobjclass != null){
        	if (this.getClassType() == ClassTypeEnum.ABSTRACT){
            	ResultException ex = new ResultException();
            	ex.result.addResult(Result.ERROR,"Can't instantiate an ABSTRACT class: " + this.getObjectName());
                throw(ex);
            }
            else{
                try{
                    rc = (DmwWrapperBase) genobjclass.newInstance();
                }
                catch(Exception e){
                	ResultException ex = new ResultException();
                	ex.result.addResult(Result.FATAL,"Couldn't instantiate Java class: " + this.getJavaClass());
                	ex.result.lastResult().moreMessages("This may be because the class doesn't have a constructor that takes no arguments.");
                	ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
                	throw(ex);
                }
            }
        }

        return(rc);
    }


}
