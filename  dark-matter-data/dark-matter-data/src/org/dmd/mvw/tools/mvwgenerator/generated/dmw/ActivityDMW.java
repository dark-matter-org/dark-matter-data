package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import java.util.ArrayList;                                                            // To support getMVCopy()
import java.util.Iterator;                                                             // To support getMVCopy()
import java.util.TreeSet;                                                              // To support getMVCopy()
import org.dmd.dmc.*;                                                                  // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                                // Primitive type
import org.dmd.dms.*;                                                                  // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                  // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;                               // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                              // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;                         // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.View;                                   // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO;                       // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;                 // For multi-valued containsRunContextItem
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                           // For multi-valued containsView
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.RunContextItemIterableDMW;         // For multi-valued RunContextItem
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewIterableDMW;                   // For multi-valued View
import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;               // To support getMVCopy() for REFs
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                         // To support getMVCopy() for REFs

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
 * generated as implementing the View's  presenter interface. <p /> Many of
 * the classes generated by MVW must be extended in order to provide the
 * actual behaviour of your application e.g. Controllers, Views, Presenters
 * etc. Activities must also be extended to provide your behaviour, however,
 * Activities are also referred to by generated code and must be in a known
 * location. By default, the classes that extend the generated activity class
 * will reside in the 'extended' package that lies beneath the genPackage
 * specified for your module i.e. if your gen package is com.mine, then the 
 * derived activity classes are expected to be in com.mine.extended. If you
 * want to place these classes in a subpackage beneath extended, use the
 * subpackage attribute to indicate the package name e.g. if subpackage is
 * defined as 'activities', your activity implementation class will be
 * expected to reside in com.mine.extended.activities.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class ActivityDMW extends Component implements DmcNamedObjectIF {

    public ActivityDMW() {
        super(new ActivityDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    public ActivityDMW(DmcTypeModifierMV mods) {
        super(new ActivityDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    public Activity getModificationRecorder(){
        Activity rc = new Activity();
        rc.setActivityName(getActivityName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ActivityDMW(ActivityDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    public ActivityDMO getDMO() {
        return((ActivityDMO) core);
    }

    protected ActivityDMW(ActivityDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public CamelCaseName getObjectName(){
        return(((ActivityDMO) core).getActivityName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ActivityDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ActivityDMW){
            return( getObjectName().equals( ((ActivityDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getUseBaseClass(){
        return(((ActivityDMO) core).getUseBaseClass());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setUseBaseClass(Object value) throws DmcValueException {
        ((ActivityDMO) core).setUseBaseClass(value);
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setUseBaseClass(String value){
        ((ActivityDMO) core).setUseBaseClass(value);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remUseBaseClass(){
        ((ActivityDMO) core).remUseBaseClass();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public Boolean isAbstractActivity(){
        return(((ActivityDMO) core).isAbstractActivity());
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setAbstractActivity(Object value) throws DmcValueException {
        ((ActivityDMO) core).setAbstractActivity(value);
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setAbstractActivity(Boolean value){
        ((ActivityDMO) core).setAbstractActivity(value);
    }

    /**
     * Removes the abstractActivity attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remAbstractActivity(){
        ((ActivityDMO) core).remAbstractActivity();
    }

    /**
     * @return The number of RunContextItem items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getUseRunContextItemSize(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__useRunContextItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no RunContextItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getUseRunContextItemIsEmpty(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__useRunContextItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any RunContextItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getUseRunContextItemHasValue(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__useRunContextItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of RunContextItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public RunContextItemIterableDMW getUseRunContextItemIterable(){
        DmcAttribute attr = ((ActivityDMO) core).get(ActivityDMO.__useRunContextItem);
        if (attr == null)
            return(RunContextItemIterableDMW.emptyList);
        
        return(new RunContextItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another useRunContextItem value.
     * @param value A value compatible with RunContextItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addUseRunContextItem(RunContextItem value){
        DmcAttribute<?> attr = ((ActivityDMO) core).addUseRunContextItem(((RunContextItemDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a useRunContextItem value.
     * @param value The RunContextItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delUseRunContextItem(RunContextItem value){
        ((ActivityDMO) core).delUseRunContextItem(value.getDMO());
    }

    /**
     * @return A COPY of the collection of RunContextItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public TreeSet<RunContextItem> getUseRunContextItemCopy(){
        DmcAttribute<?> attr = ((ActivityDMO) core).get(ActivityDMO.__useRunContextItem);
        if (attr == null)
            return(new TreeSet<RunContextItem>());
        
        TreeSet<RunContextItem> rc = new TreeSet<RunContextItem>();
        
        RunContextItemIterableDMW it = getUseRunContextItemIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the useRunContextItem attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remUseRunContextItem(){
        ((ActivityDMO) core).remUseRunContextItem();
    }

    /**
     * @return The number of View items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getManagesViewSize(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__managesView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getManagesViewIsEmpty(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__managesView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getManagesViewHasValue(){
        DmcAttribute<?> attr = core.get(ActivityDMO.__managesView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public ViewIterableDMW getManagesViewIterable(){
        DmcAttribute attr = ((ActivityDMO) core).get(ActivityDMO.__managesView);
        if (attr == null)
            return(ViewIterableDMW.emptyList);
        
        return(new ViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another managesView value.
     * @param value A value compatible with View
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addManagesView(View value){
        DmcAttribute<?> attr = ((ActivityDMO) core).addManagesView(((ViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delManagesView(View value){
        ((ActivityDMO) core).delManagesView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of View objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public ArrayList<View> getManagesViewCopy(){
        DmcAttribute<?> attr = ((ActivityDMO) core).get(ActivityDMO.__managesView);
        if (attr == null)
            return(new ArrayList<View>());
        
        ArrayList<View> rc = new ArrayList<View>(attr.getMVSize());
        
        ViewIterableDMW it = getManagesViewIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the managesView attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remManagesView(){
        ((ActivityDMO) core).remManagesView();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getSubpackage(){
        return(((ActivityDMO) core).getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setSubpackage(Object value) throws DmcValueException {
        ((ActivityDMO) core).setSubpackage(value);
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setSubpackage(String value){
        ((ActivityDMO) core).setSubpackage(value);
    }

    /**
     * Removes the subpackage attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remSubpackage(){
        ((ActivityDMO) core).remSubpackage();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public CamelCaseName getActivityName(){
        return(((ActivityDMO) core).getActivityName());
    }

    /**
     * Sets activityName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setActivityName(Object value) throws DmcValueException {
        ((ActivityDMO) core).setActivityName(value);
    }

    /**
     * Sets activityName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setActivityName(CamelCaseName value){
        ((ActivityDMO) core).setActivityName(value);
    }

    /**
     * Removes the activityName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remActivityName(){
        ((ActivityDMO) core).remActivityName();
    }


}
