package org.dmd.dmt.server.generated.auxw;

import org.dmd.dms.generated.enums.ValueTypeEnum;
// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                       // If any attributes
import org.dmd.dms.*;                                       // Always 2
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class

/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAUX(DMWGenerator.java:521)
 */
public class TestBasicAuxiliary {

    public final static ClassDefinition _auxClass = org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicAuxiliary;
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,true);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:1706)
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
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:1724)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:1734)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the svString attribute from the object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1829)
    static public DmcAttribute<?> remSvString(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__svString);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1864)
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
    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1905)
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
