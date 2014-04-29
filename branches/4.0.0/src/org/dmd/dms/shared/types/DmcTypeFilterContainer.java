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
package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcAttribute;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcFilter;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

@SuppressWarnings("serial")
abstract public class DmcTypeFilterContainer extends DmcAttribute<FilterContainer> implements Serializable {

	public DmcTypeFilterContainer(){
		
	}
	
	public DmcTypeFilterContainer(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public FilterContainer typeCheck(Object value) throws DMFeedbackSet {
		if (value instanceof FilterContainer)
			return((FilterContainer)value);
		else if (value instanceof DmcFilter){
			// TODO: implement DmcOmni for filter types
//			DmcTypeDmcObjectName<?> on = DmcOmni.instance().buildName((DmcObjectName)value);
//			return(new NameContainer(on));
			return(null);
		}
        throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with FilterContainer/DmcFilter expected."));
	}


	@Override
	public FilterContainer cloneValue(FilterContainer original) {
		return (original.cloneIt());
	}
	@Override
	public void serializeValue(DmcOutputStreamIF dos, FilterContainer value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public FilterContainer deserializeValue(DmcInputStreamIF dis) throws Exception {
		FilterContainer rc = new FilterContainer();
		rc.deserializeIt(dis);
		return(rc);
	}

}
