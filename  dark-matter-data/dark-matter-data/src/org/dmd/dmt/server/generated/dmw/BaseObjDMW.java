package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import java.util.Date;                                      // Primitive type
import org.dmd.dmc.*;                                       // If any attributes
import org.dmd.dmc.types.StringName;                        // Primitive type
import org.dmd.dms.*;                                       // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                 // Attribute from meta schema
import org.dmd.dmt.shared.generated.dmo.BaseObjDMO;         // Abstract class
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;           // Attribute from dmt schema
import org.dmd.dmw.DmwNamedObjectWrapper;                   // Named object wrapper

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
abstract public class BaseObjDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected BaseObjDMW() {
        super();
    }

    abstract public BaseObjDMW getModificationRecorder();

    public BaseObjDMO getDMO() {
        return((BaseObjDMO) core);
    }

    protected BaseObjDMW(BaseObjDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
    public StringName getObjectName(){
        return(((BaseObjDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((BaseObjDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof BaseObjDMW){
            return( getObjectName().equals( ((BaseObjDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public Date getSvDate(){
        return(((BaseObjDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setSvDate(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setSvDate(Date value){
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remSvDate(){
        ((BaseObjDMO) core).remSvDate();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public StringName getName(){
        return(((BaseObjDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setName(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setName(StringName value){
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remName(){
        ((BaseObjDMO) core).remName();
    }


}
