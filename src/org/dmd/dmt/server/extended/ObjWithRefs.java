package org.dmd.dmt.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.server.generated.dmw.ObjWithRefsDMW;
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;

public class ObjWithRefs extends ObjWithRefsDMW {
	
	public ObjWithRefs(){
		
	}
	
	public ObjWithRefs(ObjWithRefsDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}

}
