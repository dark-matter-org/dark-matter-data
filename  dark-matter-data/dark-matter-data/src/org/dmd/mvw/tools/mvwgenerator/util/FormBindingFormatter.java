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

/**
 * The FormBindingFormatter will format a form binding taht's appropriate for either a
 * named or an unnamed object. For named objects, there are two mechanisms associated with the binding:
 * getModRec() and getModifiedObject(). The getModRec() method is intended for use when you're
 * updating an existing named object - you get the set of modifications made in the form.
 * If, on the other hand, you are in the process of editting a new object (with its name or without),
 * you would call on getModifiedObject() to get the complete object with the changes made
 * in the form; this would then be sent in a CreateRequest.
 */
public class FormBindingFormatter {

	static public void formatFormBinding(String outdir, FormBindingDefinition binding) throws IOException {
		String genPackage = binding.getDefinedInModule().getGenPackage();
		
		String 			name 	= GenUtility.capTheName(binding.getBindingName().getNameString());
        BufferedWriter 	out 	= FileUpdateManager.instance().getWriter(outdir, name + ".java");
        ImportManager	imports = new ImportManager();

        imports.addImport("org.dmd.dmc.DmcNamedObjectIF", "Used when testing if an object named");
        imports.addImport("org.dmd.dmc.DmcValueException", "Required if we have modification errors");
        imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "Required if we have modification errors");
        imports.addImport("org.dmd.dms.generated.dmo.MetaDMSAG", "Required when edit object has no name");
        imports.addImport("org.dmd.dms.generated.types.DmcTypeModifierMV", "Required when edit object has no name");
        
//        if (binding.getEditObject().getIsNamedBy() == null){
//            imports.addImport("org.dmd.dmc.DmcValueException", "Required when edit object is unnamed");
//            imports.addImport("org.dmd.dms.generated.dmo.MetaDMSAG", "Required when edit object is unnamed");
//            imports.addImport("org.dmd.dms.generated.types.DmcTypeModifierMV", "Required when edit object is unnamed");
//        }
        
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
        
        out.write("    // If the object set on the binding doesn't have a name, it is considered a new object\n");
        out.write("    boolean isNewObject;\n\n");
        
        out.write("    DmcPresentationTrackerIF	tracker;\n\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getDeclaration(field));
        }
        
        out.write("\n");
        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + name + "(){\n");
        out.write("\n");
        
        out.write("        isNewObject = false;\n\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getInstantiation(field));
        }
        
        out.write("    }\n\n");
        
        
        ///////////////////////////////////////////////////////////////////////
        if (binding.getEditObject().getIsNamedBy() != null){
	        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("    public boolean isNewObject(){\n");
	        out.write("        return(isNewObject);\n");
	        out.write("    }\n\n");
        }
        
        ///////////////////////////////////////////////////////////////////////
        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public void setObject(" + cd.getName() + "DMO obj){\n");
        out.write("        dmo = obj;\n\n");
        
        if (binding.getEditObject().getIsNamedBy() != null){
	        out.write("        if (obj instanceof DmcNamedObjectIF){\n");
	        out.write("            if (((DmcNamedObjectIF)obj).getObjectName() == null)\n");
	        out.write("                isNewObject = true;\n");
	        out.write("        }\n");
        }

        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetDMO(field));
        }
        out.write("\n");
        
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetAdapter(field));
        }
        
        out.write("\n");
        out.write("        tracker.reset();\n");
        
        out.write("    }\n\n");

        ///////////////////////////////////////////////////////////////////////
        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public void setTracker(DmcPresentationTrackerIF t){\n");
        out.write("        tracker = t;\n");
        out.write("\n");
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetTracker(field));
        }
        
        out.write("    }\n\n");

        ///////////////////////////////////////////////////////////////////////
        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public void setEnabledAll(boolean enabled){\n");
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getSetEnabled(field));
        }
        
        out.write("    }\n\n");

        ///////////////////////////////////////////////////////////////////////
        if (binding.getEditObject().getIsNamedBy() == null){
	        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("    public " + cd.getName() + "DMO getModifiedObject(){\n");
	        out.write("        if (dmo == null)\n");
	        out.write("            return(null);\n\n");
	        
	        out.write("        " + cd.getName() + "DMO modrec = (" + cd.getName() + "DMO) dmo.getNew();\n");
	        out.write("        modrec.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));\n");
	        out.write("\n");
	        out.write("        if (dmo instanceof DmcNamedObjectIF){\n");
	        out.write("            DmcNamedObjectIF origObj	= (DmcNamedObjectIF) dmo;\n");
	        out.write("            try {\n");
	        out.write("                modrec.set(origObj.getObjectNameAttribute().getAttributeInfo(), origObj.getObjectNameAttribute());\n");
	        out.write("            } catch (DmcValueException e) {\n");
	        out.write("                e.printStackTrace();\n");
	        out.write("            }\n");
	        out.write("        }\n\n");

	        for(EditField field: binding.getEditFieldIterable()){
	        	out.write(getAddMods(field));//        	out.write("        " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
	        }
	        out.write("\n");
	        out.write("        " + cd.getName() + "DMO rc = (" + cd.getName() + "DMO) dmo.cloneIt();\n");
	        out.write("\n");
	        out.write("        try {\n");
	        out.write("            rc.applyModifier(modrec.getModifier());\n");
	        out.write("        } catch(Exception ex){\n");
	        out.write("            throw(new IllegalStateException(\"Shouldn't thrown an exception when modifying an object.\", ex));\n");
	        out.write("        }\n");
	        out.write("        \n");
	        
	        out.write("        return(rc);\n");
	        out.write("    }\n\n");
        }
        else{
	        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("    public " + cd.getName() + "DMO getModRec(){\n");
	        out.write("        if (dmo == null)\n");
	        out.write("            return(null);\n");
	        out.write("\n");
	        out.write("        if (isNewObject)\n");
	        out.write("            throw(new IllegalStateException(\"You are dealing with a new object, call getModifiedObject(), not getModRec()\"));\n");
	        out.write("\n");
	        out.write("        " + cd.getName() + "DMO modrec = dmo.getModificationRecorder();\n");
	        out.write("\n");
	        
	        for(EditField field: binding.getEditFieldIterable()){
	        	out.write(getAddMods(field));//        	out.write("        " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
	        }
	        out.write("\n");
	        out.write("        return(modrec);\n");
	        out.write("    }\n\n");
	        
	        ///////////////////////////////////////////////////////////////////
	        
	        out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("    public " + cd.getName() + "DMO getModifiedObject(){\n");
	        out.write("        if (dmo == null)\n");
	        out.write("            return(null);\n");
	        out.write("\n");
	        out.write("        " + cd.getName() + "DMO modrec = (" + cd.getName() + "DMO) dmo.getNew();\n");
	        out.write("        modrec.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));\n\n");
	        for(EditField field: binding.getEditFieldIterable()){
	        	out.write(getAddMods(field));//        	out.write("        " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
	        }
	        out.write("\n");
	        out.write("        " + cd.getName() + "DMO rc = (" + cd.getName() + "DMO) dmo.cloneIt();\n");
	        out.write("\n");
	        out.write("        try {\n");
	        out.write("            rc.applyModifier(modrec.getModifier());\n");
	        out.write("        } catch(DmcValueExceptionSet ex){\n");
	        out.write("            throw(new IllegalStateException(\"Your form should not permit invalid data\", ex));\n");
	        out.write("        } catch(DmcValueException ex){\n");
	        out.write("            throw(new IllegalStateException(\"Your form should not permit invalid data\", ex));\n");
	        out.write("        }\n");
	        out.write("        \n");
	        
	        out.write("        return(rc);\n");
	        out.write("    }\n\n");
	        
        }
        
        
        ///////////////////////////////////////////////////////////////////////
        for(EditField field: binding.getEditFieldIterable()){
        	out.write(getAccessMethod(field));
        }
   
        out.write("}\n\n");
        
        out.close();
	}
	
	static String getAccessMethod(EditField field){
		StringBuffer sb = new StringBuffer();
    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
    	String capped = GenUtility.capTheName(field.getAttribute());
		
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
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
		
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        if (" + field.getAttribute() + "Adapter" + i + ".valueChanged())\n");
				sb.append("            " + field.getAttribute() + "Adapter" + i + ".addMods(modrec.getModifier());\n");
			}
		}
		else{
			sb.append("        if (" + field.getAttribute() + "Adapter.valueChanged())\n");
			sb.append("            " + field.getAttribute() + "Adapter.addMods(modrec.getModifier());\n");
		}

		return(sb.toString());
	}
	
	static String getSetTracker(EditField field){
		StringBuffer sb = new StringBuffer();
		
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        tracker.track(" + field.getAttribute() + i + ");\n");
			}
		}
		else{
			sb.append("        tracker.track(" + field.getAttribute() + ");\n");
		}

		return(sb.toString());
	}
	
	static String getSetEnabled(EditField field){
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor())){
			StringBuffer sb = new StringBuffer();
			
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + i + ".setEnabled(enabled);\n");
			}
			
			return(sb.toString());
		}
		return("        " + field.getAttribute() + ".setEnabled(enabled);\n");
	}
	
	static String getSetAdapter(EditField field){
		StringBuffer sb = new StringBuffer();
    	String attr = field.getAttrDef().getDefinedIn().getDMSASGName() + ".__" + field.getAttribute();
		
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + "Adapter" + i + ".setEmpty();\n");
				sb.append("        if (dmo == null)\n");
				sb.append("            " + field.getAttribute() + "Adapter" + i + ".setExisting(null);\n");
				sb.append("        else\n");
				sb.append("            " + field.getAttribute() + "Adapter" + i + ".setExisting(dmo.get(" + attr + "));\n");
				sb.append("        " + field.getAttribute() + i + ".setAdapter(" + field.getAttribute() + "Adapter" + i + ");\n");
				sb.append("\n");
			}
		}
		else{
			sb.append("        " + field.getAttribute() + "Adapter.setEmpty();\n");
			sb.append("        if (dmo == null)\n");
			sb.append("            " + field.getAttribute() + "Adapter.setExisting(null);\n");
			sb.append("        else\n");
			sb.append("            " + field.getAttribute() + "Adapter.setExisting(dmo.get(" + attr + "));\n");
			sb.append("        " + field.getAttribute() + ".setAdapter(" + field.getAttribute() + "Adapter);\n");
			sb.append("\n");
		}

		return(sb.toString());
	}
	
	static String getDeclaration(EditField field){
		StringBuffer sb = new StringBuffer();
    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
		
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
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
    	
    	// If the attribute is indexed, we'll create an instance of the editor for each index,
    	// EXCEPT if the field editor has been flagged to be used as a single editor
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
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
	
	static String getSetDMO(EditField field){
		StringBuffer sb = new StringBuffer();
		
//    	int lastpos = field.getEditorDef().getUseClass().lastIndexOf(".");
//    	String editor = field.getEditorDef().getUseClass().substring(lastpos+1);
    	
		if ( (field.getAttrDef().getIndexSize() != null) && (!field.getEditorDef().isUseSingleEditor()) ){
			for(int i=0; i<field.getAttrDef().getIndexSize(); i++){
				sb.append("        " + field.getAttribute() + i + ".setDMO(dmo);\n");
			}
		}
		else{
			sb.append("        " + field.getAttribute() + ".setDMO(dmo);\n");
		}

    	return(sb.toString());
	}
}
