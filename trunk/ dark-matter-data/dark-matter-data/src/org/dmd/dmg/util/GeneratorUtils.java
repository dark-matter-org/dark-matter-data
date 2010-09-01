package org.dmd.dmg.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.TypeDefinition;

/**
 * The generatorutils class provides a variety of utility functions that
 * come in handy when generating code associated with Dark Matter Objects.
 */
public class GeneratorUtils {

	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd        The class definition of the object.
	 * @param baseClass The base class of the object you're generating or null if there's no base class.
	 * @param allAttr   An array that will be populated with all attribute definitions of the class.
	 * @param sb        The buffer where the import statements are accumulated.
	 */
	static public void getAttributesAndImports(ClassDefinition cd, String baseClass, ArrayList<AttributeDefinition> allAttr, StringBuffer sb){
		boolean			needJavaUtil	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				allAttr.add(ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		sb.append("import org.dmd.dmc.DmcValueException;\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			if (td.getPrimitiveType() != null){
				sb.append("import " + td.getPrimitiveType() + ";\n");
			}
//			sb.append("import " + td.getTypeClassName() + ";\n");
		}
		
		sb.append("\n");
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcNamedObjectIF;\n");
		}

		if (baseClass != null)
			sb.append("import " + baseClass + ";\n");

		sb.append("import " + cd.getDmoClass() + ";\n");
		
		sb.append("\n");
	}
	

}
