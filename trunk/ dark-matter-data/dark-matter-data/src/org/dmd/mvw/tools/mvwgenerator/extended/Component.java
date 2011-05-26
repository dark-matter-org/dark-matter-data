package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmp.shared.generated.dmo.DmpASAG;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;
import org.dmd.util.codegen.ImportManager;

public class Component extends ComponentDMW {

	protected boolean initialized;
	
	protected ImportManager	imports;
	
	StringBuffer	loadAttributeSchemas;
	
	public Component(){
		
	}
	
	protected Component(ComponentDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	@Override
	public Component getModificationRecorder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public String getAttributeSchemaLoaders(){
		return(loadAttributeSchemas.toString());
	}
	
	protected void initCodeGenInfo(){
		imports = new ImportManager();		
		
		if (getHandlesEventHasValue()){
			for(Event event: getHandlesEventIterable()){
				event.addImport(imports);
				event.handledBy(this);
			}
		}
		
		if (getFiresEventHasValue()){
			for(Event event: getFiresEventIterable()){
				event.addImport(imports);
				event.firedBy(this);
			}
		}
		
		if (getUseRunContextItemHasValue()){
			for(RunContextItem rci: getUseRunContextItemIterable()){
				rci.addUsageImplImports(imports);
			}
		}
		
		loadAttributeSchemas = new StringBuffer();
		if (getUseSchemaHasValue()){
			imports.addImport("org.dmd.dmc.DmcOmni", "Support for schema loading");
			for(SchemaDefinition sd: getUseSchemaIterable()){
				String capped = GenUtility.capTheName(sd.getName().getNameString());
				loadAttributeSchemas.append("        DmcOmni.instance().addAttributeSchema(" + capped + "ASAG.instance());\n");
				imports.addImport(sd.getSchemaPackage() + ".generated.dmo." + capped + "ASAG", "Attribute schema");
			}
		}
	}

}
