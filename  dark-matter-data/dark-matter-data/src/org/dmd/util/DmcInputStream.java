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
package org.dmd.util;

import java.io.DataInputStream;
import java.io.InputStream;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.ClassDefinition;
import org.dmd.dmw.DmwWrapper;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;

public class DmcInputStream extends DataInputStream implements DmcInputStreamIF {

	SchemaManager	schema;
	
	public DmcInputStream(InputStream is, SchemaManager sm){
		super(is);
		schema = sm;
	}
	
	@Override
	public DmcAttribute<?> getAttributeInstance(DmcAttributeInfo ai) throws Exception {
		return(schema.getAttributeInstance(ai.id));
	}

	@Override
	public DmcObject getDMOInstance(String cn) throws Exception {
		DmcObject rc = null;
		ClassDefinition cd = schema.isClass(cn);
		
		if (cd == null){
			throw(new IllegalStateException("Unknown class:" + cn));
		}
		
		// Tricky stuff: we always try to instantiate the wrapper for the object so that 
		// we can support the DMW environment i.e. the DMO will have a handle to its
		// container. If something goes wrong, we fall back to directly instantiating
		// the DMO.
		DmwWrapper wrapper = null;
		try {
			wrapper = cd.newInstance();
		}
		catch(Exception ex){
			// Just fall back to instantiating the DMO
		}
		
		if (wrapper == null){
//			DebugInfo.debug("Couldn't get the wrapper");
			rc = cd.newDMOInstance();
		}
		else{
			rc = wrapper.getDmcObject();
			
//			DebugInfo.debug("Got the wrapper");
//			if (rc.getContainer() == null)
//				DebugInfo.debug("Container is null");
//			else
//				DebugInfo.debug("Container is ok");
		}
		
		return(rc);
	}

	@Override
	public DmcAttribute<?> getAttributeInstance(Integer id) throws Exception {
		return(schema.getAttributeInstance(id));
	}

	@Override
	public void resolveReferences(DmcTypeNamedObjectREF<?,?> attr) throws Exception {
		attr.resolveReferences(schema);
	}

	@Override
	public int readAttributeCount() throws Exception {
		return(readShort());
	}

	@Override
	public int readAttributeID() throws Exception {
		return(readShort());
	}

	@Override
	public int readValueCount() throws Exception {
		return(readShort());
	}

	@Override
	public DmcAttribute<?> getAttributeInstance() throws Exception {
		int id = readAttributeID();
		return(getAttributeInstance(id));
	}

	@Override
	public DmcObjectName getNameValueInstance() throws Exception {
		int id = readAttributeID();
		return(schema.getNameValueInstance(id));
	}
	
	
}
