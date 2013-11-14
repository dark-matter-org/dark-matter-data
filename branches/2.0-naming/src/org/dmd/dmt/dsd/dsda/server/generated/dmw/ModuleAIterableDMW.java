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
package org.dmd.dmt.dsd.dsda.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;
import org.dmd.dmt.dsd.dsda.server.generated.dmw.ModuleADMW;
/**
 * The ModuleAIteratorDMW will cast from an underlying ModuleAREF class to 
 * the associated wrapper class: ModuleADMW when accessing object references in a wrapper context.
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpIterable(BaseDMWGeneratorNewest.java:246)
 */
public class ModuleAIterableDMW extends DmwContainerIterator<ModuleADMW,ModuleAREF> {

    public final static ModuleAIterableDMW emptyList = new ModuleAIterableDMW();

    protected ModuleAIterableDMW(){
        super();
    }

    public ModuleAIterableDMW(Iterator<ModuleAREF> it){
        super(it);
    }

}
