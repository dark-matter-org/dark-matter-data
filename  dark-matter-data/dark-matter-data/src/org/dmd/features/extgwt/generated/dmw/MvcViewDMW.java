package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import java.util.ArrayList;                                                      // To support getMVCopy()
import java.util.Iterator;                                                       // To support getMVCopy()
import org.dmd.dmc.*;                                                            // If any attributes
import org.dmd.dmc.types.StringName;                                             // Primitive type
import org.dmd.dms.*;                                                            // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcDefinition;                           // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                                // Is reference type aux
import org.dmd.features.extgwt.extended.MvcRegistryItem;                         // Is reference type aux
import org.dmd.features.extgwt.extended.MvcServerEvent;                          // Is reference type aux
import org.dmd.features.extgwt.extended.MvcView;                                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                        // For multi-valued containsMvcEvent
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;                 // For multi-valued containsMvcRegistryItem
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;                  // For multi-valued containsMvcServerEvent
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;                         // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmw.MvcEventIterableDMW;                // For multi-valued MvcEvent
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemIterableDMW;         // For multi-valued MvcRegistryItem
import org.dmd.features.extgwt.generated.dmw.MvcServerEventIterableDMW;          // For multi-valued MvcServerEvent
import org.dmd.features.extgwt.generated.types.MvcEventREF;                      // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;               // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;                // To support getMVCopy() for REFs

/**
 * The MvcView class allows for the definition of views. MvcView instance are
 * derived from the ExtGWT View class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcViewDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcViewDMW() {
        super(new MvcViewDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcView);
    }

    public MvcViewDMW(DmcTypeModifierMV mods) {
        super(new MvcViewDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcView);
    }

    public MvcView getModificationRecorder(){
        MvcView rc = new MvcView();
        rc.setDmcObject(new MvcViewDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcViewDMW(MvcViewDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcView);
    }

    public MvcViewDMO getDMO() {
        return((MvcViewDMO) core);
    }

    protected MvcViewDMW(MvcViewDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
    public StringName getObjectName(){
        return(((MvcViewDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcViewDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcViewDMW){
            return( getObjectName().equals( ((MvcViewDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcEvent items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1189)
    public MvcEventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = ((MvcViewDMO) core).get(MvcViewDMO.__handlesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1205)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = ((MvcViewDMO) core).addHandlesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1218)
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        ((MvcViewDMO) core).delHandlesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public ArrayList<MvcEvent> getHandlesEventCopy(){
        DmcAttribute<?> attr = ((MvcViewDMO) core).get(MvcViewDMO.__handlesEvent);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remHandlesEvent(){
        ((MvcViewDMO) core).remHandlesEvent();
    }

    /**
     * @return The number of MvcServerEvent items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getHandlesServerEventSize(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesServerEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcServerEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getHandlesServerEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesServerEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcServerEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getHandlesServerEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__handlesServerEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1189)
    public MvcServerEventIterableDMW getHandlesServerEventIterable(){
        DmcAttribute attr = ((MvcViewDMO) core).get(MvcViewDMO.__handlesServerEvent);
        if (attr == null)
            return(MvcServerEventIterableDMW.emptyList);
        
        return(new MvcServerEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1205)
    public DmcAttribute<?> addHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        DmcAttribute<?> attr = ((MvcViewDMO) core).addHandlesServerEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1218)
    public void delHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        ((MvcViewDMO) core).delHandlesServerEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcServerEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public ArrayList<MvcServerEvent> getHandlesServerEventCopy(){
        DmcAttribute<?> attr = ((MvcViewDMO) core).get(MvcViewDMO.__handlesServerEvent);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remHandlesServerEvent(){
        ((MvcViewDMO) core).remHandlesServerEvent();
    }

    /**
     * @return A MvcEvent object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:991)
    public MvcEvent getFiresEvent(){
        MvcEventREF ref = ((MvcViewDMO) core).getFiresEvent();
        if (ref == null)
            return(null);
        
        return((MvcEvent)ref.getObject().getContainer());
    }

    /**
     * Sets the firesEvent to the specified value.
     * @param value A value compatible with MvcEventREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setFiresEvent(MvcEvent value) {
        ((MvcViewDMO) core).setFiresEvent(value.getDMO());
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remFiresEvent(){
        ((MvcViewDMO) core).remFiresEvent();
    }

    /**
     * @return The number of MvcEvent items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getDispatchesEventSize(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__dispatchesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getDispatchesEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__dispatchesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getDispatchesEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__dispatchesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1189)
    public MvcEventIterableDMW getDispatchesEventIterable(){
        DmcAttribute attr = ((MvcViewDMO) core).get(MvcViewDMO.__dispatchesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1205)
    public DmcAttribute<?> addDispatchesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = ((MvcViewDMO) core).addDispatchesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1218)
    public void delDispatchesEvent(MvcEvent value) throws DmcValueException {
        ((MvcViewDMO) core).delDispatchesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public ArrayList<MvcEvent> getDispatchesEventCopy(){
        DmcAttribute<?> attr = ((MvcViewDMO) core).get(MvcViewDMO.__dispatchesEvent);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remDispatchesEvent(){
        ((MvcViewDMO) core).remDispatchesEvent();
    }

    /**
     * @return The number of MvcRegistryItem items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getUsesRegistryItemSize(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__usesRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getUsesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__usesRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getUsesRegistryItemHasValue(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__usesRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1189)
    public MvcRegistryItemIterableDMW getUsesRegistryItemIterable(){
        DmcAttribute attr = ((MvcViewDMO) core).get(MvcViewDMO.__usesRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1205)
    public DmcAttribute<?> addUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute<?> attr = ((MvcViewDMO) core).addUsesRegistryItem(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1218)
    public void delUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        ((MvcViewDMO) core).delUsesRegistryItem(value);
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public ArrayList<MvcRegistryItem> getUsesRegistryItemCopy(){
        DmcAttribute<?> attr = ((MvcViewDMO) core).get(MvcViewDMO.__usesRegistryItem);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remUsesRegistryItem(){
        ((MvcViewDMO) core).remUsesRegistryItem();
    }

    /**
     * @return The number of MvcRegistryItem items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getCreatesRegistryItemSize(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__createsRegistryItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcRegistryItemDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getCreatesRegistryItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__createsRegistryItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcRegistryItemDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getCreatesRegistryItemHasValue(){
        DmcAttribute<?> attr = core.get(MvcViewDMO.__createsRegistryItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1189)
    public MvcRegistryItemIterableDMW getCreatesRegistryItemIterable(){
        DmcAttribute attr = ((MvcViewDMO) core).get(MvcViewDMO.__createsRegistryItem);
        if (attr == null)
            return(MvcRegistryItemIterableDMW.emptyList);
        
        return(new MvcRegistryItemIterableDMW(attr.getMV()));
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1205)
    public DmcAttribute<?> addCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute<?> attr = ((MvcViewDMO) core).addCreatesRegistryItem(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1218)
    public void delCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        ((MvcViewDMO) core).delCreatesRegistryItem(value);
    }

    /**
     * @return A COPY of the collection of MvcRegistryItem objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1253)
    public ArrayList<MvcRegistryItem> getCreatesRegistryItemCopy(){
        DmcAttribute<?> attr = ((MvcViewDMO) core).get(MvcViewDMO.__createsRegistryItem);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remCreatesRegistryItem(){
        ((MvcViewDMO) core).remCreatesRegistryItem();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getDescription(){
        return(((MvcViewDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setDescription(Object value) throws DmcValueException {
        ((MvcViewDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setDescription(String value){
        ((MvcViewDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remDescription(){
        ((MvcViewDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((MvcViewDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((MvcViewDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((MvcViewDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((MvcViewDMO) core).remName();
    }


}
