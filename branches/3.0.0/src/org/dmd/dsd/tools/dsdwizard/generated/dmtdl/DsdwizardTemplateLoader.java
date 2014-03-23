package org.dmd.dsd.tools.dsdwizard.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:139)
import java.io.IOException;                                              // May occur when finding/reading the templates - (TdlModule.java:84)
import java.util.ArrayList;                                              // To store file search paths - (TdlModule.java:83)
import java.util.TreeMap;                                                // To store SectionInfo - (TdlModule.java:82)
import org.dmd.dmc.DmcNameClashException;                                // May be thrown when instantiating objects - (TdlModule.java:91)
import org.dmd.dmc.DmcValueException;                                    // May be thrown when parsing objects - (TdlModule.java:90)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                            // May be thrown by rule manager - (TdlModule.java:93)
import org.dmd.dmc.rules.SourceInfo;                                     // To indicate the source of rule problems - (TdlModule.java:95)
import org.dmd.dmc.util.DmcUncheckedObject;                              // Basic parsing of objects - (TdlModule.java:88)
import org.dmd.dms.AttributeDefinition;                                  // To allow addition of preserve newline attributes - (TdlModule.java:102)
import org.dmd.dms.SchemaManager;                                        // Manages the schemas we use - (TdlModule.java:85)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;         // To allow addition of preserve newline attributes - (TdlModule.java:103)
import org.dmd.dmv.shared.DmvRuleManager;                                // The injected rule manager used for initializations - (TdlModule.java:94)
import org.dmd.dmw.DmwObjectFactory;                                     // Constructs wrapped objects - (TdlModule.java:89)
import org.dmd.dmw.DmwWrapper;                                           // To handle factory created objects - (TdlModule.java:96)
import org.dmd.templates.server.extended.Template;                       // The Template - (TdlModule.java:97)
import org.dmd.templates.server.generated.DmtdlSchemaAG;                 // The dmtdl schema - (TdlModule.java:98)
import org.dmd.templates.server.util.TemplateMediator;                   // Allows us to access loaded templates - (TdlModule.java:104)
import org.dmd.util.exceptions.ResultException;                          // May be thrown by schema management - (TdlModule.java:92)
import org.dmd.util.parsing.ConfigFinder;                                // Finds configs we may need to parse - (TdlModule.java:99)
import org.dmd.util.parsing.ConfigLocation;                              // Handle to a discovered configuration - (TdlModule.java:100)
import org.dmd.util.parsing.ConfigVersion;                               // Handle to a particular config version - (TdlModule.java:101)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                    // Basic parsing of objects - (TdlModule.java:87)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                       // Basic parsing of objects - (TdlModule.java:86)



// Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:142)
public class DsdwizardTemplateLoader implements DmcUncheckedOIFHandlerIF {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:145)
    SchemaManager                       schema;                                                  // Manages the schema for this DSD
    DmcUncheckedOIFParser               parser       = new DmcUncheckedOIFParser(this);          // Parses objects from the config file
    DmwObjectFactory                    factory;                                                 // Instantiates wrapped objects
    DmvRuleManager                      rules        = new DmvRuleManager();                     // Rule manager
    ConfigFinder                        finder       = new ConfigFinder("dmt");                  // Config finder for template files ending with .dmt
    ConfigLocation                      location;                                                // The location of the config being parsed
    TreeMap<String,TemplateMediator>    mediators    = new TreeMap<String,TemplateMediator>();   // The mediators by name
                                                                                                 // 
    public static TemplateMediator      DmtdlFile    = new TemplateMediator("DmtdlFile");        // Mediator for the DmtdlFile template
                                                                                                 // 
    public static Template              _Comment;                                                // Used to display debug comments in formatted output

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:147)
    /**
     * Creates a new template loader for templates associated with the dsdwizard TdlModule.
     * @param paths the paths that we'll search for the template definition file.
     */
    public DsdwizardTemplateLoader(ArrayList<String> paths) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DmtdlSchemaAG sd = new DmtdlSchemaAG();
        schema.manageSchema(sd);
        // Templates can be used to generate OIF files as well and we don't want the leading spaces on lines
        parser.dropLineContinuations();
        if (sd.getAttributeDefListSize() > 0){
            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();
            while(attrs.hasNext()){
                AttributeDefinition ad = attrs.getNext();
                if (ad.getPreserveNewlines()){
                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());
                }
            }
        }
        
        finder.setSourceInfo(paths);

        mediators.put("DmtdlFile",DmtdlFile);
        
        factory      = new DmwObjectFactory(schema);
        
        _Comment = new Template();
        _Comment.setFile("DsdwizardTemplateLoader");
        _Comment.setLineNumber(1);
        _Comment.setFormat("\n// ::comment::");
        _Comment.initialize("::");
        
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:193)
    /**
     * We attempt to find and load the dsdwizard.dmt file.
     */
    public void findAndLoadTemplate() throws ResultException, IOException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        for(TemplateMediator tm: mediators.values()){
            tm.reset();
        }
        
        finder.findConfigs();
        ConfigVersion version = finder.getConfig("dsdwizard");
        if (version == null){
            ResultException ex = new ResultException("Could not find template definition file: dsdwizard.dmt");
            ex.moreMessages(finder.getSearchInfo());
            throw(ex);
        }

        location = version.getLatestVersion();
        parser.parseFile(location.getFileName());
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:254)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        Template template = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            template = (Template) wrapper;
        } catch (ClassNotFoundException e) {
            ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
            ex.result.lastResult().fileName(infile);
            ex.result.lastResult().lineNumber(lineNumber);
            throw(ex);
        }
        catch (ResultException ex){
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(DmcValueException e){
            ResultException ex = new ResultException();
            ex.addError(e.getMessage());
            if (e.getAttributeName() != null)
                ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(ClassCastException e){
            ResultException ex = new ResultException();
            ex.addError("The following object is not valid in a .dmt file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        template.setLineNumber(lineNumber);
        template.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(template.getDmcObject());
            rules.executeAttributeValidation(template.getDmcObject());
            rules.executeObjectValidation(template.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        TemplateMediator tm = mediators.get(template.getName().getNameString());
        if (tm == null){
            ResultException ex = new ResultException("Template for an unknown Section: " + template.getName());
            ex.moreMessages("The Template must use one of the following names:");
            for (String n : mediators.keySet()){
                ex.moreMessages(n);
            }
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        if (tm.getTemplate() != null){
            ResultException ex = new ResultException("Duplicate Template for Section: " + template.getName());
            ex.moreMessages("Previously defined at line: " + tm.getTemplate().getLineNumber());
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        template.initialize("::");
        
        tm.setTemplate(template);

    }

}
