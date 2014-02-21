package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGenerator.java:1709)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute tsUnnamedObj from the dmt schema - (BaseDMWGenerator.java:897)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // For multi-valued adds of TestBasicObjectFixed - (BaseDMWGenerator.java:1767)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO;                         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmw.DmwWrapper;                                                   // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class UnnamedObjTSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public UnnamedObjTSDMW() {
        super(new UnnamedObjTSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public UnnamedObjTSDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjTSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public UnnamedObjTSDMW getModificationRecorder(){
        UnnamedObjTSDMW rc = new UnnamedObjTSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public UnnamedObjTSDMW(UnnamedObjTSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjTS);
    }

    public UnnamedObjTSDMW cloneIt() {
        UnnamedObjTSDMW rc = new UnnamedObjTSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjTSDMO getDMO() {
        return((UnnamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected UnnamedObjTSDMW(UnnamedObjTSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getTsUnnamedObjSize(){
        return(((UnnamedObjTSDMO) core).getTsUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getTsUnnamedObjIsEmpty(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getTsUnnamedObjHasValue(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public TestBasicObjectFixedIterableDMW getTsUnnamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsUnnamedObj);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((UnnamedObjTSDMO) core).getTsUnnamedObj()));
    }

    /**
     * Adds another tsUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addTsUnnamedObj(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((UnnamedObjTSDMO) core).addTsUnnamedObj(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a tsUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delTsUnnamedObj(TestBasicObjectFixedDMW value){
        ((UnnamedObjTSDMO) core).delTsUnnamedObj(value.getDMO());
    }

    /**
     * Removes the tsUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remTsUnnamedObj(){
        ((UnnamedObjTSDMO) core).remTsUnnamedObj();
    }


}