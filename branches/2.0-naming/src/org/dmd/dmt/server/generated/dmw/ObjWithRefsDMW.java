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
import java.util.ArrayList;                                                      // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Date;                                                           // Primitive type - (BaseDMWGenerator.java:1069)
import java.util.HashMap;                                                        // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.HashSet;                                                        // To support getMVCopy() - (BaseDMWGenerator.java:1119)
import java.util.Iterator;                                                       // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import java.util.TreeMap;                                                        // To support getMVCopy() - (BaseDMWGenerator.java:1109)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.DmcAttributeInfo;                                             // Alternative type for AttributeID values - (BaseDMWGenerator.java:1077)
import org.dmd.dmc.DmcObjectName;                                                // Alternative type for NameContainer values - (BaseDMWGenerator.java:1077)
import org.dmd.dmc.types.AttributeID;                                            // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.types.DefinitionName;                                         // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dmc.types.IntegerToString;                                        // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.types.NameContainer;                                          // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.types.StringName;                                             // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.dmw.AttributeIDIterableDMW;                         // For multi-valued AttributeID - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.dmw.DateIterableDMW;                                // For multi-valued Date - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.dmw.IntegerToStringIterableDMW;                     // For multi-valued IntegerToString - (BaseDMWGenerator.java:2485)
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;                       // For multi-valued NameContainer - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // For multi-valued String - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.dmw.StringNameIterableDMW;                          // For multi-valued StringName - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmt.server.extended.ClientCountFilter;                            // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dmt.server.extended.ObjWithRefs;                                  // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmt.server.generated.dmw.BaseObjDMW;                              // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmt.server.generated.dmw.DmtTestEnumIterableDMW;                  // For multi-valued DmtTestEnum - (BaseDMWGenerator.java:2022)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;                  // For multi-valued ObjWithRefs - (BaseDMWGenerator.java:1628)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;                 // For multi-valued SomeRelation - (BaseDMWGenerator.java:1628)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGenerator.java:1628)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                    // For setNth of ClientCountFilter - (BaseDMWGenerator.java:1833)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute attrIDs from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                          // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // For setNth of TestBasicObjectFixed - (BaseDMWGenerator.java:1833)
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;                           // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                        // To support getMVCopy() for REFs ObjWithRefs-HASHMAPPED - (BaseDMWGenerator.java:1045)
import org.dmd.dmt.shared.generated.types.SomeRelation;                          // For addition of MV SomeRelation - (BaseDMWGenerator.java:1672)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class ObjWithRefsDMW extends BaseObjDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ObjWithRefsDMW() {
        super(new ObjWithRefsDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ObjWithRefsDMW(DmcTypeModifierMV mods) {
        super(new ObjWithRefsDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public ObjWithRefs getModificationRecorder(){
        ObjWithRefs rc = new ObjWithRefs();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ObjWithRefsDMW(ObjWithRefsDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefs);
    }

    public ObjWithRefs cloneIt() {
        ObjWithRefs rc = new ObjWithRefs();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ObjWithRefsDMO getDMO() {
        return((ObjWithRefsDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ObjWithRefsDMW(ObjWithRefsDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
    public DefinitionName getObjectName(){
        return(((ObjWithRefsDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ObjWithRefsDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDMW){
            return( getObjectName().equals( ((ObjWithRefsDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getAnotherSVString(){
        return(((ObjWithRefsDMO) core).getAnotherSVString());
    }

    /**
     * Sets anotherSVString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setAnotherSVString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setAnotherSVString(value);
    }

    /**
     * Sets anotherSVString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setAnotherSVString(String value){
        ((ObjWithRefsDMO) core).setAnotherSVString(value);
    }

    /**
     * Removes the anotherSVString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remAnotherSVString(){
        ((ObjWithRefsDMO) core).remAnotherSVString();
    }

    /**
     * @return The number of AttributeID items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getAttrIDsSize(){
        return(((ObjWithRefsDMO) core).getAttrIDsSize());
    }

    /**
     * @return true if there are no AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getAttrIDsIsEmpty(){
        if (((ObjWithRefsDMO) core).getAttrIDsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getAttrIDsHasValue(){
        if (((ObjWithRefsDMO) core).getAttrIDsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public AttributeIDIterableDMW getAttrIDsIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return(AttributeIDIterableDMW.emptyList);
        
        return(new AttributeIDIterableDMW(((ObjWithRefsDMO) core).getAttrIDs()));
    }

    /**
     * Adds another attrIDs value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addAttrIDs(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addAttrIDs(value);
    }

    /**
     * Adds another attrIDs value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addAttrIDs(AttributeID value){
        ((ObjWithRefsDMO) core).addAttrIDs(value);
    }

    /**
     * Adds another DmcAttributeInfo value.
     * @param value A value compatible with DmcAttributeInfo
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2095)
    public void addAttrIDs(DmcAttributeInfo value){
        ((ObjWithRefsDMO) core).addAttrIDs(value);
    }

    /**
     * Returns true if the collection contains the attrIDs value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean attrIDsContains(AttributeID value){
        return(((ObjWithRefsDMO) core).attrIDsContains(value));
    }

    /**
     * Returns true if the collection contains the DmcAttributeInfo value.
     * @param value A value compatible with DmcAttributeInfo
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2130)
    public boolean attrIDsContains(DmcAttributeInfo value){
        return(((ObjWithRefsDMO) core).attrIDsContains(value));
    }

    /**
     * @return A COPY of the collection of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public HashSet<AttributeID> getAttrIDsCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__attrIDs);
        if (attr == null)
            return(new HashSet<AttributeID>());
        
        HashSet<AttributeID> rc = new HashSet<AttributeID>(attr.getMVSize());
        
        Iterator<AttributeID> it = (Iterator<AttributeID>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a attrIDs value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delAttrIDs(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delAttrIDs(value);
    }

    /**
     * Deletes a attrIDs value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delAttrIDs(AttributeID value){
        ((ObjWithRefsDMO) core).delAttrIDs(value);
    }

    /**
     * Removes the attrIDs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remAttrIDs(){
        ((ObjWithRefsDMO) core).remAttrIDs();
    }

    /**
     * @return The number of ClientCountFilter items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getClientCountFiltersSize(){
        return(((ObjWithRefsDMO) core).getClientCountFiltersSize());
    }

    /**
     * @return true if there are no ClientCountFilterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getClientCountFiltersIsEmpty(){
        if (((ObjWithRefsDMO) core).getClientCountFiltersSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ClientCountFilterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getClientCountFiltersHasValue(){
        if (((ObjWithRefsDMO) core).getClientCountFiltersSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the clientCountFilters value at the specified index.
     * @param value A value compatible with ClientCountFilter
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1850)
    public DmcAttribute<?> setNthClientCountFilters(int index, ClientCountFilter value){
        if (value == null)
            return(((ObjWithRefsDMO) core).setNthClientCountFilters(index, null));
        else
            return(((ObjWithRefsDMO) core).setNthClientCountFilters(index, ((ClientCountFilterDMO)value.getDmcObject())));
    }

    /**
     * @return The ClientCountFilter object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1894)
    public ClientCountFilter getNthClientCountFilters(int index){
        ClientCountFilterDMO dmo = ((ObjWithRefsDMO) core).getNthClientCountFilters(index);
        if (dmo == null)
            return(null);
        
        return((ClientCountFilter)dmo.getContainer());
    }

    /**
     * Removes the clientCountFilters attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remClientCountFilters(){
        ((ObjWithRefsDMO) core).remClientCountFilters();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Boolean isEnabledDisabled(){
        return(((ObjWithRefsDMO) core).isEnabledDisabled());
    }

    /**
     * Sets enabledDisabled to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setEnabledDisabled(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setEnabledDisabled(value);
    }

    /**
     * Sets enabledDisabled to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setEnabledDisabled(Boolean value){
        ((ObjWithRefsDMO) core).setEnabledDisabled(value);
    }

    /**
     * Removes the enabledDisabled attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remEnabledDisabled(){
        ((ObjWithRefsDMO) core).remEnabledDisabled();
    }

    /**
     * @return The number of Date items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsDateSize(){
        return(((ObjWithRefsDMO) core).getHsDateSize());
    }

    /**
     * @return true if there are no DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsDateIsEmpty(){
        if (((ObjWithRefsDMO) core).getHsDateSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DateDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsDateHasValue(){
        if (((ObjWithRefsDMO) core).getHsDateSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public DateIterableDMW getHsDateIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(DateIterableDMW.emptyList);
        
        return(new DateIterableDMW(((ObjWithRefsDMO) core).getHsDate()));
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addHsDate(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addHsDate(value);
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addHsDate(Date value){
        ((ObjWithRefsDMO) core).addHsDate(value);
    }

    /**
     * Returns true if the collection contains the hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean hsDateContains(Date value){
        return(((ObjWithRefsDMO) core).hsDateContains(value));
    }

    /**
     * @return A COPY of the collection of Date objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delHsDate(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delHsDate(value);
    }

    /**
     * Deletes a hsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delHsDate(Date value){
        ((ObjWithRefsDMO) core).delHsDate(value);
    }

    /**
     * Removes the hsDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsDate(){
        ((ObjWithRefsDMO) core).remHsDate();
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsNamesSize(){
        return(((ObjWithRefsDMO) core).getHsNamesSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsNamesIsEmpty(){
        if (((ObjWithRefsDMO) core).getHsNamesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsNamesHasValue(){
        if (((ObjWithRefsDMO) core).getHsNamesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public NameContainerIterableDMW getHsNamesIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsNames);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((ObjWithRefsDMO) core).getHsNames()));
    }

    /**
     * Adds another hsNames value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addHsNames(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addHsNames(value);
    }

    /**
     * Adds another hsNames value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addHsNames(NameContainer value){
        ((ObjWithRefsDMO) core).addHsNames(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2095)
    public void addHsNames(DmcObjectName value){
        ((ObjWithRefsDMO) core).addHsNames(value);
    }

    /**
     * Returns true if the collection contains the hsNames value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean hsNamesContains(NameContainer value){
        return(((ObjWithRefsDMO) core).hsNamesContains(value));
    }

    /**
     * Returns true if the collection contains the DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2130)
    public boolean hsNamesContains(DmcObjectName value){
        return(((ObjWithRefsDMO) core).hsNamesContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public HashSet<NameContainer> getHsNamesCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsNames);
        if (attr == null)
            return(new HashSet<NameContainer>());
        
        HashSet<NameContainer> rc = new HashSet<NameContainer>(attr.getMVSize());
        
        Iterator<NameContainer> it = (Iterator<NameContainer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsNames value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delHsNames(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delHsNames(value);
    }

    /**
     * Deletes a hsNames value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delHsNames(NameContainer value){
        ((ObjWithRefsDMO) core).delHsNames(value);
    }

    /**
     * Removes the hsNames attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsNames(){
        ((ObjWithRefsDMO) core).remHsNames();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsStringSize(){
        return(((ObjWithRefsDMO) core).getHsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsStringIsEmpty(){
        if (((ObjWithRefsDMO) core).getHsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsStringHasValue(){
        if (((ObjWithRefsDMO) core).getHsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getHsStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ObjWithRefsDMO) core).getHsString()));
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addHsString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addHsString(value);
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addHsString(String value){
        ((ObjWithRefsDMO) core).addHsString(value);
    }

    /**
     * Returns true if the collection contains the hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean hsStringContains(String value){
        return(((ObjWithRefsDMO) core).hsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delHsString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delHsString(value);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delHsString(String value){
        ((ObjWithRefsDMO) core).delHsString(value);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsString(){
        ((ObjWithRefsDMO) core).remHsString();
    }

    /**
     * @return The number of StringName items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsStringNameSize(){
        return(((ObjWithRefsDMO) core).getHsStringNameSize());
    }

    /**
     * @return true if there are no StringNameDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsStringNameIsEmpty(){
        if (((ObjWithRefsDMO) core).getHsStringNameSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringNameDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsStringNameHasValue(){
        if (((ObjWithRefsDMO) core).getHsStringNameSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of StringName objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringNameIterableDMW getHsStringNameIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(StringNameIterableDMW.emptyList);
        
        return(new StringNameIterableDMW(((ObjWithRefsDMO) core).getHsStringName()));
    }

    /**
     * Adds another hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addHsStringName(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addHsStringName(value);
    }

    /**
     * Adds another hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addHsStringName(StringName value){
        ((ObjWithRefsDMO) core).addHsStringName(value);
    }

    /**
     * Returns true if the collection contains the hsStringName value.
     * @param value A value compatible with StringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean hsStringNameContains(StringName value){
        return(((ObjWithRefsDMO) core).hsStringNameContains(value));
    }

    /**
     * @return A COPY of the collection of StringName objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public HashSet<StringName> getHsStringNameCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsStringName);
        if (attr == null)
            return(new HashSet<StringName>());
        
        HashSet<StringName> rc = new HashSet<StringName>(attr.getMVSize());
        
        Iterator<StringName> it = (Iterator<StringName>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsStringName value.
     * @param value The StringName to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delHsStringName(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delHsStringName(value);
    }

    /**
     * Deletes a hsStringName value.
     * @param value The StringName to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delHsStringName(StringName value){
        ((ObjWithRefsDMO) core).delHsStringName(value);
    }

    /**
     * Removes the hsStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsStringName(){
        ((ObjWithRefsDMO) core).remHsStringName();
    }

    /**
     * @return The number of DmtTestEnum items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getHsTestEnumSize(){
        return(((ObjWithRefsDMO) core).getHsTestEnumSize());
    }

    /**
     * @return true if there are no DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getHsTestEnumIsEmpty(){
        if (((ObjWithRefsDMO) core).getHsTestEnumSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getHsTestEnumHasValue(){
        if (((ObjWithRefsDMO) core).getHsTestEnumSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public DmtTestEnumIterableDMW getHsTestEnumIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(DmtTestEnumIterableDMW.emptyList);
        
        return(new DmtTestEnumIterableDMW(((ObjWithRefsDMO) core).getHsTestEnum()));
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addHsTestEnum(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addHsTestEnum(value);
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addHsTestEnum(DmtTestEnum value){
        ((ObjWithRefsDMO) core).addHsTestEnum(value);
    }

    /**
     * Returns true if the collection contains the hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean hsTestEnumContains(DmtTestEnum value){
        return(((ObjWithRefsDMO) core).hsTestEnumContains(value));
    }

    /**
     * @return A COPY of the collection of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delHsTestEnum(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delHsTestEnum(value);
    }

    /**
     * Deletes a hsTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delHsTestEnum(DmtTestEnum value){
        ((ObjWithRefsDMO) core).delHsTestEnum(value);
    }

    /**
     * Removes the hsTestEnum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remHsTestEnum(){
        ((ObjWithRefsDMO) core).remHsTestEnum();
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getIndexedObjRefSize(){
        return(((ObjWithRefsDMO) core).getIndexedObjRefSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getIndexedObjRefIsEmpty(){
        if (((ObjWithRefsDMO) core).getIndexedObjRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getIndexedObjRefHasValue(){
        if (((ObjWithRefsDMO) core).getIndexedObjRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the indexedObjRef value at the specified index.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1850)
    public DmcAttribute<?> setNthIndexedObjRef(int index, ObjWithRefs value){
        if (value == null)
            return(((ObjWithRefsDMO) core).setNthIndexedObjRef(index, null));
        else
            return(((ObjWithRefsDMO) core).setNthIndexedObjRef(index, ((ObjWithRefsDMO)value.getDmcObject())));
    }

    /**
     * @return The ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1946)
    public ObjWithRefs getNthIndexedObjRef(int index){
        ObjWithRefsREF ref = ((ObjWithRefsDMO) core).getNthIndexedObjRef(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1986)
    public ObjWithRefsREF getNthIndexedObjRefREF(int index){
        ObjWithRefsREF ref = ((ObjWithRefsDMO) core).getNthIndexedObjRefREF(index);
        return(ref);
    }

    /**
     * Removes the indexedObjRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remIndexedObjRef(){
        ((ObjWithRefsDMO) core).remIndexedObjRef();
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getIndexedPlainObjRefSize(){
        return(((ObjWithRefsDMO) core).getIndexedPlainObjRefSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getIndexedPlainObjRefIsEmpty(){
        if (((ObjWithRefsDMO) core).getIndexedPlainObjRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getIndexedPlainObjRefHasValue(){
        if (((ObjWithRefsDMO) core).getIndexedPlainObjRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the indexedPlainObjRef value at the specified index.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1850)
    public DmcAttribute<?> setNthIndexedPlainObjRef(int index, TestBasicObjectFixedDMW value){
        if (value == null)
            return(((ObjWithRefsDMO) core).setNthIndexedPlainObjRef(index, null));
        else
            return(((ObjWithRefsDMO) core).setNthIndexedPlainObjRef(index, ((TestBasicObjectFixedDMO)value.getDmcObject())));
    }

    /**
     * @return The TestBasicObjectFixedDMW object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1894)
    public TestBasicObjectFixedDMW getNthIndexedPlainObjRef(int index){
        TestBasicObjectFixedDMO dmo = ((ObjWithRefsDMO) core).getNthIndexedPlainObjRef(index);
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Removes the indexedPlainObjRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remIndexedPlainObjRef(){
        ((ObjWithRefsDMO) core).remIndexedPlainObjRef();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getIndexedStringSize(){
        return(((ObjWithRefsDMO) core).getIndexedStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getIndexedStringIsEmpty(){
        if (((ObjWithRefsDMO) core).getIndexedStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getIndexedStringHasValue(){
        if (((ObjWithRefsDMO) core).getIndexedStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getIndexedStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ObjWithRefsDMO) core).getIndexedString()));
    }

    /**
     * Adds another indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addIndexedString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addIndexedString(value);
    }

    /**
     * Sets a indexedString value at the specified index.
     * @param index The index to set.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2073)
    public void setNthIndexedString(int index, String value){
        ((ObjWithRefsDMO) core).setNthIndexedString(index, value);
    }

    /**
     * Gets the indexedString value at the specified index.
     * @param index The index to retreive.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2082)
    public String getNthIndexedString(int index){
        return(((ObjWithRefsDMO) core).getNthIndexedString(index));
    }

    /**
     * Returns true if the collection contains the indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean indexedStringContains(String value){
        return(((ObjWithRefsDMO) core).indexedStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getIndexedStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__indexedString);
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
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delIndexedString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delIndexedString(value);
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delIndexedString(String value){
        ((ObjWithRefsDMO) core).delIndexedString(value);
    }

    /**
     * Removes the indexedString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remIndexedString(){
        ((ObjWithRefsDMO) core).remIndexedString();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2263)
    public int getIntToStringSize(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2275)
    public boolean getIntToStringIsEmpty(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2287)
    public boolean getIntToStringHasValue(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2303)
    public IntegerToString getIntToString(Object key){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(null);
        
        return((IntegerToString)attr.getByKey(key));
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2490)
    public IntegerToStringIterableDMW getIntToStringIterable(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
        if (attr == null)
            return(IntegerToStringIterableDMW.emptyList);
        
        return(new IntegerToStringIterableDMW(((ObjWithRefsDMO) core).getIntToString()));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2517)
    public void addIntToString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addIntToString(value);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2526)
    public void addIntToString(IntegerToString value) {
        ((ObjWithRefsDMO) core).addIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2538)
    public void delIntToString(Object value){
        ((ObjWithRefsDMO) core).delIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2547)
    public void delIntToString(Integer value){
        ((ObjWithRefsDMO) core).delIntToString(value);
    }

    /**
     * @return A COPY of the collection of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2577)
    @SuppressWarnings("unchecked")
    public HashMap<Integer,IntegerToString> getIntToStringCopy(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToString);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2618)
    public void remIntToString(){
        ((ObjWithRefsDMO) core).remIntToString();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2263)
    public int getIntToStringMAPSize(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2275)
    public boolean getIntToStringMAPIsEmpty(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2287)
    public boolean getIntToStringMAPHasValue(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed IntegerToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2303)
    public IntegerToString getIntToStringMAP(Object key){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(null);
        
        return((IntegerToString)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2334)
    public Integer getIntToStringMAPFirstKey(){
        return(((ObjWithRefsDMO) core).getIntToStringMAPFirstKey());
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2490)
    public IntegerToStringIterableDMW getIntToStringMAPIterable(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(IntegerToStringIterableDMW.emptyList);
        
        return(new IntegerToStringIterableDMW(((ObjWithRefsDMO) core).getIntToStringMAP()));
    }

    /**
     * Adds another intToStringMAP value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2517)
    public void addIntToStringMAP(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addIntToStringMAP(value);
    }

    /**
     * Adds another intToStringMAP value.
     * @param value IntegerToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2526)
    public void addIntToStringMAP(IntegerToString value) {
        ((ObjWithRefsDMO) core).addIntToStringMAP(value);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2538)
    public void delIntToStringMAP(Object value){
        ((ObjWithRefsDMO) core).delIntToStringMAP(value);
    }

    /**
     * Deletes a intToStringMAP value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2547)
    public void delIntToStringMAP(Integer value){
        ((ObjWithRefsDMO) core).delIntToStringMAP(value);
    }

    /**
     * @return A COPY of the collection of IntegerToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2577)
    @SuppressWarnings("unchecked")
    public TreeMap<Integer,IntegerToString> getIntToStringMAPCopy(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__intToStringMAP);
        if (attr == null)
            return(new TreeMap<Integer,IntegerToString>());
        
        TreeMap<Integer,IntegerToString> rc = new TreeMap<Integer,IntegerToString>();
        
        Iterator<IntegerToString> it = (Iterator<IntegerToString>) attr.getMV();
        while(it.hasNext()){
            IntegerToString obj = it.next();
            rc.put((Integer)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the intToStringMAP attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2618)
    public void remIntToStringMAP(){
        ((ObjWithRefsDMO) core).remIntToStringMAP();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getMvStringSize(){
        return(((ObjWithRefsDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getMvStringIsEmpty(){
        if (((ObjWithRefsDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getMvStringHasValue(){
        if (((ObjWithRefsDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ObjWithRefsDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addMvString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addMvString(String value){
        ((ObjWithRefsDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean mvStringContains(String value){
        return(((ObjWithRefsDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delMvString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delMvString(String value){
        ((ObjWithRefsDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remMvString(){
        ((ObjWithRefsDMO) core).remMvString();
    }

    /**
     * @return The number of DmtTestEnum items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getMvTestEnumSize(){
        return(((ObjWithRefsDMO) core).getMvTestEnumSize());
    }

    /**
     * @return true if there are no DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getMvTestEnumIsEmpty(){
        if (((ObjWithRefsDMO) core).getMvTestEnumSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmtTestEnumDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getMvTestEnumHasValue(){
        if (((ObjWithRefsDMO) core).getMvTestEnumSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public DmtTestEnumIterableDMW getMvTestEnumIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            return(DmtTestEnumIterableDMW.emptyList);
        
        return(new DmtTestEnumIterableDMW(((ObjWithRefsDMO) core).getMvTestEnum()));
    }

    /**
     * Adds another mvTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addMvTestEnum(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addMvTestEnum(value);
    }

    /**
     * Adds another mvTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addMvTestEnum(DmtTestEnum value){
        ((ObjWithRefsDMO) core).addMvTestEnum(value);
    }

    /**
     * Returns true if the collection contains the mvTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean mvTestEnumContains(DmtTestEnum value){
        return(((ObjWithRefsDMO) core).mvTestEnumContains(value));
    }

    /**
     * @return A COPY of the collection of DmtTestEnum objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public ArrayList<DmtTestEnum> getMvTestEnumCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvTestEnum);
        if (attr == null)
            return(new ArrayList<DmtTestEnum>());
        
        ArrayList<DmtTestEnum> rc = new ArrayList<DmtTestEnum>(attr.getMVSize());
        
        Iterator<DmtTestEnum> it = (Iterator<DmtTestEnum>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delMvTestEnum(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delMvTestEnum(value);
    }

    /**
     * Deletes a mvTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delMvTestEnum(DmtTestEnum value){
        ((ObjWithRefsDMO) core).delMvTestEnum(value);
    }

    /**
     * Removes the mvTestEnum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remMvTestEnum(){
        ((ObjWithRefsDMO) core).remMvTestEnum();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DefinitionName getName(){
        return(((ObjWithRefsDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setName(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setName(DefinitionName value){
        ((ObjWithRefsDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remName(){
        ((ObjWithRefsDMO) core).remName();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getNonperStringSize(){
        return(((ObjWithRefsDMO) core).getNonperStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getNonperStringIsEmpty(){
        if (((ObjWithRefsDMO) core).getNonperStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getNonperStringHasValue(){
        if (((ObjWithRefsDMO) core).getNonperStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getNonperStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__nonperString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ObjWithRefsDMO) core).getNonperString()));
    }

    /**
     * Adds another nonperString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addNonperString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addNonperString(value);
    }

    /**
     * Adds another nonperString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addNonperString(String value){
        ((ObjWithRefsDMO) core).addNonperString(value);
    }

    /**
     * Returns true if the collection contains the nonperString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean nonperStringContains(String value){
        return(((ObjWithRefsDMO) core).nonperStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public HashSet<String> getNonperStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__nonperString);
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
     * Deletes a nonperString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delNonperString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delNonperString(value);
    }

    /**
     * Deletes a nonperString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delNonperString(String value){
        ((ObjWithRefsDMO) core).delNonperString(value);
    }

    /**
     * Removes the nonperString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remNonperString(){
        ((ObjWithRefsDMO) core).remNonperString();
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public ObjWithRefs getObjRef(){
        ObjWithRefsREF ref = ((ObjWithRefsDMO) core).getObjRef();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * Sets the objRef to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setObjRef(ObjWithRefs value) {
        ((ObjWithRefsDMO) core).setObjRef(value.getDMO());
    }

    /**
     * Sets the objRef to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setObjRef(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setObjRef(value);
    }

    /**
     * Removes the objRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remObjRef(){
        ((ObjWithRefsDMO) core).remObjRef();
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2263)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2275)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2287)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2303)
    public ObjWithRefs getObjRefHM(Object key){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2358)
    public ObjWithRefsIterableDMW getObjRefHMIterable(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((ObjWithRefsDMO) core).getObjRefHM();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2392)
    public DmcAttribute<?> addObjRefHM(ObjWithRefs value) {
        return(((ObjWithRefsDMO) core).addObjRefHM(value.getDMO()));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2416)
    public void delObjRefHM(ObjWithRefs value){
        ((ObjWithRefsDMO) core).delObjRefHM(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2462)
    public HashMap<DefinitionName,ObjWithRefs> getObjRefHMCopy(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(new HashMap<DefinitionName,ObjWithRefs>());
        
        HashMap<DefinitionName,ObjWithRefs> rc = new HashMap<DefinitionName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getObjRefHMIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((DefinitionName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2618)
    public void remObjRefHM(){
        ((ObjWithRefsDMO) core).remObjRefHM();
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getObjRefMVSize(){
        return(((ObjWithRefsDMO) core).getObjRefMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getObjRefMVIsEmpty(){
        if (((ObjWithRefsDMO) core).getObjRefMVSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getObjRefMVHasValue(){
        if (((ObjWithRefsDMO) core).getObjRefMVSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public ObjWithRefsIterableDMW getObjRefMVIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__objRefMV);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((ObjWithRefsDMO) core).getObjRefMV()));
    }

    /**
     * Adds another objRefMV value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1692)
    public DmcAttribute<?> addObjRefMV(ObjWithRefs value){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).addObjRefMV(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a objRefMV value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1742)
    public void delObjRefMV(ObjWithRefs value){
        ((ObjWithRefsDMO) core).delObjRefMV(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1806)
    public ArrayList<ObjWithRefs> getObjRefMVCopy(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__objRefMV);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        ObjWithRefsIterableDMW it = getObjRefMVIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the objRefMV attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remObjRefMV(){
        ((ObjWithRefsDMO) core).remObjRefMV();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Boolean isOnOff(){
        return(((ObjWithRefsDMO) core).isOnOff());
    }

    /**
     * Sets onOff to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setOnOff(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setOnOff(value);
    }

    /**
     * Sets onOff to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setOnOff(Boolean value){
        ((ObjWithRefsDMO) core).setOnOff(value);
    }

    /**
     * Removes the onOff attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remOnOff(){
        ((ObjWithRefsDMO) core).remOnOff();
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getPlainObjRefSize(){
        return(((ObjWithRefsDMO) core).getPlainObjRefSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getPlainObjRefIsEmpty(){
        if (((ObjWithRefsDMO) core).getPlainObjRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getPlainObjRefHasValue(){
        if (((ObjWithRefsDMO) core).getPlainObjRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public TestBasicObjectFixedIterableDMW getPlainObjRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__plainObjRef);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((ObjWithRefsDMO) core).getPlainObjRef()));
    }

    /**
     * Adds another plainObjRef value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1692)
    public DmcAttribute<?> addPlainObjRef(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).addPlainObjRef(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a plainObjRef value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1742)
    public void delPlainObjRef(TestBasicObjectFixedDMW value){
        ((ObjWithRefsDMO) core).delPlainObjRef(value.getDMO());
    }

    /**
     * Removes the plainObjRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remPlainObjRef(){
        ((ObjWithRefsDMO) core).remPlainObjRef();
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getSomeRelationMVSize(){
        return(((ObjWithRefsDMO) core).getSomeRelationMVSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getSomeRelationMVIsEmpty(){
        if (((ObjWithRefsDMO) core).getSomeRelationMVSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getSomeRelationMVHasValue(){
        if (((ObjWithRefsDMO) core).getSomeRelationMVSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public SomeRelationIterableDMW getSomeRelationMVIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ObjWithRefsDMO) core).getSomeRelationMV()));
    }

    /**
     * Adds another someRelationMV value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1678)
    public DmcAttribute<?> addSomeRelationMV(SomeRelation value){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).addSomeRelationMV(value);
        return(attr);
    }

    /**
     * Deletes a someRelationMV value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1732)
    public void delSomeRelationMV(SomeRelation value){
        ((ObjWithRefsDMO) core).delSomeRelationMV(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1806)
    public ArrayList<ObjWithRefs> getSomeRelationMVCopy(){
        DmcAttribute<?> attr = ((ObjWithRefsDMO) core).get(DmtDMSAG.__someRelationMV);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        SomeRelationIterableDMW it = getSomeRelationMVIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the someRelationMV attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remSomeRelationMV(){
        ((ObjWithRefsDMO) core).remSomeRelationMV();
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getSomeRelationMVISize(){
        return(((ObjWithRefsDMO) core).getSomeRelationMVISize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getSomeRelationMVIIsEmpty(){
        if (((ObjWithRefsDMO) core).getSomeRelationMVISize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getSomeRelationMVIHasValue(){
        if (((ObjWithRefsDMO) core).getSomeRelationMVISize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the someRelationMVI value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1840)
    public DmcAttribute<?> setNthSomeRelationMVI(int index, SomeRelation value){
        return(((ObjWithRefsDMO) core).setNthSomeRelationMVI(index, value));
    }

    /**
     * @return The SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1930)
    public ObjWithRefs getNthSomeRelationMVI(int index){
        SomeRelation ref = ((ObjWithRefsDMO) core).getNthSomeRelationMVI(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1976)
    public SomeRelation getNthSomeRelationMVIREF(int index){
        SomeRelation ref = ((ObjWithRefsDMO) core).getNthSomeRelationMVIREF(index);
        return(ref);
    }

    /**
     * Removes the someRelationMVI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remSomeRelationMVI(){
        ((ObjWithRefsDMO) core).remSomeRelationMVI();
    }

    /**
     * @return A SomeRelation object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public SomeRelation getSomeRelationSV(){
        SomeRelation ref = ((ObjWithRefsDMO) core).getSomeRelationSV();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((SomeRelation)ref.getObject().getContainer());
    }

    /**
     * Sets the someRelationSV to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setSomeRelationSV(SomeRelation value) {
        ((ObjWithRefsDMO) core).setSomeRelationSV(value);
    }

    /**
     * Sets the someRelationSV to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1428)
    public void setSomeRelationSV(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setSomeRelationSV(value);
    }

    /**
     * Removes the someRelationSV attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSomeRelationSV(){
        ((ObjWithRefsDMO) core).remSomeRelationSV();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Boolean isSvBoolean(){
        return(((ObjWithRefsDMO) core).isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSvBoolean(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSvBoolean(Boolean value){
        ((ObjWithRefsDMO) core).setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSvBoolean(){
        ((ObjWithRefsDMO) core).remSvBoolean();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getSvString(){
        return(((ObjWithRefsDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSvString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSvString(String value){
        ((ObjWithRefsDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSvString(){
        ((ObjWithRefsDMO) core).remSvString();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DmtTestEnum getSvTestEnum(){
        return(((ObjWithRefsDMO) core).getSvTestEnum());
    }

    /**
     * Sets svTestEnum to the specified value.
     * @param value A value compatible with DmcTypeDmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSvTestEnum(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).setSvTestEnum(value);
    }

    /**
     * Sets svTestEnum to the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSvTestEnum(DmtTestEnum value){
        ((ObjWithRefsDMO) core).setSvTestEnum(value);
    }

    /**
     * Removes the svTestEnum attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSvTestEnum(){
        ((ObjWithRefsDMO) core).remSvTestEnum();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getTransStringSize(){
        return(((ObjWithRefsDMO) core).getTransStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getTransStringIsEmpty(){
        if (((ObjWithRefsDMO) core).getTransStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getTransStringHasValue(){
        if (((ObjWithRefsDMO) core).getTransStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public StringIterableDMW getTransStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__transString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ObjWithRefsDMO) core).getTransString()));
    }

    /**
     * Adds another transString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addTransString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).addTransString(value);
    }

    /**
     * Adds another transString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addTransString(String value){
        ((ObjWithRefsDMO) core).addTransString(value);
    }

    /**
     * Returns true if the collection contains the transString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean transStringContains(String value){
        return(((ObjWithRefsDMO) core).transStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public HashSet<String> getTransStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__transString);
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
     * Deletes a transString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delTransString(Object value) throws DmcValueException {
        ((ObjWithRefsDMO) core).delTransString(value);
    }

    /**
     * Deletes a transString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delTransString(String value){
        ((ObjWithRefsDMO) core).delTransString(value);
    }

    /**
     * Removes the transString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remTransString(){
        ((ObjWithRefsDMO) core).remTransString();
    }


}
