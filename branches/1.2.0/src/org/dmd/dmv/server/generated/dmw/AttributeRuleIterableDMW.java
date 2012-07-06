//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmv.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmv.shared.generated.dmo.AttributeRuleDMO;  // dmo type import
import org.dmd.dmv.server.extended.AttributeRule;  // wrapper type import
/**
 * The AttributeRuleIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1743)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:77)
 */
public class AttributeRuleIterableDMW extends DmwObjectIterator<AttributeRule, AttributeRuleDMO> {

    public final static AttributeRuleIterableDMW emptyList = new AttributeRuleIterableDMW();

    protected AttributeRuleIterableDMW(){
        super();
    }

    public AttributeRuleIterableDMW(Iterator<AttributeRuleDMO> it){
        super(it);
    }

}
