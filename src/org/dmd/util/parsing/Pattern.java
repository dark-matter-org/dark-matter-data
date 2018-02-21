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
package org.dmd.util.parsing;

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.util.formatting.PrintfFormat;

/**
 * The Pattern class maintains a signature of a particular string pattern and a set of 
 * of Parts. Once created, a Pattern can be compared to other patterns to see if they
 * match. This mechanism is used by the overall PatternDiscriminator to create a 
 * collection of Patterns that are distinct.
 */
public class Pattern {
	
	private final static PrintfFormat occurFormat = new PrintfFormat("%-7d");
	
	private static int nextId = 1;

	private String			example;
	private ArrayList<Part> parts;
	private int				count = 1;
	private boolean			strict;
	private String id;
	
	public Pattern(String ex, ArrayList<Part> p, boolean strict){
		example = ex;
		parts = p;
		this.strict = strict;
		id = "" + nextId;
		nextId++;
	}
	
	/**
	 * @return the unique id for this pattern.
	 */
	public String id(){
		return(id);
	}
	
	public String example(){
		return(example);
	}
	
	public Iterator<Part> getParts(){
		return(parts.iterator());
	}
	
	public int count(){
		return(count);
	}
	
	public int getPartCount(){
		return(parts.size());
	}
	
	public boolean strict(){
		return(strict);
	}
	
	public boolean matches(Pattern p){
		boolean rc = true;
		
		if (parts.size() != p.parts.size())
			rc = false;
		else{
			for(int i=0; i<parts.size(); i++){
				if (!parts.get(i).matches(p.parts.get(i), strict)){
					rc = false;
					break;
				}
			}
		}
		
		if (rc)
			count++;
		
		return(rc);
	}
	
	@Override
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Example: " + example + "     Ocurred: " + occurFormat.sprintf(count) + "  ");
		
		for(Part p: parts)
			sb.append(p.toString(strict));
		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	public String toString(PrintfFormat exampleFormat){
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Example: " + exampleFormat.sprintf(example) + "     Ocurred: " + occurFormat.sprintf(count) + "  ");
		
		for(Part p: parts)
			sb.append(p.toString(strict));
		
		sb.append("\n");
		
		return(sb.toString());
	}
}
