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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:279)
import java.io.Serializable;                                                 // Always required
import java.util.*;                                                          // Always required
import org.dmd.dmc.DmcAttribute;                                             // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                         // Always required
import org.dmd.dmc.DmcObject;                                                // Primitive type and !auxiliary class
import org.dmd.dmc.DmcObjectName;                                            // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                             // Required for object slicing
import org.dmd.dmc.DmcValueException;                                        // Any attributes
import org.dmd.dmc.types.Modifier;                                           // Primitive type and !auxiliary class
import org.dmd.dmc.types.NameContainer;                                      // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                       // Base class
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeDMPEventTypeEnumSV;         // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                            // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                         // Required type
import org.dmd.dms.generated.types.DmcTypeDmcObjectSV;                       // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required type
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;                   // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                          // Required type

/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DMPEventDMO  extends DMPMessageDMO  implements de.novanic.eventservice.client.event.Event, Serializable  {

    public final static String constructionClassName = "DMPEvent";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __eventTypeDMP = new DmcAttributeInfo("eventTypeDMP",523,"DMPEventTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify",522,"Modifier",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __notifyOriginator = new DmcAttributeInfo("notifyOriginator",527,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objClass = new DmcAttributeInfo("objClass",509,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID",526,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __slice = new DmcAttributeInfo("slice",535,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __source = new DmcAttributeInfo("source",532,"NameContainer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sourceObject = new DmcAttributeInfo("sourceObject",514,"DmcObject",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__eventTypeDMP.id,__eventTypeDMP);
        _ImAp.put(__modify.id,__modify);
        _ImAp.put(__notifyOriginator.id,__notifyOriginator);
        _ImAp.put(__objClass.id,__objClass);
        _ImAp.put(__originatorID.id,__originatorID);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__slice.id,__slice);
        _ImAp.put(__source.id,__source);
        _ImAp.put(__sourceObject.id,__sourceObject);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__eventTypeDMP.name,__eventTypeDMP);
        _SmAp.put(__modify.name,__modify);
        _SmAp.put(__notifyOriginator.name,__notifyOriginator);
        _SmAp.put(__objClass.name,__objClass);
        _SmAp.put(__originatorID.name,__originatorID);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__slice.name,__slice);
        _SmAp.put(__source.name,__source);
        _SmAp.put(__sourceObject.name,__sourceObject);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public DMPEventDMO() {
        super("DMPEvent");
    }

    protected DMPEventDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DMPEventDMO getNew(){
        DMPEventDMO rc = new DMPEventDMO();
        return(rc);
    }

    @Override
    public DMPEventDMO getSlice(DmcSliceInfo info){
        DMPEventDMO rc = new DMPEventDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DMPEventDMO(DmcTypeModifierMV mods) {
        super("DMPEvent");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public NameContainer getSource(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(__source);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setSource(NameContainer value) {
        DmcAttribute<?> attr = get(__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__source);
        
        try{
            attr.set(value);
            set(__source,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public void setSource(DmcObjectName value) {
        DmcAttribute<?> attr = get(__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__source);
        
        try{
            attr.set(value);
            set(__source,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setSource(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__source);
        
        attr.set(value);
        set(__source,attr);
    }

    /**
     * Removes the source attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remSource(){
         rem(__source);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public String getObjClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__objClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setObjClass(String value) {
        DmcAttribute<?> attr = get(__objClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__objClass);
        
        try{
            attr.set(value);
            set(__objClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setObjClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__objClass);
        
        attr.set(value);
        set(__objClass,attr);
    }

    /**
     * Removes the objClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remObjClass(){
         rem(__objClass);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:800)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Modifier value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:812)
    public Modifier getNthModify(int i){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(__modify);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:825)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        try{
            setLastValue(attr.add(value));
            add(__modify,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Modifier.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public boolean modifyContains(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:884)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        setLastValue(attr.add(value));
        add(__modify,attr);
        return(attr);
    }

    /**
     * Returns the number of values in modify
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public int getModifySize(){
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:943)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(__modify), value);
        else
            attr = del(__modify, value);
        
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public void remModify(){
         rem(__modify);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public DmcObject getSourceObject(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(__sourceObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setSourceObject(DmcObject value) {
        DmcAttribute<?> attr = get(__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__sourceObject);
        
        try{
            attr.set(value);
            set(__sourceObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setSourceObject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__sourceObject);
        
        attr.set(value);
        set(__sourceObject,attr);
    }

    /**
     * Removes the sourceObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remSourceObject(){
         rem(__sourceObject);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public Integer getOriginatorID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__originatorID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setOriginatorID(Integer value) {
        DmcAttribute<?> attr = get(__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__originatorID);
        
        try{
            attr.set(value);
            set(__originatorID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setOriginatorID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__originatorID);
        
        attr.set(value);
        set(__originatorID,attr);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remOriginatorID(){
         rem(__originatorID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public Boolean isNotifyOriginator(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__notifyOriginator);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setNotifyOriginator(Boolean value) {
        DmcAttribute<?> attr = get(__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__notifyOriginator);
        
        try{
            attr.set(value);
            set(__notifyOriginator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__notifyOriginator);
        
        attr.set(value);
        set(__notifyOriginator,attr);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remNotifyOriginator(){
         rem(__notifyOriginator);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public String getSlice(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__slice);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setSlice(String value) {
        DmcAttribute<?> attr = get(__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(__slice);
        
        try{
            attr.set(value);
            set(__slice,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setSlice(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(__slice);
        
        attr.set(value);
        set(__slice,attr);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remSlice(){
         rem(__slice);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public DMPEventTypeEnum getEventTypeDMP(){
        DmcTypeDMPEventTypeEnumSV attr = (DmcTypeDMPEventTypeEnumSV) get(__eventTypeDMP);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setEventTypeDMP(DMPEventTypeEnum value) {
        DmcAttribute<?> attr = get(__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(__eventTypeDMP);
        
        try{
            attr.set(value);
            set(__eventTypeDMP,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setEventTypeDMP(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(__eventTypeDMP);
        
        attr.set(value);
        set(__eventTypeDMP,attr);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remEventTypeDMP(){
         rem(__eventTypeDMP);
    }




}
