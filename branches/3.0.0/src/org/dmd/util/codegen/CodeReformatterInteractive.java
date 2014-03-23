package org.dmd.util.codegen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dmd.dmc.types.IntegerVar;
import org.dmd.util.parsing.CommandLine;

/**
 * The CodeFormatterWizard is a helper utility that reads code copied/pasted from
 * a Java source file and reformats it so that it can be pasted as either a series
 * of write statements or StringBuffer append statements into code generator.
 */
public class CodeReformatterInteractive {

	static CommandLine          commandLine	= new CommandLine();
	static StringBuffer         prefix		= new StringBuffer();
	static IntegerVar         	tabwidth	= new IntegerVar(4);
    static BufferedReader  		in 			= new BufferedReader(new InputStreamReader(System.in));
    
	
	public static void main(String[] args) throws IOException {
		commandLine.addOption("-prefix",    prefix,    "The prefix that will be written before each line for example out.write or sb.append");
		commandLine.addOption("-tabwidth",  tabwidth,    "The width of the tabs in the code you're pasting; default 4.");
		
		commandLine.parseArgs(args);
		
		if (prefix.length() == 0){
			System.err.println("You have to specify the -prefix argument.");
			System.exit(1);
		}
		
		gatherInput();
	}

	enum State {
		gatherInput,
		formatOutput,
	}

	static void gatherInput() throws IOException{
		String 			input = null;
		StringBuffer	output = new StringBuffer();
		boolean			lastWasNL = false;
		
        State state = State.gatherInput;
        boolean done = false;

		System.out.println("Paste java code below. When you're finished a section, enter 3 newlines and I'll reformat the pasted content...\n\n");

		int newLines = 0;
		
		while(!done){
        	switch(state){
        	case formatOutput:
        		System.out.println(output.toString() + "\n");
        		output = new StringBuffer();
        		newLines = 0;
        		lastWasNL = false;
        		state = State.gatherInput;
        		break;
        	case gatherInput:
        		input = getInput();
        		if (input.length() == 0){
        			newLines++;
        			if (newLines == 3)
        				state = State.formatOutput;
        			lastWasNL = true;
        		}
        		else{
        			if (lastWasNL){
        				output.append(prefix + "(\"\\n\");\n");
        			}
        			lastWasNL = false;
        			newLines = 0;
        			
        			output.append(input);
        		}
        		break;
        	}
        }
	}
	
	static String getInput() throws IOException {
		String input = in.readLine();
		
		// Just a new line, return empty 
		if (input.equals(""))
			return("");
		
		StringBuffer sb = new StringBuffer();
		sb.append(prefix + "(\"");
		
		for(int i=0; i<input.length(); i++){
			if (input.charAt(i) == '\t'){
				for(int j=0; j<tabwidth.intValue(); j++)
					sb.append(" ");
			}
			else if (input.charAt(i) == '"'){
				sb.append("\\\"");
			}
			else if (input.charAt(i) == '\\'){
				sb.append("\\\\");
			}
			else if (input.charAt(i) == '\n'){
				if (i != input.length()){
					System.err.println("Wasn't expecting newline");
				}
			}
			else{
				sb.append(input.charAt(i));
			}
		}
		
		sb.append("\\n\");\n");
		
		return(sb.toString());
	}
	

}
