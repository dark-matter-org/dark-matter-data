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
import java.util.*;                                              // If not auxiliary
import org.dmd.dmc.*;                                            // If any attributes
import org.dmd.dmc.types.IntegerName;                            // Primitive type
import org.dmd.dmp.server.extended.Request;                      // Derived class
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                            // Always 2

/**
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class LoginRequestDMW extends Request implements DmcNamedObjectIF {

    private LoginRequestDMO mycore;

    public LoginRequestDMW() {
        super(new LoginRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    public LoginRequestDMW(LoginRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._LoginRequest);
        mycore = (LoginRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (LoginRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected LoginRequestDMW(LoginRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LoginRequestDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.LoginRequest>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:740)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof LoginRequestDMW){
            return( getObjectName().equals( ((LoginRequestDMW) obj).getObjectName()) );
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

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:843)
    public String getUserName(){
        return(mycore.getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:872)
    public void setUserName(Object value) throws DmcValueException {
        mycore.setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public void setUserName(String value){
        mycore.setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:896)
    public void remUserName(){
        mycore.remUserName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:843)
    public String getPassword(){
        return(mycore.getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:872)
    public void setPassword(Object value) throws DmcValueException {
        mycore.setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public void setPassword(String value){
        mycore.setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:896)
    public void remPassword(){
        mycore.remPassword();
    }


}
