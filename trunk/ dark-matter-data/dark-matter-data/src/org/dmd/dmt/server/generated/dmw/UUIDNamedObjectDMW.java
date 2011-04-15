package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
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

    private UUIDNamedObjectDMO mycore;

    public UUIDNamedObjectDMW() {
        super(new UUIDNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
        mycore = (UUIDNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    public UUIDNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new UUIDNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
        mycore = (UUIDNamedObjectDMO) core;
        mycore.setContainer(this);
    }

    public UUIDNamedObjectDMW getModificationRecorder(){
        UUIDNamedObjectDMW rc = new UUIDNamedObjectDMW(new DmcTypeModifierMV());
        rc.setUuidName(getUuidName());
        return(rc);
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

    public UUIDNamedObjectDMO getDMO() {
        return(mycore);
    }

    protected UUIDNamedObjectDMW(UUIDNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (UUIDNamedObjectDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:868)
    public UUIDName getObjectName(){
        return(mycore.getUuidName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof UUIDNamedObjectDMW){
            return( getObjectName().equals( ((UUIDNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public Boolean isSvBoolean(){
        return(mycore.isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setSvBoolean(Object value) throws DmcValueException {
        mycore.setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setSvBoolean(Boolean value){
        mycore.setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remSvBoolean(){
        mycore.remSvBoolean();
    }

    /**
     * @return The number of BooleanDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getMvBooleanSize(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no BooleanDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getMvBooleanIsEmpty(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any BooleanDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public boolean getMvBooleanHasValue(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1249)
    public BooleanIterableDMW getMvBooleanIterable(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvBoolean);
        if (attr == null)
            return(BooleanIterableDMW.emptyList);
        
        return(new BooleanIterableDMW(mycore.getMvBoolean()));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public void addMvBoolean(Object value) throws DmcValueException {
        mycore.addMvBoolean(value);
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1274)
    public void addMvBoolean(Boolean value){
        mycore.addMvBoolean(value);
    }

    /**
     * Returns true if the collection contains the mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1286)
    public boolean mvBooleanContains(Boolean value){
        return(mycore.mvBooleanContains(value));
    }

    /**
     * @return A COPY of the collection of Boolean objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1314)
    @SuppressWarnings("unchecked")
    public ArrayList<Boolean> getMvBooleanCopy(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvBoolean);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1341)
    public void delMvBoolean(Object value) throws DmcValueException {
        mycore.delMvBoolean(value);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remMvBoolean(){
        mycore.remMvBoolean();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remSvString(){
        mycore.remSvString();
    }

    /**
     * @return The number of StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getMvStringSize(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1249)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(mycore.getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public void addMvString(Object value) throws DmcValueException {
        mycore.addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1274)
    public void addMvString(String value){
        mycore.addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1286)
    public boolean mvStringContains(String value){
        return(mycore.mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1314)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvString);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1341)
    public void delMvString(Object value) throws DmcValueException {
        mycore.delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remMvString(){
        mycore.remMvString();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public Date getSvDate(){
        return(mycore.getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setSvDate(Object value) throws DmcValueException {
        mycore.setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setSvDate(Date value){
        mycore.setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remSvDate(){
        mycore.remSvDate();
    }

    /**
     * @return The number of DateDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getMvDateSize(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getMvDateIsEmpty(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public boolean getMvDateHasValue(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1249)
    public DateIterableDMW getMvDateIterable(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(mycore.getMvDate()));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public void addMvDate(Object value) throws DmcValueException {
        mycore.addMvDate(value);
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1274)
    public void addMvDate(Date value){
        mycore.addMvDate(value);
    }

    /**
     * Returns true if the collection contains the mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1286)
    public boolean mvDateContains(Date value){
        return(mycore.mvDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1314)
    @SuppressWarnings("unchecked")
    public ArrayList<Date> getMvDateCopy(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDate);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1341)
    public void delMvDate(Object value) throws DmcValueException {
        mycore.delMvDate(value);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remMvDate(){
        mycore.remMvDate();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public Double getSvDouble(){
        return(mycore.getSvDouble());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setSvDouble(Object value) throws DmcValueException {
        mycore.setSvDouble(value);
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setSvDouble(Double value){
        mycore.setSvDouble(value);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remSvDouble(){
        mycore.remSvDouble();
    }

    /**
     * @return The number of DoubleDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getMvDoubleSize(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getMvDoubleIsEmpty(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
    public boolean getMvDoubleHasValue(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1249)
    public DoubleIterableDMW getMvDoubleIterable(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(mycore.getMvDouble()));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1265)
    public void addMvDouble(Object value) throws DmcValueException {
        mycore.addMvDouble(value);
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1274)
    public void addMvDouble(Double value){
        mycore.addMvDouble(value);
    }

    /**
     * Returns true if the collection contains the mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1286)
    public boolean mvDoubleContains(Double value){
        return(mycore.mvDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1314)
    @SuppressWarnings("unchecked")
    public ArrayList<Double> getMvDoubleCopy(){
        DmcAttribute<?> attr = mycore.get(UUIDNamedObjectDMO.__mvDouble);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1341)
    public void delMvDouble(Object value) throws DmcValueException {
        mycore.delMvDouble(value);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remMvDouble(){
        mycore.remMvDouble();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public UUIDName getUuidName(){
        return(mycore.getUuidName());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setUuidName(Object value) throws DmcValueException {
        mycore.setUuidName(value);
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setUuidName(UUIDName value){
        mycore.setUuidName(value);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remUuidName(){
        mycore.remUuidName();
    }


}
