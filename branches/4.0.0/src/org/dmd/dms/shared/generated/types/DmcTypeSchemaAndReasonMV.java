//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:67)
import java.io.Serializable;                                              //  - (MVTypeFormatter.java:47)
import java.util.ArrayList;                                               //  - (MVTypeFormatter.java:48)
import java.util.Iterator;                                                //  - (MVTypeFormatter.java:49)
import org.dmd.core.DmcAttribute;                                         //  - (MVTypeFormatter.java:50)
import org.dmd.core.feedback.DMFeedbackSet;                               //  - (MVTypeFormatter.java:52)
import org.dmd.core.schema.DmcAttributeInfo;                              //  - (MVTypeFormatter.java:51)
import org.dmd.dms.shared.generated.types.DmcTypeSchemaAndReason;         // DmcType import - (MVTypeFormatter.java:64)
import org.dmd.dms.shared.generated.types.SchemaAndReason;                // Base type import - (MVTypeFormatter.java:59)


/**
 * The DmcTypeSchemaAndReasonMV provides storage for a multi-valued SchemaAndReason
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:73)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:116)
 */
@SuppressWarnings("serial")
public class DmcTypeSchemaAndReasonMV extends DmcTypeSchemaAndReason implements Serializable {
    
    private final static Iterator<SchemaAndReason> emptyList = (new ArrayList<SchemaAndReason>()).iterator();
    
    protected ArrayList<SchemaAndReason> value;
    
    public DmcTypeSchemaAndReasonMV(){
    
    }
    
    public DmcTypeSchemaAndReasonMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeSchemaAndReasonMV getNew(){
        return(new DmcTypeSchemaAndReasonMV(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:104)
    public DmcAttribute<SchemaAndReason> cloneIt(){
        synchronized(this){
            DmcTypeSchemaAndReasonMV rc = getNew();
    
            if (value == null)
                return(rc);
    
            if (getAttributeInfo().indexSize == 0){
                for(SchemaAndReason val: value)
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
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:137)
    public SchemaAndReason add(Object v) throws DMFeedbackSet {
        synchronized(this){
            SchemaAndReason rc = typeCheck(v);
            if (value == null)
                value = new ArrayList<SchemaAndReason>();
            value.add(rc);
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:150)
    public SchemaAndReason del(Object v){
        synchronized(this){
            if (value == null)
                return(null);
    
            SchemaAndReason key = null;
            SchemaAndReason rc = null;
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
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:177)
    public Iterator<SchemaAndReason> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);
    
            ArrayList<SchemaAndReason> clone = new ArrayList<SchemaAndReason>(value);
            return(clone.iterator());
        }
    }
    
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:189)
    public ArrayList<SchemaAndReason> getMVCopy(){
        synchronized(this){
            if (value == null)
                return(new ArrayList<SchemaAndReason>());
            else 
                return(new ArrayList<SchemaAndReason>(value));
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:201)
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
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:216)
    public SchemaAndReason getMVnth(int index){
        synchronized(this){
            if (value == null)
                return(null);
            return(value.get(index));
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:227)
    public SchemaAndReason setMVnth(int index, Object v) throws DMFeedbackSet {
        synchronized(this){
            if (getAttributeInfo().indexSize == 0)
                throw(new IllegalStateException("Attribute: " + getAttributeInfo().name + " is not indexed. You can't use setMVnth()."));
            
            if ( (index < 0) || (index >= getAttributeInfo().indexSize))
                throw(new IllegalStateException("Index " + index + " for attribute: " + getAttributeInfo().name + " is out of range: 0 <= index < " + getAttributeInfo().indexSize));
            
            SchemaAndReason rc = null;
            
            if (v != null)
                rc = typeCheck(v);
            
            if (value == null){
                value = new ArrayList<SchemaAndReason>(getAttributeInfo().indexSize);
                for(int i=0;i<getAttributeInfo().indexSize;i++)
                    value.add(null);
            }
            
            value.set(index, rc);
            
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:255)
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
    // org.dmd.dms.tools.generation.util.MVTypeFormatter.dumpMVType(MVTypeFormatter.java:279)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);

            try {
                SchemaAndReason val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

