package org.dmd.dms.doc.web;

import java.util.TreeMap;

import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;

public class Summarizer {

	TreeMap<String,TreeMap<String,DmsDefinition>>	definitionsByLetter;
	
	public Summarizer(SchemaManager sm){
		definitionsByLetter = new TreeMap<String, TreeMap<String,DmsDefinition>>();
		
		for(DmsDefinition def: sm.allDefs.values()){
			def.getDMO().clearReferenceInfo();
		}
		
		for(DmsDefinition def: sm.allDefs.values()){
			addDefinition(def);
			try {
//				if (def instanceof ClassDefinition){
//					int temp = 5;
//				}
//				System.out.println(def.toOIF() + "\n\n");
				
				if (def instanceof SchemaDefinition){
				}
				else
					def.resolveReferences(sm);
				
			} catch (DmcValueExceptionSet e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	void addDefinition(DmsDefinition def){
		String firstLetter = Character.toUpperCase(def.getName().getNameString().charAt(0)) + "";
		
		TreeMap<String,DmsDefinition> startingWith = definitionsByLetter.get(firstLetter);
		
		if (startingWith == null){
			startingWith = new TreeMap<String,DmsDefinition>();
			definitionsByLetter.put(firstLetter, startingWith);
		}
		
		startingWith.put(def.getName().getNameString(), def);
	}
	
	public void dumpTextSummary(){
		for(String firstLetter: definitionsByLetter.keySet()){
			TreeMap<String,DmsDefinition> startingWith = definitionsByLetter.get(firstLetter);
			
			System.out.println("---------- " + firstLetter + " ----------  (" + startingWith.size()+ ")");
			for(DmsDefinition def: startingWith.values()){
				System.out.println("    " + def.getName().getNameString() + " (" + def.getDMO().referenceCount() + ")");
			}
		}
	}
}
