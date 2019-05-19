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
package org.dmd.templates.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.definitions.DmcDefinitionIF;                            // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                   // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.templates.server.extended.ContainedElement;                 // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.templates.server.extended.Section;                          // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;         // For multi-valued Contains - (BaseDMWGenerator.java:1993)
import org.dmd.templates.server.generated.dmw.ValueIterableDMW;            // For multi-valued Value - (BaseDMWGenerator.java:1993)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                  // Attribute contains from the dmtdl schema - (BaseDMWGenerator.java:910)
import org.dmd.templates.shared.generated.dmo.SectionDMO;                  // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.templates.shared.generated.types.Contains;                  // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.templates.shared.generated.types.SectionREF;                // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.templates.shared.generated.types.TdlModuleREF;              // Required to access defined in module name - (DMWGenerator.java:181)
import org.dmd.templates.shared.generated.types.Value;                     // Primitive type - (BaseDMWGenerator.java:1040)



/**
 * A Section represents part of a textual artifact that you want to format.\n
 * The artifact could be an XHTML document, an XML document, a piece of code,
 * a form\n letter - whatever. The content of a Section may start with
 * another Section or static\n piece of text and, likewise, end with a
 * Section or static piece of text.\n <p/>\n Sections can also contain other
 * (sub) Sections. \n <p/>\n Sections can also have named values that can be
 * inserted into Templates. By specifying\n values, you define a set of
 * values that can be accessed and embedded within the associated\n
 * Template.\n <p/>\n When a Section's format() method is called, it will
 * dump the contents in the following order:\n <ul>\n <li> any starts with
 * material </li>\n <li> the formatted contents of the associated Template
 * </li>\n <li> the formatted contents of any contained Sections </li>\n <li>
 * any ends with material </li>\n </ul>
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class SectionDMW extends ContainedElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public SectionDMW() {
        super(new SectionDMO(), org.dmd.templates.server.generated.DmtdlSchemaAG._Section);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public SectionDMW(DmcTypeModifierMV mods) {
        super(new SectionDMO(mods), org.dmd.templates.server.generated.DmtdlSchemaAG._Section);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public Section getModificationRecorder(){
        Section rc = new Section();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public SectionDMW(SectionDMO obj) {
        super(obj, org.dmd.templates.server.generated.DmtdlSchemaAG._Section);
    }

    public Section cloneIt() {
        Section rc = new Section();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SectionDMO getDMO() {
        return((SectionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected SectionDMW(SectionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((SectionDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SectionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SectionDMW){
            return( getObjectName().equals( ((SectionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of Contains items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getContainsSize(){
        return(((SectionDMO) core).getContainsSize());
    }

    /**
     * @return true if there are no ContainsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getContainsIsEmpty(){
        if (((SectionDMO) core).getContainsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ContainsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getContainsHasValue(){
        if (((SectionDMO) core).getContainsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Contains objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public ContainsIterableDMW getContainsIterable(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(ContainsIterableDMW.emptyList);
        
        return(new ContainsIterableDMW(((SectionDMO) core).getContains()));
    }

    /**
     * Adds another contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addContains(Object value) throws DmcValueException {
        ((SectionDMO) core).addContains(value);
    }

    /**
     * Adds another contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addContains(Contains value){
        ((SectionDMO) core).addContains(value);
    }

    /**
     * Returns true if the collection contains the contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean containsContains(Contains value){
        return(((SectionDMO) core).containsContains(value));
    }

    /**
     * @return A COPY of the collection of Contains objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<Contains> getContainsCopy(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(new ArrayList<Contains>());
        
        ArrayList<Contains> rc = new ArrayList<Contains>(attr.getMVSize());
        
        Iterator<Contains> it = (Iterator<Contains>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a contains value.
     * @param value The Contains to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delContains(Object value) throws DmcValueException {
        ((SectionDMO) core).delContains(value);
    }

    /**
     * Deletes a contains value.
     * @param value The Contains to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delContains(Contains value){
        ((SectionDMO) core).delContains(value);
    }

    /**
     * Removes the contains attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remContains(){
        ((SectionDMO) core).remContains();
    }

    /**
     * @return A Section object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public Section getEndsWith(){
        SectionREF ref = ((SectionDMO) core).getEndsWith();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Section)ref.getObject().getContainer());
    }

    /**
     * Sets the endsWith to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setEndsWith(Section value) {
        ((SectionDMO) core).setEndsWith(value.getDMO());
    }

    /**
     * Sets the endsWith to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setEndsWith(Object value) throws DmcValueException {
        ((SectionDMO) core).setEndsWith(value);
    }

    /**
     * Removes the endsWith attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remEndsWith(){
        ((SectionDMO) core).remEndsWith();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getEndsWithText(){
        return(((SectionDMO) core).getEndsWithText());
    }

    /**
     * Sets endsWithText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setEndsWithText(Object value) throws DmcValueException {
        ((SectionDMO) core).setEndsWithText(value);
    }

    /**
     * Sets endsWithText to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setEndsWithText(String value){
        ((SectionDMO) core).setEndsWithText(value);
    }

    /**
     * Removes the endsWithText attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remEndsWithText(){
        ((SectionDMO) core).remEndsWithText();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isHasTemplate(){
        return(((SectionDMO) core).isHasTemplate());
    }

    /**
     * Sets hasTemplate to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setHasTemplate(Object value) throws DmcValueException {
        ((SectionDMO) core).setHasTemplate(value);
    }

    /**
     * Sets hasTemplate to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setHasTemplate(Boolean value){
        ((SectionDMO) core).setHasTemplate(value);
    }

    /**
     * Removes the hasTemplate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remHasTemplate(){
        ((SectionDMO) core).remHasTemplate();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((SectionDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((SectionDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((SectionDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((SectionDMO) core).remName();
    }

    /**
     * @return A Section object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public Section getStartsWith(){
        SectionREF ref = ((SectionDMO) core).getStartsWith();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Section)ref.getObject().getContainer());
    }

    /**
     * Sets the startsWith to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setStartsWith(Section value) {
        ((SectionDMO) core).setStartsWith(value.getDMO());
    }

    /**
     * Sets the startsWith to the specified value.
     * @param value A value compatible with SectionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setStartsWith(Object value) throws DmcValueException {
        ((SectionDMO) core).setStartsWith(value);
    }

    /**
     * Removes the startsWith attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remStartsWith(){
        ((SectionDMO) core).remStartsWith();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getStartsWithText(){
        return(((SectionDMO) core).getStartsWithText());
    }

    /**
     * Sets startsWithText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setStartsWithText(Object value) throws DmcValueException {
        ((SectionDMO) core).setStartsWithText(value);
    }

    /**
     * Sets startsWithText to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setStartsWithText(String value){
        ((SectionDMO) core).setStartsWithText(value);
    }

    /**
     * Removes the startsWithText attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remStartsWithText(){
        ((SectionDMO) core).remStartsWithText();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isUsesTemplate(){
        return(((SectionDMO) core).isUsesTemplate());
    }

    /**
     * Sets usesTemplate to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUsesTemplate(Object value) throws DmcValueException {
        ((SectionDMO) core).setUsesTemplate(value);
    }

    /**
     * Sets usesTemplate to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUsesTemplate(Boolean value){
        ((SectionDMO) core).setUsesTemplate(value);
    }

    /**
     * Removes the usesTemplate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUsesTemplate(){
        ((SectionDMO) core).remUsesTemplate();
    }

    /**
     * @return The number of Value items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getValueSize(){
        return(((SectionDMO) core).getValueSize());
    }

    /**
     * @return true if there are no ValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getValueIsEmpty(){
        if (((SectionDMO) core).getValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getValueHasValue(){
        if (((SectionDMO) core).getValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Value objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public ValueIterableDMW getValueIterable(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__value);
        if (attr == null)
            return(ValueIterableDMW.emptyList);
        
        return(new ValueIterableDMW(((SectionDMO) core).getValue()));
    }

    /**
     * Adds another value value.
     * @param value A value compatible with Value
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addValue(Object value) throws DmcValueException {
        ((SectionDMO) core).addValue(value);
    }

    /**
     * Adds another value value.
     * @param value A value compatible with Value
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addValue(Value value){
        ((SectionDMO) core).addValue(value);
    }

    /**
     * Returns true if the collection contains the value value.
     * @param value A value compatible with Value
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean valueContains(Value value){
        return(((SectionDMO) core).valueContains(value));
    }

    /**
     * @return A COPY of the collection of Value objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<Value> getValueCopy(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__value);
        if (attr == null)
            return(new ArrayList<Value>());
        
        ArrayList<Value> rc = new ArrayList<Value>(attr.getMVSize());
        
        Iterator<Value> it = (Iterator<Value>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a value value.
     * @param value The Value to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delValue(Object value) throws DmcValueException {
        ((SectionDMO) core).delValue(value);
    }

    /**
     * Deletes a value value.
     * @param value The Value to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delValue(Value value){
        ((SectionDMO) core).delValue(value);
    }

    /**
     * Removes the value attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remValue(){
        ((SectionDMO) core).remValue();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:234)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        TdlModuleREF ref = ((SectionDMO) core).getDefinedInTdlModule();
        return(ref.getName().getNameString());
    }


}
