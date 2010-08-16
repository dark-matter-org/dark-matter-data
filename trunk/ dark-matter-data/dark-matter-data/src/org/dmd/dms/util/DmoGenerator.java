package org.dmd.dms.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;

/**
 * The DmoGenerator class coordinates the code generation associated with
 * a Dark Matter Schema. In particular, the generator will create code
 * associated with enumerations, object reference types and Dark Matter Objects (DMOs).
 */
public class DmoGenerator {
	
	DmoFormatter	dmoFormatter;
	
	String gendir;
	String dmodir;
	String typedir;
	String enumdir;
	
	PrintStream	progress;

	public DmoGenerator(){
		dmoFormatter = new DmoFormatter();
	}
	
	public DmoGenerator(PrintStream o){
		dmoFormatter = new DmoFormatter(o);
		progress = o;
	}
	
	/**
	 * Generates base code for the specified schema.
	 * @param sd The schema.
	 * @throws IOException  
	 */
	public void generateCode(SchemaDefinition sd, DmsSchemaLocation sl) throws IOException {
		
		gendir = sl.getParentDirectory() + File.separator + "generated";
		dmodir = gendir + File.separator + "dmo";
		typedir = gendir + File.separator + "types";
		enumdir = gendir + File.separator + "enums";
		
		createGenDirs(sl);
		
		Iterator<ClassDefinition> cdl = sd.getClassDefList();
		if (cdl != null){
			while(cdl.hasNext()){
				dmoFormatter.dumpDMO(cdl.next(), dmodir);
			}
		}
	}
	
	/**
	 * Creates the out directory structure for our code.
	 * @param sl The schema location.
	 */
	void createGenDirs(DmsSchemaLocation sl){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
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
