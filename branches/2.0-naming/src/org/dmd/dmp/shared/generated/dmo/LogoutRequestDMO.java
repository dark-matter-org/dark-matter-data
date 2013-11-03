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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                       // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                   // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                              // Any attributes - (GenUtility.java:238)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                // Base class - (GenUtility.java:352)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Attribute from dmrbase schema - (GenUtility.java:194)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeStringSV;                // Required type - (GenUtility.java:325)

/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class LogoutRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "LogoutRequest";


    static {
    }

    public LogoutRequestDMO() {
        super("LogoutRequest");
    }

    protected LogoutRequestDMO(String oc) {
        super(oc);
    }

    @Override
    public LogoutRequestDMO getNew(){
        LogoutRequestDMO rc = new LogoutRequestDMO();
        return(rc);
    }

    @Override
    public LogoutRequestDMO getSlice(DmcSliceInfo info){
        LogoutRequestDMO rc = new LogoutRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LogoutRequestDMO(DmcTypeModifierMV mods) {
        super("LogoutRequest");
        modrec(true);
        setModifier(mods);
    }

    public LogoutRequestDMO getModificationRecorder(){
        LogoutRequestDMO rc = new LogoutRequestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getUserName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmrbaseDMSAG.__userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setUserName(String value) {
        DmcAttribute<?> attr = get(DmrbaseDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrbaseDMSAG.__userName);
        
        try{
            attr.set(value);
            set(DmrbaseDMSAG.__userName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setUserName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmrbaseDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrbaseDMSAG.__userName);
        
        attr.set(value);
        set(DmrbaseDMSAG.__userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remUserName(){
         rem(DmrbaseDMSAG.__userName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSessionID(){
         rem(DmpDMSAG.__sessionID);
    }




}