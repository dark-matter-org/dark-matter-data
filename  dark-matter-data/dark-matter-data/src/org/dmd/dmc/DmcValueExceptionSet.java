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

import java.util.ArrayList;

/**
 * The DmcValueExceptionSet is a collection of DmcValueExceptions.
 */
@SuppressWarnings("serial")
public class DmcValueExceptionSet extends Exception {

	ArrayList<DmcValueException> exceptions;
	
	String attrName;
	
	/**
	 * Constructs a new DmcValueExceptionSet. Use the add() method to add
	 * exceptions to the collection.
	 */
	public DmcValueExceptionSet(){
		super();
		exceptions = new ArrayList<DmcValueException>();
	}
	
	/**
	 * Adds another exception.
	 * @param ex The exception.
	 */
	public void add(DmcValueException ex){
		exceptions.add(ex);
	}
	
	public ArrayList<DmcValueException> getExceptions(){
		return(exceptions);
	}
	
	@Override
	public String toString(){
        StringBuffer sb = new StringBuffer();
        for(DmcValueException ex : exceptions)
        	sb.append(ex + "\n");
        return(sb.toString());
	}
}
