package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:738)
import org.dmd.dmc.DmcNameClashException;                                        // May be thrown when instantiating objects - (DSDArtifactFormatter.java:706)
import org.dmd.dmc.DmcValueException;                                            // May be thrown when parsing objects - (DSDArtifactFormatter.java:705)
import org.dmd.dmc.definitions.DsdParserInterface;                               // Standard parser interface - (DSDArtifactFormatter.java:689)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                    // May be thrown by rule manager - (DSDArtifactFormatter.java:708)
import org.dmd.dmc.rules.SourceInfo;                                             // To indicate the source of rule problems - (DSDArtifactFormatter.java:711)
import org.dmd.dmc.util.DmcUncheckedObject;                                      // Basic parsing of objects - (DSDArtifactFormatter.java:688)
import org.dmd.dms.AttributeDefinition;                                          // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:732)
import org.dmd.dms.MetaSchema;                                                   // So that we can preserve newlines - (DSDArtifactFormatter.java:713)
import org.dmd.dms.SchemaManager;                                                // Manages the schemas we use - (DSDArtifactFormatter.java:684)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                 // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:733)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // To iterate over defFiles - (DSDArtifactFormatter.java:710)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;                        // The base definition from the ModuleC Module - (DSDArtifactFormatter.java:1057)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                           // A definition from the ModuleC Module - (DSDArtifactFormatter.java:1065)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:719)
import org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG;                       // The schema recognized by this parser - (DSDArtifactFormatter.java:704)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:692)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;                      // To allow loading of rules from the dsdC schema - (DSDArtifactFormatter.java:715)
import org.dmd.dmv.shared.DmvRuleManager;                                        // The injected rule manager used for initializations - (DSDArtifactFormatter.java:709)
import org.dmd.dmw.DmwObjectFactory;                                             // Constructs wrapped objects - (DSDArtifactFormatter.java:691)
import org.dmd.dmw.DmwWrapper;                                                   // To handle factory created objects - (DSDArtifactFormatter.java:712)
import org.dmd.util.exceptions.ResultException;                                  // May be thrown by schema management - (DSDArtifactFormatter.java:707)
import org.dmd.util.parsing.ConfigLocation;                                      // Config file location info - (DSDArtifactFormatter.java:690)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                            // Basic parsing of objects - (DSDArtifactFormatter.java:687)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                               // Basic parsing of objects - (DSDArtifactFormatter.java:686)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:741)
public class ModuleCParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "tmc";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:755)
    SchemaManager             schema;                                             // Manages the schema for this DSD
    DmcUncheckedOIFParser     parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory          factory;                                            // Instantiates wrapped objects
    ModuleCGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager            rules;                                              // The overall rule manager
    ConfigLocation            location;                                           // The location of the config being parsed
    ModuleC                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:758)
    public ModuleCParser(ModuleCGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DsdCSchemaAG sd = new DsdCSchemaAG();
        schema.manageSchema(sd.getInstance());
        if (sd.getAttributeDefListSize() > 0){
            preserveNewLines(sd.getAttributeDefList());
        }
        preserveNewLines(MetaSchema._metaSchema.getAttributeDefList());
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
        rules.loadRules(DsdCDMSAG.instance());
    }

    public SchemaManager schema(){
        return(schema);
    }

    void preserveNewLines(AttributeDefinitionIterableDMW attrs){
        while(attrs.hasNext()){
            AttributeDefinition ad = attrs.getNext();
            if (ad.getPreserveNewlines()){
                parser.addPreserveNewlinesAttribute(ad.getName().getNameString());
            }
        }
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:792)
    public ModuleC parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        location = l;

        // We're starting to parse a new config. Reset the module to null so that we only parse one module per config.
        module = null;

        if (location.isFromJAR()){
            System.out.println("Reading: " + location.getFileName() + " - from " + location.getJarFilename());
            parser.parseFile(location.getFileName(),true);
        }
        else{
            System.out.println("Reading: " + location.getFileName());
            parser.parseFile(location.getFileName());
        }

        if (module.getDefFilesHasValue()){
            StringIterableDMW it = module.getDefFilesIterable();
            while(it.hasNext()){
                String fn = location.getDirectory() + "/" + it.next();

                if (location.isFromJAR())
                    parser.parseFile(fn,true);
                else
                    parser.parseFile(fn);
            }
        }

        return(module);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:825)
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        CConceptBase definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (CConceptBase) wrapper;
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
            ex.addError("All classes in your DSL must ultimately be derived from: CConceptBase");
            ex.addError("The following object is not valid in a .tmc file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        definition.setLineNumber(lineNumber);
        definition.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(definition.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        // The first definition we expect is the module definition
        if (module == null){
            if (definition instanceof ModuleC){
                module = (ModuleC)definition;
            
                // Note: we use the / character directly since the DmcUncheckedOIFParser replaces the \ characters on windows
                int lastSep = infile.lastIndexOf("/");
                int period = infile.lastIndexOf('.');
                String fn = infile.substring(lastSep+1, period);
                if (module.getName() == null){
                    ResultException ex = new ResultException("Missing name attribute for module definition");
                    ex.setLocationInfo(infile, lineNumber);
                    throw(ex);
                }
                else if (!module.getName().getNameString().equals(fn)){
                    ResultException ex = new ResultException("Module name: " + module.getName().getNameString() + " - must match file name: " + fn);
                    ex.setLocationInfo(infile, lineNumber);
                    throw(ex);
                }
            
                definition.setDotName(module.getName() + "." + module.getName() + "." + definition.getConstructionClassName());
            
                module.setDefinedInModuleC(module);
                definitions.addModuleC(module);
            }
            else{
                ResultException ex = new ResultException("Expecting a ModuleC module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:915)
            if (definition instanceof ModuleC){
                ResultException ex = new ResultException("Multiple ModuleC definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInModuleC(module);
            definition.setDmoFromModule(module.getName().getNameString());
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:928)
            try{
                // Run object level rules to ensure mandatory attributes are in place - can't add definition if no name attribute!
                rules.executeObjectValidation(definition.getDmcObject());
            }
            catch(DmcRuleExceptionSet ex){
                ex.source(new SourceInfo(infile, lineNumber));
                throw(ex);
            }
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:939)
            
            if (definition instanceof CConceptX){
                definitions.addCConceptX((CConceptX)definition);
                module.addCConceptX((CConceptX)definition);
            }

        }

        try{
            // Run the rules against the definition
            rules.executeAttributeValidation(definition.getDmcObject());
            rules.executeObjectValidation(definition.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

    }
}

