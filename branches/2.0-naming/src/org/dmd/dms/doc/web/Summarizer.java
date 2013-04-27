package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.DMDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.DMDefinitionDMO;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.dmw.DMDefinitionDMW;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.exceptions.DebugInfo;

public class Summarizer {

	TreeMap<Integer,SchemaDefinition>				allSchemasByID;
	
	TreeMap<String,SchemaDefinition>				allSchemasByName;

	TreeMap<String,TreeMap<String,DMDefinition>>	definitionsByLetter;
	
	String 				outDir;
	
	// The content of the navigation sidebar
	StringBuffer		sidebar;
	
	StringBuffer		idSummary;
	
//    DmoObjectFactory	dmofactory;
//    DmwObjectFactory	dmwFactory;

    public Summarizer(SchemaManager sm, String od){
		allSchemasByID 		= new TreeMap<Integer, SchemaDefinition>();
		allSchemasByName 	= new TreeMap<String, SchemaDefinition>();
		definitionsByLetter = new TreeMap<String, TreeMap<String,DMDefinition>>();
		outDir 				= od;
		sidebar				= new StringBuffer();
		idSummary			= new StringBuffer();
//        dmofactory			= new DmoObjectFactory(sm);
//        dmwFactory			= new DmwObjectFactory(sm);
		
		Iterator<SchemaDefinition> sdit = sm.getSchemas();
		if (sdit != null){
			while(sdit.hasNext()){
				SchemaDefinition sd = sdit.next();
				allSchemasByID.put(sd.getSchemaBaseID(), sd);
				allSchemasByName.put(sd.getName().getNameString(), sd);
				
			}
		}
		
		buildSidebar();
		
		buildIDSummary();
		
		DmcOmni.instance().setTrackSchemaReferences(true);
		DmcOmni.instance().backRefTracking(true);	
		
		DebugInfo.debug("\n\nCHANGED REFERENCE RESOLUTION STUFF!!!\n\n");
		
		for(DMDefinition def: sm.globallyUniqueMAP.values()){
			unambignify(def.getDmcObject());
			
			def.getDMO().clearReferenceInfo();
		}
		
		for(SchemaDefinition sd: allSchemasByName.values()){
			Iterator<RuleDataDMO> rules = sd.getParsedRulesDMOs(sm);
			while(rules.hasNext()){
				RuleDataDMO rule = rules.next();
				unambignify(rule);
				rule.clearReferenceInfo();
			}
		}


		for(DMDefinition def: sm.globallyUniqueMAP.values()){
			addDefinition(def);
			try {
				def.resolveReferences(sm,sm);
				
			} catch (DmcValueExceptionSet e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				DebugInfo.debug("While resolving:\n\n" + def.toOIF() + "\n\n");
			}
		}

//		for(DMDefinition def: sm.allDefs.values()){
//			def.getDMO().clearReferenceInfo();
//		}
//		
//		for(DMDefinition def: sm.allDefs.values()){
//			addDefinition(def);
//			try {
//				def.resolveReferences(sm);
//				
//			} catch (DmcValueExceptionSet e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
//		for(SchemaDefinition sd: allSchemasByName.values()){
//			Iterator<RuleDataDMO> rules = sd.getParsedRulesDMOs(sm);
//			while(rules.hasNext()){
//				RuleDataDMO rule = rules.next();
//				unambignify(rule);
//				rule.clearReferenceInfo();
//				
//				try {
//					rule.resolveReferences(sm,sm);
//				} catch (DmcValueExceptionSet e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		for(SchemaDefinition sd: allSchemasByName.values()){
			Iterator<RuleDataDMO> rules = sd.getParsedRulesDMOs(sm);
			while(rules.hasNext()){
				RuleDataDMO rule = rules.next();
				try {
					rule.resolveReferences(sm,sm);
				} catch (DmcValueExceptionSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
    
    /**
     * As schema definitions are read from definition files or from internalized schemas, we have the
     * context in which definitions are being added/resolved. However, once we clear reference info on
     * all of the objects, we've lost our context and we can't resolve properly.
     * <p/>
     * This method will reset the reference attribute values to have a fully qualified name for the 
     * thing to which they are resolved so that we can rerun the resolution.
     * @param obj
     */
    void unambignify(DmcObject obj){
//    	if (obj instanceof DmcNamedObjectIF)
//    		DebugInfo.debug("UNAMBIGNIFYING: " + ((DmcNamedObjectIF)obj).getObjectName().getNameString());
    	
    	for(DmcAttribute<?> attr: obj.getAttributes().values()){
    		if (attr instanceof DmcTypeNamedObjectREF){
    			if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
    				DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) attr.getSV();
    				DMDefinitionDMO dmo = null;
    				
    				if (ref.getObject() instanceof DMDefinitionDMO)
    					dmo = (DMDefinitionDMO) ref.getObject();
    				else if (ref.getObject() instanceof DMDefinitionDMW)
    					dmo = ((DMDefinitionDMW)ref.getObject()).getDMO();
    				
    				if (dmo != null){
//    					DebugInfo.debug("SV Ref name: " + ref.getObjectName().getNameString() + "  Obj name: " + dmo.getDotName().getNameString() + "  Depth: " + dmo.getDotName().getDepth());
    					try {
							ref.setName(dmo.getDotName().getParentName());
						} catch (DmcValueException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    				}
    				else{
//    					if (ref.getObject() == null)
//        					DebugInfo.debug("MV Reference to non-definition: " + ref.getObjectName().getNameString() + "  NULL object");
//    					else
//    						DebugInfo.debug("MV Reference to non-definition: " + ref.getObjectName().getNameString() + "  Class: " + ref.getObject().getClass().getName());
    				}
    			}
    			else{
    				Iterator<?> refs = attr.getMV();
    				while(refs.hasNext()){
    					DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) refs.next();
        				DMDefinitionDMO dmo = null;    					
        				
        				if (ref.getObject() instanceof DMDefinitionDMO)
        					dmo = (DMDefinitionDMO) ref.getObject();
        				else if (ref.getObject() instanceof DMDefinitionDMW)
        					dmo = ((DMDefinitionDMW)ref.getObject()).getDMO();
        				

        				if (dmo != null){
//        					DebugInfo.debug("MV Ref name: " + ref.getObjectName().getNameString() + "  Obj name: " + dmo.getDotName().getNameString() + "  Depth: " + dmo.getDotName().getDepth());
        					try {
    							ref.setName(dmo.getDotName().getParentName());
    						} catch (DmcValueException e) {
    							// TODO Auto-generated catch block
    							e.printStackTrace();
    						}
        				}
        				else{
//        					if (ref.getObject() == null)
//            					DebugInfo.debug("MV Reference to non-definition: " + ref.getObjectName().getNameString() + "  NULL object");
//        					else
//        						DebugInfo.debug("MV Reference to non-definition: " + ref.getObjectName().getNameString() + "  Class: " + ref.getObject().getClass().getName());
        				}
    				}
    			}
    		}
    	}
    }
	
	public String getSideBar(){
		return(sidebar.toString());
	}
	
	void buildSidebar(){
		sidebar.append("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
		sidebar.append("    <div id=\"sidebar\">\n");
		
		for(SchemaDefinition sd: allSchemasByName.values()){
			String name = sd.getName().getNameString();
			sidebar.append("        <a class=\"navLink\" href=\"" + name + ".html\"> " + name + "</a>\n");
		}
		
		sidebar.append("        <a class=\"navLink\" href=\"SchemaSummaryPage.html\"> Summary </a>\n");
		
		
		sidebar.append("    </div>\n");
	}
	
	void buildIDSummary(){
		idSummary.append("<div class=\"idSummary\">\n\n");
		
		idSummary.append("<h2> Schema Identifier Ranges </h2>\n\n");
		
		idSummary.append("  <table>\n\n");
		
		for(SchemaDefinition sd: allSchemasByID.values()){
			int end = sd.getSchemaBaseID() + sd.getSchemaIDRange();
			String name = sd.getName().getNameString();
			idSummary.append("    <tr>\n");
			idSummary.append("      <td>\n");
			idSummary.append("    " + name + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("      <td>\n");
			idSummary.append("      " + sd.getSchemaBaseID() + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("      <td>\n");
			idSummary.append("      " + end + "\n");
			idSummary.append("      </td>\n");
			idSummary.append("    </tr>\n");
		}
		
		idSummary.append("  </table>\n\n");

		idSummary.append("</div> <!-- idSummary -->\n\n");

//		idSummary.append("<table>\n");
		
	}
	
	void addDefinition(DMDefinition def){
		String firstLetter = Character.toUpperCase(def.getName().getNameString().charAt(0)) + "";
		
		TreeMap<String,DMDefinition> startingWith = definitionsByLetter.get(firstLetter);
		
		if (startingWith == null){
			startingWith = new TreeMap<String,DMDefinition>();
			definitionsByLetter.put(firstLetter, startingWith);
		}
		
		startingWith.put(def.getName().getNameString(), def);
	}
	
	public void dumpTextSummary(){
		for(String firstLetter: definitionsByLetter.keySet()){
			TreeMap<String,DMDefinition> startingWith = definitionsByLetter.get(firstLetter);
			
			System.out.println("---------- " + firstLetter + " ----------  (" + startingWith.size()+ ")");
			for(DMDefinition def: startingWith.values()){
				System.out.println("    " + def.getName().getNameString() + " (" + def.getDMO().referenceCount() + ")");
			}
		}
	}
	
	public void dumpSchemaSummaryPage(String outdir) throws IOException{
		String ofn = outdir + File.separator + "SchemaSummaryPage.html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		StandardParts.writePageHeader(out, "Schema Summary");
		
		StandardParts.writeContentStart(out);
		
		out.write(idSummary.toString());
		
		StandardParts.writeContentEnd(out);

		out.write(this.getSideBar());
		
		StandardParts.writePageFooter(out);
		
		out.close();
	}
	
}
