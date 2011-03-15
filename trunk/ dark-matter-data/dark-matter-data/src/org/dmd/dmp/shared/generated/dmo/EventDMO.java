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
package org.dmd.dmp.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:709)
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                    // Always required
import org.dmd.dmc.DmcObject;                                           // Primitive type and !auxiliary class
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.DmcTypeDmcObject;                              // Required type
import org.dmd.dmc.types.DmcTypeModifier;                               // Required type
import org.dmd.dmc.types.DmcTypeString;                                 // Required type
import org.dmd.dmc.types.Modification;                                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                  // Base class
import org.dmd.dmp.shared.generated.enums.EventTypeEnum;                // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeEventTypeEnum;         // Required type
import org.dmd.dms.generated.enums.ModifyTypeEnum;                      // Any MV attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                       // Always required

/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class EventDMO  extends DMPMessageDMO  implements de.novanic.eventservice.client.event.Event {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __eventObject = new DmcAttributeInfo("eventObject",514,"DmcObject",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __eventType = new DmcAttributeInfo("eventType",523,"EventTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify",522,"Modification",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __objClass = new DmcAttributeInfo("objClass",509,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objName = new DmcAttributeInfo("objName",508,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__eventObject.id,__eventObject);
        _ImAp.put(__eventType.id,__eventType);
        _ImAp.put(__modify.id,__modify);
        _ImAp.put(__objClass.id,__objClass);
        _ImAp.put(__objName.id,__objName);
        _ImAp.put(__requestID.id,__requestID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__eventObject.name,__eventObject);
        _SmAp.put(__eventType.name,__eventType);
        _SmAp.put(__modify.name,__modify);
        _SmAp.put(__objClass.name,__objClass);
        _SmAp.put(__objName.name,__objName);
        _SmAp.put(__requestID.name,__requestID);
    }

    public EventDMO() {
        super("Event",_ImAp,_SmAp);
    }

    protected EventDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public EventDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public EventDMO(EventDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public EventDMO getOneOfMe() {
        EventDMO rc = new EventDMO(this.getConstructionClassName());
        return(rc);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getObjName(){
        DmcTypeString attr = (DmcTypeString) get(__objName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setObjName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__objName,attr);
    }

    /**
     * Removes the objName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remObjName(){
         rem(__objName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getObjClass(){
        DmcTypeString attr = (DmcTypeString) get(__objClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setObjClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__objClass,attr);
    }

    /**
     * Removes the objClass attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remObjClass(){
         rem(__objClass);
    }

    /**
     * @return An Iterator of Modification objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:432)
    public Iterator<Modification> getModify(){
        DmcTypeModifier attr = (DmcTypeModifier) get(__modify);
        if (attr == null)
            return( ((List<Modification>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modification
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:452)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifier();
        
        attr.add(value);
        add(__modify,attr);
        return(attr);
    }

    /**
     * Deletes a modify value.
     * @param value The Modification to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:518)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__modify, value);
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeModifier();
                attr.setName(__modify.name);
                attr.add(value);
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:540)
    public void remModify(){
         rem(__modify);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public DmcObject getEventObject(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(__eventObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setEventObject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__eventObject);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.set(value);
        set(__eventObject,attr);
    }

    /**
     * Removes the eventObject attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remEventObject(){
         rem(__eventObject);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public EventTypeEnum getEventType(){
        DmcTypeEventTypeEnum attr = (DmcTypeEventTypeEnum) get(__eventType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventType to the specified value.
     * @param value A value compatible with DmcTypeEventTypeEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setEventType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__eventType);
        if (attr == null)
            attr = new DmcTypeEventTypeEnum();
        
        attr.set(value);
        set(__eventType,attr);
    }

    /**
     * Removes the eventType attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remEventType(){
         rem(__eventType);
    }




}
