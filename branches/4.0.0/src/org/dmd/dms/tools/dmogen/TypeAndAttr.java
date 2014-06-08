package org.dmd.dms.tools.dmogen;

import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;


/**
 * The TypeAndAttr class stores the type and cardinality for an attribute and provides
 * convenience functions to get the appropriate derived type for SV, MV, MAP and SET 
 * versions of a type.
 */
public class TypeAndAttr {

	public 	TypeDefinition 	td;
	public	ValueTypeEnum	valueType;
	public  int				indexSize;
	public  boolean			indexed;
	public 	String name;
	
	public TypeAndAttr(TypeDefinition t, ValueTypeEnum v, Integer idxSize){
		td 	= t;
		valueType	= v;
		name 	= td.getName().getNameString() + "-" + valueType;
		indexed = false;
		if (idxSize == null){
			indexSize = 0;
		}
		else{
			indexSize = idxSize;
			if (indexSize > 0)
				indexed = true;
		}
	}
	
	public String getImport(){
		if (td.getIsRefType() && !td.getIsExtendedRefType()){
			if (td.getName().getNameString().endsWith("REF")){
//				DebugInfo.debug("Normal REF");
				return td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + getSuffix();
			}
			else{
//				DebugInfo.debug("REF not in type name: " + td.getName());
				return td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + "REF" + getSuffix();
			}
		}
		else{
			if (td.getName().getNameString().endsWith("REF") && td.getIsEnumType()){
				// Special case for meta schema enums which have type definitions with names like ValueTypeEnumREF
				return td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + td.getEnumName() + getSuffix();
			}
			else
				return td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + getSuffix();
		}
	}
	
	String getSuffix(){
		String rc = null;
		switch(valueType){
        case SINGLE:
        	rc = "SV";
        	break;
        case MULTI:
        	rc = "MV";
        	break;
        case HASHMAPPED:
        case TREEMAPPED:
        	rc = "MAP";
        	break;
        case HASHSET:
        case TREESET:
        	rc = "SET";
        	break;
		}
		return(rc);
	}

}
