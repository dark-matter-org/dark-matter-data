package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcServerEventDMW;
import org.dmd.util.formatting.CodeFormatter;

public class MvcServerEvent extends MvcServerEventDMW {

	String objClass;
	
	String dmoClass;
	
	// The signature of the abstract function that will handle this event.
	StringBuffer abstractFunction;
	
	public MvcServerEvent(){
		super();
	}
	
	/**
	 * @return The class name of the server event.
	 */
	public String getObjClass(){
		if (objClass == null){
			int lastDotPos = getEventDataType().lastIndexOf(".");
			int dmoPos = getEventDataType().indexOf("DMO");
			objClass = getEventDataType().substring(lastDotPos+1,dmoPos);
			dmoClass = getEventDataType().substring(lastDotPos+1);
		}
		return(objClass);
	}
	
	public String getDMOClass(){
		if (dmoClass == null)
			getObjClass();
		
		return(dmoClass);
	}
	
	public String getAbstractFunction(){
		
		if (abstractFunction == null){
			abstractFunction = new StringBuffer();
			abstractFunction.append("    /**\n");
			abstractFunction.append("     * The derived class must overload this method to handle the " + getName() + " event.\n");
			abstractFunction.append("     * <P>\n");
			CodeFormatter.dumpCodeComment(getDescription(), abstractFunction, "     * ");
			abstractFunction.append("     */\n");
			abstractFunction.append("    ");

			abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "(EventTypeEnum etype, " + dmoClass + " obj);\n\n");

		}
		
		return(abstractFunction.toString());
	}
}
