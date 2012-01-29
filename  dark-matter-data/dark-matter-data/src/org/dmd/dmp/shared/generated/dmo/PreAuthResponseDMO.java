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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:357)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;          // Base class
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The PreAuthResponse is sent as a result of a PreAuthRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PreAuthResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "PreAuthResponse";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public PreAuthResponseDMO() {
        super("PreAuthResponse");
    }

    protected PreAuthResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public String getApplicationName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__applicationName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applicationName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setApplicationName(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__applicationName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__applicationName);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__applicationName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applicationName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setApplicationName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__applicationName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__applicationName);
        
        attr.set(value);
        set(DmpDMSAG.__applicationName,attr);
    }

    /**
     * Removes the applicationName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remApplicationName(){
         rem(DmpDMSAG.__applicationName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public String getApplicationVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__applicationVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setApplicationVersion(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__applicationVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__applicationVersion);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__applicationVersion,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applicationVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setApplicationVersion(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__applicationVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__applicationVersion);
        
        attr.set(value);
        set(DmpDMSAG.__applicationVersion,attr);
    }

    /**
     * Removes the applicationVersion attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remApplicationVersion(){
         rem(DmpDMSAG.__applicationVersion);
    }




}