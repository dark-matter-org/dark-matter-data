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
package org.dmd.core.rules;

import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.SourceInfo;

@SuppressWarnings("serial")
public class DmcRuleExceptionSet extends DMFeedbackSet {
	
//	SourceInfo					source;
//	ArrayList<DmcRuleException> exceptions;

	public DmcRuleExceptionSet(){
		super();
//		source		= null;
//		exceptions 	= new ArrayList<DmcRuleException>();
	}
	
	public void add(DmcRuleException ex){
		super.add(ex);
	}
	
//	public ArrayList<DmcRuleException> geExceptions(){
//		return(exceptions);
//	}
	
	public void source(SourceInfo si){
		setLocation(si);
	}
	
//	public SourceInfo source(){
//		return(source);
//	}
	
	/**
	 * Appends the exceptions in the specified exception set to this exception set.
	 * @param dres a new set of exceptions.
	 */
	public void add(DmcRuleExceptionSet dres){
		if (dres == null)
			return;
		super.add(dres);
	}
	
	/**
	 * @return true if any of the exceptions has requested an immediate halt.
	 */
	public boolean immediateHalt(){
		if (feedback == null)
			return(false);
		
		for(DMFeedback ex: feedback){
			if (ex instanceof DmcRuleException)
			if (((DmcRuleException)ex).immediateHalt)
				return(true);
		}
		
		return(false);
	}
		
//	/**
//	 * @return an Iterator over the set of exceptions.
//	 */
//	public Iterator<DmcRuleException> getExceptions(){
//		return(exceptions.iterator());
//	}
	
	public int getCount(){
		return(feedback.size());
	}
}
