package org.dmd.dms.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.net.URL;

import org.dmd.dms.SchemaDefinition;

/**
 * The DmoGenerator class coordinates the code generation associated with
 * a Dark Matter Schema. In particular, the generator will create code
 * associated with enumerations, object reference types and Dark Matter Objects (DMOs).
 */
public class DmoGenerator {
	
	DmoFormatter		dmoFormatter;
	DmoTypeFormatter	typeFormatter;
	DmoEnumFormatter	enumFormatter;
	
	String gendir;
	String shareddir;
	String dmodir;
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
		progress = o;
		fileHeader = null;
	}
	
	/**
	 * Generates base code for the specified schema.
	 * @param sd The schema.
	 * @throws IOException  
	 */
	public void generateLocalCode(SchemaDefinition sd, DmsSchemaLocation sl) throws IOException {
		gendir 		= sl.getSchemaParentDirectory() + File.separator + "generated";
		shareddir 	= null;
		dmodir 		= gendir + File.separator + "dmo";
		typedir 	= gendir + File.separator + "types";
		enumdir 	= gendir + File.separator + "enums";
		
		dmoFormatter.setSubPackage("generated.dmo");
		typeFormatter.setFileHeader("generated.types");
		typeFormatter.setEnumPackage("generated.enums");
		enumFormatter.setFileHeader("generated.enums");

		generateCode(sd,sl);
	}
	
	/**
	 * Generates base code for the specified schema.
	 * @param sd The schema.
	 * @throws IOException  
	 */
	public void generateSharedCode(SchemaDefinition sd, DmsSchemaLocation sl) throws IOException {
		gendir 		= sl.getSchemaParentDirectory() + File.separator + "generated";
		shareddir 	= gendir + File.separator + "shared";
		dmodir 		= shareddir + File.separator + "dmo";
		typedir 	= shareddir + File.separator + "types";
		enumdir 	= shareddir + File.separator + "enums";
		
		dmoFormatter.setSubPackage("generated.shared.dmo");
		typeFormatter.setFileHeader("generated.shared.types");
		typeFormatter.setEnumPackage("generated.shared.enums");
		enumFormatter.setFileHeader("generated.shared.enums");

		generateCode(sd,sl);
	}
	
	/**
	 * Generates base code for the specified schema.
	 * @param sd The schema.
	 * @throws IOException  
	 */
	void generateCode(SchemaDefinition sd, DmsSchemaLocation sl) throws IOException {
		
		fileHeader 	= null;
		
		createGenDirs(sl);
		
		readFileHeader(sd,sl);
		
		dmoFormatter.setFileHeader(fileHeader);
		typeFormatter.setFileHeader(fileHeader);
		enumFormatter.setFileHeader(fileHeader);
		
		dmoFormatter.dumpDMOs(sd, dmodir);
		
		typeFormatter.dumpTypes(sd, typedir);
		
		enumFormatter.dumpEnums(sd, enumdir);
	}
	
	/**
	 * If the schema has a generatedFileHeader specified, we try to read the file.
	 * @param sd The schema definition.
	 * @param sl The schema location.
	 * @throws IOException
	 */
	void readFileHeader(SchemaDefinition sd, DmsSchemaLocation sl) throws IOException {
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
            }
            else{
	            LineNumberReader in = new LineNumberReader(new FileReader(sl.getDirectory() + File.separator + sd.getGeneratedFileHeader()));
	            String str;
	            while ((str = in.readLine()) != null) {
	            	sb.append(str + "\n");
	            }
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

	}

	
	/**
	 * Creates the output directory structure for our code.
	 * @param sl The schema location.
	 */
	void createGenDirs(DmsSchemaLocation sl){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		if (shareddir != null){
			File sdf = new File(shareddir);
			if (!sdf.exists())
				sdf.mkdir();
		}
		
		File ddf = new File(dmodir);
		if (!ddf.exists())
			ddf.mkdir();
		
		File tdf = new File(typedir);
		if (!tdf.exists())
			tdf.mkdir();
		
		File edf = new File(enumdir);
		if (!edf.exists())
			edf.mkdir();
		
	}
}
