package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                    // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.I18NConfig;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;             // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;              // Attribute from mvw schema

/**
 * The I18NConfig is a specialized RunContextItem that indicates an interface
 * class used to access internationalized constants or messages.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class I18NConfigDMW extends RunContextItem implements DmcNamedObjectIF {

    public I18NConfigDMW() {
        super(new I18NConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    public I18NConfigDMW(DmcTypeModifierMV mods) {
        super(new I18NConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    public I18NConfig getModificationRecorder(){
        I18NConfig rc = new I18NConfig();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public I18NConfigDMW(I18NConfigDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    public I18NConfigDMO getDMO() {
        return((I18NConfigDMO) core);
    }

    protected I18NConfigDMW(I18NConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public CamelCaseName getObjectName(){
        return(((I18NConfigDMO) core).getItemName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((I18NConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof I18NConfigDMW){
            return( getObjectName().equals( ((I18NConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getItemName(){
        return(((I18NConfigDMO) core).getItemName());
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setItemName(Object value) throws DmcValueException {
        ((I18NConfigDMO) core).setItemName(value);
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setItemName(CamelCaseName value){
        ((I18NConfigDMO) core).setItemName(value);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remItemName(){
        ((I18NConfigDMO) core).remItemName();
    }


}
