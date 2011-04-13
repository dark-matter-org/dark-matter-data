package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.types.StringName;                                // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcMenu;                    // Derived class
import org.dmd.features.extgwt.extended.MvcToolBar;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcToolBarDMO;         // Class not auxiliary or abstract

/**
 * The MvcToolBar class represents a top level toolbar and aligns to the
 * com.extjs.gxt.ui.client.widget.toolbar.ToolBar class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcToolBarDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcToolBarDMO mycore;

    public MvcToolBarDMW() {
        super(new MvcToolBarDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcToolBar);
        mycore = (MvcToolBarDMO) core;
        mycore.setContainer(this);
    }

    public MvcToolBarDMW(DmcTypeModifierMV mods) {
        super(new MvcToolBarDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcToolBar);
        mycore = (MvcToolBarDMO) core;
        mycore.setContainer(this);
    }

    public MvcToolBarDMW getModificationRecorder(){
        MvcToolBarDMW rc = new MvcToolBar();
        rc.setDmcObject(new MvcToolBarDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcToolBarDMW(MvcToolBarDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcToolBar);
        mycore = (MvcToolBarDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcToolBarDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcToolBarDMO getDMO() {
        return(mycore);
    }

    protected MvcToolBarDMW(MvcToolBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcToolBarDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcToolBarDMW){
            return( getObjectName().equals( ((MvcToolBarDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remName(){
        mycore.remName();
    }


}
