package org.dmd.dsd.tools.dmstart;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import org.dmd.util.exceptions.ResultException;

/**
 * The POMAdjuster will update the dm-start pom.xml with replacement values for the
 * package name, DSL name and main class for the generated DSL utility.
 */
public class POMAdjuster {
	
	private final static String PACKAGE_NAME	= "PACKAGE_NAME";
	private final static String DSL_NAME		= "DSL_NAME";
	private final static String UTILIITY_MAIN 	= "UTILITY_MAIN";
	
	// This will be set to true if we find any of our template strings in
	// the POM file. If not, it means that we've already adjusted the POM
	// and the user will have to replace it with the original.
	private static boolean proceed;
	
	static public void adjust(String fn, String packageName, String dslName, String utilMain) throws ResultException, IOException {
		FileReader 		reader		= null;
		StringBuilder	adjusted	= null;
		
		try {
			reader	= new FileReader(fn);
			
			adjusted = parse(reader, fn, packageName, dslName, utilMain);
			
			reader.close();
		} catch (FileNotFoundException e) {
			ResultException ex = new ResultException("File not found: " + fn);
			throw(ex);
		}

		reader.close();
		
		if (proceed) {
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(fn));
				out.write(adjusted.toString());
				out.close();
			} catch (IOException e) {
				throw(e);
			}
			
		}
		else {
			System.out.println("WARNING: You have already created a DSL as part of this project and the pom.xml was updated");
			System.out.println("to support that DSL and generate a shaded JAR containing its utility.");
			System.out.println();
			System.out.println("You will have to update the jar to support the new \"" + dslName + "\" DSL");
			System.out.println("OR");
			System.out.println("Simply clone the dm-start project again and define the new DSL there.");
			
			return;
		}
		
	}
	
	static private StringBuilder parse(FileReader reader, String fn, String packageName, String dslName, String utilMain) throws ResultException {
		StringBuilder pom = new StringBuilder();
		
		LineNumberReader	in	= new LineNumberReader(reader);
		
        String line = null;
        try {
			while ((line = in.readLine()) != null) {
				line = line.replace("\t", "    ");
				
				if (line.contains(PACKAGE_NAME)) {
					proceed = true;
					line = line.replace(PACKAGE_NAME, packageName);
				}
				else if (line.contains(DSL_NAME)) {
					proceed = true;
					line = line.replace(DSL_NAME, dslName);
				}
				else if (line.contains(UTILIITY_MAIN)) {
					proceed = true;
					line = line.replace(UTILIITY_MAIN, utilMain);
				}
				pom.append(line + "\n");
			}
		} catch (Exception e) {
			ResultException ex = new ResultException(e.getMessage());
			ex.setLocationInfo(fn, in.getLineNumber());
			throw(ex);
		}
        
        
        try {
			in.close();
		} catch (IOException e) {
			ResultException ex = new ResultException(e);
			ex.moreMessages("Problem closing file: " + fn);
			throw(ex);
		}

        return(pom);
	}

}
