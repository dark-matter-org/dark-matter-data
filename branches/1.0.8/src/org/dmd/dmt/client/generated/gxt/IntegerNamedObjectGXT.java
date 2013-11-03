package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.IntegerName;                                  // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.enums.ValueTypeEnum;                      // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:120)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;               // Named object wrapper - (BaseDMWGeneratorNewest.java:1109)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class IntegerNamedObjectGXT extends GxtNamedObjectWrapper implements DmcNamedObjectIF {


    static final int integerNameID = 100;
    static final int svStringID = 10141;

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public IntegerNamedObjectGXT() {
        super(new IntegerNamedObjectDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public IntegerNamedObjectGXT(DmcTypeModifierMV mods) {
        super(new IntegerNamedObjectDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:504)
    public IntegerNamedObjectGXT getModificationRecorder(){
        IntegerNamedObjectGXT rc = new IntegerNamedObjectGXT();
        rc.setIntegerName(getIntegerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public IntegerNamedObjectDMO getDMO() {
        return((IntegerNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public IntegerNamedObjectGXT(IntegerNamedObjectDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
    public IntegerName getObjectName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((IntegerNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectGXT){
            return( getObjectName().equals( ((IntegerNamedObjectGXT) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public IntegerName getIntegerName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setIntegerName(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setIntegerName(IntegerName value){
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remIntegerName(){
        ((IntegerNamedObjectDMO) core).remIntegerName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public String getSvString(){
        return(((IntegerNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setSvString(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setSvString(String value){
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remSvString(){
        ((IntegerNamedObjectDMO) core).remSvString();
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

				case integerNameID:
				    ((IntegerNamedObjectDMO) core).setIntegerName(value);
				    break;
				case svStringID:
				    ((IntegerNamedObjectDMO) core).setSvString(value);
				    break;

			    }
	        } catch (DmcValueException e) {
		        throw(new IllegalStateException(e));
	        }

			notifyPropertyChanged(property, value, oldValue);
			return(oldValue);
		}

}