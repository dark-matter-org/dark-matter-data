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
import java.util.ArrayList;                                                     // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Date;                                                          // Primitive type - (BaseDMWGenerator.java:1040)
import java.util.HashMap;                                                       // To support getMVCopy() - (BaseDMWGenerator.java:1076)
import java.util.HashSet;                                                       // To support getMVCopy() - (BaseDMWGenerator.java:1090)
import java.util.Iterator;                                                      // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import java.util.TreeSet;                                                       // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import org.dmd.dmc.*;                                                           // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.IntegerToString;                                       // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.ClassDefinition;                                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.BooleanIterableDMW;                            // For multi-valued Boolean - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.DateIterableDMW;                               // For multi-valued Date - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.DoubleIterableDMW;                             // For multi-valued Double - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.FloatIterableDMW;                              // For multi-valued Float - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.IntegerIterableDMW;                            // For multi-valued Integer - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.IntegerToStringIterableDMW;                    // For multi-valued IntegerToString - (BaseDMWGenerator.java:2456)
import org.dmd.dms.generated.dmw.LongIterableDMW;                               // For multi-valued Long - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.dmw.StringIterableDMW;                             // For multi-valued String - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.generated.dmw.DmtTestEnumIterableDMW;                 // For multi-valued DmtTestEnum - (BaseDMWGenerator.java:1993)
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;           // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                               // Attribute hsDate from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;                          // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;         // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dmw.DmwWrapper;                                                  // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * The TestBasicObjectFixed class provides a test bed for all types of
 * basic\n attribute values.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class TestBasicObjectFixedDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public TestBasicObjectFixedDMW() {
        super(new TestBasicObjectFixedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicObjectFixed);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public TestBasicObjectFixedDMW(DmcTypeModifierMV mods) {
        super(new TestBasicObjectFixedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicObjectFixed);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public TestBasicObjectFixedDMW getModificationRecorder(){
        TestBasicObjectFixedDMW rc = new TestBasicObjectFixedDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public TestBasicObjectFixedDMW(TestBasicObjectFixedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicObjectFixed);
    }

    public TestBasicObjectFixedDMW cloneIt() {
        TestBasicObjectFixedDMW rc = new TestBasicObjectFixedDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TestBasicObjectFixedDMO getDMO() {
        return((TestBasicObjectFixedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TestBasicObjectFixedDMW(TestBasicObjectFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsDateSize(){
        return(((TestBasicObjectFixedDMO) core).getHsDateSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsDateIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsDateSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsDateHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsDateSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DateIterableDMW getHsDateIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((TestBasicObjectFixedDMO) core).getHsDate()));
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsDate(value);
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsDate(Date value){
        ((TestBasicObjectFixedDMO) core).addHsDate(value);
    }

    /**
     * Returns true if the collection contains the hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsDateContains(Date value){
        return(((TestBasicObjectFixedDMO) core).hsDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<Date> getHsDateCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(new HashSet<Date>());
        
        HashSet<Date> rc = new HashSet<Date>(attr.getMVSize());
        
        Iterator<Date> it = (Iterator<Date>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsDate(value);
    }

    /**
     * Deletes a hsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsDate(Date value){
        ((TestBasicObjectFixedDMO) core).delHsDate(value);
    }

    /**
     * Removes the hsDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsDate(){
        ((TestBasicObjectFixedDMO) core).remHsDate();
    }

    /**
     * @return The number of Double items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsDoubleSize(){
        return(((TestBasicObjectFixedDMO) core).getHsDoubleSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsDoubleIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsDoubleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsDoubleHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsDoubleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DoubleIterableDMW getHsDoubleIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(((TestBasicObjectFixedDMO) core).getHsDouble()));
    }

    /**
     * Adds another hsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsDouble(value);
    }

    /**
     * Adds another hsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsDouble(Double value){
        ((TestBasicObjectFixedDMO) core).addHsDouble(value);
    }

    /**
     * Returns true if the collection contains the hsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsDoubleContains(Double value){
        return(((TestBasicObjectFixedDMO) core).hsDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<Double> getHsDoubleCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsDouble);
        if (attr == null)
            return(new HashSet<Double>());
        
        HashSet<Double> rc = new HashSet<Double>(attr.getMVSize());
        
        Iterator<Double> it = (Iterator<Double>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsDouble(value);
    }

    /**
     * Deletes a hsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsDouble(Double value){
        ((TestBasicObjectFixedDMO) core).delHsDouble(value);
    }

    /**
     * Removes the hsDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsDouble(){
        ((TestBasicObjectFixedDMO) core).remHsDouble();
    }

    /**
     * @return The number of Float items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsFloatSize(){
        return(((TestBasicObjectFixedDMO) core).getHsFloatSize());
    }

    /**
     * @return true if there are no FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsFloatIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsFloatSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsFloatHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsFloatSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public FloatIterableDMW getHsFloatIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsFloat);
        if (attr == null)
            return(FloatIterableDMW.emptyList);
        
        return(new FloatIterableDMW(((TestBasicObjectFixedDMO) core).getHsFloat()));
    }

    /**
     * Adds another hsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsFloat(value);
    }

    /**
     * Adds another hsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsFloat(Float value){
        ((TestBasicObjectFixedDMO) core).addHsFloat(value);
    }

    /**
     * Returns true if the collection contains the hsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsFloatContains(Float value){
        return(((TestBasicObjectFixedDMO) core).hsFloatContains(value));
    }

    /**
     * @return A COPY of the collection of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<Float> getHsFloatCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsFloat);
        if (attr == null)
            return(new HashSet<Float>());
        
        HashSet<Float> rc = new HashSet<Float>(attr.getMVSize());
        
        Iterator<Float> it = (Iterator<Float>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsFloat(value);
    }

    /**
     * Deletes a hsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsFloat(Float value){
        ((TestBasicObjectFixedDMO) core).delHsFloat(value);
    }

    /**
     * Removes the hsFloat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsFloat(){
        ((TestBasicObjectFixedDMO) core).remHsFloat();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsIntegerSize(){
        return(((TestBasicObjectFixedDMO) core).getHsIntegerSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsIntegerIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsIntegerSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsIntegerHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsIntegerSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public IntegerIterableDMW getHsIntegerIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsInteger);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((TestBasicObjectFixedDMO) core).getHsInteger()));
    }

    /**
     * Adds another hsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsInteger(value);
    }

    /**
     * Adds another hsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).addHsInteger(value);
    }

    /**
     * Returns true if the collection contains the hsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsIntegerContains(Integer value){
        return(((TestBasicObjectFixedDMO) core).hsIntegerContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<Integer> getHsIntegerCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsInteger);
        if (attr == null)
            return(new HashSet<Integer>());
        
        HashSet<Integer> rc = new HashSet<Integer>(attr.getMVSize());
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsInteger(value);
    }

    /**
     * Deletes a hsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).delHsInteger(value);
    }

    /**
     * Removes the hsInteger attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsInteger(){
        ((TestBasicObjectFixedDMO) core).remHsInteger();
    }

    /**
     * @return The number of Long items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsLongSize(){
        return(((TestBasicObjectFixedDMO) core).getHsLongSize());
    }

    /**
     * @return true if there are no LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsLongIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsLongSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsLongHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsLongSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public LongIterableDMW getHsLongIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsLong);
        if (attr == null)
            return(LongIterableDMW.emptyList);
        
        return(new LongIterableDMW(((TestBasicObjectFixedDMO) core).getHsLong()));
    }

    /**
     * Adds another hsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsLong(value);
    }

    /**
     * Adds another hsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsLong(Long value){
        ((TestBasicObjectFixedDMO) core).addHsLong(value);
    }

    /**
     * Returns true if the collection contains the hsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsLongContains(Long value){
        return(((TestBasicObjectFixedDMO) core).hsLongContains(value));
    }

    /**
     * @return A COPY of the collection of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<Long> getHsLongCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsLong);
        if (attr == null)
            return(new HashSet<Long>());
        
        HashSet<Long> rc = new HashSet<Long>(attr.getMVSize());
        
        Iterator<Long> it = (Iterator<Long>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsLong(value);
    }

    /**
     * Deletes a hsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsLong(Long value){
        ((TestBasicObjectFixedDMO) core).delHsLong(value);
    }

    /**
     * Removes the hsLong attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsLong(){
        ((TestBasicObjectFixedDMO) core).remHsLong();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsStringSize(){
        return(((TestBasicObjectFixedDMO) core).getHsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsStringIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsStringHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public StringIterableDMW getHsStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicObjectFixedDMO) core).getHsString()));
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsString(value);
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsString(String value){
        ((TestBasicObjectFixedDMO) core).addHsString(value);
    }

    /**
     * Returns true if the collection contains the hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsStringContains(String value){
        return(((TestBasicObjectFixedDMO) core).hsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<String> getHsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsString(value);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsString(String value){
        ((TestBasicObjectFixedDMO) core).delHsString(value);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsString(){
        ((TestBasicObjectFixedDMO) core).remHsString();
    }

    /**
     * @return The number of DmtTestEnum items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsTestEnumSize(){
        return(((TestBasicObjectFixedDMO) core).getHsTestEnumSize());
    }

    /**
     * @return true if there are no DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsTestEnumIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getHsTestEnumSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsTestEnumHasValue(){
        if (((TestBasicObjectFixedDMO) core).getHsTestEnumSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DmtTestEnumIterableDMW getHsTestEnumIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(DmtTestEnumIterableDMW.emptyList);
        
        return(new DmtTestEnumIterableDMW(((TestBasicObjectFixedDMO) core).getHsTestEnum()));
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsTestEnum(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addHsTestEnum(value);
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsTestEnum(DmtTestEnum value){
        ((TestBasicObjectFixedDMO) core).addHsTestEnum(value);
    }

    /**
     * Returns true if the collection contains the hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsTestEnumContains(DmtTestEnum value){
        return(((TestBasicObjectFixedDMO) core).hsTestEnumContains(value));
    }

    /**
     * @return A COPY of the collection of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<DmtTestEnum> getHsTestEnumCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(new HashSet<DmtTestEnum>());
        
        HashSet<DmtTestEnum> rc = new HashSet<DmtTestEnum>(attr.getMVSize());
        
        Iterator<DmtTestEnum> it = (Iterator<DmtTestEnum>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsTestEnum(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delHsTestEnum(value);
    }

    /**
     * Deletes a hsTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsTestEnum(DmtTestEnum value){
        ((TestBasicObjectFixedDMO) core).delHsTestEnum(value);
    }

    /**
     * Removes the hsTestEnum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsTestEnum(){
        ((TestBasicObjectFixedDMO) core).remHsTestEnum();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2234)
    public int getIntToStringSize(){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2246)
    public boolean getIntToStringIsEmpty(){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2258)
    public boolean getIntToStringHasValue(){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2274)
    public IntegerToString getIntToString(Object key){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(null);
        
        return((IntegerToString)attr.getByKey(key));
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2461)
    public IntegerToStringIterableDMW getIntToStringIterable(){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(IntegerToStringIterableDMW.emptyList);
        
        return(new IntegerToStringIterableDMW(((TestBasicObjectFixedDMO) core).getIntToString()));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2488)
    public void addIntToString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addIntToString(value);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2497)
    public void addIntToString(IntegerToString value) {
        ((TestBasicObjectFixedDMO) core).addIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2509)
    public void delIntToString(Object value){
        ((TestBasicObjectFixedDMO) core).delIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2518)
    public void delIntToString(Integer value){
        ((TestBasicObjectFixedDMO) core).delIntToString(value);
    }

    /**
     * @return A COPY of the collection of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2548)
    @SuppressWarnings("unchecked")
    public HashMap<Integer,IntegerToString> getIntToStringCopy(){
        DmcAttribute<?> attr = ((TestBasicObjectFixedDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(new HashMap<Integer,IntegerToString>());
        
        HashMap<Integer,IntegerToString> rc = new HashMap<Integer,IntegerToString>(attr.getMVSize());
        
        Iterator<IntegerToString> it = (Iterator<IntegerToString>) attr.getMV();
        while(it.hasNext()){
            IntegerToString obj = it.next();
            rc.put((Integer)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2589)
    public void remIntToString(){
        ((TestBasicObjectFixedDMO) core).remIntToString();
    }

    /**
     * @return The number of Boolean items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvBooleanSize(){
        return(((TestBasicObjectFixedDMO) core).getMvBooleanSize());
    }

    /**
     * @return true if there are no BooleanDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvBooleanIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvBooleanSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any BooleanDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvBooleanHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvBooleanSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public BooleanIterableDMW getMvBooleanIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(BooleanIterableDMW.emptyList);
        
        return(new BooleanIterableDMW(((TestBasicObjectFixedDMO) core).getMvBoolean()));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvBoolean(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvBoolean(value);
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvBoolean(Boolean value){
        ((TestBasicObjectFixedDMO) core).addMvBoolean(value);
    }

    /**
     * Returns true if the collection contains the mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvBooleanContains(Boolean value){
        return(((TestBasicObjectFixedDMO) core).mvBooleanContains(value));
    }

    /**
     * @return A COPY of the collection of Boolean objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
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
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvBoolean(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvBoolean(value);
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvBoolean(Boolean value){
        ((TestBasicObjectFixedDMO) core).delMvBoolean(value);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvBoolean(){
        ((TestBasicObjectFixedDMO) core).remMvBoolean();
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvDateSize(){
        return(((TestBasicObjectFixedDMO) core).getMvDateSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvDateIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvDateSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvDateHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvDateSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DateIterableDMW getMvDateIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((TestBasicObjectFixedDMO) core).getMvDate()));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvDate(value);
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvDate(Date value){
        ((TestBasicObjectFixedDMO) core).addMvDate(value);
    }

    /**
     * Returns true if the collection contains the mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvDateContains(Date value){
        return(((TestBasicObjectFixedDMO) core).mvDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
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
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvDate(value);
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvDate(Date value){
        ((TestBasicObjectFixedDMO) core).delMvDate(value);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvDate(){
        ((TestBasicObjectFixedDMO) core).remMvDate();
    }

    /**
     * @return The number of Double items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvDoubleSize(){
        return(((TestBasicObjectFixedDMO) core).getMvDoubleSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvDoubleIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvDoubleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvDoubleHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvDoubleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DoubleIterableDMW getMvDoubleIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(((TestBasicObjectFixedDMO) core).getMvDouble()));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvDouble(value);
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvDouble(Double value){
        ((TestBasicObjectFixedDMO) core).addMvDouble(value);
    }

    /**
     * Returns true if the collection contains the mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvDoubleContains(Double value){
        return(((TestBasicObjectFixedDMO) core).mvDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
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
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvDouble(value);
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvDouble(Double value){
        ((TestBasicObjectFixedDMO) core).delMvDouble(value);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvDouble(){
        ((TestBasicObjectFixedDMO) core).remMvDouble();
    }

    /**
     * @return The number of Float items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvFloatSize(){
        return(((TestBasicObjectFixedDMO) core).getMvFloatSize());
    }

    /**
     * @return true if there are no FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvFloatIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvFloatSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvFloatHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvFloatSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public FloatIterableDMW getMvFloatIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvFloat);
        if (attr == null)
            return(FloatIterableDMW.emptyList);
        
        return(new FloatIterableDMW(((TestBasicObjectFixedDMO) core).getMvFloat()));
    }

    /**
     * Adds another mvFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvFloat(value);
    }

    /**
     * Adds another mvFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvFloat(Float value){
        ((TestBasicObjectFixedDMO) core).addMvFloat(value);
    }

    /**
     * Returns true if the collection contains the mvFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvFloatContains(Float value){
        return(((TestBasicObjectFixedDMO) core).mvFloatContains(value));
    }

    /**
     * @return A COPY of the collection of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<Float> getMvFloatCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvFloat);
        if (attr == null)
            return(new ArrayList<Float>());
        
        ArrayList<Float> rc = new ArrayList<Float>(attr.getMVSize());
        
        Iterator<Float> it = (Iterator<Float>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvFloat(value);
    }

    /**
     * Deletes a mvFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvFloat(Float value){
        ((TestBasicObjectFixedDMO) core).delMvFloat(value);
    }

    /**
     * Removes the mvFloat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvFloat(){
        ((TestBasicObjectFixedDMO) core).remMvFloat();
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvIdxUnnamedObjSize(){
        return(((TestBasicObjectFixedDMO) core).getMvIdxUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvIdxUnnamedObjIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvIdxUnnamedObjHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1821)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMW value){
        if (value == null)
            return(((TestBasicObjectFixedDMO) core).setNthMvIdxUnnamedObj(index, null));
        else
            return(((TestBasicObjectFixedDMO) core).setNthMvIdxUnnamedObj(index, ((TestBasicObjectFixedDMO)value.getDmcObject())));
    }

    /**
     * @return The TestBasicObjectFixedDMW object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1865)
    public TestBasicObjectFixedDMW getNthMvIdxUnnamedObj(int index){
        TestBasicObjectFixedDMO dmo = ((TestBasicObjectFixedDMO) core).getNthMvIdxUnnamedObj(index);
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvIdxUnnamedObj(){
        ((TestBasicObjectFixedDMO) core).remMvIdxUnnamedObj();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvIntegerSize(){
        return(((TestBasicObjectFixedDMO) core).getMvIntegerSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvIntegerIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvIntegerSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvIntegerHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvIntegerSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public IntegerIterableDMW getMvIntegerIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvInteger);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((TestBasicObjectFixedDMO) core).getMvInteger()));
    }

    /**
     * Adds another mvInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvInteger(value);
    }

    /**
     * Adds another mvInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).addMvInteger(value);
    }

    /**
     * Returns true if the collection contains the mvInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvIntegerContains(Integer value){
        return(((TestBasicObjectFixedDMO) core).mvIntegerContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getMvIntegerCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvInteger);
        if (attr == null)
            return(new ArrayList<Integer>());
        
        ArrayList<Integer> rc = new ArrayList<Integer>(attr.getMVSize());
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvInteger(value);
    }

    /**
     * Deletes a mvInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).delMvInteger(value);
    }

    /**
     * Removes the mvInteger attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvInteger(){
        ((TestBasicObjectFixedDMO) core).remMvInteger();
    }

    /**
     * @return The number of Long items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvLongSize(){
        return(((TestBasicObjectFixedDMO) core).getMvLongSize());
    }

    /**
     * @return true if there are no LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvLongIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvLongSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvLongHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvLongSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public LongIterableDMW getMvLongIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvLong);
        if (attr == null)
            return(LongIterableDMW.emptyList);
        
        return(new LongIterableDMW(((TestBasicObjectFixedDMO) core).getMvLong()));
    }

    /**
     * Adds another mvLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvLong(value);
    }

    /**
     * Adds another mvLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvLong(Long value){
        ((TestBasicObjectFixedDMO) core).addMvLong(value);
    }

    /**
     * Returns true if the collection contains the mvLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvLongContains(Long value){
        return(((TestBasicObjectFixedDMO) core).mvLongContains(value));
    }

    /**
     * @return A COPY of the collection of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<Long> getMvLongCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvLong);
        if (attr == null)
            return(new ArrayList<Long>());
        
        ArrayList<Long> rc = new ArrayList<Long>(attr.getMVSize());
        
        Iterator<Long> it = (Iterator<Long>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvLong(value);
    }

    /**
     * Deletes a mvLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvLong(Long value){
        ((TestBasicObjectFixedDMO) core).delMvLong(value);
    }

    /**
     * Removes the mvLong attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvLong(){
        ((TestBasicObjectFixedDMO) core).remMvLong();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvStringSize(){
        return(((TestBasicObjectFixedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvStringIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvStringHasValue(){
        if (((TestBasicObjectFixedDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicObjectFixedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvString(String value){
        ((TestBasicObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvStringContains(String value){
        return(((TestBasicObjectFixedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
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
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delMvString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvString(String value){
        ((TestBasicObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvString(){
        ((TestBasicObjectFixedDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isSvBoolean(){
        return(((TestBasicObjectFixedDMO) core).isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvBoolean(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvBoolean(Boolean value){
        ((TestBasicObjectFixedDMO) core).setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvBoolean(){
        ((TestBasicObjectFixedDMO) core).remSvBoolean();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Date getSvDate(){
        return(((TestBasicObjectFixedDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvDate(Date value){
        ((TestBasicObjectFixedDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvDate(){
        ((TestBasicObjectFixedDMO) core).remSvDate();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Double getSvDouble(){
        return(((TestBasicObjectFixedDMO) core).getSvDouble());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDouble
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvDouble(value);
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvDouble(Double value){
        ((TestBasicObjectFixedDMO) core).setSvDouble(value);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvDouble(){
        ((TestBasicObjectFixedDMO) core).remSvDouble();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Float getSvFloat(){
        return(((TestBasicObjectFixedDMO) core).getSvFloat());
    }

    /**
     * Sets svFloat to the specified value.
     * @param value A value compatible with DmcTypeFloat
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvFloat(value);
    }

    /**
     * Sets svFloat to the specified value.
     * @param value Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvFloat(Float value){
        ((TestBasicObjectFixedDMO) core).setSvFloat(value);
    }

    /**
     * Removes the svFloat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvFloat(){
        ((TestBasicObjectFixedDMO) core).remSvFloat();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Integer getSvInteger(){
        return(((TestBasicObjectFixedDMO) core).getSvInteger());
    }

    /**
     * Sets svInteger to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvInteger(value);
    }

    /**
     * Sets svInteger to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).setSvInteger(value);
    }

    /**
     * Removes the svInteger attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvInteger(){
        ((TestBasicObjectFixedDMO) core).remSvInteger();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Long getSvLong(){
        return(((TestBasicObjectFixedDMO) core).getSvLong());
    }

    /**
     * Sets svLong to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvLong(value);
    }

    /**
     * Sets svLong to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvLong(Long value){
        ((TestBasicObjectFixedDMO) core).setSvLong(value);
    }

    /**
     * Removes the svLong attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvLong(){
        ((TestBasicObjectFixedDMO) core).remSvLong();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSvString(){
        return(((TestBasicObjectFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvString(String value){
        ((TestBasicObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvString(){
        ((TestBasicObjectFixedDMO) core).remSvString();
    }

    /**
     * @return A TestBasicNamedObjectFixedDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public TestBasicNamedObjectFixedDMW getSvTestBasicNamedObjectFixed(){
        TestBasicNamedObjectFixedREF ref = ((TestBasicObjectFixedDMO) core).getSvTestBasicNamedObjectFixed();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((TestBasicNamedObjectFixedDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the svTestBasicNamedObjectFixed to the specified value.
     * @param value A value compatible with TestBasicNamedObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setSvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value) {
        ((TestBasicObjectFixedDMO) core).setSvTestBasicNamedObjectFixed(value.getDMO());
    }

    /**
     * Sets the svTestBasicNamedObjectFixed to the specified value.
     * @param value A value compatible with TestBasicNamedObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setSvTestBasicNamedObjectFixed(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setSvTestBasicNamedObjectFixed(value);
    }

    /**
     * Removes the svTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvTestBasicNamedObjectFixed(){
        ((TestBasicObjectFixedDMO) core).remSvTestBasicNamedObjectFixed();
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsDateSize(){
        return(((TestBasicObjectFixedDMO) core).getTsDateSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsDateIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsDateSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsDateHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsDateSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DateIterableDMW getTsDateIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((TestBasicObjectFixedDMO) core).getTsDate()));
    }

    /**
     * Adds another tsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsDate(value);
    }

    /**
     * Adds another tsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsDate(Date value){
        ((TestBasicObjectFixedDMO) core).addTsDate(value);
    }

    /**
     * Returns true if the collection contains the tsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsDateContains(Date value){
        return(((TestBasicObjectFixedDMO) core).tsDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<Date> getTsDateCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsDate);
        if (attr == null)
            return(new TreeSet<Date>());
        
        TreeSet<Date> rc = new TreeSet<Date>();
        
        Iterator<Date> it = (Iterator<Date>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsDate(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsDate(value);
    }

    /**
     * Deletes a tsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsDate(Date value){
        ((TestBasicObjectFixedDMO) core).delTsDate(value);
    }

    /**
     * Removes the tsDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsDate(){
        ((TestBasicObjectFixedDMO) core).remTsDate();
    }

    /**
     * @return The number of Double items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsDoubleSize(){
        return(((TestBasicObjectFixedDMO) core).getTsDoubleSize());
    }

    /**
     * @return true if there are no DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsDoubleIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsDoubleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DoubleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsDoubleHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsDoubleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public DoubleIterableDMW getTsDoubleIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsDouble);
        if (attr == null)
            return(DoubleIterableDMW.emptyList);
        
        return(new DoubleIterableDMW(((TestBasicObjectFixedDMO) core).getTsDouble()));
    }

    /**
     * Adds another tsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsDouble(value);
    }

    /**
     * Adds another tsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsDouble(Double value){
        ((TestBasicObjectFixedDMO) core).addTsDouble(value);
    }

    /**
     * Returns true if the collection contains the tsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsDoubleContains(Double value){
        return(((TestBasicObjectFixedDMO) core).tsDoubleContains(value));
    }

    /**
     * @return A COPY of the collection of Double objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<Double> getTsDoubleCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsDouble);
        if (attr == null)
            return(new TreeSet<Double>());
        
        TreeSet<Double> rc = new TreeSet<Double>();
        
        Iterator<Double> it = (Iterator<Double>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsDouble(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsDouble(value);
    }

    /**
     * Deletes a tsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsDouble(Double value){
        ((TestBasicObjectFixedDMO) core).delTsDouble(value);
    }

    /**
     * Removes the tsDouble attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsDouble(){
        ((TestBasicObjectFixedDMO) core).remTsDouble();
    }

    /**
     * @return The number of Float items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsFloatSize(){
        return(((TestBasicObjectFixedDMO) core).getTsFloatSize());
    }

    /**
     * @return true if there are no FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsFloatIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsFloatSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any FloatDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsFloatHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsFloatSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public FloatIterableDMW getTsFloatIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsFloat);
        if (attr == null)
            return(FloatIterableDMW.emptyList);
        
        return(new FloatIterableDMW(((TestBasicObjectFixedDMO) core).getTsFloat()));
    }

    /**
     * Adds another tsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsFloat(value);
    }

    /**
     * Adds another tsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsFloat(Float value){
        ((TestBasicObjectFixedDMO) core).addTsFloat(value);
    }

    /**
     * Returns true if the collection contains the tsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsFloatContains(Float value){
        return(((TestBasicObjectFixedDMO) core).tsFloatContains(value));
    }

    /**
     * @return A COPY of the collection of Float objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<Float> getTsFloatCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsFloat);
        if (attr == null)
            return(new TreeSet<Float>());
        
        TreeSet<Float> rc = new TreeSet<Float>();
        
        Iterator<Float> it = (Iterator<Float>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsFloat(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsFloat(value);
    }

    /**
     * Deletes a tsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsFloat(Float value){
        ((TestBasicObjectFixedDMO) core).delTsFloat(value);
    }

    /**
     * Removes the tsFloat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsFloat(){
        ((TestBasicObjectFixedDMO) core).remTsFloat();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsIntegerSize(){
        return(((TestBasicObjectFixedDMO) core).getTsIntegerSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsIntegerIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsIntegerSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsIntegerHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsIntegerSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public IntegerIterableDMW getTsIntegerIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsInteger);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((TestBasicObjectFixedDMO) core).getTsInteger()));
    }

    /**
     * Adds another tsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsInteger(value);
    }

    /**
     * Adds another tsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).addTsInteger(value);
    }

    /**
     * Returns true if the collection contains the tsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsIntegerContains(Integer value){
        return(((TestBasicObjectFixedDMO) core).tsIntegerContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<Integer> getTsIntegerCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsInteger);
        if (attr == null)
            return(new TreeSet<Integer>());
        
        TreeSet<Integer> rc = new TreeSet<Integer>();
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsInteger(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsInteger(value);
    }

    /**
     * Deletes a tsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsInteger(Integer value){
        ((TestBasicObjectFixedDMO) core).delTsInteger(value);
    }

    /**
     * Removes the tsInteger attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsInteger(){
        ((TestBasicObjectFixedDMO) core).remTsInteger();
    }

    /**
     * @return The number of Long items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsLongSize(){
        return(((TestBasicObjectFixedDMO) core).getTsLongSize());
    }

    /**
     * @return true if there are no LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsLongIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsLongSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any LongDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsLongHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsLongSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public LongIterableDMW getTsLongIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsLong);
        if (attr == null)
            return(LongIterableDMW.emptyList);
        
        return(new LongIterableDMW(((TestBasicObjectFixedDMO) core).getTsLong()));
    }

    /**
     * Adds another tsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsLong(value);
    }

    /**
     * Adds another tsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsLong(Long value){
        ((TestBasicObjectFixedDMO) core).addTsLong(value);
    }

    /**
     * Returns true if the collection contains the tsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsLongContains(Long value){
        return(((TestBasicObjectFixedDMO) core).tsLongContains(value));
    }

    /**
     * @return A COPY of the collection of Long objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<Long> getTsLongCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsLong);
        if (attr == null)
            return(new TreeSet<Long>());
        
        TreeSet<Long> rc = new TreeSet<Long>();
        
        Iterator<Long> it = (Iterator<Long>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsLong(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsLong(value);
    }

    /**
     * Deletes a tsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsLong(Long value){
        ((TestBasicObjectFixedDMO) core).delTsLong(value);
    }

    /**
     * Removes the tsLong attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsLong(){
        ((TestBasicObjectFixedDMO) core).remTsLong();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getTsStringSize(){
        return(((TestBasicObjectFixedDMO) core).getTsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getTsStringIsEmpty(){
        if (((TestBasicObjectFixedDMO) core).getTsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getTsStringHasValue(){
        if (((TestBasicObjectFixedDMO) core).getTsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public StringIterableDMW getTsStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicObjectFixedDMO) core).getTsString()));
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addTsString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).addTsString(value);
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addTsString(String value){
        ((TestBasicObjectFixedDMO) core).addTsString(value);
    }

    /**
     * Returns true if the collection contains the tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean tsStringContains(String value){
        return(((TestBasicObjectFixedDMO) core).tsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getTsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsString);
        if (attr == null)
            return(new TreeSet<String>());
        
        TreeSet<String> rc = new TreeSet<String>();
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delTsString(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).delTsString(value);
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delTsString(String value){
        ((TestBasicObjectFixedDMO) core).delTsString(value);
    }

    /**
     * Removes the tsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remTsString(){
        ((TestBasicObjectFixedDMO) core).remTsString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getUserName(){
        return(((TestBasicObjectFixedDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUserName(Object value) throws DmcValueException {
        ((TestBasicObjectFixedDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUserName(String value){
        ((TestBasicObjectFixedDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUserName(){
        ((TestBasicObjectFixedDMO) core).remUserName();
    }


}
