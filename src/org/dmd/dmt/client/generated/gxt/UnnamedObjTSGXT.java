package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                               // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:1590)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // DMO reference - (BaseDMWGeneratorNewest.java:1009)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO;                 // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                            // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class UnnamedObjTSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public UnnamedObjTSGXT() {
        super(new UnnamedObjTSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public UnnamedObjTSGXT(DmcTypeModifierMV mods) {
        super(new UnnamedObjTSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public UnnamedObjTSGXT getModificationRecorder(){
        UnnamedObjTSGXT rc = new UnnamedObjTSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public UnnamedObjTSDMO getDMO() {
        return((UnnamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public UnnamedObjTSGXT(UnnamedObjTSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getTsUnnamedObjSize(){
        return(((UnnamedObjTSDMO) core).getTsUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getTsUnnamedObjIsEmpty(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getTsUnnamedObjHasValue(){
        if (((UnnamedObjTSDMO) core).getTsUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1595)
    public Iterator<TestBasicObjectFixedDMO> getTsUnnamedObj(){
        return(((UnnamedObjTSDMO) core).getTsUnnamedObj());
    }

    /**
     * Adds another tsUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixedDMO
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1660)
    public DmcAttribute<?> addTsUnnamedObj(TestBasicObjectFixedDMO value){
        return(((UnnamedObjTSDMO) core).addTsUnnamedObj(value));
    }

    /**
     * Deletes a tsUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1708)
    public void delTsUnnamedObj(TestBasicObjectFixedDMO value){
        ((UnnamedObjTSDMO) core).delTsUnnamedObj(value);
    }

    /**
     * Removes the tsUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remTsUnnamedObj(){
        ((UnnamedObjTSDMO) core).remTsUnnamedObj();
    }


}
