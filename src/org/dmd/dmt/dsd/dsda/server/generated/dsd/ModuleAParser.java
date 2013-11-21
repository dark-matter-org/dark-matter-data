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
package org.dmd.dmt.dsd.dsda.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:362)
import org.dmd.dmc.DmcValueException;                                            // May be thrown by schema management - (DSDArtifactFormatter.java:348)
import org.dmd.dmc.definitions.DsdParserInterface;                               // Standard parser interface - (DSDArtifactFormatter.java:337)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                    // May be thrown by rule manager - (DSDArtifactFormatter.java:350)
import org.dmd.dmc.util.DmcUncheckedObject;                                      // Basic parsing of objects - (DSDArtifactFormatter.java:336)
import org.dmd.dms.SchemaManager;                                                // Manages the schemas we use - (DSDArtifactFormatter.java:332)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // The base definition from the ModuleA Module - (DSDArtifactFormatter.java:511)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:517)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:355)
import org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG;                       // The schema recognized by this parser - (DSDArtifactFormatter.java:347)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:340)
import org.dmd.dmv.shared.DmvRuleManager;                                        // The injected rule manager used for initializations - (DSDArtifactFormatter.java:351)
import org.dmd.dmw.DmwObjectFactory;                                             // Constructs wrapped objects - (DSDArtifactFormatter.java:339)
import org.dmd.util.exceptions.ResultException;                                  // May be thrown by schema management - (DSDArtifactFormatter.java:349)
import org.dmd.util.parsing.ConfigLocation;                                      // Config file location info - (DSDArtifactFormatter.java:338)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                            // Basic parsing of objects - (DSDArtifactFormatter.java:335)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                               // Basic parsing of objects - (DSDArtifactFormatter.java:334)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:365)
public class ModuleAParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "tma";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:379)
    SchemaManager             schema         = new SchemaManager();               // Manages the schema for this DSD
    DmcUncheckedOIFParser     parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory          factory        = new DmwObjectFactory(schema);      // Instantiates wrapped objects
    ModuleAGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager            rules;                                              // The overall rule manager
    ConfigLocation            location;                                           // The location of the config being parsed
    ModuleA                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:382)
    public ModuleAParser(ModuleAGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException {
        schema.manageSchema(new DsdASchemaAG());
        definitions  = d;
        rules        = r;
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:393)
    public ModuleA parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet {
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

        return(module);
    }

    void parseFile(String fn){



    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:420)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        AConceptBase definition = null;

        try{
            definition = (AConceptBase) factory.createWrapper(uco);
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

        definition.setLineNumber(lineNumber);
        definition.setFile(infile);

        // Run the rules against the definition
        rules.executeInitializers(definition.getDmcObject());
        rules.executeAttributeValidation(definition.getDmcObject());
        rules.executeObjectValidation(definition.getDmcObject());

        // The first definition we expect is the module definition
        if (module == null){
            if (definition instanceof ModuleA){
                module = (ModuleA)definition;
                definitions.addModuleA(module);
                module.setDefinedInModuleA(module);
            }
            else{
                ResultException ex = new ResultException("Expecting a ModuleA module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:469)
            if (definition instanceof ModuleA){
                ResultException ex = new ResultException("Multiple ModuleA definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInModuleA(module);
            
            if (definition instanceof AConceptX){
                definitions.addAConceptX((AConceptX)definition);
                module.addAConceptX((AConceptX)definition);
            }

        }

    }
}

