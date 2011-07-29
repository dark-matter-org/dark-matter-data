package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;

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
        }
        
        ClassDefinition cd = (ClassDefinition) binding.getEditObject();
        
        imports.addImport(cd.getDefinedIn().getSchemaPackage() + ".generated.dmo." + cd.getName() + "DMO", "For the object we're editting");
        
        out.write("package " + genPackage + ".generated.mvw.forms;\n\n");
        
        out.write(imports.getFormattedImports() + "\n");
        
        out.write("public class " + name + " {\n\n");
        
        out.write("    " + cd.getName() + "DMO dmo;\n\n");
        
        out.write("    DmcPresentationTrackerIF	tracker;\n\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
        	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
        	out.write("    " + editor + " " + field.getAttribute() + ";\n");
        	out.write("    " + field.getAttrDef().getAdapterClassName() + " " + field.getAttribute() + "Adapter;\n\n");
        }
        
        out.write("\n");
        out.write("    public " + name + "(){\n");
        out.write("\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
        	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
        	
        	out.write("        " + field.getAttribute() + " = new " + editor + "();\n");
        	out.write("        " + field.getAttribute() + ".setLabel(\"" + field.getLabel() + "\");\n");
        	if (field.isMandatory())
            	out.write("        " + field.getAttribute() + ".setMandatory(true);\n");
        	out.write("\n");
        }
        
        out.write("\n");
        out.write("    }\n");

        out.write("}\n\n");
        
        out.close();
	}
	
	
}
