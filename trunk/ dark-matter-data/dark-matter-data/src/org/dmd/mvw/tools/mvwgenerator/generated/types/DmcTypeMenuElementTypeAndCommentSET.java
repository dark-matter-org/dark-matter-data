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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;    // base type import
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuElementTypeAndComment;    // DmcType import
/**
 * The DmcTypeMenuElementTypeAndCommentSET provides storage for a set of MenuElementTypeAndComment
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2306)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:126)
 */
@SuppressWarnings("serial")
public class DmcTypeMenuElementTypeAndCommentSET extends DmcTypeMenuElementTypeAndComment implements Serializable {
    
    Set<MenuElementTypeAndComment> value;
    
    public DmcTypeMenuElementTypeAndCommentSET(){
        value = null;
    }
    
    public DmcTypeMenuElementTypeAndCommentSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<MenuElementTypeAndComment>();
        else
            value = new TreeSet<MenuElementTypeAndComment>();
    }
    
    @Override
    public DmcTypeMenuElementTypeAndCommentSET getNew(){
        return(new DmcTypeMenuElementTypeAndCommentSET(attrInfo));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2343)
    public DmcAttribute<MenuElementTypeAndComment> cloneIt(){
        synchronized(this){
            DmcTypeMenuElementTypeAndCommentSET rc = getNew();
            for(MenuElementTypeAndComment val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2362)
    public MenuElementTypeAndComment add(Object v) throws DmcValueException {
        synchronized(this){
            MenuElementTypeAndComment rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2379)
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2398)
    public Iterator<MenuElementTypeAndComment> getMV(){
        synchronized(this){
            Set<MenuElementTypeAndComment> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<MenuElementTypeAndComment>(value);
            else
                clone = new TreeSet<MenuElementTypeAndComment>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2411)
    public Set<MenuElementTypeAndComment> getMVCopy(){
        synchronized(this){
            Set<MenuElementTypeAndComment> clone = null;
            if (attrInfo.valueType == ValueTypeEnum.HASHSET)
                clone = new HashSet<MenuElementTypeAndComment>(value);
            else
                clone = new TreeSet<MenuElementTypeAndComment>(value);
            return(clone);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2425)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2436)
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
