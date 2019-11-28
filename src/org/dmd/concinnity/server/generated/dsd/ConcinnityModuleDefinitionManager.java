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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:158)
import java.util.Collection;                                                            // To return values from indices - (DSDArtifactFormatter.java:153)
import java.util.Iterator;                                                              // To allow access to our definitions - (DSDArtifactFormatter.java:132)
import java.util.TreeMap;                                                               // To organize access to our indices - (DSDArtifactFormatter.java:152)
import org.dmd.concinnity.server.extended.Concept;                                      // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:495)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;                         // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:491)
import org.dmd.concinnity.server.extended.ConcinnityModule;                             // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:495)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleGlobalInterface;         // Interface for ConcinnityModule definitions - (DSDArtifactFormatter.java:488)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;                       // To allow use of DmcClassInfo from the dmconcinnity schema for index access - (DSDArtifactFormatter.java:150)
import org.dmd.dmc.DmcAttributeInfo;                                                    // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcClassInfo;                                                        // The class info for our indices - (DSDArtifactFormatter.java:154)
import org.dmd.dmc.DmcNameClashException;                                               // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashObjectSet;                                               // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashResolverIF;                                              // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                   // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNamedObjectIF;                                                    // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObject;                                                           // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObjectName;                                                       // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcValueException;                                                   // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcValueExceptionSet;                                                // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                        // Our base to provide definition set storage - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.types.DotName;                                                       // To support the find method for definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dms.DSDefinition;                                                        // The base of all definitions - (DSDArtifactFormatter.java:130)
import org.dmd.dmw.DmwNamedObjectWrapper;                                               // What we return from getIndex() - (DSDArtifactFormatter.java:155)
import org.dmd.util.exceptions.ResultException;                                         // When deletion problems occur - (DSDArtifactFormatter.java:144)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:162)
public class ConcinnityModuleDefinitionManager implements ConcinnityModuleGlobalInterface, DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF {

    private DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:514)
    private DmcDefinitionSet<ConcinnityDefinition> ConcinnityDefinitionDefs;
    private DmcDefinitionSet<Concept> ConceptDefs;
    private DmcDefinitionSet<ConcinnityModule> ConcinnityModuleDefs;

    private TreeMap<DmcClassInfo,DmcDefinitionSet<?>>	indicesByClass;

    public ConcinnityModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:541)
        ConcinnityDefinitionDefs = new DmcDefinitionSet<ConcinnityDefinition>("ConcinnityDefinition", allDefinitions);
        indicesByClass.put(DmconcinnityDMSAG.__ConcinnityDefinition, ConcinnityDefinitionDefs);

        ConceptDefs = new DmcDefinitionSet<Concept>("Concept", allDefinitions, ConcinnityDefinitionDefs);
        indicesByClass.put(DmconcinnityDMSAG.__Concept, ConceptDefs);

        ConcinnityModuleDefs = new DmcDefinitionSet<ConcinnityModule>("ConcinnityModule", allDefinitions, ConcinnityDefinitionDefs);
        indicesByClass.put(DmconcinnityDMSAG.__ConcinnityModule, ConcinnityModuleDefs);


    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:185)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:193)
    public Collection<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci){
        DmcDefinitionSet<?>    dds = indicesByClass.get(ci);
        
        if (dds == null)
            throw(new IllegalStateException("No index available for class: " + ci.name));
        
        return(dds.getIndex());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:204)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:220)
    public DSDefinition findDefinition(DotName name) {
    	   return(allDefinitions.getDefinition(name));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:226)
    /**
     * Attempts to delete the definition with the specified name. If you have
     * enabled back reference tracking via DmcOmni, it will also clean up any
     * existing references from this definition to other definitions.
     * @param name the fully qualified DotName of the definition to be deleted.
     * @throws ResultException if the definition can't, be found or if there are outstanding references to it.
     */
    public void deleteDefinition(DotName name) throws ResultException {
        DSDefinition def = allDefinitions.getDefinition(name);
        
        if (def == null)
            throw(new ResultException("Could not find object to delete: " + name.getNameString()));
        
        DmcDefinitionSet<?> dds = indicesByClass.get(def.getConstructionClassInfo());
        dds.delete(name);
        def.youAreDeleted();
        
        ConcinnityDefinition base = (ConcinnityDefinition)def;
        ConcinnityModule module = base.getDefinedInConcinnityModule();
        
        if (def instanceof Concept){
            module.deleteConcept((Concept)def);
        }
        else if (def instanceof ConcinnityModule){
        }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:281)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:286)
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:305)
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
                if (rc == null){
                    DmcValueException ex = new DmcValueException("The reference to : " + name.getNameString() + " is ambiguous. You must specify the module name as a prefix to the name. Here are your options:");
                    Iterator<DmcNamedObjectIF> it = e.getMatches();
                    while(it.hasNext()){
                        ConcinnityDefinition def = (ConcinnityDefinition) it.next();
                        ex.addMoreInfo(def.getDefinedInConcinnityModule().getName().getNameString() + "." + name.getNameString());
                    }
                    throw(ex);
                }
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:336)
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:305)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:535)
    /**
     * All definitions are added to the base definition collection.
     */
    void addConcinnityDefinition(ConcinnityDefinition def){
        ConcinnityDefinitionDefs.add(def);
    }

    void deleteConcinnityDefinition(ConcinnityDefinition def){
        try {
            ConcinnityDefinitionDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getConcinnityDefinitionCount(){
        return(ConcinnityDefinitionDefs.size());
    }

    public ConcinnityDefinition getConcinnityDefinition(DotName name){
        return(ConcinnityDefinitionDefs.getDefinition(name));
    }

    public Iterator<ConcinnityDefinition> getAllConcinnityDefinition(){
        return(ConcinnityDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:343)
    public void addConcept(Concept def){
        ConceptDefs.add(def);
        addConcinnityDefinition(def);
    }

    public void deleteConcept(Concept def){
        try{
            ConceptDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteConcinnityDefinition(def);
    }

    public int getConceptCount(){
        return(ConceptDefs.size());
    }

    public Concept getConcept(DotName name){
        return(ConceptDefs.getDefinition(name));
    }

    public Iterator<Concept> getAllConcept(){
        return(ConceptDefs.values().iterator());
    }

    public Concept getConceptDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ConceptDefs.getDefinition(name));
    }

    public Iterator<Concept> getConceptDefinitionsByName(String name) throws DmcValueException{
        return(ConceptDefs.getDefinitionsByName(name));
    }

    public int getConceptDefinitionCountByName(String name) throws DmcValueException{
        return(ConceptDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:343)
    public void addConcinnityModule(ConcinnityModule def){
        ConcinnityModuleDefs.add(def);
        addConcinnityDefinition(def);
    }

    public void deleteConcinnityModule(ConcinnityModule def){
        try{
            ConcinnityModuleDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteConcinnityDefinition(def);
    }

    public int getConcinnityModuleCount(){
        return(ConcinnityModuleDefs.size());
    }

    public ConcinnityModule getConcinnityModule(DotName name){
        return(ConcinnityModuleDefs.getDefinition(name));
    }

    public Iterator<ConcinnityModule> getAllConcinnityModule(){
        return(ConcinnityModuleDefs.values().iterator());
    }

    public ConcinnityModule getConcinnityModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ConcinnityModuleDefs.getDefinition(name));
    }

    public Iterator<ConcinnityModule> getConcinnityModuleDefinitionsByName(String name) throws DmcValueException{
        return(ConcinnityModuleDefs.getDefinitionsByName(name));
    }

    public int getConcinnityModuleDefinitionCountByName(String name) throws DmcValueException{
        return(ConcinnityModuleDefs.getDefinitionCountByName(name));
    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethod(DSDArtifactFormatter.java:378)
    public void addDefinition(DSDefinition definition){
            if (definition instanceof Concept){
                addConcept((Concept)definition);
            }
            else if (definition instanceof ConcinnityModule){
                addConcinnityModule((ConcinnityModule)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethodAndUpdateModuleMethod(DSDArtifactFormatter.java:421)
    public void addDefinition(DSDefinition definition, ConcinnityModule module){
            if (definition instanceof Concept){
                addConcept((Concept)definition);
                module.addConcept((Concept)definition);
            }
            else if (definition instanceof ConcinnityModule){
                addConcinnityModule((ConcinnityModule)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpSummaryMethod(DSDArtifactFormatter.java:460)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(ConcinnityDefinitionDefs.summary());
        sb.append(ConceptDefs.summary());
        sb.append(ConcinnityModuleDefs.summary());
       return(sb.toString());
    }

}

