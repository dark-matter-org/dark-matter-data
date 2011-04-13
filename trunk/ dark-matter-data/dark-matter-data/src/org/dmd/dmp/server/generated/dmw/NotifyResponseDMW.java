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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmc.types.IntegerName;                              // Primitive type
import org.dmd.dmp.server.extended.NotifyResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * null
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class NotifyResponseDMW extends Response implements DmcNamedObjectIF {

    private NotifyResponseDMO mycore;

    public NotifyResponseDMW() {
        super(new NotifyResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
        mycore = (NotifyResponseDMO) core;
        mycore.setContainer(this);
    }

    public NotifyResponseDMW(DmcTypeModifierMV mods) {
        super(new NotifyResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
        mycore = (NotifyResponseDMO) core;
        mycore.setContainer(this);
    }

    public NotifyResponseDMW getModificationRecorder(){
        NotifyResponseDMW rc = new NotifyResponse();
        rc.setDmcObject(new NotifyResponseDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public NotifyResponseDMW(NotifyResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._NotifyResponse);
        mycore = (NotifyResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (NotifyResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public NotifyResponseDMO getDMO() {
        return(mycore);
    }

    protected NotifyResponseDMW(NotifyResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (NotifyResponseDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof NotifyResponseDMW){
            return( getObjectName().equals( ((NotifyResponseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remRequestID(){
        mycore.remRequestID();
    }


}
