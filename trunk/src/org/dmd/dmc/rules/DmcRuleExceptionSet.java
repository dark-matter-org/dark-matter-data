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
package org.dmd.dmc.rules;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class DmcRuleExceptionSet extends Exception {
	
	String	fileName;
	String	lineNumber;

	ArrayList<DmcRuleException> exceptions;

	public DmcRuleExceptionSet(){
		super();
		exceptions = new ArrayList<DmcRuleException>();
	}
	
	public void add(DmcRuleException ex){
		exceptions.add(ex);
	}
	
	public ArrayList<DmcRuleException> geExceptions(){
		return(exceptions);
	}
	
	public void fileName(String fn){
		fileName = fn;
	}
	
	public void lineNumber(String ln){
		lineNumber = ln;
	}
	
	/**
	 * Appends the exceptions in the specified exception set to this exception set.
	 * @param dres a new set of exceptions.
	 */
	public void add(DmcRuleExceptionSet dres){
		if (dres == null)
			return;
		if (dres.exceptions == null)
			return;
		if (exceptions == null)
			exceptions = new ArrayList<DmcRuleException>();
		
		for(DmcRuleException ex: dres.exceptions)
			exceptions.add(ex);
	}
	
	/**
	 * @return true if any of the exceptions has requested an immediate halt.
	 */
	public boolean immediateHalt(){
		if (exceptions == null)
			return(false);
		
		for(DmcRuleException ex: exceptions){
			if (ex.immediateHalt)
				return(true);
		}
		
		return(false);
	}
	
	@Override
	public String toString(){
        StringBuffer sb = new StringBuffer();
        
        if (fileName != null)
        	sb.append("File: " + fileName + "\n");
        
        if (lineNumber != null)
        	sb.append("Line: " + lineNumber + "\n");
        
        sb.append("\n");
                
        for(DmcRuleException ex : exceptions)
        	sb.append(ex.getLocalizedMessage() + "\n");

        return(sb.toString());
	}
	
	public int getCount(){
		return(exceptions.size());
	}
}
