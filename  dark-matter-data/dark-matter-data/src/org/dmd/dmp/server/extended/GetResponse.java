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
package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmp.server.generated.dmw.GetResponseDMW;

public class GetResponse extends GetResponseDMW {
	
	DmcSliceInfo	sliceInfo;

	public GetResponse(){
		super();
	}
	
	/**
	 * We override this method so that we can slice the response object if required.
	 */
	@Override
	public void addObjectList(DmcObject value){
		if (sliceInfo == null)
			super.addObjectList(value);
		
		super.addObjectList(value.getSlice(sliceInfo));
	}
	
	/**
	 * @return the slice info if there's any available.
	 */
	public DmcSliceInfo getSliceInfo(){
		return(sliceInfo);
	}

}
