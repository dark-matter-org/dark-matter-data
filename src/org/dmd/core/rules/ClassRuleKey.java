//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.core.rules;

import org.dmd.core.schema.DmcClassInfo;

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
