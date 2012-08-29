package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpAUX(BaseDMWGeneratorNewest.java:605)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.enums.DataTypeEnum;            // For AUX base functionality - (BaseDMWGeneratorNewest.java:603)
import org.dmd.dms.generated.enums.ValueTypeEnum;           // For AUX base functionality - (BaseDMWGeneratorNewest.java:602)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class - (BaseDMWGeneratorNewest.java:971)
import org.dmd.dmw.DmwWrapper;                              // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1053)


/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpAUX(BaseDMWGeneratorNewest.java:607)
 */
public class TestBasicAuxiliary {

    public final static ClassDefinition _auxClass = org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicAuxiliary;
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10141,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getCommonAUXFunctions(BaseDMWGeneratorNewest.java:2523)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__svString) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getCommonAUXFunctions(BaseDMWGeneratorNewest.java:2541)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getCommonAUXFunctions(BaseDMWGeneratorNewest.java:2551)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the svString attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatAUXSV(BaseDMWGeneratorNewest.java:2645)
    static public DmcAttribute<?> remSvString(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__svString);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatAUXSV(BaseDMWGeneratorNewest.java:2676)
    static public String getSvString(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatAUXSV(BaseDMWGeneratorNewest.java:2716)
    static public void setSvString(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__svString);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__svString,attr);
    }




}
