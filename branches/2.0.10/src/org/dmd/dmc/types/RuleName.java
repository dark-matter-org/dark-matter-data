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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The RuleName provides support for the naming of rule data based on the camelCase naming convention.
 */
@SuppressWarnings("serial")
public class RuleName extends DmcObjectName implements DmcObjectNameIF, Serializable {
	
	public final static String className = "RuleName";
	
	final static String camelCase = "[a-zA-Z][a-zA-Z0-9]*";
	
	String name;
	
	public RuleName(){

	}
	
	public RuleName(RuleName n){
		name = n.name;
	}
	
	public RuleName(String n) throws DmcValueException {
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DmcValueException("The String: " + n + " does not conform to the RuleName format."));
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DmcValueException {
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DmcValueException("The String: " + n + " does not conform to RuleName format."));
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof RuleName)
			return(name.equals(((RuleName)obj).name));
		// NOTE: this is here to provide backwards compatibility with code generation stuff
		// that's comparing getName() with a String. DON'T REMOVE THIS!
		else if (obj instanceof String)
			return(name.equals((String)obj));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(name);
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readUTF();
	}

	@Override
	public int compareTo(DmcObjectName o) {
		if (o instanceof RuleName){
			return(name.compareTo(((RuleName)o).name));
		}
		return(name.compareTo(o.getNameString()));
	}

	@Override
	public String toString(){
		return(name);
	}

	@Override
	public Object getKey() {
		return(name);
	}

	@Override
	public String getKeyAsString() {
		return(name);
	}

	@Override
	public String getNameClass() {
		return(className);
	}
	
	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof RuleName){
			RuleName other = (RuleName) obj;
			rc = name.equals(other.name);
		}
		return(rc);
	}

	@Override
	public DmcObjectName cloneIt() {
		return(new RuleName(this));
	}

	@Override
	public DmcObjectName getNew() {
		return(new RuleName());
	}

	@Override
	public String getPresentationString() {
		return(name);
	}

}
