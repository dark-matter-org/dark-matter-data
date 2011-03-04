package org.dmd.dmc;

public interface DmcObjectNameIF {
	
    /**
     * Return the name of the object as a String. Regardless of how the name is
     * internally represented, it must have a String representation.
     * @return The name of the object.
     */
    public String getNameString();

    /**
     * Implementors should check to see if the object if of the same type. If so,
     * use whatever comparison strategy applies to your name. If not, fall back to 
     * a String comparisoin.
     * @param obj The comparison object.
     * @return True if the names match.
     */
    public boolean equals(Object obj);
    
    /**
     * Returns the hash code for this name.
     * @return An int hash code.
     */
    public int hashCode();

	
}
