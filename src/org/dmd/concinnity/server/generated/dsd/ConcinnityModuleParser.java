//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:727)
import java.util.Iterator;                                                              // To iterate over collections - (DSDArtifactFormatter.java:684)
import org.dmd.concinnity.server.extended.Concept;                                      // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:1054)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;                         // The base definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:1046)
import org.dmd.concinnity.server.extended.ConcinnityModule;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:708)
import org.dmd.concinnity.server.generated.DmconcinnitySchemaAG;                        // The schema recognized by this parser - (DSDArtifactFormatter.java:693)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:681)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;                       // To allow loading of rules from the dmconcinnity schema - (DSDArtifactFormatter.java:704)
import org.dmd.dmc.DmcNameClashException;                                               // May be thrown when instantiating objects - (DSDArtifactFormatter.java:695)
import org.dmd.dmc.DmcValueException;                                                   // May be thrown when parsing objects - (DSDArtifactFormatter.java:694)
import org.dmd.dmc.definitions.DsdParserInterface;                                      // Standard parser interface - (DSDArtifactFormatter.java:678)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                           // May be thrown by rule manager - (DSDArtifactFormatter.java:697)
import org.dmd.dmc.rules.SourceInfo;                                                    // To indicate the source of rule problems - (DSDArtifactFormatter.java:700)
import org.dmd.dmc.util.DmcUncheckedObject;                                             // Basic parsing of objects - (DSDArtifactFormatter.java:677)
import org.dmd.dms.AttributeDefinition;                                                 // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:721)
import org.dmd.dms.MetaSchema;                                                          // So that we can preserve newlines - (DSDArtifactFormatter.java:702)
import org.dmd.dms.SchemaDefinition;                                                    // To support dynamic loading of schemas - (DSDArtifactFormatter.java:685)
import org.dmd.dms.SchemaManager;                                                       // Manages the schemas we use - (DSDArtifactFormatter.java:673)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                        // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:722)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                     // To iterate over defFiles - (DSDArtifactFormatter.java:699)
import org.dmd.dms.generated.types.SchemaAndReason;                                     // To allow dynamic schema loading - (DSDArtifactFormatter.java:724)
import org.dmd.dmv.shared.DmvRuleManager;                                               // The injected rule manager used for initializations - (DSDArtifactFormatter.java:698)
import org.dmd.dmw.DmwObjectFactory;                                                    // Constructs wrapped objects - (DSDArtifactFormatter.java:680)
import org.dmd.dmw.DmwWrapper;                                                          // To handle factory created objects - (DSDArtifactFormatter.java:701)
import org.dmd.util.exceptions.ResultException;                                         // May be thrown by schema management - (DSDArtifactFormatter.java:696)
import org.dmd.util.parsing.ConfigLocation;                                             // Config file location info - (DSDArtifactFormatter.java:679)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                                   // Basic parsing of objects - (DSDArtifactFormatter.java:676)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                                      // Basic parsing of objects - (DSDArtifactFormatter.java:675)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:730)
public class ConcinnityModuleParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "dmcm";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:744)
    SchemaManager                      schema;                                             // Manages the schema for this DSD
    DmcUncheckedOIFParser              parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory                   factory;                                            // Instantiates wrapped objects
    ConcinnityModuleGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager                     rules;                                              // The overall rule manager
    ConfigLocation                     location;                                           // The location of the config being parsed
    ConcinnityModule                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:747)
    public ConcinnityModuleParser(ConcinnityModuleGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DmconcinnitySchemaAG sd = new DmconcinnitySchemaAG();
        schema.manageSchema(sd.getInstance());
        if (sd.getAttributeDefListSize() > 0){
            preserveNewLines(sd.getAttributeDefList());
        }
        preserveNewLines(MetaSchema._metaSchema.getAttributeDefList());
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
        rules.loadRules(DmconcinnityDMSAG.instance());
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
    public ConcinnityModule parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
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
        ConcinnityDefinition definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (ConcinnityDefinition) wrapper;
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
            ex.addError("All classes in your DSL must ultimately be derived from: ConcinnityDefinition");
            ex.addError("The following object is not valid in a .dmcm file:\n\n" + wrapper.toOIF());
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
            if (definition instanceof ConcinnityModule){
                module = (ConcinnityModule)definition;
            
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
            
                module.setDefinedInConcinnityModule(module);
                definitions.addConcinnityModule(module);
                if (module.getLoadSchemaClassHasValue()){
                    loadSchemas(module);
                }
            }
            else{
                ResultException ex = new ResultException("Expecting a ConcinnityModule module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:904)
            if (definition instanceof ConcinnityModule){
                ResultException ex = new ResultException("Multiple ConcinnityModule definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInConcinnityModule(module);
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
            
            if (definition instanceof Concept){
                definitions.addConcept((Concept)definition);
                module.addConcept((Concept)definition);
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
    void loadSchemas(ConcinnityModule module) throws ResultException {
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

