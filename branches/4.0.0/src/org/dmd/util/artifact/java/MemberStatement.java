package org.dmd.util.artifact.java;

/**
 * The MemberStatement stores the definition of a single Java class member
*/
public class MemberStatement {
	
	// A comment line
	String comment;

	// The type of the member
	String type;
	
	// The name of the member
	String name;
	
	// The construction statement - optional
	String construction;
	
	// Why the member is there
	String reason;
	
	public MemberStatement(String c){
		// Just a comment
		comment			= c;
		type 			= "";
		name 			= "";
		construction 	= "";
		reason			= "";
	}
	
	public MemberStatement(){
		// Just a spacer
		comment			= null;
		type 			= "";
		name 			= "";
		construction 	= "";
		reason			= "";
	}
	
	public MemberStatement(String t, String n, String r){
		comment			= null;
		type 			= t;
		name 			= n + ";";
		construction 	= "";
		reason			= r;
	}
	
	public MemberStatement(String t, String n, String c, String r){
		comment			= null;
		type 			= t;
		name 			= n;
		construction 	= "= " + c + ";";
		reason			= r;
	}
	
	
}
