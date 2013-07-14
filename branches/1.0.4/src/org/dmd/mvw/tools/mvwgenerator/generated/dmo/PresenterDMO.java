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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                                         // Always required - (GenUtility.java:201)
import java.util.*;                                                                  // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object - (GenUtility.java:352)
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution - (GenUtility.java:297)
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing - (GenUtility.java:206)
import org.dmd.dmc.DmcValueException;                                                // Any attributes - (GenUtility.java:218)
import org.dmd.dmc.types.CamelCaseName;                                              // Naming attribute type - (GenUtility.java:347)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                          // Required for MODREC constructor - (GenUtility.java:205)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                 // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                           // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor - (GenUtility.java:204)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                    // Base class - (GenUtility.java:332)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                    // Type specific set/add - (GenUtility.java:284)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                         // Type specific set/add - (GenUtility.java:284)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePresenterREFMV;         // Reference type - (GenUtility.java:277)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeViewREFMV;              // Reference type - (GenUtility.java:277)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;                  // Helper class - (GenUtility.java:312)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                       // Helper class - (GenUtility.java:312)

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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PresenterDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Presenter";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__presenterName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__presenterName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof PresenterDMO){
            return( getObjectName().equals( ((PresenterDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public Boolean isCodeSplit(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__codeSplit);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setCodeSplit(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__codeSplit);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__codeSplit);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__codeSplit,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setCodeSplit(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__codeSplit);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__codeSplit);
        
        attr.set(value);
        set(MvwDMSAG.__codeSplit,attr);
    }

    /**
     * Removes the codeSplit attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remCodeSplit(){
         rem(MvwDMSAG.__codeSplit);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public Boolean isSingleton(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__singleton);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets singleton to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setSingleton(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__singleton);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__singleton);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__singleton,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets singleton to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setSingleton(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__singleton);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__singleton);
        
        attr.set(value);
        set(MvwDMSAG.__singleton,attr);
    }

    /**
     * Removes the singleton attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remSingleton(){
         rem(MvwDMSAG.__singleton);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:941)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:975)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getInstantiatesPresenterSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null){
            if (MvwDMSAG.__instantiatesPresenter.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__instantiatesPresenter.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1272)
    public DmcAttribute<?> delInstantiatesPresenter(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter), value);
        else
            attr = del(MvwDMSAG.__instantiatesPresenter, value);
        
        return(attr);
    }

    /**
     * Removes the instantiatesPresenter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remInstantiatesPresenter(){
         rem(MvwDMSAG.__instantiatesPresenter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public CamelCaseName getPresenterName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__presenterName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets presenterName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setPresenterName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__presenterName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__presenterName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets presenterName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setPresenterName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__presenterName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__presenterName);
        
        attr.set(value);
        set(MvwDMSAG.__presenterName,attr);
    }

    /**
     * Removes the presenterName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remPresenterName(){
         rem(MvwDMSAG.__presenterName);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:941)
    public Iterator<ViewREF> getManagesView(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(MvwDMSAG.__managesView);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:961)
    public Iterator<ViewREF> getManagesViewREFs(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(MvwDMSAG.__managesView);
        if (attr == null)
            return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another managesView to the specified value.
     * @param value View
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:975)
    public DmcAttribute<?> addManagesView(ViewDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__managesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(MvwDMSAG.__managesView);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__managesView,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> addManagesView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__managesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(MvwDMSAG.__managesView);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__managesView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in managesView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getManagesViewSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__managesView);
        if (attr == null){
            if (MvwDMSAG.__managesView.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__managesView.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1272)
    public DmcAttribute<?> delManagesView(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__managesView);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeViewREFMV(MvwDMSAG.__managesView), value);
        else
            attr = del(MvwDMSAG.__managesView, value);
        
        return(attr);
    }

    /**
     * Removes the managesView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remManagesView(){
         rem(MvwDMSAG.__managesView);
    }




}