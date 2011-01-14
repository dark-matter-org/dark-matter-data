package org.dmd.dmg.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;

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
				if (td.getIsRefType()){
					sb.append("import " + td.getOriginalClass().getInternalTypeRef().getHelperClassName() + ";\n");
				}
				else
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

		sb.append("import " + cd.getDmoImport() + ";\n");
		
		sb.append("\n");
	}
	
	/**
	 * This method takes a dot name, for example app.event.explosion and turns it into a camel
	 * case string like: AppEventExplosion
	 * @return A camel case string.
	 */
	static public String dotNameToCamelCase(String in){
		StringBuffer sb = new StringBuffer();
		StringTokenizer	tokenizer = new StringTokenizer(in,".");
		
		while(tokenizer.hasMoreTokens()){
			StringBuffer t = new StringBuffer(tokenizer.nextToken());
	    	t.setCharAt(0,Character.toUpperCase(t.charAt(0)));
	    	sb.append(t.toString());
		}
		
		return(sb.toString());
	}
	
	/**
	 * This method takes a dot name, for example app.event.explosion and turns it into capitalized
	 * name string like: APP_EVENT_EXPLOSION
	 * @return A camel case string.
	 */
	static public String dotNameToUpperCaseConstant(String in){
		String upper = in.toUpperCase();
		
		return(upper.replaceAll("\\.", "_"));
	}

}
