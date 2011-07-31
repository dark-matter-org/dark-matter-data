package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

public class FormBindingFormatter {

	static public void formatFormBinding(String outdir, FormBindingDefinition binding) throws IOException {
		String genPackage = binding.getDefinedInModule().getGenPackage();
		
		String 			name 	= GenUtility.capTheName(binding.getBindingName().getNameString());
        BufferedWriter 	out 	= FileUpdateManager.instance().getWriter(outdir, name + ".java");
        ImportManager	imports = new ImportManager();

        imports.addImport("org.dmd.dmc.presentation.DmcPresentationTrackerIF", "Presentation tracker");
        for(EditField field: binding.getEditFieldIterable()){
        	imports.addImport(field.getAttrDef().getAdapterClassImport(), "Adapter for " + field.getAttribute());
        	imports.addImport(field.getEditorDef().getUseClass(), "Editor");
        	
        	imports.addImport(field.getAttrDef().getDefinedIn().getDMSASGImport(),"Required schema");
        }
        
        ClassDefinition cd = (ClassDefinition) binding.getEditObject();
        
        imports.addImport(cd.getDefinedIn().getSchemaPackage() + ".generated.dmo." + cd.getName() + "DMO", "For the object we're editting");
        
        out.write("package " + genPackage + ".generated.mvw.forms;\n\n");
        
        out.write(imports.getFormattedImports() + "\n");
        
        out.write("// " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + name + " {\n\n");
        
        out.write("    " + cd.getName() + "DMO dmo;\n\n");
        
        out.write("    DmcPresentationTrackerIF	tracker;\n\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getDeclaration(field));
        }
        
        out.write("\n");
        out.write("    public " + name + "(){\n");
        out.write("\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getInstantiation(field));
        }
        
        out.write("    }\n");
        
        
        ///////////////////////////////////////////////////////////////////////
        out.write("    public void setObject(" + cd.getName() + "DMO obj){\n");
        out.write("        dmo = obj;\n\n");
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetAdapter(field));
        }
        
        out.write("    }\n\n");

        ///////////////////////////////////////////////////////////////////////
        out.write("    public void setTracker(DmcPresentationTrackerIF t){\n");
        out.write("        tracker = t;\n");
        out.write("\n");
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetTracker(field));
//        	out.write("        tracker.track(" + field.getAttribute() + ");\n");
        }
        
        out.write("    }\n\n");

        ///////////////////////////////////////////////////////////////////////
        out.write("    public " + cd.getName() + "DMO getModRec(){\n");
        out.write("        " + cd.getName() + "DMO modrec = dmo.getModificationRecorder();\n");
        out.write("\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getAddMods(field));
//        	out.write("        " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
        }
        out.write("\n");
        out.write("        return(modrec);\n");
        out.write("    }\n\n");
        
        
        ///////////////////////////////////////////////////////////////////////
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getAccessMethod(field));
//        	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
//        	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
//        	String capped = GenUtility.capTheName(field.getAttribute());
//        	
//        	out.write("    public " + editor + " get" + capped + "(){\n");
//        	out.write("        return(" + field.getAttribute() + ");\n");
//        	out.write("    }\n");
//        	out.write("\n");
        }
   
        out.write("}\n\n");
        
        out.close();
	}
	
	static String getAccessMethod(EditField field){
		StringBuffer sb = new StringBuffer();
    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
    	String capped = GenUtility.capTheName(field.getAttribute());
		
		if (field.getAttrDef().getIndexSize() != null){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("    public " + editor + " get" + capped + i + "(){\n");
				sb.append("        return(" + field.getAttribute() + i + ");\n");
				sb.append("    }\n");
				sb.append("\n");
			}
		}
		else{
			sb.append("    public " + editor + " get" + capped + "(){\n");
			sb.append("        return(" + field.getAttribute() + ");\n");
			sb.append("    }\n");
			sb.append("\n");
		}

		return(sb.toString());
	}
	
	static String getAddMods(EditField field){
		StringBuffer sb = new StringBuffer();
		
		if (field.getAttrDef().getIndexSize() != null){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + "Adapter" + i + ".addMods(modrec.getModifier());\n");
			}
		}
		else{
			sb.append("        " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
		}

		return(sb.toString());
	}
	
	static String getSetTracker(EditField field){
		StringBuffer sb = new StringBuffer();
		
		if (field.getAttrDef().getIndexSize() != null){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        tracker.track(" + field.getAttribute() + i + ");\n");
			}
		}
		else{
			sb.append("        tracker.track(" + field.getAttribute() + ");\n");
		}

		return(sb.toString());
	}
	
	static String getSetAdapter(EditField field){
		StringBuffer sb = new StringBuffer();
    	String attr = field.getAttrDef().getDefinedIn().getDMSASGName() + ".__" + field.getAttribute();
		
		if (field.getAttrDef().getIndexSize() != null){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + "Adapter" + i + ".setExisting(dmo.get(" + attr + "));\n");
				sb.append("        " + field.getAttribute() + i + ".setAdapter(" + field.getAttribute() + "Adapter" + i + ");\n");
				sb.append("\n");
			}
		}
		else{
			sb.append("        " + field.getAttribute() + "Adapter.setExisting(dmo.get(" + attr + "));\n");
			sb.append("        " + field.getAttribute() + ".setAdapter(" + field.getAttribute() + "Adapter);\n");
			sb.append("\n");
		}

		return(sb.toString());
	}
	
	static String getDeclaration(EditField field){
		StringBuffer sb = new StringBuffer();
    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
		
		if (field.getAttrDef().getIndexSize() != null){
			// This is indexed, so we actually create a separate editor for each index
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
		    	sb.append("    " + editor + " " + field.getAttribute() + i + ";\n");
		    	sb.append("    " + field.getAttrDef().getAdapterClassName() + " " + field.getAttribute() + "Adapter" + i + ";\n\n");				
			}
		}
		else{
	    	sb.append("    " + editor + " " + field.getAttribute() + ";\n");
	    	sb.append("    " + field.getAttrDef().getAdapterClassName() + " " + field.getAttribute() + "Adapter;\n\n");
		}

		return(sb.toString());
	}
	
	static String getInstantiation(EditField field){
		StringBuffer sb = new StringBuffer();
		
    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
    	
		if (field.getAttrDef().getIndexSize() != null){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + i + " = new " + editor + "();\n");
				sb.append("        " + field.getAttribute() + i + ".setValueIndex(" + i + ");\n");
				
				sb.append("        " + field.getAttribute() + i + ".setLabel(\"" + field.getLabel() + "\");\n");
		    	
		    	if (field.isMandatory())
		    		sb.append("        " + field.getAttribute() + i + ".setMandatory(true);\n");
		    	
		    	if (field.isReadOnly())
		    		sb.append("        " + field.getAttribute() + i + ".setReadOnly(true);\n");
		    	
		    	if (field.getTip() != null)
		    		sb.append("        " + field.getAttribute() + i + ".setToolTip(\"" + field.getTip() + "\");\n");
		    	
		    	String attr = field.getAttrDef().getDefinedIn().getDMSASGName() + ".__" + field.getAttribute();
		    	sb.append("        " + field.getAttribute() + "Adapter" + i + " = new " + field.getAttrDef().getAdapterClassName() + "(" + attr + ");\n");
		    	sb.append("        " + field.getAttribute() + i + ".setAdapter(" + field.getAttribute() + "Adapter" + i + ");\n");
		    	sb.append("\n");
			}
		}
		else{
			sb.append("        " + field.getAttribute() + " = new " + editor + "();\n");
			sb.append("        " + field.getAttribute() + ".setLabel(\"" + field.getLabel() + "\");\n");
	    	
	    	if (field.isMandatory())
	    		sb.append("        " + field.getAttribute() + ".setMandatory(true);\n");
	    	
	    	if (field.isReadOnly())
	    		sb.append("        " + field.getAttribute() + ".setReadOnly(true);\n");
	    	
	    	if (field.getTip() != null)
	    		sb.append("        " + field.getAttribute() + ".setToolTip(\"" + field.getTip() + "\");\n");
	    	
	    	String attr = field.getAttrDef().getDefinedIn().getDMSASGName() + ".__" + field.getAttribute();
	    	sb.append("        " + field.getAttribute() + "Adapter = new " + field.getAttrDef().getAdapterClassName() + "(" + attr + ");\n");
	    	sb.append("        " + field.getAttribute() + ".setAdapter(" + field.getAttribute() + "Adapter);\n");
	    	sb.append("\n");
		}

    	return(sb.toString());
	}
}
