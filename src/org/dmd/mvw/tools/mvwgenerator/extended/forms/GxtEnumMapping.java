package org.dmd.mvw.tools.mvwgenerator.extended.forms;

import java.util.HashSet;
import java.util.Iterator;

import org.dmd.dms.EnumDefinition;
import org.dmd.dms.types.EnumValue;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.GxtEnumMappingDMW;

public class GxtEnumMapping extends GxtEnumMappingDMW {
	
	EnumDefinition	edef;
	
	EnumValue		unsetValue;

	public GxtEnumMapping(){
		edef = null;
	}
	
	public void setEnumDef(EnumDefinition ed){
		edef = ed;
	}
	
	public void setUnsetEnumValue(EnumValue ev){
		unsetValue = ev;
	}
	
	public String getStaticValues(){
		StringBuffer sb = new StringBuffer();
		HashSet<String>	skip = getSkipEnumValueCopy();
		
		Iterator<EnumValue> values = edef.getEnumValue();
		while(values.hasNext()){
			EnumValue value = values.next();
			
			if ( (skip != null) && (skip.contains(value.getName())))
				continue;
			
			sb.append("    public final GxtEnumValue ");
			sb.append(value.getName());
			sb.append(" = new GxtEnumValue(");
			sb.append("\"" + value.getName() + "\", ");
			sb.append(value.getId() + ", ");
			sb.append("\"" + sortPad(value.getId()) + "\", ");
			if (isUseNameAsLabel())
				sb.append("\"" + value.getName() + "\");\n");
			else if (value.getLabel() == null)
				sb.append("\"" + value.getDescription() + "\");\n");
			else
				sb.append("\"" + value.getLabel() + "\");\n");
				
		}
		
		return(sb.toString());
	}
	
	public String getConstructor(){
		HashSet<String>	skip = getSkipEnumValueCopy();
		String 			name 	= GenUtility.capTheName(getMappingName().getNameString());
		StringBuffer sb = new StringBuffer();
		sb.append("    ArrayList<GxtEnumValue> mapping;\n\n");
		sb.append("    protected " + name + "(){\n");
		sb.append("        mapping = new ArrayList<GxtEnumValue>();\n");
		Iterator<EnumValue> values = edef.getEnumValue();
		while(values.hasNext()){
			EnumValue value = values.next();
			
			if ( (skip != null) && (skip.contains(value.getName())))
				continue;
			
			sb.append("        mapping.add(" + value.getName() + ");\n");
		}
		sb.append("    }\n\n");
		
		sb.append("    static public " + name + " instance(){\n");
		sb.append("        if (instance == null)\n");
		sb.append("            instance = new " + name + "();\n");
		sb.append("        return(instance);\n");
		sb.append("    }\n\n");
		
		return(sb.toString());
	}
	
	String toMixed(String val){
		String lower = val.toLowerCase();
		return(GenUtility.capTheName(lower));
	}
	
	String sortPad(Integer val){
		if (val < 10)
			return("00" + val);
		if (val < 100)
			return("0" + val);
		if (val >= 1000)
			throw(new IllegalStateException("Enum value >= 1000"));
		return(val.toString());
	}
}
