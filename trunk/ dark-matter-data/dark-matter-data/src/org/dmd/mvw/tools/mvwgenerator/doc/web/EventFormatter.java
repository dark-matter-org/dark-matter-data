package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.util.exceptions.DebugInfo;

public class EventFormatter {

	static public void dumpEventSummary(Event event, BufferedWriter out) throws IOException {
		DebugInfo.debug(event.getBackRefs());
		event.showReferences();
		
		out.write("        <tr>\n");
		
		out.write("            <td> <div class=\"eventName\">" + event.getEventName() + "</div>\n");
		out.write("            " + StandardParts.moduleLink(event.getDefinedInModule()) + "\n");
		out.write("            </td>\n");
		
		if (event.getArgVector() != null)
		out.write("            <td colspan=\"2\" class=\"description\">" + event.getDescription() + "\n");
		out.write("            </td>\n");
		
		out.write("        </tr>\n");
		
		out.write("        <tr>\n");
		out.write("            <td>\n");
		out.write("            </td>\n");
		out.write("            <td>\n");
		out.write("                <table>\n");
		if (event.getFiredBy().size() > 0){
			out.write("                    <tr>");
			out.write("                        <td> Fired by:");
			out.write("                        </td>");
			out.write("                        <td>");
			
			for(MvwDefinition def: event.getFiredBy().values()){
				out.write(def.getCamelCaseName() + " ");
			}
			
			out.write("                        </td>");
			out.write("                    </tr>");
		}
		if (event.getHandledBy().size() > 0){
			out.write("                    <tr>");
			out.write("                        <td> Handled by:");
			out.write("                        </td>");
			out.write("                        <td>");
			
			for(MvwDefinition def: event.getHandledBy().values()){
				out.write(def.getCamelCaseName() + " ");
			}
			
			out.write("                        </td>");
			out.write("                    </tr>");
		}
		out.write("                </table>\n");
		out.write("            </td>\n");
		out.write("        </tr>\n");
		
	}
	
	
}
