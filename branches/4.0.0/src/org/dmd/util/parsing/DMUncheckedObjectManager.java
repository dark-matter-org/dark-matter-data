package org.dmd.util.parsing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;

/**
 * The DMUncheckedObjectManager allows you to organize a collection of DMUncheckedObjects
 * based on their construction class and whatever attribute they're using to uniquely
 * identify themselves. This mechanism is used to assist in bootstrapping the dark-matter
 * meta schema, but could be used for other purposes as well.
 * <p/>
 * This mechanism is meant to be used against a collection of objects that have unique
 * names within the scope of the objects being parsed i.e. each object must have a
 * unique name.
 * <p/>
 * Collections of objects may be retrieved on the basis of their construction class.
 * <p/>
 * You can also retrieve the names of the objects of a class in the original order in
 * which they were read.
 */
public class DMUncheckedObjectManager {
	
	private final static Iterator<DMUncheckedObject> empty = (new ArrayList<DMUncheckedObject>()).iterator();

	// Key: construction class name
	// Value: a map of the objects of this class where the key is their naming attribute
	TreeMap<String,TreeMap<String,DMUncheckedObject>> objectsByClass;
	
	// Key: construction class name
	// Value: the names of the objects in the order they were read
	TreeMap<String,ArrayList<String>>					objectsByClassOriginalOrder;
	
	// Key: the name of an object from its naming attribute
	// Value: the object
	TreeMap<String,DMUncheckedObject>					objectsByName;
	
	// This is the attribute by which the objects we read are named
	String namingAttribute;
	
	/**
	 * Creates a new DMUncheckedObjectManager that assumes that all objects
	 * will be named by the specified attribute.
	 * @param na the naming attribute.
	 */
	public DMUncheckedObjectManager(String na){
		objectsByClass	= new TreeMap<String, TreeMap<String,DMUncheckedObject>>();
		objectsByClassOriginalOrder = new TreeMap<String, ArrayList<String>>();
		objectsByName	= new TreeMap<String, DMUncheckedObject>();
		namingAttribute = na;
	}
	
	/**
	 * Attempts to add the object to our collection of objects.
	 * @param uco the object to be added.
	 * @throws DMFeedbackSet if the naming attribute isn't specified or if the name
	 * of the object clashes with an object that has already been read.
	 */
	public void add(DMUncheckedObject uco) throws DMFeedbackSet {
		TreeMap<String,DMUncheckedObject> objmap = objectsByClass.get(uco.getConstructionClass());
		ArrayList<String> order = objectsByClassOriginalOrder.get(uco.getConstructionClass());
		
		if (objmap == null){
			objmap = new TreeMap<String, DMUncheckedObject>();
			objectsByClass.put(uco.getConstructionClass(), objmap);
			order = new ArrayList<String>();
			objectsByClassOriginalOrder.put(uco.getConstructionClass(), order);
		}
		
		String name = uco.getSV(namingAttribute);
		
		if (name == null){
			DMParsingFeedback f = new DMParsingFeedback("The naming attribute: " + namingAttribute + " is missing from: " + uco.toOIF());
			throw(new DMFeedbackSet(f));
		}
		
		DMUncheckedObject existing = objectsByName.get(name);
		
		if (existing != null){
			DMParsingFeedback f = new DMParsingFeedback("Clashing names for the following objects:\n");
			f.addToMessage(existing.toOIF() + "\n");
			f.addToMessage(uco.toOIF());
			throw(new DMFeedbackSet(f));
		}
		
		objmap.put(name, uco);
		order.add(name);
		
		objectsByName.put(name, uco);
	}
	
	/**
	 * @param cn the class of object you want to retrieve.
	 * @return objects of the specified class or an empty iterator.
	 */
	public Iterator<DMUncheckedObject> getObjectsIterator(String cn){
		TreeMap<String,DMUncheckedObject> objmap = objectsByClass.get(cn);
		
		if (objmap == null)
			return(empty);
		
		return(objmap.values().iterator());
	}
	
	/**
	 * @param cn the class of object you want to retrieve.
	 * @return objects of the specified class or null.
	 */
	public TreeMap<String,DMUncheckedObject> getObjects(String cn){
		return(objectsByClass.get(cn));
	}
	
	/**
	 * @param cn the class of object you want to retrieve the original order for.
	 * @return the array of names of the loaded objects in the order they were read or null.
	 */
	public ArrayList<String> getOriginalOrder(String cn){
		return(objectsByClassOriginalOrder.get(cn));
	}
}
