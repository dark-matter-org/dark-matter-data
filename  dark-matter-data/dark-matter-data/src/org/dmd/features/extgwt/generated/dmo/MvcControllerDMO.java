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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.StringName;                                                 // Naming attribute type
import org.dmd.dmg.generated.dmo.DmgDMSAG;                                           // Attribute from dmg schema
import org.dmd.dms.generated.dmo.MetaDMSAG;                                          // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                                  // Required type
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;                           // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                       // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                       // Base class
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                            // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                             // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcMenuItemDMO;                         // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcMultiViewDMO;                        // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;                     // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;                      // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;                             // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcActionREFMV;                // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREFSV;            // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREFMV;                 // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuItemREFMV;              // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREFMV;                  // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuSeparatorREFMV;         // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMultiViewREFMV;             // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcRegistryItemREFMV;          // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcServerEventREFMV;           // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcViewREFMV;                  // Reference type
import org.dmd.features.extgwt.generated.types.MvcActionREF;                         // Helper class
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                     // Helper class
import org.dmd.features.extgwt.generated.types.MvcEventREF;                          // Helper class
import org.dmd.features.extgwt.generated.types.MvcMenuItemREF;                       // Helper class
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                           // Helper class
import org.dmd.features.extgwt.generated.types.MvcMenuSeparatorREF;                  // Helper class
import org.dmd.features.extgwt.generated.types.MvcMultiViewREF;                      // Helper class
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;                   // Helper class
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;                    // Helper class
import org.dmd.features.extgwt.generated.types.MvcViewREF;                           // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MvcController class allows for the definition of controllers. The
 * abstract controller generated by this definition will automatically
 * register for the events you specify via the handlesEvent attribute.
 * Likewise, it will have a standard handleEvent() method that forwards typed
 * events to abstract handler functions that you'll have to write.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MvcControllerDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcController";

    public final static DmcClassInfo classInfo = ExtgwtDMSAG.__MvcController;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvcControllerDMO() {
        super("MvcController");
    }

    protected MvcControllerDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MvcControllerDMO getNew(){
        MvcControllerDMO rc = new MvcControllerDMO();
        return(rc);
    }

    @Override
    public MvcControllerDMO getSlice(DmcSliceInfo info){
        MvcControllerDMO rc = new MvcControllerDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MvcControllerDMO(DmcTypeModifierMV mods) {
        super("MvcController");
        modrec(true);
        setModifier(mods);
    }

    public MvcControllerDMO getModificationRecorder(){
        MvcControllerDMO rc = new MvcControllerDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
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
        if (obj instanceof MvcControllerDMO){
            return( getObjectName().equals( ((MvcControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getAlias(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmgDMSAG.__alias);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets alias to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setAlias(String value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__alias);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__alias);
        
        try{
            attr.set(value);
            set(DmgDMSAG.__alias,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setAlias(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmgDMSAG.__alias);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__alias);
        
        attr.set(value);
        set(DmgDMSAG.__alias,attr);
    }

    /**
     * Removes the alias attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remAlias(){
         rem(DmgDMSAG.__alias);
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcViewREF> getControlsView(){
        DmcTypeMvcViewREFMV attr = (DmcTypeMvcViewREFMV) get(ExtgwtDMSAG.__controlsView);
        if (attr == null)
            return( ((List<MvcViewREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcViewREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcViewREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcViewREF> getControlsViewREFs(){
        DmcTypeMvcViewREFMV attr = (DmcTypeMvcViewREFMV) get(ExtgwtDMSAG.__controlsView);
        if (attr == null)
            return( ((List<MvcViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another controlsView to the specified value.
     * @param value MvcView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addControlsView(MvcViewDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsView);
        if (attr == null)
            attr = new DmcTypeMvcViewREFMV(ExtgwtDMSAG.__controlsView);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__controlsView,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addControlsView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsView);
        if (attr == null)
            attr = new DmcTypeMvcViewREFMV(ExtgwtDMSAG.__controlsView);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__controlsView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in controlsView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getControlsViewSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delControlsView(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__controlsView, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the controlsView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remControlsView(){
         rem(ExtgwtDMSAG.__controlsView);
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcMultiViewREF> getControlsMultiView(){
        DmcTypeMvcMultiViewREFMV attr = (DmcTypeMvcMultiViewREFMV) get(ExtgwtDMSAG.__controlsMultiView);
        if (attr == null)
            return( ((List<MvcMultiViewREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcMultiViewREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcMultiViewREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcMultiViewREF> getControlsMultiViewREFs(){
        DmcTypeMvcMultiViewREFMV attr = (DmcTypeMvcMultiViewREFMV) get(ExtgwtDMSAG.__controlsMultiView);
        if (attr == null)
            return( ((List<MvcMultiViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another controlsMultiView to the specified value.
     * @param value MvcMultiView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addControlsMultiView(MvcMultiViewDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsMultiView);
        if (attr == null)
            attr = new DmcTypeMvcMultiViewREFMV(ExtgwtDMSAG.__controlsMultiView);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__controlsMultiView,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addControlsMultiView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsMultiView);
        if (attr == null)
            attr = new DmcTypeMvcMultiViewREFMV(ExtgwtDMSAG.__controlsMultiView);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__controlsMultiView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in controlsMultiView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getControlsMultiViewSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__controlsMultiView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delControlsMultiView(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__controlsMultiView, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the controlsMultiView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remControlsMultiView(){
         rem(ExtgwtDMSAG.__controlsMultiView);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delHandlesEvent(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__handlesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remHandlesEvent(){
         rem(ExtgwtDMSAG.__handlesEvent);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__handlesServerEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delHandlesServerEvent(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__handlesServerEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remHandlesServerEvent(){
         rem(ExtgwtDMSAG.__handlesServerEvent);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__dispatchesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delDispatchesEvent(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__dispatchesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remDispatchesEvent(){
         rem(ExtgwtDMSAG.__dispatchesEvent);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__usesRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delUsesRegistryItem(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__usesRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remUsesRegistryItem(){
         rem(ExtgwtDMSAG.__usesRegistryItem);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__createsRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delCreatesRegistryItem(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__createsRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remCreatesRegistryItem(){
         rem(ExtgwtDMSAG.__createsRegistryItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:572)
    public MvcControllerREF getParentController(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(ExtgwtDMSAG.__parentController);
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
     * Returns the reference to MvcController without attempting lazy resolution (if turned on).
     */
    public MvcControllerREF getParentControllerREF(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(ExtgwtDMSAG.__parentController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentController to the specified value.
     * @param value MvcControllerDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setParentController(MvcControllerDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__parentController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(ExtgwtDMSAG.__parentController);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__parentController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets parentController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setParentController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__parentController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(ExtgwtDMSAG.__parentController);
        
        attr.set(value);
        set(ExtgwtDMSAG.__parentController,attr);
    }

    /**
     * Removes the parentController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remParentController(){
         rem(ExtgwtDMSAG.__parentController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setSubpackage(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__subpackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        attr.set(value);
        set(MetaDMSAG.__subpackage,attr);
    }

    /**
     * Removes the subpackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remSubpackage(){
         rem(MetaDMSAG.__subpackage);
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcActionREF> getDefinesAction(){
        DmcTypeMvcActionREFMV attr = (DmcTypeMvcActionREFMV) get(ExtgwtDMSAG.__definesAction);
        if (attr == null)
            return( ((List<MvcActionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcActionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcActionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcActionREF> getDefinesActionREFs(){
        DmcTypeMvcActionREFMV attr = (DmcTypeMvcActionREFMV) get(ExtgwtDMSAG.__definesAction);
        if (attr == null)
            return( ((List<MvcActionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesAction to the specified value.
     * @param value MvcAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addDefinesAction(MvcActionDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFMV(ExtgwtDMSAG.__definesAction);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__definesAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addDefinesAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFMV(ExtgwtDMSAG.__definesAction);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__definesAction,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getDefinesActionSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesAction);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delDefinesAction(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__definesAction, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remDefinesAction(){
         rem(ExtgwtDMSAG.__definesAction);
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcMenuREF> getDefinesMenu(){
        DmcTypeMvcMenuREFMV attr = (DmcTypeMvcMenuREFMV) get(ExtgwtDMSAG.__definesMenu);
        if (attr == null)
            return( ((List<MvcMenuREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcMenuREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcMenuREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcMenuREF> getDefinesMenuREFs(){
        DmcTypeMvcMenuREFMV attr = (DmcTypeMvcMenuREFMV) get(ExtgwtDMSAG.__definesMenu);
        if (attr == null)
            return( ((List<MvcMenuREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenu to the specified value.
     * @param value MvcMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addDefinesMenu(MvcMenuDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFMV(ExtgwtDMSAG.__definesMenu);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__definesMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addDefinesMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFMV(ExtgwtDMSAG.__definesMenu);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__definesMenu,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getDefinesMenuSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenu);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delDefinesMenu(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__definesMenu, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remDefinesMenu(){
         rem(ExtgwtDMSAG.__definesMenu);
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcMenuItemREF> getDefinesMenuItem(){
        DmcTypeMvcMenuItemREFMV attr = (DmcTypeMvcMenuItemREFMV) get(ExtgwtDMSAG.__definesMenuItem);
        if (attr == null)
            return( ((List<MvcMenuItemREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcMenuItemREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcMenuItemREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcMenuItemREF> getDefinesMenuItemREFs(){
        DmcTypeMvcMenuItemREFMV attr = (DmcTypeMvcMenuItemREFMV) get(ExtgwtDMSAG.__definesMenuItem);
        if (attr == null)
            return( ((List<MvcMenuItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenuItem to the specified value.
     * @param value MvcMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addDefinesMenuItem(MvcMenuItemDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuItem);
        if (attr == null)
            attr = new DmcTypeMvcMenuItemREFMV(ExtgwtDMSAG.__definesMenuItem);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__definesMenuItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addDefinesMenuItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuItem);
        if (attr == null)
            attr = new DmcTypeMvcMenuItemREFMV(ExtgwtDMSAG.__definesMenuItem);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__definesMenuItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getDefinesMenuItemSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delDefinesMenuItem(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__definesMenuItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenuItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remDefinesMenuItem(){
         rem(ExtgwtDMSAG.__definesMenuItem);
    }

    /**
     * @return An Iterator of MvcMenuSeparatorDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<MvcMenuSeparatorREF> getDefinesMenuSeparator(){
        DmcTypeMvcMenuSeparatorREFMV attr = (DmcTypeMvcMenuSeparatorREFMV) get(ExtgwtDMSAG.__definesMenuSeparator);
        if (attr == null)
            return( ((List<MvcMenuSeparatorREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcMenuSeparatorREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of MvcMenuSeparatorREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<MvcMenuSeparatorREF> getDefinesMenuSeparatorREFs(){
        DmcTypeMvcMenuSeparatorREFMV attr = (DmcTypeMvcMenuSeparatorREFMV) get(ExtgwtDMSAG.__definesMenuSeparator);
        if (attr == null)
            return( ((List<MvcMenuSeparatorREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenuSeparator to the specified value.
     * @param value MvcMenuSeparator
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addDefinesMenuSeparator(MvcMenuSeparatorDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuSeparator);
        if (attr == null)
            attr = new DmcTypeMvcMenuSeparatorREFMV(ExtgwtDMSAG.__definesMenuSeparator);
        
        try{
            setLastValue(attr.add(value));
            add(ExtgwtDMSAG.__definesMenuSeparator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another definesMenuSeparator value.
     * @param value A value compatible with MvcMenuSeparator
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addDefinesMenuSeparator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuSeparator);
        if (attr == null)
            attr = new DmcTypeMvcMenuSeparatorREFMV(ExtgwtDMSAG.__definesMenuSeparator);
        
        setLastValue(attr.add(value));
        add(ExtgwtDMSAG.__definesMenuSeparator,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenuSeparator
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getDefinesMenuSeparatorSize(){
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__definesMenuSeparator);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenuSeparator value.
     * @param value The MvcMenuSeparator to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delDefinesMenuSeparator(Object value){
        DmcAttribute<?> attr = del(ExtgwtDMSAG.__definesMenuSeparator, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenuSeparator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remDefinesMenuSeparator(){
         rem(ExtgwtDMSAG.__definesMenuSeparator);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}
