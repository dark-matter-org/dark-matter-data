package org.dmd.dmc;

/**
 * The DmcNameResolverIF interface defines an entity that maintains a name mapping for a set
 * of DmcNameObjectIF instances and can find those instances based on a String
 * name.
 */

public interface DmcNameResolverIF {

    /**
     * Finds a named object based on its name
     */
    public DmcNamedObjectIF findNamedObject(String name);

}
 
