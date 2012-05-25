package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGeneratorNewest.java:868)
import org.dmd.dms.*;                                                                 // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;                            // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Separator;                       // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:880)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SeparatorDMO;                     // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;         // Derived class - (BaseDMWGeneratorNewest.java:1043)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                        // Is reference type REF - (BaseDMWGeneratorNewest.java:914)


/**
 * The Separator is used to define menu separators.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class SeparatorDMW extends MenuElementDefinitionDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public SeparatorDMW() {
        super(new SeparatorDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public SeparatorDMW(DmcTypeModifierMV mods) {
        super(new SeparatorDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public Separator getModificationRecorder(){
        Separator rc = new Separator();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public SeparatorDMW(SeparatorDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    public Separator cloneIt() {
        Separator rc = new Separator();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SeparatorDMO getDMO() {
        return((SeparatorDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected SeparatorDMW(SeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1092)
    public CamelCaseName getObjectName(){
        return(((SeparatorDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SeparatorDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SeparatorDMW){
            return( getObjectName().equals( ((SeparatorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A Menu object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1225)
    public Menu getAddToMenu(){
        MenuREF ref = ((SeparatorDMO) core).getAddToMenu();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Menu)ref.getObject().getContainer());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1310)
    public void setAddToMenu(Menu value) {
        ((SeparatorDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1319)
    public void setAddToMenu(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setAddToMenu(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remAddToMenu(){
        ((SeparatorDMO) core).remAddToMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public CamelCaseName getElementName(){
        return(((SeparatorDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setElementName(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setElementName(CamelCaseName value){
        ((SeparatorDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remElementName(){
        ((SeparatorDMO) core).remElementName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getMenuOrder(){
        return(((SeparatorDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setMenuOrder(String value){
        ((SeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remMenuOrder(){
        ((SeparatorDMO) core).remMenuOrder();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getUseImpl(){
        return(((SeparatorDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setUseImpl(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setUseImpl(String value){
        ((SeparatorDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remUseImpl(){
        ((SeparatorDMO) core).remUseImpl();
    }


}
