//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                                           // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                                            // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.types.DefinitionName;                                              // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.ClassDefinition;                                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                   // For multi-valued String - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedIterableDMW;         // For multi-valued TestBasicNamedObjectFixed - (BaseDMWGenerator.java:1633)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                      // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                     // Attribute mvString from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                      // For setNth of TestBasicObjectFixed - (BaseDMWGenerator.java:1838)
import org.dmd.dmw.DmwNamedObjectWrapper;                                             // Named object wrapper - (BaseDMWGenerator.java:1166)



/**
 * The TestBasicNamedObjectFixed class provides a test bed for a named object.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class TestBasicNamedObjectFixedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public TestBasicNamedObjectFixedDMW() {
        super(new TestBasicNamedObjectFixedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public TestBasicNamedObjectFixedDMW(DmcTypeModifierMV mods) {
        super(new TestBasicNamedObjectFixedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public TestBasicNamedObjectFixedDMW getModificationRecorder(){
        TestBasicNamedObjectFixedDMW rc = new TestBasicNamedObjectFixedDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public TestBasicNamedObjectFixedDMW(TestBasicNamedObjectFixedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMW cloneIt() {
        TestBasicNamedObjectFixedDMW rc = new TestBasicNamedObjectFixedDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TestBasicNamedObjectFixedDMO getDMO() {
        return((TestBasicNamedObjectFixedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected TestBasicNamedObjectFixedDMW(TestBasicNamedObjectFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public DefinitionName getObjectName(){
        return(((TestBasicNamedObjectFixedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestBasicNamedObjectFixedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectFixedDMW){
            return( getObjectName().equals( ((TestBasicNamedObjectFixedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getMvIdxUnnamedObjSize(){
        return(((TestBasicNamedObjectFixedDMO) core).getMvIdxUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getMvIdxUnnamedObjIsEmpty(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getMvIdxUnnamedObjHasValue(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1855)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMW value){
        if (value == null)
            return(((TestBasicNamedObjectFixedDMO) core).setNthMvIdxUnnamedObj(index, null));
        else
            return(((TestBasicNamedObjectFixedDMO) core).setNthMvIdxUnnamedObj(index, ((TestBasicObjectFixedDMO)value.getDmcObject())));
    }

    /**
     * @return The TestBasicObjectFixedDMW object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1899)
    public TestBasicObjectFixedDMW getNthMvIdxUnnamedObj(int index){
        TestBasicObjectFixedDMO dmo = ((TestBasicNamedObjectFixedDMO) core).getNthMvIdxUnnamedObj(index);
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remMvIdxUnnamedObj(){
        ((TestBasicNamedObjectFixedDMO) core).remMvIdxUnnamedObj();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getMvStringSize(){
        return(((TestBasicNamedObjectFixedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getMvStringIsEmpty(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getMvStringHasValue(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicNamedObjectFixedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addMvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean mvStringContains(String value){
        return(((TestBasicNamedObjectFixedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delMvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remMvString(){
        ((TestBasicNamedObjectFixedDMO) core).remMvString();
    }

    /**
     * @return The number of TestBasicNamedObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getMvTestBasicNamedObjectFixedSize(){
        return(((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize());
    }

    /**
     * @return true if there are no TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getMvTestBasicNamedObjectFixedIsEmpty(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getMvTestBasicNamedObjectFixedHasValue(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public TestBasicNamedObjectFixedIterableDMW getMvTestBasicNamedObjectFixedIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(TestBasicNamedObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicNamedObjectFixedIterableDMW(((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixed()));
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).addMvTestBasicNamedObjectFixed(((TestBasicNamedObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        ((TestBasicNamedObjectFixedDMO) core).delMvTestBasicNamedObjectFixed(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TestBasicNamedObjectFixed objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public ArrayList<TestBasicNamedObjectFixedDMW> getMvTestBasicNamedObjectFixedCopy(){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(new ArrayList<TestBasicNamedObjectFixedDMW>());
        
        ArrayList<TestBasicNamedObjectFixedDMW> rc = new ArrayList<TestBasicNamedObjectFixedDMW>(attr.getMVSize());
        
        TestBasicNamedObjectFixedIterableDMW it = getMvTestBasicNamedObjectFixedIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mvTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remMvTestBasicNamedObjectFixed(){
        ((TestBasicNamedObjectFixedDMO) core).remMvTestBasicNamedObjectFixed();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public DefinitionName getName(){
        return(((TestBasicNamedObjectFixedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setName(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setName(DefinitionName value){
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remName(){
        ((TestBasicNamedObjectFixedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getSvString(){
        return(((TestBasicNamedObjectFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setSvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setSvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remSvString(){
        ((TestBasicNamedObjectFixedDMO) core).remSvString();
    }


}
