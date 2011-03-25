package org.dmd.dms.util;

import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ValueTypeEnum;

/**
 * The TypeAndAttr class stores the type and cardinality for an attribute and provides
 * convenience functions to get the appropriate derived type for SV, MV, MAP and SET 
 * versions of a type.
 */
public class TypeAndAttr {

	public TypeDefinition 	td;
	ValueTypeEnum	vt;
	public String name;
	
	public TypeAndAttr(TypeDefinition t, ValueTypeEnum v){
		td 	= t;
		vt	= v;
		name = td.getName().getNameString() + "-" + vt;
	}
	
	public String getImport(){
		if (td.getIsRefType())
			return td.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + "REF" + getSuffix();
		else
			return td.getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + td.getName() + getSuffix();
	}
	
	String getSuffix(){
		String rc = null;
		switch(vt){
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
