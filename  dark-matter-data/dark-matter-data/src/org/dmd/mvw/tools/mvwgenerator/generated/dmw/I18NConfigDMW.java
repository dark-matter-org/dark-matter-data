package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:878)
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                    // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.I18NConfig;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;             // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO;         // Class not auxiliary or abstract

/**
 * The I18NConfig is a specialized RunContextItem that indicates an interface
 * class used to access internationalized constants or messages.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:293)
 */
abstract public class I18NConfigDMW extends RunContextItem implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:370)
    public I18NConfigDMW() {
        super(new I18NConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:376)
    public I18NConfigDMW(DmcTypeModifierMV mods) {
        super(new I18NConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:418)
    public I18NConfig getModificationRecorder(){
        I18NConfig rc = new I18NConfig();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:439)
    public I18NConfigDMW(I18NConfigDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._I18NConfig);
    }

    public I18NConfig cloneIt() {
        I18NConfig rc = new I18NConfig();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public I18NConfigDMO getDMO() {
        return((I18NConfigDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:456)
    protected I18NConfigDMW(I18NConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:905)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1057)
    public CamelCaseName getItemName(){
        return(((I18NConfigDMO) core).getItemName());
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1116)
    public void setItemName(Object value) throws DmcValueException {
        ((I18NConfigDMO) core).setItemName(value);
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1125)
    public void setItemName(CamelCaseName value){
        ((I18NConfigDMO) core).setItemName(value);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1151)
    public void remItemName(){
        ((I18NConfigDMO) core).remItemName();
    }


}
