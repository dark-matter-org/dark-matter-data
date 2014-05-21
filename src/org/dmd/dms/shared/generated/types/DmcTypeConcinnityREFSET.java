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


/**
 * The DmcTypeConcinnityREFSET provides storage for a set of ConcinnityREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:68)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:84)
 */
@SuppressWarnings("serial")
public class DmcTypeConcinnityREFSET extends DmcTypeConcinnityREF implements Serializable {
    
     private final static Iterator<ConcinnityREF> emptyList =  (new HashSet<ConcinnityREF>()).iterator();
    
    
    protected Set<ConcinnityREF> value;
    
    public DmcTypeConcinnityREFSET(){
        value = null;
    }
    
    public DmcTypeConcinnityREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<ConcinnityREF>();
        else
            value = new TreeSet<ConcinnityREF>();
    }
    
    @Override
    public DmcTypeConcinnityREFSET getNew(){
        return(new DmcTypeConcinnityREFSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:109)
    public DmcAttribute<ConcinnityREF> cloneIt(){
        synchronized(this){
            DmcTypeConcinnityREFSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(ConcinnityREF val: value)
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
    public ConcinnityREF add(Object v) throws DMFeedbackSet {
        synchronized(this){
            ConcinnityREF rc = typeCheck(v);
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
    public ConcinnityREF del(Object v){
        synchronized(this){
            ConcinnityREF rc = null;
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
    public Iterator<ConcinnityREF> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<ConcinnityREF>(value)).iterator() );
            else
                return( (new TreeSet<ConcinnityREF>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:188)
    public Set<ConcinnityREF> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<ConcinnityREF>());
                else
                    return(new HashSet<ConcinnityREF>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<ConcinnityREF>(value));
                else
                    return(new TreeSet<ConcinnityREF>(value));
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
                ConcinnityREF val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

