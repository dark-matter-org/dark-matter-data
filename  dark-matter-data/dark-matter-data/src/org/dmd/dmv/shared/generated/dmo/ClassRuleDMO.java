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

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
// import 3.1 ClassDefinition
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.dms.generated.types.ClassDefinitionREF;
// import 4
import org.dmd.dms.generated.types.ClassDefinitionREF;

// import 6
import org.dmd.dmv.shared.generated.dmo.RuleDMO;

@SuppressWarnings("serial")
/**
 * The ClassRule is a rule that applies to an entire object and its
 * collection of attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
abstract public class ClassRuleDMO  extends RuleDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __applyToClass = new DmcAttributeInfo("applyToClass",302,"ClassDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",300,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__applyToClass.id,__applyToClass);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__ruleTitle.id,__ruleTitle);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__applyToClass.name,__applyToClass);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__ruleTitle.name,__ruleTitle);
    }

    public ClassRuleDMO() {
        super("ClassRule",_ImAp,_SmAp);
    }

    protected ClassRuleDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public ClassRuleDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public ClassRuleDMO(ClassRuleDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    public ClassDefinitionREF getApplyToClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__applyToClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setApplyToClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__applyToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(__applyToClass,attr);
    }

    /**
     * Removes the applyToClass attribute value.
     */
    public void remApplyToClass(){
         rem(__applyToClass);
    }




}
