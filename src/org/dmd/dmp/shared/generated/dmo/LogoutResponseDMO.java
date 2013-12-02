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
package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                  // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:241)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;          // Base class - (GenUtility.java:355)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:328)

/**
 * The LogoutResponse will indicate that you have successfully terminated\n
 * your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class LogoutResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "LogoutResponse";


    static {
    }

    public LogoutResponseDMO() {
        super("LogoutResponse");
    }

    protected LogoutResponseDMO(String oc) {
        super(oc);
    }

    @Override
    public LogoutResponseDMO getNew(){
        LogoutResponseDMO rc = new LogoutResponseDMO();
        return(rc);
    }

    @Override
    public LogoutResponseDMO getSlice(DmcSliceInfo info){
        LogoutResponseDMO rc = new LogoutResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LogoutResponseDMO(DmcTypeModifierMV mods) {
        super("LogoutResponse");
        modrec(true);
        setModifier(mods);
    }

    public LogoutResponseDMO getModificationRecorder(){
        LogoutResponseDMO rc = new LogoutResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__sessionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setSessionID(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        attr.set(value);
        set(DmpDMSAG.__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remSessionID(){
         rem(DmpDMSAG.__sessionID);
    }




}
