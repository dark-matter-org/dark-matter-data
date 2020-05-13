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
import java.util.TreeSet;

import org.dmd.dmu.server.extended.DmuModule;
import org.dmd.dmu.server.extended.json.PayloadExample;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * The DeepSortAnalyzer allows you to analyze a JSON structure and hunt for arrays
 * of objects. This is all in preparation to finding the key on which these object
 * arrays are sorted - which is often the case with modelled/structured JSON data.
 * As well, most modelled systems use conventions when specifying key (or index) values.
 * For instance you may see things like card-name, portName, id, sortKey etc. used
 * to indicate these values. A quick scan of sample payloads often reveal such
 * conventions.
 */
public class DeepSortAnalyzer {
	
	// Indicates all or part of a key that might indicate that it's a sort key.
	// Often, such key will include "name", "id" etc.
	private TreeSet<String>	possibleSortKeyNames;

	public DeepSortAnalyzer() {
		possibleSortKeyNames = new TreeSet<>();
	}
	
	/**
	 * Adds the specified value that might be part of a key name used for sorting
	 * arrays of JSON objects. All keys will be checked to see if they contain
	 * this string and, if so, will be suggested as possible sort keys.
	 * @param value the value to be added as a possibility.
	 */
	public void addPossibleSortkey(String value) {
		possibleSortKeyNames.add(value);
	}
	
	public void analyze(DmuModule module) {
		Iterator<PayloadExample> it = module.getAllPayloadExample();
		
		while(it.hasNext()) {
			PayloadExample ex = it.next();
			
			analyze(module, ex.getName().getNameString());
		}
	}
	
	public void analyze(DmuModule module, String payloadName) {
		Iterator<PayloadExample> it = module.getAllPayloadExample();
		
		while(it.hasNext()) {
			PayloadExample ex = it.next();
			
			if (ex.getName().getNameString().equals(payloadName)) {
				JSONObject exObj = new JSONObject(ex.getJsonPayload().replaceAll("\\\\n","\\\n"));
				
				DeepSortNode root = new DeepSortNode(possibleSortKeyNames);
				descendObject(root, exObj);
				
				StringBuilder sb = new StringBuilder();
				sb.append("PayloadSortInfo\n");
				sb.append("name " + payloadName + "\n");
				root.pathAndKeys(sb);
				
				System.out.println("Payload type: " + ex.getName() + "\n");
				System.out.println(sb.toString() + "\n\n");
			}
		}
		
		
		
	}
	
	private void descendObject(DeepSortNode parent, JSONObject object) {
		Iterator<String> keys = object.keys();
		while(keys.hasNext()) {
			String key = keys.next();
			Object value = object.get(key);
			
			if (value instanceof JSONObject) {
				DeepSortNode node = new DeepSortNode(parent, key, false, possibleSortKeyNames);
				descendObject(node, (JSONObject) value);
			}
			else if (value instanceof JSONArray) {
				DeepSortNode node = new DeepSortNode(parent, key, true, possibleSortKeyNames);
				descendArray(node, (JSONArray) value);
			}
			else {
				parent.addPrimitive(key);
			}
		}
	}

	private void descendArray(DeepSortNode arrayNode, JSONArray array) {
		if (array.isEmpty())
			return;
		
		// We only bother with arrays of objects
		if (array.get(0) instanceof JSONObject) {
			for(int i=0; i<array.length(); i++) {
				Object obj = array.get(i);
				if (obj instanceof JSONObject) {
					arrayNode.arrayElement().addKeySignature((JSONObject)obj);
					descendObject(arrayNode.arrayElement(), (JSONObject)obj);
				}
				else {
					throw(new IllegalStateException("Mix of objects and primitives/arrays in JSONArray"));					
				}
			}
		}
	}
	

}
