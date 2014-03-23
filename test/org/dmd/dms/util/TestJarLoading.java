package org.dmd.dms.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.junit.Before;
import org.junit.Test;

public class TestJarLoading {

	private Enumeration<URL> jarFile;
	
	@Before
	public void initialize() throws IOException{
		getClass().getClassLoader();
		ClassLoader.getSystemResources("com/example/schema/example.dms");
		jarFile = ClassLoader.getSystemResources("exampleSchema.jar");
		
		System.getProperty("java.class.path");
	}
	
	@Test
	public void testLoadedJar() throws IOException {
//		while(singleFile.hasMoreElements()){
//			URL curr = singleFile.nextElement();
//			System.out.println(curr.getFile());
//			LineNumberReader in = new LineNumberReader(new InputStreamReader(curr.openStream()));
//            String str;
//            while ((str = in.readLine()) != null) {
//            	System.out.println(str);
//            }
//		}
		
		System.out.println("");
		
		String[] paths = System.getProperty("java.class.path").split(";");
		for(String f : paths){
			System.out.println(f);
			if (f.endsWith("DMSchema.jar")){
				System.out.println(f);
				JarFile jar = new JarFile(f);	        
		        for (Enumeration<JarEntry> entries = jar.entries(); entries.hasMoreElements();)
		        {
		            String jarEntry = ((JarEntry)entries.nextElement()).getName();
		            System.out.println(jarEntry);
		            
		            URL fu = new URL("jar:file:" + f + "!/" + jarEntry);
		            
		            System.out.println(fu.getFile() + "\n");
		            
		            readSchemaFile(fu);
		        }
		        jar.close();
			}
			System.out.println("");
		}
		
		while(jarFile.hasMoreElements()){
			URL curr = jarFile.nextElement();
			System.out.println(curr.getFile());
		}
//		assertNotNull("Can load resource from jar.",jarRoot.getFile());
	}
	
	public void readSchemaFile(URL schema) throws IOException{
		System.out.println(schema.getFile());
		LineNumberReader in = new LineNumberReader(new InputStreamReader(schema.openStream()));
        String str;
        while ((str = in.readLine()) != null) {
        	System.out.println(str);
        }

	}
}
