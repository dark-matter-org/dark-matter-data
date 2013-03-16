package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values - (BaseDMWGeneratorNewest.java:1025)
import org.dmd.dmc.types.NameContainer;                               // Primitive type - (BaseDMWGeneratorNewest.java:1017)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:120)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.dmt.shared.types.DmtStringName;                        // Primitive type - (BaseDMWGeneratorNewest.java:1017)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class NameContainerTestGXT extends GxtWrapper {


    static final int anObjNameID = 10900;
    static final int anotherDmtNameID = 10902;
    static final int dmtStringNameID = 10901;

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public NameContainerTestGXT() {
        super(new NameContainerTestDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public NameContainerTestGXT(DmcTypeModifierMV mods) {
        super(new NameContainerTestDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public NameContainerTestGXT getModificationRecorder(){
        NameContainerTestGXT rc = new NameContainerTestGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public NameContainerTestDMO getDMO() {
        return((NameContainerTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public NameContainerTestGXT(NameContainerTestDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public NameContainer getAnObjName(){
        return(((NameContainerTestDMO) core).getAnObjName());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setAnObjName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setAnObjName(NameContainer value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1470)
    public void setAnObjName(DmcObjectName value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remAnObjName(){
        ((NameContainerTestDMO) core).remAnObjName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public DmtStringName getAnotherDmtName(){
        return(((NameContainerTestDMO) core).getAnotherDmtName());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setAnotherDmtName(DmtStringName value){
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remAnotherDmtName(){
        ((NameContainerTestDMO) core).remAnotherDmtName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public DmtStringName getDmtStringName(){
        return(((NameContainerTestDMO) core).getDmtStringName());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setDmtStringName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setDmtStringName(DmtStringName value){
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDmtStringName(){
        ((NameContainerTestDMO) core).remDmtStringName();
    }

    @Override
    public <X> X set(String property, X value) {
        DmcAttributeInfo ai = core.getAttributeInfo(property);
			
			if (ai == null)
				throw(new IllegalStateException("Unknown attribute: " + property + " for class: " + core.getConstructionClassName()));

			if (ai.valueType != ValueTypeEnum.SINGLE)
				throw(new IllegalStateException("The set() method only supports single-valued attributes. This attribute is multi-valued: " + property));

			X oldValue = get(property);
			
			try {
				switch(ai.id){

				case anObjNameID:
				    ((NameContainerTestDMO) core).setAnObjName(value);
				    break;
				case anotherDmtNameID:
				    ((NameContainerTestDMO) core).setAnotherDmtName(value);
				    break;
				case dmtStringNameID:
				    ((NameContainerTestDMO) core).setDmtStringName(value);
				    break;

			    }
	        } catch (DmcValueException e) {
		        throw(new IllegalStateException(e));
	        }

			notifyPropertyChanged(property, value, oldValue);
			return(oldValue);
		}

}
