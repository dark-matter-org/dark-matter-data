package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                     // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.ExtensionHookDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.shared.generated.dmo.ExtensionHookDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class ExtensionHook extends ExtensionHookDMW {

    public ExtensionHook(){
        super();
    }

    public ExtensionHook(ExtensionHookDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    /**
     * Inserts the xx indicator, the name of the extension hook and then hint for
     * the section that it uses.
     * @param indent
     * @param hint
     */
    public void getFormatHint(String indent, StringBuffer hint){
		hint.append("     * " + indent);

		hint.append("xx " + getName() + "\n");
		
		getUsesSection().getFormatHint(CardinalityEnum.MANY, indent + "  ", hint);
    }
    
    public void getSectionImportsAndMembers(ImportManager imports, MemberManager members){
		imports.addImport(getTargetObjectClass(), "The object formatted by ExtensionHook - " + getName());

		members.addMember("ArrayList<" + getUsesSection().getName().getNameString() + ">",
				"_" + getUsesSection().getName() + "_" + getName(),
				"new ArrayList<" + getUsesSection().getName().getNameString() + ">()",
				"Multiple instances of " + getUsesSection().getName() + " for extension hook " + getName()); 	
    }
    
    public String getExtensionFunction(){
    	StringBuffer sb = new StringBuffer();
    	String loader = Manipulator.capFirstChar(getDefinedInTdlModule().getName().getNameString()) + "TemplateLoader";
    	String hookInterface = Manipulator.capFirstChar(getDefinedInTdlModule().getName().getNameString()) + "ExtensionHookIF";
    	String capped = Manipulator.capFirstChar(getName().getNameString());
    	int lastDot = getTargetObjectClass().lastIndexOf(".");
    	
    	if ( (lastDot == -1) || ((lastDot + 1) == getTargetObjectClass().length())){
    		throw(new IllegalStateException("The targetObjectClass for ExtensionHook: " + getName() + " is malformed - " + getFile() + ":" + getLineNumber()));
    	}
    	String cn = getTargetObjectClass().substring(lastDot+1);
		String hn = Manipulator.capFirstChar(getName().getNameString());
		String storage = "_" + getUsesSection().getName() + "_" + getName();
    	
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void extension" + capped + "(" + cn + " target){\n");
		sb.append("        for(" + hookInterface + " hook: " + loader + "._extensionHooks){\n");
		sb.append("            ArrayList<" + getUsesSection().getName() + "> ext = hook.perform" + hn + "(target);\n");
		sb.append("            if (ext != null){\n");
		sb.append("                for(" + getUsesSection().getName() + " entry: ext){\n");
		sb.append("                    " + storage + ".add(entry);\n");
		sb.append("                }\n");
		sb.append("            }\n");
		sb.append("        }\n");
		sb.append("    }\n");
    	
    	
    	return(sb.toString());
    }
    
    public String getFormatFunction(){
    	StringBuffer sb = new StringBuffer();
    	
		sb.append("\n");
		sb.append("        for(" + getUsesSection().getName() + " entry: _" + getUsesSection().getName() + "_" + getName() + "){\n");
		sb.append("            entry.format(artifact);\n");
		sb.append("        }\n");
    	
    	return(sb.toString());
    }
}

