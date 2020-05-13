package org.dmd.dmu.server.extended.json;

import java.util.TreeMap;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:290)
import org.dmd.dms.ClassDefinition;                                 // Used in derived constructors - (DMWGenerator.java:284)
import org.dmd.dmu.server.generated.dmw.PathAndKeyIterableDMW;
import org.dmd.dmu.server.generated.dmw.PayloadSortInfoDMW;         // The wrapper we're extending - (DMWGenerator.java:282)
import org.dmd.dmu.shared.generated.dmo.PayloadSortInfoDMO;         // The wrapper we're extending - (DMWGenerator.java:283)
import org.dmd.dmu.shared.types.PathAndKey;


public class PayloadSortInfo extends PayloadSortInfoDMW {

    public PayloadSortInfo(){
        super();
    }

    public PayloadSortInfo(PayloadSortInfoDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public TreeMap<String, PathAndKey> getPathInfo(){
    	TreeMap<String, PathAndKey> rc = new TreeMap<String, PathAndKey>();
    	
    	PathAndKeyIterableDMW it = getPathAndKeysIterable();
    	while(it.hasNext()) {
    		PathAndKey pak = it.next();
    		rc.put(pak.path(), pak);
    	}
    	
    	return(rc);
    }

}

