//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                 // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                              // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                     // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                    // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwEventDMO;                     // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMvwEventREFMAP;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.MvwEventREF;                   // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Component is an abstract base for classes that define the building
 * blocks of Applications. The primary feature of an Component is that it
 * fires and/or handles events. Beyond that, a component can be whatever you
 * require it to be. A variety of derived component types provide more
 * focussed behavioural units.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
abstract public class ComponentDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Component";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName",811,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",801,"MvwEvent",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",802,"MvwEvent",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__componentName.id,__componentName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__componentName.name,__componentName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ComponentDMO() {
        super("Component");
    }

    protected ComponentDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__componentName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__componentName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ComponentDMO){
            return( getObjectName().equals( ((ComponentDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvwEventDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1034)
    @SuppressWarnings("unchecked")
    public Iterator<MvwEventREF> getFiresEvent(){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__firesEvent);
        if (attr == null)
            return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvwEventREFs without attempting lazy resolution (if it's turned on).
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1064)
    @SuppressWarnings("unchecked")
    public Iterator<MvwEventREF> getFiresEventREFs(){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__firesEvent);
        if (attr == null)
            return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The MvwEvent associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1098)
    public MvwEventREF getFiresEvent(Object key){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__firesEvent);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another firesEvent value.
     * @param value A value compatible with MvwEvent
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1129)
    public DmcAttribute<?> addFiresEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvwEventREFMAP(__firesEvent);
        
        setLastValue(attr.add(value));
        add(__firesEvent,attr);
        return(attr);
    }

    /**
     * Adds another firesEvent value.
     * @param value MvwEvent
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1145)
    public DmcAttribute<?> addFiresEvent(MvwEventDMO value) {
        DmcAttribute<?> attr = get(__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvwEventREFMAP(__firesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__firesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a firesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delFiresEvent(Object value) throws DmcValueException {
        return(del(__firesEvent, value));
    }

    /**
     * Deletes a firesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delFiresEvent(MvwEventDMO value){
        DmcAttribute<?> rc = null;
        rc = del(__firesEvent, value);
        return(rc);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1295)
    public void remFiresEvent(){
         rem(__firesEvent);
    }

    /**
     * @return An Iterator of MvwEventDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1034)
    @SuppressWarnings("unchecked")
    public Iterator<MvwEventREF> getHandlesEvent(){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__handlesEvent);
        if (attr == null)
            return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvwEventREFs without attempting lazy resolution (if it's turned on).
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1064)
    @SuppressWarnings("unchecked")
    public Iterator<MvwEventREF> getHandlesEventREFs(){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__handlesEvent);
        if (attr == null)
            return( ((List<MvwEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The MvwEvent associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1098)
    public MvwEventREF getHandlesEvent(Object key){
        DmcTypeMvwEventREFMAP attr = (DmcTypeMvwEventREFMAP) get(__handlesEvent);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvwEvent
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1129)
    public DmcAttribute<?> addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvwEventREFMAP(__handlesEvent);
        
        setLastValue(attr.add(value));
        add(__handlesEvent,attr);
        return(attr);
    }

    /**
     * Adds another handlesEvent value.
     * @param value MvwEvent
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1145)
    public DmcAttribute<?> addHandlesEvent(MvwEventDMO value) {
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvwEventREFMAP(__handlesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__handlesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delHandlesEvent(Object value) throws DmcValueException {
        return(del(__handlesEvent, value));
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delHandlesEvent(MvwEventDMO value){
        DmcAttribute<?> rc = null;
        rc = del(__handlesEvent, value);
        return(rc);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1295)
    public void remHandlesEvent(){
         rem(__handlesEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getComponentName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__componentName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets componentName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setComponentName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__componentName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__componentName);
        
        try{
            attr.set(value);
            set(__componentName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets componentName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setComponentName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__componentName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__componentName);
        
        attr.set(value);
        set(__componentName,attr);
    }

    /**
     * Removes the componentName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remComponentName(){
         rem(__componentName);
    }




}
