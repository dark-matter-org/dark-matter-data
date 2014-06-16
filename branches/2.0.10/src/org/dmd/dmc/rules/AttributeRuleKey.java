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
package org.dmd.dmc.rules;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;

/**
 * The DmcAttributeRuleKey is used to identify attribute level rules by class.
 */
public class AttributeRuleKey extends RuleKey {
	
	DmcAttributeInfo	attrInfo;
	DmcClassInfo		classInfo;
	int 				hashCode;
	String				name;

	public AttributeRuleKey(DmcAttributeInfo ai, DmcClassInfo ci){
		attrInfo = ai;
		classInfo = ci;
		
		int hc = 17;
		
		hc = 31 * hc + attrInfo.id;
		
		if (classInfo == null){
			name = " " + attrInfo.name;
		}
		else{
			hc = 31 * hc + classInfo.id;
			name = classInfo.name + " " + attrInfo.name;
		}
		
		hashCode = hc;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof AttributeRuleKey){
			AttributeRuleKey other = (AttributeRuleKey)obj;
			if (attrInfo.id == other.attrInfo.id){
				if (classInfo == null){
					if (other.classInfo == null)
						return(true);
				}
				else{
					if (other.classInfo != null){
						if (classInfo.id == other.classInfo.id)
							return(true);
					}
				}
			}
		}
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(hashCode);
	}

	@Override
	public String toString() {
		return(name);
	}
	
}
