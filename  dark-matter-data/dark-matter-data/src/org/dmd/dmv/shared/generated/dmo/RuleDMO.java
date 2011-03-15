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

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:709)
import java.util.*;                                       // Always required
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                      // Named object
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeString;                   // Required type
import org.dmd.dmc.types.DmcTypeStringName;               // Required type
import org.dmd.dmc.types.StringName;                      // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;           // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Always required

/**
 * A Rule is meant to represent an object that defines the validation logic
 * to be applied to Dark Matter Object as a whole or to its attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
abstract public class RuleDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",300,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__ruleTitle.id,__ruleTitle);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__ruleTitle.name,__ruleTitle);
    }

    public RuleDMO() {
        super("Rule",_ImAp,_SmAp);
    }

    protected RuleDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public RuleDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public RuleDMO(RuleDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:785)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof RuleDMO){
            return( getObjectName().equals( ((RuleDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remName(){
         rem(__name);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getRuleTitle(){
        DmcTypeString attr = (DmcTypeString) get(__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__ruleTitle);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__ruleTitle,attr);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remRuleTitle(){
         rem(__ruleTitle);
    }




}
