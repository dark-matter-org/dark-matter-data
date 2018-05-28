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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:158)
import java.util.Collection;                                                     // To return values from indices - (DSDArtifactFormatter.java:153)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:132)
import java.util.TreeMap;                                                        // To organize access to our indices - (DSDArtifactFormatter.java:152)
import org.dmd.dmc.DmcAttributeInfo;                                             // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcClassInfo;                                                 // The class info for our indices - (DSDArtifactFormatter.java:154)
import org.dmd.dmc.DmcNameClashException;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashObjectSet;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObject;                                                    // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObjectName;                                                // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcValueException;                                            // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcValueExceptionSet;                                         // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dms.DSDefinition;                                                 // The base of all definitions - (DSDArtifactFormatter.java:130)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;                          // A definition from the ModuleA Module - (DSDArtifactFormatter.java:414)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:410)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:414)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:414)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:407)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                      // To allow use of DmcClassInfo from the dsdA schema for index access - (DSDArtifactFormatter.java:150)
import org.dmd.dmw.DmwNamedObjectWrapper;                                        // What we return from getIndex() - (DSDArtifactFormatter.java:155)
import org.dmd.util.exceptions.ResultException;                                  // When deletion problems occur - (DSDArtifactFormatter.java:144)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:162)
public class ModuleADefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, ModuleAGlobalInterface {

    private DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:433)
    private DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    private DmcDefinitionSet<ABConceptX> ABConceptXDefs;
    private DmcDefinitionSet<AConceptX> AConceptXDefs;
    private DmcDefinitionSet<ModuleA> ModuleADefs;

    private TreeMap<DmcClassInfo,DmcDefinitionSet<?>>	indicesByClass;

    public ModuleADefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:460)
        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>("AConceptBase", allDefinitions);
        indicesByClass.put(DsdADMSAG.__AConceptBase, AConceptBaseDefs);

        AConceptXDefs = new DmcDefinitionSet<AConceptX>("AConceptX", allDefinitions, AConceptBaseDefs);
        indicesByClass.put(DsdADMSAG.__AConceptX, AConceptXDefs);

        ABConceptXDefs = new DmcDefinitionSet<ABConceptX>("ABConceptX", allDefinitions, AConceptXDefs);
        indicesByClass.put(DsdADMSAG.__ABConceptX, ABConceptXDefs);

        ModuleADefs = new DmcDefinitionSet<ModuleA>("ModuleA", allDefinitions, AConceptBaseDefs);
        indicesByClass.put(DsdADMSAG.__ModuleA, ModuleADefs);


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
                        AConceptBase def = (AConceptBase) it.next();
                        ex.addMoreInfo(def.getDefinedInModuleA().getName().getNameString() + "." + name.getNameString());
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
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
    }

    public int getAConceptBaseCount(){
        return(AConceptBaseDefs.size());
    }

    public AConceptBase getAConceptBase(DotName name){
        return(AConceptBaseDefs.getDefinition(name));
    }

    public Iterator<AConceptBase> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addABConceptX(ABConceptX def){
        ABConceptXDefs.add(def);
        addAConceptX(def);
    }

    public int getABConceptXCount(){
        return(ABConceptXDefs.size());
    }

    public ABConceptX getABConceptX(DotName name){
        return(ABConceptXDefs.getDefinition(name));
    }

    public Iterator<ABConceptX> getAllABConceptX(){
        return(ABConceptXDefs.values().iterator());
    }

    public ABConceptX getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ABConceptXDefs.getDefinition(name));
    }

    public Iterator<ABConceptX> getABConceptXDefinitionsByName(String name) throws DmcValueException{
        return(ABConceptXDefs.getDefinitionsByName(name));
    }

    public int getABConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(ABConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addAConceptX(AConceptX def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
    }

    public int getAConceptXCount(){
        return(AConceptXDefs.size());
    }

    public AConceptX getAConceptX(DotName name){
        return(AConceptXDefs.getDefinition(name));
    }

    public Iterator<AConceptX> getAllAConceptX(){
        return(AConceptXDefs.values().iterator());
    }

    public AConceptX getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(AConceptXDefs.getDefinition(name));
    }

    public Iterator<AConceptX> getAConceptXDefinitionsByName(String name) throws DmcValueException{
        return(AConceptXDefs.getDefinitionsByName(name));
    }

    public int getAConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(AConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:337)
    public void addModuleA(ModuleA def){
        ModuleADefs.add(def);
        addAConceptBase(def);
    }

    public int getModuleACount(){
        return(ModuleADefs.size());
    }

    public ModuleA getModuleA(DotName name){
        return(ModuleADefs.getDefinition(name));
    }

    public Iterator<ModuleA> getAllModuleA(){
        return(ModuleADefs.values().iterator());
    }

    public ModuleA getModuleADefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleADefs.getDefinition(name));
    }

    public Iterator<ModuleA> getModuleADefinitionsByName(String name) throws DmcValueException{
        return(ModuleADefs.getDefinitionsByName(name));
    }

    public int getModuleADefinitionCountByName(String name) throws DmcValueException{
        return(ModuleADefs.getDefinitionCountByName(name));
    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethod(DSDArtifactFormatter.java:340)
    public void addDefinition(DSDefinition definition){
            if (definition instanceof ABConceptX){
                addABConceptX((ABConceptX)definition);
            }
            else if (definition instanceof AConceptX){
                addAConceptX((AConceptX)definition);
            }
            else if (definition instanceof ModuleA){
                addModuleA((ModuleA)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpSummaryMethod(DSDArtifactFormatter.java:379)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(AConceptBaseDefs.summary());
        sb.append(AConceptXDefs.summary());
        sb.append(ABConceptXDefs.summary());
        sb.append(ModuleADefs.summary());
       return(sb.toString());
    }

}

