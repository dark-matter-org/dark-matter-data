//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.DmcObjectName;
import org.dmd.core.interfaces.DmcObjectNameIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;


/**
 * The DefinitionName provides the naming mechanism for all definition that make
 * use of the dark-matter definition conventions. DefinitionNames start with a letter followed
 * by a mix of letters, number and dots. This allows for support of the convention
 * that you can refer to definitions in the simplest way possible i.e. just a string name,
 * but, in cases where there is ambiguity, you may refer to the definition using its
 * fully qualified dotName.
 * <p/>
 * A base DMV rule enforces the exclusion of the dot character when the name
 * attribute for a definition is specified.
 */
@SuppressWarnings("serial")
public class DefinitionName extends DmcObjectName implements DmcObjectNameIF, Serializable {
	
	public final static String className = "DefinitionName";
	
	// Note: When originally created, the DefinitionName was only used for dark-matter schema related 
	//       definitions. In that case, definitions had to start with alpha characters because code was generated
	//       from the names. However, as dark-matter DSL technology has expanded, the ability to allow for
	//       names that start with numbers was advantageous. So, the restrictions are loosened here and
	//       made up for using rules e.g. more restrictive rules when the name is part of a schema definition.
	final static String camelCase = "[a-zA-Z0-9][a-zA-Z0-9_./-]*";

	String name;
	
	public DefinitionName(){

	}
	
	public DefinitionName(DefinitionName n){
		name = new String(n.name);
	}
	
	public DefinitionName(String n) throws DMFeedbackSet{
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DMFeedbackSet("The String: " + n + " does not conform to DefinitionName format. The name must begin with a letter followed by letters, numbers and dots."));
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DMFeedbackSet {
		if (n.matches(camelCase))
			name = n;
		else
			throw(new DMFeedbackSet("The String: " + n + " does not conform to DefinitionName format. The name must begin with a letter followed by letters, numbers and dots."));

	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof DefinitionName)
			return(name.equals(((DefinitionName)obj).name));
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
		if (o instanceof DefinitionName){
			return(name.compareTo(((DefinitionName)o).name));
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
		if (obj instanceof DefinitionName){
			DefinitionName other = (DefinitionName) obj;
			rc = name.equals(other.name);
		}
		return(rc);
	}

	@Override
	public DmcObjectName cloneIt() {
		return(new DefinitionName(this));
	}

	@Override
	public DmcObjectName getNew() {
		return(new DefinitionName());
	}

	@Override
	public String getPresentationString() {
		return(name);
	}

}
