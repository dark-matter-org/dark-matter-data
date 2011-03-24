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
package org.dmd.dmc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * The DmcHashedAttribute serves as the base for multi-valued attributes that can be stored
 * and accessed via a Map, either a HashMap, or a TreeMap. This derivation merely ensures that
 * the underlying values implement the DmcMappedAttributeIF interface.
 * <P>
 * Also, hashed attributes are inherently multi-valued. The set() mechanism is disabled and will
 * throw an exception if you try to use it on a hashed attribute. You may only use the add() and
 * del() functions on a hashed attribute.
 */
@SuppressWarnings("serial")
public abstract class DmcHashedAttribute<E extends DmcMappedAttributeIF> extends DmcAttribute<E> {

	protected DmcHashedAttribute(){
		
	}
	
	protected DmcHashedAttribute(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public E set(Object value) throws DmcValueException {
		throw(new DmcValueException(getName(), "A hashed attribute doesn't support the set() method."));
	}
	
	@Override
	/**
	 * Adds the specified value to a hashed, multi-valued attribute. 
	 * @param value The value to be added
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public E add(Object value) throws DmcValueException {
		E rc = null;
		
		if (value == null)
			return(rc);
		
		rc = typeCheck(value);

		switch(attrInfo.valueType){
		case SINGLE:
			throw(new IllegalStateException("The add() method is not supported for single-valued attribute: " + attrInfo.name));
		case MULTI:
			if (mv == null)
				mv = new ArrayList<E>();
			if (!mv.contains(rc))
				mv.add(rc);
			break;
		case HASHMAPPED:
			if (map == null)
				map = new HashMap<Object, E>();
			map.put(rc.getKey(), rc);
			break;
		case TREEMAPPED:
			if (map == null)
				map = new TreeMap<Object, E>();
			map.put(rc.getKey(), rc);
			break;
        case HASHSET:
			throw(new IllegalStateException("HASHSET shouldn't be here: " + attrInfo.name));
        case TREESET:
			throw(new IllegalStateException("TREESET shouldn't be here: " + attrInfo.name));
		}
		
		return(rc);
	}
	
	@Override
	/**
	 * Removes a value from a multi-valued attribute.
	 * @param value The value to be removed.
	 */
	public E del(Object value){
		E rc = null;
		
		if (value == null)
			return(rc);
		
		try {
			rc = typeCheck(value);
		} catch (DmcValueException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		switch(attrInfo.valueType){
		case SINGLE:
			break;
		case MULTI:
			if (mv == null)
				return(rc);
			mv.remove(rc);
			break;
		case HASHMAPPED:
			if (map == null)
				return(rc);
			map.remove(rc);
			break;
		case TREEMAPPED:
			if (map == null)
				return(rc);
			map.remove(rc);
			break;
		}
		
		return(rc);
	}
	
	@Override
	/**
	 * Returns the value associated with the specified key.
	 * @param key
	 * @return
	 */
	public E getByKey(Object key){
		E rc = null;
		
		switch(attrInfo.valueType){
		case SINGLE:
		case MULTI:
			break;
		case HASHMAPPED:
			if (map != null)
				rc = map.get(key);
			break;
		case TREEMAPPED:
			if (map != null)
				rc = map.get(key);
			break;
		}
		return(rc);
	}
	
	@Override
	/**
	 * We override this method to handle mapped attributes. The serialization aspect
	 * is handled by DmcAttribute, it's just the deserialization that has to be handled
	 * separately.
	 */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
    	// At this point, the DmwWrapperDMO has instantiated us based on the attribute info.
    	// If we're multivalued, the next thing we need to do is read our length - otherwise,
    	// we just call on our derived class to read itself from the stream
    	switch(attrInfo.valueType){
    	case SINGLE:
    		deserializeSV(dis);
    		break;
    	case MULTI:
    		deserializeMV(dis);
    		break;
    	case HASHMAPPED:
    		deserializeHM(dis);
    		break;
    	case TREEMAPPED:
    		deserializeTM(dis);
    		break;
    	}
    }
	
	////////////////////////////////////////////////////////////////////////////////
	//
	
	
    
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
    abstract public void deserializeHM(DmcInputStreamIF dos) throws Exception;

    abstract public void deserializeTM(DmcInputStreamIF dos) throws Exception;


}
