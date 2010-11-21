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
				out.write("            <!-- HANDLES EVENTS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Handles Events</td>\n");
				out.write("            </tr>\n\n");

				while(handlesEvents.hasNext()){
					writeEvent(out,handlesEvents.next());
				}
			}
			
			if (dispatchesEvents != null){
				out.write("            <!-- DISPATCHES EVENTS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Dispatches Events</td>\n");
				out.write("            </tr>\n\n");

				while(dispatchesEvents.hasNext()){
					writeEvent(out,dispatchesEvents.next());
				}
			}
			
			if (usesItems != null){
				out.write("            <!-- USES REGISTRY ITEMS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Uses Registry Items</td>\n");
				out.write("            </tr>\n\n");

				while(usesItems.hasNext()){
					writeRegistryItem(out, usesItems.next());
				}
			}
			
			if (createsItems != null){
				out.write("            <!-- CREATES REGISTRY ITEMS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Creates Registry Items</td>\n");
				out.write("            </tr>\n\n");

				while(createsItems.hasNext()){
					writeRegistryItem(out, createsItems.next());
				}
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
		out.write("                <a name=\"" + controller.getName() + "\"> " + controller.getName() + " </a>\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");
		out.write("\n");
		out.write("            <tr>\n");
		out.write("              <td class=\"spacer\"> </td>\n");
		out.write("              <td class=\"description\" colspan=\"3\">\n");
		out.write("                " + controller.getDescription() + "\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");

	}
	
	static void writeEvent(BufferedWriter out, MvcEvent event) throws IOException {
		out.write("            <!-- EVENT -->\n");
		out.write("            <tr>\n");
		out.write("		         <td> </td>\n");
		out.write("		         <td class=\"spacer\"> </td>\n");
		out.write("		         <td> <a href=\"#commonInit\"> " + event.getName() + " </a></td>\n");
		out.write("		         <td >\n");
		out.write("                  " + event.getDescription() + "\n");
		out.write("              </td>\n");
		out.write("            </tr>\n");
	
		out.write("            <tr>\n");
		out.write("              <td> </td>\n");
		out.write("              <td> </td>\n");
		out.write("              <td> </td>\n");
		out.write("              <td class=\"datatype\"> \n");
		if (event.getUserDataType() != null){
			out.write("                  " + event.getUserDataType() + "\n");
		}
		out.write("              </td>\n");
		out.write("            </tr>\n\n");
		
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
		out.write("              " + item.getDescription() + "\n");
		out.write("            </td>\n");
		out.write("            </tr>\n");
		out.write("            <tr>\n");
		out.write("            <td> </td>\n");
		out.write("            <td> </td>\n");
		out.write("            <td> </td>\n");
		out.write("              <td class=\"datatype\"> \n");
		if (item.getUserDataType() != null){
			out.write("                  " + item.getUserDataType() + "\n");
		}
		out.write("              </td>\n");
		out.write("            </tr>\n");
		
	}

	public static void writeEnd(BufferedWriter out) throws IOException {
		out.write("          </table>\n");
		out.write("\n");
		out.write("        </div> <!-- controller section -->\n");
		
	}

		
}
