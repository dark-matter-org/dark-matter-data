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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcHierarchicObjectNameIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DotName provides standard mechanisms to deal with hierarchic names composed of
 * strings interspersed with periods (dots) to separate the name elements. For example
 * a dot name might be one.two.three.
 */
@SuppressWarnings("serial")
public class DotName implements DmcHierarchicObjectNameIF, Serializable {
	
	public final static String className = "DotName";
	
	String name;
	transient DotName parent;
	
	public DotName(){

	}
	
	public DotName(String n){
		name = n;
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DmcValueException {
		name = n;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof DotName)
			return(name.equals(((DotName)obj).name));
		if (obj instanceof DmcObjectNameIF)
			return(name.equals(((DmcObjectNameIF)obj).getNameString()));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readUTF();
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(name);
	}

	@Override
	public int compareTo(DmcObjectNameIF o) {
		if (o instanceof DotName){
			return(name.compareTo(((DotName)o).name));
		}
		return(name.compareTo(o.getNameString()));
	}

	@Override
	public String toString(){
		return(name);
	}

	@Override
	public DmcHierarchicObjectNameIF getParentName() {
		if (parent == null){
			int lastdot = name.lastIndexOf('.');
			if (lastdot != -1){
				parent = new DotName(name.substring(0, lastdot));
			}	
		}
		return(parent);
	}

	public boolean isChild(DmcHierarchicObjectNameIF n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (((DotName)n).name.startsWith(name))
				rc = true;
		}
		return(rc);
	}

	public boolean isParent(DmcHierarchicObjectNameIF n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (name.startsWith(((DotName)n).name))
				rc = true;
		}
		return(rc);
	}

	public boolean isSibling(DmcHierarchicObjectNameIF n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (this.getParentName().equals(((DotName)n).getParentName()))
				rc = true;
		}
		return(rc);
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
		if (obj instanceof DotName){
			DotName other = (DotName) obj;
			rc = name.equals(other.name);
		}
		return(rc);
	}


}
