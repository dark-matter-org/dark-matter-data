package org.dmd.dmc.types;

import com.google.gwt.user.client.rpc.IsSerializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ModifyTypeEnum;

/**
 * The Modification type is used to represent modification operations on a DmcObject.
 * Any modification to an object can be represented by a Modification. Modifications exist
 * in two primary states, depending on how they are created. If the modification is created
 * as a result of setting a DmcTypeModifier on a DmcObject and applying a series of changes,
 * the modification is (at least partially) resolved. If the changes take place on a client,
 * the changes are partially resolved e.g. references to objects are not fully resolved.
 * If the changes take place on the server, the modification should be fully resolved.
 * <P>
 * Modifications that are parsed from an OIF or JSON formatted request are not resolved
 * and must be resolved before they are applied to server side objects.
 */
public class Modification implements IsSerializable {
	
	// The type of modify operation indicated
	ModifyTypeEnum	operation;
	
	// Used when the modification is parsed from some text format
	String			attributeName;
	String			value;
	
	@SuppressWarnings("unchecked")
	// Used when the modification is created through a DmcObject
	DmcAttribute	attribute;
	
	public Modification(){
		
	}
	
	public Modification(Modification original) {
		operation = original.operation;
		attributeName = original.attributeName;
		value = original.value;
	}
	
	/**
	 * Returns the attribute holder if available.
	 * @return The attribute holder.
	 */
	@SuppressWarnings("unchecked")
	public DmcAttribute getAttribute(){
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
//	public Modification(String an, ModifyTypeEnum op, Object v){
//		operation 		= op;
//		attributeName 	= an;
//		value 			= v;
//		attribute		= null;
//	}
	
	/**
	 * Constructs a new Modifier.
	 * @param an The attribute name.
	 * @param op The operation.
	 * @param v  The value.
	 */
	@SuppressWarnings("unchecked")
	public Modification(ModifyTypeEnum op, DmcAttribute attr){
		operation 		= op;
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
	public Modification(String v) throws DmcValueException {
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
		
	}
	
	public ModifyTypeEnum getModifyType(){
		return(operation);
	}
	
	public String getAttributeName(){
		return(attributeName);
	}
	
	public Object getValue(){
		return(value);
	}
	
	public String toString(){
		if (operation == ModifyTypeEnum.REM){
			return(attributeName + " " + operation);
		}
		else {
			if (value == null){
				// We have a full attribute
				if (attribute.getSV() == null){
					// Must be multi-valued
					return(attributeName + " " + operation + " " + attribute.getMVnth(0).toString());
				}
				else{
					return(attributeName + " " + operation + " " + attribute.getSV().toString());
				}
			}
			else{
				return(attributeName + " " + operation + " " + value.toString());
			}
		}
	}

}
