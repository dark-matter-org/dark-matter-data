//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                 // Always required - (GenUtility.java:227)
import java.util.*;                                                          // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                             // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                                // Primitive type - (GenUtility.java:282)
import org.dmd.dmc.DmcObjectName;                                            // Alternative type for NameContainer values - (GenUtility.java:306)
import org.dmd.dmc.DmcOmni;                                                  // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                             // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                        // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.Modifier;                                           // Primitive type - (GenUtility.java:282)
import org.dmd.dmc.types.NameContainer;                                      // Primitive type - (GenUtility.java:282)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                       // Base class - (GenUtility.java:367)
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;                  // Primitive type - (GenUtility.java:282)
import org.dmd.dmp.shared.generated.types.DmcTypeDMPEventTypeEnumSV;         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                         // Type specific set/add - (GenUtility.java:318)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.ClassDefinitionREF;                       // Helper class - (GenUtility.java:346)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;              // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeDmcObjectSV;                       // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeLongSV;                            // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;                   // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                          // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class DMPEventDMO  extends DMPMessageDMO  implements de.novanic.eventservice.client.event.Event, Serializable  {

    public final static String constructionClassName = "DMPEvent";


    static {
    }

    public DMPEventDMO() {
        super("DMPEvent");
    }

    protected DMPEventDMO(String oc) {
        super(oc);
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

    public DMPEventDMO getModificationRecorder(){
        DMPEventDMO rc = new DMPEventDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public NameContainer getSource(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmpDMSAG.__source);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setSource(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__source);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__source,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:855)
    public void setSource(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__source);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__source,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setSource(Object value) throws DmcValueException {
        DmcTypeNameContainerSV attr  = (DmcTypeNameContainerSV) get(DmpDMSAG.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__source);
        
        attr.set(value);
        set(DmpDMSAG.__source,attr);
    }

    /**
     * Removes the source attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remSource(){
         rem(DmpDMSAG.__source);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public ClassDefinitionREF getSourceObjectClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__sourceObjectClass);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to ClassDefinition without attempting lazy resolution (if turned on).
     */
    public ClassDefinitionREF getSourceObjectClassREF(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__sourceObjectClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setSourceObjectClass(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__sourceObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__sourceObjectClass);
        else
            ((DmcTypeClassDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmpDMSAG.__sourceObjectClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setSourceObjectClass(Object value) throws DmcValueException {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__sourceObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__sourceObjectClass);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmpDMSAG.__sourceObjectClass,attr);
    }

    /**
     * Removes the sourceObjectClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remSourceObjectClass(){
         rem(DmpDMSAG.__sourceObjectClass);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1278)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaDMSAG.__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Modifier value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1290)
    public Modifier getNthModify(int i){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaDMSAG.__modify);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1304)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaDMSAG.__modify);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__modify,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1379)
    public boolean modifyContains(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaDMSAG.__modify);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__modify,attr);
        return(attr);
    }

    /**
     * Returns the number of values in modify
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getModifySize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null){
            if (MetaDMSAG.__modify.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__modify.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1486)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaDMSAG.__modify), value);
        else
            attr = del(MetaDMSAG.__modify, value);
        
        return(attr);
    }

    /**
     * Deletes a modify from the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
    public DmcAttribute<?> delModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaDMSAG.__modify), value);
        else
            attr = del(MetaDMSAG.__modify, value);
        
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remModify(){
         rem(MetaDMSAG.__modify);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public DmcObject getSourceObject(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(DmpDMSAG.__sourceObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setSourceObject(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpDMSAG.__sourceObject);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__sourceObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setSourceObject(Object value) throws DmcValueException {
        DmcTypeDmcObjectSV attr  = (DmcTypeDmcObjectSV) get(DmpDMSAG.__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpDMSAG.__sourceObject);
        
        attr.set(value);
        set(DmpDMSAG.__sourceObject,attr);
    }

    /**
     * Removes the sourceObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remSourceObject(){
         rem(DmpDMSAG.__sourceObject);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Integer getOriginatorID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setOriginatorID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__originatorID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setOriginatorID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        attr.set(value);
        set(DmpDMSAG.__originatorID,attr);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remOriginatorID(){
         rem(DmpDMSAG.__originatorID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Integer getHandlerID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__handlerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setHandlerID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__handlerID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__handlerID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setHandlerID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__handlerID);
        
        attr.set(value);
        set(DmpDMSAG.__handlerID,attr);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remHandlerID(){
         rem(DmpDMSAG.__handlerID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isNotifyOriginator(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setNotifyOriginator(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__notifyOriginator);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__notifyOriginator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__notifyOriginator);
        
        attr.set(value);
        set(DmpDMSAG.__notifyOriginator,attr);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remNotifyOriginator(){
         rem(DmpDMSAG.__notifyOriginator);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public String getSlice(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__slice);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setSlice(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__slice);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__slice,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setSlice(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__slice);
        
        attr.set(value);
        set(DmpDMSAG.__slice,attr);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remSlice(){
         rem(DmpDMSAG.__slice);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Long getListenerID(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpDMSAG.__listenerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setListenerID(Long value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__listenerID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__listenerID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setListenerID(Object value) throws DmcValueException {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpDMSAG.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__listenerID);
        
        attr.set(value);
        set(DmpDMSAG.__listenerID,attr);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remListenerID(){
         rem(DmpDMSAG.__listenerID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isMyOwnEvent(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__myOwnEvent);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setMyOwnEvent(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__myOwnEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__myOwnEvent);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__myOwnEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setMyOwnEvent(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__myOwnEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__myOwnEvent);
        
        attr.set(value);
        set(DmpDMSAG.__myOwnEvent,attr);
    }

    /**
     * Removes the myOwnEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remMyOwnEvent(){
         rem(DmpDMSAG.__myOwnEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public DMPEventTypeEnum getEventTypeDMP(){
        DmcTypeDMPEventTypeEnumSV attr = (DmcTypeDMPEventTypeEnumSV) get(DmpDMSAG.__eventTypeDMP);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setEventTypeDMP(DMPEventTypeEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(DmpDMSAG.__eventTypeDMP);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__eventTypeDMP,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setEventTypeDMP(Object value) throws DmcValueException {
        DmcTypeDMPEventTypeEnumSV attr  = (DmcTypeDMPEventTypeEnumSV) get(DmpDMSAG.__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(DmpDMSAG.__eventTypeDMP);
        
        attr.set(value);
        set(DmpDMSAG.__eventTypeDMP,attr);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remEventTypeDMP(){
         rem(DmpDMSAG.__eventTypeDMP);
    }




}
