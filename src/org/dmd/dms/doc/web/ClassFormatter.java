package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.util.exceptions.DebugInfo;

public class ClassFormatter {
	
	static SchemaManager schema;

	static public void dumpDetails(BufferedWriter out, SchemaManager sm, ClassDefinition cd) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
		
		schema = sm;
		
		out.write("  <table>\n\n");
		className(out, cd);
		description(out, cd);
		type(out, cd);
		derivedFrom(out, cd);
		derived(out, cd);
		wrapper(out, cd);
		namedBy(out, cd);
		appendClassRuleInfo(out, cd);
		out.write("  </table>\n\n");
		
		if ( (cd.getMustSize() > 0) || (cd.getMaySize() > 0)){
			out.write("  <table>\n\n");
	
			must(out, cd);
			may(out, cd);
			
			out.write("  </table>\n\n");
		}
	}
	
	static void className(BufferedWriter out, ClassDefinition cd) throws IOException{
		out.write("    <tr> <td class=\"className\" colspan=\"4\"> <a name=\"" + cd.getName() + "\"> " + cd.getName() + " </a> </td></tr>\n");
	}
	
	static void description(BufferedWriter out, ClassDefinition cd) throws IOException{
		if (cd.getDescription() != null){
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Description</td>\n");
			
			out.write("      <td colspan=\"2\">" + Converter.convert(cd.getDescriptionWithNewlines()) + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void type(BufferedWriter out, ClassDefinition cd) throws IOException{
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
		out.write("    <tr>\n");
		out.write("      <td class=\"spacer\"> </td>\n");
		out.write("      <td class=\"label\">Type</td>\n");
		
		out.write("      <td colspan=\"2\">" + cd.getClassType() + "</td>\n");
		out.write("    </tr>\n\n");
	}
	
	static void derivedFrom(BufferedWriter out, ClassDefinition cd) throws IOException{
		ArrayList<ClassDefinition>	classes = new ArrayList<ClassDefinition>();
		getDerivationChain(classes, cd);
		
		if (classes.size() > 0){
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Derived from</td>\n");
			
			out.write("      <td colspan=\"2\">\n");
			for(int i=0; i<classes.size(); i++){
				ClassDefinition bcd = classes.get(i);
				String schema = bcd.getDefinedIn().getName().getNameString();
				out.write("      <a href=\"" + schema + ".html#" + bcd.getName() + "\">" + bcd.getName() + "</a>");
				if (i+1 < classes.size())
					out.write(" <br />");
				out.write("\n");
			}
			out.write("      </td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void derived(BufferedWriter out, ClassDefinition cd) throws IOException{
		if (cd.getDerivedClassesSize() > 0){
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Derived classes</td>\n");
			out.write("      <td colspan=\"2\">\n");
			TreeMap<DefinitionName,ClassDefinition> sorted = new TreeMap<DefinitionName,ClassDefinition>();
			for(ClassDefinition derived: cd.getDerivedClasses()){
				sorted.put(derived.getName(), derived);
			}
			
			for(ClassDefinition derived: sorted.values()){
				String schema = derived.getDefinedIn().getName().getNameString();
				out.write("      <div class=\"derived\"> <a href=\"" + schema + ".html#" + derived.getName() + "\">" + derived.getName() + "</a> </div>");
			}
			out.write("      </td>\n");
			out.write("    </tr>\n\n");
		}
	}
	

	
	/**
	 * Builds up the derivation chain for a class in left to right order.
	 * @param classes
	 * @param cd
	 */
	static void getDerivationChain(ArrayList<ClassDefinition> classes, ClassDefinition cd){
		if (cd.getDerivedFrom() == null)
			return;
		if (cd.getDerivedFrom().getName().getNameString().equals("DmwWrapper"))
			return;
		classes.add(0, cd.getDerivedFrom());
		getDerivationChain(classes, cd.getDerivedFrom());
	}
	
	static void wrapper(BufferedWriter out, ClassDefinition cd) throws IOException{
		if (cd.getUseWrapperType() != WrapperTypeEnum.BASE){
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Wrapper</td>\n");
			out.write("      <td colspan=\"2\">" + cd.getUseWrapperType() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void namedBy(BufferedWriter out, ClassDefinition cd) throws IOException{
		if (cd.getIsNamedBy() != null){
			AttributeDefinition na = cd.getIsNamedBy();
			String schema = na.getDefinedIn().getName().getNameString();

			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Named by</td>\n");
			
			out.write("      <td colspan=\"2\"> <a href=\"" + schema + ".html#" + na.getName() + "\">" + na.getName() + "</a> </td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void must(BufferedWriter out, ClassDefinition cd) throws IOException {
	    TreeMap<DefinitionName,AttributeDefinition> allMust = cd.getAllMust();
	    StringBuffer sb = new StringBuffer();

		if (allMust.size() > 0){

			boolean first = true;
			for(AttributeDefinition ad: allMust.values()){
				if (ad.getInternalUse())
					continue;
				if (ad.getDmdID() == 1)
					continue;
				
				String 			schema 	= ad.getDefinedIn().getName().getNameString();
				String 			tschema = ad.getType().getDefinedIn().getName().getNameString();
				TypeDefinition 	td 		= ad.getType();
				String 			type 	= TypeFormatter.getTypeName(td);
				
				if (first){
					first = false;
					appendSectionLabel(sb, "Must have attributes");
				}
				
				appendAttribute(sb, schema, cd, ad, tschema, type);

			}
			
			out.append(sb.toString());
		}
	}
	
	static void appendSectionLabel(StringBuffer sb, String label){
		sb.append("    <tr>\n");
		sb.append("      <td class=\"spacer\"> </td>\n");
		sb.append("      <td colspan=\"5\"class=\"attributeSectionLabel\">" + label + "</td>\n");
		sb.append("    </tr>\n\n");		
	}
	
	static void appendAttribute(StringBuffer sb, String schema, ClassDefinition cd, AttributeDefinition ad, String tschema, String type){
		sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
		sb.append("    <tr>\n");
		sb.append("      <td class=\"spacer\"> </td>\n");
//		sb.append("      <td class=\"label\">" + label + "</td>\n");
		sb.append("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
		sb.append("      <td class=\"valueType\"> " + AttributeFormatter.getValueType(ad) + " </td>");
		sb.append("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
		if (ad.getDescription() == null){
			sb.append("      <td> ");
			appendAttributeRuleInfo(sb, cd, ad);
			appendAdditionalInfo(sb, cd, ad);
			sb.append("      </td>\n");
		}
		else{
			sb.append("      <td> " + Converter.convert(ad.getDescriptionWithNewlines()));
			appendAttributeRuleInfo(sb, cd, ad);
			appendAdditionalInfo(sb, cd, ad);
			sb.append("      </td>\n");
		}
		sb.append("    </tr>\n\n");		
	}
	
	static void appendClassRuleInfo(BufferedWriter out, ClassDefinition cd) throws IOException{
		if (cd.hasRules()){
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Rules</td>\n");

			out.write("<td>\n");
			
			out.write("<table>\n");
			
//			Iterator<RuleDataDMO> rules = ad.getGlobalRules();
//			while(rules.hasNext()){
//				
//			}
			
			Iterator<RuleDataDMO> rules = cd.getClassRules();
			while(rules.hasNext()){
				RuleDataDMO rd = rules.next();
				
//				DebugInfo.debug(rd.toOIF());
//				boolean dumpRule = false;
//				if (rd.getApplyToClass() == null)
//					dumpRule = true;
//				else{
//					ClassDefinition atc = schema.cdef(rd.getApplyToClass().getObjectName().getNameString());
//					if (cd.isInstanceOfThis(atc))
//						dumpRule = true;
//				}
//				
//				if (cd.isInstanceOfThis(atc)){
					// We only display the rule if it's applicable to this class or
					// if we're derived from the applyToClass
					out.write("<tr> <td class=\"attributeRule\">\n");
					out.write("<a class=\"blackText\" href=\"" + rd.getDefinedIn().getObjectName() + ".html#" + rd.getRuleName() + "\"> " + rd.getRuleTitle() + " </a>");
					out.write("</td> </tr>\n\n");
					
					
//				}
			}
			
			out.write("</table>\n");
			out.write("</td>\n");
		}
	}
	
	static void appendAttributeRuleInfo(StringBuffer sb, ClassDefinition cd, AttributeDefinition ad){
		if (ad.hasRules()){
			sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			sb.append("<table>\n");
			
			Iterator<RuleDataDMO> rules = ad.getGlobalRules();
			while(rules.hasNext()){
				RuleDataDMO rd = rules.next();
				
				sb.append("<tr> <td class=\"attributeRule\">\n");
				sb.append("<a class=\"blackText\" href=\"" + rd.getDefinedIn().getObjectName() + ".html#" + rd.getRuleName() + "\"> " + rd.getRuleTitle() + " </a>");
				sb.append("</td> </tr>\n\n");
			}
			
			rules = ad.getClassRules();
			while(rules.hasNext()){
				RuleDataDMO rd = rules.next();
				
				DebugInfo.debug("APPLY TO CLASS: " + rd.getApplyToClass().getObjectName().getNameString());
//				ClassDefinition atc = schema.cdef(rd.getApplyToClass().getObjectName().getNameString());
				// HACK FOR NOW
				ClassDefinition atc = (ClassDefinition) rd.getApplyToClass().getObject().getContainer();
				
				if (cd.isInstanceOfThis(atc)){
					// We only display the rule if it's applicable to this class or
					// if we're derived from the applyToClass
					sb.append("<tr> <td class=\"attributeRule\">\n");
					sb.append("<a class=\"blackText\" href=\"" + rd.getDefinedIn().getObjectName() + ".html#" + rd.getRuleName() + "\"> " + rd.getRuleTitle() + " </a>");
					sb.append("</td> </tr>\n\n");
					
					
				}
			}
			
			sb.append("</table>\n");
		}
	}
	
	static void appendAdditionalInfo(StringBuffer sb, ClassDefinition cd, AttributeDefinition ad){
		if ((ad.getTagsSize() > 0) || ad.getSearchable()){
			sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
			sb.append("<table>\n");
			
			if (ad.getSearchable()){
				sb.append("<tr> <td class=\"attributeName\">Searchable</td> <td> true </td></tr>\n\n");				
			}
			
			if (ad.getTagsSize() > 0){
				boolean first = true;
				Iterator<String> it = ad.getTags();
				while(it.hasNext()){
					if (first){
						sb.append("<tr> <td class=\"attributeName\"> Tags </td> <td> " + it.next() + " </td></tr>\n\n");										
					}
					else{
						sb.append("<tr> <td></td> <td> " + it.next() + " </td></tr>\n\n");										
					}
					first = false;
				}
			}
			sb.append("</table>\n");			
		}
	}
	
//	static void appendAttribute1(StringBuffer sb, String label, String schema, AttributeDefinition ad, String tschema, String type){
//		sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n\n");
//		sb.append("    <tr>\n");
//		sb.append("      <td class=\"spacer\"> </td>\n");
//		sb.append("      <td class=\"label\">" + label + "</td>\n");
//		sb.append("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
//		sb.append("      <td class=\"valueType\"> " + AttributeFormatter.getValueType(ad) + " </td>");
//		sb.append("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
//		if (ad.getDescription() != null)
//			sb.append("      <td> " + Converter.convert(ad.getDescription()) + " </td>\n");
//		sb.append("    </tr>\n\n");		
//	}
	
	static void may(BufferedWriter out, ClassDefinition cd) throws IOException{
	    TreeMap<DefinitionName,AttributeDefinition> allMay = cd.getAllMay();
	    StringBuffer	may 		= new StringBuffer();
	    StringBuffer	internal 	= new StringBuffer();

	    if (allMay.size() > 0){

			boolean first = true;
			for(AttributeDefinition ad: allMay.values()){
				if (ad.getDmdID() == 1)
					continue;

				String 			schema 	= ad.getDefinedIn().getName().getNameString();
				String 			tschema = ad.getType().getDefinedIn().getName().getNameString();
				TypeDefinition 	td 		= ad.getType();
				String 			type 	= TypeFormatter.getTypeName(td);

				if (ad.getInternalUse()){
					if (internal.length() == 0){
						appendSectionLabel(internal, "Internal use attributes");
					}
					
					appendAttribute(internal, schema, cd, ad, tschema, type);
				}
				else{
					if (first){
						first = false;
						appendSectionLabel(may, "May have attributes");
					}

					appendAttribute(may, schema, cd, ad, tschema, type);
				}
			}
			
			out.write(may.toString());
			out.write(internal.toString());
		}
	}
	

}
