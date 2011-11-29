package org.dmd.dms.util;

import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ValueTypeEnum;

/**
 * The TypeAndAttr class stores the type and cardinality for an attribute and provides
 * convenience functions to get the appropriate derived type for SV, MV, MAP and SET 
 * versions of a type.
 */
public class TypeAndAttr {

	public 	TypeDefinition 	td;
	public	ValueTypeEnum	valueType;
	public 	String name;
	
	public TypeAndAttr(TypeDefinition t, ValueTypeEnum v){
		td 	= t;
		valueType	= v;
		name = td.getName().getNameString() + "-" + valueType;
	}
	
	public String getImport(){
		if (td.getIsRefType() && !td.getIsExtendedRefType()){
			if (td.getName().getNameString().endsWith("REF")){
//				DebugInfo.debug("Normal REF");
				return td.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + getSuffix();
			}
			else{
//				DebugInfo.debug("REF not in type name: " + td.getName());
				return td.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + "REF" + getSuffix();
			}
		}
		else
			return td.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + getSuffix();
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
