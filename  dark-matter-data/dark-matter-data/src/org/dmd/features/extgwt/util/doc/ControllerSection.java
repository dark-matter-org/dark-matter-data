//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
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
//			Iterator<MvcEvent> handlesEvents = c.getHandlesEvent();
//			Iterator<MvcEvent> dispatchesEvents = c.getDispatchesEvent();
//			Iterator<MvcRegistryItem> usesItems = c.getUsesRegistryItem();
//			Iterator<MvcRegistryItem> createsItems = c.getCreatesRegistryItem();
			
			writeControllerDescr(out,c);
			
			if (c.getHandlesEventHasValue()){
//			if (handlesEvents != null){
				out.write("            <!-- HANDLES EVENTS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Handles Events</td>\n");
				out.write("            </tr>\n\n");

				for(MvcEvent event: c.getHandlesEventIterable()){
//				while(handlesEvents.hasNext()){
//					writeEvent(out,handlesEvents.next());
					writeEvent(out,event);
				}
			}
			
			if (c.getDispatchesEventHasValue()){
//			if (dispatchesEvents != null){
				out.write("            <!-- DISPATCHES EVENTS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Dispatches Events</td>\n");
				out.write("            </tr>\n\n");

				for(MvcEvent event: c.getDispatchesEventIterable()){
//				while(dispatchesEvents.hasNext()){
//					writeEvent(out,dispatchesEvents.next());
					writeEvent(out,event);
				}
			}
			
			if (c.getUsesRegistryItemHasValue()){
//			if (usesItems != null){
				out.write("            <!-- USES REGISTRY ITEMS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Uses Registry Items</td>\n");
				out.write("            </tr>\n\n");

				for(MvcRegistryItem item: c.getUsesRegistryItemIterable()){
//				while(usesItems.hasNext()){
//					writeRegistryItem(out, usesItems.next());
					writeRegistryItem(out, item);
				}
			}
			
			if (c.getCreatesRegistryItemHasValue()){
//			if (createsItems != null){
				out.write("            <!-- CREATES REGISTRY ITEMS -->\n");
				out.write("            <tr>\n");
				out.write("            	<td> </td>\n");
				out.write("            	<td class=\"eventCategory\" colspan=\"3\">Creates Registry Items</td>\n");
				out.write("            </tr>\n\n");

				for(MvcRegistryItem item: c.getCreatesRegistryItemIterable()){
//				while(createsItems.hasNext()){
//					writeRegistryItem(out, createsItems.next());
					writeRegistryItem(out, item);
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