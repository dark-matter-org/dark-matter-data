package org.dmd.dms.server.extended;

import org.dmd.dms.server.generated.dmw.DmsModuleDMW;
import org.dmd.dms.shared.generated.dmo.DmsModuleDMO;

public class DmsModule extends DmsModuleDMW {

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


	
}
