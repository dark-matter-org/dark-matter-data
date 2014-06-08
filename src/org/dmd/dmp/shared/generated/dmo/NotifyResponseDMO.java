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
import org.dmd.core.schema.DmcSliceInfo;                             // Required for object slicing - (ImportUtil.java:305)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                 // Base class - (ImportUtil.java:412)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;           // Required for MODREC constructor - (ImportUtil.java:304)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (ImportUtil.java:303)

// Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The NotifyResponse is sent as the result of a NotifyRequest.
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
 */
@SuppressWarnings("serial")
public class NotifyResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "NotifyResponse";


    static {
    }

    public NotifyResponseDMO() {
        super("NotifyResponse");
    }

    protected NotifyResponseDMO(String oc) {
        super(oc);
    }

    @Override
    public NotifyResponseDMO getNew(){
        NotifyResponseDMO rc = new NotifyResponseDMO();
        return(rc);
    }

    @Override
    public NotifyResponseDMO getSlice(DmcSliceInfo info){
        NotifyResponseDMO rc = new NotifyResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NotifyResponseDMO(DmcTypeModifierMV mods) {
        super("NotifyResponse");
        modrec(true);
        setModifier(mods);
    }

    public NotifyResponseDMO getModificationRecorder(){
        NotifyResponseDMO rc = new NotifyResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));
        rc.modrec(true);
        return(rc);
    }




}
