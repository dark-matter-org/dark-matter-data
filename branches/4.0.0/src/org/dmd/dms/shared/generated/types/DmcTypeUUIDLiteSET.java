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
// Called from: org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:62)
import java.io.Serializable;                                     //  - (SETTypeFormatter.java:46)
import java.util.HashSet;                                        //  - (SETTypeFormatter.java:48)
import java.util.Iterator;                                       //  - (SETTypeFormatter.java:50)
import java.util.Set;                                            //  - (SETTypeFormatter.java:47)
import java.util.TreeSet;                                        //  - (SETTypeFormatter.java:49)
import org.dmd.core.DmcAttribute;                                //  - (SETTypeFormatter.java:51)
import org.dmd.core.feedback.DMFeedbackSet;                      //  - (SETTypeFormatter.java:53)
import org.dmd.core.schema.DmcAttributeInfo;                     //  - (SETTypeFormatter.java:52)
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;         //  - (SETTypeFormatter.java:54)
import org.dmd.dms.shared.types.DmcTypeUUIDLite;                 // DmcType import - (SETTypeFormatter.java:60)
import org.dmd.dms.shared.types.UUIDLite;                        // Base type import - (SETTypeFormatter.java:57)


/**
 * The DmcTypeUUIDLiteSET provides storage for a set of UUIDLite
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:68)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:120)
 */
@SuppressWarnings("serial")
public class DmcTypeUUIDLiteSET extends DmcTypeUUIDLite implements Serializable {
    
     private final static Iterator<UUIDLite> emptyList =  (new HashSet<UUIDLite>()).iterator();
    
    
    protected Set<UUIDLite> value;
    
    public DmcTypeUUIDLiteSET(){
        value = null;
    }
    
    public DmcTypeUUIDLiteSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<UUIDLite>();
        else
            value = new TreeSet<UUIDLite>();
    }
    
    @Override
    public DmcTypeUUIDLiteSET getNew(){
        return(new DmcTypeUUIDLiteSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:109)
    public DmcAttribute<UUIDLite> cloneIt(){
        synchronized(this){
            DmcTypeUUIDLiteSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(UUIDLite val: value)
            try {
                rc.add(val);
            } catch (DMFeedbackSet e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:132)
    public UUIDLite add(Object v) throws DMFeedbackSet {
        synchronized(this){
            UUIDLite rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:149)
    public UUIDLite del(Object v){
        synchronized(this){
            UUIDLite rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DMFeedbackSet e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:174)
    public Iterator<UUIDLite> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<UUIDLite>(value)).iterator() );
            else
                return( (new TreeSet<UUIDLite>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:188)
    public Set<UUIDLite> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<UUIDLite>());
                else
                    return(new HashSet<UUIDLite>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<UUIDLite>(value));
                else
                    return(new TreeSet<UUIDLite>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:208)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:219)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                UUIDLite val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

