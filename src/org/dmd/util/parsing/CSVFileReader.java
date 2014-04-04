package org.dmd.util.parsing;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

//import org.dmd.dmc.types.CheapSplitter;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.parsing.ClassifierNew;
import org.dmd.util.parsing.Token;

/**
 * The CSVFileReader is designed to read the first line of a CSV file and, from that, determine
 * the names of the columns; based on this it creates a CSVRowModel. It then proceeds to parse
 * the remaining rows, building DmcUncheckedObjects for each row, based column number and the
 * name of that column that it gets from the row model. It passes back a set of DmcUncheckedObjects.
 */
public class CSVFileReader {
	
	static ClassifierNew classifier = new ClassifierNew();
	
	static {
		classifier.addSeparator(" ", 0);
		classifier.addSeparator(".", 1);
		classifier.addSeparator("-", 2);
		classifier.addSeparator("_", 3);
		classifier.addSeparator("*", 4);
	}

	static public ArrayList<DmcUncheckedObject> parse(String fn, String objType) throws IOException {
        LineNumberReader	in	= new LineNumberReader(new FileReader(fn));
        
        StringBuffer errors = new StringBuffer();
        int				errorCount = 0;
        
        ArrayList<DmcUncheckedObject> objects = new ArrayList<DmcUncheckedObject>();
        
        String str;
        CSVRowModel model = null;
        while ((str = in.readLine()) != null) {
        	if (in.getLineNumber() == 1){
        		model = analyzeHeader(str);
        	}
        	else{
        		ArrayList<String>  parts = CSVRowSplitter.split(str);
        		if (parts.size() != model.size()){
        			errorCount++;
        			errors.append("Line: " + in.getLineNumber() + " Parts: " + parts.size() + " : " + str + "\n");
        			System.err.println("Field names versus row content mismatch at line: " + in.getLineNumber());

        			continue;
        		}
        		
        		DmcUncheckedObject uco = new DmcUncheckedObject();
        		uco.addToClasses(objType);
        		
        		for(int i=0; i<parts.size(); i++){
        			uco.addValue(model.name(i), parts.get(i));
        		}
        		
        		objects.add(uco);
//        		System.out.println(uco.toOIF() + "\n");
        	}

        }
        
        System.err.println("Errors: " + errorCount + "\n\n" + errors.toString());
        
        in.close();
        
        return(objects);
	}
	
	static CSVRowModel analyzeHeader(String str){
		ArrayList<String>  parts = CSVRowSplitter.split(str);
		int spacerCount = 0;
		
		CSVRowModel model = new CSVRowModel();
		
		for(int i=0; i<parts.size(); i++){
			System.out.println(parts.get(i));
			ArrayList<Token> tokens = classifier.classify(parts.get(i), false);
			
			StringBuffer sb = new StringBuffer();
			if (tokens.size() == 0){
				// Whatever it was, it was all whitespace and separators, so it's a spacer
				spacerCount++;
				sb.append("spacer" + spacerCount);
			}
			else{
				for(int j=0; j<tokens.size(); j++){
					String token = tokens.get(j).getValue().toLowerCase();
					if (token.contains("#")){
						token = token.replaceAll("#", "Number");
					}
					if (j==0)
						sb.append(token);
					else
						sb.append(Manipulator.capFirstChar(token));
				}
			}
			System.out.println(sb.toString() + "\n");
			model.addFieldName(sb.toString());
		}
		
		System.out.println(model);
		
		return(model);
	}
	

}
