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
import org.dmd.dmc.types.IntegerName;                             // Primitive type
import org.dmd.dmp.server.extended.NotifyRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * null
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class NotifyRequestDMW extends Request implements DmcNamedObjectIF {

    private NotifyRequestDMO mycore;

    public NotifyRequestDMW() {
        super(new NotifyRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
        mycore = (NotifyRequestDMO) core;
        mycore.setContainer(this);
    }

    public NotifyRequestDMW(DmcTypeModifierMV mods) {
        super(new NotifyRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
        mycore = (NotifyRequestDMO) core;
        mycore.setContainer(this);
    }

    public NotifyRequest getModificationRecorder(){
        NotifyRequest rc = new NotifyRequest();
        rc.setDmcObject(new NotifyRequestDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public NotifyRequestDMW(NotifyRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._NotifyRequest);
        mycore = (NotifyRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (NotifyRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public NotifyRequestDMO getDMO() {
        return(mycore);
    }

    protected NotifyRequestDMW(NotifyRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (NotifyRequestDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof NotifyRequestDMW){
            return( getObjectName().equals( ((NotifyRequestDMW) obj).getObjectName()) );
        }
        return(false);
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
