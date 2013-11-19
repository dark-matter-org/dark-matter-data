//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmr.server.base.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmr.shared.base.generated.types.HierarchicObjectREF;
import org.dmd.dmr.server.base.extended.HierarchicObject;
/**
 * The HierarchicObjectIteratorDMW will cast from an underlying HierarchicObjectREF class to 
 * the associated wrapper class: HierarchicObject when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:247)
 */
public class HierarchicObjectIterableDMW extends DmwContainerIterator<HierarchicObject,HierarchicObjectREF> {

    public final static HierarchicObjectIterableDMW emptyList = new HierarchicObjectIterableDMW();

    protected HierarchicObjectIterableDMW(){
        super();
    }

    public HierarchicObjectIterableDMW(Iterator<HierarchicObjectREF> it){
        super(it);
    }

}

