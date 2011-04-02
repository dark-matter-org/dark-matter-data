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

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:607)
import java.io.Serializable;                                      // Always required
import java.util.*;                                               // Always required
import org.dmd.dmc.DmcAttribute;                                  // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                              // Always required
import org.dmd.dmc.DmcValueException;                             // Any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                 // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringSV;               // Required type
import org.dmd.dmv.shared.generated.dmo.AttributeRuleDMO;         // Base class

/**
 * null
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class IntegerRangeRuleDMO  extends AttributeRuleDMO  implements Serializable  {

    public final static String constructionClassName = "IntegerRangeRule";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("applyToAttribute",303,"AttributeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",300,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__applyToAttribute.id,__applyToAttribute);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__ruleTitle.id,__ruleTitle);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__applyToAttribute.name,__applyToAttribute);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__ruleTitle.name,__ruleTitle);
    }

    public IntegerRangeRuleDMO() {
        super("IntegerRangeRule");
    }

    protected IntegerRangeRuleDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public IntegerRangeRuleDMO getNew(){
        IntegerRangeRuleDMO rc = new IntegerRangeRuleDMO();
        return(rc);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:600)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:633)
    public void setRuleTitle(String value) {
        DmcAttribute<?> attr = get(__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(__ruleTitle);
        
        try{
            attr.set(value);
            set(__ruleTitle,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(__ruleTitle);
        
        attr.set(value);
        set(__ruleTitle,attr);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:675)
    public void remRuleTitle(){
         rem(__ruleTitle);
    }




}
