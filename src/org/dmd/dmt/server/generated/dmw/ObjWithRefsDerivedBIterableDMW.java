//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.shared.generated.types.ObjWithRefsDerivedBREF;
import org.dmd.dmt.server.extended.ObjWithRefsDerivedB;
/**
 * The ObjWithRefsDerivedBIteratorDMW will cast from an underlying ObjWithRefsDerivedBREF class to 
 * the associated wrapper class: ObjWithRefsDerivedB when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class ObjWithRefsDerivedBIterableDMW extends DmwContainerIterator<ObjWithRefsDerivedB,ObjWithRefsDerivedBREF> {

    public final static ObjWithRefsDerivedBIterableDMW emptyList = new ObjWithRefsDerivedBIterableDMW();

    protected ObjWithRefsDerivedBIterableDMW(){
        super();
    }

    public ObjWithRefsDerivedBIterableDMW(Iterator<ObjWithRefsDerivedBREF> it){
        super(it);
    }

}

