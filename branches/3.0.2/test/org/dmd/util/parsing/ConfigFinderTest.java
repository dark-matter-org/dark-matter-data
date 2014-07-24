package org.dmd.util.parsing;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class ConfigFinderTest {
	
	static String runningDir;
	static String workspace;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        runningDir = curr.getCanonicalPath();
		System.out.println("*** Running from: " + runningDir);
		
		int lastSlash = runningDir.lastIndexOf(File.separator);
		workspace = runningDir.substring(0,lastSlash);
		System.out.println("*** Workspace: " + workspace);
		
	}


	@Test
	public void test() throws ResultException, IOException{
		String goodPath = workspace + "/dark-matter-data/src/org/dmd"; 
		String badPath = workspace + "/dark-matter-data/src/orgs/dmd"; 
		ConfigFinder finder = new ConfigFinder(".dms");
		finder.addSourceDirectory(goodPath);
		
		try{
			finder.findConfigs();
		}
		catch(Exception e){
			assertEquals("Should have found this source directory: " + goodPath,true, false);
		}
		
		finder = new ConfigFinder(".dms");
		
		try{
			finder.addSourceDirectory(badPath);
			finder.findConfigs();
			assertEquals("Should have NOT found this source directory: " + badPath,true, false);
		}
		catch(Exception e){
			System.out.println("Expected exception:\n\n" + e.toString());
		}
	}
}
