package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 3
import org.dmd.dmc.types.StringName;

// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcMenuBarDMO;

/**
 * The MvcMenuBar class represents a toplevel menubar and aligns to the 
 * com.extjs.gxt.ui.client.widget.menu.MenuBar class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:220)
 */
abstract public class MvcMenuBarDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcMenuBarDMO mycore;

    public MvcMenuBarDMW() {
        super(new MvcMenuBarDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
        mycore = (MvcMenuBarDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuBarDMW(MvcMenuBarDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
        mycore = (MvcMenuBarDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMenuBarDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcMenuBarDMW(MvcMenuBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuBarDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuBar>());
    }

    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuBarDMW){
            return( getObjectName().equals( ((MvcMenuBarDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
    }


}
