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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:740)
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dmc.types.FullyQualifiedName;                   // Primitive type
import org.dmd.dmc.types.IntegerName;                          // Primitive type
import org.dmd.dmp.server.extended.Request;                    // Derived class
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;           // Primitive type
import org.dmd.dms.*;                                          // Always 2
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;           // Is reference type aux
import org.dmd.dms.generated.types.ClassDefinitionREF;         // Is reference type REF

/**
 * The GetRequest is used to retrieve objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class GetRequestDMW extends Request implements DmcNamedObjectIF {

    private GetRequestDMO mycore;

    public GetRequestDMW() {
        super(new GetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
        mycore = (GetRequestDMO) core;
        mycore.setContainer(this);
    }

    public GetRequestDMW(GetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetRequest);
        mycore = (GetRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (GetRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public GetRequestDMO getDMO() {
        return(mycore);
    }

    protected GetRequestDMW(GetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (GetRequestDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:766)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GetRequestDMW){
            return( getObjectName().equals( ((GetRequestDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:870)
    public String getFilter(){
        return(mycore.getFilter());
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:909)
    public void setFilter(Object value) throws DmcValueException {
        mycore.setFilter(value);
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:918)
    public void setFilter(String value){
        mycore.setFilter(value);
    }

    /**
     * Removes the filter attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remFilter(){
        mycore.remFilter();
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:850)
    public ClassDefinitionDMW getFilterByClass(){
        ClassDefinitionREF ref = mycore.getFilterByClass();
        if (ref == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the filterByClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:887)
    public void setFilterByClass(ClassDefinitionDMW value) {
        mycore.setFilterByClass(value.getDMO());
    }

    /**
     * Removes the filterByClass attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remFilterByClass(){
        mycore.remFilterByClass();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:870)
    public Integer getBlockingFactor(){
        return(mycore.getBlockingFactor());
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:909)
    public void setBlockingFactor(Object value) throws DmcValueException {
        mycore.setBlockingFactor(value);
    }

    /**
     * Sets blockingFactor to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:918)
    public void setBlockingFactor(Integer value){
        mycore.setBlockingFactor(value);
    }

    /**
     * Removes the blockingFactor attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remBlockingFactor(){
        mycore.remBlockingFactor();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:870)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:909)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:918)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remRequestID(){
        mycore.remRequestID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:870)
    public ScopeEnum getScope(){
        return(mycore.getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:909)
    public void setScope(Object value) throws DmcValueException {
        mycore.setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:918)
    public void setScope(ScopeEnum value){
        mycore.setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remScope(){
        mycore.remScope();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:870)
    public FullyQualifiedName getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:909)
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:918)
    public void setFQN(FullyQualifiedName value){
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:933)
    public void remFQN(){
        mycore.remFQN();
    }


}
