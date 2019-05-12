package org.dmd.templates.server.util;

import java.util.ArrayList;

import org.dmd.templates.server.extended.Section;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;

public class StaticAccessInfo implements Comparable<StaticAccessInfo> {
	
	Section	section;
	
	ArrayList<String>	callPaths;
	
	public StaticAccessInfo(Section s){
		section = s;
		callPaths = new ArrayList<String>();
	}
	
	public String getName(){
		return(section.getName().getNameString());
	}
	
	public void addPath(String p){
		if (callPaths.contains(p)){
//			DebugInfo.debug("Tried to add duplicate call path: " + p + " to section " + section + "\n\n" + DebugInfo.getCurrentStack());
		}
		else
			callPaths.add(p);
	}

	@Override
	public int compareTo(StaticAccessInfo info) {
		if (info == null)
			return(1);
		
		return(section.getName().getNameString().compareTo(info.section.getName().getNameString()));
	}
	
	@Override
	public int hashCode(){
		return(section.getName().getNameString().hashCode());
	}

	public String getClassImport(){
		return(section.getClassImport());
	}
	
	public String getAccessFunctions(){
		StringBuffer sb = new StringBuffer();
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		String sn = Manipulator.capFirstChar(section.getName().getNameString());

		if (callPaths.size() == 1){
			sb.append("    /**\n");
			sb.append("     * @return the " + section.getName() + " Section at: " + callPaths.get(0)+ "\n");
			sb.append("     */\n");
			sb.append("    public " + section.getName() + " get" + sn + "(){\n");
			sb.append("        return(" + callPaths.get(0) + ");\n");
			sb.append("    }\n\n");
		}
		else{
			String suffix = "";
			for(int i=0; i<callPaths.size(); i++){
				int x = i+1;
				suffix = "" + x;
				sb.append("    /**\n");
				sb.append("     * @return the " + section.getName() + " Section at: " + callPaths.get(i)+ "\n");
				sb.append("     */\n");
				sb.append("    public " + section.getName() + " get" + sn + suffix + "(){\n");
				sb.append("        return(" + callPaths.get(i) + ");\n");
				sb.append("    }\n\n");
			}
		}
		
		return(sb.toString());
	}

}
