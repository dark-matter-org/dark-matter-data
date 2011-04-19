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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import java.util.HashSet;                                        // To support getMVCopy()
import java.util.Iterator;                                       // To support getMVCopy()
import org.dmd.dmc.*;                                            // If any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Alternative type for AttributeID values
import org.dmd.dmc.DmcObjectName;                                // Alternative type for NameContainer values
import org.dmd.dmc.types.AttributeID;                            // For multi-valued containsAttributeID
import org.dmd.dmc.types.NameContainer;                          // Primitive type
import org.dmd.dmp.server.extended.Request;                      // Derived class
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;           // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;             // Primitive type
import org.dmd.dms.*;                                            // Always 2
import org.dmd.dms.generated.dmw.AttributeIDIterableDMW;         // For multi-valued AttributeID
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;             // Is reference type aux
import org.dmd.dms.generated.types.ClassDefinitionREF;           // To support getMVCopy() for REFs
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class GetRequestDMW extends Request {

    public GetRequestDMW() {
        super(new GetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
    }

    public GetRequestDMW(DmcTypeModifierMV mods) {
        super(new GetRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
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

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public NameContainer getTarget(){
        return(((GetRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setTarget(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setTarget(NameContainer value){
        ((GetRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1082)
    public void setTarget(DmcObjectName value){
        ((GetRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remTarget(){
        ((GetRequestDMO) core).remTarget();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getFilter(){
        return(((GetRequestDMO) core).getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setFilter(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setFilter(String value){
        ((GetRequestDMO) core).setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remFilter(){
        ((GetRequestDMO) core).remFilter();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:991)
    public ClassDefinitionDMW getFilterByClass(){
        ClassDefinitionREF ref = ((GetRequestDMO) core).getFilterByClass();
        if (ref == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setFilterByClass(ClassDefinitionDMW value) {
        ((GetRequestDMO) core).setFilterByClass(value.getDMO());
    }

    /**
     * Removes the filterByClass attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remFilterByClass(){
        ((GetRequestDMO) core).remFilterByClass();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public Integer getBlockingFactor(){
        return(((GetRequestDMO) core).getBlockingFactor());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setBlockingFactor(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setBlockingFactor(Integer value){
        ((GetRequestDMO) core).setBlockingFactor(value);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remBlockingFactor(){
        ((GetRequestDMO) core).remBlockingFactor();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public Boolean isRegisterForEvents(){
        return(((GetRequestDMO) core).isRegisterForEvents());
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setRegisterForEvents(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Sets registerForEvents to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setRegisterForEvents(Boolean value){
        ((GetRequestDMO) core).setRegisterForEvents(value);
    }

    /**
     * Removes the registerForEvents attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remRegisterForEvents(){
        ((GetRequestDMO) core).remRegisterForEvents();
    }

    /**
     * @return The number of AttributeID items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getAttributeSelectorSize(){
        DmcAttribute<?> attr = core.get(GetRequestDMO.__attributeSelector);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no AttributeIDDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getAttributeSelectorIsEmpty(){
        DmcAttribute<?> attr = core.get(GetRequestDMO.__attributeSelector);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any AttributeIDDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getAttributeSelectorHasValue(){
        DmcAttribute<?> attr = core.get(GetRequestDMO.__attributeSelector);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of AttributeID objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1281)
    public AttributeIDIterableDMW getAttributeSelectorIterable(){
        DmcAttribute<?> attr = core.get(GetRequestDMO.__attributeSelector);
        if (attr == null)
            return(AttributeIDIterableDMW.emptyList);
        
        return(new AttributeIDIterableDMW(((GetRequestDMO) core).getAttributeSelector()));
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void addAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Adds another attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1306)
    public void addAttributeSelector(AttributeID value){
        ((GetRequestDMO) core).addAttributeSelector(value);
    }

    /**
     * Returns true if the collection contains the attributeSelector value.
     * @param value A value compatible with AttributeID
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1318)
    public boolean attributeSelectorContains(AttributeID value){
        return(((GetRequestDMO) core).attributeSelectorContains(value));
    }

    /**
     * @return A COPY of the collection of AttributeID objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    @SuppressWarnings("unchecked")
    public HashSet<AttributeID> getAttributeSelectorCopy(){
        DmcAttribute<?> attr = core.get(GetRequestDMO.__attributeSelector);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void delAttributeSelector(Object value) throws DmcValueException {
        ((GetRequestDMO) core).delAttributeSelector(value);
    }

    /**
     * Removes the attributeSelector attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remAttributeSelector(){
        ((GetRequestDMO) core).remAttributeSelector();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public Boolean isCacheResponse(){
        return(((GetRequestDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setCacheResponse(Boolean value){
        ((GetRequestDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remCacheResponse(){
        ((GetRequestDMO) core).remCacheResponse();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getSlice(){
        return(((GetRequestDMO) core).getSlice());
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setSlice(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setSlice(String value){
        ((GetRequestDMO) core).setSlice(value);
    }

    /**
     * Removes the slice attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remSlice(){
        ((GetRequestDMO) core).remSlice();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public ScopeEnum getScope(){
        return(((GetRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setScope(Object value) throws DmcValueException {
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setScope(ScopeEnum value){
        ((GetRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remScope(){
        ((GetRequestDMO) core).remScope();
    }


}
