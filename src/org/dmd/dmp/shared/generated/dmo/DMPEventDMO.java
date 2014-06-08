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

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:101)
import java.io.Serializable;                                                   // Always required - (ImportUtil.java:300)
import java.util.*;                                                            // Always required if we have any MV attributes - (ImportUtil.java:297)
import org.dmd.core.DmcAttribute;                                              // Any attributes - (ImportUtil.java:309)
import org.dmd.core.DmcObject;                                                 // Primitive type and !auxiliary class - (ImportUtil.java:334)
import org.dmd.core.DmcObjectName;                                             // Alternative type for NameContainer values - (ImportUtil.java:358)
import org.dmd.core.DmcOmni;                                                   // Lazy resolution - (ImportUtil.java:378)
import org.dmd.core.feedback.DMFeedbackSet;                                    // Any attributes - (ImportUtil.java:310)
import org.dmd.core.schema.DmcSliceInfo;                                       // Required for object slicing - (ImportUtil.java:305)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                         // Base class - (ImportUtil.java:412)
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;                    // Primitive type and !auxiliary class - (ImportUtil.java:334)
import org.dmd.dmp.shared.generated.types.DmcTypeDMPEventTypeEnumSV;           // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.dmo.ClassDefinitionDMO;                    // Type specific set/add - (ImportUtil.java:370)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;                     // Attribute from meta schema - (ImportUtil.java:232)
import org.dmd.dms.shared.generated.types.ClassDefinitionREF;                  // Reference type helper class - (ImportUtil.java:375)
import org.dmd.dms.shared.generated.types.DmcTypeBooleanSV;                    // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeClassDefinitionREFSV;         // Reference type - (ImportUtil.java:363)
import org.dmd.dms.shared.generated.types.DmcTypeDmcObjectSV;                  // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeIntegerSV;                    // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeLongSV;                       // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (ImportUtil.java:303)
import org.dmd.dms.shared.generated.types.DmcTypeNameContainerSV;              // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeStringSV;                     // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.types.Modifier;                                      // Primitive type and !auxiliary class - (ImportUtil.java:334)
import org.dmd.dms.shared.types.NameContainer;                                 // Primitive type and !auxiliary class - (ImportUtil.java:334)

// Generated from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
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
        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public NameContainer getSource(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmpCompactSchema.__source);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setSource(NameContainer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpCompactSchema.__source);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__source,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:238)
    public void setSource(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpCompactSchema.__source);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__source,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets source to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setSource(Object value) throws DMFeedbackSet {
        DmcTypeNameContainerSV attr  = (DmcTypeNameContainerSV) get(DmpCompactSchema.__source);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpCompactSchema.__source);
        
        attr.set(value);
        set(DmpCompactSchema.__source,attr);
    }

    /**
     * Removes the source attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remSource(){
         rem(DmpCompactSchema.__source);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:47)
    public ClassDefinitionREF getSourceObjectClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpCompactSchema.__sourceObjectClass);
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
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpCompactSchema.__sourceObjectClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:101)
    public void setSourceObjectClass(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__sourceObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpCompactSchema.__sourceObjectClass);
        else
            ((DmcTypeClassDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__sourceObjectClass,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setSourceObjectClass(Object value) throws DMFeedbackSet {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(DmpCompactSchema.__sourceObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpCompactSchema.__sourceObjectClass);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmpCompactSchema.__sourceObjectClass,attr);
    }

    /**
     * Removes the sourceObjectClass attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remSourceObjectClass(){
         rem(DmpCompactSchema.__sourceObjectClass);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:493)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaCompactSchema.__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Modifier value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:505)
    public Modifier getNthModify(int i){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaCompactSchema.__modify);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:519)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaCompactSchema.__modify);
        
        try{
            setLastValue(attr.add(value));
            add(MetaCompactSchema.__modify,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Modifier.
     * @param value Modifier
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:594)
    public boolean modifyContains(Modifier value) {
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:626)
    public DmcAttribute<?> addModify(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaCompactSchema.__modify);
        
        setLastValue(attr.add(value));
        add(MetaCompactSchema.__modify,attr);
        return(attr);
    }

    /**
     * Returns the number of values in modify
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:643)
    public int getModifySize(){
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        if (attr == null){
            if (MetaCompactSchema.__modify.indexSize == 0)
                return(0);
            else
                return(MetaCompactSchema.__modify.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:700)
    public DmcAttribute<?> delModify(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaCompactSchema.__modify), value);
        else
            attr = del(MetaCompactSchema.__modify, value);
        
        return(attr);
    }

    /**
     * Deletes a modify from the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:716)
    public DmcAttribute<?> delModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaCompactSchema.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaCompactSchema.__modify), value);
        else
            attr = del(MetaCompactSchema.__modify, value);
        
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:735)
    public void remModify(){
         rem(MetaCompactSchema.__modify);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public DmcObject getSourceObject(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(DmpCompactSchema.__sourceObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setSourceObject(DmcObject value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpCompactSchema.__sourceObject);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__sourceObject,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setSourceObject(Object value) throws DMFeedbackSet {
        DmcTypeDmcObjectSV attr  = (DmcTypeDmcObjectSV) get(DmpCompactSchema.__sourceObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpCompactSchema.__sourceObject);
        
        attr.set(value);
        set(DmpCompactSchema.__sourceObject,attr);
    }

    /**
     * Removes the sourceObject attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remSourceObject(){
         rem(DmpCompactSchema.__sourceObject);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Integer getOriginatorID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpCompactSchema.__originatorID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setOriginatorID(Integer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpCompactSchema.__originatorID);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__originatorID,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setOriginatorID(Object value) throws DMFeedbackSet {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpCompactSchema.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpCompactSchema.__originatorID);
        
        attr.set(value);
        set(DmpCompactSchema.__originatorID,attr);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remOriginatorID(){
         rem(DmpCompactSchema.__originatorID);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Integer getHandlerID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpCompactSchema.__handlerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setHandlerID(Integer value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpCompactSchema.__handlerID);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__handlerID,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setHandlerID(Object value) throws DMFeedbackSet {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpCompactSchema.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpCompactSchema.__handlerID);
        
        attr.set(value);
        set(DmpCompactSchema.__handlerID,attr);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remHandlerID(){
         rem(DmpCompactSchema.__handlerID);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Boolean isNotifyOriginator(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpCompactSchema.__notifyOriginator);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setNotifyOriginator(Boolean value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__notifyOriginator);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__notifyOriginator,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setNotifyOriginator(Object value) throws DMFeedbackSet {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpCompactSchema.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__notifyOriginator);
        
        attr.set(value);
        set(DmpCompactSchema.__notifyOriginator,attr);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remNotifyOriginator(){
         rem(DmpCompactSchema.__notifyOriginator);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public String getSlice(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpCompactSchema.__slice);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setSlice(String value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__slice);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__slice,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setSlice(Object value) throws DMFeedbackSet {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpCompactSchema.__slice);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__slice);
        
        attr.set(value);
        set(DmpCompactSchema.__slice,attr);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remSlice(){
         rem(DmpCompactSchema.__slice);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Long getListenerID(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpCompactSchema.__listenerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setListenerID(Long value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpCompactSchema.__listenerID);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__listenerID,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setListenerID(Object value) throws DMFeedbackSet {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpCompactSchema.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpCompactSchema.__listenerID);
        
        attr.set(value);
        set(DmpCompactSchema.__listenerID,attr);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remListenerID(){
         rem(DmpCompactSchema.__listenerID);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public Boolean isMyOwnEvent(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpCompactSchema.__myOwnEvent);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setMyOwnEvent(Boolean value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__myOwnEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__myOwnEvent);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__myOwnEvent,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setMyOwnEvent(Object value) throws DMFeedbackSet {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpCompactSchema.__myOwnEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpCompactSchema.__myOwnEvent);
        
        attr.set(value);
        set(DmpCompactSchema.__myOwnEvent,attr);
    }

    /**
     * Removes the myOwnEvent attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remMyOwnEvent(){
         rem(DmpCompactSchema.__myOwnEvent);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public DMPEventTypeEnum getEventTypeDMP(){
        DmcTypeDMPEventTypeEnumSV attr = (DmcTypeDMPEventTypeEnumSV) get(DmpCompactSchema.__eventTypeDMP);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setEventTypeDMP(DMPEventTypeEnum value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(DmpCompactSchema.__eventTypeDMP);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__eventTypeDMP,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnumSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setEventTypeDMP(Object value) throws DMFeedbackSet {
        DmcTypeDMPEventTypeEnumSV attr  = (DmcTypeDMPEventTypeEnumSV) get(DmpCompactSchema.__eventTypeDMP);
        if (attr == null)
            attr = new DmcTypeDMPEventTypeEnumSV(DmpCompactSchema.__eventTypeDMP);
        
        attr.set(value);
        set(DmpCompactSchema.__eventTypeDMP,attr);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remEventTypeDMP(){
         rem(DmpCompactSchema.__eventTypeDMP);
    }




}
