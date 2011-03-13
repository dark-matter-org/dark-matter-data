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
package org.dmd.dms.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.net.URL;

import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DmoGenerator class coordinates the code generation associated with
 * a Dark Matter Schema. In particular, the generator will create code
 * associated with enumerations, object reference types and Dark Matter Objects (DMOs).
 */
public class DmoGenerator {
	
	DmoFormatter		dmoFormatter;
	DmoTypeFormatter	typeFormatter;
	DmoEnumFormatter	enumFormatter;
	DmoActionFormatter	actionFormatter;
	
	String gendir;
	String dmodir;
	String auxwdir;
	String typedir;
	String enumdir;
	
	// If the schema has a generatedFileHeader attribute, we read the specified file
	// into this string and pass it to the various formatters.
	String fileHeader;
	
	PrintStream	progress;

	public DmoGenerator(){
		initialize(null);
	}
	
	public DmoGenerator(PrintStream o){
		initialize(o);
	}
	
	void initialize(PrintStream o){
		dmoFormatter 	= new DmoFormatter(o);
		typeFormatter	= new DmoTypeFormatter(o);
		enumFormatter	= new DmoEnumFormatter(o);
		actionFormatter	= new DmoActionFormatter(o);
		progress = o;
		fileHeader = null;
	}
	
	/**
	 * Generates base code for the specified schema.
	 * @param sd The schema.
	 * @throws IOException  
	 * @throws ResultException 
	 */
	public void generateCode(SchemaManager sm, SchemaDefinition sd, ConfigLocation sl) throws IOException, ResultException {
		gendir 		= sl.getConfigParentDirectory() + File.separator + "generated";
		dmodir 		= gendir + File.separator + "dmo";
		auxwdir 	= gendir + File.separator + "auxw";
		typedir 	= gendir + File.separator + "types";
		enumdir 	= gendir + File.separator + "enums";
		
		fileHeader 	= null;
		
		createGenDirs();
		
		// Attempt to read the common file header if it exists
		readFileHeader(sd,sl);
		
		dmoFormatter.setFileHeader(fileHeader);
		typeFormatter.setFileHeader(fileHeader);
		enumFormatter.setFileHeader(fileHeader);
		actionFormatter.setFileHeader(fileHeader);
		
		dmoFormatter.dumpDMOs(sm, sd, dmodir, auxwdir);
		
		typeFormatter.dumpTypes(sd, typedir);
		
		enumFormatter.dumpEnums(sd, enumdir);
		
		actionFormatter.dumpActions(sd, dmodir);
	}
	
	/**
	 * If the schema has a generatedFileHeader specified, we try to read the file.
	 * @param sd The schema definition.
	 * @param sl The schema location.
	 * @throws IOException
	 */
	void readFileHeader(SchemaDefinition sd, ConfigLocation sl) throws IOException {
		if (sd.getGeneratedFileHeader() != null){
            // Read the license header
            StringBuffer sb = new StringBuffer();
            
            if (sl.getJarFilename() != null){
            	URL url = new URL("jar:file:" + sl.getJarFilename() + "!/" + sl.getJarDirectory() + "/" + sd.getGeneratedFileHeader());
        		LineNumberReader in = new LineNumberReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str = in.readLine()) != null) {
                	sb.append(str + "\n");
                }
                in.close();
            }
            else{
	            LineNumberReader in = new LineNumberReader(new FileReader(sl.getDirectory() + File.separator + sd.getGeneratedFileHeader()));
	            String str;
	            while ((str = in.readLine()) != null) {
	            	sb.append(str + "\n");
	            }
	            in.close();
            }
            
            fileHeader = sb.toString();
		}
	}
	
	public void readSchemaFile(URL schema) throws IOException{
		System.out.println(schema.getFile());
		LineNumberReader in = new LineNumberReader(new InputStreamReader(schema.openStream()));
        String str;
        while ((str = in.readLine()) != null) {
        	System.out.println(str);
        }
        in.close();
	}

	
	/**
	 * Creates the output directory structure for our code.
	 * @param sl The schema location.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(dmodir);
		if (!ddf.exists())
			ddf.mkdir();
		
		File adf = new File(auxwdir);
		if (!adf.exists())
			adf.mkdir();
		
		File tdf = new File(typedir);
		if (!tdf.exists())
			tdf.mkdir();
		
		File edf = new File(enumdir);
		if (!edf.exists())
			edf.mkdir();
		
	}
}
