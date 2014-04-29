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
package org.dmd.core;

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.core.interfaces.DmcNamedObjectIF;

/**
 * DmcNameClashExceptions are thrown by DmcNameResolverIF implementers if they have
 * more than object with a given name.
 */
public class DmcNameClashObjectSet<OBJ extends DmcNamedObjectIF> {

	ArrayList<DmcNamedObjectIF>	matches;
	
	public DmcNameClashObjectSet(){
		matches = new ArrayList<DmcNamedObjectIF>();
	}
	
	@SuppressWarnings("unchecked")
	public DmcNameClashObjectSet(ArrayList<OBJ> clash){
		matches = (ArrayList<DmcNamedObjectIF>) clash.clone();
	}
	
	public void addMatch(OBJ m){
		matches.add(m);
	}
	
	public Iterator<DmcNamedObjectIF> getMatches(){
		return(matches.iterator());
	}
		
	
	
}
