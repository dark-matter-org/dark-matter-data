package org.dmd.dmt.shared;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class TestDisplayDmcObjectAttributes {

	static boolean initialized = false;
	
	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			initialized = true;
			
		}
	}

	@Test
	public void testCreateRequest() throws DmcValueException, Exception{
		CreateRequest request = new CreateRequest();
		
		request.addRequestID(99);
		request.setTimeMS(System.currentTimeMillis());
		
		ObjWithRefsDMO dmo = new ObjWithRefsDMO();
		dmo.setName("object1");
		dmo.addMvString("value1");
		dmo.addMvString("value2");
		
		request.setNewObject(dmo);
		
		System.out.println(request.toOIF());
	}
	
	@Test
	public void testGetResponse() throws DmcValueException, Exception{
		GetResponse response = new GetResponse();
		
		response.addRequestID(327);
		response.setTimeMS(System.currentTimeMillis());
		
		ObjWithRefsDMO dmo1 = new ObjWithRefsDMO();
		dmo1.setName("object1");
		dmo1.addMvString("value1");
		dmo1.addMvString("value2");
		
		ObjWithRefsDMO dmo2 = new ObjWithRefsDMO();
		dmo2.setName("object1");
		dmo2.addMvString("value1");
		dmo2.addMvString("value2");
		
		response.addObjectList(dmo1);
		response.addObjectList(dmo2);
		
		System.out.println(response.toOIF());
	}
	
}
