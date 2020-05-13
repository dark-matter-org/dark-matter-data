package org.dmd.dmu.shared.types;

import java.util.ArrayList;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.CheapSplitter;

/**
 * The PathAndKey type is used to store a slash separated path descriptor to
 * and array and the name of key value for objects stored in that array.
 */
public class PathAndKey {
	
	// Marker length
	final public static int		ML = 2;
	
	final public static String START_MARKER = "{{";
	final public static String END_MARKER = "}}";
	
	protected String pathAndKey;
	protected String path;
	protected String key;

	public PathAndKey() {
		pathAndKey 	= null;
		path 		= null;
		key			= null;
	}
	
	public PathAndKey(String pathAndKey)  throws DmcValueException {
		this.pathAndKey = pathAndKey;
		init();
	}
	
	public PathAndKey(String path, String key)  throws DmcValueException {
		this.pathAndKey = path + " " + key;
		this.path = path;
		this.key = key;
	}
	
	public String path() {
		return(path);
	}
	
	public String key() {
		return(key);
	}
	
	private void init() throws DmcValueException {
		int spacePos = pathAndKey.indexOf(" ");
		if (spacePos == -1) {
			throw(new DmcValueException("A PathAndKey must have a path value seperated by a space from a key value."));
		}
		ArrayList<String> parts = CheapSplitter.split(pathAndKey, ' ', false, true);
		if (parts.size() != 2) {
			throw(new DmcValueException("A PathAndKey must have a path value seperated by a space from a key value."));			
		}
		path 	= parts.get(0);
		key		= parts.get(1);		
	}
	
	public PathAndKey(PathAndKey ts) {
		pathAndKey = new String(ts.pathAndKey);
		path = ts.path;
		key = ts.key;
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(pathAndKey);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		pathAndKey 	= dis.readUTF();
		init();
	}
	

}
