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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import java.util.ArrayList;                                                        // To support getMVCopy() - (BaseDMWGenerator.java:1073)
import java.util.Iterator;                                                         // Support copy of MV objects - (BaseDMWGenerator.java:2132)
import org.dmd.dmc.*;                                                              // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.types.DefinitionName;                                           // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dms.ClassDefinition;                                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                        // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                // For multi-valued String - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmt.server.extended.subpack.TestOneLevelSubpackageExtended;         // Required for getModificationRecorder() - (BaseDMWGenerator.java:972)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                  // Attribute mvString from the dmt schema - (BaseDMWGenerator.java:794)
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dmw.DmwNamedObjectWrapper;                                          // Named object wrapper - (BaseDMWGenerator.java:1134)



/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class TestOneLevelSubpackageExtendedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public TestOneLevelSubpackageExtendedDMW() {
        super(new TestOneLevelSubpackageExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public TestOneLevelSubpackageExtendedDMW(DmcTypeModifierMV mods) {
        super(new TestOneLevelSubpackageExtendedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:518)
    public TestOneLevelSubpackageExtended getModificationRecorder(){
        TestOneLevelSubpackageExtended rc = new TestOneLevelSubpackageExtended();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    public TestOneLevelSubpackageExtended cloneIt() {
        TestOneLevelSubpackageExtended rc = new TestOneLevelSubpackageExtended();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TestOneLevelSubpackageExtendedDMO getDMO() {
        return((TestOneLevelSubpackageExtendedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public DefinitionName getObjectName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestOneLevelSubpackageExtendedDMW){
            return( getObjectName().equals( ((TestOneLevelSubpackageExtendedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1563)
    public int getMvStringSize(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1571)
    public boolean getMvStringIsEmpty(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1581)
    public boolean getMvStringHasValue(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
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
        
        return(new StringIterableDMW(((TestOneLevelSubpackageExtendedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2025)
    public void addMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2035)
    public void addMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2092)
    public boolean mvStringContains(String value){
        return(((TestOneLevelSubpackageExtendedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2136)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    public void delMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2172)
    public void delMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2184)
    public void remMvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public DefinitionName getName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setName(DefinitionName value){
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remName(){
        ((TestOneLevelSubpackageExtendedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getSvString(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setSvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setSvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remSvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remSvString();
    }


}
