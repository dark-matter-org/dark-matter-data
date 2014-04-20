package org.dmd.util.artifact.java;

import java.util.ArrayList;

import org.dmd.util.runtime.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

/**
 * The MemberManager manages a set of Java class members and dumps them in a 
 * nice format.
 */
public class MemberManager {
	
	ArrayList<MemberStatement>	members;
	int	longestType;
	int longestName;
	int longestConstruction;
	
	public MemberManager(){
		members = new ArrayList<MemberStatement>();
	}
	
	public void addSpacer(){
		members.add(new MemberStatement());
	}
	
	/**
	 * Adds a new member to the collection.
	 * @param t the Java type of the member
	 * @param n the name of the member
	 * @param r the reason for the member's existence
	 */
	public void addMember(String t, String n, String r){
		members.add(new MemberStatement(t, n, r));
		
		if (t.length() > longestType)
			longestType = t.length();
		if (n.length() > longestName)
			longestName = n.length();
	}
	
	/**
	 * Adds a new member with construction information to the collection.
	 * @param t the Java type of the member
	 * @param n the name of the member
	 * @param c the constructor for the member
	 * @param r the reason for the member's existence
	 */
	public void addMember(String t, String n, String c, String r){
		members.add(new MemberStatement(t, n, c, r));
		
		if (t.length() > longestType)
			longestType = t.length();
		if (n.length() > longestName)
			longestName = n.length();
		if (c.length() > longestConstruction)
			longestConstruction = c.length();
		
	}
	
	public String getFormattedMembers(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    // " + DebugInfo.getWhereWeWereCalledFrom() + "\n");

		int tpadding = longestType + 4;
		int npadding = longestName + 4;
		int cpadding = longestConstruction + 6;
		
		PrintfFormat 	tformat 	= new PrintfFormat("%-" + tpadding + "s");
		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");
		PrintfFormat 	cformat 	= new PrintfFormat("%-" + cpadding + "s");
		
		for(MemberStatement mem: members){
			sb.append("    " + tformat.sprintf(mem.type));
			sb.append(nformat.sprintf(mem.name));
			sb.append(cformat.sprintf(mem.construction));
			sb.append("// " + mem.reason + "\n");
		}
		
		return(sb.toString());
	}
}
