package org.dmd.dmt.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmtStringName extends DmcObjectName implements Serializable {

	public final static String className = "DmtStringName";

	String name;
	
	public DmtStringName(){

	}
	
	public DmtStringName(String n){
		name = n;
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DmcValueException {
		name = n;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof DmtStringName)
			return(name.equals(((DmtStringName)obj).name));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(name);
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readUTF();
	}

	@Override
	public String toString(){
		return(name);
	}

	@Override
	public Object getKey() {
		return(name);
	}

	@Override
	public String getKeyAsString() {
		return(name);
	}

	@Override
	public String getNameClass() {
		return(className);
	}

	@Override
	public DmcObjectName cloneIt() {
		return(new DmtStringName(name));
	}

	@Override
	public int compareTo(DmcObjectName o) {
		if (o instanceof DmtStringName){
			return(name.compareTo(((DmtStringName)o).name));
		}
		return(name.compareTo(o.getNameString()));
	}

	@Override
	public DmcObjectName getNew() {
		return(new DmtStringName());
	}

	@Override
	public String getPresentationString() {
		return(name);
	}

}
