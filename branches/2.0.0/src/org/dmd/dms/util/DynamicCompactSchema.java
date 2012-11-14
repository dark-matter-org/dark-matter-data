package org.dmd.dms.util;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcCompactSchemaIF;
import org.dmd.dmc.DmcFilterBuilderIF;
import org.dmd.dmc.DmcNameBuilderIF;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmc.rules.RuleIF;

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

}
