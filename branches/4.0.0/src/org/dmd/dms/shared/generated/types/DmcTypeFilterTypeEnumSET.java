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
// Called from: org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:61)
import java.io.Serializable;                                      //  - (SETTypeFormatter.java:45)
import java.util.HashSet;                                         //  - (SETTypeFormatter.java:47)
import java.util.Iterator;                                        //  - (SETTypeFormatter.java:49)
import java.util.Set;                                             //  - (SETTypeFormatter.java:46)
import java.util.TreeSet;                                         //  - (SETTypeFormatter.java:48)
import org.dmd.core.DmcAttribute;                                 //  - (SETTypeFormatter.java:50)
import org.dmd.core.feedback.DMFeedbackSet;                       //  - (SETTypeFormatter.java:52)
import org.dmd.core.schema.DmcAttributeInfo;                      //  - (SETTypeFormatter.java:51)
import org.dmd.dms.shared.generated.enums.FilterTypeEnum;         // DmcType import - (SETTypeFormatter.java:59)
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;          //  - (SETTypeFormatter.java:53)


/**
 * The DmcTypeFilterTypeEnumSET provides storage for a set of FilterTypeEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:67)
 *    Called from: org.dmd.dms.tools.generation.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:57)
 */
@SuppressWarnings("serial")
public class DmcTypeFilterTypeEnumSET extends DmcTypeFilterTypeEnum implements Serializable {
    
     private final static Iterator<FilterTypeEnum> emptyList =  (new HashSet<FilterTypeEnum>()).iterator();
    
    
    protected Set<FilterTypeEnum> value;
    
    public DmcTypeFilterTypeEnumSET(){
        value = null;
    }
    
    public DmcTypeFilterTypeEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<FilterTypeEnum>();
        else
            value = new TreeSet<FilterTypeEnum>();
    }
    
    @Override
    public DmcTypeFilterTypeEnumSET getNew(){
        return(new DmcTypeFilterTypeEnumSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:108)
    public DmcAttribute<FilterTypeEnum> cloneIt(){
        synchronized(this){
            DmcTypeFilterTypeEnumSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(FilterTypeEnum val: value)
            try {
                rc.add(val);
            } catch (DMFeedbackSet e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:131)
    public FilterTypeEnum add(Object v) throws DMFeedbackSet {
        synchronized(this){
            FilterTypeEnum rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:148)
    public FilterTypeEnum del(Object v){
        synchronized(this){
            FilterTypeEnum rc = null;
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
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:173)
    public Iterator<FilterTypeEnum> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<FilterTypeEnum>(value)).iterator() );
            else
                return( (new TreeSet<FilterTypeEnum>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:187)
    public Set<FilterTypeEnum> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<FilterTypeEnum>());
                else
                    return(new HashSet<FilterTypeEnum>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<FilterTypeEnum>(value));
                else
                    return(new TreeSet<FilterTypeEnum>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:207)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.tools.generation.util.SETTypeFormatter.dumpSETType(SETTypeFormatter.java:218)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                FilterTypeEnum val = typeCheck(v);
                return(value.contains(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
}

