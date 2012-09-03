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
public class DmcAttributeRuleKey implements Comparable<DmcAttributeRuleKey> {
	
	DmcAttributeInfo	attrInfo;
	DmcClassInfo		classInfo;
	int hashCode;

	public DmcAttributeRuleKey(DmcAttributeInfo ai, DmcClassInfo ci){
		attrInfo = ai;
		classInfo = ci;
		
		int hc = 17;
		
		hc = 31 * hc + attrInfo.id;
		
		if (classInfo != null)
			hc = 31 * hc + classInfo.id;
		
		hashCode = hc;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof DmcAttributeRuleKey){
			DmcAttributeRuleKey other = (DmcAttributeRuleKey)obj;
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

	/**
	 * The comparison is based on the attribute name and if available, the class name. If the attribute
	 * name of two keys are the same and one key has a null classInfo, that key will be less than 
	 * the other key. If both keys have classInfo, the order will be based on the class names.
	 * @param ark another attribute rule key
	 * @return the ordering.
	 */
	@Override
	public int compareTo(DmcAttributeRuleKey ark) {
		int rc = attrInfo.name.compareTo(ark.attrInfo.name);
		
		if (rc == 0){
			if (classInfo == null){
				if (ark.classInfo != null)
					rc = -1;
			}
			else{
				if (ark.classInfo == null)
					rc = 1;
				else
					rc = classInfo.name.compareTo(ark.classInfo.name);
			}
		}
		
		return(rc);
	}
	
}
