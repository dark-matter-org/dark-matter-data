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
package org.dmd.dmp.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmp.shared.generated.types.LogoutRequestREF;
import org.dmd.dmp.server.extended.LogoutRequest;
/**
 * The LogoutRequestIteratorDMW will cast from an underlying LogoutRequestREF class to 
 * the associated wrapper class: LogoutRequest when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpIterable(DMWGenerator.java:290)
 */
public class LogoutRequestIterableDMW extends DmwContainerIterator<LogoutRequest,LogoutRequestREF> {

    public final static LogoutRequestIterableDMW emptyList = new LogoutRequestIterableDMW();

    protected LogoutRequestIterableDMW(){
        super();
    }

    public LogoutRequestIterableDMW(Iterator<LogoutRequestREF> it){
        super(it);
    }

}

