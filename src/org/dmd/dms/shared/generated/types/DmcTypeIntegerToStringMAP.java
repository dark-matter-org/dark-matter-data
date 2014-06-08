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
// Called from: org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:57)
import java.io.Serializable;                                     //  - (MAPTypeFormatter.java:37)
import java.util.HashMap;                                        //  - (MAPTypeFormatter.java:39)
import java.util.Iterator;                                       //  - (MAPTypeFormatter.java:41)
import java.util.Map;                                            //  - (MAPTypeFormatter.java:38)
import java.util.TreeMap;                                        //  - (MAPTypeFormatter.java:40)
import org.dmd.core.DmcAttribute;                                //  - (MAPTypeFormatter.java:42)
import org.dmd.core.feedback.DMFeedbackSet;                      //  - (MAPTypeFormatter.java:44)
import org.dmd.core.interfaces.DmcMappedAttributeIF;             //  - (MAPTypeFormatter.java:45)
import org.dmd.core.schema.DmcAttributeInfo;                     //  - (MAPTypeFormatter.java:43)
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;         //  - (MAPTypeFormatter.java:46)
import org.dmd.dms.shared.types.DmcTypeIntegerToString;          // Base type import - (MAPTypeFormatter.java:49)
import org.dmd.dms.shared.types.IntegerToString;                 // Primitive import - (MAPTypeFormatter.java:52)


/**
 * The DmcTypeIntegerToStringMAP provides storage for a map of IntegerToString
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:63)
 *    Called from: org.dmd.dms.tools.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:97)
 */
@SuppressWarnings("serial")
// public class DmcTypeIntegerToStringMAP extends DmcTypeIntegerToString<IntegerToString> {
public class DmcTypeIntegerToStringMAP extends DmcTypeIntegerToString implements Serializable {
    
    private final static Iterator<IntegerToString> emptyList = (new HashMap<Integer,IntegerToString>()).values().iterator();
    
    protected Map<Integer,IntegerToString> value;
    
    public DmcTypeIntegerToStringMAP(){
        value = null;
    }
    
    public DmcTypeIntegerToStringMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<Integer,IntegerToString>();
        else
            value = new TreeMap<Integer,IntegerToString>();
    }
    
    public Integer firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<Integer,IntegerToString> map = (TreeMap<Integer,IntegerToString>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeIntegerToStringMAP getNew(){
        return(new DmcTypeIntegerToStringMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:120)
    public DmcAttribute<IntegerToString> cloneIt(){
        synchronized(this){
            DmcTypeIntegerToStringMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(IntegerToString val: value.values())
            try {
                rc.add(val);
            } catch (DMFeedbackSet e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:140)
    public IntegerToString add(Object v) throws DMFeedbackSet {
        synchronized(this){
            IntegerToString newval = typeCheck(v);
            if (value == null)
                initValue();
            Integer key = (Integer)((DmcMappedAttributeIF)newval).getKey();
            IntegerToString oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:161)
    public IntegerToString del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof Integer)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:177)
    public Iterator<IntegerToString> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<Integer,IntegerToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<Integer,IntegerToString>(value);
            else
                clone = new TreeMap<Integer,IntegerToString>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:194)
    public Map<Integer,IntegerToString> getMVCopy(){
        synchronized(this){
            Map<Integer,IntegerToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<Integer,IntegerToString>();
                else
                    clone = new HashMap<Integer,IntegerToString>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<Integer,IntegerToString>();
                else
                    clone = new TreeMap<Integer,IntegerToString>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:215)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:227)
    public IntegerToString getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof Integer)
                return(value.get((Integer) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:242)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                IntegerToString val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DMFeedbackSet e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:259)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof Integer)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

