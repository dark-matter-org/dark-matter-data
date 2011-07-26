package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                               // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;                                  // Is reference type aux
import org.dmd.dms.generated.types.ClassDefinitionREF;                                // To support getMVCopy() for REFs
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                         // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormBindingDefinitionDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                         // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.types.EditField;                                // Primitive type

/**
 * The FormBinding class allows for the definition of bindings between DMO
 * attributes and the editors that will be used to display and edit their
 * values.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
abstract public class FormBindingDefinitionDMW extends MvwDefinition implements DmcNamedObjectIF {

    public FormBindingDefinitionDMW() {
        super(new FormBindingDefinitionDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormBindingDefinition);
    }

    public FormBindingDefinitionDMW(DmcTypeModifierMV mods) {
        super(new FormBindingDefinitionDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormBindingDefinition);
    }

    public FormBindingDefinition getModificationRecorder(){
        FormBindingDefinition rc = new FormBindingDefinition();
        rc.setBindingName(getBindingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public FormBindingDefinitionDMW(FormBindingDefinitionDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FormBindingDefinition);
    }

    public FormBindingDefinitionDMO getDMO() {
        return((FormBindingDefinitionDMO) core);
    }

    protected FormBindingDefinitionDMW(FormBindingDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
    public CamelCaseName getObjectName(){
        return(((FormBindingDefinitionDMO) core).getBindingName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((FormBindingDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof FormBindingDefinitionDMW){
            return( getObjectName().equals( ((FormBindingDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public CamelCaseName getBindingName(){
        return(((FormBindingDefinitionDMO) core).getBindingName());
    }

    /**
     * Sets bindingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setBindingName(Object value) throws DmcValueException {
        ((FormBindingDefinitionDMO) core).setBindingName(value);
    }

    /**
     * Sets bindingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setBindingName(CamelCaseName value){
        ((FormBindingDefinitionDMO) core).setBindingName(value);
    }

    /**
     * Removes the bindingName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remBindingName(){
        ((FormBindingDefinitionDMO) core).remBindingName();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1080)
    public ClassDefinitionDMW getEditObject(){
        ClassDefinitionREF ref = ((FormBindingDefinitionDMO) core).getEditObject();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the editObject to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1128)
    public void setEditObject(ClassDefinitionDMW value) {
        ((FormBindingDefinitionDMO) core).setEditObject(value.getDMO());
    }

    /**
     * Removes the editObject attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remEditObject(){
        ((FormBindingDefinitionDMO) core).remEditObject();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public EditField getEditField(){
        return(((FormBindingDefinitionDMO) core).getEditField());
    }

    /**
     * Sets editField to the specified value.
     * @param value A value compatible with DmcTypeEditField
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setEditField(Object value) throws DmcValueException {
        ((FormBindingDefinitionDMO) core).setEditField(value);
    }

    /**
     * Sets editField to the specified value.
     * @param value EditField
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setEditField(EditField value){
        ((FormBindingDefinitionDMO) core).setEditField(value);
    }

    /**
     * Removes the editField attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remEditField(){
        ((FormBindingDefinitionDMO) core).remEditField();
    }


}
