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
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                        // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.HashSet;                                          // To support getMVCopy() - (BaseDMWGenerator.java:1090)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.DmcAttributeInfo;                               // Alternative type for AttributeID values - (BaseDMWGenerator.java:1048)
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values - (BaseDMWGenerator.java:1048)
import org.dmd.dmc.types.AttributeID;                              // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmc.types.ClassFilter;                              // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmc.types.NameContainer;                            // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmp.server.extended.GetRequest;                     // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Request;                        // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute attributeSelector from the dmp schema - (BaseDMWGenerator.java:910)
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;               // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.AttributeIDIterableDMW;           // For multi-valued AttributeID - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.ClassDefinitionREF;             // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class GetRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public GetRequestDMW() {
        super(new GetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public GetRequestDMW(DmcTypeModifierMV mods) {
        super(new GetRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public GetRequest getModificationRecorder(){
        GetRequest rc = new GetRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public GetRequestDMW(GetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    public GetRequest cloneIt() {
        GetRequest rc = new GetRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GetRequestDMO getDMO() {
        return((GetRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected GetRequestDMW(GetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of AttributeID items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getAttributeSelectorSize(){
        return(((GetRequestDMO) core).getAttributeSelectorSize());
    }

    /**
     * @return true if there are no AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getAttributeSelectorIsEmpty(){
        if (((GetRequestDMO) core).getAttributeSelectorSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getAttributeSelectorHasValue(){
        if (((GetRequestDMO) core).getAttributeSelectorSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public AttributeIDIterableDMW getAttributeSelectorIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return(AttributeIDIterableDMW.emptyList);
        
        return(new AttributeIDIterableDMW(((GetRequestDMO) core).getAttributeSelector()));
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addAttributeSelector(AttributeID value){
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Adds another DmcAttributeInfo value.
     * @param value A value compatible with DmcAttributeInfo
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2069)
    public void addAttributeSelector(DmcAttributeInfo value){
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * @param value A value compatible with AttributeID
     * @return true if the collection contains the attributeSelector value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean attributeSelectorContains(AttributeID value){
        return(((GetRequestDMO) core).attributeSelectorContains(value));
    }

    /**
     * @param value A value compatible with DmcAttributeInfo
     * @return true if the collection contains the DmcAttributeInfo value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2104)
    public boolean attributeSelectorContains(DmcAttributeInfo value){
        return(((GetRequestDMO) core).attributeSelectorContains(value));
    }

    /**
     * @return A COPY of the collection of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public HashSet<AttributeID> getAttributeSelectorCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__attributeSelector);
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
     * Deletes a attributeSelector value.
     * @param value The AttributeID to be deleted from set of attribute values.
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).delAttributeSelector(value);
    }

    /**
     * Deletes a attributeSelector value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delAttributeSelector(AttributeID value){
        ((GetRequestDMO) core).delAttributeSelector(value);
    }

    /**
     * Removes the attributeSelector attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remAttributeSelector(){
        ((GetRequestDMO) core).remAttributeSelector();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Integer getBlockingFactor(){
        return(((GetRequestDMO) core).getBlockingFactor());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setBlockingFactor(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setBlockingFactor(Integer value){
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remBlockingFactor(){
        ((GetRequestDMO) core).remBlockingFactor();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isCacheResponse(){
        return(((GetRequestDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setCacheResponse(Boolean value){
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remCacheResponse(){
        ((GetRequestDMO) core).remCacheResponse();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public ClassFilter getClassFilter(){
        return(((GetRequestDMO) core).getClassFilter());
    }

    /**
     * Sets classFilter to the specified value.
     * @param value A value compatible with DmcTypeClassFilter
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setClassFilter(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setClassFilter(value);
    }

    /**
     * Sets classFilter to the specified value.
     * @param value ClassFilter
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setClassFilter(ClassFilter value){
        ((GetRequestDMO) core).setClassFilter(value);
    }

    /**
     * Removes the classFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remClassFilter(){
        ((GetRequestDMO) core).remClassFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getFilter(){
        return(((GetRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setFilter(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setFilter(String value){
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remFilter(){
        ((GetRequestDMO) core).remFilter();
    }

    /**
     * @return A ClassDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public ClassDefinition getFilterByClass(){
        ClassDefinitionREF ref = ((GetRequestDMO) core).getFilterByClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setFilterByClass(ClassDefinition value) {
        ((GetRequestDMO) core).setFilterByClass(value.getDMO());
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     * @throws DmcValueException is the value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1419)
    public void setFilterByClass(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setFilterByClass(value);
    }

    /**
     * Removes the filterByClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remFilterByClass(){
        ((GetRequestDMO) core).remFilterByClass();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isRegisterForEvents(){
        return(((GetRequestDMO) core).isRegisterForEvents());
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setRegisterForEvents(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setRegisterForEvents(Boolean value){
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Removes the registerForEvents attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remRegisterForEvents(){
        ((GetRequestDMO) core).remRegisterForEvents();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public ScopeEnum getScope(){
        return(((GetRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setScope(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setScope(ScopeEnum value){
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remScope(){
        ((GetRequestDMO) core).remScope();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSlice(){
        return(((GetRequestDMO) core).getSlice());
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setSlice(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setSlice(String value){
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remSlice(){
        ((GetRequestDMO) core).remSlice();
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getTargetsSize(){
        return(((GetRequestDMO) core).getTargetsSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getTargetsIsEmpty(){
        if (((GetRequestDMO) core).getTargetsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getTargetsHasValue(){
        if (((GetRequestDMO) core).getTargetsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public NameContainerIterableDMW getTargetsIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((GetRequestDMO) core).getTargets()));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addTargets(Object value) throws DmcValueException {
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addTargets(NameContainer value){
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2069)
    public void addTargets(DmcObjectName value){
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * @param value A value compatible with NameContainer
     * @return true if the collection contains the targets value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean targetsContains(NameContainer value){
        return(((GetRequestDMO) core).targetsContains(value));
    }

    /**
     * @param value A value compatible with DmcObjectName
     * @return true if the collection contains the DmcObjectName value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2104)
    public boolean targetsContains(DmcObjectName value){
        return(((GetRequestDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
    @SuppressWarnings("unchecked")
    public ArrayList<NameContainer> getTargetsCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(new ArrayList<NameContainer>());
        
        ArrayList<NameContainer> rc = new ArrayList<NameContainer>(attr.getMVSize());
        
        Iterator<NameContainer> it = (Iterator<NameContainer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delTargets(Object value) throws DmcValueException {
        ((GetRequestDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delTargets(NameContainer value){
        ((GetRequestDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remTargets(){
        ((GetRequestDMO) core).remTargets();
    }


}
