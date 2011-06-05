package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.WrapperTypeEnum;

public class ClassFormatter {

	static public void dumpDetails(BufferedWriter out, ClassDefinition cd) throws IOException {
		
		out.write("  <table>\n\n");
		className(out, cd);
		description(out, cd);
		type(out, cd);
		derivedFrom(out, cd);
		derived(out, cd);
		wrapper(out, cd);
		namedBy(out, cd);
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
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Description</td>\n");
			
			out.write("      <td colspan=\"2\">" + cd.getDescription() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void type(BufferedWriter out, ClassDefinition cd) throws IOException{
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
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Derived classes</td>\n");
			out.write("      <td colspan=\"2\">\n");
			TreeMap<StringName,ClassDefinition> sorted = new TreeMap<StringName,ClassDefinition>();
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

			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td>Named by</td>\n");
			
			out.write("      <td colspan=\"2\"> <a href=\"" + schema + ".html#" + na.getName() + "\">" + na.getName() + "</a> </td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void must(BufferedWriter out, ClassDefinition cd) throws IOException{
	    TreeMap<StringName,AttributeDefinition> allMust = cd.getAllMust();

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
					out.write("    <tr>\n");
					out.write("      <td class=\"spacer\"> </td>\n");
					out.write("      <td class=\"label\">Must</td>\n");
					out.write("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
					out.write("      <td> " + AttributeFormatter.getValueType(ad) + " </td>");
					out.write("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
					if (ad.getDescription() != null)
						out.write("      <td> " + ad.getDescription() + " </td>\n");
					out.write("    </tr>\n\n");
				}
				else{
					out.write("    <tr>\n");
					out.write("      <td class=\"spacer\"> </td>\n");
					out.write("      <td class=\"label\"> </td>\n");
					out.write("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
					out.write("      <td> " + AttributeFormatter.getValueType(ad) + " </td>");
					out.write("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
					if (ad.getDescription() != null)
						out.write("      <td> " + ad.getDescription() + " </td>\n");
					out.write("    </tr>\n\n");
				}
			}
		}
	}
	
	static void may(BufferedWriter out, ClassDefinition cd) throws IOException{
	    TreeMap<StringName,AttributeDefinition> allMay = cd.getAllMay();

	    if (allMay.size() > 0){

			boolean first = true;
			for(AttributeDefinition ad: allMay.values()){
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
					out.write("    <tr>\n");
					out.write("      <td class=\"spacer\"> </td>\n");
					out.write("      <td class=\"label\">May</td>\n");
					out.write("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
					out.write("      <td> " + AttributeFormatter.getValueType(ad) + " </td>");
					out.write("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
					if (ad.getDescription() != null)
						out.write("      <td> " + ad.getDescription() + " </td>\n");
					out.write("    </tr>\n\n");
				}
				else{
					out.write("    <tr>\n");
					out.write("      <td class=\"spacer\"> </td>\n");
					out.write("      <td class=\"label\"> </td>\n");
					out.write("      <td> <a href=\"" + schema + ".html#" + ad.getName() + "\">" + ad.getName() + "</a> </td>\n");
					out.write("      <td> " + AttributeFormatter.getValueType(ad) + " </td>");
					out.write("      <td> <a href=\"" + tschema + ".html#" + type + "\">" + type + "</a> </td>\n");
					if (ad.getDescription() != null)
						out.write("      <td> " + ad.getDescription() + " </td>\n");
					out.write("    </tr>\n\n");
				}
			}
		}
	}
	

}
