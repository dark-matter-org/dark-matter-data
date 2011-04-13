package org.dmd.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The FileUpdateManager is a code generation helper class that will only replace an
 * existing file if the newly generated file is different from a previously generated
 * one. It also tracks the set of files that are generated to a particular output
 * folder and will automatically remove files that are no longer required. This is
 * especially useful when removing files for classes that have been removed from 
 * schemas or renamed.
 * <P>
 * This mechanism is useful when you include Dark Matter code generation as part of
 * your build process because it cuts down on the number of files that have to be
 * recompiled; if code hasn't changed, the FileUpdateManager leaves the original file
 * (and its time stamp) intact, so unneeded recompilation is avoided.
 */
public class FileUpdateManager {

	static FileUpdateManager instance;
	
//	boolean	createdWorkingFolder;
	
//	String 	workingFolder;
	
	String 	outFolder;
	
	boolean	checkFileWhenComplete;
	
	// Key:   folder name
	// Value: all of the files we generated to the folder
	TreeMap<String,HashSet<String>>	directoryTracker;
	
	
	protected FileUpdateManager(){
//		createdWorkingFolder 	= false;
//		workingFolder			= null;
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
	 * You should call this method when you are about to start a code generation cycle.
	 */
	public void generationStarting(){
		directoryTracker = new TreeMap<String, HashSet<String>>();
	}
	
	public void generationComplete(){
		if (directoryTracker == null)
			throw(new IllegalStateException("The generationStarting() method must be called before calling generationComplete()"));
		
		for(String outdir: directoryTracker.keySet()){
			DebugInfo.debug("Checking folder: " + outdir);
			
			File dir = new File(outdir);
			File[] files = dir.listFiles();
			HashSet<String>	genFiles = directoryTracker.get(outdir);
			
			for(File file: files){
				if (!genFiles.contains(file.getName())){
					// This file wasn't one of the ones generated to this directory, so it must be obsolete
					DebugInfo.debug("OBSOLETE: " + outdir + " " + file.getName());
				}
			}
		}
	}
	
//	/**
//	 * Sets the folder where temporary files will be created before being compared to existing
//	 * files. If the specified folder doesn't exist, we will attempt to create it.
//	 * @param w The full path name of the working folder.
//	 */
//	public void setWorkingFolder(String w){
//		File wf = new File(w);
//		if (!wf.exists()){
//			if (!wf.mkdirs())
//				throw(new IllegalStateException("Unable to create working folder: " + w));
//			
//			// Keep track of the fact that we created the working folder so that we can delete
//			// it when we're done.
//			createdWorkingFolder = true;
//		}
//		workingFolder = w;
//	}
	
	/**
	 * Use this method to get a BufferedWriter for the file you're generating and close it
	 * as normal when you're done. If the file doesn't yet exist, it will be written straight to
	 * your output directory. However, if the file exists, we will write the file to the
	 * working folder and perform a comparison with the existing file. The files are different,
	 * we'll replace the existing file, if not, we just leave the existing file alone.
	 * @param of The output folder.
	 * @param fn The name of the file to be generated.
	 * @return A BufferedWriter derivative that informs the FileUpdateManager when it's closed.
	 * @throws IOException
	 */
	public ManagedFileWriter getWriter(String of, String fn) throws IOException {
		if (directoryTracker == null)
			throw(new IllegalStateException("You must call the generationStarting() method be fore using the FileUpdateManager."));

		outFolder = of;
		String 	outFileName = outFolder + "/" + fn;
		File	outFile		= new File(outFileName);
		
		// Start off assuming that the file is new
		checkFileWhenComplete = false;
		
		addtoTracker(outFolder, fn);
		
		// We only intervene if we have a working folder
//		if (workingFolder != null){
			if (outFile.exists()){
				// Generate the file to the working folder first
				outFileName = outFolder + "/NEW" + fn;
				checkFileWhenComplete = true;
			}
//		}
		
		return(new ManagedFileWriter(new FileWriter(outFileName), fn));
	}
	
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
					
					DebugInfo.debug("Copying NEW" + mfw.fileName + " --> " + mfw.fileName);
				}
				// Cleanup the temporary file
				newgen.delete();
			} catch (IOException e) {
				throw(new IllegalStateException("File comparison failed.", e));
			}
		}
	}
}
