package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import java.util.Date;                                      // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.types.DefinitionName;                    // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dmt.shared.generated.dmo.BaseObjDMO;         // Abstract class - (BaseDMWGenerator.java:1122)
import org.dmd.dmw.DmwNamedObjectWrapper;                   // Named object wrapper - (BaseDMWGenerator.java:1134)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
abstract public class BaseObjDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected BaseObjDMW() {
        super();
    }

    abstract public BaseObjDMW getModificationRecorder();

    public BaseObjDMO getDMO() {
        return((BaseObjDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected BaseObjDMW(BaseObjDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public DefinitionName getObjectName(){
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public DefinitionName getName(){
        return(((BaseObjDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setName(DefinitionName value){
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remName(){
        ((BaseObjDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public Date getSvDate(){
        return(((BaseObjDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setSvDate(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setSvDate(Date value){
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remSvDate(){
        ((BaseObjDMO) core).remSvDate();
    }


}
