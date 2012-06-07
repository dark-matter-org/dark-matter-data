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
package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                  // Always required - (GenUtility.java:197)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:214)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:301)
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;         // Base class - (GenUtility.java:328)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MustRuleDMO  extends ClassRuleDMO  implements Serializable  {

    public final static String constructionClassName = "MustRule";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MustRuleDMO() {
        super("MustRule");
    }

    protected MustRuleDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MustRuleDMO getNew(){
        MustRuleDMO rc = new MustRuleDMO();
        return(rc);
    }

    @Override
    public MustRuleDMO getSlice(DmcSliceInfo info){
        MustRuleDMO rc = new MustRuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MustRuleDMO(DmcTypeModifierMV mods) {
        super("MustRule");
        modrec(true);
        setModifier(mods);
    }

    public MustRuleDMO getModificationRecorder(){
        MustRuleDMO rc = new MustRuleDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmvDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setRuleTitle(String value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(DmvDMSAG.__ruleTitle);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__ruleTitle,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmvDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(DmvDMSAG.__ruleTitle);
        
        attr.set(value);
        set(DmvDMSAG.__ruleTitle,attr);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remRuleTitle(){
         rem(DmvDMSAG.__ruleTitle);
    }




}
