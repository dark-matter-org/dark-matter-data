package org.dmd.dms.tools.dmogen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.core.util.DMUncheckedObject;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;

public class ClassNode {
	String 						name;
	ClassDefinition				cd;
	DMUncheckedObject			uco;
	TreeMap<String,ClassNode>	derived;
	String						parentRef;
	
	public ClassNode(String n, ClassDefinition def){
		name 	= n;
		cd		= def;
		derived	= new TreeMap<String, ClassNode>();
	}
	
	public ClassNode(String n, DMUncheckedObject def){
		name	= n;
		uco		= def;
		derived = new TreeMap<String, ClassNode>();
	}
	
	public void addDerived(ClassNode cn){
		derived.put(cn.name, cn);
	}
	
	/**
	 * Recursively writes the class information for this class and all of its derived classes.
	 * @param out
	 * @throws IOException
	 * @throws ResultException
	 */
	public void writeClassInfo(BufferedWriter out) throws IOException {
		if (cd == null){
			String ID = uco.getSV("dmdID");
			String ct = uco.getSV("classType");
			String derivedFrom = uco.getSV("derivedFrom");
			String isNamedBy = uco.getSV("isNamedBy");
			String dmoImport = uco.getSV("dmoImport");
			
	    	out.write("    public final static DmcClassInfo __" + name + " = new DmcClassInfo(");
	    	out.write("\"" + name + "\",");
	    	out.write("\"" + dmoImport + "\",");
	    	out.write(ID + ",");
	   		out.write("ClassTypeEnum." + ct + ",");
	   		out.write("DataTypeEnum.PERSISTENT");
	   		if (derivedFrom == null)
	   			out.write(",null");
	   		else
	   			out.write(",__" + derivedFrom);
	   		
	   		if (isNamedBy == null)
	   			out.write(",null");
	   		else{
	   			out.write(",MetaDMSAG.__" + isNamedBy);
	   		}

	    	out.write(");\n");		
		}
		else{
			out.write("    public final static DmcClassInfo __" + cd.getName().getNameString() + " = new DmcClassInfo(");
			out.write("\"" + cd.getName().getNameString() + "\"");
			out.write(",\"" + cd.getDmoImport() + "\"");
			out.write(", " + cd.getDmdID());
			out.write(", ClassTypeEnum." + cd.getClassType());
			out.write(", DataTypeEnum." + cd.getDataType());
			if (cd.getDerivedFrom() == null)
	   			out.write(",null");
	   		else{
	   			if (parentRef == null)
	   				out.write(",__" + cd.getDerivedFrom().getName());
	   			else
	   				out.write("," + parentRef);
	   		}
	   		if (cd.getIsNamedBy() == null)
	   			out.write(",null");
	   		else{
	   			AttributeDefinition ad = cd.getIsNamedBy();
	   			String schema = ad.getDefinedInDmsModule().getCompactSchemaName();
	   			out.write("," + schema + ".__" + ad.getName());
	   		}
			out.write(");\n");
		}
		
		for(ClassNode cn: derived.values()){
			cn.writeClassInfo(out);
		}
	}
}
