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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:323)
import java.io.Serializable;                                          // Always required
import java.util.*;                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                      // Any attributes
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                 // Any attributes
import org.dmd.dmc.types.NameContainer;                               // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                  // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;         // Required type
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                   // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The DenotifyResponse is sent as a result of a DenotifyRequest.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class DenotifyResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "DenotifyResponse";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public DenotifyResponseDMO() {
        super("DenotifyResponse");
    }

    protected DenotifyResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public DenotifyResponseDMO getNew(){
        DenotifyResponseDMO rc = new DenotifyResponseDMO();
        return(rc);
    }

    @Override
    public DenotifyResponseDMO getSlice(DmcSliceInfo info){
        DenotifyResponseDMO rc = new DenotifyResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DenotifyResponseDMO(DmcTypeModifierMV mods) {
        super("DenotifyResponse");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public NameContainer getTarget(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmpDMSAG.__target);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setTarget(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:707)
    public void setTarget(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setTarget(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        attr.set(value);
        set(DmpDMSAG.__target,attr);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remTarget(){
         rem(DmpDMSAG.__target);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(DmpDMSAG.__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        attr.set(value);
        set(DmpDMSAG.__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remScope(){
         rem(DmpDMSAG.__scope);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public String getFilter(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__filter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets filter to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setFilter(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__filter);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__filter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets filter to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setFilter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__filter);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__filter);
        
        attr.set(value);
        set(DmpDMSAG.__filter,attr);
    }

    /**
     * Removes the filter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remFilter(){
         rem(DmpDMSAG.__filter);
    }




}
