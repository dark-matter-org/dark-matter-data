package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import java.util.ArrayList;                                                       // To support getMVCopy()
import java.util.Iterator;                                                        // To support getMVCopy()
import org.dmd.dmc.*;                                                             // If any attributes
import org.dmd.dmc.types.StringName;                                              // Primitive type
import org.dmd.dms.*;                                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcAction;                                // Is reference type aux
import org.dmd.features.extgwt.extended.MvcController;                            // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                            // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                                 // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMenu;                                  // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMenuItem;                              // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMenuSeparator;                         // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMultiView;                             // Is reference type aux
import org.dmd.features.extgwt.extended.MvcRegistryItem;                          // Is reference type aux
import org.dmd.features.extgwt.extended.MvcServerEvent;                           // Is reference type aux
import org.dmd.features.extgwt.extended.MvcView;                                  // Is reference type aux
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;                        // For multi-valued containsMvcAction
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                    // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                         // For multi-valued containsMvcEvent
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                          // For multi-valued containsMvcMenu
import org.dmd.features.extgwt.generated.dmo.MvcMenuItemDMO;                      // For multi-valued containsMvcMenuItem
import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;                 // For multi-valued containsMvcMenuSeparator
import org.dmd.features.extgwt.generated.dmo.MvcMultiViewDMO;                     // For multi-valued containsMvcMultiView
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;                  // For multi-valued containsMvcRegistryItem
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;                   // For multi-valued containsMvcServerEvent
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;                          // For multi-valued containsMvcView
import org.dmd.features.extgwt.generated.dmw.MvcActionIterableDMW;                // For multi-valued MvcAction
import org.dmd.features.extgwt.generated.dmw.MvcEventIterableDMW;                 // For multi-valued MvcEvent
import org.dmd.features.extgwt.generated.dmw.MvcMenuItemIterableDMW;              // For multi-valued MvcMenuItem
import org.dmd.features.extgwt.generated.dmw.MvcMenuIterableDMW;                  // For multi-valued MvcMenu
import org.dmd.features.extgwt.generated.dmw.MvcMenuSeparatorIterableDMW;         // For multi-valued MvcMenuSeparator
import org.dmd.features.extgwt.generated.dmw.MvcMultiViewIterableDMW;             // For multi-valued MvcMultiView
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemIterableDMW;          // For multi-valued MvcRegistryItem
import org.dmd.features.extgwt.generated.dmw.MvcServerEventIterableDMW;           // For multi-valued MvcServerEvent
import org.dmd.features.extgwt.generated.dmw.MvcViewIterableDMW;                  // For multi-valued MvcView
import org.dmd.features.extgwt.generated.types.MvcActionREF;                      // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                  // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcEventREF;                       // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMenuItemREF;                    // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                        // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMenuSeparatorREF;               // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMultiViewREF;                   // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;                // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;                 // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcViewREF;                        // To support getMVCopy() for REFs

/**
 * The MvcController class allows for the definition of controllers. The
 * abstract controller generated by this definition will automatically
 * register for the events you specify via the handlesEvent attribute.
 * Likewise, it will have a standard handleEvent() method that forwards typed
 * events to abstract handler functions that you'll have to write.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcControllerDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcControllerDMO mycore;

    public MvcControllerDMW() {
        super(new MvcControllerDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    public MvcControllerDMW(DmcTypeModifierMV mods) {
        super(new MvcControllerDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    public MvcController getModificationRecorder(){
        MvcController rc = new MvcController();
        rc.setDmcObject(new MvcControllerDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcControllerDMW(MvcControllerDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcControllerDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcControllerDMO getDMO() {
        return(mycore);
    }

    protected MvcControllerDMW(MvcControllerDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcControllerDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcControllerDMW){
            return( getObjectName().equals( ((MvcControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getAlias(){
        return(mycore.getAlias());
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setAlias(Object value) throws DmcValueException {
        mycore.setAlias(value);
    }

    /**
     * Sets alias to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setAlias(String value){
        mycore.setAlias(value);
    }

    /**
     * Removes the alias attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remAlias(){
        mycore.remAlias();
    }

    /**
     * @return The number of MvcViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getControlsViewSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getControlsViewIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getControlsViewHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcViewIterableDMW getControlsViewIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(MvcViewIterableDMW.emptyList);
        
        return(new MvcViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addControlsView(MvcView value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addControlsView(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delControlsView(MvcView value) throws DmcValueException {
        mycore.delControlsView(value);
    }

    /**
     * @return A COPY of the collection of MvcView objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcView> getControlsViewCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(new ArrayList<MvcView>());
        
        ArrayList<MvcView> rc = new ArrayList<MvcView>(attr.getMVSize());
        
        MvcViewIterableDMW it = getControlsViewIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the controlsView attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remControlsView(){
        mycore.remControlsView();
    }

    /**
     * @return The number of MvcMultiViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getControlsMultiViewSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMultiViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getControlsMultiViewIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMultiViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getControlsMultiViewHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcMultiViewIterableDMW getControlsMultiViewIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(MvcMultiViewIterableDMW.emptyList);
        
        return(new MvcMultiViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addControlsMultiView(MvcMultiView value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addControlsMultiView(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delControlsMultiView(MvcMultiView value) throws DmcValueException {
        mycore.delControlsMultiView(value);
    }

    /**
     * @return A COPY of the collection of MvcMultiView objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcMultiView> getControlsMultiViewCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(new ArrayList<MvcMultiView>());
        
        ArrayList<MvcMultiView> rc = new ArrayList<MvcMultiView>(attr.getMVSize());
        
        MvcMultiViewIterableDMW it = getControlsMultiViewIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the controlsMultiView attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remControlsMultiView(){
        mycore.remControlsMultiView();
    }

    /**
     * @return The number of MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcEventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addHandlesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        mycore.delHandlesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcEvent> getHandlesEventCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(new ArrayList<MvcEvent>());
        
        ArrayList<MvcEvent> rc = new ArrayList<MvcEvent>(attr.getMVSize());
        
        MvcEventIterableDMW it = getHandlesEventIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
    }

    /**
     * @return The number of MvcServerEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcServerEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getHandlesServerEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcServerEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getHandlesServerEventHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcServerEventIterableDMW getHandlesServerEventIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(MvcServerEventIterableDMW.emptyList);
        
        return(new MvcServerEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addHandlesServerEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        mycore.delHandlesServerEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcServerEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcServerEvent> getHandlesServerEventCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(new ArrayList<MvcServerEvent>());
        
        ArrayList<MvcServerEvent> rc = new ArrayList<MvcServerEvent>(attr.getMVSize());
        
        MvcServerEventIterableDMW it = getHandlesServerEventIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remHandlesServerEvent(){
        mycore.remHandlesServerEvent();
    }

    /**
     * @return The number of MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getDispatchesEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getDispatchesEventHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcEventIterableDMW getDispatchesEventIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addDispatchesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDispatchesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delDispatchesEvent(MvcEvent value) throws DmcValueException {
        mycore.delDispatchesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcEvent> getDispatchesEventCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(new ArrayList<MvcEvent>());
        
        ArrayList<MvcEvent> rc = new ArrayList<MvcEvent>(attr.getMVSize());
        
        MvcEventIterableDMW it = getDispatchesEventIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remDispatchesEvent(){
        mycore.remDispatchesEvent();
    }

    /**
     * @return The number of MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getUsesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getUsesRegistryItemHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcRegistryItemIterableDMW getUsesRegistryItemIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addUsesRegistryItem(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        mycore.delUsesRegistryItem(value);
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcRegistryItem> getUsesRegistryItemCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(new ArrayList<MvcRegistryItem>());
        
        ArrayList<MvcRegistryItem> rc = new ArrayList<MvcRegistryItem>(attr.getMVSize());
        
        MvcRegistryItemIterableDMW it = getUsesRegistryItemIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remUsesRegistryItem(){
        mycore.remUsesRegistryItem();
    }

    /**
     * @return The number of MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getCreatesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getCreatesRegistryItemHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcRegistryItemIterableDMW getCreatesRegistryItemIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addCreatesRegistryItem(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        mycore.delCreatesRegistryItem(value);
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcRegistryItem> getCreatesRegistryItemCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(new ArrayList<MvcRegistryItem>());
        
        ArrayList<MvcRegistryItem> rc = new ArrayList<MvcRegistryItem>(attr.getMVSize());
        
        MvcRegistryItemIterableDMW it = getCreatesRegistryItemIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remCreatesRegistryItem(){
        mycore.remCreatesRegistryItem();
    }

    /**
     * @return A MvcController object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:968)
    public MvcController getParentController(){
        MvcControllerREF ref = mycore.getParentController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the parentController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1013)
    public void setParentController(MvcController value) {
        mycore.setParentController(value.getDMO());
    }

    /**
     * Removes the parentController attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remParentController(){
        mycore.remParentController();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getSubpackage(){
        return(mycore.getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setSubpackage(Object value) throws DmcValueException {
        mycore.setSubpackage(value);
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setSubpackage(String value){
        mycore.setSubpackage(value);
    }

    /**
     * Removes the subpackage attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remSubpackage(){
        mycore.remSubpackage();
    }

    /**
     * @return The number of MvcActionDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getDefinesActionSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcActionDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getDefinesActionIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcActionDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getDefinesActionHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcActionIterableDMW getDefinesActionIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(MvcActionIterableDMW.emptyList);
        
        return(new MvcActionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addDefinesAction(MvcAction value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDefinesAction(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delDefinesAction(MvcAction value) throws DmcValueException {
        mycore.delDefinesAction(value);
    }

    /**
     * @return A COPY of the collection of MvcAction objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcAction> getDefinesActionCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(new ArrayList<MvcAction>());
        
        ArrayList<MvcAction> rc = new ArrayList<MvcAction>(attr.getMVSize());
        
        MvcActionIterableDMW it = getDefinesActionIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the definesAction attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remDefinesAction(){
        mycore.remDefinesAction();
    }

    /**
     * @return The number of MvcMenuDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getDefinesMenuSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getDefinesMenuIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getDefinesMenuHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcMenuIterableDMW getDefinesMenuIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(MvcMenuIterableDMW.emptyList);
        
        return(new MvcMenuIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addDefinesMenu(MvcMenu value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDefinesMenu(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delDefinesMenu(MvcMenu value) throws DmcValueException {
        mycore.delDefinesMenu(value);
    }

    /**
     * @return A COPY of the collection of MvcMenu objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcMenu> getDefinesMenuCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(new ArrayList<MvcMenu>());
        
        ArrayList<MvcMenu> rc = new ArrayList<MvcMenu>(attr.getMVSize());
        
        MvcMenuIterableDMW it = getDefinesMenuIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the definesMenu attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remDefinesMenu(){
        mycore.remDefinesMenu();
    }

    /**
     * @return The number of MvcMenuItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getDefinesMenuItemSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getDefinesMenuItemIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getDefinesMenuItemHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcMenuItemIterableDMW getDefinesMenuItemIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(MvcMenuItemIterableDMW.emptyList);
        
        return(new MvcMenuItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addDefinesMenuItem(MvcMenuItem value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDefinesMenuItem(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delDefinesMenuItem(MvcMenuItem value) throws DmcValueException {
        mycore.delDefinesMenuItem(value);
    }

    /**
     * @return A COPY of the collection of MvcMenuItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcMenuItem> getDefinesMenuItemCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(new ArrayList<MvcMenuItem>());
        
        ArrayList<MvcMenuItem> rc = new ArrayList<MvcMenuItem>(attr.getMVSize());
        
        MvcMenuItemIterableDMW it = getDefinesMenuItemIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the definesMenuItem attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remDefinesMenuItem(){
        mycore.remDefinesMenuItem();
    }

    /**
     * @return The number of MvcMenuSeparatorDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getDefinesMenuSeparatorSize(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuSeparatorDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getDefinesMenuSeparatorIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuSeparatorDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getDefinesMenuSeparatorHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuSeparatorDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1153)
    public MvcMenuSeparatorIterableDMW getDefinesMenuSeparatorIterable(){
        DmcAttribute attr = mycore.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(MvcMenuSeparatorIterableDMW.emptyList);
        
        return(new MvcMenuSeparatorIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenuSeparator value.
     * @param value A value compatible with MvcMenuSeparator
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1169)
    public DmcAttribute<?> addDefinesMenuSeparator(MvcMenuSeparator value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDefinesMenuSeparator(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a definesMenuSeparator value.
     * @param value The MvcMenuSeparator to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1182)
    public void delDefinesMenuSeparator(MvcMenuSeparator value) throws DmcValueException {
        mycore.delDefinesMenuSeparator(value);
    }

    /**
     * @return A COPY of the collection of MvcMenuSeparator objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1217)
    public ArrayList<MvcMenuSeparator> getDefinesMenuSeparatorCopy(){
        DmcAttribute<?> attr = mycore.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(new ArrayList<MvcMenuSeparator>());
        
        ArrayList<MvcMenuSeparator> rc = new ArrayList<MvcMenuSeparator>(attr.getMVSize());
        
        MvcMenuSeparatorIterableDMW it = getDefinesMenuSeparatorIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the definesMenuSeparator attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remDefinesMenuSeparator(){
        mycore.remDefinesMenuSeparator();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remName(){
        mycore.remName();
    }


}
