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
package org.dmd.features.extgwt.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:277)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                              // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.StringName;                                              // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                                 // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                           // Required type
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                    // Base class
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                         // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREFMV;         // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREFMV;              // Reference type
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                  // Helper class
import org.dmd.features.extgwt.generated.types.MvcEventREF;                       // Helper class

/**
 * The MvcApplication class allows for the definition of an application that
 * makes uses of the ExtGWT MVC framework.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class MvcApplicationDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcApplication";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __controllers = new DmcAttributeInfo("controllers",607,"MvcController",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definesEvent = new DmcAttributeInfo("definesEvent",601,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __startEvents = new DmcAttributeInfo("startEvents",622,"MvcEvent",ValueTypeEnum.MULTI,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__controllers.id,__controllers);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__definesEvent.id,__definesEvent);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__startEvents.id,__startEvents);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__controllers.name,__controllers);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__definesEvent.name,__definesEvent);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__startEvents.name,__startEvents);
    }

    public MvcApplicationDMO() {
        super("MvcApplication");
    }

    protected MvcApplicationDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcApplicationDMO getNew(){
        MvcApplicationDMO rc = new MvcApplicationDMO();
        return(rc);
    }

    public MvcApplicationDMO(DmcTypeModifierMV mods) {
        super("MvcApplication");
        modrec(true);
        setModifier(mods);
    }

    public MvcApplicationDMO getModificationRecorder(){
        MvcApplicationDMO rc = new MvcApplicationDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMO){
            return( getObjectName().equals( ((MvcApplicationDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:741)
    public Iterator<MvcEventREF> getDefinesEvent(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__definesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcEventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:761)
    public Iterator<MvcEventREF> getDefinesEventREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__definesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesEvent to the specified value.
     * @param value MvcEvent
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:776)
    public DmcAttribute<?> addDefinesEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(__definesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__definesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__definesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:882)
    public DmcAttribute<?> addDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__definesEvent);
        
        setLastValue(attr.add(value));
        add(__definesEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesEvent
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:899)
    public int getDefinesEventSize(){
        DmcAttribute<?> attr = get(__definesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:929)
    public DmcAttribute<?> delDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__definesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesEvent attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:959)
    public void remDefinesEvent(){
         rem(__definesEvent);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remName(){
         rem(__name);
    }

    /**
     * @return An Iterator of MvcControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:741)
    public Iterator<MvcControllerREF> getControllers(){
        DmcTypeMvcControllerREFMV attr = (DmcTypeMvcControllerREFMV) get(__controllers);
        if (attr == null)
            return( ((List<MvcControllerREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcControllerREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcControllerREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:761)
    public Iterator<MvcControllerREF> getControllersREFs(){
        DmcTypeMvcControllerREFMV attr = (DmcTypeMvcControllerREFMV) get(__controllers);
        if (attr == null)
            return( ((List<MvcControllerREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another controllers to the specified value.
     * @param value MvcController
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:776)
    public DmcAttribute<?> addControllers(MvcControllerDMO value) {
        DmcAttribute<?> attr = get(__controllers);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFMV(__controllers);
        
        try{
            setLastValue(attr.add(value));
            add(__controllers,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:882)
    public DmcAttribute<?> addControllers(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__controllers);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFMV(__controllers);
        
        setLastValue(attr.add(value));
        add(__controllers,attr);
        return(attr);
    }

    /**
     * Returns the number of values in controllers
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:899)
    public int getControllersSize(){
        DmcAttribute<?> attr = get(__controllers);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:929)
    public DmcAttribute<?> delControllers(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__controllers, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the controllers attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:959)
    public void remControllers(){
         rem(__controllers);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:741)
    public Iterator<MvcEventREF> getStartEvents(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__startEvents);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcEventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:761)
    public Iterator<MvcEventREF> getStartEventsREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__startEvents);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another startEvents to the specified value.
     * @param value MvcEvent
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:776)
    public DmcAttribute<?> addStartEvents(MvcEventDMO value) {
        DmcAttribute<?> attr = get(__startEvents);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__startEvents);
        
        try{
            setLastValue(attr.add(value));
            add(__startEvents,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another startEvents value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:882)
    public DmcAttribute<?> addStartEvents(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__startEvents);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__startEvents);
        
        setLastValue(attr.add(value));
        add(__startEvents,attr);
        return(attr);
    }

    /**
     * Returns the number of values in startEvents
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:899)
    public int getStartEventsSize(){
        DmcAttribute<?> attr = get(__startEvents);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a startEvents value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:929)
    public DmcAttribute<?> delStartEvents(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__startEvents, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the startEvents attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:959)
    public void remStartEvents(){
         rem(__startEvents);
    }




}
