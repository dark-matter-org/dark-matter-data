package org.dmd.dmr.server.ldap.util;


//import java.util.ArrayList;
//import java.util.TreeMap;
//import java.util.Vector;

/**
 * The HierarchyReader reads a collection of HierarchicObjects and assembles them into
 * a hierarchy of objects.
 */
//public class HierarchyParser implements ImdGenericObjectHandlerIF, ImdNameResolverIF {
public class HierarchyParser {

	
//	// The parser that reads the object collection
//	ImdGenericObjectParser	parser;
//	
//	HierarchicObject		root;
//	
//	// Key:   An object's FQN
//	// Value: The object
//	TreeMap<String,HierarchicObject>	keyMap;
//	
//	ImdAttributeDef			fqnAD;
//	ImdAttributeDef			parentFqnAD;
//	
//	PrintfFormat				format = new PrintfFormat("%-25s");
//	
//	ArrayList<HierarchicObject>	loadedObjects;
//
//	public HierarchyReader(ImdSchemaManager sm){
//		// Note: we set the delay resolution flag to true - we will perform
//		// resolution of references after we've finished reading a file.
//		parser = new ImdGenericObjectParser(this,sm,this,false);
//		
//		fqnAD 		= sm.adef("fqn");
//		parentFqnAD	= sm.adef("parentFqn");
//	}
//	
//	public HierarchicObject readHierarchy(String fn) throws ResultException {
//		ResultSet rs = new ResultSet();
//		
//		keyMap 	= new TreeMap<String, HierarchicObject>();
//		root	= null;
//		
//		loadedObjects = new ArrayList<HierarchicObject>();
//		
//		if (!parser.parseObjects(rs, fn)){
//			ResultException ex = new ResultException(rs);
//			throw(ex);
//		}
//		
//		resolveReferences();
//		
//		return(root);
//	}
//	
//	/**
//	 * This method can be used to load multiple hierarchic structures into the same keymap. All
//	 * of the hierarchies should share a common root object (which is NOT stored in the file 
//	 * with the object being loaded). However, you must have access to the root object and
//	 * place its FQN in the byFQN map before you call this method. 
//	 * @param byFQN The mapping of objects by FQN. This must contain an entry for your root
//	 * object if you're using a common root.
//	 * @param fn The name of the file to be parsed.
//	 * @throws ResultException
//	 */
//	public void readHierarchicFile(TreeMap<String,HierarchicObject> byFQN, String fn) throws ResultException {
//		ResultSet rs = new ResultSet();
//
//		keyMap = byFQN;
//		
//		loadedObjects = new ArrayList<HierarchicObject>();
//		
//		if (!parser.parseObjects(rs, fn)){
//			ResultException ex = new ResultException(rs);
//			throw(ex);
//		}
//		
//		resolveReferences();
//		
//	}
//
//	/**
//	 * This method allows you to read a set of objects below a pre-existing root object.
//	 * @param existingRoot
//	 * @param fn
//	 * @return
//	 * @throws ResultException
//	 */
//	public HierarchicObject readHierarchyBelowRoot(HierarchicObject existingRoot, String fn) throws ResultException {
//		ResultSet rs = new ResultSet();
//		
//		keyMap 	= new TreeMap<String, HierarchicObject>();
//		keyMap.put(existingRoot.getFqn(), existingRoot);
//		root	= existingRoot;
//		
//		loadedObjects = new ArrayList<HierarchicObject>();
//		
//		if (!parser.parseObjects(rs, fn)){
//			ResultException ex = new ResultException(rs);
//			throw(ex);
//		}
//		
//		resolveReferences();
//		
//		return(root);
//	}
//	
//	void resolveReferences() throws ResultException {
//		for(int i=0; i<loadedObjects.size(); i++){
//			HierarchicObject ho = loadedObjects.get(i);
//            ResultSet rs1 = new ResultSet();
//            Vector unresRefs = new Vector();
//            if (!ho.resolveReferences(rs1, unresRefs, this,"Couldn't resolve reference to: ",true,false)){
////                rs1.lastResult().fileName(((GpfDef)go).getFile());
////                rs1.lastResult().lineNumber(((GpfDef)go).getLineNumber().intValue());
//            	
//            	ResultException ex = new ResultException(rs1);
//            	throw(ex);
//            }
//		}
//	}
//
//	@Override
//	public boolean handleGenericObject(ResultSet rr, ImdGenericObject obj, String infile) {
//		boolean 			rc 			= true;
//		String				fqn			= null;
//		String				parentFqn	= null;
//		HierarchicObject	newEntry	= null;
//		HierarchicObject	parentEntry	= null;
//		HierarchicObject	currObj		= null;
//		
//		if ( !(obj instanceof HierarchicObject)){
//			rr.addResult(Result.ERROR, "Object is not a HierarchicObject");
//			rr.lastResult().lineNumber(parser.getCurrLine());
//			rc  = false;
//		}
//		currObj = (HierarchicObject) obj;
//		
//		loadedObjects.add(currObj);
//		
////System.out.println(obj.toString(format));
//		
////		if (obj.getAttr(fqnAD) == null){
//		if (currObj.getFqn() == null){
//			rr.addResult(Result.ERROR, "Missing fqn");
//			rr.lastResult().lineNumber(parser.getCurrLine());
//			rc  = false;
//		}
//		else{
//			try{
//				fqn = currObj.getFqn();
//				
//				if (currObj.getParentFqn() != null)
//					parentFqn = currObj.getParentFqn();
//				
//				if (parentFqn == null){
//					if (root == null){
////						root = new HierarchicObjectOrig(null,obj);
//						root = currObj;
//						root.setParentObject(null);
//						
//						keyMap.put(fqn,root);
//					}
//					else{
//						// The only time that parent should be null is when we're dealing with the
//						// root object - otherwise, it's an error
//						rr.addResult(Result.ERROR, "Missing parent for object: " + fqn);
//						rr.lastResult().lineNumber(parser.getCurrLine());
//						rc  = false;
//					}
//				}
//				else{
//					if (keyMap.get(fqn) == null){
//						parentEntry = keyMap.get(parentFqn);
//						
//						if (parentEntry == null){
//							rr.addResult(Result.ERROR, "Missing parent: " + parentFqn + " for object: " + fqn);
//							rr.lastResult().lineNumber(parser.getCurrLine());
//							rc  = false;
//						}
//						else{
////							newEntry = new HierarchicObjectOrig(parentEntry,obj);
//							newEntry = currObj;
//							newEntry.setParentObject(parentEntry);
//							
//							keyMap.put(fqn, newEntry);
//						}
//					}
//					else{
//						rr.addResult(Result.ERROR, "Duplicate fqn: " + fqn);
//						rr.lastResult().lineNumber(parser.getCurrLine());
//						rc = false;
//					}
//					
////					System.out.println("Read: " + newEntry.getRepositoryID());
//				}
//			}
//			catch(ResultException ex){
//				rr.addResults(ex.result);
//			}
//		}
//		
//		return(rc);
//	}
//
//	@Override
//	public ImdNamedObjectIF findNamedObject(String name) {
////		System.out.println(name);
//		return(keyMap.get(name));
//		
//	}
//	
	
	
}
