package org.dmd.dms.server.util;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.interfaces.DmcFilterBuilderIF;
import org.dmd.core.interfaces.DmcNameBuilderIF;
import org.dmd.core.rules.RuleIF;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.schema.DmcClassInfo;
import org.dmd.core.schema.DmcCompactSchemaIF;
import org.dmd.core.schema.DmcSliceInfo;
import org.dmd.core.schema.DmcTypeInfo;


/**
 * The DynamicCompactSchema is used to create a loadable compact schema dynamically
 * from a loaded schema.
 */
public class DynamicCompactSchema implements DmcCompactSchemaIF {
	
	String name;
	
	TreeMap<String,DmcAttributeInfo>	attrInfo;
	
	TreeMap<String,DmcClassInfo>		classInfo;
	
	public DynamicCompactSchema(String n){
		name 		= n;
		attrInfo	= new TreeMap<String, DmcAttributeInfo>();
		classInfo	= new TreeMap<String, DmcClassInfo>();
	}
	
	public void addAttrInfo(DmcAttributeInfo ai){
		attrInfo.put(ai.name, ai);
	}
	
	public void addClassInfo(DmcClassInfo ci){
		classInfo.put(ci.name, ci);
	}

	@Override
	public String getSchemaName() {
		return name;
	}

	@Override
	public Iterator<DmcClassInfo> getClassInfo() {
		return(classInfo.values().iterator());
	}

	@Override
	public Iterator<DmcAttributeInfo> getAttributeInfo() {
		return(attrInfo.values().iterator());
	}

	@Override
	public Iterator<DmcNameBuilderIF> getNameBuilders() {
		return null;
	}

	@Override
	public Iterator<DmcFilterBuilderIF> getFilterBuilders() {
		return null;
	}

	@Override
	public Iterator<DmcSliceInfo> getSliceInfo() {
		return null;
	}

	@Override
	public Iterator<RuleIF> getRules() {
		return null;
	}

	@Override
	public Iterator<DmcTypeInfo> getTypeInfo() {
		return null;
	}

}
