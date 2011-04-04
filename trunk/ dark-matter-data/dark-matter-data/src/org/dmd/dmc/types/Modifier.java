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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ModifyTypeEnum;

/**
 * The Modifier type is used to represent modification operations on a DmcObject.
 * Any modification to an object can be represented by a Modifier. Modifiers exist
 * in two primary states, depending on how they are created. If the modification is created
 * as a result of setting a DmcTypeModifier on a DmcObject and applying a series of changes,
 * the modification is (at least partially) resolved. If the changes take place on a client,
 * the changes are partially resolved e.g. references to objects are not fully resolved.
 * If the changes take place on the server, the modification should be fully resolved.
 * <P>
 * Modifiers that are parsed from an OIF or JSON formatted request are not resolved
 * and must be resolved before they are applied to server side objects.
 */
@SuppressWarnings("serial")
public class Modifier implements Serializable {
	
	// The type of modify operation indicated
	ModifyTypeEnum	operation;
	
	// The modifier can exist in two states. If it was parsed from a String, 
	// haveAttribute will be false and we will have an attributeName and a
	// String value. When haveAttribute is true, we've been created through
	// the standard DMO interfaces. We have to have this flag so that we
	// know how to serialize and deserialize the modifier.
	Boolean			haveAttribute;
	
	// Used when the modification is parsed from some text format
	String			attributeName;
	String			value;
	
	// Used when the modification is created through a DmcObject
	DmcAttribute<?>	attribute;
	
	// Indicates whether or not the modifier caused a change in the object
	// when it was applied
	transient boolean	causedChange;	
	
	public Modifier(){
		
	}
	
	/**
	 * Sets our causedChange flag to the specified value.
	 */
	public void causedChange(boolean f){
		causedChange = f;
	}
	
	public boolean causedChange(){
		return(causedChange);
	}
	
	public Modifier(Modifier original) {
		operation 		= original.operation;
		haveAttribute	= original.haveAttribute;
		attributeName 	= original.attributeName;
		value 			= original.value;
		attribute		= original.attribute;
	}
	
	/**
	 * Returns the attribute holder if available.
	 * @return The attribute holder.
	 */
	public DmcAttribute<?> getAttribute(){
		return(attribute);
	}
	
	/**
	 * A modification is considered resolved if it has a DmcAttribute to contain the value
	 * associated with the modification operation, or, if the operation is an REM.
	 * @return true if resolved and false otherwise
	 */
	public boolean isResolved(){
		if (attribute == null){
			if (operation == ModifyTypeEnum.REM)
				return(true);
			return(false);
		}
		return(true);
	}
	
	/**
	 * Constructs a new Modifier.
	 * @param an The attribute name.
	 * @param op The operation.
	 * @param v  The value.
	 */
	@SuppressWarnings("unchecked")
	public Modifier(ModifyTypeEnum op, DmcAttribute attr){
		operation 		= op;
		haveAttribute	= true;
		attributeName 	= attr.getName();
		value			= null;
		attribute 		= attr;
	}
	
	/**
	 * Constructs a new Modifier. The modify expression must conform to one of the following:
	 * <attrname> ADD <value>
     * <attrname> DEL <value>
     * <attrname> SET <value>
     * <attrname> REMOVE
	 * @param value The modification expression.
	 * @throws DmcValueException
	 */
	public Modifier(String v) throws DmcValueException {
		if (v == null){
			throw(new DmcValueException("Null value passed to Modifier()"));
		}
		
		int space1 = v.indexOf(" ");
		int space2 = v.indexOf(" ", space1+1);
		
		if (space1 == -1){
			throw(new DmcValueException("Incorrect number of tokens for Modifier: " + v));
		}
		
		String trimmed = v.trim();
		
		attributeName = trimmed.substring(0,space1);
		
		if (space2 == -1){
			// Just two tokens, should be a remove operation: attribute REMOVE
			String op = trimmed.substring(space1+1);
			operation = ModifyTypeEnum.get(op);
			if (operation == null){
				throw(new DmcValueException("Unknown modify operation: " + op));
			}
			
			if (operation != ModifyTypeEnum.REM){
				throw(new DmcValueException("Missing value for modify operation: " + op));
			}
		}
		else{
			// At least three tokens
			String op = trimmed.substring(space1+1,space2);
			operation = ModifyTypeEnum.get(op);
			if (operation == null){
				throw(new DmcValueException("Unknown modify operation: " + op));
			}
			
			if (operation == ModifyTypeEnum.REM){
				throw(new DmcValueException("Extraneous tokens in a REM operation. Should be just " + attributeName + " REM"));
			}
			
			value = trimmed.substring(space2+1);
		}
		
		haveAttribute = false;
		
	}
	
	public ModifyTypeEnum getModifyType(){
		return(operation);
	}
	
	public String getAttributeName(){
		if (attributeName == null){
			if (attribute == null)
				throw(new IllegalStateException("Malformed Modifier, neither attributeName nor attribute is available."));
			return(attribute.getName());
		}
			
		return(attributeName);
	}
	
	public Object getValue(){
		return(value);
	}
	
	public String toString(){
		if (operation == ModifyTypeEnum.REM){
			return(getAttributeName() + " " + operation);
		}
		else {
			if (value == null){
				// We have a full attribute
				if (attribute.getMVSize() == 0){
					// Must be multi-valued
					return(getAttributeName() + " " + operation + " " + attribute.getSV().toString());
				}
				else{
					return(getAttributeName() + " " + operation + " " + attribute.getMVnth(0).toString());
				}
			}
			else{
				return(attributeName + " " + operation + " " + value.toString());
			}
		}
	}

	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(operation.intValue());
		dos.writeBoolean(haveAttribute);
		
		if (haveAttribute)
			attribute.serializeIt(dos);
		else{
			dos.writeUTF(attributeName);
			dos.writeUTF(value);
		}
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		operation = ModifyTypeEnum.get(dis.readInt());
		haveAttribute = dis.readBoolean();
		
		if (haveAttribute){
			attribute = dis.getAttributeInstance();
			attribute.deserializeIt(dis);
		}
		else{
			attributeName 	= dis.readUTF();
			value 			= dis.readUTF();
		}
			
	}


}
