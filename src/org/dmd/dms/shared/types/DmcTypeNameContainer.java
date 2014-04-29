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
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.DmcObjectName;
import org.dmd.core.DmcOmni;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcTypeNameContainer provides the DmcType interface for NameContainers.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNameContainer extends DmcAttribute<NameContainer> implements Serializable {

	public DmcTypeNameContainer(){
		
	}
	
	public DmcTypeNameContainer(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public NameContainer typeCheck(Object value) throws DMFeedbackSet {
		if (value instanceof NameContainer)
			return((NameContainer)value);
		else if (value instanceof DmcObjectName){
			DmcTypeDmcObjectName<?> on = DmcOmni.instance().buildName((DmcObjectName)value);
			return(new NameContainer(on));
		}
        throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with NameContainer/DmcObjectName expected."));
	}


	@Override
	public NameContainer cloneValue(NameContainer original) {
		return (original.cloneIt());
	}
	@Override
	public void serializeValue(DmcOutputStreamIF dos, NameContainer value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public NameContainer deserializeValue(DmcInputStreamIF dis) throws Exception {
		NameContainer rc = new NameContainer();
		rc.deserializeIt(dis);
		return(rc);
	}

}
