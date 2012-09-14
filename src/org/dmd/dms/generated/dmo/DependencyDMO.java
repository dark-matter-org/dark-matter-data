//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1835)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1788)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1790)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1812)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1802)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1824)


/**
 * The Dependency class allows for the definition of a named dependency
 on
 * something; usually an interface. In the current schema mechanisms, the
 * only place
 that this mechanism is used is in the specification of
 * RuleDefinitions. Rule instances are
 created by injecting RuleData into a
 * rule implementation. If the rule implementation
 has dependencies on other
 * objects, those dependencies are specified via references to

 * Dependencies.
 <p/>
 A Dependency can be referred to via a RunContext
 * definition which directs the generation
 of code that can instantiate the
 * required object instances. Satisfying a Dependency relies
 on there being
 * a DependencyImplementation that indicates how to instantiate the object

 * that implements the interface defined by the dependency.
 <p/>
 If a
 * Dependency specifies an instantiation, this is considered the default
 * mechanism to
 fulfill the dependency. Other DependencyImplementations may
 * be specified that override
 the specified instantiation in particular
 * contexts.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1845)
 */
@SuppressWarnings("serial")
public class DependencyDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__useInterface.id,MetaDMSAG.__useInterface);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__dependencies.id,MetaDMSAG.__dependencies);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__instantiation.id,MetaDMSAG.__instantiation);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__useInterface.name,MetaDMSAG.__useInterface);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__dependencies.name,MetaDMSAG.__dependencies);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__instantiation.name,MetaDMSAG.__instantiation);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
    }


    public DependencyDMO(){
        super("Dependency");
    }

    public DependencyDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DependencyDMO getNew(){
        DependencyDMO rc = new DependencyDMO();
        return(rc);
    }

    @Override
    public DependencyDMO getSlice(DmcSliceInfo info){
        DependencyDMO rc = new DependencyDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name
 for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace
 characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * The fully qualified name of a Java interface or base class that specifies
     * a dependency.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public String getUseInterface(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__useInterface);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setUseInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__useInterface);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__useInterface);
        
        attr.set(value);
        set(MetaDMSAG.__useInterface,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * A set of references to Dependencies.
     * @return An Iterator of DependencyDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2382)
    public Iterator<DependencyREF> getDependencies(){
        DmcTypeDependencyREFMV attr = (DmcTypeDependencyREFMV) get(MetaDMSAG.__dependencies);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependencies value.
     * @param value A value compatible with DmcTypeDependencyREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2444)
    public DmcAttribute<?> addDependencies(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependencies);
        if (attr == null)
            attr = new DmcTypeDependencyREFMV(MetaDMSAG.__dependencies);
        
        attr.add(value);
        add(MetaDMSAG.__dependencies,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The instantiation attribute specifies how something is to be instantiated.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public String getInstantiation(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__instantiation);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets instantiation to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setInstantiation(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__instantiation);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__instantiation);
        
        attr.set(value);
        set(MetaDMSAG.__instantiation,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
