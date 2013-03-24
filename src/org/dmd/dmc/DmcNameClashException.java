//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
import java.util.Iterator;

/**
 * DmcNameClashExceptions are thrown by DmcNameResolverIF implementers if they have
 * more than object with a given name.
 */
@SuppressWarnings("serial")
public class DmcNameClashException extends Exception {

	ArrayList<DmcNamedObjectIF>	matches;
	
	@SuppressWarnings("unchecked")
	public DmcNameClashException(String message, ArrayList<DmcNamedObjectIF> clash){
		super(message);
		matches = (ArrayList<DmcNamedObjectIF>) clash.clone();
	}
	
	public DmcNameClashException(String message){
		super(message);
		matches = new ArrayList<DmcNamedObjectIF>();
	}
	
	public void addMatch(DmcNamedObjectIF m){
		matches.add(m);
	}
	
	public Iterator<DmcNamedObjectIF> getMatches(){
		return(matches.iterator());
	}
		
	@Override
	public String toString(){
        String s = getClass().getName();
        String message = getLocalizedMessage();
        return (message == null) ? s : (s + ": " + message + "\n");
	}
	
	
}
