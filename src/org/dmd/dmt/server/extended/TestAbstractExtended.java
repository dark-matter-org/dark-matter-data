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
package org.dmd.dmt.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.server.generated.dmw.TestAbstractExtendedDMW;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;

public class TestAbstractExtended extends TestAbstractExtendedDMW {

	protected TestAbstractExtended(TestAbstractExtendedDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

	@Override
	public TestAbstractExtended getModificationRecorder() {
		// TODO Auto-generated method stub
		return null;
	}

}
