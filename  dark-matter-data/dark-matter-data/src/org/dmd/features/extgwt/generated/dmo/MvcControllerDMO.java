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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                 // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.StringName;                                                 // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                     // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                    // Required if we have any attributes
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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:128)
 */
@SuppressWarnings("serial")
public class MvcControllerDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcController";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __alias = new DmcAttributeInfo("alias",206,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __controlsMultiView = new DmcAttributeInfo("controlsMultiView",615,"MvcMultiView",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __controlsView = new DmcAttributeInfo("controlsView",614,"MvcView",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem",611,"MvcRegistryItem",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definesAction = new DmcAttributeInfo("definesAction",627,"MvcAction",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definesMenu = new DmcAttributeInfo("definesMenu",628,"MvcMenu",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definesMenuItem = new DmcAttributeInfo("definesMenuItem",629,"MvcMenuItem",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definesMenuSeparator = new DmcAttributeInfo("definesMenuSeparator",630,"MvcMenuSeparator",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent",603,"MvcEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",602,"MvcEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent",610,"MvcServerEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __parentController = new DmcAttributeInfo("parentController",618,"MvcController",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("subpackage",88,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem",612,"MvcRegistryItem",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__alias.id,__alias);
        _ImAp.put(__controlsMultiView.id,__controlsMultiView);
        _ImAp.put(__controlsView.id,__controlsView);
        _ImAp.put(__createsRegistryItem.id,__createsRegistryItem);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__definesAction.id,__definesAction);
        _ImAp.put(__definesMenu.id,__definesMenu);
        _ImAp.put(__definesMenuItem.id,__definesMenuItem);
        _ImAp.put(__definesMenuSeparator.id,__definesMenuSeparator);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__dispatchesEvent.id,__dispatchesEvent);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__handlesServerEvent.id,__handlesServerEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__parentController.id,__parentController);
        _ImAp.put(__subpackage.id,__subpackage);
        _ImAp.put(__usesRegistryItem.id,__usesRegistryItem);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__alias.name,__alias);
        _SmAp.put(__controlsMultiView.name,__controlsMultiView);
        _SmAp.put(__controlsView.name,__controlsView);
        _SmAp.put(__createsRegistryItem.name,__createsRegistryItem);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__definesAction.name,__definesAction);
        _SmAp.put(__definesMenu.name,__definesMenu);
        _SmAp.put(__definesMenuItem.name,__definesMenuItem);
        _SmAp.put(__definesMenuSeparator.name,__definesMenuSeparator);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__dispatchesEvent.name,__dispatchesEvent);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__handlesServerEvent.name,__handlesServerEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__parentController.name,__parentController);
        _SmAp.put(__subpackage.name,__subpackage);
        _SmAp.put(__usesRegistryItem.name,__usesRegistryItem);
    }

    public MvcControllerDMO() {
        super("MvcController");
    }

    protected MvcControllerDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
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
        MvcControllerDMO rc = new MvcControllerDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:679)
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
        if (obj instanceof MvcControllerDMO){
            return( getObjectName().equals( ((MvcControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getAlias(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__alias);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets alias to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setAlias(String value) {
        DmcAttribute<?> attr = get(__alias);
        if (attr == null)
            attr = new DmcTypeStringSV(__alias);
        
        try{
            attr.set(value);
            set(__alias,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setAlias(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__alias);
        if (attr == null)
            attr = new DmcTypeStringSV(__alias);
        
        attr.set(value);
        set(__alias,attr);
    }

    /**
     * Removes the alias attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remAlias(){
         rem(__alias);
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcViewREF> getControlsView(){
        DmcTypeMvcViewREFMV attr = (DmcTypeMvcViewREFMV) get(__controlsView);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcViewREF> getControlsViewREFs(){
        DmcTypeMvcViewREFMV attr = (DmcTypeMvcViewREFMV) get(__controlsView);
        if (attr == null)
            return( ((List<MvcViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another controlsView to the specified value.
     * @param value MvcView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addControlsView(MvcViewDMO value) {
        DmcAttribute<?> attr = get(__controlsView);
        if (attr == null)
            attr = new DmcTypeMvcViewREFMV(__controlsView);
        
        try{
            setLastValue(attr.add(value));
            add(__controlsView,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addControlsView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__controlsView);
        if (attr == null)
            attr = new DmcTypeMvcViewREFMV(__controlsView);
        
        setLastValue(attr.add(value));
        add(__controlsView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in controlsView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getControlsViewSize(){
        DmcAttribute<?> attr = get(__controlsView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delControlsView(Object value){
        DmcAttribute<?> attr = del(__controlsView, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the controlsView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remControlsView(){
         rem(__controlsView);
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcMultiViewREF> getControlsMultiView(){
        DmcTypeMvcMultiViewREFMV attr = (DmcTypeMvcMultiViewREFMV) get(__controlsMultiView);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcMultiViewREF> getControlsMultiViewREFs(){
        DmcTypeMvcMultiViewREFMV attr = (DmcTypeMvcMultiViewREFMV) get(__controlsMultiView);
        if (attr == null)
            return( ((List<MvcMultiViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another controlsMultiView to the specified value.
     * @param value MvcMultiView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addControlsMultiView(MvcMultiViewDMO value) {
        DmcAttribute<?> attr = get(__controlsMultiView);
        if (attr == null)
            attr = new DmcTypeMvcMultiViewREFMV(__controlsMultiView);
        
        try{
            setLastValue(attr.add(value));
            add(__controlsMultiView,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addControlsMultiView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__controlsMultiView);
        if (attr == null)
            attr = new DmcTypeMvcMultiViewREFMV(__controlsMultiView);
        
        setLastValue(attr.add(value));
        add(__controlsMultiView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in controlsMultiView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getControlsMultiViewSize(){
        DmcAttribute<?> attr = get(__controlsMultiView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delControlsMultiView(Object value){
        DmcAttribute<?> attr = del(__controlsMultiView, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the controlsMultiView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remControlsMultiView(){
         rem(__controlsMultiView);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcEventREF> getHandlesEvent(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__handlesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcEventREF> getHandlesEventREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__handlesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another handlesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addHandlesEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__handlesEvent);
        
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
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__handlesEvent);
        
        setLastValue(attr.add(value));
        add(__handlesEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in handlesEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delHandlesEvent(Object value){
        DmcAttribute<?> attr = del(__handlesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remHandlesEvent(){
         rem(__handlesEvent);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcServerEventREF> getHandlesServerEvent(){
        DmcTypeMvcServerEventREFMV attr = (DmcTypeMvcServerEventREFMV) get(__handlesServerEvent);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcServerEventREF> getHandlesServerEventREFs(){
        DmcTypeMvcServerEventREFMV attr = (DmcTypeMvcServerEventREFMV) get(__handlesServerEvent);
        if (attr == null)
            return( ((List<MvcServerEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another handlesServerEvent to the specified value.
     * @param value MvcServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addHandlesServerEvent(MvcServerEventDMO value) {
        DmcAttribute<?> attr = get(__handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREFMV(__handlesServerEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__handlesServerEvent,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addHandlesServerEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREFMV(__handlesServerEvent);
        
        setLastValue(attr.add(value));
        add(__handlesServerEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in handlesServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = get(__handlesServerEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delHandlesServerEvent(Object value){
        DmcAttribute<?> attr = del(__handlesServerEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remHandlesServerEvent(){
         rem(__handlesServerEvent);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcEventREF> getDispatchesEvent(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__dispatchesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcEventREF> getDispatchesEventREFs(){
        DmcTypeMvcEventREFMV attr = (DmcTypeMvcEventREFMV) get(__dispatchesEvent);
        if (attr == null)
            return( ((List<MvcEventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dispatchesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addDispatchesEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(__dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__dispatchesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__dispatchesEvent,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDispatchesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__dispatchesEvent);
        
        setLastValue(attr.add(value));
        add(__dispatchesEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dispatchesEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = get(__dispatchesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delDispatchesEvent(Object value){
        DmcAttribute<?> attr = del(__dispatchesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDispatchesEvent(){
         rem(__dispatchesEvent);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItem(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(__usesRegistryItem);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItemREFs(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(__usesRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addUsesRegistryItem(MvcRegistryItemDMO value) {
        DmcAttribute<?> attr = get(__usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__usesRegistryItem);
        
        try{
            setLastValue(attr.add(value));
            add(__usesRegistryItem,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addUsesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__usesRegistryItem);
        
        setLastValue(attr.add(value));
        add(__usesRegistryItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = get(__usesRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delUsesRegistryItem(Object value){
        DmcAttribute<?> attr = del(__usesRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remUsesRegistryItem(){
         rem(__usesRegistryItem);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItem(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(__createsRegistryItem);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItemREFs(){
        DmcTypeMvcRegistryItemREFMV attr = (DmcTypeMvcRegistryItemREFMV) get(__createsRegistryItem);
        if (attr == null)
            return( ((List<MvcRegistryItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another createsRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addCreatesRegistryItem(MvcRegistryItemDMO value) {
        DmcAttribute<?> attr = get(__createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__createsRegistryItem);
        
        try{
            setLastValue(attr.add(value));
            add(__createsRegistryItem,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addCreatesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__createsRegistryItem);
        
        setLastValue(attr.add(value));
        add(__createsRegistryItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in createsRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = get(__createsRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delCreatesRegistryItem(Object value){
        DmcAttribute<?> attr = del(__createsRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remCreatesRegistryItem(){
         rem(__createsRegistryItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:513)
    public MvcControllerREF getParentController(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(__parentController);
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
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(__parentController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentController to the specified value.
     * @param value MvcControllerDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:566)
    public void setParentController(MvcControllerDMO value) {
        DmcAttribute<?> attr = get(__parentController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(__parentController);
        
        try{
            attr.set(value);
            set(__parentController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets parentController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setParentController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__parentController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(__parentController);
        
        attr.set(value);
        set(__parentController,attr);
    }

    /**
     * Removes the parentController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remParentController(){
         rem(__parentController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setSubpackage(String value) {
        DmcAttribute<?> attr = get(__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__subpackage);
        
        try{
            attr.set(value);
            set(__subpackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__subpackage);
        
        attr.set(value);
        set(__subpackage,attr);
    }

    /**
     * Removes the subpackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSubpackage(){
         rem(__subpackage);
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcActionREF> getDefinesAction(){
        DmcTypeMvcActionREFMV attr = (DmcTypeMvcActionREFMV) get(__definesAction);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcActionREF> getDefinesActionREFs(){
        DmcTypeMvcActionREFMV attr = (DmcTypeMvcActionREFMV) get(__definesAction);
        if (attr == null)
            return( ((List<MvcActionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesAction to the specified value.
     * @param value MvcAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addDefinesAction(MvcActionDMO value) {
        DmcAttribute<?> attr = get(__definesAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFMV(__definesAction);
        
        try{
            setLastValue(attr.add(value));
            add(__definesAction,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDefinesAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definesAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFMV(__definesAction);
        
        setLastValue(attr.add(value));
        add(__definesAction,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDefinesActionSize(){
        DmcAttribute<?> attr = get(__definesAction);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delDefinesAction(Object value){
        DmcAttribute<?> attr = del(__definesAction, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDefinesAction(){
         rem(__definesAction);
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcMenuREF> getDefinesMenu(){
        DmcTypeMvcMenuREFMV attr = (DmcTypeMvcMenuREFMV) get(__definesMenu);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcMenuREF> getDefinesMenuREFs(){
        DmcTypeMvcMenuREFMV attr = (DmcTypeMvcMenuREFMV) get(__definesMenu);
        if (attr == null)
            return( ((List<MvcMenuREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenu to the specified value.
     * @param value MvcMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addDefinesMenu(MvcMenuDMO value) {
        DmcAttribute<?> attr = get(__definesMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFMV(__definesMenu);
        
        try{
            setLastValue(attr.add(value));
            add(__definesMenu,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDefinesMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definesMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFMV(__definesMenu);
        
        setLastValue(attr.add(value));
        add(__definesMenu,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDefinesMenuSize(){
        DmcAttribute<?> attr = get(__definesMenu);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delDefinesMenu(Object value){
        DmcAttribute<?> attr = del(__definesMenu, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDefinesMenu(){
         rem(__definesMenu);
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcMenuItemREF> getDefinesMenuItem(){
        DmcTypeMvcMenuItemREFMV attr = (DmcTypeMvcMenuItemREFMV) get(__definesMenuItem);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcMenuItemREF> getDefinesMenuItemREFs(){
        DmcTypeMvcMenuItemREFMV attr = (DmcTypeMvcMenuItemREFMV) get(__definesMenuItem);
        if (attr == null)
            return( ((List<MvcMenuItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenuItem to the specified value.
     * @param value MvcMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addDefinesMenuItem(MvcMenuItemDMO value) {
        DmcAttribute<?> attr = get(__definesMenuItem);
        if (attr == null)
            attr = new DmcTypeMvcMenuItemREFMV(__definesMenuItem);
        
        try{
            setLastValue(attr.add(value));
            add(__definesMenuItem,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDefinesMenuItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definesMenuItem);
        if (attr == null)
            attr = new DmcTypeMvcMenuItemREFMV(__definesMenuItem);
        
        setLastValue(attr.add(value));
        add(__definesMenuItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDefinesMenuItemSize(){
        DmcAttribute<?> attr = get(__definesMenuItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delDefinesMenuItem(Object value){
        DmcAttribute<?> attr = del(__definesMenuItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenuItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDefinesMenuItem(){
         rem(__definesMenuItem);
    }

    /**
     * @return An Iterator of MvcMenuSeparatorDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<MvcMenuSeparatorREF> getDefinesMenuSeparator(){
        DmcTypeMvcMenuSeparatorREFMV attr = (DmcTypeMvcMenuSeparatorREFMV) get(__definesMenuSeparator);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<MvcMenuSeparatorREF> getDefinesMenuSeparatorREFs(){
        DmcTypeMvcMenuSeparatorREFMV attr = (DmcTypeMvcMenuSeparatorREFMV) get(__definesMenuSeparator);
        if (attr == null)
            return( ((List<MvcMenuSeparatorREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another definesMenuSeparator to the specified value.
     * @param value MvcMenuSeparator
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addDefinesMenuSeparator(MvcMenuSeparatorDMO value) {
        DmcAttribute<?> attr = get(__definesMenuSeparator);
        if (attr == null)
            attr = new DmcTypeMvcMenuSeparatorREFMV(__definesMenuSeparator);
        
        try{
            setLastValue(attr.add(value));
            add(__definesMenuSeparator,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDefinesMenuSeparator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definesMenuSeparator);
        if (attr == null)
            attr = new DmcTypeMvcMenuSeparatorREFMV(__definesMenuSeparator);
        
        setLastValue(attr.add(value));
        add(__definesMenuSeparator,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definesMenuSeparator
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDefinesMenuSeparatorSize(){
        DmcAttribute<?> attr = get(__definesMenuSeparator);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definesMenuSeparator value.
     * @param value The MvcMenuSeparator to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delDefinesMenuSeparator(Object value){
        DmcAttribute<?> attr = del(__definesMenuSeparator, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the definesMenuSeparator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDefinesMenuSeparator(){
         rem(__definesMenuSeparator);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remName(){
         rem(__name);
    }




}
