package org.dmd.util.parsing;

import java.util.ArrayList;

/**
 * The CSVRowModel represents the position column names associated with CSV data.
 * Instances of this are created by the CSVRowSplitter based on the first line of data
 * in a CSV file. As the splitter contains through the file, it grabs the name of
 * the column/attribute from this model based on the column number it's parsing
 * and adds the name and value to the DmcUncheckedObject that it creates for each row.
 */
public class CSVRowModel {
	ArrayList<String> fieldNames;
	
	CSVRowModel(){
		fieldNames = new ArrayList<String>();
	}
	
	public void addFieldName(String n){
		fieldNames.add(n);
	}
	
	public String name(int i){
		if (i<0 || i>=fieldNames.size())
			throw(new IllegalStateException("Can't access field name at index: " + i));
		return(fieldNames.get(i));
	}
	
	public int size(){
		return(fieldNames.size());
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(String s: fieldNames)
			sb.append(s + "\n");
		return(sb.toString());
	}
	
}
