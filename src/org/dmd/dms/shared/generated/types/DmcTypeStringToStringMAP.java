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
import org.dmd.dms.shared.types.DmcTypeStringToString;           // Base type import - (MAPTypeFormatter.java:49)
import org.dmd.dms.shared.types.StringToString;                  // Primitive import - (MAPTypeFormatter.java:52)


/**
 * The DmcTypeStringToStringMAP provides storage for a map of StringToString
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:63)
 *    Called from: org.dmd.dms.tools.meta.DerivedTypeFormatter.dumpDerivedTypes(DerivedTypeFormatter.java:97)
 */
@SuppressWarnings("serial")
// public class DmcTypeStringToStringMAP extends DmcTypeStringToString<StringToString> {
public class DmcTypeStringToStringMAP extends DmcTypeStringToString implements Serializable {
    
    private final static Iterator<StringToString> emptyList = (new HashMap<String,StringToString>()).values().iterator();
    
    protected Map<String,StringToString> value;
    
    public DmcTypeStringToStringMAP(){
        value = null;
    }
    
    public DmcTypeStringToStringMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<String,StringToString>();
        else
            value = new TreeMap<String,StringToString>();
    }
    
    public String firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<String,StringToString> map = (TreeMap<String,StringToString>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeStringToStringMAP getNew(){
        return(new DmcTypeStringToStringMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:120)
    public DmcAttribute<StringToString> cloneIt(){
        synchronized(this){
            DmcTypeStringToStringMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(StringToString val: value.values())
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
    public StringToString add(Object v) throws DMFeedbackSet {
        synchronized(this){
            StringToString newval = typeCheck(v);
            if (value == null)
                initValue();
            String key = (String)((DmcMappedAttributeIF)newval).getKey();
            StringToString oldval = value.put(key,newval);
            
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
    public StringToString del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof String)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:177)
    public Iterator<StringToString> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<String,StringToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<String,StringToString>(value);
            else
                clone = new TreeMap<String,StringToString>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.tools.util.MAPTypeFormatter.dumpMAPType(MAPTypeFormatter.java:194)
    public Map<String,StringToString> getMVCopy(){
        synchronized(this){
            Map<String,StringToString> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<String,StringToString>();
                else
                    clone = new HashMap<String,StringToString>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<String,StringToString>();
                else
                    clone = new TreeMap<String,StringToString>(value);
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
    public StringToString getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof String)
                return(value.get((String) key));
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
                StringToString val = typeCheck(v);
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
    
           if (key instanceof String)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

