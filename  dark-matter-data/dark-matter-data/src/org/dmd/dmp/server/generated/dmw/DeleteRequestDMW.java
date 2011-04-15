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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcAttribute;                                  // Primitive type
import org.dmd.dmc.DmcObjectNameIF;                               // Generic args import
import org.dmd.dmc.types.IntegerName;                             // Primitive type
import org.dmd.dmp.server.extended.DeleteRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;              // Primitive type
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the FQN(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class DeleteRequestDMW extends Request implements DmcNamedObjectIF {

    private DeleteRequestDMO mycore;

    public DeleteRequestDMW() {
        super(new DeleteRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
        mycore = (DeleteRequestDMO) core;
        mycore.setContainer(this);
    }

    public DeleteRequestDMW(DmcTypeModifierMV mods) {
        super(new DeleteRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
        mycore = (DeleteRequestDMO) core;
        mycore.setContainer(this);
    }

    public DeleteRequest getModificationRecorder(){
        DeleteRequest rc = new DeleteRequest();
        rc.setDmcObject(new DeleteRequestDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public DeleteRequestDMW(DeleteRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
        mycore = (DeleteRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (DeleteRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public DeleteRequestDMO getDMO() {
        return(mycore);
    }

    protected DeleteRequestDMW(DeleteRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DeleteRequestDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DeleteRequestDMW){
            return( getObjectName().equals( ((DeleteRequestDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public DmcAttribute<DmcObjectNameIF> getObjName(){
        return(mycore.getObjName());
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeDmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setObjName(Object value) throws DmcValueException {
        mycore.setObjName(value);
    }

    /**
     * Sets objName to the specified value.
     * @param value DmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setObjName(DmcAttribute<DmcObjectNameIF> value){
        mycore.setObjName(value);
    }

    /**
     * Removes the objName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remObjName(){
        mycore.remObjName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public ScopeEnum getScope(){
        return(mycore.getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setScope(Object value) throws DmcValueException {
        mycore.setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setScope(ScopeEnum value){
        mycore.setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remScope(){
        mycore.remScope();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remRequestID(){
        mycore.remRequestID();
    }


}
