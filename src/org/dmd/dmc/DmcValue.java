package org.dmd.dmc;

import java.io.Serializable;

/**
 * Just a thought experiment. Why don't we derive all value classes from a common base?
 * The initial concept seems sound, except that you can't get an Iterator over the primitive type
 * easily e.g. Iterator<String> for your DmcTypeString. We're trying to come up with the leanest
 * possible implementation of the attribute. There should be as little overhead for each
 * attribute as possible.
 * 
 * @param <E> The "primitive" type
 */
@SuppressWarnings("serial")
public abstract class DmcValue<E> implements Serializable {

	E value;
	
	public E getValue(){
		return(value);
	}
	
	/**
	 * Derived classes must override this method to supply a hash code for their
	 * underlying type. This allows any value to be supported in HASHMAPPED or TREEMAPPED
	 * attributes. At this level we throw an exception.
	 * @return the hash value of your underlying type or complex type.
	 */
	public int hash(){
		throw(new IllegalStateException("The hash() method must be overriden in " + this.getClass().getName()));
	}
	
	/**
	 * Derived classes should overload this method to return the Object on which
	 * they can be mapped. If you don't override it, this method just returns the
	 * value. So, if this were the value for a String, the String itself would be 
	 * returned as the key.
	 * @return the key used to access this value in a map.
	 */
	public Object getKey(){
		return(value);
	}
	
	/**
	 * Derived classes must implement this method.
	 * @return an exact clone of the value.
	 */
	abstract public DmcValue<E> cloneIt();
	
	/**
	 * Derived classes must instantiate themselves.
	 * @return an empty value holder of this type.
	 */
	abstract public DmcValue<E> getNew();
	
	/**
	 * Derived classes must do what ever is necessary to serialize themselves.
	 * @param dos the output stream.
	 * @throws Exception
	 */
	abstract public void serializeIt(DmcOutputStreamIF dos) throws Exception;
	
	/**
	 * Derived classes must pull their contents from the input stream.
	 * @param dis the input stream.
	 * @throws Exception
	 */
	abstract public void deserializeIt(DmcInputStreamIF dis) throws Exception;
	
	/**
	 * Derived classes must override this method to present themselves in String format.
	 * This method is called in the toOIF() method of DmcAttribute and will result in
	 * an exception if not explicitly override.
	 */
	public String toString(){
		throw(new IllegalStateException("The toString() method must be overriden in " + this.getClass().getName()));
	}
	
	/**
	 * In order to function properly in maps, derived classes must override this method to
	 * perform an equals check.
	 * @return
	 */
	public boolean equals(Object obj){
		throw(new IllegalStateException("The equals() method must be overriden in " + this.getClass().getName()));
	}
	
}
