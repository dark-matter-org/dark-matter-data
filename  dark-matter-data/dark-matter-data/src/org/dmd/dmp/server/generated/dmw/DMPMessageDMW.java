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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:714)
import java.util.*;                                            // If not auxiliary
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dmc.types.IntegerName;                          // Primitive type
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;         // Abstract class
import org.dmd.dms.*;                                          // Always 2

/**
 * The DMPMessage class provides a common base for all messages that comprise
 * the Dark Matter Protocol (DMP).
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
public class DMPMessageDMW extends DmwWrapper implements DmcNamedObjectIF {

    private DMPMessageDMO mycore;

    protected DMPMessageDMW(DMPMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DMPMessageDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.DMPMessage>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:740)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DMPMessageDMW){
            return( getObjectName().equals( ((DMPMessageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:843)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:872)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:896)
    public void remRequestID(){
        mycore.remRequestID();
    }


}
