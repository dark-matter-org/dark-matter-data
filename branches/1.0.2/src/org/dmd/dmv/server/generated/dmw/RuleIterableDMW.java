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

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmv.shared.generated.types.RuleREF;
import org.dmd.dmv.server.extended.Rule;
/**
 * The RuleIteratorDMW will cast from an underlying RuleREF class to 
 * the associated wrapper class: Rule when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:245)
 */
public class RuleIterableDMW extends DmwContainerIterator<Rule,RuleREF> {

    public final static RuleIterableDMW emptyList = new RuleIterableDMW();

    protected RuleIterableDMW(){
        super();
    }

    public RuleIterableDMW(Iterator<RuleREF> it){
        super(it);
    }

}

