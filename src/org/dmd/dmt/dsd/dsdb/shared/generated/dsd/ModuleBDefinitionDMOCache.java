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
package org.dmd.dmt.dsd.dsdb.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:92)
import java.util.Iterator;                                                       // To allow access to our definitions - (DmoCacheFormatter.java:79)
import org.dmd.dmc.DmcAttributeInfo;                                             // Used when resolving clashes - (DmoCacheFormatter.java:88)
import org.dmd.dmc.DmcNameClashException;                                        // Used when resolving clashes - (DmoCacheFormatter.java:90)
import org.dmd.dmc.DmcNameClashObjectSet;                                        // Used when resolving clashes - (DmoCacheFormatter.java:89)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support object resolution - (DmoCacheFormatter.java:81)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support object resolution - (DmoCacheFormatter.java:82)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object resolution - (DmoCacheFormatter.java:83)
import org.dmd.dmc.DmcObject;                                                    // To support object resolution - (DmoCacheFormatter.java:84)
import org.dmd.dmc.DmcObjectName;                                                // To support object resolution - (DmoCacheFormatter.java:85)
import org.dmd.dmc.DmcValueException;                                            // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:87)
import org.dmd.dmc.DmcValueExceptionSet;                                         // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:86)
import org.dmd.dmc.definitions.DMODefinitionSet;                                 // Our base to provide definition set storage - (DmoCacheFormatter.java:78)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DmoCacheFormatter.java:80)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                                // The base of all definitions - (DmoCacheFormatter.java:77)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO;                  // A definition from the ModuleA Module - (DmoCacheFormatter.java:234)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;                // A definition from the ModuleA Module - (DmoCacheFormatter.java:230)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO;                   // A definition from the ModuleA Module - (DmoCacheFormatter.java:234)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                     // A definition from the ModuleA Module - (DmoCacheFormatter.java:234)
import org.dmd.dmt.dsd.dsda.shared.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DmoCacheFormatter.java:227)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;                // A definition from the ModuleB Module - (DmoCacheFormatter.java:230)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptXDMO;                   // A definition from the ModuleB Module - (DmoCacheFormatter.java:234)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;                     // A definition from the ModuleB Module - (DmoCacheFormatter.java:234)
import org.dmd.dmt.dsd.dsdb.shared.generated.dsd.ModuleBGlobalInterface;         // Interface for ModuleB definitions - (DmoCacheFormatter.java:227)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:96)
public class ModuleBDefinitionDMOCache implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, ModuleAGlobalInterface, ModuleBGlobalInterface {

    DMODefinitionSet<DSDefinitionDMO>	allDefinitions;

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionManagerMembers(DmoCacheFormatter.java:291)
    DMODefinitionSet<AConceptBaseDMO> AConceptBaseDefs;
    DMODefinitionSet<ABConceptXDMO> ABConceptXDefs;
    DMODefinitionSet<AConceptXDMO> AConceptXDefs;
    DMODefinitionSet<ModuleADMO> ModuleADefs;
    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionManagerMembers(DmoCacheFormatter.java:291)
    DMODefinitionSet<BConceptBaseDMO> BConceptBaseDefs;
    DMODefinitionSet<BConceptXDMO> BConceptXDefs;
    DMODefinitionSet<ModuleBDMO> ModuleBDefs;

    public ModuleBDefinitionDMOCache(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DMODefinitionSet<DSDefinitionDMO>("allDefinitions");

        // Generated from: org.dmd.dms.util.DmoCacheFormatter.initializeDefinitionManagerMembers(DmoCacheFormatter.java:303)
        AConceptBaseDefs = new DMODefinitionSet<AConceptBaseDMO>("AConceptBase", allDefinitions);
        ABConceptXDefs = new DMODefinitionSet<ABConceptXDMO>("ABConceptX", allDefinitions);
        AConceptXDefs = new DMODefinitionSet<AConceptXDMO>("AConceptX", allDefinitions);
        ModuleADefs = new DMODefinitionSet<ModuleADMO>("ModuleA", allDefinitions);
        BConceptBaseDefs = new DMODefinitionSet<BConceptBaseDMO>("BConceptBase", allDefinitions);
        BConceptXDefs = new DMODefinitionSet<BConceptXDMO>("BConceptX", allDefinitions);
        ModuleBDefs = new DMODefinitionSet<ModuleBDMO>("ModuleB", allDefinitions);

    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:113)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinitionDMO def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:121)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinitionDMO def = null;
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

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:137)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:142)
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinitionDMO def = null;
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

        return(def);
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:162)
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
                        BConceptBaseDMO def = (BConceptBaseDMO) it.next();
                        ex.addMoreInfo(def.getDefinedInModuleB().getName().getNameString() + "." + name.getNameString());
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

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:193)
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinitionDMO resolving = (DSDefinitionDMO) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinitionDMO def = (DSDefinitionDMO) it.next();
            if (resolving.getDmoFromModule().equals(def.getDmoFromModule())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:368)
    // Called from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionInterfaceMethods(DmoCacheFormatter.java:325)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBaseDMO def){
        AConceptBaseDefs.add(def);
    }

    public int getAConceptBaseCount(){
        return(AConceptBaseDefs.size());
    }

    public AConceptBaseDMO getAConceptBase(DotName name){
        return(AConceptBaseDefs.getDefinition(name));
    }

    public Iterator<AConceptBaseDMO> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:403)
    public void addABConceptX(ABConceptXDMO def){
        ABConceptXDefs.add(def);
        addAConceptX(def);
    }

    public int getABConceptXCount(){
        return(ABConceptXDefs.size());
    }

    public ABConceptXDMO getABConceptX(DotName name){
        return(ABConceptXDefs.getDefinition(name));
    }

    public Iterator<ABConceptXDMO> getAllABConceptX(){
        return(ABConceptXDefs.values().iterator());
    }

    public ABConceptXDMO getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ABConceptXDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:403)
    public void addAConceptX(AConceptXDMO def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
    }

    public int getAConceptXCount(){
        return(AConceptXDefs.size());
    }

    public AConceptXDMO getAConceptX(DotName name){
        return(AConceptXDefs.getDefinition(name));
    }

    public Iterator<AConceptXDMO> getAllAConceptX(){
        return(AConceptXDefs.values().iterator());
    }

    public AConceptXDMO getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(AConceptXDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:403)
    public void addModuleA(ModuleADMO def){
        ModuleADefs.add(def);
        addAConceptBase(def);
    }

    public int getModuleACount(){
        return(ModuleADefs.size());
    }

    public ModuleADMO getModuleA(DotName name){
        return(ModuleADefs.getDefinition(name));
    }

    public Iterator<ModuleADMO> getAllModuleA(){
        return(ModuleADefs.values().iterator());
    }

    public ModuleADMO getModuleADefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleADefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:368)
    // Called from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionInterfaceMethods(DmoCacheFormatter.java:325)
    /**
     * All definitions are added to the base definition collection.
     */
    void addBConceptBase(BConceptBaseDMO def){
        BConceptBaseDefs.add(def);
    }

    public int getBConceptBaseCount(){
        return(BConceptBaseDefs.size());
    }

    public BConceptBaseDMO getBConceptBase(DotName name){
        return(BConceptBaseDefs.getDefinition(name));
    }

    public Iterator<BConceptBaseDMO> getAllBConceptBase(){
        return(BConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:403)
    public void addBConceptX(BConceptXDMO def){
        BConceptXDefs.add(def);
        addBConceptBase(def);
    }

    public int getBConceptXCount(){
        return(BConceptXDefs.size());
    }

    public BConceptXDMO getBConceptX(DotName name){
        return(BConceptXDefs.getDefinition(name));
    }

    public Iterator<BConceptXDMO> getAllBConceptX(){
        return(BConceptXDefs.values().iterator());
    }

    public BConceptXDMO getBConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(BConceptXDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:403)
    public void addModuleB(ModuleBDMO def){
        ModuleBDefs.add(def);
        addBConceptBase(def);
    }

    public int getModuleBCount(){
        return(ModuleBDefs.size());
    }

    public ModuleBDMO getModuleB(DotName name){
        return(ModuleBDefs.getDefinition(name));
    }

    public Iterator<ModuleBDMO> getAllModuleB(){
        return(ModuleBDefs.values().iterator());
    }

    public ModuleBDMO getModuleBDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleBDefs.getDefinition(name));
    }


}

