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
package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.DmcObjectName;
import org.dmd.core.interfaces.DmcObjectNameIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.feedback.DMFeedbackSet;

/**
 * The CamelCaseName provides support for the camelCase naming convention. It's jus the StringName
 * with a pattern match for camel case.
 */
@SuppressWarnings("serial")
public class CamelCaseName extends DmcObjectName implements DmcObjectNameIF, Serializable {
	
	public final static String className = "CamelCaseName";
	
	final static String camelCase = "[a-zA-Z][a-zA-Z0-9]*";
	
	String name;
	
	public CamelCaseName(){

	}
	
	public CamelCaseName(CamelCaseName n){
		name = n.name;
	}
	
	public CamelCaseName(String n) throws DMFeedbackSet {
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DMFeedbackSet("The String: " + n + " does not conform to camelCase format."));
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DMFeedbackSet {
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DMFeedbackSet("The String: " + n + " does not conform to camelCase format."));
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof CamelCaseName)
			return(name.equals(((CamelCaseName)obj).name));
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
		if (o instanceof CamelCaseName){
			return(name.compareTo(((CamelCaseName)o).name));
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
		if (obj instanceof CamelCaseName){
			CamelCaseName other = (CamelCaseName) obj;
			rc = name.equals(other.name);
		}
		return(rc);
	}

	@Override
	public DmcObjectName cloneIt() {
		return(new CamelCaseName(this));
	}

	@Override
	public DmcObjectName getNew() {
		return(new CamelCaseName());
	}

	@Override
	public String getPresentationString() {
		return(name);
	}

}
