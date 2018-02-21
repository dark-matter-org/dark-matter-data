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

import org.dmd.util.formatting.PrintfFormat;

/**
 * The PatternDiscriminator can be used to analyze a set of strings and attempt to determine
 * a set of patterns that may exist in them.
 * @author peter.strong
 *
 */
public class PatternDiscriminator {
	
	ArrayList<Pattern>	patterns;
	int longestExample;

	// The number of distinct patterns we'll retain
	int limit;
	boolean collapseAlphaNumeric;
	boolean strict;
	
	/**
	 * Creates a pattern discriminator with the specified behaviour.
	 * @param limit the limit of the number of distinct patterns we'll recognize 
	 * @param collapseAlphaNumeric indicates we'll treat alphanumerics as a single class of token,
	 * otherwise we differentiate between letters and numbers
	 * @param strict if true, when we try to match existing patterns, we'll take into account the length
	 * of the individual tokens - if the lengths of each token on the pattern don't match, we don't match.
	 */
	public PatternDiscriminator(int limit, boolean collapseAlphaNumeric, boolean strict){
		longestExample = 0;
		this.limit = limit;
		this.collapseAlphaNumeric = collapseAlphaNumeric;
		this.strict = strict;
		patterns = new ArrayList<Pattern>();
	}
	
	/**
	 * Analyzes the specified string and attempts to categorize it as one of our existing
	 * patterns up to the limit of the number of patterns that was indicated at construction
	 * time.
	 * @param input the string we'll analyze
	 * @return the pattern if added a pattern or characterized the string as an existing pattern and
	 * null if we've hit the limit of the patterns we'd maintain.
	 */
	public Pattern analyze(String input){
		Pattern rc = null;
		
		if (patterns.size() == limit)
			return(null);
		
		ArrayList<Part> baseParts = new ArrayList<Part>();
		String value = input.trim();
		
		for(int i=0; i<value.length(); i++){
			baseParts.add(new Part(value.charAt(i),collapseAlphaNumeric));
		}
		
		ArrayList<Part> parts = new ArrayList<Part>();
		
		Part currPart = baseParts.get(0);
		parts.add(currPart);
		for(int i=1; i<baseParts.size(); i++){
			// Cycle through the parts, if we hit a part that can't be
			// consumed by the current part, we advance to the next part
			if (!currPart.consume(baseParts.get(i))){
				currPart = baseParts.get(i);
				parts.add(currPart);
			}
		}
		
		Pattern newPattern = new Pattern(value, parts, strict);
		rc = newPattern;
		
		boolean foundMatch = false;
		for(Pattern p: patterns){
			if (p.matches(newPattern)){
				foundMatch = true;
				rc = p;
				break;
			}
		}
		
		if (!foundMatch && (patterns.size() < limit) ){
			patterns.add(newPattern);
			if (newPattern.example().length() > longestExample)
				longestExample = newPattern.example().length();
		}
		
		return(rc);
	}
	
	public ArrayList<Pattern> getPatterns(){
		return(patterns);
	}
	
	public ArrayList<String> getFormattedPatterns(){
		ArrayList<String>	rc = new ArrayList<String>();
		
		PrintfFormat format = new PrintfFormat("%" + longestExample + "s");
		
		for(Pattern p: patterns){
			rc.add(p.toString(format));
		}
		
		return(rc);
	}
}
