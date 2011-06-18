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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:286)
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                 // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                              // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                     // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                    // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                 // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                    // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePresenterREFMV;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Controller represents a behavioural component that lives throughout
 * the entire lifecycle of an WebApplication or WebSite. Generally, it
 * manages the Presenters and Views that are displayed, but may also provide
 * behind the scenes management of things like communications, security, menu
 * structure etc. Controllers do not implement Presenter interfaces i.e. they
 * do not interact directly with Views; that is the role of Presenters. <p />
 * Because of their implied lifetime, Controllers are made part of the
 * overall RunContext for an application and are constructed during
 * initialization of the application. There is no need to instantiate
 * Controllers separately. The RunContextItem created for a controller has
 * the same name as the Controller itself. <p /> Controllers should not
 * communicate with other Controllers directly; this type of communication
 * should be performed using events. So, although it is possible to get the
 * handle to another Controller via the RunContext, it is discouraged.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class ControllerDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Controller";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __addedToRunContext = new DmcAttributeInfo("addedToRunContext",859,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __centralDMPErrorHandler = new DmcAttributeInfo("centralDMPErrorHandler",851,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __centralRPCErrorHandler = new DmcAttributeInfo("centralRPCErrorHandler",852,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName",811,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __controllerName = new DmcAttributeInfo("controllerName",834,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",801,"Event",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",802,"Event",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __instantiatesView = new DmcAttributeInfo("instantiatesView",862,"View",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsActionRequest = new DmcAttributeInfo("sendsActionRequest",848,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsCreateRequest = new DmcAttributeInfo("sendsCreateRequest",847,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsDeleteRequest = new DmcAttributeInfo("sendsDeleteRequest",845,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsGetRequest = new DmcAttributeInfo("sendsGetRequest",844,"GetWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsLoginRequest = new DmcAttributeInfo("sendsLoginRequest",849,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsLogoutRequest = new DmcAttributeInfo("sendsLogoutRequest",850,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sendsSetRequest = new DmcAttributeInfo("sendsSetRequest",846,"RequestWithOptions",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("subpackage",88,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass",807,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useSchema = new DmcAttributeInfo("useSchema",843,"SchemaDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __usesPresenter = new DmcAttributeInfo("usesPresenter",860,"Presenter",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __usesRunContextItem = new DmcAttributeInfo("usesRunContextItem",835,"RunContextItem",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__addedToRunContext.id,__addedToRunContext);
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__centralDMPErrorHandler.id,__centralDMPErrorHandler);
        _ImAp.put(__centralRPCErrorHandler.id,__centralRPCErrorHandler);
        _ImAp.put(__componentName.id,__componentName);
        _ImAp.put(__controllerName.id,__controllerName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__instantiatesView.id,__instantiatesView);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__sendsActionRequest.id,__sendsActionRequest);
        _ImAp.put(__sendsCreateRequest.id,__sendsCreateRequest);
        _ImAp.put(__sendsDeleteRequest.id,__sendsDeleteRequest);
        _ImAp.put(__sendsGetRequest.id,__sendsGetRequest);
        _ImAp.put(__sendsLoginRequest.id,__sendsLoginRequest);
        _ImAp.put(__sendsLogoutRequest.id,__sendsLogoutRequest);
        _ImAp.put(__sendsSetRequest.id,__sendsSetRequest);
        _ImAp.put(__subpackage.id,__subpackage);
        _ImAp.put(__useBaseClass.id,__useBaseClass);
        _ImAp.put(__useSchema.id,__useSchema);
        _ImAp.put(__usesPresenter.id,__usesPresenter);
        _ImAp.put(__usesRunContextItem.id,__usesRunContextItem);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__addedToRunContext.name,__addedToRunContext);
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__centralDMPErrorHandler.name,__centralDMPErrorHandler);
        _SmAp.put(__centralRPCErrorHandler.name,__centralRPCErrorHandler);
        _SmAp.put(__componentName.name,__componentName);
        _SmAp.put(__controllerName.name,__controllerName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__instantiatesView.name,__instantiatesView);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__sendsActionRequest.name,__sendsActionRequest);
        _SmAp.put(__sendsCreateRequest.name,__sendsCreateRequest);
        _SmAp.put(__sendsDeleteRequest.name,__sendsDeleteRequest);
        _SmAp.put(__sendsGetRequest.name,__sendsGetRequest);
        _SmAp.put(__sendsLoginRequest.name,__sendsLoginRequest);
        _SmAp.put(__sendsLogoutRequest.name,__sendsLogoutRequest);
        _SmAp.put(__sendsSetRequest.name,__sendsSetRequest);
        _SmAp.put(__subpackage.name,__subpackage);
        _SmAp.put(__useBaseClass.name,__useBaseClass);
        _SmAp.put(__useSchema.name,__useSchema);
        _SmAp.put(__usesPresenter.name,__usesPresenter);
        _SmAp.put(__usesRunContextItem.name,__usesRunContextItem);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ControllerDMO() {
        super("Controller");
    }

    protected ControllerDMO(String oc) {
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
    public ControllerDMO getNew(){
        ControllerDMO rc = new ControllerDMO();
        return(rc);
    }

    @Override
    public ControllerDMO getSlice(DmcSliceInfo info){
        ControllerDMO rc = new ControllerDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ControllerDMO(DmcTypeModifierMV mods) {
        super("Controller");
        modrec(true);
        setModifier(mods);
    }

    public ControllerDMO getModificationRecorder(){
        ControllerDMO rc = new ControllerDMO();
        rc.setControllerName(getControllerName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:738)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__controllerName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__controllerName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ControllerDMO){
            return( getObjectName().equals( ((ControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:589)
    public Boolean isCentralDMPErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__centralDMPErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setCentralDMPErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__centralDMPErrorHandler);
        
        try{
            attr.set(value);
            set(__centralDMPErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void setCentralDMPErrorHandler(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__centralDMPErrorHandler);
        
        attr.set(value);
        set(__centralDMPErrorHandler,attr);
    }

    /**
     * Removes the centralDMPErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:689)
    public void remCentralDMPErrorHandler(){
         rem(__centralDMPErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:589)
    public Boolean isCentralRPCErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__centralRPCErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setCentralRPCErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__centralRPCErrorHandler);
        
        try{
            attr.set(value);
            set(__centralRPCErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void setCentralRPCErrorHandler(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__centralRPCErrorHandler);
        
        attr.set(value);
        set(__centralRPCErrorHandler,attr);
    }

    /**
     * Removes the centralRPCErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:689)
    public void remCentralRPCErrorHandler(){
         rem(__centralRPCErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:589)
    public Boolean isAddedToRunContext(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__addedToRunContext);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setAddedToRunContext(Boolean value) {
        DmcAttribute<?> attr = get(__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__addedToRunContext);
        
        try{
            attr.set(value);
            set(__addedToRunContext,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void setAddedToRunContext(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__addedToRunContext);
        
        attr.set(value);
        set(__addedToRunContext,attr);
    }

    /**
     * Removes the addedToRunContext attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:689)
    public void remAddedToRunContext(){
         rem(__addedToRunContext);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:751)
    public Iterator<PresenterREF> getUsesPresenter(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(__usesPresenter);
        if (attr == null)
            return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of PresenterREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:771)
    public Iterator<PresenterREF> getUsesPresenterREFs(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(__usesPresenter);
        if (attr == null)
            return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesPresenter to the specified value.
     * @param value Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:786)
    public DmcAttribute<?> addUsesPresenter(PresenterDMO value) {
        DmcAttribute<?> attr = get(__usesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(__usesPresenter);
        
        try{
            setLastValue(attr.add(value));
            add(__usesPresenter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another usesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:907)
    public DmcAttribute<?> addUsesPresenter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__usesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(__usesPresenter);
        
        setLastValue(attr.add(value));
        add(__usesPresenter,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesPresenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:924)
    public int getUsesPresenterSize(){
        DmcAttribute<?> attr = get(__usesPresenter);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:954)
    public DmcAttribute<?> delUsesPresenter(Object value){
        DmcAttribute<?> attr = del(__usesPresenter, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesPresenter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1001)
    public void remUsesPresenter(){
         rem(__usesPresenter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:589)
    public CamelCaseName getControllerName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__controllerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets controllerName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setControllerName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__controllerName);
        
        try{
            attr.set(value);
            set(__controllerName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets controllerName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void setControllerName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__controllerName);
        
        attr.set(value);
        set(__controllerName,attr);
    }

    /**
     * Removes the controllerName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:689)
    public void remControllerName(){
         rem(__controllerName);
    }




}
