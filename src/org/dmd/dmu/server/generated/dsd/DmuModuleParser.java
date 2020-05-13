package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:727)
import java.util.Iterator;                                                // To iterate over collections - (DSDArtifactFormatter.java:684)
import org.dmd.dmc.DmcNameClashException;                                 // May be thrown when instantiating objects - (DSDArtifactFormatter.java:695)
import org.dmd.dmc.DmcValueException;                                     // May be thrown when parsing objects - (DSDArtifactFormatter.java:694)
import org.dmd.dmc.definitions.DsdParserInterface;                        // Standard parser interface - (DSDArtifactFormatter.java:678)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                             // May be thrown by rule manager - (DSDArtifactFormatter.java:697)
import org.dmd.dmc.rules.SourceInfo;                                      // To indicate the source of rule problems - (DSDArtifactFormatter.java:700)
import org.dmd.dmc.util.DmcUncheckedObject;                               // Basic parsing of objects - (DSDArtifactFormatter.java:677)
import org.dmd.dms.AttributeDefinition;                                   // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:721)
import org.dmd.dms.MetaSchema;                                            // So that we can preserve newlines - (DSDArtifactFormatter.java:702)
import org.dmd.dms.SchemaDefinition;                                      // To support dynamic loading of schemas - (DSDArtifactFormatter.java:685)
import org.dmd.dms.SchemaManager;                                         // Manages the schemas we use - (DSDArtifactFormatter.java:673)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;          // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:722)
import org.dmd.dms.generated.dmw.StringIterableDMW;                       // To iterate over defFiles - (DSDArtifactFormatter.java:699)
import org.dmd.dms.generated.types.SchemaAndReason;                       // To allow dynamic schema loading - (DSDArtifactFormatter.java:724)
import org.dmd.dmu.server.extended.DmuDefinition;                         // The base definition from the DmuModule Module - (DSDArtifactFormatter.java:1046)
import org.dmd.dmu.server.extended.DmuModule;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:708)
import org.dmd.dmu.server.extended.json.PayloadExample;                   // A definition from the DmuModule Module - (DSDArtifactFormatter.java:1054)
import org.dmd.dmu.server.extended.json.PayloadSortInfo;                  // A definition from the DmuModule Module - (DSDArtifactFormatter.java:1054)
import org.dmd.dmu.server.generated.DmuSchemaAG;                          // The schema recognized by this parser - (DSDArtifactFormatter.java:693)
import org.dmd.dmu.server.generated.dsd.DmuModuleGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:681)
import org.dmd.dmu.shared.generated.dmo.DmuDMSAG;                         // To allow loading of rules from the dmu schema - (DSDArtifactFormatter.java:704)
import org.dmd.dmv.shared.DmvRuleManager;                                 // The injected rule manager used for initializations - (DSDArtifactFormatter.java:698)
import org.dmd.dmw.DmwObjectFactory;                                      // Constructs wrapped objects - (DSDArtifactFormatter.java:680)
import org.dmd.dmw.DmwWrapper;                                            // To handle factory created objects - (DSDArtifactFormatter.java:701)
import org.dmd.util.exceptions.ResultException;                           // May be thrown by schema management - (DSDArtifactFormatter.java:696)
import org.dmd.util.parsing.ConfigLocation;                               // Config file location info - (DSDArtifactFormatter.java:679)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                     // Basic parsing of objects - (DSDArtifactFormatter.java:676)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                        // Basic parsing of objects - (DSDArtifactFormatter.java:675)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:730)
public class DmuModuleParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "dmu";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:744)
    SchemaManager               schema;                                             // Manages the schema for this DSD
    DmcUncheckedOIFParser       parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory            factory;                                            // Instantiates wrapped objects
    DmuModuleGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager              rules;                                              // The overall rule manager
    ConfigLocation              location;                                           // The location of the config being parsed
    DmuModule                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:747)
    public DmuModuleParser(DmuModuleGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DmuSchemaAG sd = new DmuSchemaAG();
        schema.manageSchema(sd.getInstance());
        if (sd.getAttributeDefListSize() > 0){
            preserveNewLines(sd.getAttributeDefList());
        }
        preserveNewLines(MetaSchema._metaSchema.getAttributeDefList());
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
        rules.loadRules(DmuDMSAG.instance());
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:781)
    public DmuModule parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:814)
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        DmuDefinition definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (DmuDefinition) wrapper;
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
            ex.addError("All classes in your DSL must ultimately be derived from: DmuDefinition");
            ex.addError("The following object is not valid in a .dmu file:\n\n" + wrapper.toOIF());
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
            if (definition instanceof DmuModule){
                module = (DmuModule)definition;
            
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
            
                module.setDefinedInDmuModule(module);
                definitions.addDmuModule(module);
                if (module.getLoadSchemaClassHasValue()){
                    loadSchemas(module);
                }
            }
            else{
                ResultException ex = new ResultException("Expecting a DmuModule module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:904)
            if (definition instanceof DmuModule){
                ResultException ex = new ResultException("Multiple DmuModule definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInDmuModule(module);
            definition.setDmoFromModule(module.getName().getNameString());
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:917)
            try{
                // Run object level rules to ensure mandatory attributes are in place - can't add definition if no name attribute!
                rules.executeObjectValidation(definition.getDmcObject());
            }
            catch(DmcRuleExceptionSet ex){
                ex.source(new SourceInfo(infile, lineNumber));
                throw(ex);
            }
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:928)
            
            if (definition instanceof PayloadExample){
                definitions.addPayloadExample((PayloadExample)definition);
                module.addPayloadExample((PayloadExample)definition);
            }
            else if (definition instanceof PayloadSortInfo){
                definitions.addPayloadSortInfo((PayloadSortInfo)definition);
                module.addPayloadSortInfo((PayloadSortInfo)definition);
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
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.writeLoadSchemasFunction(DSDArtifactFormatter.java:974)
    void loadSchemas(DmuModule module) throws ResultException {
        Class<?> schemaClass = null;
        SchemaDefinition sd	= null;
        Iterator<SchemaAndReason> it = module.getDMO().getLoadSchemaClass();
        while(it.hasNext()){
		       SchemaAndReason sar = it.next();
		       String cn = sar.getSchema();
		       try {
			       schemaClass = Class.forName(cn);
            } catch (ClassNotFoundException e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't load schema class: " + cn);
                ex.setLocationInfo(module.getFile(), module.getLineNumber());
                throw(ex);
            }

            try {
                Object obj = schemaClass.newInstance();

                if (obj instanceof SchemaDefinition){
                    sd = (SchemaDefinition) obj;
                }
                else{
                    ResultException ex = new ResultException("The specified class is not a SchemaDefinition: " + cn);
                    ex.setLocationInfo(module.getFile(), module.getLineNumber());
                    throw(ex);
                }
            } catch (Exception e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't instantiate schema class: " + cn);
                ex.setLocationInfo(module.getFile(), module.getLineNumber());
                throw(ex);
            }

                try {
                    if (schema.isSchema(sd.getInstance().getName().getNameString()) == null){
                        schema.manageSchema(sd);
                        if (sd.getAttributeDefListSize() > 0){
                            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();
                            while(attrs.hasNext()){
                                AttributeDefinition ad = attrs.getNext();
                                if (ad.getPreserveNewlines()){
                                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());
                                }
                            }
                        }
                    }
                } catch (DmcValueException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (DmcNameClashException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

        }
    }
}

