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

			abstractFunction.append("abstract protected void handle" + getCamelCaseName() + "(DMPEventTypeEnum etype, " + dmoClass + " obj);\n\n");

		}
		
		return(abstractFunction.toString());
	}
}
