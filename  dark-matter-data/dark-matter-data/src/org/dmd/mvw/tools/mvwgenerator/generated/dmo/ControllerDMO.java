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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                              // Naming attribute type
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                 // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                                 // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionDMO;                       // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                    // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActionREF;                     // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActionREFMV;            // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePresenterREFMV;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
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
 * the same name as the Controller itself with RCI appended. You may specify
 * an itemOrder for the Controller to control when it is instantiated in the
 * RunContext; use this option only if you know what you're doing! The
 * default itemOrder is 50, most base related functionality starts in
 * itemOrder 20 or lower. <p /> Controllers should not communicate with other
 * Controllers directly; this type of communication should be performed using
 * events. So, although it is possible to get the handle to another
 * Controller via the RunContext, it is discouraged. <p />
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ControllerDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Controller";

    public final static DmcClassInfo classInfo = MvwDMSAG.__Controller;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__controllerName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__controllerName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ControllerDMO){
            return( getObjectName().equals( ((ControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Boolean isCentralDMPErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setCentralDMPErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralDMPErrorHandler);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__centralDMPErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setCentralDMPErrorHandler(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralDMPErrorHandler);
        
        attr.set(value);
        set(MvwDMSAG.__centralDMPErrorHandler,attr);
    }

    /**
     * Removes the centralDMPErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remCentralDMPErrorHandler(){
         rem(MvwDMSAG.__centralDMPErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Boolean isCentralRPCErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setCentralRPCErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralRPCErrorHandler);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__centralRPCErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setCentralRPCErrorHandler(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralRPCErrorHandler);
        
        attr.set(value);
        set(MvwDMSAG.__centralRPCErrorHandler,attr);
    }

    /**
     * Removes the centralRPCErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remCentralRPCErrorHandler(){
         rem(MvwDMSAG.__centralRPCErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Boolean isAddedToRunContext(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setAddedToRunContext(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__addedToRunContext);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__addedToRunContext,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setAddedToRunContext(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__addedToRunContext);
        
        attr.set(value);
        set(MvwDMSAG.__addedToRunContext,attr);
    }

    /**
     * Removes the addedToRunContext attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remAddedToRunContext(){
         rem(MvwDMSAG.__addedToRunContext);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<PresenterREF> getInstantiatesPresenter(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(MvwDMSAG.__instantiatesPresenter);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<PresenterREF> getInstantiatesPresenterREFs(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another instantiatesPresenter to the specified value.
     * @param value Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addInstantiatesPresenter(PresenterDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__instantiatesPresenter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another instantiatesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addInstantiatesPresenter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__instantiatesPresenter,attr);
        return(attr);
    }

    /**
     * Returns the number of values in instantiatesPresenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getInstantiatesPresenterSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delInstantiatesPresenter(Object value){
        DmcAttribute<?> attr = del(MvwDMSAG.__instantiatesPresenter, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the instantiatesPresenter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remInstantiatesPresenter(){
         rem(MvwDMSAG.__instantiatesPresenter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Integer getItemOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MvwDMSAG.__itemOrder);
        if (attr == null)
            return(50);

        return(attr.getSV());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setItemOrder(Integer value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__itemOrder);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__itemOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setItemOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__itemOrder);
        
        attr.set(value);
        set(MvwDMSAG.__itemOrder,attr);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remItemOrder(){
         rem(MvwDMSAG.__itemOrder);
    }

    /**
     * @return An Iterator of ActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Iterator<ActionREF> getImplementsAction(){
        DmcTypeActionREFMV attr = (DmcTypeActionREFMV) get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return( ((List<ActionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ActionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ActionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:830)
    public Iterator<ActionREF> getImplementsActionREFs(){
        DmcTypeActionREFMV attr = (DmcTypeActionREFMV) get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return( ((List<ActionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another implementsAction to the specified value.
     * @param value Action
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:844)
    public DmcAttribute<?> addImplementsAction(ActionDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null)
            attr = new DmcTypeActionREFMV(MvwDMSAG.__implementsAction);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__implementsAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another implementsAction value.
     * @param value A value compatible with Action
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1067)
    public DmcAttribute<?> addImplementsAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null)
            attr = new DmcTypeActionREFMV(MvwDMSAG.__implementsAction);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__implementsAction,attr);
        return(attr);
    }

    /**
     * Returns the number of values in implementsAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1084)
    public int getImplementsActionSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a implementsAction value.
     * @param value The Action to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public DmcAttribute<?> delImplementsAction(Object value){
        DmcAttribute<?> attr = del(MvwDMSAG.__implementsAction, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the implementsAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1161)
    public void remImplementsAction(){
         rem(MvwDMSAG.__implementsAction);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public CamelCaseName getControllerName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__controllerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets controllerName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setControllerName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__controllerName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__controllerName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets controllerName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setControllerName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__controllerName);
        
        attr.set(value);
        set(MvwDMSAG.__controllerName,attr);
    }

    /**
     * Removes the controllerName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remControllerName(){
         rem(MvwDMSAG.__controllerName);
    }




}