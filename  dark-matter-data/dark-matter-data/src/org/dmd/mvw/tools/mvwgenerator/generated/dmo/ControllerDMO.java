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
import java.io.Serializable;                                              // Always required
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                   // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                          // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Controller represents a behavioural component that lives throughout
 * the entire lifecycle of an WebApplication or WebSite. Generally, it
 * manages the Presenters and Views that are displayed, but may also provide
 * behind the scenes management of things like communications, security, menu
 * structure etc. Controllers do not implement Presenter interfaces i.e. they
 * do not interact directly with Views; that is the role of Presenters.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ControllerDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Controller";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

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
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
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
        _ImAp.put(__controllerName.id,__controllerName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
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
        _SmAp.put(__controllerName.name,__controllerName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
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

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
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

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remControllerName(){
         rem(__controllerName);
    }




}