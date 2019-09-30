//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                         // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.Date;                                              // Primitive type - (BaseDMWGenerator.java:1040)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.UUIDName;                                  // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.BooleanIterableDMW;                // For multi-valued Boolean - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.dmw.DateIterableDMW;                   // For multi-valued Date - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.dmw.DoubleIterableDMW;                 // For multi-valued Double - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.dmw.StringIterableDMW;                 // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                   // Attribute mvBoolean from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmw.DmwNamedObjectWrapper;                           // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class UUIDNamedObjectDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public UUIDNamedObjectDMW() {
        super(new UUIDNamedObjectDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public UUIDNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new UUIDNamedObjectDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public UUIDNamedObjectDMW getModificationRecorder(){
        UUIDNamedObjectDMW rc = new UUIDNamedObjectDMW();
        rc.setUuidName(getUuidName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public UUIDNamedObjectDMW(UUIDNamedObjectDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UUIDNamedObject);
    }

    public UUIDNamedObjectDMW cloneIt() {
        UUIDNamedObjectDMW rc = new UUIDNamedObjectDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UUIDNamedObjectDMO getDMO() {
        return((UUIDNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected UUIDNamedObjectDMW(UUIDNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
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

    /**
     * @return The number of Boolean items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvBooleanSize(){
        return(((UUIDNamedObjectDMO) core).getMvBooleanSize());
    }

    /**
     * @return true if there are no BooleanDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvBooleanIsEmpty(){
        if (((UUIDNamedObjectDMO) core).getMvBooleanSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any BooleanDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvBooleanHasValue(){
        if (((UUIDNamedObjectDMO) core).getMvBooleanSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public BooleanIterableDMW getMvBooleanIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(BooleanIterableDMW.emptyList);
        
        return(new BooleanIterableDMW(((UUIDNamedObjectDMO) core).getMvBoolean()));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addMvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvBoolean(value);
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addMvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).addMvBoolean(value);
    }

    /**
     * @param value A value compatible with Boolean
     * @return true if the collection contains the mvBoolean value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean mvBooleanContains(Boolean value){
        return(((UUIDNamedObjectDMO) core).mvBooleanContains(value));
    }

    /**
     * @return A COPY of the collection of Boolean objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<Boolean> getMvBooleanCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvBoolean);
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delMvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvBoolean(value);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delMvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).delMvBoolean(value);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvBoolean(){
        ((UUIDNamedObjectDMO) core).remMvBoolean();
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvDateSize(){
        return(((UUIDNamedObjectDMO) core).getMvDateSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvDateIsEmpty(){
        if (((UUIDNamedObjectDMO) core).getMvDateSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvDateHasValue(){
        if (((UUIDNamedObjectDMO) core).getMvDateSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public DateIterableDMW getMvDateIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((UUIDNamedObjectDMO) core).getMvDate()));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addMvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvDate(value);
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addMvDate(Date value){
        ((UUIDNamedObjectDMO) core).addMvDate(value);
    }

    /**
     * @param value A value compatible with Date
     * @return true if the collection contains the mvDate value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean mvDateContains(Date value){
        return(((UUIDNamedObjectDMO) core).mvDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<Date> getMvDateCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDate);
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delMvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvDate(value);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delMvDate(Date value){
        ((UUIDNamedObjectDMO) core).delMvDate(value);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvDate(){
        ((UUIDNamedObjectDMO) core).remMvDate();
    }

    /**
     * @return The number of Double items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvDoubleSize(){
        return(((UUIDNamedObjectDMO) core).getMvDoubleSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvDoubleIsEmpty(){
        if (((UUIDNamedObjectDMO) core).getMvDoubleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvDoubleHasValue(){
        if (((UUIDNamedObjectDMO) core).getMvDoubleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public DoubleIterableDMW getMvDoubleIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(((UUIDNamedObjectDMO) core).getMvDouble()));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addMvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvDouble(value);
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addMvDouble(Double value){
        ((UUIDNamedObjectDMO) core).addMvDouble(value);
    }

    /**
     * @param value A value compatible with Double
     * @return true if the collection contains the mvDouble value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean mvDoubleContains(Double value){
        return(((UUIDNamedObjectDMO) core).mvDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<Double> getMvDoubleCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDouble);
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delMvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvDouble(value);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delMvDouble(Double value){
        ((UUIDNamedObjectDMO) core).delMvDouble(value);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvDouble(){
        ((UUIDNamedObjectDMO) core).remMvDouble();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvStringSize(){
        return(((UUIDNamedObjectDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvStringIsEmpty(){
        if (((UUIDNamedObjectDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvStringHasValue(){
        if (((UUIDNamedObjectDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((UUIDNamedObjectDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addMvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addMvString(String value){
        ((UUIDNamedObjectDMO) core).addMvString(value);
    }

    /**
     * @param value A value compatible with String
     * @return true if the collection contains the mvString value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean mvStringContains(String value){
        return(((UUIDNamedObjectDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delMvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delMvString(String value){
        ((UUIDNamedObjectDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvString(){
        ((UUIDNamedObjectDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isSvBoolean(){
        return(((UUIDNamedObjectDMO) core).isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setSvBoolean(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setSvBoolean(Boolean value){
        ((UUIDNamedObjectDMO) core).setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remSvBoolean(){
        ((UUIDNamedObjectDMO) core).remSvBoolean();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Date getSvDate(){
        return(((UUIDNamedObjectDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setSvDate(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setSvDate(Date value){
        ((UUIDNamedObjectDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remSvDate(){
        ((UUIDNamedObjectDMO) core).remSvDate();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Double getSvDouble(){
        return(((UUIDNamedObjectDMO) core).getSvDouble());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setSvDouble(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvDouble(value);
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setSvDouble(Double value){
        ((UUIDNamedObjectDMO) core).setSvDouble(value);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remSvDouble(){
        ((UUIDNamedObjectDMO) core).remSvDouble();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSvString(){
        return(((UUIDNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setSvString(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setSvString(String value){
        ((UUIDNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remSvString(){
        ((UUIDNamedObjectDMO) core).remSvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public UUIDName getUuidName(){
        return(((UUIDNamedObjectDMO) core).getUuidName());
    }

    /**
     * Sets uuidName to the specified value.
     * @param value A value compatible with DmcTypeUUIDName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setUuidName(Object value) throws DmcValueException {
        ((UUIDNamedObjectDMO) core).setUuidName(value);
    }

    /**
     * Sets uuidName to the specified value.
     * @param value UUIDName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setUuidName(UUIDName value){
        ((UUIDNamedObjectDMO) core).setUuidName(value);
    }

    /**
     * Removes the uuidName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remUuidName(){
        ((UUIDNamedObjectDMO) core).remUuidName();
    }


}
