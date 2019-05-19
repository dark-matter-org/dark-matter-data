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
import java.util.ArrayList;                                                         // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Iterator;                                                          // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                                               // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DefinitionName;                                            // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                 // For multi-valued String - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.extended.subpack.multi.TestDerivedDiffSubpackage;         // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmt.server.generated.dmw.TestOneLevelSubpackageDMW;                  // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                   // Attribute mvString from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;               // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)



/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:547)
public class TestDerivedDiffSubpackageDMW extends TestOneLevelSubpackageDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public TestDerivedDiffSubpackageDMW() {
        super(new TestDerivedDiffSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public TestDerivedDiffSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestDerivedDiffSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public TestDerivedDiffSubpackage getModificationRecorder(){
        TestDerivedDiffSubpackage rc = new TestDerivedDiffSubpackage();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    public TestDerivedDiffSubpackage cloneIt() {
        TestDerivedDiffSubpackage rc = new TestDerivedDiffSubpackage();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TestDerivedDiffSubpackageDMO getDMO() {
        return((TestDerivedDiffSubpackageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestDerivedDiffSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestDerivedDiffSubpackageDMW){
            return( getObjectName().equals( ((TestDerivedDiffSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvStringSize(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvStringHasValue(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
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
        
        return(new StringIterableDMW(((TestDerivedDiffSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvStringContains(String value){
        return(((TestDerivedDiffSubpackageDMO) core).mvStringContains(value));
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
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvString(){
        ((TestDerivedDiffSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((TestDerivedDiffSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvString(){
        ((TestDerivedDiffSubpackageDMO) core).remSvString();
    }


}
