//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2020 dark-matter-data committers
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
package org.dmd.dmu.util.json;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.types.IntegerVar;
import org.json.JSONObject;

public class DeepSortNode {
	
	// Indicates all or part of a key that might indicate that it's a sort key.
	// Often, such key will include "name", "id" etc.
	private TreeSet<String>	possibleSortKeyNames;
	
//	private final static String SUGGEST_NAME 	= "name";
//	private final static String SUGGEST_ID 		= "-id";
	
	private String						path;
	private String						key;
	private boolean 					isArray;
	private boolean 					isArrayElement;
	
	// Keys for primitives in this object
	private TreeSet<String>				primitives;
	
	// Children are only maintained for non-array nodes 
	private TreeMap<String,DeepSortNode>	children;
	
	// Key: the signature of an object
	// Value: the count of how many times the signature is seen in an array of objects
	private TreeMap<String,IntegerVar>	signatureDist;
	
	// If this is an array node, we gather all info the objects here
	// the assumption is that all objects are (more or less) the same
	private DeepSortNode	arrayElement;
	
	/**
	 * Creates a root node.
	 */
	public DeepSortNode(TreeSet<String>	possibleSortKeyNames) {
		path 	= "";
		key 	= null;
		isArray = false;
		this.possibleSortKeyNames = possibleSortKeyNames;
	}
	
	public DeepSortNode(DeepSortNode parent, String key, boolean isArray, TreeSet<String> possibleSortKeyNames) {
		this.path 		= parent.path + "/" + key;
		this.key 		= key;
		this.isArray	= isArray;
		this.possibleSortKeyNames = possibleSortKeyNames;

		parent.addChild(this);
		
		if (isArray) {
			arrayElement = new DeepSortNode(this, possibleSortKeyNames);
		}
	}
	
	/**
	 * Construct an array element node.
	 * @param parent
	 */
	private DeepSortNode(DeepSortNode parent, TreeSet<String> possibleSortKeyNames) {
		path = parent.path + "[]";
		key	= null;
		this.possibleSortKeyNames = possibleSortKeyNames;
		isArrayElement = true;
		signatureDist = new TreeMap<String, IntegerVar>();
	}
	
	public boolean isArray() {
		return(isArray);
	}
	
	public DeepSortNode arrayElement() {
		return(arrayElement);
	}
	
	public String path() {
		return(path);
	}
	
	/**
	 * For an array element node, this will create a key signature for the specified object
	 * and maintain a count of how many times we see that signature for all of the objects
	 * in an array. This allows us to determine if we're dealing with homogeneous or
	 * heterogeneous objects and provides us with a count of each unique signature.
	 * @param obj the object to be analyzed.
	 */
	public void addKeySignature(JSONObject obj) {
		TreeSet<String> keySet = new TreeSet<String>();
		
		Iterator<String> keys = obj.keys();
		while(keys.hasNext()) {
			String key = keys.next();
			keySet.add(key);
		}
		
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			sb.append(it.next());
			if (it.hasNext())
				sb.append("--");
		}
		
		String sig = sb.toString()	;
		IntegerVar count = signatureDist.get(sig);
		if (count == null) {
			count = new IntegerVar();
			signatureDist.put(sig, count);
		}
		count.set(count.intValue() + 1);
	}
	
	private void addChild(DeepSortNode child) {
		if (children == null)
			children = new TreeMap<>();
		children.put(child.key, child);
	}
	
	public void addPrimitive(String key) {
		if (primitives == null)
			primitives = new TreeSet<>();
		primitives.add(key);
	}
	
	public void fullHierarchy(StringBuilder sb) {
		if (isArrayElement) {
			if (primitives != null) {
				TreeSet<String> suggestions = new TreeSet<String>();
					
				for(String key: primitives) {
					for(String possible: possibleSortKeyNames) {
						if (key.contains(possible)) {
							suggestions.add(key);
						}
					}
				}
				
				if (suggestions.size() > 0) {
					sb.append(path + "  -- key suggestions: ");
					for (String key: suggestions)
						sb.append(key + " ");
					sb.append("   signatures: " + signatureDist.size());
					sb.append("\n");
				}
				else {
					sb.append(path + "  -- NO SUGGESTION -- all primitives: ");
					for(String key: primitives) {
						sb.append(key + " ");
					}					
					sb.append("   signatures: " + signatureDist.size());
					sb.append("\n");
				}
			}
			else {
				sb.append(path + "\n");
				
			}
		}
		else {
			sb.append(path + "\n");
		}
		
		if (children != null) {
			for(DeepSortNode child: children.values()) {
				child.fullHierarchy(sb);
			}
		}
		if (arrayElement != null)
			arrayElement.fullHierarchy(sb);
		
	}
	
	public void pathAndKeys(StringBuilder sb) {
		if (isArrayElement) {
			if (primitives != null) {
				TreeSet<String> suggestions = new TreeSet<String>();
					
				for(String key: primitives) {
					for(String possible: possibleSortKeyNames) {
						if (key.contains(possible)) {
							suggestions.add(key);
						}
					}
				}
				if (suggestions.size() == 1) {
					sb.append("pathAndKeys " + path.replace("[]", "") + "    " + suggestions.first() + "\n");
				}
				else if (suggestions.size() > 0) {
					sb.append("pathAndKeys " + path.replace("[]", "") + "    -- key suggestions: ");
					for (String key: suggestions)
						sb.append(key + " ");
//					sb.append("   signatures: " + signatureDist.size());
					sb.append("\n");
				}
				else {
					sb.append("pathAndKeys " + path.replace("[]", "") + "    -- NO SUGGESTION -- all primitives: ");
					for(String key: primitives) {
						sb.append(key + " ");
					}					
//					sb.append("   signatures: " + signatureDist.size());
					sb.append("\n");
				}
			}
			else {
//				sb.append(path + "\n");
			}
		}
		else {
//			sb.append(path + "\n");
		}
		
		if (children != null) {
			for(DeepSortNode child: children.values()) {
				child.pathAndKeys(sb);
			}
		}
		if (arrayElement != null)
			arrayElement.pathAndKeys(sb);
		
	}

}
