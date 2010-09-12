package org.dmd.features.extgwt.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcEventDMW;
import org.dmd.util.formatting.CodeFormatter;

public class MvcEvent extends MvcEventDMW {
	
	// The type of data in the event with collection and generic info 
	// e.g. List<String> or Map<String,Person>
	String eventDataType;
	
	// The call to our abstract function with the appropriate cast of the 
	// AppEvent data. If no user data comes with the event, we just call the 
	// abstract function will no args
	StringBuffer handleLocalFunctionCall;

	// The signature of the abstract function that will handle this event.
	StringBuffer abstractFunction;

	public MvcEvent(){
		super();
	}
	
	public MvcEvent(DmcObject obj){
		super(obj);
	}

	public String getHandleLocalFunctionCall(){
		initCodeGenInfo();
		return(handleLocalFunctionCall.toString());	
	}
	
	public String getAbstractFunction(){
		initCodeGenInfo();
		return(abstractFunction.toString());	
	}
	
	void initCodeGenInfo(){
		if (handleLocalFunctionCall == null){
			handleLocalFunctionCall = new StringBuffer();
			abstractFunction = new StringBuffer();
			
			handleLocalFunctionCall.append("            ");
			
			abstractFunction.append("    /**\n");
			abstractFunction.append("     * The derived class must overload this method to handle the " + getName() + " event.\n");
			abstractFunction.append("     * <P>\n");
			CodeFormatter.dumpCodeComment(getDescription(), abstractFunction, "     * ");
			abstractFunction.append("     */\n");
			abstractFunction.append("    ");
			
			if (getUserDataType() == null){
				handleLocalFunctionCall.append("handle" + getCamelCaseName() + "Event(event);\n");
				
				abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "Event(AppEvent event);\n");
			}
			else{
				// We have data
				String dtype = CodeFormatter.getTheClass(getUserDataType());
				if (getUserDataCollection() == null){
					handleLocalFunctionCall.append("handle" + getCamelCaseName() + "Event(event,(" + dtype + ")event.getData());\n");

					abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "Event(AppEvent event," + dtype + " data);\n");
				}
				else{
					String col = CodeFormatter.getTheClass(getUserDataCollection());
					if (getUserDataGenericSpec() == null){
						handleLocalFunctionCall.append("handle" + getCamelCaseName() + "Event(event,(" + col + "<" + dtype + ">)event.getData());\n");

						abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "Event(AppEvent event," + col + "<" + dtype + "> data);\n");
					}
					else{
						String g = getUserDataGenericSpec();
						handleLocalFunctionCall.append("handle" + getCamelCaseName() + "Event(event,(" + col + g + ")event.getData());\n");

						abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "Event(AppEvent event," + col + g + " data);\n");
					}
				}
			}
		}
	}
}
