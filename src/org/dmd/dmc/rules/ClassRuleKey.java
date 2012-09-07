package org.dmd.dmc.rules;

import org.dmd.dmc.DmcClassInfo;

public class ClassRuleKey extends RuleKey {
	
	DmcClassInfo		classInfo;

	public ClassRuleKey(DmcClassInfo ci) {
		classInfo = ci;
	}

	@Override
	public int hashCode() {
		return(classInfo.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DmcClassInfo){
			DmcClassInfo ci = (DmcClassInfo) obj;
			if (classInfo.id == ci.id)
				return(true);
		}
		return false;
	}

	@Override
	public String toString() {
		return(classInfo.name);
	}

}
