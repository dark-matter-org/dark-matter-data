package org.dmd.dmp.server.servlet.base.plugins;

import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.HierarchicNode;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

public class BasicCachePlugin extends DmpServletPlugin implements CacheIF {
	
	SchemaManager							schema;
	
	TreeMap<DmcObjectName,DmcObject>		flat;
	
	TreeMap<DmcObjectName,HierarchicNode>	hierarchy;

	public BasicCachePlugin(){
		super();
	}
	
	@Override
	protected void init() throws ResultException {
		schema 		= getPluginManager().getSchema();
		flat 		= new TreeMap<DmcObjectName, DmcObject>();
		hierarchy	= new TreeMap<DmcObjectName, HierarchicNode>();
	}

	@Override
	public void addObject(DmcObject obj) {
		// We get the class of the object
		ClassDefinition 	cd 		= (ClassDefinition)obj.getConstructionClass().getObject().getContainer();
		// We get the definition of its naming attribute
		AttributeDefinition	ad 		= cd.getIsNamedBy();
		// We get the name attribute 
		DmcAttribute<?> 	na 		= obj.get(ad.getAttributeInfo());

		if (ad.getType().getIsHierarchicName()){
			// Since all names are single valued, we just grab the value and cast it
			DmcHierarchicObjectName name = (DmcHierarchicObjectName) na.getSV();
			
			DmcHierarchicObjectName parent = name.getParentName();
			if (parent == null){
				HierarchicNode node = new HierarchicNode(name, obj);
				hierarchy.put(name, node);
			}
			else{
				HierarchicNode parentNode = hierarchy.get(parent);
				if (parentNode == null)
					throw(new IllegalStateException("Could not find parent node for object: " + name.getNameString()));
				HierarchicNode child = parentNode.addChild(name, obj);
				hierarchy.put(name, child);
			}	
		}
		else{
			// Since all names are single valued, we just grab the value and cast it
			DmcObjectName name = (DmcObjectName) na.getSV();
			
			flat.put(name, obj);
		}
	}

	
	
}
