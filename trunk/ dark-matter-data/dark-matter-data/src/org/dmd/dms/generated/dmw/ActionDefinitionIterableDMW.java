//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dms.generated.types.ActionDefinitionREF;
import org.dmd.dms.ActionDefinition;
/**
 * The ActionDefinitionIteratorDMW will cast from an underlying ActionDefinitionREF class to 
 * the associated wrapper class: ActionDefinition when accessing object references in a wrapper context.
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterableREF(GenUtility.java:1390)
 */
public class ActionDefinitionIterableDMW extends DmwContainerIterator<ActionDefinition,ActionDefinitionREF> {

    public final static ActionDefinitionIterableDMW emptyList = new ActionDefinitionIterableDMW();

    protected ActionDefinitionIterableDMW(){
        super();
    }

    public ActionDefinitionIterableDMW(Iterator<ActionDefinitionREF> it){
        super(it);
    }

}

