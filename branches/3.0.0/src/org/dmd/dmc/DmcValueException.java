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
package org.dmd.dmc;

/**
 * DmcValueExceptions are thrown when you attempt to set the value of a DmcAttribute
 * to a value that is not compatible with its type.
 */
@SuppressWarnings("serial")
public class DmcValueException extends Exception {

	String attrName;
	
	StringBuffer moreInfo;
	
	public DmcValueException(String message){
		super(message);
//		attrName = "";
	}
	
	public void setAttributeName(String an){
		attrName = an;
	}
	
	public String getAttributeName(){
		return(attrName);
	}
	
	public void addMoreInfo(String info){
		if (moreInfo == null)
			moreInfo = new StringBuffer();
		moreInfo.append(info + "\n");
	}
	
//	public DmcValueException(String an, String message){
//		super(message);
//		attrName = an;
//	}
	
//	/**
//	 * @return the name of the attribute associated with this error.
//	 */
//	public String getAttributeName(){
//		return(attrName);
//	}
	
	@Override
	public String toString(){
        String s = getClass().getName();
        String message = getLocalizedMessage();
//        if (attrName == null){
        if (moreInfo == null)
            return (message == null) ? s : (s + ": " + message + "\n");
        else
        	return (message == null) ? (s + "\n\n" + moreInfo.toString()) : (s + ": " + message + "\n\n" + moreInfo.toString());
//        }
//        else{
//            return (message == null) ? s : (s + ": " + message + "\n");        	
//        }
	}
}
