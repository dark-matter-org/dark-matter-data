package org.dmd.dms.server.generated.dsd;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:645)
import org.dmd.core.feedback.DMFeedbackSet;                                     // May be thrown when parsing objects - (MetaDSDHelper.java:618)
import org.dmd.core.feedback.DmcNameClashException;                             // May be thrown when instantiating objects - (MetaDSDHelper.java:619)
import org.dmd.core.feedback.SourceInfo;                                        // To indicate the source of rule problems - (MetaDSDHelper.java:624)
import org.dmd.core.rules.DmcRuleExceptionSet;                                  // May be thrown by rule manager - (MetaDSDHelper.java:621)
import org.dmd.core.util.DMUncheckedObject;                                     // Basic parsing of objects - (MetaDSDHelper.java:601)
import org.dmd.dms.server.extended.ActionDefinition;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.AttributeDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.ClassDefinition;                             // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                       // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.DSDefinitionModule;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.Dependency;                                  // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.DependencyImplementation;                    // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.DmsDefinition;                               // The base definition from the DmsModule Module - (MetaDSDHelper.java:849)
import org.dmd.dms.server.extended.DmsModule;                                   // The kind of DDM we're reading - (MetaDSDHelper.java:631)
import org.dmd.dms.server.extended.EnumDefinition;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;             // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.MetaSchema;                                  // So that we can preserve newlines - (MetaDSDHelper.java:626)
import org.dmd.dms.server.extended.RuleCategory;                                // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.RuleDefinition;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.RunContext;                                  // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.SchemaDefinition;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.SchemaManager;                               // Manages the schemas we use - (MetaDSDHelper.java:598)
import org.dmd.dms.server.extended.SliceDefinition;                             // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.extended.TypeDefinition;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:856)
import org.dmd.dms.server.generated.MetaSchemaAG;                               // The schema recognized by this parser - (MetaDSDHelper.java:617)
import org.dmd.dms.server.generated.dmw.AttributeDefinitionIterableDMW;         // To allow addition of preserve newline attributes - (MetaDSDHelper.java:640)
import org.dmd.dms.server.generated.dmw.StringIterableDMW;                      // To iterate over defFiles - (MetaDSDHelper.java:623)
import org.dmd.dms.server.generated.dsd.DmsModuleGlobalInterface;               // Interface to our definition storage - (MetaDSDHelper.java:605)
import org.dmd.dms.server.util.DsdParserInterface;                              // Standard parser interface - (MetaDSDHelper.java:602)
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;                              // To allow loading of rules from the meta schema - (MetaDSDHelper.java:627)
import org.dmd.dmv.shared.DmvRuleManager;                                       // The injected rule manager used for initializations - (MetaDSDHelper.java:622)
import org.dmd.dmw.DmwObjectFactory;                                            // Constructs wrapped objects - (MetaDSDHelper.java:604)
import org.dmd.dmw.DmwWrapper;                                                  // To handle factory created objects - (MetaDSDHelper.java:625)
import org.dmd.util.parsing.ConfigLocation;                                     // Config file location info - (MetaDSDHelper.java:603)
import org.dmd.util.parsing.DMUncheckedObjectHandlerIF;                         // Basic parsing of objects - (MetaDSDHelper.java:600)
import org.dmd.util.parsing.DMUncheckedObjectParser;                            // Basic parsing of objects - (MetaDSDHelper.java:599)



// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:648)
public class DmsModuleParser implements DsdParserInterface, DMUncheckedObjectHandlerIF {

    final static String fileExtension = "dms";

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:68)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:662)

    SchemaManager               schema;                                               // Manages the schema for this DSD
    DMUncheckedObjectParser     parser         = new DMUncheckedObjectParser(this);   // Parses objects from the config file
    DmwObjectFactory            factory;                                              // Instantiates wrapped objects
    DmsModuleGlobalInterface    definitions;                                          // Place to store parsed definitions
    DmvRuleManager              rules;                                                // The overall rule manager
    ConfigLocation              location;                                             // The location of the config being parsed
    DmsModule                   module;                                               // The DDM module

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:665)
    public DmsModuleParser(DmsModuleGlobalInterface d, DmvRuleManager r) throws DMFeedbackSet, DmcNameClashException {
        schema = new SchemaManager();
        MetaSchemaAG sd = new MetaSchemaAG();
        schema.manageSchema(sd.getInstance());
        if (sd.getAttributeDefListSize() > 0){
            preserveNewLines(sd.getAttributeDefList());
        }
        preserveNewLines(MetaSchema._metaSchema.getAttributeDefList());
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
        rules.loadRules(MetaDMSAG.instance());
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:695)
    public DmsModule parseConfig(ConfigLocation l) throws DMFeedbackSet, DmcNameClashException {
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:728)
    @Override
    public void handleObject(DMUncheckedObject uco, String infile, int lineNumber) throws DMFeedbackSet, DmcNameClashException {
        DmsDefinition definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (DmsDefinition) wrapper;
        } catch (ClassNotFoundException e) {
            DMFeedbackSet ex = new DMFeedbackSet("Unknown object class: " + uco.getConstructionClass(),infile,lineNumber);
            throw(ex);
        }
        catch (DMFeedbackSet ex){
            ex.setLocation(infile, lineNumber);
            throw(ex);
        }
        catch(ClassCastException e){
            DMFeedbackSet ex = new DMFeedbackSet("The following object is not valid in a .dms file:\n\n" + wrapper.toOIF(),infile,lineNumber);
            throw(ex);
        }

        definition.setLineNumber(lineNumber);
        definition.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(definition.getDmcObject());
            rules.executeAttributeValidation(definition.getDmcObject());
            rules.executeObjectValidation(definition.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        // The first definition we expect is the module definition
        if (module == null){
            if (definition instanceof DmsModule){
                module = (DmsModule)definition;
            
                definition.setDotName(module.getName() + "." + definition.getConstructionClassName());
            
                module.setDefinedInDmsModule(module);
                definitions.addDmsModule(module);
            }
            else{
                DMFeedbackSet ex = new DMFeedbackSet("Expecting a DmsModule module definition",infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateParser(MetaDSDHelper.java:802)
            if (definition instanceof DmsModule){
                DMFeedbackSet ex = new DMFeedbackSet("Multiple DmsModule definitions while parsing config: " + location.getFileName(), infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInDmsModule(module);
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            
            if (definition instanceof ActionDefinition){
                definitions.addActionDefinition((ActionDefinition)definition);
                module.addActionDefinition((ActionDefinition)definition);
            }
            else if (definition instanceof AttributeDefinition){
                definitions.addAttributeDefinition((AttributeDefinition)definition);
                module.addAttributeDefinition((AttributeDefinition)definition);
            }
            else if (definition instanceof ClassDefinition){
                definitions.addClassDefinition((ClassDefinition)definition);
                module.addClassDefinition((ClassDefinition)definition);
            }
            else if (definition instanceof ComplexTypeDefinition){
                definitions.addComplexTypeDefinition((ComplexTypeDefinition)definition);
                module.addComplexTypeDefinition((ComplexTypeDefinition)definition);
            }
            else if (definition instanceof ExtendedReferenceTypeDefinition){
                definitions.addExtendedReferenceTypeDefinition((ExtendedReferenceTypeDefinition)definition);
                module.addExtendedReferenceTypeDefinition((ExtendedReferenceTypeDefinition)definition);
            }
            else if (definition instanceof DSDefinitionModule){
                definitions.addDSDefinitionModule((DSDefinitionModule)definition);
                module.addDSDefinitionModule((DSDefinitionModule)definition);
            }
            else if (definition instanceof Dependency){
                definitions.addDependency((Dependency)definition);
                module.addDependency((Dependency)definition);
            }
            else if (definition instanceof DependencyImplementation){
                definitions.addDependencyImplementation((DependencyImplementation)definition);
                module.addDependencyImplementation((DependencyImplementation)definition);
            }
            else if (definition instanceof EnumDefinition){
                definitions.addEnumDefinition((EnumDefinition)definition);
                module.addEnumDefinition((EnumDefinition)definition);
            }
            else if (definition instanceof RuleCategory){
                definitions.addRuleCategory((RuleCategory)definition);
                module.addRuleCategory((RuleCategory)definition);
            }
            else if (definition instanceof RuleDefinition){
                definitions.addRuleDefinition((RuleDefinition)definition);
                module.addRuleDefinition((RuleDefinition)definition);
            }
            else if (definition instanceof RunContext){
                definitions.addRunContext((RunContext)definition);
                module.addRunContext((RunContext)definition);
            }
            else if (definition instanceof SchemaDefinition){
                definitions.addSchemaDefinition((SchemaDefinition)definition);
                module.addSchemaDefinition((SchemaDefinition)definition);
            }
            else if (definition instanceof SliceDefinition){
                definitions.addSliceDefinition((SliceDefinition)definition);
                module.addSliceDefinition((SliceDefinition)definition);
            }
            else if (definition instanceof TypeDefinition){
                definitions.addTypeDefinition((TypeDefinition)definition);
                module.addTypeDefinition((TypeDefinition)definition);
            }

        }

    }
}

