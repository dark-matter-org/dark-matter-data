package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcOmni;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcClassInfo;

/**
 * The ClassInfoRef class is used to represent class information via the Dark Matter ID (dmdID)
 * defined on ClassDefinitions and stored statically in the DMSAG compact schemas generated from
 * the DMO Generator utility. When serialized, only the integer id is sent.
 */
@SuppressWarnings("serial")
public class ClassInfoRef implements DmcMappedAttributeIF, Comparable<ClassInfoRef>, Serializable {

	Integer 	id;
	transient 	DmcClassInfo	info;

	public ClassInfoRef(){
		id 		= -1;
		info	= null;
	}
	
	public ClassInfoRef(Integer i){
		id = i;
		info = DmcOmni.instance().getClassInfo(id);
		if (info == null)
			throw(new IllegalStateException("DmcClassInfo unavailable for id: " + i));
	}
	
	public ClassInfoRef(ClassInfoRef original){
		id = original.id;
		info = original.info;
	}
	
	public ClassInfoRef(DmcClassInfo dci){
		id = dci.id;
		info = dci;
	}
	
	public ClassInfoRef(String cn){
		info = DmcOmni.instance().getClassInfo(cn);
		if (info == null)
			throw(new IllegalStateException("DmcClassInfo unavailable for class name: " + cn));
		id = info.id;
	}
	
	public DmcClassInfo getInfo(){
		if (info == null){
			info = DmcOmni.instance().getClassInfo(id);
			if (info == null)
				throw(new IllegalStateException("DmcClassInfo unavailable for id: " + id));
		}
		return(info);
	}

	@Override
	public Object getKey() {
		return(id);
	}

	@Override
	public String getKeyAsString() {
		return(id.toString());
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if ( (obj != null) && (obj instanceof ClassInfoRef)){
			if (id.equals( ((ClassInfoRef)obj).id) )
				rc = true;
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(id);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		id = dis.readInt();
		info = DmcOmni.instance().getClassInfo(id);
		if (info == null)
			throw(new IllegalStateException("DmcClassInfo unavailable for id: " + id));
	}

	@Override
	public int compareTo(ClassInfoRef o) {
		return(id - o.id);
	}
	
	@Override
	public boolean equals(Object obj){
		boolean rc = false;
		
		if ( (obj != null) && (obj instanceof ClassInfoRef)){
			if (id == ((ClassInfoRef)obj).id)
				rc = true;
		}
		return(rc);
	}
}
