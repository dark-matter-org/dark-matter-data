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

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DotName provides standard mechanisms to deal with hierarchic names composed of
 * strings interspersed with periods (dots) to separate the name elements. For example
 * a dot name might be one.two.three.
 */
@SuppressWarnings("serial")
public class DotName extends DmcHierarchicObjectName implements Serializable {
	
	public final static String className = "DotName";
	
	final static String dotCase = "[a-zA-Z][a-zA-Z0-9.]*";
	final static String nameCase = "[a-zA-Z][a-zA-Z0-9]*";

	String name;
	transient DotName parent;
	
	public DotName(){

	}
	
	public DotName(String n) throws DmcValueException {
		if (n.matches(dotCase))
			name = n;
		else
			throw(new DmcValueException("The String: " + n + " does not conform to dot name format."));
	}

	public DotName(DotName dotName) {
		name = new String(dotName.name);
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DmcValueException {
		if (n.matches(dotCase))
			name = n;
		else
			throw(new DmcValueException("The string: " + n + " does not conform to dot name format."));
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof DotName)
			return(name.equals(((DotName)obj).name));
		if (obj instanceof DmcObjectName)
			return(name.equals(((DmcObjectName)obj).getNameString()));
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
	public int compareTo(DmcObjectName o) {
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
	public DmcHierarchicObjectName getParentName() {
		if (parent == null){
			int lastdot = name.lastIndexOf('.');
			if (lastdot != -1){
				try {
					parent = new DotName(name.substring(0, lastdot));
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Shouldn't fail to get a parent name from a legal DotName"));
				}
			}	
		}
		return(parent);
	}
	
	public void addChild(String c) throws DmcValueException {
		if (c.matches(nameCase)){
			name = name + "." + c;
		}
		else{
			throw(new DmcValueException("The string: " + c + " must start with an alpha character followed by alphanumerics."));			
		}
	}

	public boolean isChild(DmcHierarchicObjectName n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (((DotName)n).name.startsWith(name))
				rc = true;
		}
		return(rc);
	}

	public boolean isParent(DmcHierarchicObjectName n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (name.startsWith(((DotName)n).name))
				rc = true;
		}
		return(rc);
	}

	public boolean isSibling(DmcHierarchicObjectName n) {
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

	@Override
	public DmcObjectName cloneIt() {
		DotName rc = null;
		try {
			rc = new DotName(name);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Shouldn't fail cloning a legal DotName"));
		}
		return(rc);
	}

	@Override
	public DmcObjectName getNew() {
		return(new DotName());
	}

	@Override
	public String getPresentationString() {
		return(name);
	}


}
