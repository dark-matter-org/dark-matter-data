package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:666)
import java.util.*;                                                 // If not auxliary
import java.util.Date;                                              // Primitive type
import org.dmd.dmc.*;                                               // Always 2
import org.dmd.dmc.types.UUIDName;                                  // Primitive type
import org.dmd.dms.*;                                               // Always 3
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:231)
 */
public class UUIDNamedObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    private UUIDNamedObjectDMO mycore;

    public UUIDNamedObjectDMW() {
        super(new UUIDNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
        mycore = (UUIDNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    public UUIDNamedObjectDMW(UUIDNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
        mycore = (UUIDNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (UUIDNamedObjectDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected UUIDNamedObjectDMW(UUIDNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (UUIDNamedObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmt.server.generated.dmw.UUIDNamedObjectDMW>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:698)
    public UUIDName getObjectName(){
        return(mycore.getUuidName());
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMW){
            return( getObjectName().equals( ((UUIDNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public Boolean getSvBooleanValue(){
        return(mycore.getSvBooleanValue());
    }

    /**
     * Sets svBooleanValue to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setSvBooleanValue(Object value) throws DmcValueException {
        mycore.setSvBooleanValue(value);
    }

    /**
     * Removes the svBooleanValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remSvBooleanValue(){
        mycore.remSvBooleanValue();
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:950)
    public Iterator<Boolean> getMvBooleanValue(){
        return(mycore.getMvBooleanValue());
    }

    /**
     * Adds another mvBooleanValue value.
     * @param value A value compatible with Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:962)
    public void addMvBooleanValue(Object value) throws DmcValueException {
        mycore.addMvBooleanValue(value);
    }

    /**
     * Deletes a mvBooleanValue value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void delMvBooleanValue(Object value) throws DmcValueException {
        mycore.delMvBooleanValue(value);
    }

    /**
     * Removes the mvBooleanValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:986)
    public void remMvBooleanValue(){
        mycore.remMvBooleanValue();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public String getSvStringValue(){
        return(mycore.getSvStringValue());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setSvStringValue(Object value) throws DmcValueException {
        mycore.setSvStringValue(value);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remSvStringValue(){
        mycore.remSvStringValue();
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:950)
    public Iterator<String> getMvStringValue(){
        return(mycore.getMvStringValue());
    }

    /**
     * Adds another mvStringValue value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:962)
    public void addMvStringValue(Object value) throws DmcValueException {
        mycore.addMvStringValue(value);
    }

    /**
     * Deletes a mvStringValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void delMvStringValue(Object value) throws DmcValueException {
        mycore.delMvStringValue(value);
    }

    /**
     * Removes the mvStringValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:986)
    public void remMvStringValue(){
        mycore.remMvStringValue();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public Date getSvDateValue(){
        return(mycore.getSvDateValue());
    }

    /**
     * Sets svDateValue to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setSvDateValue(Object value) throws DmcValueException {
        mycore.setSvDateValue(value);
    }

    /**
     * Removes the svDateValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remSvDateValue(){
        mycore.remSvDateValue();
    }

    /**
     * @return An Iterator of Date objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:950)
    public Iterator<Date> getMvDateValue(){
        return(mycore.getMvDateValue());
    }

    /**
     * Adds another mvDateValue value.
     * @param value A value compatible with Date
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:962)
    public void addMvDateValue(Object value) throws DmcValueException {
        mycore.addMvDateValue(value);
    }

    /**
     * Deletes a mvDateValue value.
     * @param value The Date to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void delMvDateValue(Object value) throws DmcValueException {
        mycore.delMvDateValue(value);
    }

    /**
     * Removes the mvDateValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:986)
    public void remMvDateValue(){
        mycore.remMvDateValue();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public Double getSvDoubleValue(){
        return(mycore.getSvDoubleValue());
    }

    /**
     * Sets svDoubleValue to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setSvDoubleValue(Object value) throws DmcValueException {
        mycore.setSvDoubleValue(value);
    }

    /**
     * Removes the svDoubleValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remSvDoubleValue(){
        mycore.remSvDoubleValue();
    }

    /**
     * @return An Iterator of Double objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:950)
    public Iterator<Double> getMvDoubleValue(){
        return(mycore.getMvDoubleValue());
    }

    /**
     * Adds another mvDoubleValue value.
     * @param value A value compatible with Double
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:962)
    public void addMvDoubleValue(Object value) throws DmcValueException {
        mycore.addMvDoubleValue(value);
    }

    /**
     * Deletes a mvDoubleValue value.
     * @param value The Double to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:974)
    public void delMvDoubleValue(Object value) throws DmcValueException {
        mycore.delMvDoubleValue(value);
    }

    /**
     * Removes the mvDoubleValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:986)
    public void remMvDoubleValue(){
        mycore.remMvDoubleValue();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public UUIDName getUuidName(){
        return(mycore.getUuidName());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setUuidName(Object value) throws DmcValueException {
        mycore.setUuidName(value);
    }

    /**
     * Removes the uuidName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remUuidName(){
        mycore.remUuidName();
    }


}
