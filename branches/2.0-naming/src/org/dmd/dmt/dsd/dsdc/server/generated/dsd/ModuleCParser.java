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
package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:338)
import org.dmd.dmc.DmcValueException;                                            // May be thrown by schema management - (DSDArtifactFormatter.java:323)
import org.dmd.dmc.definitions.DsdParserInterface;                               // Standard parser interface - (DSDArtifactFormatter.java:312)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                    // May be thrown by rule manager - (DSDArtifactFormatter.java:325)
import org.dmd.dmc.util.DmcUncheckedObject;                                      // Basic parsing of objects - (DSDArtifactFormatter.java:311)
import org.dmd.dms.SchemaManager;                                                // Manages the schemas we use - (DSDArtifactFormatter.java:307)
import org.dmd.dms.generated.dmw.StringIterableDMW;                              // To iterate over defFiles - (DSDArtifactFormatter.java:327)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;                        // The base definition from the ModuleC Module - (DSDArtifactFormatter.java:497)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                           // A definition from the ModuleC Module - (DSDArtifactFormatter.java:503)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:331)
import org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG;                       // The schema recognized by this parser - (DSDArtifactFormatter.java:322)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:315)
import org.dmd.dmv.shared.DmvRuleManager;                                        // The injected rule manager used for initializations - (DSDArtifactFormatter.java:326)
import org.dmd.dmw.DmwObjectFactory;                                             // Constructs wrapped objects - (DSDArtifactFormatter.java:314)
import org.dmd.util.exceptions.ResultException;                                  // May be thrown by schema management - (DSDArtifactFormatter.java:324)
import org.dmd.util.parsing.ConfigLocation;                                      // Config file location info - (DSDArtifactFormatter.java:313)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                            // Basic parsing of objects - (DSDArtifactFormatter.java:310)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                               // Basic parsing of objects - (DSDArtifactFormatter.java:309)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:341)
public class ModuleCParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "tmc";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:355)
    SchemaManager             schema         = new SchemaManager();               // Manages the schema for this DSD
    DmcUncheckedOIFParser     parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory          factory        = new DmwObjectFactory(schema);      // Instantiates wrapped objects
    ModuleCGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager            rules;                                              // The overall rule manager
    ConfigLocation            location;                                           // The location of the config being parsed
    ModuleC                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:358)
    public ModuleCParser(ModuleCGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException {
        schema.manageSchema(new DsdCSchemaAG());
        definitions  = d;
        rules        = r;
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:369)
    public ModuleC parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet {
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:402)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        CConceptBase definition = null;

        try{
            definition = (CConceptBase) factory.createWrapper(uco);
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
            if (definition instanceof ModuleC){
                module = (ModuleC)definition;
            
                definition.setDotName(module.getName() + "." + definition.getConstructionClassName());
            
                definitions.addModuleC(module);
                module.setDefinedInModuleC(module);
            }
            else{
                ResultException ex = new ResultException("Expecting a ModuleC module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:454)
            if (definition instanceof ModuleC){
                ResultException ex = new ResultException("Multiple ModuleC definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInModuleC(module);
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            
            if (definition instanceof CConceptX){
                definitions.addCConceptX((CConceptX)definition);
                module.addCConceptX((CConceptX)definition);
            }

        }

    }
}

