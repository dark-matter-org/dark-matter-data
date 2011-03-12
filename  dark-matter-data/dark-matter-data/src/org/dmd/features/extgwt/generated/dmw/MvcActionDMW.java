package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.types.StringName;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 3
import org.dmd.dmc.types.StringName;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;

/**
 * The MvcAction class allows for the definition of behaviour that can be
 * associated with menus, buttons and other UI components. Actions are
 * associated with controllers so that they can be informed of events in
 * which they're interested, since only controllers can register for events.
 * Actions may be defined and used by  menu items defined in other
 * Controllers.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:220)
 */
abstract public class MvcActionDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcActionDMO mycore;

    public MvcActionDMW() {
        super(new MvcActionDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    public MvcActionDMW(MvcActionDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcActionDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcActionDMW(MvcActionDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcActionDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcAction>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:690)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMW){
            return( getObjectName().equals( ((MvcActionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:873)
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:875)
    public Iterator<MvcEvent> getHandlesEvent(){
        DmcAttribute attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return( ((List<MvcEvent>) Collections.EMPTY_LIST).iterator() );
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return( ((List<MvcEvent>) Collections.EMPTY_LIST).iterator() );
        
        return(refs.iterator());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:900)
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:902)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addHandlesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:923)
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:924)
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.delHandlesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:980)
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:783)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:811)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:822)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:769)
    public MvcController getAssociatedController(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:798)
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:822)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}
