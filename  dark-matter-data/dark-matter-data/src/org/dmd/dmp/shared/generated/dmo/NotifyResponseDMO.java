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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;          // Base class
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The NotifyResponse is sent as the result of a NotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class NotifyResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "NotifyResponse";

    public final static DmcClassInfo classInfo = DmpDMSAG.__NotifyResponse;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NotifyResponseDMO() {
        super("NotifyResponse");
    }

    protected NotifyResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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




}
