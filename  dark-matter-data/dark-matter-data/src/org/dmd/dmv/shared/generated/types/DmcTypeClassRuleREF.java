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
package org.dmd.dmv.shared.generated.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.util.exceptions.ResultException;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ClassRule
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:105)
 */
@SuppressWarnings("serial")
public class DmcTypeClassRuleREF extends DmcAttribute<ClassRuleDMO> {

    public DmcTypeClassRuleREF(){
    }

    protected ClassRuleDMO typeCheck(Object value) throws DmcValueException {
        ClassRuleDMO rc = null;

        if (value instanceof ClassRuleDMO){
            rc = (ClassRuleDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ClassRuleDMO expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (ClassRuleDMO t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeClassRuleREF getOneOfMe(){
        DmcTypeClassRuleREF rc = new DmcTypeClassRuleREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ClassRuleDMO cloneValue(ClassRuleDMO val){
        return(null);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws ResultException {
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws ResultException {
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws ResultException {
    }
}
