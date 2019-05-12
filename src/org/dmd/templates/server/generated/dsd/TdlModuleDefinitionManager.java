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
package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:158)
import java.util.Collection;                                                    // To return values from indices - (DSDArtifactFormatter.java:153)
import java.util.Iterator;                                                      // To allow access to our definitions - (DSDArtifactFormatter.java:132)
import java.util.TreeMap;                                                       // To organize access to our indices - (DSDArtifactFormatter.java:152)
import org.dmd.dmc.DmcAttributeInfo;                                            // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcClassInfo;                                                // The class info for our indices - (DSDArtifactFormatter.java:154)
import org.dmd.dmc.DmcNameClashException;                                       // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashObjectSet;                                       // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashResolverIF;                                      // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                           // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNamedObjectIF;                                            // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObject;                                                   // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObjectName;                                               // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcValueException;                                           // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcValueExceptionSet;                                        // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                // Our base to provide definition set storage - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.types.DotName;                                               // To support the find method for definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dms.DSDefinition;                                                // The base of all definitions - (DSDArtifactFormatter.java:130)
import org.dmd.dmw.DmwNamedObjectWrapper;                                       // What we return from getIndex() - (DSDArtifactFormatter.java:155)
import org.dmd.templates.server.extended.ContainedElement;                      // A definition from the TdlModule Module - (DSDArtifactFormatter.java:414)
import org.dmd.templates.server.extended.ExtensionHook;                         // A definition from the TdlModule Module - (DSDArtifactFormatter.java:414)
import org.dmd.templates.server.extended.Section;                               // A definition from the TdlModule Module - (DSDArtifactFormatter.java:414)
import org.dmd.templates.server.extended.TdlDefinition;                         // A definition from the TdlModule Module - (DSDArtifactFormatter.java:410)
import org.dmd.templates.server.extended.TdlModule;                             // A definition from the TdlModule Module - (DSDArtifactFormatter.java:414)
import org.dmd.templates.server.extended.TextualArtifact;                       // A definition from the TdlModule Module - (DSDArtifactFormatter.java:414)
import org.dmd.templates.server.generated.dsd.TdlModuleGlobalInterface;         // Interface for TdlModule definitions - (DSDArtifactFormatter.java:407)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                       // To allow use of DmcClassInfo from the dmtdl schema for index access - (DSDArtifactFormatter.java:150)
import org.dmd.util.exceptions.ResultException;                                 // When deletion problems occur - (DSDArtifactFormatter.java:144)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:162)
public class TdlModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, TdlModuleGlobalInterface {

    private DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:433)
    private DmcDefinitionSet<TdlDefinition> TdlDefinitionDefs;
    private DmcDefinitionSet<ContainedElement> ContainedElementDefs;
    private DmcDefinitionSet<ExtensionHook> ExtensionHookDefs;
    private DmcDefinitionSet<Section> SectionDefs;
    private DmcDefinitionSet<TdlModule> TdlModuleDefs;
    private DmcDefinitionSet<TextualArtifact> TextualArtifactDefs;

    private TreeMap<DmcClassInfo,DmcDefinitionSet<?>>	indicesByClass;

    public TdlModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:460)
        TdlDefinitionDefs = new DmcDefinitionSet<TdlDefinition>("TdlDefinition", allDefinitions);
        indicesByClass.put(DmtdlDMSAG.__TdlDefinition, TdlDefinitionDefs);

        ContainedElementDefs = new DmcDefinitionSet<ContainedElement>("ContainedElement", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(DmtdlDMSAG.__ContainedElement, ContainedElementDefs);

        SectionDefs = new DmcDefinitionSet<Section>("Section", allDefinitions, ContainedElementDefs);
        indicesByClass.put(DmtdlDMSAG.__Section, SectionDefs);

        ExtensionHookDefs = new DmcDefinitionSet<ExtensionHook>("ExtensionHook", allDefinitions, ContainedElementDefs);
        indicesByClass.put(DmtdlDMSAG.__ExtensionHook, ExtensionHookDefs);

        TextualArtifactDefs = new DmcDefinitionSet<TextualArtifact>("TextualArtifact", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(DmtdlDMSAG.__TextualArtifact, TextualArtifactDefs);

        TdlModuleDefs = new DmcDefinitionSet<TdlModule>("TdlModule", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(DmtdlDMSAG.__TdlModule, TdlModuleDefs);


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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:225)
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
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:244)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:249)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:269)
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
                        TdlDefinition def = (TdlDefinition) it.next();
                        ex.addMoreInfo(def.getDefinedInTdlModule().getName().getNameString() + "." + name.getNameString());
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:300)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:302)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:454)
    /**
     * All definitions are added to the base definition collection.
     */
    void addTdlDefinition(TdlDefinition def){
        TdlDefinitionDefs.add(def);
    }

    public int getTdlDefinitionCount(){
        return(TdlDefinitionDefs.size());
    }

    public TdlDefinition getTdlDefinition(DotName name){
        return(TdlDefinitionDefs.getDefinition(name));
    }

    public Iterator<TdlDefinition> getAllTdlDefinition(){
        return(TdlDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addContainedElement(ContainedElement def){
        ContainedElementDefs.add(def);
        addTdlDefinition(def);
    }

    public int getContainedElementCount(){
        return(ContainedElementDefs.size());
    }

    public ContainedElement getContainedElement(DotName name){
        return(ContainedElementDefs.getDefinition(name));
    }

    public Iterator<ContainedElement> getAllContainedElement(){
        return(ContainedElementDefs.values().iterator());
    }

    public ContainedElement getContainedElementDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ContainedElementDefs.getDefinition(name));
    }

    public Iterator<ContainedElement> getContainedElementDefinitionsByName(String name) throws DmcValueException{
        return(ContainedElementDefs.getDefinitionsByName(name));
    }

    public int getContainedElementDefinitionCountByName(String name) throws DmcValueException{
        return(ContainedElementDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addExtensionHook(ExtensionHook def){
        ExtensionHookDefs.add(def);
        addContainedElement(def);
    }

    public int getExtensionHookCount(){
        return(ExtensionHookDefs.size());
    }

    public ExtensionHook getExtensionHook(DotName name){
        return(ExtensionHookDefs.getDefinition(name));
    }

    public Iterator<ExtensionHook> getAllExtensionHook(){
        return(ExtensionHookDefs.values().iterator());
    }

    public ExtensionHook getExtensionHookDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ExtensionHookDefs.getDefinition(name));
    }

    public Iterator<ExtensionHook> getExtensionHookDefinitionsByName(String name) throws DmcValueException{
        return(ExtensionHookDefs.getDefinitionsByName(name));
    }

    public int getExtensionHookDefinitionCountByName(String name) throws DmcValueException{
        return(ExtensionHookDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addSection(Section def){
        SectionDefs.add(def);
        addContainedElement(def);
    }

    public int getSectionCount(){
        return(SectionDefs.size());
    }

    public Section getSection(DotName name){
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<Section> getAllSection(){
        return(SectionDefs.values().iterator());
    }

    public Section getSectionDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<Section> getSectionDefinitionsByName(String name) throws DmcValueException{
        return(SectionDefs.getDefinitionsByName(name));
    }

    public int getSectionDefinitionCountByName(String name) throws DmcValueException{
        return(SectionDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addTdlModule(TdlModule def){
        TdlModuleDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTdlModuleCount(){
        return(TdlModuleDefs.size());
    }

    public TdlModule getTdlModule(DotName name){
        return(TdlModuleDefs.getDefinition(name));
    }

    public Iterator<TdlModule> getAllTdlModule(){
        return(TdlModuleDefs.values().iterator());
    }

    public TdlModule getTdlModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(TdlModuleDefs.getDefinition(name));
    }

    public Iterator<TdlModule> getTdlModuleDefinitionsByName(String name) throws DmcValueException{
        return(TdlModuleDefs.getDefinitionsByName(name));
    }

    public int getTdlModuleDefinitionCountByName(String name) throws DmcValueException{
        return(TdlModuleDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addTextualArtifact(TextualArtifact def){
        TextualArtifactDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTextualArtifactCount(){
        return(TextualArtifactDefs.size());
    }

    public TextualArtifact getTextualArtifact(DotName name){
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifact> getAllTextualArtifact(){
        return(TextualArtifactDefs.values().iterator());
    }

    public TextualArtifact getTextualArtifactDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifact> getTextualArtifactDefinitionsByName(String name) throws DmcValueException{
        return(TextualArtifactDefs.getDefinitionsByName(name));
    }

    public int getTextualArtifactDefinitionCountByName(String name) throws DmcValueException{
        return(TextualArtifactDefs.getDefinitionCountByName(name));
    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethod(DSDArtifactFormatter.java:340)
    public void addDefinition(DSDefinition definition){
            if (definition instanceof ExtensionHook){
                addExtensionHook((ExtensionHook)definition);
            }
            else if (definition instanceof Section){
                addSection((Section)definition);
            }
            else if (definition instanceof TextualArtifact){
                addTextualArtifact((TextualArtifact)definition);
            }
            else if (definition instanceof TdlModule){
                addTdlModule((TdlModule)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpSummaryMethod(DSDArtifactFormatter.java:379)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(TdlDefinitionDefs.summary());
        sb.append(ContainedElementDefs.summary());
        sb.append(SectionDefs.summary());
        sb.append(ExtensionHookDefs.summary());
        sb.append(TextualArtifactDefs.summary());
        sb.append(TdlModuleDefs.summary());
       return(sb.toString());
    }

}

