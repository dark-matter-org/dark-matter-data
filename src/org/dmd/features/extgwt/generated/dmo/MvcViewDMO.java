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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:357)
import java.io.Serializable;                                                        // Always required
import java.util.*;                                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing
import org.dmd.dmc.DmcValueException;                                               // Any attributes
import org.dmd.dmc.types.StringName;                                                // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                             // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                                 // Required type
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                      // Base class
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                           // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;                     // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREFMV;                // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREFSV;                // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcRegistryItemREFMV;         // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcServerEventREFMV;          // Reference type
import org.dmd.features.extgwt.generated.types.MvcEventREF;                         // Helper class
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;                  // Helper class
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;                   // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MvcView class allows for the definition of views. MvcView instance are
 * derived from the ExtGWT View class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MvcViewDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcView";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvcViewDMO() {
        super("MvcView");
    }

    protected MvcViewDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MvcViewDMO getNew(){
        MvcViewDMO rc = new MvcViewDMO();
        return(rc);
    }

    @Override
    public MvcViewDMO getSlice(DmcSliceInfo info){
        MvcViewDMO rc = new MvcViewDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MvcViewDMO(DmcTypeModifierMV mods) {
        super("MvcView");
        modrec(true);
        setModifier(mods);
    }

    public MvcViewDMO getModificationRecorder(){
        MvcViewDMO rc = new MvcViewDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:742)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcViewDMO){
            return( getObjectName().equals( ((MvcViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:868)
    public Iterator<MvcEventREF> getHandlesEvent(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(ExtgwtDMSAG.__handlesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:888)
    public Iterator<MvcEventREF> getHandlesEventREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(ExtgwtDMSAG.__handlesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another handlesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addHandlesEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__handlesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__handlesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__handlesEvent);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__handlesEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in handlesEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesEvent);
        if (attr == null){
            if (ExtgwtDMSAG.__handlesEvent.indexSize == 0)
                return(0);
            else
                return(ExtgwtDMSAG.__handlesEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1199)
    public DmcAttribute<?> delHandlesEvent(Object value){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__handlesEvent), value);
        else
            attr = del(ExtgwtDMSAG.__handlesEvent, value);
        
        return(attr);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remHandlesEvent(){
         rem(ExtgwtDMSAG.__handlesEvent);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:868)
    public Iterator<MvcServerEventREF> getHandlesServerEvent(){
        DmcTypeMvcServerEventREFMV attr = (DmcTypeMvcServerEventREFMV) get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null)
            return( ((List<MvcServerEventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcServerEventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcServerEventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:888)
    public Iterator<MvcServerEventREF> getHandlesServerEventREFs(){
        DmcTypeMvcServerEventREFMV attr = (DmcTypeMvcServerEventREFMV) get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null)
            return( ((List<MvcServerEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another handlesServerEvent to the specified value.
     * @param value MvcServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addHandlesServerEvent(MvcServerEventDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREFMV(ExtgwtDMSAG.__handlesServerEvent);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__handlesServerEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addHandlesServerEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREFMV(ExtgwtDMSAG.__handlesServerEvent);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__handlesServerEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in handlesServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null){
            if (ExtgwtDMSAG.__handlesServerEvent.indexSize == 0)
                return(0);
            else
                return(ExtgwtDMSAG.__handlesServerEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1199)
    public DmcAttribute<?> delHandlesServerEvent(Object value){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesServerEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMvcServerEventREFMV(ExtgwtDMSAG.__handlesServerEvent), value);
        else
            attr = del(ExtgwtDMSAG.__handlesServerEvent, value);
        
        return(attr);
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remHandlesServerEvent(){
         rem(ExtgwtDMSAG.__handlesServerEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:608)
    public MvcEventREF getFiresEvent(){
        DmcTypeMvcEventREFSV attr = (DmcTypeMvcEventREFSV) get(ExtgwtDMSAG.__firesEvent);
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
     * Returns the reference to MvcEvent without attempting lazy resolution (if turned on).
     */
    public MvcEventREF getFiresEventREF(){
        DmcTypeMvcEventREFSV attr = (DmcTypeMvcEventREFSV) get(ExtgwtDMSAG.__firesEvent);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets firesEvent to the specified value.
     * @param value MvcEventDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:661)
    public void setFiresEvent(MvcEventDMO value) {
        DmcTypeMvcEventREFSV attr  = (DmcTypeMvcEventREFSV) get(ExtgwtDMSAG.__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFSV(ExtgwtDMSAG.__firesEvent);
        else
            attr.removeBackReferences();
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__firesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets firesEvent to the specified value.
     * @param value A value compatible with DmcTypeMvcEventREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setFiresEvent(Object value) throws DmcValueException {
        DmcTypeMvcEventREFSV attr  = (DmcTypeMvcEventREFSV) get(ExtgwtDMSAG.__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFSV(ExtgwtDMSAG.__firesEvent);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(ExtgwtDMSAG.__firesEvent,attr);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remFiresEvent(){
         rem(ExtgwtDMSAG.__firesEvent);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:868)
    public Iterator<MvcEventREF> getDispatchesEvent(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(ExtgwtDMSAG.__dispatchesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:888)
    public Iterator<MvcEventREF> getDispatchesEventREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(ExtgwtDMSAG.__dispatchesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dispatchesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addDispatchesEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__dispatchesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__dispatchesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addDispatchesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__dispatchesEvent);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__dispatchesEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dispatchesEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__dispatchesEvent);
        if (attr == null){
            if (ExtgwtDMSAG.__dispatchesEvent.indexSize == 0)
                return(0);
            else
                return(ExtgwtDMSAG.__dispatchesEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1199)
    public DmcAttribute<?> delDispatchesEvent(Object value){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__dispatchesEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMvcEventREFMV(ExtgwtDMSAG.__dispatchesEvent), value);
        else
            attr = del(ExtgwtDMSAG.__dispatchesEvent, value);
        
        return(attr);
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remDispatchesEvent(){
         rem(ExtgwtDMSAG.__dispatchesEvent);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:868)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItem(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcRegistryItemREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:888)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItemREFs(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addUsesRegistryItem(MvcRegistryItemDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__usesRegistryItem);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__usesRegistryItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addUsesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__usesRegistryItem);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__usesRegistryItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null){
            if (ExtgwtDMSAG.__usesRegistryItem.indexSize == 0)
                return(0);
            else
                return(ExtgwtDMSAG.__usesRegistryItem.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1199)
    public DmcAttribute<?> delUsesRegistryItem(Object value){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__usesRegistryItem);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__usesRegistryItem), value);
        else
            attr = del(ExtgwtDMSAG.__usesRegistryItem, value);
        
        return(attr);
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remUsesRegistryItem(){
         rem(ExtgwtDMSAG.__usesRegistryItem);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:868)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItem(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcRegistryItemREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:888)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItemREFs(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another createsRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:902)
    public DmcAttribute<?> addCreatesRegistryItem(MvcRegistryItemDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__createsRegistryItem);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__createsRegistryItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addCreatesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__createsRegistryItem);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__createsRegistryItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in createsRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null){
            if (ExtgwtDMSAG.__createsRegistryItem.indexSize == 0)
                return(0);
            else
                return(ExtgwtDMSAG.__createsRegistryItem.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1199)
    public DmcAttribute<?> delCreatesRegistryItem(Object value){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__createsRegistryItem);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMvcRegistryItemREFMV(ExtgwtDMSAG.__createsRegistryItem), value);
        else
            attr = del(ExtgwtDMSAG.__createsRegistryItem, value);
        
        return(attr);
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remCreatesRegistryItem(){
         rem(ExtgwtDMSAG.__createsRegistryItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setDescription(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setName(Object value) throws DmcValueException {
        DmcTypeStringNameSV attr  = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}
