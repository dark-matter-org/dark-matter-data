//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;    // base type import
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuElementTypeAndComment;    // DmcType import
/**
 * The DmcTypeMenuElementTypeAndCommentMV provides storage for a multi-valued MenuElementTypeAndComment
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2037)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeMenuElementTypeAndCommentMV extends DmcTypeMenuElementTypeAndComment implements Serializable {
    
    ArrayList<MenuElementTypeAndComment> value;
    
    public DmcTypeMenuElementTypeAndCommentMV(){
    
    }
    
    public DmcTypeMenuElementTypeAndCommentMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeMenuElementTypeAndCommentMV getNew(){
        return(new DmcTypeMenuElementTypeAndCommentMV(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2065)
    public DmcAttribute<MenuElementTypeAndComment> cloneIt(){
        synchronized(this){
            DmcTypeMenuElementTypeAndCommentMV rc = getNew();
            if (attrInfo.indexSize == 0){
                for(MenuElementTypeAndComment val: value)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2094)
    public MenuElementTypeAndComment add(Object v) throws DmcValueException {
        synchronized(this){
            MenuElementTypeAndComment rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<MenuElementTypeAndComment>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2107)
    public MenuElementTypeAndComment del(Object v){
        synchronized(this){
            MenuElementTypeAndComment rc = null;
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc))
                value.remove(rc);
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2126)
    public Iterator<MenuElementTypeAndComment> getMV(){
        synchronized(this){
            ArrayList<MenuElementTypeAndComment> clone = new ArrayList<MenuElementTypeAndComment>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2135)
    public ArrayList<MenuElementTypeAndComment> getMVCopy(){
        synchronized(this){
            ArrayList<MenuElementTypeAndComment> clone = new ArrayList<MenuElementTypeAndComment>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2145)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2156)
    public MenuElementTypeAndComment getMVnth(int index){
        synchronized(this){
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2165)
    public MenuElementTypeAndComment setMVnth(int index, Object v) throws DmcValueException {
        synchronized(this){
            if (attrInfo.indexSize == 0)
                throw(new IllegalStateException("Attribute: " + attrInfo.name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= attrInfo.indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + attrInfo.name + " is out of range: 0 <= index < " + attrInfo.indexSize));
            
            MenuElementTypeAndComment rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<MenuElementTypeAndComment>(attrInfo.indexSize);
                for(int i=0;i<attrInfo.indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2193)
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
    // org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:2217)
    public boolean contains(Object v){
        synchronized(this){
            boolean rc = false;
            try {
                MenuElementTypeAndComment val = typeCheck(v);
                rc = value.contains(val);
            } catch (DmcValueException e) {
            }
            return(rc);
        }
    }
    
}

