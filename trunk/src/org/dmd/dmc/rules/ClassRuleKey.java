package org.dmd.dmc.rules;

import org.dmd.dmc.DmcClassInfo;

public class ClassRuleKey extends RuleKey {
	
	// This may be null in the case of a global class rule
	DmcClassInfo		classInfo;

	public ClassRuleKey(DmcClassInfo ci) {
		classInfo = ci;
	}

	@Override
	public int hashCode() {
		if (classInfo == null)
			return(0);
		
		return(classInfo.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRuleKey){
			ClassRuleKey crk = (ClassRuleKey) obj;
			
			if (classInfo == null){
				if (crk.classInfo == null)
					return(true);
			}
			else{
				if (crk.classInfo != null){
					if (classInfo.id == crk.classInfo.id)
						return(true);
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if (classInfo == null)
			return("GLOBAL");
		
		return(classInfo.name);
	}

}
