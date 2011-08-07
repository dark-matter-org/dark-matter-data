//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:813)
import java.util.ArrayList;                                        // To support getMVCopy()
import java.util.HashSet;                                          // To support getMVCopy()
import java.util.Iterator;                                         // To support getMVCopy()
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmc.DmcAttributeInfo;                               // Alternative type for AttributeID values
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values
import org.dmd.dmc.types.AttributeID;                              // For multi-valued containsAttributeID
import org.dmd.dmc.types.ClassFilter;                              // Primitive type
import org.dmd.dmc.types.NameContainer;                            // For multi-valued containsNameContainer
import org.dmd.dmp.server.extended.GetRequest;                     // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                        // Derived class
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute from dmp schema
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;             // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;               // Primitive type
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor
import org.dmd.dms.generated.dmw.AttributeIDIterableDMW;           // For multi-valued AttributeID
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;               // Is reference type aux
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer
import org.dmd.dms.generated.types.ClassDefinitionREF;             // To support getMVCopy() for REFs
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:284)
 */
abstract public class GetRequestDMW extends Request {

    public GetRequestDMW() {
        super(new GetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    public GetRequestDMW(DmcTypeModifierMV mods) {
        super(new GetRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    public GetRequest getModificationRecorder(){
        GetRequest rc = new GetRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public GetRequestDMW(GetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    public GetRequestDMO getDMO() {
        return((GetRequestDMO) core);
    }

    protected GetRequestDMW(GetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1119)
    public int getTargetsSize(){
        return(((GetRequestDMO) core).getTargetsSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1135)
    public boolean getTargetsIsEmpty(){
        if (((GetRequestDMO) core).getTargetsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1150)
    public boolean getTargetsHasValue(){
        if (((GetRequestDMO) core).getTargetsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1339)
    public NameContainerIterableDMW getTargetsIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((GetRequestDMO) core).getTargets()));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1365)
    public void addTargets(Object value) throws DmcValueException {
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1375)
    public void addTargets(NameContainer value){
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1408)
    public void addTargets(DmcObjectName value){
        ((GetRequestDMO) core).addTargets(value);
    }

    /**
     * Returns true if the collection contains the targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1432)
    public boolean targetsContains(NameContainer value){
        return(((GetRequestDMO) core).targetsContains(value));
    }

    /**
     * Returns true if the collection contains the DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1443)
    public boolean targetsContains(DmcObjectName value){
        return(((GetRequestDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1472)
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
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1499)
    public void delTargets(Object value) throws DmcValueException {
        ((GetRequestDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1508)
    public void delTargets(NameContainer value){
        ((GetRequestDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1520)
    public void remTargets(){
        ((GetRequestDMO) core).remTargets();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public String getFilter(){
        return(((GetRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setFilter(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setFilter(String value){
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remFilter(){
        ((GetRequestDMO) core).remFilter();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:957)
    public ClassDefinitionDMW getFilterByClass(){
        ClassDefinitionREF ref = ((GetRequestDMO) core).getFilterByClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1009)
    public void setFilterByClass(ClassDefinitionDMW value) {
        ((GetRequestDMO) core).setFilterByClass(value.getDMO());
    }

    /**
     * Removes the filterByClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remFilterByClass(){
        ((GetRequestDMO) core).remFilterByClass();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public Integer getBlockingFactor(){
        return(((GetRequestDMO) core).getBlockingFactor());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setBlockingFactor(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setBlockingFactor(Integer value){
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remBlockingFactor(){
        ((GetRequestDMO) core).remBlockingFactor();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public Boolean isRegisterForEvents(){
        return(((GetRequestDMO) core).isRegisterForEvents());
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setRegisterForEvents(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setRegisterForEvents(Boolean value){
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Removes the registerForEvents attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remRegisterForEvents(){
        ((GetRequestDMO) core).remRegisterForEvents();
    }

    /**
     * @return The number of AttributeID items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1119)
    public int getAttributeSelectorSize(){
        return(((GetRequestDMO) core).getAttributeSelectorSize());
    }

    /**
     * @return true if there are no AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1135)
    public boolean getAttributeSelectorIsEmpty(){
        if (((GetRequestDMO) core).getAttributeSelectorSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any AttributeIDDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1150)
    public boolean getAttributeSelectorHasValue(){
        if (((GetRequestDMO) core).getAttributeSelectorSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1339)
    public AttributeIDIterableDMW getAttributeSelectorIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__attributeSelector);
        if (attr == null)
            return(AttributeIDIterableDMW.emptyList);
        
        return(new AttributeIDIterableDMW(((GetRequestDMO) core).getAttributeSelector()));
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1365)
    public void addAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1375)
    public void addAttributeSelector(AttributeID value){
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Adds another DmcAttributeInfo value.
     * @param value A value compatible with DmcAttributeInfo
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1408)
    public void addAttributeSelector(DmcAttributeInfo value){
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Returns true if the collection contains the attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1432)
    public boolean attributeSelectorContains(AttributeID value){
        return(((GetRequestDMO) core).attributeSelectorContains(value));
    }

    /**
     * Returns true if the collection contains the DmcAttributeInfo value.
     * @param value A value compatible with DmcAttributeInfo
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1443)
    public boolean attributeSelectorContains(DmcAttributeInfo value){
        return(((GetRequestDMO) core).attributeSelectorContains(value));
    }

    /**
     * @return A COPY of the collection of AttributeID objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1472)
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
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1499)
    public void delAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).delAttributeSelector(value);
    }

    /**
     * Deletes a attributeSelector value.
     * @param value The AttributeID to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1508)
    public void delAttributeSelector(AttributeID value){
        ((GetRequestDMO) core).delAttributeSelector(value);
    }

    /**
     * Removes the attributeSelector attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1520)
    public void remAttributeSelector(){
        ((GetRequestDMO) core).remAttributeSelector();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public Boolean isCacheResponse(){
        return(((GetRequestDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setCacheResponse(Boolean value){
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remCacheResponse(){
        ((GetRequestDMO) core).remCacheResponse();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public String getSlice(){
        return(((GetRequestDMO) core).getSlice());
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setSlice(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setSlice(String value){
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remSlice(){
        ((GetRequestDMO) core).remSlice();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public ClassFilter getClassFilter(){
        return(((GetRequestDMO) core).getClassFilter());
    }

    /**
     * Sets classFilter to the specified value.
     * @param value A value compatible with DmcTypeClassFilter
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setClassFilter(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setClassFilter(value);
    }

    /**
     * Sets classFilter to the specified value.
     * @param value ClassFilter
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setClassFilter(ClassFilter value){
        ((GetRequestDMO) core).setClassFilter(value);
    }

    /**
     * Removes the classFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remClassFilter(){
        ((GetRequestDMO) core).remClassFilter();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public ScopeEnum getScope(){
        return(((GetRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setScope(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setScope(ScopeEnum value){
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remScope(){
        ((GetRequestDMO) core).remScope();
    }


}
