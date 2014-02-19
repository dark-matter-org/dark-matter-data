//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsdb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:468)
import org.dmd.dmc.DmcNameClashException;                                        // May be thrown when instantiating objects - (DSDArtifactFormatter.java:448)
import org.dmd.dmc.DmcValueException;                                            // May be thrown when parsing objects - (DSDArtifactFormatter.java:447)
import org.dmd.dmc.definitions.DsdParserInterface;                               // Standard parser interface - (DSDArtifactFormatter.java:431)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                    // May be thrown by rule manager - (DSDArtifactFormatter.java:450)
import org.dmd.dmc.rules.SourceInfo;                                             // To indicate the source of rule problems - (DSDArtifactFormatter.java:453)
import org.dmd.dmc.util.DmcUncheckedObject;                                      // Basic parsing of objects - (DSDArtifactFormatter.java:430)
import org.dmd.dms.AttributeDefinition;                                          // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:465)
import org.dmd.dms.SchemaManager;                                                // Manages the schemas we use - (DSDArtifactFormatter.java:426)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;                 // To allow addition of preserve newline attributes - (DSDArtifactFormatter.java:466)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // To iterate over defFiles - (DSDArtifactFormatter.java:452)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // The base definition from the ModuleB Module - (DSDArtifactFormatter.java:729)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDArtifactFormatter.java:737)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:458)
import org.dmd.dmt.dsd.dsdb.server.generated.DsdBSchemaAG;                       // The schema recognized by this parser - (DSDArtifactFormatter.java:446)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:434)
import org.dmd.dmv.shared.DmvRuleManager;                                        // The injected rule manager used for initializations - (DSDArtifactFormatter.java:451)
import org.dmd.dmw.DmwObjectFactory;                                             // Constructs wrapped objects - (DSDArtifactFormatter.java:433)
import org.dmd.dmw.DmwWrapper;                                                   // To handle factory created objects - (DSDArtifactFormatter.java:454)
import org.dmd.util.exceptions.ResultException;                                  // May be thrown by schema management - (DSDArtifactFormatter.java:449)
import org.dmd.util.parsing.ConfigLocation;                                      // Config file location info - (DSDArtifactFormatter.java:432)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                            // Basic parsing of objects - (DSDArtifactFormatter.java:429)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                               // Basic parsing of objects - (DSDArtifactFormatter.java:428)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:471)
public class ModuleBParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "tmb";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:485)
    SchemaManager             schema;                                             // Manages the schema for this DSD
    DmcUncheckedOIFParser     parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory          factory;                                            // Instantiates wrapped objects
    ModuleBGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager            rules;                                              // The overall rule manager
    ConfigLocation            location;                                           // The location of the config being parsed
    ModuleB                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:488)
    public ModuleBParser(ModuleBGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DsdBSchemaAG sd = new DsdBSchemaAG();
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
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:513)
    public ModuleB parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:546)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        BConceptBase definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (BConceptBase) wrapper;
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
            ex.addError("The following object is not valid in a .tmb file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
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
            if (definition instanceof ModuleB){
                module = (ModuleB)definition;
            
                definition.setDotName(module.getName() + "." + definition.getConstructionClassName());
                definition.setNameAndTypeName(module.getName() + "." + definition.getConstructionClassName());
            
                module.setDefinedInModuleB(module);
                definitions.addModuleB(module);
            }
            else{
                ResultException ex = new ResultException("Expecting a ModuleB module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:620)
            if (definition instanceof ModuleB){
                ResultException ex = new ResultException("Multiple ModuleB definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInModuleB(module);
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            definition.setNameAndTypeName(definition.getName() + "." + definition.getConstructionClassName());
            
            if (definition instanceof BConceptX){
                definitions.addBConceptX((BConceptX)definition);
                module.addBConceptX((BConceptX)definition);
            }

        }

    }
}

