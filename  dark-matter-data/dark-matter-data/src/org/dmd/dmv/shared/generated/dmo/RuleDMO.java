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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:307)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                            // Always required
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcObject;                                   // Structural class
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;               // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;             // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * A Rule is meant to represent an object that defines the validation logic
 * to be applied to Dark Matter Object as a whole or to its attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class RuleDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Rule";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",300,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__ruleTitle.id,__ruleTitle);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__ruleTitle.name,__ruleTitle);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public RuleDMO() {
        super("Rule");
    }

    protected RuleDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:739)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof RuleDMO){
            return( getObjectName().equals( ((RuleDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:662)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:710)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:725)
    public void remName(){
         rem(__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:662)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:710)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:725)
    public void remRuleTitle(){
         rem(__ruleTitle);
    }




}
