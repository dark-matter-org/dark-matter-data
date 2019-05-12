package org.dmd.dmt.shared;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmt.server.extended.ClientCountFilter;
import org.dmd.dmt.server.extended.ClientCountFilterRequest;
import org.dmd.dmt.server.generated.DmtSchemaAG;
import org.dmd.dmw.DmwDeserializer;
import org.dmd.dmw.DmwOmni;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.DmcTraceableInputStream;
import org.dmd.util.DmcTraceableOutputStream;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.*;
import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExtendedRequest {

	static String testDataPath = "/test/org/dmd/dmt/shared/data";
	
	static boolean initialized = false;
	
	static File	temp;

	
	@Before
	public void initialize() throws ResultException, DmcValueException, IOException {
			
		if (!initialized){
			DmpSchemaAG dmp = new DmpSchemaAG();
			DmtSchemaAG dmt = new DmtSchemaAG();			
			DmwOmni.instance().addSchema(dmp);
			DmwOmni.instance().addSchema(dmt);
			
	        File curr = new File(".");
	        String runDir;
			runDir = curr.getCanonicalPath();
			System.out.println("*** Serialization running from: " + runDir);
	
			temp = new File(runDir + File.separator + "serialize.txt");
			
			System.out.println("temp: " + temp.getAbsolutePath());
			
			initialized = true;
			
		}
	}

	@Test
	public void testExtendedRequestAASerialize() throws DmcValueException, Exception{
		DataOutputStream os = new DataOutputStream(new FileOutputStream(temp.getAbsolutePath()));

		ClientCountFilterRequest	request = new ClientCountFilterRequest();
		request.addRequestID(1);
		
		ClientCountFilter	filter = new ClientCountFilter();
		filter.setOUIFilter("just this stuff");
		
		request.setClientCountFilter(filter);
		
		System.out.println("\nStoring to file: \n\n" + request.toOIF(15));
		
		DmcTraceableOutputStream dos = new DmcTraceableOutputStream(os, true, 35);

		request.serializeIt(dos);
		
		
		os.close();

	}
	
	@Test
	public void testExtendedRequestBBDeserialize() throws Exception{
		DataInputStream	is = new DataInputStream(new FileInputStream(temp.getAbsolutePath()));
		
		System.out.println("\nReading...\n\n");

		DmwDeserializer	deserializer = new DmwDeserializer(DmwOmni.instance().getSchema());
		
		DmcTraceableInputStream dis = new DmcTraceableInputStream(is, DmwOmni.instance().getSchema(), true, 35);

		DmwWrapper wrapper = deserializer.deserialize(dis);
		
		System.out.println("\nRead from file:\n\n" + wrapper.toOIF(15));
		
	}
}
