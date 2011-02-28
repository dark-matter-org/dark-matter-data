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
package org.dmd.dmc.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.util.exceptions.ResultException;
import java.util.ArrayList;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeNamedObjectREF is a base type from which all references to named objects
 * are derived. This stuff is a bit complicated and this class overrides most of the
 * basic functionality of the DmcAttribute to make this happen. This is because unlike 
 * basic attribute types, types derived from this one allow you to set the contents of
 * the attribute to be a String name, or a DmcObject that implements the DmcNameobjectIF
 * interface. 
 * <P>
 * The values of this kind of attribute are derived from DmcNamedObjectREF which allows
 * you to store just the name of an object, or the name of the object and the object itself.
 * This provides the concept of resolved/unresolved object references. For instance, if you
 * parse a bunch of objects from a file and they contain object reference attributes, they
 * will appear as just the names of other objects. Later, you can attempt to resolve
 * these references (or not). Depending on the context in which you're using your data,
 * this mechanism gives you the option of lazily resolving (or perhaps retrieving) the
 * objects to which this type of attribute refers. 
 */
@SuppressWarnings({ "serial", "unchecked" })
abstract public class DmcTypeNamedObjectREF<HELPER extends DmcNamedObjectREF> extends DmcAttribute<HELPER> {
		
	/**
	 * Constructs a new object reference attribute. 
	 */
	public DmcTypeNamedObjectREF(){
	}
	
	@Override
	protected HELPER typeCheck(Object value) throws DmcValueException {
		// THIS WILL NEVER BE CALLED, SINCE WE OVERRIDE THE METHODS THAT CALL IT
		return((HELPER)value);
	}
	
	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (HELPER d : mv){
				sb.append(d.getObjectName() + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.getObjectName());
		}

	}
	
	/**
	 * @return A new DmcNamedObjectREF derivative instance.
	 */
	abstract protected HELPER getNewHelper();
	
	/**
	 * Checks if the object is an instance of the appropriate type.
	 * @param value The value to be tested.
	 * @return True if the object is the appropriate type.
	 */
	abstract protected boolean isDMO(Object value);
	
	abstract protected String getDMOClassName();
	
	/**
	 * Sets the value of a single-valued attribute.
	 * @param value The value to be set
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	@Override
	public void set(Object value) throws DmcValueException {
		
		if (sv == null)
			sv = getNewHelper();
			
		if (value instanceof String){
			sv.setName((String)value);
			sv.setObject(null);
		}
		else if (isDMO(value)){
			sv.setName(((DmcNamedObjectIF)value).getObjectName());
			sv.setObject((DmcNamedObjectIF)value);
		}
		else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with " + getDMOClassName() + " or String expected."));			
		}
		
		mv = null;		
	}
	
	/**
	 * @return If this is a single valued attribute, we return the object that it references, or null
	 * if the reference isn't resolved.
	 */
	public DmcNamedObjectIF getObject(){
		if (sv != null)
			return(sv.getObject());
		return(null);
	}
	
	/**
	 * Adds the specified value to a multi-valued attribute.
	 * @param value The value to be added
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	@Override
	public void add(Object value) throws DmcValueException {
		sv = null;
		if (mv == null)
			mv = new ArrayList<HELPER>();
		
		HELPER newval = getNewHelper();
		
		if (value instanceof String){
			newval.setName((String)value);
			newval.setObject(null);
		}
		else if (isDMO(value)){
			newval.setName(((DmcNamedObjectIF)value).getObjectName());
			newval.setObject((DmcNamedObjectIF)value);
		}
		else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with " + getDMOClassName() + " or String expected."));			
		}
		
		mv.add(newval);
	}
	
	/**
	 * This is a convenience function for use with the modification tracking. It gives
	 * us the last value added to a multi-value attribute. We have to override the base version 
	 * of this method for references so taht we return either the object of its name, and not the
	 * HELPER class.
	 * @return
	 */
	@Override
	public Object getLastMVValue(){
		if (mv != null){
			if (mv.size() >= 1){
				HELPER lastVal = mv.get(mv.size()-1);
				if (lastVal.getObject() == null)
					return(lastVal.getObjectName());
				else
					return(lastVal.getObject());
			}
		}
		return(null);
	}
	

	
	/**
	 * @return If this is a multi-valued attribute, we return the array of object references.
	 */
	public ArrayList<DmcNamedObjectREF> getObjectReferences(){
		if (mv != null)
			return (ArrayList<DmcNamedObjectREF>) (mv);
		return(null);
	}
	
	/**
	 * Removes a value from a multi-valued attribute.
	 * @param value The value to be removed.
	 */
	@Override
	public void del(Object value){
		if (mv == null)
			return;
		
		HELPER toast = null;
		
		if (value instanceof String){
			String name = (String)value;
			for(HELPER h : mv){
				if (h.getObjectName().equals(name)){
					toast = h;
					break;
				}
			}
		}
		else if (isDMO(value)){
			DmcNamedObjectIF obj = (DmcNamedObjectIF)value;
			for(HELPER h : mv){
				if (h.getObjectName().equals(obj.getObjectName())){
					toast = h;
					break;
				}
			}
		}
		
		if (toast != null)
			mv.remove(toast);
	}
	
	@Override
	public boolean contains(Object o){
		boolean rc = false;
		
		if (mv != null){
			if (o instanceof String){
				for(int i=0; i<mv.size(); i++){
					DmcNamedObjectIF dno = mv.get(i);
					if (o.equals(dno.getObjectName())){
						rc = true;
					}
				}
			}
			else if (o instanceof DmcNamedObjectIF){
				DmcNamedObjectIF obj = (DmcNamedObjectIF) o;
				for(int i=0; i<mv.size(); i++){
					DmcNamedObjectIF dno = mv.get(i);
					if (obj.getObjectName().equals(dno.getObjectName())){
						rc = true;
					}
				}
			}
		}
		
		return(rc);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws ResultException {
    	if (sv == null){
			for (HELPER d : mv){
				dos.writeUTF(d.getObjectName());
			}
    	}
    	else{
    		dos.writeUTF(sv.getObjectName());
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws ResultException {
		String value = dis.readUTF();
		HELPER newval = getNewHelper();
		newval.setName(value);
    	sv = newval;
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws ResultException {
		String value = dis.readUTF();
		HELPER newval = getNewHelper();
		newval.setName(value);
    	mv.add(newval);
    }


}
