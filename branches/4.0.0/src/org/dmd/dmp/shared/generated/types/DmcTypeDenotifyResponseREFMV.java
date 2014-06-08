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
import java.io.Serializable;                                         // Standard marker interface - (MVTypeFormatter.java:46)
import java.util.ArrayList;                                          // Storage of values - (MVTypeFormatter.java:47)
import java.util.Iterator;                                           // Access to values - (MVTypeFormatter.java:48)
import org.dmd.core.DmcAttribute;                                    // What we're derived from - (MVTypeFormatter.java:49)
import org.dmd.core.feedback.DMFeedbackSet;                          // To handle errors - (MVTypeFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                         // To allow construction - (MVTypeFormatter.java:50)
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;         // DmcType import - (MVTypeFormatter.java:63)


/**
 * The DmcTypeDenotifyResponseREFMV provides storage for a multi-valued DenotifyResponse
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:72)
 *    Called from: org.dmd.dms.tools.dmogen.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:250)
 */
@SuppressWarnings("serial")
public class DmcTypeDenotifyResponseREFMV extends DmcTypeDenotifyResponseREF implements Serializable {
    
    private final static Iterator<DenotifyResponseDMO> emptyList = (new ArrayList<DenotifyResponseDMO>()).iterator();
    
    protected ArrayList<DenotifyResponseDMO> value;
    
    public DmcTypeDenotifyResponseREFMV(){
    
    }
    
    public DmcTypeDenotifyResponseREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeDenotifyResponseREFMV getNew(){
        return(new DmcTypeDenotifyResponseREFMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:103)
    public DmcAttribute<DenotifyResponseDMO> cloneIt(){
        synchronized(this){
            DmcTypeDenotifyResponseREFMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(DenotifyResponseDMO val: value)
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
    public DenotifyResponseDMO add(Object v) throws DMFeedbackSet {
        synchronized(this){
            DenotifyResponseDMO rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<DenotifyResponseDMO>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:149)
    public DenotifyResponseDMO del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            DenotifyResponseDMO key = null;
            DenotifyResponseDMO rc = null;
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
    public Iterator<DenotifyResponseDMO> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<DenotifyResponseDMO> clone = new ArrayList<DenotifyResponseDMO>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:188)
    public ArrayList<DenotifyResponseDMO> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<DenotifyResponseDMO>());
            else 
                return(new ArrayList<DenotifyResponseDMO>(value));
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
    public DenotifyResponseDMO getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:226)
    public DenotifyResponseDMO setMVnth(int index, Object v) throws DMFeedbackSet {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            DenotifyResponseDMO rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<DenotifyResponseDMO>(getAttributeInfo().indexSize);
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
                DenotifyResponseDMO val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

