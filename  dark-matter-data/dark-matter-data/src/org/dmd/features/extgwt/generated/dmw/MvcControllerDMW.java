package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
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
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcControllerDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcControllerDMW() {
        super(new MvcControllerDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
    }

    public MvcControllerDMW(DmcTypeModifierMV mods) {
        super(new MvcControllerDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
    }

    public MvcController getModificationRecorder(){
        MvcController rc = new MvcController();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvcControllerDMW(MvcControllerDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
    }

    public MvcControllerDMO getDMO() {
        return((MvcControllerDMO) core);
    }

    protected MvcControllerDMW(MvcControllerDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public StringName getObjectName(){
        return(((MvcControllerDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcControllerDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcControllerDMW){
            return( getObjectName().equals( ((MvcControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getAlias(){
        return(((MvcControllerDMO) core).getAlias());
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setAlias(Object value) throws DmcValueException {
        ((MvcControllerDMO) core).setAlias(value);
    }

    /**
     * Sets alias to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setAlias(String value){
        ((MvcControllerDMO) core).setAlias(value);
    }

    /**
     * Removes the alias attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remAlias(){
        ((MvcControllerDMO) core).remAlias();
    }

    /**
     * @return The number of MvcView items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getControlsViewSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getControlsViewIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getControlsViewHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcViewIterableDMW getControlsViewIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__controlsView);
        if (attr == null)
            return(MvcViewIterableDMW.emptyList);
        
        return(new MvcViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addControlsView(MvcView value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addControlsView(((MvcViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delControlsView(MvcView value){
        ((MvcControllerDMO) core).delControlsView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcView objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcView> getControlsViewCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__controlsView);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remControlsView(){
        ((MvcControllerDMO) core).remControlsView();
    }

    /**
     * @return The number of MvcMultiView items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getControlsMultiViewSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMultiViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getControlsMultiViewIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMultiViewDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getControlsMultiViewHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcMultiViewIterableDMW getControlsMultiViewIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__controlsMultiView);
        if (attr == null)
            return(MvcMultiViewIterableDMW.emptyList);
        
        return(new MvcMultiViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addControlsMultiView(MvcMultiView value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addControlsMultiView(((MvcMultiViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delControlsMultiView(MvcMultiView value){
        ((MvcControllerDMO) core).delControlsMultiView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcMultiView objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcMultiView> getControlsMultiViewCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__controlsMultiView);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remControlsMultiView(){
        ((MvcControllerDMO) core).remControlsMultiView();
    }

    /**
     * @return The number of MvcEvent items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcEventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__handlesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addHandlesEvent(((MvcEventDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delHandlesEvent(MvcEvent value){
        ((MvcControllerDMO) core).delHandlesEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcEvent> getHandlesEventCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__handlesEvent);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remHandlesEvent(){
        ((MvcControllerDMO) core).remHandlesEvent();
    }

    /**
     * @return The number of MvcServerEvent items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcServerEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getHandlesServerEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcServerEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getHandlesServerEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcServerEventIterableDMW getHandlesServerEventIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__handlesServerEvent);
        if (attr == null)
            return(MvcServerEventIterableDMW.emptyList);
        
        return(new MvcServerEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addHandlesServerEvent(MvcServerEvent value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addHandlesServerEvent(((MvcServerEventDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delHandlesServerEvent(MvcServerEvent value){
        ((MvcControllerDMO) core).delHandlesServerEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcServerEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcServerEvent> getHandlesServerEventCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__handlesServerEvent);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remHandlesServerEvent(){
        ((MvcControllerDMO) core).remHandlesServerEvent();
    }

    /**
     * @return The number of MvcEvent items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDispatchesEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDispatchesEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcEventIterableDMW getDispatchesEventIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__dispatchesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDispatchesEvent(MvcEvent value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addDispatchesEvent(((MvcEventDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDispatchesEvent(MvcEvent value){
        ((MvcControllerDMO) core).delDispatchesEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcEvent> getDispatchesEventCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__dispatchesEvent);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remDispatchesEvent(){
        ((MvcControllerDMO) core).remDispatchesEvent();
    }

    /**
     * @return The number of MvcRegistryItem items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getUsesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getUsesRegistryItemHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcRegistryItemIterableDMW getUsesRegistryItemIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__usesRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addUsesRegistryItem(MvcRegistryItem value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addUsesRegistryItem(((MvcRegistryItemDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delUsesRegistryItem(MvcRegistryItem value){
        ((MvcControllerDMO) core).delUsesRegistryItem(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcRegistryItem> getUsesRegistryItemCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__usesRegistryItem);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remUsesRegistryItem(){
        ((MvcControllerDMO) core).remUsesRegistryItem();
    }

    /**
     * @return The number of MvcRegistryItem items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getCreatesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getCreatesRegistryItemHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcRegistryItemIterableDMW getCreatesRegistryItemIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__createsRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addCreatesRegistryItem(MvcRegistryItem value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addCreatesRegistryItem(((MvcRegistryItemDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delCreatesRegistryItem(MvcRegistryItem value){
        ((MvcControllerDMO) core).delCreatesRegistryItem(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcRegistryItem> getCreatesRegistryItemCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__createsRegistryItem);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remCreatesRegistryItem(){
        ((MvcControllerDMO) core).remCreatesRegistryItem();
    }

    /**
     * @return A MvcController object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1030)
    public MvcController getParentController(){
        MvcControllerREF ref = ((MvcControllerDMO) core).getParentController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the parentController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1075)
    public void setParentController(MvcController value) {
        ((MvcControllerDMO) core).setParentController(value.getDMO());
    }

    /**
     * Removes the parentController attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remParentController(){
        ((MvcControllerDMO) core).remParentController();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSubpackage(){
        return(((MvcControllerDMO) core).getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSubpackage(Object value) throws DmcValueException {
        ((MvcControllerDMO) core).setSubpackage(value);
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSubpackage(String value){
        ((MvcControllerDMO) core).setSubpackage(value);
    }

    /**
     * Removes the subpackage attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSubpackage(){
        ((MvcControllerDMO) core).remSubpackage();
    }

    /**
     * @return The number of MvcAction items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDefinesActionSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcActionDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDefinesActionIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcActionDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDefinesActionHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcActionIterableDMW getDefinesActionIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesAction);
        if (attr == null)
            return(MvcActionIterableDMW.emptyList);
        
        return(new MvcActionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDefinesAction(MvcAction value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addDefinesAction(((MvcActionDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDefinesAction(MvcAction value){
        ((MvcControllerDMO) core).delDefinesAction(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcAction objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcAction> getDefinesActionCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesAction);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remDefinesAction(){
        ((MvcControllerDMO) core).remDefinesAction();
    }

    /**
     * @return The number of MvcMenu items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDefinesMenuSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDefinesMenuIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDefinesMenuHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcMenuIterableDMW getDefinesMenuIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenu);
        if (attr == null)
            return(MvcMenuIterableDMW.emptyList);
        
        return(new MvcMenuIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDefinesMenu(MvcMenu value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addDefinesMenu(((MvcMenuDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDefinesMenu(MvcMenu value){
        ((MvcControllerDMO) core).delDefinesMenu(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcMenu objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcMenu> getDefinesMenuCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenu);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remDefinesMenu(){
        ((MvcControllerDMO) core).remDefinesMenu();
    }

    /**
     * @return The number of MvcMenuItem items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDefinesMenuItemSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDefinesMenuItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuItemDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDefinesMenuItemHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcMenuItemIterableDMW getDefinesMenuItemIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenuItem);
        if (attr == null)
            return(MvcMenuItemIterableDMW.emptyList);
        
        return(new MvcMenuItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDefinesMenuItem(MvcMenuItem value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addDefinesMenuItem(((MvcMenuItemDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDefinesMenuItem(MvcMenuItem value){
        ((MvcControllerDMO) core).delDefinesMenuItem(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcMenuItem objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcMenuItem> getDefinesMenuItemCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenuItem);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remDefinesMenuItem(){
        ((MvcControllerDMO) core).remDefinesMenuItem();
    }

    /**
     * @return The number of MvcMenuSeparator items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getDefinesMenuSeparatorSize(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcMenuSeparatorDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getDefinesMenuSeparatorIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcMenuSeparatorDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getDefinesMenuSeparatorHasValue(){
        DmcAttribute<?> attr = core.get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcMenuSeparatorDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public MvcMenuSeparatorIterableDMW getDefinesMenuSeparatorIterable(){
        DmcAttribute attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenuSeparator);
        if (attr == null)
            return(MvcMenuSeparatorIterableDMW.emptyList);
        
        return(new MvcMenuSeparatorIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesMenuSeparator value.
     * @param value A value compatible with MvcMenuSeparator
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addDefinesMenuSeparator(MvcMenuSeparator value){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).addDefinesMenuSeparator(((MvcMenuSeparatorDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a definesMenuSeparator value.
     * @param value The MvcMenuSeparator to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delDefinesMenuSeparator(MvcMenuSeparator value){
        ((MvcControllerDMO) core).delDefinesMenuSeparator(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcMenuSeparator objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<MvcMenuSeparator> getDefinesMenuSeparatorCopy(){
        DmcAttribute<?> attr = ((MvcControllerDMO) core).get(MvcControllerDMO.__definesMenuSeparator);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void remDefinesMenuSeparator(){
        ((MvcControllerDMO) core).remDefinesMenuSeparator();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public StringName getName(){
        return(((MvcControllerDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setName(Object value) throws DmcValueException {
        ((MvcControllerDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setName(StringName value){
        ((MvcControllerDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remName(){
        ((MvcControllerDMO) core).remName();
    }


}
