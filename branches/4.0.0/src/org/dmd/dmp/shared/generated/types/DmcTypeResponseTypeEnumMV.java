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
package org.dmd.dmp.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:66)
import java.io.Serializable;                                        // Standard marker interface - (MVTypeFormatter.java:46)
import java.util.ArrayList;                                         // Storage of values - (MVTypeFormatter.java:47)
import java.util.Iterator;                                          // Access to values - (MVTypeFormatter.java:48)
import org.dmd.core.DmcAttribute;                                   // What we're derived from - (MVTypeFormatter.java:49)
import org.dmd.core.feedback.DMFeedbackSet;                         // To handle errors - (MVTypeFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                        // To allow construction - (MVTypeFormatter.java:50)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;         // DmcType import - (MVTypeFormatter.java:63)


/**
 * The DmcTypeResponseTypeEnumMV provides storage for a multi-valued ResponseTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:72)
 *    Called from: org.dmd.dms.tools.dmogen.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:346)
 */
@SuppressWarnings("serial")
public class DmcTypeResponseTypeEnumMV extends DmcTypeResponseTypeEnum implements Serializable {
    
    private final static Iterator<ResponseTypeEnum> emptyList = (new ArrayList<ResponseTypeEnum>()).iterator();
    
    protected ArrayList<ResponseTypeEnum> value;
    
    public DmcTypeResponseTypeEnumMV(){
    
    }
    
    public DmcTypeResponseTypeEnumMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeResponseTypeEnumMV getNew(){
        return(new DmcTypeResponseTypeEnumMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:103)
    public DmcAttribute<ResponseTypeEnum> cloneIt(){
        synchronized(this){
            DmcTypeResponseTypeEnumMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(ResponseTypeEnum val: value)
                try {
                    rc.add(val);
                } catch (DMFeedbackSet e) {
                    throw(new IllegalStateException("typeCheck() should never fail here!",e));
                }
            }
            else{
                for(int index=0; index<value.size(); index++)
                    try {
                        rc.setMVnth(index, value.get(index));
                    } catch (DMFeedbackSet e) {
                        throw(new IllegalStateException("typeCheck() should never fail here!",e));
                    }
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:136)
    public ResponseTypeEnum add(Object v) throws DMFeedbackSet {
        synchronized(this){
            ResponseTypeEnum rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<ResponseTypeEnum>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:149)
    public ResponseTypeEnum del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            ResponseTypeEnum key = null;
            ResponseTypeEnum rc = null;
            try {
                key = typeCheck(v);
            } catch (DMFeedbackSet e) {
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
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:176)
    public Iterator<ResponseTypeEnum> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<ResponseTypeEnum> clone = new ArrayList<ResponseTypeEnum>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:188)
    public ArrayList<ResponseTypeEnum> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<ResponseTypeEnum>());
            else 
                return(new ArrayList<ResponseTypeEnum>(value));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:200)
    public int getMVSize(){
        synchronized(this){
            if (getAttributeInfo().indexSize == 0){
                if (value == null)
                    return(0);
                return(value.size());
            }
            else
                return(getAttributeInfo().indexSize);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:215)
    public ResponseTypeEnum getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:226)
    public ResponseTypeEnum setMVnth(int index, Object v) throws DMFeedbackSet {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            ResponseTypeEnum rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<ResponseTypeEnum>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:254)
    public boolean hasValue(){
        synchronized(this){
            boolean rc = false;
            
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use hasValue()."));
            
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
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:278)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                ResponseTypeEnum val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

