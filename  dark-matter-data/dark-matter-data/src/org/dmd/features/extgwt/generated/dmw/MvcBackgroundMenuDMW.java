package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:665)
import java.util.*;                                                        // Always 1
import org.dmd.dmc.*;                                                      // Always 2
import org.dmd.dmc.types.StringName;                                       // Primitive type
import org.dmd.dms.*;                                                      // Always 3
import org.dmd.features.extgwt.extended.MvcMenu;                           // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcBackgroundMenuDMO;         // Class not auxiliary or abstract

/**
 * The MvcBackgroundMenu class is meant to allow for popup menus on the
 * background of components like DmdTreePanel and DmdGrid. In these cases,
 * objects displayed in the component are not selected, the menu is meant to
 * apply to tree/grid. This is useful for menus that have things like Add
 * Node or Add Row etc.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:231)
 */
abstract public class MvcBackgroundMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcBackgroundMenuDMO mycore;

    public MvcBackgroundMenuDMW() {
        super(new MvcBackgroundMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
        mycore = (MvcBackgroundMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
        mycore = (MvcBackgroundMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcBackgroundMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcBackgroundMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcBackgroundMenu>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:697)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcBackgroundMenuDMW){
            return( getObjectName().equals( ((MvcBackgroundMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:790)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:829)
    public void remName(){
        mycore.remName();
    }


}
