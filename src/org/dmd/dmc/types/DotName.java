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
	
	// Note: When originally created, the DefinitionName was only used for dark-matter schema related 
	//       definitions. In that case, definitions had to start with alpha characters because code was generated
	//       from the names. However, as dark-matter DSL technology has expanded, the ability to allow for
	//       names that start with numbers was advantageous. So, the restrictions are loosened here and
	//       made up for using rules e.g. more restrictive rules when the name is part of a schema definition.
//	final static String dotCase = "[a-zA-Z][a-zA-Z0-9_.]*";
	final static String dotCase = "[a-zA-Z0-9][a-zA-Z0-9_.-]*";
	final static String nameCase = "[a-zA-Z][a-zA-Z0-9_]*";
	

	String name;
	transient DotName parent;
	
	public DotName(){

	}
	
	/**
	 * This is a specialized constructor that's used when constructing DmcAttributeInfo instances.
	 * It is meant to construct qualified names for attributes 
	 * @param schema the name of the schema
	 * @param attribute the name of the attribute
	 */
	public DotName(String schema, String attribute){
		if (schema.matches(nameCase) && attribute.matches(nameCase)){
			name = schema + "." + attribute;
		}
		else
			throw(new IllegalStateException("One of these strings doesn't match the DotName character set: " + schema + "  " + attribute));
	}
	
	public DotName(String n) throws DmcValueException {
		if (n.matches(dotCase))
			name = n;
		else
			throw(new DmcValueException("The string: " + n + " does not conform to dot name format."));
	}

	/**
	 * Creates a clone of the specified DotName.
	 * @param dotName the original name
	 */
	public DotName(DotName dotName) {
		name = new String(dotName.name);
	}

	/**
	 * Creates a child name 
	 * @param p the parent name
	 * @param child the child portion to be added; this must be straight alphanumerics
	 * @throws DmcValueException
	 */
	public DotName(DotName p, String child) throws DmcValueException {
		if (child.matches(nameCase)){
			name = new String(p.name + "." + child);
			parent = p;
		}
		else
			throw(new DmcValueException("The string: " + child + " does not conform to dot name format."));
	}
	
	/**
	 * @return the depth of the hierarchy implied by the number of dots in the name. A name with no dots
	 * is considered depth 1.
	 */
	public int getDepth(){
		int rc = 1;
		
		StringBuffer sb = new StringBuffer(name);
		for(int i=0; i<sb.length(); i++){
			if (sb.charAt(i) == '.')
				rc++;
		}
		
		return(rc);
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	@Override
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
	
//	public void addChild(String c) throws DmcValueException {
//		if (c.matches(nameCase)){
//			name = name + "." + c;
//		}
//		else{
//			throw(new DmcValueException("The string: " + c + " must start with an alpha character followed by alphanumerics."));			
//		}
//	}

	public boolean isChild(DmcHierarchicObjectName n) {
		boolean rc = false;
		if (n instanceof DotName){
			if (((DotName)n).name.startsWith(name))
				rc = true;
		}
		return(rc);
	}
	
	/**
	 * Takes a name of the form x.y.z and trims the root component so that you get y.z
	 * If the name doesn't contain any dots, you get an empty name string.
	 * @return this name with the root trimmed
	 */
	public DotName trimRoot(){
		DotName rc = new DotName();
		
		int dotPos = name.indexOf(".");
		if (dotPos == -1){
			rc.name = "";
		}
		else{
			rc.name = name.substring(dotPos+1);
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
