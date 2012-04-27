package org.dmd.dmc.types;

import java.io.Serializable;
import java.util.Iterator;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcFilter;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.types.ClassDefinitionREF;

@SuppressWarnings("serial")
public class ClassFilter extends DmcFilter implements Serializable{
	
	public final static String filterName = "ClassFilter";

	DmcClassInfo	ci;
	
	public ClassFilter(){
		
	}
	
	public ClassFilter(ClassFilter cf){
		ci = cf.ci;
	}
	
	public ClassFilter(DmcClassInfo c){
		ci = c;
	}
	
	public ClassFilter(String cn) throws DmcValueException {
		ci = DmcOmni.instance().getClassInfo(cn);
		if (ci == null)
			throw(new DmcValueException("Unknown class passed to ClassFilter: " + cn));			
	}
	
	@Override
	public DmcFilter cloneIt() {
		return(new ClassFilter(this));
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		int id = dis.readInt();
		ci = DmcOmni.instance().getClassInfo(id);
		if (ci == null)
			throw(new Exception("Unknown class id while deserializing ClassFilter: " + id));
	}

	@Override
	public String getFilterClass() {
		return(filterName);
	}

	@Override
	public String getFilterString() {
		return(ci.name);
	}

	@Override
	@SuppressWarnings("unused")
	public boolean objectMatches(DmcObject obj) {
		boolean rc = false;
		Iterator<ClassDefinitionREF> refs= obj.getObjectClass();
		while(refs.hasNext()){
			ClassDefinitionREF ref = refs.next();
			if (ref.getObject() == null){
				DmcClassInfo info = DmcOmni.instance().getClassInfo(ref.getObjectName().getNameString());
				if (ci.isInstanceOf(ref.getObjectName().getNameString())){
					rc = true;
					break;
				}
			}
			else{
				if (ci.isInstanceOf(ref.getObject().getDmdID())){
					rc = true;
					break;
				}
			}
		}
		
		return(rc);
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(ci.id);
	}

}
