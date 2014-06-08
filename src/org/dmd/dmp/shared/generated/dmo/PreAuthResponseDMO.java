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
// Called from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:101)
import java.io.Serializable;                                         // Always required - (ImportUtil.java:300)
import org.dmd.core.DmcAttribute;                                    // Any attributes - (ImportUtil.java:309)
import org.dmd.core.feedback.DMFeedbackSet;                          // Any attributes - (ImportUtil.java:310)
import org.dmd.core.schema.DmcSliceInfo;                             // Required for object slicing - (ImportUtil.java:305)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                 // Base class - (ImportUtil.java:412)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;           // Required for MODREC constructor - (ImportUtil.java:304)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (ImportUtil.java:303)
import org.dmd.dms.shared.generated.types.DmcTypeStringSV;           // Required type - (ImportUtil.java:386)

// Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The PreAuthResponse is sent as a result of a PreAuthRequest.
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
 */
@SuppressWarnings("serial")
public class PreAuthResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "PreAuthResponse";


    static {
    }

    public PreAuthResponseDMO() {
        super("PreAuthResponse");
    }

    protected PreAuthResponseDMO(String oc) {
        super(oc);
    }

    @Override
    public PreAuthResponseDMO getNew(){
        PreAuthResponseDMO rc = new PreAuthResponseDMO();
        return(rc);
    }

    @Override
    public PreAuthResponseDMO getSlice(DmcSliceInfo info){
        PreAuthResponseDMO rc = new PreAuthResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PreAuthResponseDMO(DmcTypeModifierMV mods) {
        super("PreAuthResponse");
        modrec(true);
        setModifier(mods);
    }

    public PreAuthResponseDMO getModificationRecorder(){
        PreAuthResponseDMO rc = new PreAuthResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public String getApplicationName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpCompactSchema.__applicationName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applicationName to the specified value.
     * @param value String
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setApplicationName(String value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__applicationName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__applicationName);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__applicationName,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applicationName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setApplicationName(Object value) throws DMFeedbackSet {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpCompactSchema.__applicationName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__applicationName);
        
        attr.set(value);
        set(DmpCompactSchema.__applicationName,attr);
    }

    /**
     * Removes the applicationName attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remApplicationName(){
         rem(DmpCompactSchema.__applicationName);
    }

    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:175)
    public String getApplicationVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpCompactSchema.__applicationVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value String
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:215)
    public void setApplicationVersion(String value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__applicationVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__applicationVersion);
        
        try{
            attr.set(value);
            set(DmpCompactSchema.__applicationVersion,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:263)
    public void setApplicationVersion(Object value) throws DMFeedbackSet {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpCompactSchema.__applicationVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpCompactSchema.__applicationVersion);
        
        attr.set(value);
        set(DmpCompactSchema.__applicationVersion,attr);
    }

    /**
     * Removes the applicationVersion attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatSV(AccessFunctionFormatter.java:282)
    public void remApplicationVersion(){
         rem(DmpCompactSchema.__applicationVersion);
    }




}
