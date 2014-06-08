package org.dmd.dms.tools.meta;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;

public 	class ClassInfo {
	DMUncheckedObject 			cd;
	ClassInfo					derivedFrom;
	TreeMap<String,ClassInfo>	derived;
	
	ClassInfo(DMUncheckedObject uco){
		cd 			= uco;
		derivedFrom = null;
		derived		= null;
	}
	
	public void resolve(TreeMap<String,ClassInfo> classes) throws DMFeedbackSet{
		String df = cd.getSV("derivedFrom");
		
		if (df != null){
			ClassInfo base = classes.get(df);
			
			if (base == null){
				throw(new DMFeedbackSet("Couldn't find base class: " + df + "  for class: " + cd.getSV("name")));
			}
			
			derivedFrom = base;
			derivedFrom.addDerived(this);
		}
	}
	
	void addDerived(ClassInfo ci){
		if (derived == null)
			derived = new TreeMap<String, ClassInfo>();
		derived.put(ci.cd.getSV("name"), ci);
	}
	
	public void getAllDerived(ArrayList<ClassInfo> rc){
		if (derived == null)
			return;
		for(ClassInfo ci: derived.values()){
			rc.add(ci);
			ci.getAllDerived(rc);
		}
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(cd.getSV("name"));
		
		if (derivedFrom != null)
			sb.append(" -> " + derivedFrom.cd.getSV("name"));
		
		if (derived != null){
			for(ClassInfo ci: derived.values()){
				sb.append("\n    " + ci.cd.getSV("name"));
			}
		}
		
		return(sb.toString());
	}
}
