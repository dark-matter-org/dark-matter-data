package org.dmd.dms.tools.generation.meta;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.util.parsing.DMUncheckedObjectHandlerIF;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.parsing.DMUncheckedObjectParser;

public class MetaGen implements DMUncheckedObjectHandlerIF {
	
	final static String SCHEMA_DEFINITION 	= "SchemaDefinition";
	final static String DEF_FILES			= "defFiles";
	
	// org/dmd/dms/shared
	String	sharedDir;
	
	// org/dmd/dms/shared/generated
	String	sharedGenDir;
	
	// org/dmd/dms/server/generated
	String 	serverGenDir;
	
	// org/dmd/dms/server/extended
	String	serverExtDir;
	
	// Our parser of unchecked DMOs
	DMUncheckedObjectParser		ucoParser;
	
	// Our manager of unchecked DMOs
	DMUncheckedObjectManager	ucoManager;
	
	DMUncheckedObject			metaSchema;

	public void generate(String baseDir) throws DMFeedbackSet {
		System.out.println("Base directory: " + baseDir);
		
		sharedDir 		= baseDir + "/shared";
		sharedGenDir 	= baseDir + "/shared/generated";
		serverGenDir 	= baseDir + "/server/generated";
		serverExtDir 	= baseDir + "/server/extended";
		
		ucoManager = new DMUncheckedObjectManager("name");
		
		ucoParser = new DMUncheckedObjectParser(this);
		
		ucoParser.parseFile(sharedDir + "/meta.dms", false);
		
		if (metaSchema == null){
			
		}
		
		NamedStringArray defFiles = metaSchema.get(DEF_FILES);
		for(String fn: defFiles){
			ucoParser.parseFile(sharedDir + "/" + fn);
		}

		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DMUncheckedObjectHandlerIF

	@Override
	public void handleObject(DMUncheckedObject uco, String infile, int lineNumber) throws DMFeedbackSet {
		
		System.out.println(uco.toOIF());
		
		ucoManager.add(uco);
		
		if (uco.getConstructionClass().equals(SCHEMA_DEFINITION)){
			if (metaSchema != null){
				DMParsingFeedback pf = new DMParsingFeedback("Multiple SchemaDefinitions found.", infile, lineNumber);
				throw(new DMFeedbackSet(pf));
			}
			metaSchema = uco;
		}
		
	}
}
