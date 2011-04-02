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

import java.io.Serializable;
import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeNamedObjectREF is a base type from which all references to named objects
 * are derived. This stuff is a bit complicated and this class overrides most of the
 * basic functionality of the DmcAttribute to make this happen. This is because unlike 
 * basic attribute types, types derived from this one allow you to set the contents of
 * the attribute to be a String name, or a DmcObject that implements the DmcNamedObjectIF
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
abstract public class DmcTypeNamedObjectREF<HELPER extends DmcNamedObjectREF, NAMETYPE extends DmcObjectNameIF> extends DmcAttribute<HELPER> implements Serializable {
		
	/**
	 * Constructs a new object reference attribute. 
	 */
	public DmcTypeNamedObjectREF(){
	}
	
	public DmcTypeNamedObjectREF(DmcAttributeInfo ai){
		super(ai);
	}
		
	/**
	 * @return A new DmcNamedObjectREF derivative instance.
	 */
	abstract protected HELPER getNewHelper();
	
	abstract protected NAMETYPE getNewName();
	
	/**
	 * Checks if the object is an instance of the appropriate type.
	 * @param value The value to be tested.
	 * @return True if the object is the appropriate type.
	 */
	abstract protected boolean isDMO(Object value);
	
	abstract protected String getDMOClassName();
	
	/**
	 * Attempts to resolve references with the specified name resolver.
	 * @param rx The resolver.
	 * @throws DmcValueException  
	 */
	public void resolveReferences(DmcNameResolverIF rx) throws DmcValueException {
		Iterator<HELPER> it = getMV();
		if (it != null){
			while(it.hasNext()){
				HELPER ref = it.next();
				if (ref.getObject() == null){
					DmcNamedObjectIF obj = (DmcNamedObjectIF) rx.findNamedDMO(ref.getObjectName());
					if (obj == null)
						throw(new DmcValueException(getName(),"Could not resolve reference to: " + ref.getObjectName()));
						
					ref.setObject(obj);
				}
			}
		}
	}
	


}
