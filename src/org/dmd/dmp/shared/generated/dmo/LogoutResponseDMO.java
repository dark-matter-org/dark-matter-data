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

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:101)
import java.io.Serializable;                                         // Always required - (ImportUtil.java:300)
import org.dmd.core.DmcAttribute;                                    // Any attributes - (ImportUtil.java:309)
import org.dmd.core.feedback.DMFeedbackSet;                          // Any attributes - (ImportUtil.java:310)
import org.dmd.core.schema.DmcSliceInfo;                             // Required for object slicing - (ImportUtil.java:305)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                 // Base class - (ImportUtil.java:412)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;           // Required for MODREC constructor - (ImportUtil.java:304)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (ImportUtil.java:303)
import org.dmd.dms.shared.generated.types.DmcTypeStringSV;           // Required type - (ImportUtil.java:386)

// Generated from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The LogoutResponse will indicate that you have successfully terminated

 * your current session.
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.generation.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
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
        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpCompactSchema.__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__sessionID);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__sessionID,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setSessionID(Object value) throws DMFeedbackSet {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpCompactSchema.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__sessionID);
        
        attr.set(value);
        set(DmpCompactSchema.__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dms.tools.generation.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remSessionID(){
         rem(DmpCompactSchema.__sessionID);
    }




}
