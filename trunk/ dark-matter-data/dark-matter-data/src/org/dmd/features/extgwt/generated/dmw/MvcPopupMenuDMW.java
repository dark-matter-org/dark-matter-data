package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:751)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                  // Primitive type
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.features.extgwt.extended.MvcMenu;                      // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcPopupMenuDMO;         // Class not auxiliary or abstract

/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class MvcPopupMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcPopupMenuDMO mycore;

    public MvcPopupMenuDMW() {
        super(new MvcPopupMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
        mycore = (MvcPopupMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcPopupMenuDMW(MvcPopupMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
        mycore = (MvcPopupMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcPopupMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcPopupMenuDMO getDMO() {
        return(mycore);
    }

    protected MvcPopupMenuDMW(MvcPopupMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcPopupMenuDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:777)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMW){
            return( getObjectName().equals( ((MvcPopupMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:928)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:937)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remName(){
        mycore.remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public String getUseForModelClass(){
        return(mycore.getUseForModelClass());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:928)
    public void setUseForModelClass(Object value) throws DmcValueException {
        mycore.setUseForModelClass(value);
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:937)
    public void setUseForModelClass(String value){
        mycore.setUseForModelClass(value);
    }

    /**
     * Removes the useForModelClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remUseForModelClass(){
        mycore.remUseForModelClass();
    }


}
