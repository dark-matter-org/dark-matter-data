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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:267)
import java.io.Serializable;                                                        // Always required
import java.util.*;                                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution
import org.dmd.dmc.DmcValueException;                                               // Any attributes
import org.dmd.dmc.types.StringName;                                                // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                                   // Required if we have any attributes
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

/**
 * The MvcView class allows for the definition of views. MvcView instance are
 * derived from the ExtGWT View class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:126)
 */
@SuppressWarnings("serial")
public class MvcViewDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcView";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem",611,"MvcRegistryItem",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent",603,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",619,"MvcEvent",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",602,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent",610,"MvcServerEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem",612,"MvcRegistryItem",ValueTypeEnum.MULTI,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__createsRegistryItem.id,__createsRegistryItem);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__dispatchesEvent.id,__dispatchesEvent);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__handlesServerEvent.id,__handlesServerEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__usesRegistryItem.id,__usesRegistryItem);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__createsRegistryItem.name,__createsRegistryItem);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__dispatchesEvent.name,__dispatchesEvent);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__handlesServerEvent.name,__handlesServerEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__usesRegistryItem.name,__usesRegistryItem);
    }

    public MvcViewDMO() {
        super("MvcView");
    }

    protected MvcViewDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcViewDMO getNew(){
        MvcViewDMO rc = new MvcViewDMO();
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:676)
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
        if (obj instanceof MvcViewDMO){
            return( getObjectName().equals( ((MvcViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:696)
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
     * Adds another handlesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:717)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__handlesEvent);
        
        setLastValue(attr.add(value));
        add(__handlesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> delHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__handlesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remHandlesEvent(){
         rem(__handlesEvent);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:696)
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
     * Adds another handlesServerEvent to the specified value.
     * @param value MvcServerEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:717)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addHandlesServerEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREFMV(__handlesServerEvent);
        
        setLastValue(attr.add(value));
        add(__handlesServerEvent,attr);
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> delHandlesServerEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__handlesServerEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remHandlesServerEvent(){
         rem(__handlesServerEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:499)
    public MvcEventREF getFiresEvent(){
        DmcTypeMvcEventREFSV attr = (DmcTypeMvcEventREFSV) get(__firesEvent);
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
     * Sets firesEvent to the specified value.
     * @param value MvcEventDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:538)
    public void setFiresEvent(MvcEventDMO value) {
        DmcAttribute<?> attr = get(__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFSV(__firesEvent);
        
        try{
            attr.set(value);
            set(__firesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets firesEvent to the specified value.
     * @param value A value compatible with DmcTypeMvcEventREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setFiresEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__firesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFSV(__firesEvent);
        
        attr.set(value);
        set(__firesEvent,attr);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remFiresEvent(){
         rem(__firesEvent);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:696)
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
     * Adds another dispatchesEvent to the specified value.
     * @param value MvcEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:717)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addDispatchesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREFMV(__dispatchesEvent);
        
        setLastValue(attr.add(value));
        add(__dispatchesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> delDispatchesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__dispatchesEvent, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remDispatchesEvent(){
         rem(__dispatchesEvent);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:696)
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
     * Adds another usesRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:717)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addUsesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__usesRegistryItem);
        
        setLastValue(attr.add(value));
        add(__usesRegistryItem,attr);
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> delUsesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__usesRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remUsesRegistryItem(){
         rem(__usesRegistryItem);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:696)
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
     * Adds another createsRegistryItem to the specified value.
     * @param value MvcRegistryItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:717)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:787)
    public DmcAttribute<?> addCreatesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREFMV(__createsRegistryItem);
        
        setLastValue(attr.add(value));
        add(__createsRegistryItem,attr);
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:828)
    public DmcAttribute<?> delCreatesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__createsRegistryItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remCreatesRegistryItem(){
         rem(__createsRegistryItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        try{
            attr.set(value);
            set(__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remDescription(){
         rem(__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remName(){
         rem(__name);
    }




}
