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
import java.io.Serializable;                                                               // Always required
import java.util.*;                                                                        // Always required
import org.dmd.dmc.DmcAttribute;                                                           // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                       // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                       // Named object
import org.dmd.dmc.DmcOmni;                                                                // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                           // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                      // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                                    // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                           // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                          // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                       // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                 // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                      // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                                        // Required type
import org.dmd.dms.generated.types.DmcTypeStringSET;                                       // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                                        // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;                              // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                      // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;                     // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.DisplayDataSpec;                     // Primitive type and !auxiliary class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeDisplayDataSpecMV;            // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventREFMV;                   // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventREFSET;                  // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventSpecMV;                  // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMethodWithArgsMV;             // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeOperationSpecMV;              // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeOperationSpecSV;              // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeRunContextItemREFSET;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventREF;                            // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventSpec;                           // Primitive type and !auxiliary class
import org.dmd.mvw.tools.mvwgenerator.generated.types.OperationSpec;                       // Primitive type and !auxiliary class
import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;                   // Helper class
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;                                // Primitive type and !auxiliary class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The View is used to define the aspects of two kinds of interfaces that
 * define the functionality provided by a view of a model; the event
 * interface and the  data interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ViewDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "View";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __broadcast = new DmcAttributeInfo("broadcast",822,"Event",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __broadcastOnly = new DmcAttributeInfo("broadcastOnly",823,"Event",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __clickEvent = new DmcAttributeInfo("clickEvent",819,"OperationSpec",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __createEvent = new DmcAttributeInfo("createEvent",821,"OperationSpec",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __deleteEvent = new DmcAttributeInfo("deleteEvent",818,"EventSpec",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __displayDMO = new DmcAttributeInfo("displayDMO",816,"DisplayDataSpec",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __extendsInterface = new DmcAttributeInfo("extendsInterface",119,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __isWidget = new DmcAttributeInfo("isWidget",813,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __local = new DmcAttributeInfo("local",832,"Event",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __modifyEvent = new DmcAttributeInfo("modifyEvent",820,"OperationSpec",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __presenterImport = new DmcAttributeInfo("presenterImport",836,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __presenterMethod = new DmcAttributeInfo("presenterMethod",824,"MethodWithArgs",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __selectEvent = new DmcAttributeInfo("selectEvent",817,"EventSpec",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sharedImport = new DmcAttributeInfo("sharedImport",838,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass",807,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useRunContextItem = new DmcAttributeInfo("useRunContextItem",835,"RunContextItem",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __viewImport = new DmcAttributeInfo("viewImport",837,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __viewMethod = new DmcAttributeInfo("viewMethod",825,"MethodWithArgs",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __viewName = new DmcAttributeInfo("viewName",812,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__broadcast.id,__broadcast);
        _ImAp.put(__broadcastOnly.id,__broadcastOnly);
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__clickEvent.id,__clickEvent);
        _ImAp.put(__createEvent.id,__createEvent);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__deleteEvent.id,__deleteEvent);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__displayDMO.id,__displayDMO);
        _ImAp.put(__extendsInterface.id,__extendsInterface);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__isWidget.id,__isWidget);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__local.id,__local);
        _ImAp.put(__modifyEvent.id,__modifyEvent);
        _ImAp.put(__presenterImport.id,__presenterImport);
        _ImAp.put(__presenterMethod.id,__presenterMethod);
        _ImAp.put(__selectEvent.id,__selectEvent);
        _ImAp.put(__sharedImport.id,__sharedImport);
        _ImAp.put(__useBaseClass.id,__useBaseClass);
        _ImAp.put(__useRunContextItem.id,__useRunContextItem);
        _ImAp.put(__viewImport.id,__viewImport);
        _ImAp.put(__viewMethod.id,__viewMethod);
        _ImAp.put(__viewName.id,__viewName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__broadcast.name,__broadcast);
        _SmAp.put(__broadcastOnly.name,__broadcastOnly);
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__clickEvent.name,__clickEvent);
        _SmAp.put(__createEvent.name,__createEvent);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__deleteEvent.name,__deleteEvent);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__displayDMO.name,__displayDMO);
        _SmAp.put(__extendsInterface.name,__extendsInterface);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__isWidget.name,__isWidget);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__local.name,__local);
        _SmAp.put(__modifyEvent.name,__modifyEvent);
        _SmAp.put(__presenterImport.name,__presenterImport);
        _SmAp.put(__presenterMethod.name,__presenterMethod);
        _SmAp.put(__selectEvent.name,__selectEvent);
        _SmAp.put(__sharedImport.name,__sharedImport);
        _SmAp.put(__useBaseClass.name,__useBaseClass);
        _SmAp.put(__useRunContextItem.name,__useRunContextItem);
        _SmAp.put(__viewImport.name,__viewImport);
        _SmAp.put(__viewMethod.name,__viewMethod);
        _SmAp.put(__viewName.name,__viewName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ViewDMO() {
        super("View");
    }

    protected ViewDMO(String oc) {
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

    @Override
    public ViewDMO getNew(){
        ViewDMO rc = new ViewDMO();
        return(rc);
    }

    @Override
    public ViewDMO getSlice(DmcSliceInfo info){
        ViewDMO rc = new ViewDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ViewDMO(DmcTypeModifierMV mods) {
        super("View");
        modrec(true);
        setModifier(mods);
    }

    public ViewDMO getModificationRecorder(){
        ViewDMO rc = new ViewDMO();
        rc.setViewName(getViewName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__viewName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__viewName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ViewDMO){
            return( getObjectName().equals( ((ViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getUseBaseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__useBaseClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setUseBaseClass(String value) {
        DmcAttribute<?> attr = get(__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useBaseClass);
        
        try{
            attr.set(value);
            set(__useBaseClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setUseBaseClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useBaseClass);
        
        attr.set(value);
        set(__useBaseClass,attr);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remUseBaseClass(){
         rem(__useBaseClass);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<EventREF> getLocal(){
        DmcTypeEventREFSET attr = (DmcTypeEventREFSET) get(__local);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<EventREF> getLocalREFs(){
        DmcTypeEventREFSET attr = (DmcTypeEventREFSET) get(__local);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another local to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addLocal(EventDMO value) {
        DmcAttribute<?> attr = get(__local);
        if (attr == null)
            attr = new DmcTypeEventREFSET(__local);
        
        try{
            setLastValue(attr.add(value));
            add(__local,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another local value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addLocal(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__local);
        if (attr == null)
            attr = new DmcTypeEventREFSET(__local);
        
        setLastValue(attr.add(value));
        add(__local,attr);
        return(attr);
    }

    /**
     * Returns the number of values in local
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getLocalSize(){
        DmcAttribute<?> attr = get(__local);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a local value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delLocal(Object value){
        DmcAttribute<?> attr = del(__local, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the local attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remLocal(){
         rem(__local);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<EventREF> getBroadcast(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(__broadcast);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<EventREF> getBroadcastREFs(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(__broadcast);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another broadcast to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addBroadcast(EventDMO value) {
        DmcAttribute<?> attr = get(__broadcast);
        if (attr == null)
            attr = new DmcTypeEventREFMV(__broadcast);
        
        try{
            setLastValue(attr.add(value));
            add(__broadcast,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another broadcast value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addBroadcast(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__broadcast);
        if (attr == null)
            attr = new DmcTypeEventREFMV(__broadcast);
        
        setLastValue(attr.add(value));
        add(__broadcast,attr);
        return(attr);
    }

    /**
     * Returns the number of values in broadcast
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getBroadcastSize(){
        DmcAttribute<?> attr = get(__broadcast);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a broadcast value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delBroadcast(Object value){
        DmcAttribute<?> attr = del(__broadcast, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the broadcast attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remBroadcast(){
         rem(__broadcast);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<EventREF> getBroadcastOnly(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(__broadcastOnly);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<EventREF> getBroadcastOnlyREFs(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(__broadcastOnly);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another broadcastOnly to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addBroadcastOnly(EventDMO value) {
        DmcAttribute<?> attr = get(__broadcastOnly);
        if (attr == null)
            attr = new DmcTypeEventREFMV(__broadcastOnly);
        
        try{
            setLastValue(attr.add(value));
            add(__broadcastOnly,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another broadcastOnly value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addBroadcastOnly(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__broadcastOnly);
        if (attr == null)
            attr = new DmcTypeEventREFMV(__broadcastOnly);
        
        setLastValue(attr.add(value));
        add(__broadcastOnly,attr);
        return(attr);
    }

    /**
     * Returns the number of values in broadcastOnly
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getBroadcastOnlySize(){
        DmcAttribute<?> attr = get(__broadcastOnly);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a broadcastOnly value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delBroadcastOnly(Object value){
        DmcAttribute<?> attr = del(__broadcastOnly, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the broadcastOnly attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remBroadcastOnly(){
         rem(__broadcastOnly);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getViewImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__viewImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthViewImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__viewImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another viewImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addViewImport(String value) {
        DmcAttribute<?> attr = get(__viewImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__viewImport);
        
        try{
            setLastValue(attr.add(value));
            add(__viewImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean viewImportContains(String value) {
        DmcAttribute<?> attr = get(__viewImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another viewImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addViewImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__viewImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__viewImport);
        
        setLastValue(attr.add(value));
        add(__viewImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in viewImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getViewImportSize(){
        DmcAttribute<?> attr = get(__viewImport);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a viewImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delViewImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__viewImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__viewImport), value);
        else
            attr = del(__viewImport, value);
        
        return(attr);
    }

    /**
     * Deletes a viewImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delViewImport(String value) {
        DmcAttribute<?> attr = get(__viewImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__viewImport), value);
        else
            attr = del(__viewImport, value);
        
        return(attr);
    }

    /**
     * Removes the viewImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remViewImport(){
         rem(__viewImport);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getPresenterImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__presenterImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthPresenterImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__presenterImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another presenterImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addPresenterImport(String value) {
        DmcAttribute<?> attr = get(__presenterImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__presenterImport);
        
        try{
            setLastValue(attr.add(value));
            add(__presenterImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean presenterImportContains(String value) {
        DmcAttribute<?> attr = get(__presenterImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another presenterImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addPresenterImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__presenterImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__presenterImport);
        
        setLastValue(attr.add(value));
        add(__presenterImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in presenterImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getPresenterImportSize(){
        DmcAttribute<?> attr = get(__presenterImport);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a presenterImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delPresenterImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__presenterImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__presenterImport), value);
        else
            attr = del(__presenterImport, value);
        
        return(attr);
    }

    /**
     * Deletes a presenterImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delPresenterImport(String value) {
        DmcAttribute<?> attr = get(__presenterImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__presenterImport), value);
        else
            attr = del(__presenterImport, value);
        
        return(attr);
    }

    /**
     * Removes the presenterImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remPresenterImport(){
         rem(__presenterImport);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getSharedImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__sharedImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthSharedImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(__sharedImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another sharedImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addSharedImport(String value) {
        DmcAttribute<?> attr = get(__sharedImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__sharedImport);
        
        try{
            setLastValue(attr.add(value));
            add(__sharedImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean sharedImportContains(String value) {
        DmcAttribute<?> attr = get(__sharedImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another sharedImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addSharedImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sharedImport);
        if (attr == null)
            attr = new DmcTypeStringSET(__sharedImport);
        
        setLastValue(attr.add(value));
        add(__sharedImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in sharedImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getSharedImportSize(){
        DmcAttribute<?> attr = get(__sharedImport);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a sharedImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delSharedImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sharedImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__sharedImport), value);
        else
            attr = del(__sharedImport, value);
        
        return(attr);
    }

    /**
     * Deletes a sharedImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delSharedImport(String value) {
        DmcAttribute<?> attr = get(__sharedImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(__sharedImport), value);
        else
            attr = del(__sharedImport, value);
        
        return(attr);
    }

    /**
     * Removes the sharedImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remSharedImport(){
         rem(__sharedImport);
    }

    /**
     * @return An Iterator of RunContextItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<RunContextItemREF> getUseRunContextItem(){
        DmcTypeRunContextItemREFSET attr = (DmcTypeRunContextItemREFSET) get(__useRunContextItem);
        if (attr == null)
            return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of RunContextItemREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<RunContextItemREF> getUseRunContextItemREFs(){
        DmcTypeRunContextItemREFSET attr = (DmcTypeRunContextItemREFSET) get(__useRunContextItem);
        if (attr == null)
            return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another useRunContextItem to the specified value.
     * @param value RunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addUseRunContextItem(RunContextItemDMO value) {
        DmcAttribute<?> attr = get(__useRunContextItem);
        if (attr == null)
            attr = new DmcTypeRunContextItemREFSET(__useRunContextItem);
        
        try{
            setLastValue(attr.add(value));
            add(__useRunContextItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another useRunContextItem value.
     * @param value A value compatible with RunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addUseRunContextItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__useRunContextItem);
        if (attr == null)
            attr = new DmcTypeRunContextItemREFSET(__useRunContextItem);
        
        setLastValue(attr.add(value));
        add(__useRunContextItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in useRunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getUseRunContextItemSize(){
        DmcAttribute<?> attr = get(__useRunContextItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a useRunContextItem value.
     * @param value The RunContextItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delUseRunContextItem(Object value){
        DmcAttribute<?> attr = del(__useRunContextItem, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the useRunContextItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remUseRunContextItem(){
         rem(__useRunContextItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public Boolean isIsWidget(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isWidget);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isWidget to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setIsWidget(Boolean value) {
        DmcAttribute<?> attr = get(__isWidget);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isWidget);
        
        try{
            attr.set(value);
            set(__isWidget,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets isWidget to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setIsWidget(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__isWidget);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isWidget);
        
        attr.set(value);
        set(__isWidget,attr);
    }

    /**
     * Removes the isWidget attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remIsWidget(){
         rem(__isWidget);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getExtendsInterface(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__extendsInterface);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthExtendsInterface(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__extendsInterface);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another extendsInterface to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addExtendsInterface(String value) {
        DmcAttribute<?> attr = get(__extendsInterface);
        if (attr == null)
            attr = new DmcTypeStringMV(__extendsInterface);
        
        try{
            setLastValue(attr.add(value));
            add(__extendsInterface,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean extendsInterfaceContains(String value) {
        DmcAttribute<?> attr = get(__extendsInterface);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another extendsInterface value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addExtendsInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__extendsInterface);
        if (attr == null)
            attr = new DmcTypeStringMV(__extendsInterface);
        
        setLastValue(attr.add(value));
        add(__extendsInterface,attr);
        return(attr);
    }

    /**
     * Returns the number of values in extendsInterface
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getExtendsInterfaceSize(){
        DmcAttribute<?> attr = get(__extendsInterface);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a extendsInterface value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delExtendsInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__extendsInterface);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__extendsInterface), value);
        else
            attr = del(__extendsInterface, value);
        
        return(attr);
    }

    /**
     * Deletes a extendsInterface from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delExtendsInterface(String value) {
        DmcAttribute<?> attr = get(__extendsInterface);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__extendsInterface), value);
        else
            attr = del(__extendsInterface, value);
        
        return(attr);
    }

    /**
     * Removes the extendsInterface attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remExtendsInterface(){
         rem(__extendsInterface);
    }

    /**
     * @return An Iterator of MethodWithArgs objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<MethodWithArgs> getPresenterMethod(){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(__presenterMethod);
        if (attr == null)
            return( ((List<MethodWithArgs>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MethodWithArgs value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public MethodWithArgs getNthPresenterMethod(int i){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(__presenterMethod);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another presenterMethod to the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addPresenterMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__presenterMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(__presenterMethod);
        
        try{
            setLastValue(attr.add(value));
            add(__presenterMethod,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MethodWithArgs.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean presenterMethodContains(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__presenterMethod);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another presenterMethod value.
     * @param value A value compatible with MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addPresenterMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__presenterMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(__presenterMethod);
        
        setLastValue(attr.add(value));
        add(__presenterMethod,attr);
        return(attr);
    }

    /**
     * Returns the number of values in presenterMethod
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getPresenterMethodSize(){
        DmcAttribute<?> attr = get(__presenterMethod);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a presenterMethod value.
     * @param value The MethodWithArgs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delPresenterMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__presenterMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(__presenterMethod), value);
        else
            attr = del(__presenterMethod, value);
        
        return(attr);
    }

    /**
     * Deletes a presenterMethod from the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delPresenterMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__presenterMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(__presenterMethod), value);
        else
            attr = del(__presenterMethod, value);
        
        return(attr);
    }

    /**
     * Removes the presenterMethod attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remPresenterMethod(){
         rem(__presenterMethod);
    }

    /**
     * @return An Iterator of MethodWithArgs objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<MethodWithArgs> getViewMethod(){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(__viewMethod);
        if (attr == null)
            return( ((List<MethodWithArgs>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MethodWithArgs value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public MethodWithArgs getNthViewMethod(int i){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(__viewMethod);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another viewMethod to the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addViewMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__viewMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(__viewMethod);
        
        try{
            setLastValue(attr.add(value));
            add(__viewMethod,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MethodWithArgs.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean viewMethodContains(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__viewMethod);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another viewMethod value.
     * @param value A value compatible with MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addViewMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__viewMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(__viewMethod);
        
        setLastValue(attr.add(value));
        add(__viewMethod,attr);
        return(attr);
    }

    /**
     * Returns the number of values in viewMethod
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getViewMethodSize(){
        DmcAttribute<?> attr = get(__viewMethod);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a viewMethod value.
     * @param value The MethodWithArgs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delViewMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__viewMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(__viewMethod), value);
        else
            attr = del(__viewMethod, value);
        
        return(attr);
    }

    /**
     * Deletes a viewMethod from the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delViewMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(__viewMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(__viewMethod), value);
        else
            attr = del(__viewMethod, value);
        
        return(attr);
    }

    /**
     * Removes the viewMethod attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remViewMethod(){
         rem(__viewMethod);
    }

    /**
     * @return An Iterator of DisplayDataSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<DisplayDataSpec> getDisplayDMO(){
        DmcTypeDisplayDataSpecMV attr = (DmcTypeDisplayDataSpecMV) get(__displayDMO);
        if (attr == null)
            return( ((List<DisplayDataSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DisplayDataSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public DisplayDataSpec getNthDisplayDMO(int i){
        DmcTypeDisplayDataSpecMV attr = (DmcTypeDisplayDataSpecMV) get(__displayDMO);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another displayDMO to the specified value.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDisplayDMO(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(__displayDMO);
        if (attr == null)
            attr = new DmcTypeDisplayDataSpecMV(__displayDMO);
        
        try{
            setLastValue(attr.add(value));
            add(__displayDMO,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DisplayDataSpec.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean displayDMOContains(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(__displayDMO);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another displayDMO value.
     * @param value A value compatible with DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDisplayDMO(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__displayDMO);
        if (attr == null)
            attr = new DmcTypeDisplayDataSpecMV(__displayDMO);
        
        setLastValue(attr.add(value));
        add(__displayDMO,attr);
        return(attr);
    }

    /**
     * Returns the number of values in displayDMO
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDisplayDMOSize(){
        DmcAttribute<?> attr = get(__displayDMO);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a displayDMO value.
     * @param value The DisplayDataSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDisplayDMO(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__displayDMO);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDisplayDataSpecMV(__displayDMO), value);
        else
            attr = del(__displayDMO, value);
        
        return(attr);
    }

    /**
     * Deletes a displayDMO from the specified value.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDisplayDMO(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(__displayDMO);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDisplayDataSpecMV(__displayDMO), value);
        else
            attr = del(__displayDMO, value);
        
        return(attr);
    }

    /**
     * Removes the displayDMO attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDisplayDMO(){
         rem(__displayDMO);
    }

    /**
     * @return An Iterator of EventSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<EventSpec> getSelectEvent(){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(__selectEvent);
        if (attr == null)
            return( ((List<EventSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EventSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public EventSpec getNthSelectEvent(int i){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(__selectEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another selectEvent to the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addSelectEvent(EventSpec value) {
        DmcAttribute<?> attr = get(__selectEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(__selectEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__selectEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EventSpec.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean selectEventContains(EventSpec value) {
        DmcAttribute<?> attr = get(__selectEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another selectEvent value.
     * @param value A value compatible with EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addSelectEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__selectEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(__selectEvent);
        
        setLastValue(attr.add(value));
        add(__selectEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in selectEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getSelectEventSize(){
        DmcAttribute<?> attr = get(__selectEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a selectEvent value.
     * @param value The EventSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delSelectEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__selectEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(__selectEvent), value);
        else
            attr = del(__selectEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a selectEvent from the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delSelectEvent(EventSpec value) {
        DmcAttribute<?> attr = get(__selectEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(__selectEvent), value);
        else
            attr = del(__selectEvent, value);
        
        return(attr);
    }

    /**
     * Removes the selectEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remSelectEvent(){
         rem(__selectEvent);
    }

    /**
     * @return An Iterator of EventSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<EventSpec> getDeleteEvent(){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(__deleteEvent);
        if (attr == null)
            return( ((List<EventSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EventSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public EventSpec getNthDeleteEvent(int i){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(__deleteEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another deleteEvent to the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDeleteEvent(EventSpec value) {
        DmcAttribute<?> attr = get(__deleteEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(__deleteEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__deleteEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EventSpec.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean deleteEventContains(EventSpec value) {
        DmcAttribute<?> attr = get(__deleteEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another deleteEvent value.
     * @param value A value compatible with EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDeleteEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__deleteEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(__deleteEvent);
        
        setLastValue(attr.add(value));
        add(__deleteEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in deleteEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDeleteEventSize(){
        DmcAttribute<?> attr = get(__deleteEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a deleteEvent value.
     * @param value The EventSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDeleteEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__deleteEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(__deleteEvent), value);
        else
            attr = del(__deleteEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a deleteEvent from the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDeleteEvent(EventSpec value) {
        DmcAttribute<?> attr = get(__deleteEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(__deleteEvent), value);
        else
            attr = del(__deleteEvent, value);
        
        return(attr);
    }

    /**
     * Removes the deleteEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDeleteEvent(){
         rem(__deleteEvent);
    }

    /**
     * @return An Iterator of OperationSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<OperationSpec> getClickEvent(){
        DmcTypeOperationSpecMV attr = (DmcTypeOperationSpecMV) get(__clickEvent);
        if (attr == null)
            return( ((List<OperationSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth OperationSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public OperationSpec getNthClickEvent(int i){
        DmcTypeOperationSpecMV attr = (DmcTypeOperationSpecMV) get(__clickEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another clickEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addClickEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(__clickEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecMV(__clickEvent);
        
        try{
            setLastValue(attr.add(value));
            add(__clickEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified OperationSpec.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean clickEventContains(OperationSpec value) {
        DmcAttribute<?> attr = get(__clickEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another clickEvent value.
     * @param value A value compatible with OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addClickEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__clickEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecMV(__clickEvent);
        
        setLastValue(attr.add(value));
        add(__clickEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in clickEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getClickEventSize(){
        DmcAttribute<?> attr = get(__clickEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a clickEvent value.
     * @param value The OperationSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delClickEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__clickEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeOperationSpecMV(__clickEvent), value);
        else
            attr = del(__clickEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a clickEvent from the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delClickEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(__clickEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeOperationSpecMV(__clickEvent), value);
        else
            attr = del(__clickEvent, value);
        
        return(attr);
    }

    /**
     * Removes the clickEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remClickEvent(){
         rem(__clickEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public OperationSpec getModifyEvent(){
        DmcTypeOperationSpecSV attr = (DmcTypeOperationSpecSV) get(__modifyEvent);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets modifyEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setModifyEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(__modifyEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(__modifyEvent);
        
        try{
            attr.set(value);
            set(__modifyEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets modifyEvent to the specified value.
     * @param value A value compatible with DmcTypeOperationSpecSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setModifyEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modifyEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(__modifyEvent);
        
        attr.set(value);
        set(__modifyEvent,attr);
    }

    /**
     * Removes the modifyEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remModifyEvent(){
         rem(__modifyEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public OperationSpec getCreateEvent(){
        DmcTypeOperationSpecSV attr = (DmcTypeOperationSpecSV) get(__createEvent);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets createEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setCreateEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(__createEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(__createEvent);
        
        try{
            attr.set(value);
            set(__createEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets createEvent to the specified value.
     * @param value A value compatible with DmcTypeOperationSpecSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setCreateEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__createEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(__createEvent);
        
        attr.set(value);
        set(__createEvent,attr);
    }

    /**
     * Removes the createEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remCreateEvent(){
         rem(__createEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getViewName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__viewName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets viewName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setViewName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__viewName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__viewName);
        
        try{
            attr.set(value);
            set(__viewName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets viewName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setViewName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__viewName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__viewName);
        
        attr.set(value);
        set(__viewName,attr);
    }

    /**
     * Removes the viewName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remViewName(){
         rem(__viewName);
    }




}
