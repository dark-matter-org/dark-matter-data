package org.dmd.features.extgwt.util.doc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.features.extgwt.extended.MvcController;
import org.dmd.features.extgwt.extended.MvcEvent;
import org.dmd.features.extgwt.extended.MvcRegistryItem;

public class ControllerSection {

	public static void write(BufferedWriter out, Iterator<MvcController> controllers) throws IOException {
		out.write("        <div class=\"controllerSection\">\n");
		out.write("\n");
		out.write("		<!-- CONTROLLERS -->\n");
		out.write("\n");
		out.write("          <table>\n");
		
		while(controllers.hasNext()){
			MvcController c = controllers.next();
			Iterator<MvcEvent> handlesEvents = c.getHandlesEvent();
			Iterator<MvcEvent> dispatchesEvents = c.getDispatchesEvent();
			Iterator<MvcRegistryItem> usesItems = c.getUsesRegistryItem();
			Iterator<MvcRegistryItem> createsItems = c.getCreatesRegistryItem();
			
			writeControllerDescr(out,c);
			
			if (handlesEvents != null){
				
			}
			
			if (dispatchesEvents != null){
				
			}
			
			if (usesItems != null){
				
			}
			
			if (createsItems != null){
				
			}
		}
		
	}
	
	static void writeControllerDescr(BufferedWriter out, MvcController controller) throws IOException {
		out.write("            <tr class=\"line\"> \n");
		out.write("              <td class=\"line\" colspan=\"4\" > </td>\n");
		out.write("            </tr>\n");
		out.write("\n");
		out.write("            <tr>\n");
		out.write("              <td class=\"controllerName\" colspan=\"4\">\n");
		out.write("                " + controller.getName() + "\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");
		out.write("\n");
		out.write("            <tr>n");
		out.write("              <td class=\"spacer\"> </td>\n");
		out.write("              <td class=\"description\" colspan=\"3\">\n");
		out.write("                " + controller.getDescription() + "\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");

	}
	
	static void writeEvent(BufferedWriter out, MvcEvent event) throws IOException {
		out.write("            <tr>\n");
		out.write("		         <td> </td>\n");
		out.write("		         <td class=\"spacer\"> </td>\n");
		out.write("		         <td> <a href=\"#commonInit\"> " + event.getName() + " </a></td>\n");
		out.write("		         <td >\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");
	
		out.write("            <tr>\n");
		out.write("              <td> </td>\n");
		out.write("              <td> </td>\n");
		out.write("              <td> </td>\n");
		out.write("              <td class=\"datatype\"> data type</td>\n");
		out.write("            </tr>\n");
		
	}
	
	static void writeCreatesRegistryItem(BufferedWriter out, MvcRegistryItem item) throws IOException {
		out.write("            <tr>\n");
		out.write("              <td class=\"spacer\"> </td>\n");
		out.write("              <td class=\"eventCategory\" colspan=\"3\">Creates Registry Items</td>\n");
		out.write("            </tr>\n");
	}
	
	static void writeUsesRegistryItem(BufferedWriter out, MvcRegistryItem item) throws IOException {
		out.write("            <tr>\n");
		out.write("              <td class=\"spacer\"> </td>\n");
		out.write("              <td class=\"eventCategory\" colspan=\"3\">Uses Registry Items</td>\n");
		out.write("            </tr>\n");
	}
	
	static void writeRegistryItem(BufferedWriter out, MvcRegistryItem item) throws IOException {
		out.write("            <tr>\n");
		out.write("            <td class=\"spacer\"> </td>\n");
		out.write("            <td class=\"spacer\"> </td>\n");
		out.write("            <td> \n");
		out.write("            <a href=\"#commonInit\">" + item.getName() + "</a>\n");
		out.write("            </td>\n");
		out.write("            <td class=\"description\"> \n");
		out.write(               item.getDescription() + "\n");
		out.write("            </td>\n");
		out.write("            </tr>\n");
		out.write("            <tr>\n");
		out.write("            <td> </td>\n");
		out.write("            <td> </td>\n");
		out.write("            <td> </td>\n");
		out.write("            <td class=\"datatype\"> org.dmd.features.extgwt.client.ServerEventManager </td>\n");
		out.write("            </tr>\n");
		
	}

	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("          </table>\n");
		out.write("\n");
		out.write("        </div> <!-- controller section -->\n");
		
	}

		
}
