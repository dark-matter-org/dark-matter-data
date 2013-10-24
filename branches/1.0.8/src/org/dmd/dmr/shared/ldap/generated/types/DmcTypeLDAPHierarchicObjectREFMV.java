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
package org.dmd.dmr.shared.ldap.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
/**
 * The DmcTypeLDAPHierarchicObjectREFMV provides storage for a multi-valued LDAPHierarchicObjectREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2270)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:531)
 */
@SuppressWarnings("serial")
public class DmcTypeLDAPHierarchicObjectREFMV extends DmcTypeLDAPHierarchicObjectREF implements Serializable {
    
    private final static Iterator<LDAPHierarchicObjectREF> emptyList = (new ArrayList<LDAPHierarchicObjectREF>()).iterator();
    
    protected ArrayList<LDAPHierarchicObjectREF> value;
    
    public DmcTypeLDAPHierarchicObjectREFMV(){
    
    }
    
    public DmcTypeLDAPHierarchicObjectREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeLDAPHierarchicObjectREFMV getNew(){
        return(new DmcTypeLDAPHierarchicObjectREFMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2302)
    public DmcAttribute<LDAPHierarchicObjectREF> cloneIt(){
        synchronized(this){
            DmcTypeLDAPHierarchicObjectREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (attrInfo.indexSize == 0){
                for(LDAPHierarchicObjectREF val: value)
                try {
                    rc.add(val);
                } catch (DmcValueException e) {
                    throw(new IllegalStateException("typeCheck() should never fail here!",e));
                }
            }
            else{
                for(int index=0; index<value.size(); index++)
                    try {
                        rc.setMVnth(index, value.get(index));
                    } catch (DmcValueException e) {
                        throw(new IllegalStateException("typeCheck() should never fail here!",e));
                    }
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2335)
    public LDAPHierarchicObjectREF add(Object v) throws DmcValueException {
        synchronized(this){
            LDAPHierarchicObjectREF rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<LDAPHierarchicObjectREF>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2348)
    public LDAPHierarchicObjectREF del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            LDAPHierarchicObjectREF key = null;
            LDAPHierarchicObjectREF rc = null;
            try {
                key = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            int indexof = value.indexOf(key);
            if (indexof != -1){
                rc = value.get(indexof);
                value.remove(rc);
            }

            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2382)
    public Iterator<LDAPHierarchicObjectREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<LDAPHierarchicObjectREF> clone = new ArrayList<LDAPHierarchicObjectREF>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2405)
    public ArrayList<LDAPHierarchicObjectREF> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<LDAPHierarchicObjectREF>());
            else{
                ArrayList<LDAPHierarchicObjectREF> rc = new  ArrayList<LDAPHierarchicObjectREF>(value.size());
                if (attrInfo.indexSize == 0){
                    for(LDAPHierarchicObjectREF val: value)
                        rc.add(val);
                }
                else{
                    // Initialize all of the indices to null
                    for(int i=0;i<attrInfo.indexSize;i++)
                        rc.add(null);
    
                    for(int index=0; index<value.size(); index++){
                        rc.set(index, value.get(index));
                    }
                }
                return(rc);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2441)
    public int getMVSize(){
        synchronized(this){
            if (attrInfo.indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(attrInfo.indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2456)
    public LDAPHierarchicObjectREF getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2467)
    public LDAPHierarchicObjectREF setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            LDAPHierarchicObjectREF rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<LDAPHierarchicObjectREF>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2495)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use hasValue()."));
            
            if (value == null)
                return(rc);
            
            for(int i=0; i<value.size(); i++){
                if (value.get(i) != null){
                    rc = true;
                    break;
                }
            }
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2519)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                LDAPHierarchicObjectREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

