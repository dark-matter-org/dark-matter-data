package org.dmd.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

/**
 * The FileUpdateManager is a code generation helper class that will only replace an
 * existing file if the newly generated file is different from a previously generated
 * one. It also tracks the set of files that are generated to a particular output
 * folder and will automatically remove files that are no longer required. This is
 * especially useful when removing files for classes that have been removed from 
 * schemas or renamed.
 * <P>
 * This mechanism is useful when you include dark-matter code generation as part of
 * your build process because it cuts down on the number of files that have to be
 * recompiled; if code hasn't changed, the FileUpdateManager leaves the original file
 * (and its time stamp) intact, so unneeded recompilation is avoided.
 */
public class FileUpdateManager {

	static FileUpdateManager instance;
	
	// Stream to which progress messages are generated if the reportProgress() method has been called
	PrintStream	progressStream;
	PrintStream	errorStream;
	
	// A common header that can be written to a file, such as a copyright statement
	String		fileHeader;
	
	// The current output folder
	String 		outFolder;
	
	// A flag to indicate if we have to check whether or not to replace a file when new file
	// is closed. 
	boolean		checkFileWhenComplete;
	
	int			filesReplaced;
	int			filesCreated;
	int			filesDeleted;
	
	boolean		deleteFiles;
	
	String		lastFolder;
	
	// Key:   folder name
	// Value: all of the files we generated to the folder
	TreeMap<String,HashSet<String>>	directoryTracker;
	
	/**
	 * Constructs a new FileUpdateManager.
	 */
	protected FileUpdateManager(){
		progressStream			= null;
		outFolder				= null;
		checkFileWhenComplete	= false;
		lastFolder				= null;
		deleteFiles				= true;
	}
	
	/**
	 * @return a handle to the FileUpdateManager.
	 */
	public static FileUpdateManager instance(){
		if (instance == null)
			instance = new FileUpdateManager();
		return(instance);
	}
	
	/**
	 * Delete files for obsolete files defaults to true. If you only to wish to receive
	 * warnings of these files, set this to false.
	 * @param f
	 */
	public void deleteFiles(boolean f){
		deleteFiles = f;
	}
	
	/**
	 * Sets the stream to which progress messages will be dumped.
	 * @param ps The print stream.
	 */
	public void reportProgress(PrintStream ps){
		progressStream = ps;
	}
	
	/**
	 * Sets the stream to which error messages will be dumped.
	 * @param ps The print stream.
	 */
	public void reportErrors(PrintStream ps){
		errorStream = ps;
	}
	
	/**
	 * Sets the file header that will be automatically written to your files.
	 * @param fh
	 */
	public void fileHeader(String fh){
		fileHeader = fh;
	}
	
	/**
	 * You should call this method when you are about to start a code generation cycle.
	 */
	public void generationStarting(){
		directoryTracker = new TreeMap<String, HashSet<String>>();
		filesReplaced 	= 0;
		filesCreated	= 0;
		filesDeleted	= 0;
	}
	
	/**
	 * This method should be called when a code generation cycle is complete. It will check
	 * each of the folder where code was generated and verify that all of the .java files
	 * in the folder were generated during this code generation run. If it finds .java files
	 * in the folder that were not recorded during the generation, they will be deleted.
	 */
	public void generationComplete(){
		if (directoryTracker == null)
			throw(new IllegalStateException("The generationStarting() method must be called before calling generationComplete()"));
		
		for(String outdir: directoryTracker.keySet()){
//			DebugInfo.debug("Checking folder: " + outdir);
			
			File dir = new File(outdir);
			File[] files = dir.listFiles();
			HashSet<String>	genFiles = directoryTracker.get(outdir);
			
			for(File file: files){
				// Don't accidently delete other files that happen to be in the folder! Just the .java
				if (file.getName().endsWith(".java")){
					if (!genFiles.contains(file.getName())){
						// This file wasn't one of the ones generated to this directory, so it must be obsolete
//						DebugInfo.debug("OBSOLETE: " + outdir + " " + file.getName());
						if (deleteFiles){
							if (!file.delete())
								reportError("    Could not delete obsolete file: " + file.getAbsolutePath());
								
							reportProgress("    Removing obsolete file: " + file.getAbsolutePath());
							filesDeleted++;
						}
						else{
							reportProgress("    This file may be obsolete: " + file.getAbsolutePath());
						}
					}
				}
			}
		}
		
		reportProgress("\n");
		reportProgress("Files created:  " + filesCreated);
		reportProgress("Files replaced: " + filesReplaced);
		reportProgress("Files deleted:  " + filesDeleted);
	}
	
	/**
	 * Use this method to get a BufferedWriter for the file you're generating and close it
	 * as normal when you're done. If the file doesn't yet exist, it will be written straight to
	 * your output directory. However, if the file exists, we will write the file to the
	 * working folder and perform a comparison with the existing file. If the files are different,
	 * we'll replace the existing file, if not, we just leave the existing file alone.
	 * @param of The output folder.
	 * @param fn The name of the file to be generated.
	 * @return A BufferedWriter derivative that informs the FileUpdateManager when it's closed.
	 * @throws IOException
	 */
	public ManagedFileWriter getWriter(String of, String fn) throws IOException {
		if (directoryTracker == null)
			throw(new IllegalStateException("You must call the generationStarting() method before using the FileUpdateManager."));

		outFolder = of;
			
		String 	outFileName = outFolder + "/" + fn;
		File	outFile		= new File(outFileName);
		
		// Start off assuming that the file is new
		checkFileWhenComplete = false;
		
		addtoTracker(outFolder, fn);
		
		// If the file already exists, we generate it to a temporary file - we will then
		// check to see if the new file is different from the existing one and replace
		// it if necessary.
		if (outFile.exists()){
			// Generate the file to the working folder first
			outFileName = outFolder + "/NEW" + fn;
			checkFileWhenComplete = true;
		}
		else{
			reportProgress("    Generating: " + outFile.getAbsolutePath());
			filesCreated++;
		}
		
		ManagedFileWriter rc = new ManagedFileWriter(new FileWriter(outFileName), fn);
		
		// Write the file header if one was provided
		if (fileHeader != null)
			rc.write(fileHeader);
		
		return(rc);
	}
	
	/**
	 * Dumps the specified message to our progress stream if one was set.
	 * @param message The message to be displayed.
	 */
	void reportProgress(String message){
		if (UtilityOptions.instance().quietProgress())
			return;
		
		if (lastFolder == null){
			if (progressStream != null)
				progressStream.println("");
		}
		else{
			if (!lastFolder.equals(outFolder))
				if (progressStream != null)
					progressStream.println("");
		}
			
			
		if (progressStream != null)
			progressStream.println(message);
	}
	
	/**
	 * Dumps the specified message to our error stream if one was set.
	 * @param message The message to be displayed.
	 */
	void reportError(String message){
		if (errorStream != null)
			errorStream.println(message);
	}
	
	/**
	 * Adds the specified file name to a HashSet for the specified directory.
	 * @param od Output directory
	 * @param fn File name
	 */
	void addtoTracker(String od, String fn){
		HashSet<String>	set = directoryTracker.get(od);
		
		if (set == null){
			set = new HashSet<String>();
			directoryTracker.put(od, set);
		}
		
		set.add(fn);
	}
	
	/**
	 * This method is called from the ManagedFileWriter when its close() method is called. If
	 * required, we check the file to see if we need to replace it.
	 * @param mfw
	 */
	public void fileClosed(ManagedFileWriter mfw){
		if (checkFileWhenComplete){
			File existing = new File(outFolder + "/" + mfw.fileName);
			File newgen = new File(outFolder + "/NEW" + mfw.fileName);
			
			try {
				if (!FileUtils.contentEquals(existing, newgen)){
					// The files are different, replace the existing one
					FileUtils.copyFile(newgen, existing);
					filesReplaced++;
					reportProgress("     Replacing: " + existing.getAbsolutePath());
				}
				// Cleanup the temporary file
				if (!newgen.delete())
					reportError("    Could not delete temporary file: " + newgen.getAbsolutePath());
				
			} catch (IOException e) {
				throw(new IllegalStateException("File comparison failed.", e));
			}
		}
		
		fileHeader = null;
		lastFolder = outFolder;
	}
}
