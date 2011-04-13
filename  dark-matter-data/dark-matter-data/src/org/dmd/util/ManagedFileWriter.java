package org.dmd.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class ManagedFileWriter extends BufferedWriter {
	
	String fileName;

	public ManagedFileWriter(Writer arg0, String fn) {
		super(arg0);
		fileName = fn;
	}

	@Override
	public void close() throws IOException {
		super.close();
		
	}
}
