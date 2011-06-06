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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                                    // Always required
import java.util.*;                                                             // Always required
import org.dmd.dmc.DmcAttribute;                                                // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                            // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing
import org.dmd.dmc.DmcValueException;                                           // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                         // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                               // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                      // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;               // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeViewREFMV;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Presenter is a behavioural component that manages one or more Views
 * and thus implements the Presenter interface of any View it manages.
 * Presenters populate and potentially update Views with data. This will
 * often involve interacting with the communications interface(s) associated
 * with an application. If a View allows the creation or alteration of data,
 * those behaviours are usually handled directly by the View's Presenter.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class PresenterDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Presenter";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __centralDMPErrorHandler = new DmcAttributeInfo("centralDMPErrorHandler",851,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __centralRPCErrorHandler = new DmcAttributeInfo("centralRPCErrorHandler",852,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName",811,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",801,"Event",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",802,"Event",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __managesView = new DmcAttributeInfo("managesView",841,"View",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __presenterName = new DmcAttributeInfo("presenterName",839,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __sendsActionRequest = new DmcAttributeInfo("sendsActionRequest",848,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsCreateRequest = new DmcAttributeInfo("sendsCreateRequest",847,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsDeleteRequest = new DmcAttributeInfo("sendsDeleteRequest",845,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsGetRequest = new DmcAttributeInfo("sendsGetRequest",844,"GetWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsLoginRequest = new DmcAttributeInfo("sendsLoginRequest",849,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsLogoutRequest = new DmcAttributeInfo("sendsLogoutRequest",850,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsSetRequest = new DmcAttributeInfo("sendsSetRequest",846,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass",807,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useRunContextItem = new DmcAttributeInfo("useRunContextItem",835,"RunContextItem",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useSchema = new DmcAttributeInfo("useSchema",843,"SchemaDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__centralDMPErrorHandler.id,__centralDMPErrorHandler);
        _ImAp.put(__centralRPCErrorHandler.id,__centralRPCErrorHandler);
        _ImAp.put(__componentName.id,__componentName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__managesView.id,__managesView);
        _ImAp.put(__presenterName.id,__presenterName);
        _ImAp.put(__sendsActionRequest.id,__sendsActionRequest);
        _ImAp.put(__sendsCreateRequest.id,__sendsCreateRequest);
        _ImAp.put(__sendsDeleteRequest.id,__sendsDeleteRequest);
        _ImAp.put(__sendsGetRequest.id,__sendsGetRequest);
        _ImAp.put(__sendsLoginRequest.id,__sendsLoginRequest);
        _ImAp.put(__sendsLogoutRequest.id,__sendsLogoutRequest);
        _ImAp.put(__sendsSetRequest.id,__sendsSetRequest);
        _ImAp.put(__useBaseClass.id,__useBaseClass);
        _ImAp.put(__useRunContextItem.id,__useRunContextItem);
        _ImAp.put(__useSchema.id,__useSchema);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__centralDMPErrorHandler.name,__centralDMPErrorHandler);
        _SmAp.put(__centralRPCErrorHandler.name,__centralRPCErrorHandler);
        _SmAp.put(__componentName.name,__componentName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__managesView.name,__managesView);
        _SmAp.put(__presenterName.name,__presenterName);
        _SmAp.put(__sendsActionRequest.name,__sendsActionRequest);
        _SmAp.put(__sendsCreateRequest.name,__sendsCreateRequest);
        _SmAp.put(__sendsDeleteRequest.name,__sendsDeleteRequest);
        _SmAp.put(__sendsGetRequest.name,__sendsGetRequest);
        _SmAp.put(__sendsLoginRequest.name,__sendsLoginRequest);
        _SmAp.put(__sendsLogoutRequest.name,__sendsLogoutRequest);
        _SmAp.put(__sendsSetRequest.name,__sendsSetRequest);
        _SmAp.put(__useBaseClass.name,__useBaseClass);
        _SmAp.put(__useRunContextItem.name,__useRunContextItem);
        _SmAp.put(__useSchema.name,__useSchema);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public PresenterDMO() {
        super("Presenter");
    }

    protected PresenterDMO(String oc) {
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
    public PresenterDMO getNew(){
        PresenterDMO rc = new PresenterDMO();
        return(rc);
    }

    @Override
    public PresenterDMO getSlice(DmcSliceInfo info){
        PresenterDMO rc = new PresenterDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PresenterDMO(DmcTypeModifierMV mods) {
        super("Presenter");
        modrec(true);
        setModifier(mods);
    }

    public PresenterDMO getModificationRecorder(){
        PresenterDMO rc = new PresenterDMO();
        rc.setPresenterName(getPresenterName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__presenterName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__presenterName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof PresenterDMO){
            return( getObjectName().equals( ((PresenterDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getPresenterName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__presenterName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets presenterName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setPresenterName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__presenterName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__presenterName);
        
        try{
            attr.set(value);
            set(__presenterName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets presenterName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setPresenterName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__presenterName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__presenterName);
        
        attr.set(value);
        set(__presenterName,attr);
    }

    /**
     * Removes the presenterName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remPresenterName(){
         rem(__presenterName);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<ViewREF> getManagesView(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(__managesView);
        if (attr == null)
            return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ViewREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<ViewREF> getManagesViewREFs(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(__managesView);
        if (attr == null)
            return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another managesView to the specified value.
     * @param value View
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addManagesView(ViewDMO value) {
        DmcAttribute<?> attr = get(__managesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(__managesView);
        
        try{
            setLastValue(attr.add(value));
            add(__managesView,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another managesView value.
     * @param value A value compatible with View
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addManagesView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__managesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(__managesView);
        
        setLastValue(attr.add(value));
        add(__managesView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in managesView
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getManagesViewSize(){
        DmcAttribute<?> attr = get(__managesView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delManagesView(Object value){
        DmcAttribute<?> attr = del(__managesView, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the managesView attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remManagesView(){
         rem(__managesView);
    }




}