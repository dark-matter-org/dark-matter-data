package org.dmd.util.codegen;

/**
 * The MemberStatement stores the definition of a single Java class member
*/
public class MemberStatement {

	// The type of the member
	String type;
	
	// The name of the member
	String name;
	
	// The construction statement - optional
	String construction;
	
	// Why the member is there
	String reason;
	
	public MemberStatement(){
		// Just a spacer
		type 			= "";
		name 			= "";
		construction 	= "";
		reason			= "";
	}
	
	public MemberStatement(String t, String n, String r){
		type 			= t;
		name 			= n + ";";
		construction 	= "";
		reason			= r;
	}
	
	public MemberStatement(String t, String n, String c, String r){
		type 			= t;
		name 			= n;
		construction 	= "= " + c + ";";
		reason			= r;
	}
	
	
}
