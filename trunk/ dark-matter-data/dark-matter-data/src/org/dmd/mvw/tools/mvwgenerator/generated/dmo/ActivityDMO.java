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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                                          // Always required - (GenUtility.java:197)
import java.util.*;                                                                   // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                      // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                  // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                           // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcSliceInfo;                                                      // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                                 // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                               // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                  // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                            // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                   // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                     // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                     // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                          // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ControllerREF;                  // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeControllerREFMV;         // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePresenterREFMV;          // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeViewREFMV;               // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;                   // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                        // Helper class - (GenUtility.java:308)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * If you are making use of Places, you'll define an Activity for each of
 * them; all activities are derived from com.google.gwt.app.place.Activity.
 * If you have common functionality that you wish to use for your Activity
 * classes, implement it in a class derived from
 * com.google.gwt.app.place.Activity and specify that class in the
 * useBaseClass attribute of your defined Activity. <p /> Activities are
 * meant to be short-lived, disposable entities that run in a particular
 * Place. However, if you are building an application, it may be that you
 * have a single Place and that all behaviour takes place within the guise of
 * a single Activity. <p /> If the Activity manages a view, it will be
 * generated as implementing the View's  presenter interface. <p/> Activities
 * provide a natural division point for GWT code splitting, if you've
 * structured your code appropriately. By specifying the codeSplit flag as
 * true, the code for the Activity will be  asynchronously loaded using the
 * GWT code splitting mechanisms.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ActivityDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Activity";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ActivityDMO() {
        super("Activity");
    }

    protected ActivityDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ActivityDMO getNew(){
        ActivityDMO rc = new ActivityDMO();
        return(rc);
    }

    @Override
    public ActivityDMO getSlice(DmcSliceInfo info){
        ActivityDMO rc = new ActivityDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ActivityDMO(DmcTypeModifierMV mods) {
        super("Activity");
        modrec(true);
        setModifier(mods);
    }

    public ActivityDMO getModificationRecorder(){
        ActivityDMO rc = new ActivityDMO();
        rc.setActivityName(getActivityName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__activityName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__activityName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ActivityDMO){
            return( getObjectName().equals( ((ActivityDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public String getUseBaseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setUseBaseClass(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useBaseClass);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useBaseClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setUseBaseClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useBaseClass);
        
        attr.set(value);
        set(MvwDMSAG.__useBaseClass,attr);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remUseBaseClass(){
         rem(MvwDMSAG.__useBaseClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public Boolean isAbstractActivity(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__abstractActivity);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setAbstractActivity(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__abstractActivity);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__abstractActivity);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__abstractActivity,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setAbstractActivity(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__abstractActivity);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__abstractActivity);
        
        attr.set(value);
        set(MvwDMSAG.__abstractActivity,attr);
    }

    /**
     * Removes the abstractActivity attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remAbstractActivity(){
         rem(MvwDMSAG.__abstractActivity);
    }

    /**
     * @return An Iterator of ControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<ControllerREF> getUsesController(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(MvwDMSAG.__usesController);
        if (attr == null)
            return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ControllerREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<ControllerREF> getUsesControllerREFs(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(MvwDMSAG.__usesController);
        if (attr == null)
            return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesController to the specified value.
     * @param value Controller
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addUsesController(ControllerDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(MvwDMSAG.__usesController);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__usesController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another usesController value.
     * @param value A value compatible with Controller
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addUsesController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(MvwDMSAG.__usesController);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__usesController,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesController
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getUsesControllerSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null){
            if (MvwDMSAG.__usesController.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__usesController.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delUsesController(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeControllerREFMV(MvwDMSAG.__usesController), value);
        else
            attr = del(MvwDMSAG.__usesController, value);
        
        return(attr);
    }

    /**
     * Removes the usesController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remUsesController(){
         rem(MvwDMSAG.__usesController);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remManagesView(){
         rem(MvwDMSAG.__managesView);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remInstantiatesPresenter(){
         rem(MvwDMSAG.__instantiatesPresenter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remCodeSplit(){
         rem(MvwDMSAG.__codeSplit);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public CamelCaseName getActivityName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__activityName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets activityName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setActivityName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__activityName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__activityName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__activityName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets activityName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setActivityName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__activityName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__activityName);
        
        attr.set(value);
        set(MvwDMSAG.__activityName,attr);
    }

    /**
     * Removes the activityName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remActivityName(){
         rem(MvwDMSAG.__activityName);
    }




}
