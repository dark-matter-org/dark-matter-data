package org.dmd.dmc.types;

import com.google.gwt.user.client.rpc.IsSerializable;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ModifyTypeEnum;

/**
 * The ModifyOp type is used to represent modification operations on a DmcObject.
 * Any modification to an object can be represented by a ModifyOp.
 */
public class Modifier implements IsSerializable {
	
	// The type of modify operation indicated
	ModifyTypeEnum	operation;
	
	String			attributeName;
	
	String			value;
	
	public Modifier(){
		
	}
	
	/**
	 * Constructs a new Modifier.
	 * @param an The attribute name.
	 * @param op The operation.
	 * @param v  The value.
	 */
	public Modifier(String an, ModifyTypeEnum op, String v){
		operation = op;
		attributeName = an;
		value = v;
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
		
	}
	
	public String toString(){
		if (value == null){
			return(attributeName + " " + operation);
		}
		else{
			return(attributeName + " " + operation + " " + value);
		}
	}

}
