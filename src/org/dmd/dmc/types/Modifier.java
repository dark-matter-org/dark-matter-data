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
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
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
	int				attributeID;
	String			value;
	
	// The part name if we're dealing with a complex type
	String			partName;
	
	// Used when dealing with indexed attributes
	int				index;
	
	// Used when the modification is created through a DmcObject
	DmcAttribute<?>	attribute;
	
	// Tricky: if backref tracking is turned on via DmcOmni, modifiers are used to
	// maintain the information required to remove references to an object that is
	// being deleted. In that case, this attribute stores the object that is 
	// referring to the object being deleted.
	transient DmcNamedObjectIF	referringObject;
	
	// Tricky as well: this information is used when backref tracking is done via
	// complex types (DmcTypeComplexTypeWithRefs). In that case, we don't actually
	// remove reference attributes when something being referred to is deleted, 
	// we simply unresolve the reference.
	transient DmcNamedObjectREF<?> refFromComplexType;
	
	/**
	 * The mandatory zero arg constructor.
	 */
	public Modifier(){
		operation 		= ModifyTypeEnum.NONE;
		haveAttribute	= false;
		attributeName 	= null;
		attributeID		= -1;
		value 			= null;
		partName		= null;
		index			= -1;
		attribute		= null;
		referringObject	= null;
	}
	
	/**
	 * The copy constructor.
	 * @param original
	 */
	public Modifier(Modifier original) {
		operation 		= original.operation;
		haveAttribute	= original.haveAttribute;
		attributeName 	= original.attributeName;
		attributeID		= original.attributeID;
		value 			= original.value;
		partName		= null;
		index			= original.index;
		attribute		= original.attribute;
		referringObject	= original.referringObject;
	}
	
	/**
	 * Constructs a new Modifier.
	 * @param op The operation.
	 * @param attr  The attribute.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttribute<?> attr){
		operation 		= op;
		haveAttribute	= true;
		attributeName 	= attr.getName();
		attributeID		= attr.getID();
		value			= null;
		partName		= null;
		index			= -1;
		attribute 		= attr;
		referringObject	= null;
	}
	
	/**
	 * Constructs a new Modifier for removal of an attribute
	 * @param op The operation.
	 * @param ai The attribute info.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttributeInfo ai){
		operation 		= op;
		haveAttribute	= false;
		attributeName 	= ai.name;
		attributeID		= ai.id;
		value			= "none";
		partName		= null;
		index			= -1;
		attribute 		= null;
		referringObject	= null;
	}
	
	/**
	 * Constructs a new Modifier for the modification of an indexed attribute.
	 * @param op The operation.
	 * @param attr The attribute.
	 * @param idx The index being altered.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttribute<?> attr, int idx){
		operation 		= op;
		haveAttribute	= true;
		attributeName 	= attr.getName();
		attributeID		= attr.getID();
		value			= null;
		partName		= null;
		index			= idx;
		attribute 		= attr;
		referringObject	= null;
	}
	
	/**
	 * Constructs a new Modifier for setting of the specified index to null.
	 * @param op The operation.
	 * @param ai  The attribute info.
	 * @param idx The index being set to null.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttributeInfo ai, int idx){
		operation 		= op;
		haveAttribute	= false;
		attributeName 	= ai.name;
		attributeID		= ai.id;
		value			= "none";
		partName		= null;
		index			= idx;
		attribute 		= null;
		referringObject	= null;
	}
	
	/**
	 * Constructs a new backref Modifier. This modifier constructs the OPPOSITE of the operation
	 * in question i.e. if the operation is SET, the backref modification becomes a REM, if the
	 * operation is an ADD, it becomes a DEL. When the object being referred to is deleted, the
	 * set of backref modifiers is run against the various objects that were referring to the
	 * object.
	 * @param op       The operation.
	 * @param attr     The attribute.
	 * @param referrer the object that is now referring to another object.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttribute<?> attr, DmcObject referrer){
		if (op == ModifyTypeEnum.SET)
			operation = ModifyTypeEnum.REM;
		else if (op == ModifyTypeEnum.ADD)
			operation = ModifyTypeEnum.DEL;
		else
			throw(new IllegalStateException("Only SET and ADD operations can be specified for a backref Modifier."));
		
		haveAttribute	= true;
		attributeName 	= attr.getName();
		attributeID		= attr.getID();
		value			= null;
		partName		= null;
		index			= -1;
		attribute 		= attr;
		referringObject	= (DmcNamedObjectIF) referrer;
	}
	
	/**
	 * Constructs a new backref Modifier for a reference from within a complex type.
	 * References from complex types have to be handled differently since the complex
	 * type value is actually immutable. When removing an object, all we do is unresolve
	 * the object reference that was passed in.
	 * @param pn       the name of the part in the complex type that's doing the referring.
	 * @param referrer the object that is now referring to another object.
	 * @param ctr      the reference in the complex type.
	 */
	public Modifier(String pn, DmcObject referrer, DmcNamedObjectREF<?> ctr){
		operation = ModifyTypeEnum.NONE;
		
		haveAttribute		= false;
		attributeName 		= null;
		attributeID			= 0;
		value				= null;
		partName			= pn;
		index				= -1;
		attribute 			= null;
		referringObject		= (DmcNamedObjectIF) referrer;
		refFromComplexType	= ctr;
	}
	
	/**
	 * Same as above, but with the attribute ID passed in so that we can support 
	 * DmcObject.getReferringObjectsViaAttribute().
	 * @param pn       the name of the part in the complex type that's doing the referring.
	 * @param referrer the object that is now referring to another object.
	 * @param ctr      the reference in the complex type.
	 * @param ai       the attribute id
	 */
	public Modifier(String pn, DmcObject referrer, DmcNamedObjectREF<?> ctr, int ai){
		operation = ModifyTypeEnum.NONE;
		
		haveAttribute		= false;
		attributeName 		= null;
		attributeID			= ai;
		value				= null;
		partName			= pn;
		index				= -1;
		attribute 			= null;
		referringObject		= (DmcNamedObjectIF) referrer;
		refFromComplexType	= ctr;
	}
	
	/**
	 * Same as above, but with the attribute ID passed in so that we can support 
	 * DmcObject.getReferringObjectsViaAttribute().
	 * @param pn       the name of the part in the complex type that's doing the referring.
	 * @param referrer the object that is now referring to another object.
	 * @param ctr      the reference in the complex type.
	 * @param ai       the attribute id
	 * @param an       the attribute name
	 */
	public Modifier(String pn, DmcObject referrer, DmcNamedObjectREF<?> ctr, int ai, String an){
		operation = ModifyTypeEnum.NONE;
		
		haveAttribute		= false;
		attributeName 		= an;
		attributeID			= ai;
		value				= null;
		partName			= pn;
		index				= -1;
		attribute 			= null;
		referringObject		= (DmcNamedObjectIF) referrer;
		refFromComplexType	= ctr;
	}
	
	public DmcNamedObjectREF<?> getRefFromComplexType(){
		return(refFromComplexType);
	}
	
	/**
	 * Constructs a new backref Modifier for indexed attributes. This modifier constructs the
	 * OPPOSITE of the operation in question i.e. if you're setting index 2 to point to
	 * an object, the opposite operation is to set the index to null.
	 * @param op       The operation.
	 * @param attr     The attribute.
	 * @param referrer The object that is now referring to another object.
	 * @param idx      The index through which the reference is made.
	 */
	public Modifier(ModifyTypeEnum op, DmcAttribute<?> attr, DmcObject referrer, int idx){
		if (op == ModifyTypeEnum.NTH)
			operation = ModifyTypeEnum.NTH;
		else
			throw(new IllegalStateException("Only the NTH operation can be specified for a backref Modifier with an index."));
		
		haveAttribute	= true;
		attributeName 	= attr.getName();
		attributeID		= attr.getID();
		value			= null;
		partName		= null;
		index			= idx;
		attribute 		= attr;
		referringObject	= (DmcNamedObjectIF) referrer;
	}
	
	/**
	 * Constructs a new Modifier. The modify expression must conform to one of the following:
	 * <attrname> ADD <value>
     * <attrname> DEL <value>
     * <attrname> SET <value>
     * <attrname> NTH <index> <value>
     * <attrname> NTH <index>
     * <attrname> REM
	 * @param v The modification expression.
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
			if (operation == ModifyTypeEnum.NTH){
				int space3 = trimmed.indexOf(" ",space2+1);
				if (space3 == -1){
					// There's no value, just the index, which indicates that we're setting that index to null
				}
				else{
					value = trimmed.substring(space3+1).trim();
				}
			}
			else{
				value = trimmed.substring(space2+1).trim();
			}
		}
		
		haveAttribute = false;
		
	}
	
	/**
	 * @return The attribute ID of the attribute affected by this modifier.
	 */
	public int getAttributeID(){
		if (attribute == null)
			return(attributeID);
		else
			return(attribute.getID());
	}
	
	/**
	 * @return the attribute info for the attribute associated with this modification.
	 */
	public DmcAttributeInfo getAttributeInfo(){
		if (attribute == null){
			if (attributeID == -1)
				return(DmcOmni.instance().getAttributeInfo(attributeName));
			
			return(DmcOmni.instance().getInfo(attributeID));
		}
		else{
			return(attribute.getAttributeInfo());
		}
	}
	
	/**
	 * Returns the attribute holder if available.
	 * @return The attribute holder.
	 */
	public DmcAttribute<?> getAttribute(){
		// HACK: have to rationalize the attrInfo thing
		if (attribute != null)
			attribute.getAttributeInfo();
		
		return(attribute);
	}
	
	/**
	 * @return if this is a backref Modifier, this will return the object that's referring
	 * to the object on which this modifier is tracked.
	 */
	public DmcNamedObjectIF getReferringObject(){
		return(referringObject);
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
			if (operation == ModifyTypeEnum.NTH)
				return(true);
			return(false);
		}
		return(true);
	}
	
	public ModifyTypeEnum getModifyType(){
		return(operation);
	}
	
	public int getIndex(){
		return(index);
	}
	
	/**
	 * @return the name of the attribute affected by this operation.
	 */
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
	
	public String getPartName(){
		return(partName);
	}
	
	public String toString(){
		if (attribute != null){
			if (attribute.getAttributeInfo() == null)
				attribute.setAttributeInfo(DmcOmni.instance().getAttributeInfo(getAttributeName()));
		}
		
		if (operation == ModifyTypeEnum.REM){
			return(getAttributeName() + " " + operation);
		}
		else if (operation == ModifyTypeEnum.NTH){
			if (value == null){
				if (attribute == null)
					return(getAttributeName() + " " + operation);					
				else
					return(getAttributeName() + " " + operation + " " + index + " " + attribute.modifierFormat());
			}
			else{
				if (value.equals("none"))
					return(attributeName + " " + operation + " " + index);
				else
					return(attributeName + " " + operation + " " + index + " " + value.toString());
			}
		}
		else {
			if (value == null){
				// We have a full attribute
				return(getAttributeName() + " " + operation + " " + attribute.modifierFormat());
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
			dos.writeInt(attributeID);
			dos.writeUTF(value);
		}
		
		if (operation == ModifyTypeEnum.NTH)
			dos.writeInt(index);
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
			attributeID		= dis.readInt();
			value 			= dis.readUTF();
		}
		
		if (operation == ModifyTypeEnum.NTH)
			index = dis.readInt();
	}


}
