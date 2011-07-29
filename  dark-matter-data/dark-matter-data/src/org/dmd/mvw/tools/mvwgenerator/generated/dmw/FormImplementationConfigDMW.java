package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import org.dmd.dmc.*;                                                                    // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                                  // Primitive type
import org.dmd.dms.*;                                                                    // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                            // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormImplementationConfig;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormImplementationConfigDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                            // Attribute from mvw schema

/**
 * The
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
abstract public class FormImplementationConfigDMW extends MvwDefinition implements DmcNamedObjectIF {

    public FormImplementationConfigDMW() {
        super(new FormImplementationConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormImplementationConfig);
    }

    public FormImplementationConfigDMW(DmcTypeModifierMV mods) {
        super(new FormImplementationConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormImplementationConfig);
    }

    public FormImplementationConfig getModificationRecorder(){
        FormImplementationConfig rc = new FormImplementationConfig();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public FormImplementationConfigDMW(FormImplementationConfigDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormImplementationConfig);
    }

    public FormImplementationConfigDMO getDMO() {
        return((FormImplementationConfigDMO) core);
    }

    protected FormImplementationConfigDMW(FormImplementationConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
    public CamelCaseName getObjectName(){
        return(((FormImplementationConfigDMO) core).getConfigName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((FormImplementationConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof FormImplementationConfigDMW){
            return( getObjectName().equals( ((FormImplementationConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public CamelCaseName getConfigName(){
        return(((FormImplementationConfigDMO) core).getConfigName());
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setConfigName(Object value) throws DmcValueException {
        ((FormImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setConfigName(CamelCaseName value){
        ((FormImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remConfigName(){
        ((FormImplementationConfigDMO) core).remConfigName();
    }


}
