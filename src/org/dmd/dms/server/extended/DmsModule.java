package org.dmd.dms.server.extended;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.server.generated.dmw.DmsModuleDMW;
import org.dmd.dms.shared.generated.dmo.DmsModuleDMO;
import org.dmd.dms.shared.types.StringToString;
import org.dmd.util.artifact.Manipulator;

public class DmsModule extends DmsModuleDMW {

    TreeMap<String,StringToString>			dmwToPackageMapping;

    // Stores the name of the schema as it would be referred to in a static reference
    protected String	staticRefName;

    public DmsModule(){
		super();
	}
	
	public DmsModule(DmsModuleDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
	/**
	 * Returns the name of this schema as it would be referred to in a static reference.
	 * For example org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG
	 * @return The name of the schema when used in a static context.
	 */
	public String getStaticRefName(){
		return(staticRefName);
	}
	
	public String getCompactSchemaImport(){
		String name = Manipulator.dotNameToCamelCase(getName().getNameString()) + "CompactSchema";
		return(getSchemaPackage() + ".generated.dmo." + name);
	}

	public String getCompactSchemaName(){
		String rc = Manipulator.dotNameToCamelCase(getName().getNameString()) + "CompactSchema";
		return(rc);
	}
	
	/**
	 * @param context the generation context
	 * @return the wrapper package for the specified DMW type if it has been specified
	 * via the dmwTypeToPackage attribute on a DmsModule.
	 */
	public String getDmwPackage(String context){
		if (dmwToPackageMapping == null){
			dmwToPackageMapping = new TreeMap<String, StringToString>();
			Iterator<StringToString>	mapping = getDmwTypeToPackageIterable();
			if (mapping != null){
				while(mapping.hasNext()){
					StringToString curr = mapping.next();
					StringToString existing = dmwToPackageMapping.get(curr.getKey());
					if (existing != null)
						throw(new IllegalStateException("Multiple dmwTypeToPackage values with same key in schema: " + getName()));
					dmwToPackageMapping.put(curr.getKeyAsString(), curr);
				}
			}
			
			if (getDmwPackage() != null){
				// Backwards compatibility
				StringToString entry = new StringToString("dmw",getDmwPackage());
				dmwToPackageMapping.put(entry.getKeyAsString(), entry);				
			}
		}
		StringToString existing = dmwToPackageMapping.get(context);
		if (existing == null)
			return(null);
		return(existing.getValue());
	}
	

	
}
