package org.dmd.dsd.tools.dsdwizard;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DSDInteractive {

	String runningDir;
	String workspace;
	String project;
	
	TreeMap<String,ProjectInfo>	projectsByName = new TreeMap<String, DSDInteractive.ProjectInfo>();
	TreeMap<Integer,ProjectInfo>	projectsByNumber = new TreeMap<Integer, DSDInteractive.ProjectInfo>();
	
    BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
    
    // Where we're creating the DSL
    ProjectInfo	targetProject;
    
    // The folder where the java will be generated, generally src or src/main/java
    String		targetSourceFolder;
    
    // The package for the DSL
    String		targetPackage;
    
    // The folder location for the project
    String		targetFolder;
    
    // The file extension and/or abbreviation of the DSL name - this is all lowercase
    String		targetDslAbbrev;
    
    // This is the same as the abbrev except that the first letter is capitalized
    String		targetModuleName;

	public DSDInteractive(String[] args) throws IOException {
		initialize(args);
	}
	
	public void run() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet, DmcNameClashException, DmcRuleExceptionSet{
		if (findProjectAndSrc(runningDir)){
			findOtherProjects();
			gatherInput();
			
			DSLArtifactGenerator generator = new DSLArtifactGenerator();
			generator.generateDSD(workspace, targetProject.name, targetPackage, targetFolder, targetDslAbbrev, targetModuleName);
		}
		else{
			System.err.println("Not running in an Eclipse project");
		}
	}

	void initialize(String[] args) throws IOException {
        File curr = new File(".");
        runningDir = curr.getCanonicalPath();
		System.out.println("*** Running from: " + runningDir);
		
		int lastSlash = runningDir.lastIndexOf(File.separator);
		workspace = runningDir.substring(0,lastSlash);
		System.out.println("*** Workspace: " + workspace);
		
		project = runningDir.substring(lastSlash + 1);
	}
	
	boolean findProjectAndSrc(String dir){
		boolean	haveProject = false;
		boolean haveSrc = false;
		
		File rd = new File(dir);
		
		File[] files = rd.listFiles();
		for(int i=0; i<files.length; i++){
			if (files[i].getName().equals(".project")){
				haveProject = true;
			}
			if (files[i].getName().equals("src")){
				if (files[i].isDirectory())
				 haveSrc = true;
			}
		}
		
		return(haveProject && haveSrc);
	}
	
	enum State {
		getWorkspaceConfirmation,
		getProject,
		getJavaSrcFolder,
		getPackage,
		getDslAbbrev
	}
	
	void gatherInput() throws IOException{
		String input = null;
        State state = State.getWorkspaceConfirmation;
        boolean done = false;

        while(!done){
        	switch(state){
        	case getWorkspaceConfirmation:
        		System.out.println("You are running in the " + workspace + " workspace. Is that where you want to create the DSL? y/n");
        		input = getResponse().toLowerCase();
        		if (input.equals("y")){
        			state = State.getProject;
        		}
        		else if (input.equals("n")){
        			System.out.println("Okay, we're done - until we allow choice of workspace...");
        			System.exit(0);
        		}
        		break;
        	case getProject:
        		System.out.println("Please specify the number of the project where you want to create the DSL: \n");
        		showProjects();
        		input = getResponse();
        		int pnum;
        		try{
        			pnum = Integer.decode(input);
        		}
        		catch(NumberFormatException ex){
        			System.err.println("Not a valid number: " + input);
        			continue;
        		}
        		if ( (pnum < 1) || (pnum > projectsByName.size()) ){
        			System.err.println("Not a valid number: " + input);
        			continue;
        		}
        		
        		targetProject = projectsByNumber.get(pnum);
        		
        		System.out.println("We'll create the DSL in: " + targetProject.name + "\n");
        		state = State.getJavaSrcFolder;
        		break;
        	case getJavaSrcFolder:
        		System.out.println("By default, we generate the code beneath the \"src\" directory within your project.");
        		System.out.println("However, if you're creating a Maven project, the code is likely in src/main/java.");
        		System.out.println("Please specify the source folder e.g. src, src/main/java or something else:\n");
        		
        		input = getResponse();

        		if (input.matches("[a-z][/a-z]*")){
    				targetSourceFolder = input;
    				
    				String testFolderName = workspace + File.separator + targetProject.name + File.separator + targetSourceFolder;
    				
    				File tf = new File(testFolderName);
    				if (!tf.exists()){
    					System.err.println("Sorry, the target java source folder DOESN'T EXIST: " + testFolderName);
    					continue;
    				}
    				System.out.println("Target java source folder: " + targetSourceFolder + "\n");
    				state = State.getPackage;
    			}
    			else{
    				System.err.println("Bad java source folder name: " + input + "\n");
    				continue;
    			}
        		
        		break;
        	case getPackage:
    			System.out.println("Specify a new java package in which to create the DSL. This MUST be a new package.");
    			System.out.println("We won't try to generate the DSL into an existing package, due to the risk of overwriting existing files.");
    			input = getResponse();
    			if (input.matches("[a-z][a-z0-9.]*")){
    				targetPackage = input;
    				
    				String folder = input.replaceAll("\\.", File.separator);
    				targetFolder = workspace + File.separator + targetProject.name + File.separator + targetSourceFolder + File.separator + folder;
    				
    				File tf = new File(targetFolder);
    				if (tf.exists()){
    					System.err.println("Sorry, the target folder already exists: " + targetFolder);
    					continue;
    				}
    				System.out.println("Target source folder: " + targetFolder + "\n");
    				state = State.getDslAbbrev;
    			}
    			else{
    				System.err.println("Bad package name: " + input + "\n");
    				continue;
    			}
        		break;
        	case getDslAbbrev:
    			System.out.println("Specify the abbreviation of your DSL. By convention, this will be the file extension");
    			System.out.println("of files that contain definitions associated with your DSL. It should 3-6 characters (or there abouts).");
    			System.out.println("It's useful to have a unique prefix for DSLs associated with your company or division,");
    			System.out.println("for example all dark-matter DSLs start with 'dm'.");
    			input = getResponse();
    			
    			if (input.matches("[a-zA-Z][a-zA-Z]*")){
    				targetDslAbbrev = input.toLowerCase();
    				targetModuleName = Manipulator.capFirstChar(input);
    				
    				System.out.println("DSL file extension: " + targetDslAbbrev);
    				System.out.println("DSL module name:    " + targetModuleName + "Module");
    				done = true;
    			}
    			else{
    				System.err.println("The abbreviation should be letters only");
    				continue;
    			}
 		
        		break;
        	}
        }
        
        
		
	}
	
	String getResponse() throws IOException {
		String input = in.readLine();
		if (input == null){
			System.out.println("Exitting...");
			System.exit(0);
		}
		return(input.trim());
	}
	
	void showProjects(){
		for(ProjectInfo pi: projectsByName.values()){
			System.out.println(pi.number + "  " + pi.name);
		}
		System.out.println();
	}
	
	void findOtherProjects() throws IOException{
		DebugInfo.debug("Looking for projects from: " + workspace);
		File wsdir = new File(workspace);
		File[] files = wsdir.listFiles();
		for(int i=0; i<files.length; i++){
			if (files[i].isDirectory()){
				DebugInfo.debug("Checking: " + files[i].getName());
				if (findProjectAndSrc(files[i].getCanonicalPath())){
					ProjectInfo pi = new ProjectInfo(files[i].getName());
					projectsByName.put(pi.name, pi);
				}
			}
		}
		
		int number = 1;
		for(ProjectInfo pi: projectsByName.values()){
			pi.number = number++;
			System.out.println(pi.number + " " + pi.name);
			projectsByNumber.put(pi.number, pi);
		}
	}

	class ProjectInfo {
		String name;
		int number;
		
		ProjectInfo(String n){
			name = n;
		}
	}
}
