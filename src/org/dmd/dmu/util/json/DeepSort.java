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

import org.dmd.dmu.shared.types.PathAndKey;
import org.dmd.util.exceptions.DebugInfo;
import org.json.JSONArray;
import org.json.JSONObject;



/**
 * The DeepSort class provides a mechanism to sort arrays of objects in a JSON object by using 
 * PathAndKey configuration data to indicate the key values to be used for various paths to 
 * array structures. 
 */
public class DeepSort {
	
	private enum JType {
		OBJECT,
		OBJECT_ARRAY,
		ARRAY,
		NUMBER,
		STRING,
		BOOLEAN,
		NULL
	}


	public DeepSort() {
		
	}
	
	public String sort(JSONObject object, TreeMap<String, PathAndKey> pathInfo) {
		StringBuilder sb = new StringBuilder();
		
		orderObject(object, sb, pathInfo, "");
		
		return(sb.toString());
	}
	
	private void orderObject(JSONObject object, StringBuilder sb, TreeMap<String, PathAndKey> pathInfo, String path) {
		TreeMap<String,JType>	primitives = new TreeMap<>();
		TreeMap<String,JType>	objects = new TreeMap<>();
		TreeMap<String,JType>	arrays = new TreeMap<>();
		
		int leftToPrint = 0;
		
		Iterator<String> keyIT = object.keys();
		while(keyIT.hasNext()) {
			String key = keyIT.next();
			JType type = categorize(JSONUtil.getValue(object, key));
			switch (type) {
			case ARRAY:
			case OBJECT_ARRAY:
				arrays.put(key, type);
				break;
			case BOOLEAN:
			case NUMBER:
			case NULL:
			case STRING:
				primitives.put(key, type);
				break;
			case OBJECT:
				objects.put(key, type);
			}
			
			leftToPrint++;
		}

		sb.append("{ ");
		
		for(String key: primitives.keySet()) {
			JType type = primitives.get(key);
			Object value = JSONUtil.getValue(object, key);
			
			sb.append("\"" + key + "\": ");
			
			if (type == JType.STRING)
				sb.append("\"" + value.toString() + "\"");
			else if (type == null)
				sb.append("" + value.toString() + "");
			else
				sb.append("" + value.toString() + "");
			
			leftToPrint--;
			if (leftToPrint > 0)
				sb.append(", ");
		}
		
		for (String key: objects.keySet()) {
			Object value = JSONUtil.getValue(object, key);
			
			sb.append("\"" + key + "\": ");
			
			orderObject((JSONObject) value, sb, pathInfo, path + "/" + key);
			
			leftToPrint--;
			if (leftToPrint > 0)
				sb.append(", ");
		}
		
		for(String key: arrays.keySet()) {
			JType type = arrays.get(key);
			Object value = JSONUtil.getValue(object, key);

			sb.append("\"" + key + "\": [ ");

			if (type == JType.OBJECT_ARRAY) {
				String pathToHere = path + "/" + key;
				
				PathAndKey pak = pathInfo.get(pathToHere);
				if (pak == null) {
					// No sorting info - just dump each object
				}
				else {
					// We want to sort
					TreeMap<String,JSONObject> sorted = sortObjectArray((JSONArray) value, pak.key(), pak.path());
					
					Iterator<JSONObject> it = sorted.values().iterator();
					while(it.hasNext()) {
						JSONObject currObj = it.next();
						orderObject(currObj, sb, pathInfo, path + "/" + key);
						
						if (it.hasNext())
							sb.append(", ");
					}
				}
			}
			else {
				JSONArray array = (JSONArray) value;
				
				int len = array.length()-1;
				for(int i=0; i<array.length(); i++) {
				
					Object arrVal = array.get(i);
					JType vtype = categorize(arrVal);
					
					switch(vtype) {
					case BOOLEAN:
					case NUMBER:
						sb.append(arrVal.toString());
					case NULL:
						sb.append("null");
						break;
					case STRING:
						sb.append("\"" + arrVal.toString() + "\"");
						break;
					default:
						throw(new IllegalStateException("Expecting primitive value at: " + path));
					}
					
					if (i<len)
						sb.append(", ");
				}
			}
			
			sb.append(" ]");
			
			leftToPrint--;
			if (leftToPrint > 0)
				sb.append(", ");
		}
		
		sb.append(" }");
	}
	
	private TreeMap<String,JSONObject> sortObjectArray(JSONArray array, String sortKey, String path){
		TreeMap<String,JSONObject> rc = new TreeMap<String, JSONObject>();
		
		for(int i=0; i< array.length(); i++) {
			Object obj = array.get(i);
			if (obj instanceof JSONObject) {
				Object keyValue = JSONUtil.getValue((JSONObject)obj, sortKey);
				if (keyValue == null) {
					keyValue = "ZZZZZ";
					DebugInfo.debug("No value for key: " + sortKey);
				}
				rc.put(keyValue.toString(), (JSONObject)obj);
			}
			else {
				throw(new IllegalStateException("Non-object in array at: " + path));
			}
		}
		
		return(rc);
	}
	
	private JType categorize(Object val) {
		JType rc = JType.NULL;
		
		if (val instanceof JSONObject){
			rc = JType.OBJECT;
		}
		else if (val instanceof JSONArray){
			rc = JType.ARRAY;
			JSONArray array = (JSONArray) val;
			if (array.length() > 0) {
				Object obj = array.get(0);
				if (obj instanceof JSONObject)
					rc = JType.OBJECT_ARRAY;
			}
		}
		else if (val instanceof String){
			rc = JType.STRING;
		}
		else if (val instanceof Number){
			rc = JType.NUMBER;
		}
		else if (val instanceof Boolean){
			rc = JType.BOOLEAN;
		}
		else{
			rc = JType.NULL;
		}
		
		return(rc);
	}
}
