package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.ClassDefinition;
import org.dmd.templates.server.generated.dmw.TdlModuleDMW;
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class TdlModule extends TdlModuleDMW {

    public TdlModule(){
        super();
    }

    public TdlModule(TdlModuleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    public void generateExtensionInterface(String outdir) throws IOException {
    	if (getExtensionHookCount() == 0)
    		return;
    	
		ImportManager imports = new ImportManager();

		imports.addImport("java.util.ArrayList", "To hold formatted extensions");

		Iterator<ExtensionHook>	hooks = getAllExtensionHook();
		while(hooks.hasNext()){
			ExtensionHook hook = hooks.next();
			imports.addImport(hook.getUsesSection().getClassImport(), "Used by ExtensionHook - " + hook.getName());
			imports.addImport(hook.getTargetObjectClass(), "The object formatted by ExtensionHook - " + hook.getName());
		}
		
		String cn = Manipulator.capFirstChar(getName().getNameString() + "ExtensionHookIF");
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cn + ".java");

		out.write("package " + getPackage() + ".generated.dmtdl;\n\n");

		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public interface " + cn + " {\n\n");
		
		hooks = getAllExtensionHook();
		while(hooks.hasNext()){
			ExtensionHook hook = hooks.next();
			int lastDot = hook.getTargetObjectClass().lastIndexOf(".");
			String toc = hook.getTargetObjectClass().substring(lastDot+1);
			String hn = Manipulator.capFirstChar(hook.getName().getNameString());
			
			out.write("    /**\n");
			out.write("     * Create any other required " + hook.getUsesSection().getName() + " entries based on the " + toc + " object.\n");
			out.write("     * @param target the object currently being formatted.\n");
			out.write("     * @return null or a set of " + hook.getUsesSection().getName() + " Sections to be inserted in the artifact.\n");
			out.write("     */\n");
			out.write("    public ArrayList<" + hook.getUsesSection().getName() + "> perform" + hn + "(" + toc + " target);\n");
			out.write("\n");
		}
		
		out.write("\n");
		out.write("}\n\n");
		
		out.close();
    }
        
    public void generateTemplateLoader(String outdir) throws IOException {
		ImportManager imports = new ImportManager();
		MemberManager members = new MemberManager();
    	
		imports.addImport("java.util.TreeMap", "To store SectionInfo");
		imports.addImport("java.util.ArrayList", "To store file search paths");
		imports.addImport("java.io.IOException", "May occur when finding/reading the templates");
		imports.addImport("org.dmd.dms.SchemaManager", "Manages the schemas we use");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFParser", "Basic parsing of objects");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFHandlerIF", "Basic parsing of objects");
		imports.addImport("org.dmd.dmc.util.DmcUncheckedObject", "Basic parsing of objects");
		imports.addImport("org.dmd.dmw.DmwObjectFactory", "Constructs wrapped objects");
		imports.addImport("org.dmd.dmc.DmcValueException", "May be thrown when parsing objects");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "May be thrown when instantiating objects");
		imports.addImport("org.dmd.util.exceptions.ResultException", "May be thrown by schema management");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "May be thrown by rule manager");
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "The injected rule manager used for initializations");
		imports.addImport("org.dmd.dmc.rules.SourceInfo", "To indicate the source of rule problems");
		imports.addImport("org.dmd.dmw.DmwWrapper", "To handle factory created objects");
		imports.addImport("org.dmd.templates.server.extended.Template", "The Template");
		imports.addImport("org.dmd.templates.server.generated.DmtdlSchemaAG", "The dmtdl schema");
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Finds configs we may need to parse");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Handle to a discovered configuration");
		imports.addImport("org.dmd.util.parsing.ConfigVersion", "Handle to a particular config version");
		imports.addImport("org.dmd.dms.AttributeDefinition", "To allow addition of preserve newline attributes");
		imports.addImport("org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW", "To allow addition of preserve newline attributes");
		imports.addImport("org.dmd.templates.server.util.TemplateMediator", "Allows us to access loaded templates");

		members.addMember("SchemaManager",                		"schema", "Manages the schema for this DSD");
		members.addMember("DmcUncheckedOIFParser",       		"parser", "new DmcUncheckedOIFParser(this)", "Parses objects from the config file");
		members.addMember("DmwObjectFactory",             		"factory", "Instantiates wrapped objects");
		members.addMember("DmvRuleManager", 					"rules", "new DmvRuleManager()", "Rule manager");
		members.addMember("ConfigFinder", 						"finder", "new ConfigFinder(\"." + getTemplateFileSuffix() + "\")", "Config finder for template files ending with ." + getTemplateFileSuffix());
		members.addMember("ConfigLocation",						"location", "The location of the config being parsed");
		members.addMember("TreeMap<String,TemplateMediator>",	"mediators", "new TreeMap<String,TemplateMediator>()", "The mediators by name");
		members.addSpacer();
		
		Iterator<Section>	sections = getAllSection();
		while(sections.hasNext()){
			Section section = sections.next();
			members.addMember("public static TemplateMediator",		section.getName().getNameString(), "new TemplateMediator(\"" + section.getName() + "\")", "Mediator for the " + section.getName() + " template");
		}
		
		if (getCommentFormat() != null){
			members.addSpacer();
			members.addMember("public static Template",                	"_Comment", "Used to display debug comments in formatted output");
		}
		
		if (getExtensionHookCount() > 0){
			String extName = Manipulator.capFirstChar(getName().getNameString() + "ExtensionHookIF");
			members.addSpacer();
			members.addMember("public static ArrayList<" + extName + ">", "_extensionHooks", "new ArrayList<" + extName + ">()", "Used to access extension hook objects");
		}
		
		String cn = Manipulator.capFirstChar(getName().getNameString() + "TemplateLoader");
		
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cn + ".java");

		out.write("package " + getPackage() + ".generated.dmtdl;\n\n");

		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + cn + " implements DmcUncheckedOIFHandlerIF {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
        
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * Creates a new template loader for templates associated with the " + getName() + " TdlModule.\n");
		out.write("     * @param paths the paths that we'll search for the template definition file.\n");
		out.write("     * @param jars the prefixes of jars on the classpath that we'll search for configs\n");
		out.write("     */\n");
		out.write("    public " + cn + "(ArrayList<String> paths, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException {\n");
		out.write("        schema = new SchemaManager();\n");
		out.write("        DmtdlSchemaAG sd = new DmtdlSchemaAG();\n");	
		out.write("        schema.manageSchema(sd);\n");
		out.write("        // Templates can be used to generate OIF files as well and we don't want the leading spaces on lines\n");
		out.write("        parser.dropLineContinuations();\n");
		out.write("        if (sd.getAttributeDefListSize() > 0){\n");
		out.write("            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();\n");
		out.write("            while(attrs.hasNext()){\n");
		out.write("                AttributeDefinition ad = attrs.getNext();\n");
		out.write("                if (ad.getPreserveNewlines()){\n");
		out.write("                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());\n");
		out.write("                }\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        finder.setSourceAndJarInfo(paths, jars);\n\n");
		
		sections = getAllSection();
		while(sections.hasNext()){
			Section section = sections.next();
			out.write("        mediators.put(\"" + section.getName() + "\"," + section.getName() + ");\n");
		}
		
		out.write("        \n");
		out.write("        factory      = new DmwObjectFactory(schema);\n");
		out.write("        \n");
		
		if (getCommentFormat() != null){
			out.write("        _Comment = new Template();\n");
			out.write("        _Comment.setFile(\"" + cn + "\");\n");
			out.write("        _Comment.setLineNumber(1);\n");
			out.write("        _Comment.setFormat(\"\\n" + getCommentFormat() + "\");\n");
			out.write("        _Comment.initialize(\"::\");\n");
			out.write("        \n");
		}
		
		out.write("    }\n\n");
		
		
		String fn = getTemplateFile() + "." + getTemplateFileSuffix();
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * We attempt to find and load the " + fn + " file.\n");
		out.write("     */\n");
		out.write("    public void findAndLoadTemplate() throws ResultException, IOException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        for(TemplateMediator tm: mediators.values()){\n");
		out.write("            tm.reset();\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        finder.findConfigs();\n");
		out.write("        ConfigVersion version = finder.getConfig(\""+ getTemplateFile() + "\");\n");
		out.write("        if (version == null){\n");
		out.write("            ResultException ex = new ResultException(\"Could not find template definition file: " + fn + "\");\n");
		out.write("            ex.moreMessages(finder.getSearchInfo());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        location = version.getLatestVersion();\n");
		out.write("\n");
		out.write("        // How we read the file will depend on whether or not it's in a JAR\n");
		out.write("        parser.parseFile(location.getFileName(),location.isFromJAR());\n");
		out.write("    }\n\n");
		
		if (getExtensionHookCount() > 0){
			String extName = Manipulator.capFirstChar(getName().getNameString() + "ExtensionHookIF");
			
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    /**\n");
			out.write("     * We attempt to load the classes that provide extension hooks.\n");
			out.write("     */\n");
			out.write("    public void loadExtensionHooks(ArrayList<String> hooks) throws ResultException {\n");
			out.write("        Class<?> hookClass = null;\n");
			out.write("        " + extName + " hook	= null;\n");
			out.write("\n");
			out.write("        for(String hc: hooks){\n");
			out.write("		       try {\n");
			out.write("                hookClass = Class.forName(hc);\n");
			out.write("            } catch (ClassNotFoundException e) {\n");
			out.write("                ResultException ex = new ResultException(e);\n");
			out.write("                ex.addError(\"Couldn't load extension hook class: \" + hc);\n");
			out.write("                throw(ex);\n");
			out.write("            }\n");
			out.write("\n");
			out.write("            try {\n");
			out.write("                Object obj = hookClass.newInstance();\n");
			out.write("\n");
			out.write("                if (obj instanceof " + extName + "){\n");
			out.write("                    hook = (" + extName + ") obj;\n");
			out.write("                    _extensionHooks.add(hook);\n");
			out.write("                }\n");
			out.write("                else{\n");
			out.write("                    ResultException ex = new ResultException(\"The specified class does not implement the " + extName + " interface: \" + hc);\n");
			out.write("                    throw(ex);\n");
			out.write("                }\n");
			out.write("            } catch (Exception e) {\n");
			out.write("                ResultException ex = new ResultException(e);\n");
			out.write("                ex.addError(\"Couldn't instantiate " + extName + " class: \" + hc);\n");
			out.write("                throw(ex);\n");
			out.write("            }\n");
			out.write("        }\n");
			out.write("    }\n\n");
		}
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        Template template = null;\n");
		out.write("        DmwWrapper wrapper = null;\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            wrapper = factory.createWrapper(uco);\n");
		out.write("            template = (Template) wrapper;\n");
		out.write("        } catch (ClassNotFoundException e) {\n");
		out.write("            ResultException ex = new ResultException(\"Unknown object class: \" + uco.classes.get(0));\n");
		out.write("            ex.result.lastResult().fileName(infile);\n");
		out.write("            ex.result.lastResult().lineNumber(lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch (ResultException ex){\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(DmcValueException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(e.getMessage());\n");
		out.write("            if (e.getAttributeName() != null)\n");
		out.write("                ex.result.lastResult().moreMessages(\"Attribute: \" + e.getAttributeName());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(ClassCastException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(\"The following object is not valid in a ." + getTemplateFileSuffix() + " file:\\n\\n\" + wrapper.toOIF());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        template.setLineNumber(lineNumber);\n");
		out.write("        template.setFile(infile);\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            // Run the rules against the definition\n");
		out.write("            rules.executeInitializers(template.getDmcObject());\n");
		out.write("            rules.executeAttributeValidation(template.getDmcObject());\n");
		out.write("            rules.executeObjectValidation(template.getDmcObject());\n");
		out.write("        }\n");
		out.write("        catch(DmcRuleExceptionSet ex){\n");
		out.write("            ex.source(new SourceInfo(infile, lineNumber));\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        TemplateMediator tm = mediators.get(template.getName().getNameString());\n");
		out.write("        if (tm == null){\n");
		out.write("            ResultException ex = new ResultException(\"Template for an unknown Section: \" + template.getName());\n");
		out.write("            ex.moreMessages(\"The Template must use one of the following names:\");\n");
		out.write("            for (String n : mediators.keySet()){\n");
		out.write("                ex.moreMessages(n);\n");
		out.write("            }\n");
		out.write("            ex.setLocationInfo(template.getFile(), template.getLineNumber());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        if (tm.getTemplate() != null){\n");
		out.write("            ResultException ex = new ResultException(\"Duplicate Template for Section: \" + template.getName());\n");
		out.write("            ex.moreMessages(\"Previously defined at line: \" + tm.getTemplate().getLineNumber());\n");
		out.write("            ex.setLocationInfo(template.getFile(), template.getLineNumber());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        template.initialize(\"" + getInsertMarker() + "\");\n");
		out.write("        \n");
		out.write("        tm.setTemplate(template);\n");
		out.write("\n");
		out.write("    }\n");

		
		out.write("\n");
		out.write("}\n");

		out.close();
    }

}

