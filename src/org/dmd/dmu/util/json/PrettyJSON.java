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

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * The PrettyJSON class is used to pretty print org.json.JSONObjects. It allows you to present
 * the contents of an object with the keys in sorted order. It can also present the primitive values
 * first, followed by the arrays and then the objects. For primitive values, it will also align
 * the values in a single column (based on using the length of the longest key as an indent).
 */
public class PrettyJSON {
	
	static private PrettyJSON instance;

	private PrettyJSON() {
		
	}
	
	class VContainer {
		JType type;
		
		// The key, or null if this is just a value
		String key;
		
		Object value;
		
		VContainer(JType type, String key, Object value) {
			this.type = type;
			this.key = key;
			this.value = value;
		}
		
		void prettyPrint(StringBuilder sb, String allIndent, String indent, boolean moreValues, int longestKey, boolean primitivesFirst) {
			switch(type) {
			case ARRAY:
				if (key == null)
					sb.append(allIndent + indent + " [\n");
				else
					sb.append(allIndent + indent + "\"" + key + "\": [\n");
				
				ArrayList<VContainer> values = values();
				
				Iterator<VContainer> it = values.iterator();
				while(it.hasNext()) {
					VContainer vc = it.next();
					vc.prettyPrint(sb, allIndent, indent + "  ", it.hasNext(), longestKey, primitivesFirst);
				}
				
				sb.append(allIndent + indent + "]");
				break;
			case OBJECT:
				if (key == null)
					sb.append(allIndent + indent + "{\n");
				else
					sb.append(allIndent + indent + "\"" + key + "\": {\n");
				
				instance.prettyPrint((JSONObject)value, sb, allIndent, indent, primitivesFirst);
				
				sb.append(allIndent + indent + "}");
				break;
			case PRIMITIVE:
				if (key == null)
					sb.append(allIndent + indent + "\"" + value.toString() + "\"");
				else {
					sb.append(allIndent + indent + "\"" + key + "\": ");
					padding(sb,key,longestKey);
					
					if (value instanceof String)
						sb.append("\"" + value.toString() + "\"");
					else
						sb.append("" + value.toString() + "");
				}
				break;
			}
			
			if (moreValues)
				sb.append(",");
			
			sb.append("\n");
		}
		
		void padding(StringBuilder sb, String key, int longestKey) {
			if (key.length() < longestKey) {
				for(int i=key.length(); i<longestKey; i++)
					sb.append(" ");
			}
		}
		
		ArrayList<VContainer> values(){
			ArrayList<VContainer> rc = new ArrayList<>();
			JSONArray array = (JSONArray) value;
			
			for(int i=0; i<array.length(); i++) {
				Object val = array.get(i);
			
				if (val == null)
				continue;
				if (val instanceof JSONObject){
					rc.add(new VContainer(JType.OBJECT, null, val));
				}
				else if (val instanceof JSONArray){
					rc.add(new VContainer(JType.ARRAY, null, val));
				}
				else if (val instanceof String){
					rc.add(new VContainer(JType.PRIMITIVE, null, val));
				}
				else if (val instanceof Number){
					rc.add(new VContainer(JType.PRIMITIVE, null, val));
				}
				else if (val instanceof Boolean){
					rc.add(new VContainer(JType.PRIMITIVE, null, val));
				}
				else{
					// This happens if there is literally a null for the value
				}
			}
			return(rc);
		}
	}
	
	private enum JType {
		PRIMITIVE,
		OBJECT,
		ARRAY
	}
	
	public String prettyPrint(JSONObject object, boolean primitivesFirst) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{\n");
		
		prettyPrint(object, sb, "", "", primitivesFirst);
		
		sb.append("}");
		
		return(sb.toString());
	}
	
	/**
	 * Pretty prints the specified object
	 * @param object the object
	 * @param primitivesFirst whether you want the primitive values listed first
	 * @param indentAll the amount of initial indent you want for all lines.
	 * @return the formatted object
	 */
	public String prettyPrint(JSONObject object, boolean primitivesFirst, String indentAll) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{\n");
		
		prettyPrint(object, sb, indentAll, "", primitivesFirst);
		
		sb.append(indentAll + "}");
		
		return(sb.toString());
	}
	
	private void prettyPrint(JSONObject object, StringBuilder sb, String allIndent, String indent, boolean primitivesFirst) {
		if (primitivesFirst)
			primitivesFirst(object, sb, allIndent, indent, primitivesFirst);
		else
			byAllKeys(object, sb, allIndent, indent, primitivesFirst);
	}
		
	private void byAllKeys(JSONObject object, StringBuilder sb, String allIndent, String indent, boolean primitivesFirst) {
		int longest = 0;
		TreeMap<String,VContainer> sorted = new TreeMap<>(Collator.getInstance(Locale.ENGLISH));

		Iterator<String> keyit = object.keys();
		while(keyit.hasNext()) {
			String key = keyit.next();
			
			if (key.toString().length() > longest)
				longest = key.toString().length();
			
			Object value = object.get((String) key);
			if (value == null)
				continue;
			
			if (value instanceof JSONObject){
				sorted.put(key.toString(), new VContainer(JType.OBJECT, key.toString(), value));
			}
			else if (value instanceof JSONArray){
				sorted.put(key.toString(), new VContainer(JType.ARRAY, key.toString(), value));
			}
			else if (value instanceof String){
				sorted.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else if (value instanceof Number){
				sorted.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else if (value instanceof Boolean){
				sorted.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else{
				// This happens if there is literally a null for the value
			}
		}
		
		Iterator<VContainer> it = sorted.values().iterator();
		while(it.hasNext()) {
			VContainer vc = it.next();
			vc.prettyPrint(sb, allIndent, indent + "  ", it.hasNext(), longest, primitivesFirst);
		}
		
	}
	
	private void primitivesFirst(JSONObject object, StringBuilder sb, String allIndent, String indent, boolean primitivesFirst) {
		
		int longest = 0;
		TreeMap<String,VContainer> primitives = new TreeMap<>(Collator.getInstance(Locale.ENGLISH));
		TreeMap<String,VContainer> arrays = new TreeMap<>(Collator.getInstance(Locale.ENGLISH));
		TreeMap<String,VContainer> objects = new TreeMap<>(Collator.getInstance(Locale.ENGLISH));

		Iterator<String> keyit = object.keys();
		while(keyit.hasNext()) {
			String key = keyit.next();

			if (key.toString().length() > longest)
				longest = key.toString().length();
			Object value = object.get((String) key);
			if (value == null)
				continue;
			
			if (value instanceof JSONObject){
				objects.put(key.toString(), new VContainer(JType.OBJECT, key.toString(), value));
			}
			else if (value instanceof JSONArray){
				arrays.put(key.toString(), new VContainer(JType.ARRAY, key.toString(), value));
			}
			else if (value instanceof String){
				primitives.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else if (value instanceof Number){
				primitives.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else if (value instanceof Boolean){
				primitives.put(key.toString(), new VContainer(JType.PRIMITIVE, key.toString(), value));
			}
			else{
				// This happens if there is literally a null for the value
			}
		}
		
		ArrayList<VContainer>	allValues = new ArrayList<>();
		
		for(VContainer vc: primitives.values()) {
			allValues.add(vc);
		}
		
		for(VContainer vc: arrays.values()) {
			allValues.add(vc);
		}
		
		for(VContainer vc: objects.values()) {
			allValues.add(vc);
		}
		
		Iterator<VContainer> it = allValues.iterator();
		while(it.hasNext()) {
			VContainer vc = it.next();
			vc.prettyPrint(sb, allIndent, indent + "  ", it.hasNext(), longest, primitivesFirst);
		}
		
	}
	
	
	
	public static PrettyJSON instance() {
		if (instance == null)
			instance = new PrettyJSON();
		return(instance);
	}

}
