//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.core.feedback;

import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.core.DmcObject;

/**
 * The SourceInfo class is used to store information about the origin of an
 * object against which rules are applied. It's all very well to be able to
 * thrown an exception from a rule to indicate that something is wrong, but
 * if you don't know the source of the object, it's hard to know where you
 * need to fix it.
 * <p/>
 * Not all information that can be represented in a SourceInfo item is
 * necessarily available all the time.
 * <p/>
 * If you require further source information than what is available here,
 * simply derive your own class and add the information you require and overload
 * the toString() method.
 */
public class SourceInfo {
	
	// The file from which an object was read
	String fileName;
	
	// The line number in a file
	String lineNumber;
	
	// If the object is named, this may hold its name
	String objectName;
	
	// If the object in question is being manipulated remotely, this is
	// a String representation of the session
	String session;
	
	/**
	 * Used to create source information about an object that has been read from a file.
	 * If the object is named, its name is extracted.
	 * @param fn The file name
	 * @param ln The line number.
	 * @param obj The object.
	 */
	public SourceInfo(String fn, String ln, DmcObject obj){
		fileName 	= fn;
		lineNumber 	= ln;
		
		if (obj instanceof DmcNamedObjectIF)
			objectName = ((DmcNamedObjectIF)obj).getObjectName().getNameString();
		else
			objectName 	= null;
		
		session 	= null;
	}
	
	/**
	 * Used to create source information associated with a remote session that is 
	 * doing something with the object to which rules are being applied.
	 * If the object is named, its name is extracted.
	 * @param sess A string representation of the session information.
	 * @param obj The object being altered.
	 */
	public SourceInfo(String sess, DmcObject obj){
		fileName 	= null;
		lineNumber 	= null;
		
		if (obj instanceof DmcNamedObjectIF)
			objectName = ((DmcNamedObjectIF)obj).getObjectName().getNameString();
		else
			objectName 	= null;
		
		session 	= sess;
	}
	
	/**
	 * Used to create source information about an object that was defined at a known
	 * location, but not much else is available. This can happen, for instance, with
	 * rule objects that haven't yet been validated.
	 * @param fn The file name
	 * @param ln The line number.
	 */
	public SourceInfo(String fn, String ln){
		fileName 	= fn;
		lineNumber 	= ln;
		objectName	= null;
		session		= null;
	}
	
	/**
	 * Used to create source information about an object that was defined at a known
	 * location, but not much else is available. This can happen, for instance, with
	 * rule objects that haven't yet been validated.
	 * @param fn The file name
	 * @param ln The line number.
	 */
	public SourceInfo(String fn, int ln){
		fileName 	= fn;
		lineNumber 	= ln + "";
		objectName	= null;
		session		= null;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		if (fileName != null)
			sb.append("File   : " + fileName + "\n");
		
		if (lineNumber != null)
			sb.append("Line   : " + lineNumber + "\n");
		
		if (objectName != null)
			sb.append("Object : " + objectName + "\n");
		
		if (session != null)
			sb.append("Session: " + session + "\n");
		
		return(sb.toString());
	}

}
