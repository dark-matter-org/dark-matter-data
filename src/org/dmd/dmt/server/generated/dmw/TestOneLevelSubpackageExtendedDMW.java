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
import java.util.ArrayList;                                                        // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Iterator;                                                         // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DefinitionName;                                           // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                // For multi-valued String - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.extended.subpack.TestOneLevelSubpackageExtended;         // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                  // Attribute mvString from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmw.DmwNamedObjectWrapper;                                          // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class TestOneLevelSubpackageExtendedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public TestOneLevelSubpackageExtendedDMW() {
        super(new TestOneLevelSubpackageExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public TestOneLevelSubpackageExtendedDMW(DmcTypeModifierMV mods) {
        super(new TestOneLevelSubpackageExtendedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public TestOneLevelSubpackageExtended getModificationRecorder(){
        TestOneLevelSubpackageExtended rc = new TestOneLevelSubpackageExtended();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvStringSize(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvStringIsEmpty(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvStringHasValue(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
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
        
        return(new StringIterableDMW(((TestOneLevelSubpackageExtendedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean mvStringContains(String value){
        return(((TestOneLevelSubpackageExtendedDMO) core).mvStringContains(value));
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
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((TestOneLevelSubpackageExtendedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSvString(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remSvString();
    }


}
