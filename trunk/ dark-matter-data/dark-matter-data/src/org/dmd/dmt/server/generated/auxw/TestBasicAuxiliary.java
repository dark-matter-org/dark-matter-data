package org.dmd.dmt.server.generated.auxw;

import org.dmd.dms.generated.enums.ValueTypeEnum;
// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import org.dmd.dmc.*;                           // Always 2
import org.dmd.dmc.types.DmcTypeString;         // Type in an auxiliary class
import org.dmd.dms.*;                           // Always 3

/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAUX(DMWGenerator.java:419)
 */
public class TestBasicAuxiliary {

    public final static ClassDefinition _auxClass = org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicAuxiliary;
    public final static DmcAttributeInfo __svAuxString = new DmcAttributeInfo("svAuxString",818,"String",ValueTypeEnum.SINGLE,true);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:995)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__svAuxString) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:1013)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.DMWGenerator.getCommonAUXFunctions(DMWGenerator.java:1044)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the svAuxString attribute from the object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1175)
    static public DmcAttribute<?> remSvAuxString(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__svAuxString);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1209)
    static public String getSvAuxString(DmwWrapper corew){
        DmcTypeString attr = (DmcTypeString) corew.getDmcObject().get(__svAuxString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svAuxString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatAUXSV(DMWGenerator.java:1254)
    static public void setSvAuxString(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__svAuxString);
        if (attr == null){
            attr = new DmcTypeString();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__svAuxString,attr);
    }




}
