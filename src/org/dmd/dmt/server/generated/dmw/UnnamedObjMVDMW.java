package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGenerator.java:1709)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute mvUnnamedObj from the dmt schema - (BaseDMWGenerator.java:897)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // For multi-valued adds of TestBasicObjectFixed - (BaseDMWGenerator.java:1767)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO;                         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmw.DmwWrapper;                                                   // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class UnnamedObjMVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public UnnamedObjMVDMW() {
        super(new UnnamedObjMVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public UnnamedObjMVDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjMVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public UnnamedObjMVDMW getModificationRecorder(){
        UnnamedObjMVDMW rc = new UnnamedObjMVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public UnnamedObjMVDMW(UnnamedObjMVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMV);
    }

    public UnnamedObjMVDMW cloneIt() {
        UnnamedObjMVDMW rc = new UnnamedObjMVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjMVDMO getDMO() {
        return((UnnamedObjMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected UnnamedObjMVDMW(UnnamedObjMVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getMvUnnamedObjSize(){
        return(((UnnamedObjMVDMO) core).getMvUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getMvUnnamedObjIsEmpty(){
        if (((UnnamedObjMVDMO) core).getMvUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getMvUnnamedObjHasValue(){
        if (((UnnamedObjMVDMO) core).getMvUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public TestBasicObjectFixedIterableDMW getMvUnnamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((UnnamedObjMVDMO) core).getMvUnnamedObj()));
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((UnnamedObjMVDMO) core).addMvUnnamedObj(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delMvUnnamedObj(TestBasicObjectFixedDMW value){
        ((UnnamedObjMVDMO) core).delMvUnnamedObj(value.getDMO());
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remMvUnnamedObj(){
        ((UnnamedObjMVDMO) core).remMvUnnamedObj();
    }


}
