package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                         // To support getMVCopy()
import java.util.Date;                                              // For multi-valued containsDate
import java.util.Iterator;                                          // To support getMVCopy()
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.types.UUIDName;                                  // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.dmw.BooleanIterableDMW;                // For multi-valued Boolean
import org.dmd.dms.generated.dmw.DateIterableDMW;                   // For multi-valued Date
import org.dmd.dms.generated.dmw.DoubleIterableDMW;                 // For multi-valued Double
import org.dmd.dms.generated.dmw.StringIterableDMW;                 // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class UUIDNamedObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    public UUIDNamedObjectDMW() {
        super(new UUIDNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    public UUIDNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new UUIDNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    public UUIDNamedObjectDMW getModificationRecorder(){
        UUIDNamedObjectDMW rc = new UUIDNamedObjectDMW();
        rc.setUuidName(getUuidName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public UUIDNamedObjectDMW(UUIDNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    public UUIDNamedObjectDMO getDMO() {
        return((UUIDNamedObjectDMO) core);
    }

    protected UUIDNamedObjectDMW(UUIDNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public UUIDName getObjectName(){
        return(((UUIDNamedObjectDMO) core).getUuidName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((UUIDNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMW){
            return( getObjectName().equals( ((UUIDNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Boolean isSvBoolean(){
        return(((UUIDNamedObjectDMO) core).isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvBoolean(){
        ((UUIDNamedObjectDMO) core).remSvBoolean();
    }

    /**
     * @return The number of Boolean items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvBooleanSize(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no BooleanDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvBooleanIsEmpty(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any BooleanDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvBooleanHasValue(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public BooleanIterableDMW getMvBooleanIterable(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(BooleanIterableDMW.emptyList);
        
        return(new BooleanIterableDMW(((UUIDNamedObjectDMO) core).getMvBoolean()));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvBoolean(value);
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).addMvBoolean(value);
    }

    /**
     * Returns true if the collection contains the mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean mvBooleanContains(Boolean value){
        return(((UUIDNamedObjectDMO) core).mvBooleanContains(value));
    }

    /**
     * @return A COPY of the collection of Boolean objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<Boolean> getMvBooleanCopy(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(new ArrayList<Boolean>());
        
        ArrayList<Boolean> rc = new ArrayList<Boolean>(attr.getMVSize());
        
        Iterator<Boolean> it = (Iterator<Boolean>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delMvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvBoolean(value);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delMvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).delMvBoolean(value);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remMvBoolean(){
        ((UUIDNamedObjectDMO) core).remMvBoolean();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSvString(){
        return(((UUIDNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvString(String value){
        ((UUIDNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvString(){
        ((UUIDNamedObjectDMO) core).remSvString();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((UUIDNamedObjectDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvString(String value){
        ((UUIDNamedObjectDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean mvStringContains(String value){
        return(((UUIDNamedObjectDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delMvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delMvString(String value){
        ((UUIDNamedObjectDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remMvString(){
        ((UUIDNamedObjectDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Date getSvDate(){
        return(((UUIDNamedObjectDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvDate(Date value){
        ((UUIDNamedObjectDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvDate(){
        ((UUIDNamedObjectDMO) core).remSvDate();
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvDateSize(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvDateIsEmpty(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvDateHasValue(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public DateIterableDMW getMvDateIterable(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((UUIDNamedObjectDMO) core).getMvDate()));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvDate(value);
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvDate(Date value){
        ((UUIDNamedObjectDMO) core).addMvDate(value);
    }

    /**
     * Returns true if the collection contains the mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean mvDateContains(Date value){
        return(((UUIDNamedObjectDMO) core).mvDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<Date> getMvDateCopy(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(new ArrayList<Date>());
        
        ArrayList<Date> rc = new ArrayList<Date>(attr.getMVSize());
        
        Iterator<Date> it = (Iterator<Date>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delMvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvDate(value);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delMvDate(Date value){
        ((UUIDNamedObjectDMO) core).delMvDate(value);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remMvDate(){
        ((UUIDNamedObjectDMO) core).remMvDate();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Double getSvDouble(){
        return(((UUIDNamedObjectDMO) core).getSvDouble());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvDouble(value);
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvDouble(Double value){
        ((UUIDNamedObjectDMO) core).setSvDouble(value);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvDouble(){
        ((UUIDNamedObjectDMO) core).remSvDouble();
    }

    /**
     * @return The number of Double items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvDoubleSize(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvDoubleIsEmpty(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvDoubleHasValue(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public DoubleIterableDMW getMvDoubleIterable(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(((UUIDNamedObjectDMO) core).getMvDouble()));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvDouble(value);
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvDouble(Double value){
        ((UUIDNamedObjectDMO) core).addMvDouble(value);
    }

    /**
     * Returns true if the collection contains the mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean mvDoubleContains(Double value){
        return(((UUIDNamedObjectDMO) core).mvDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<Double> getMvDoubleCopy(){
        DmcAttribute<?> attr = core.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(new ArrayList<Double>());
        
        ArrayList<Double> rc = new ArrayList<Double>(attr.getMVSize());
        
        Iterator<Double> it = (Iterator<Double>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delMvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvDouble(value);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delMvDouble(Double value){
        ((UUIDNamedObjectDMO) core).delMvDouble(value);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remMvDouble(){
        ((UUIDNamedObjectDMO) core).remMvDouble();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public UUIDName getUuidName(){
        return(((UUIDNamedObjectDMO) core).getUuidName());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setUuidName(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setUuidName(value);
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setUuidName(UUIDName value){
        ((UUIDNamedObjectDMO) core).setUuidName(value);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remUuidName(){
        ((UUIDNamedObjectDMO) core).remUuidName();
    }


}