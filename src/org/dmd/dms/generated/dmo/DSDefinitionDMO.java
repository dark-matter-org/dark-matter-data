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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1938)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1887)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1889)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1911)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1901)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1927)



/**
 * The domain specific definition (DSDefinition) forms the basis for all
 * definitions\n that use dark-matter as their basis. The initial dark-matter
 * mechanisms were focussed only on \n schema for data objects, but, as the
 * project developed, other, domain specific sets of definitions\n were
 * added. Eventually, a pattern emerged in terms of these various sets of
 * definitions and\n some additional higher order concepts were introduced to
 * make the creation of new, domain specific\n definition sets easier and to
 * allow them to build on and use each others' definitions in a \n coherent
 * manner.\n <p/>\n For instance, the Model View Whatever (MVW) framework,
 * builds on the dark-matter schema \n concepts and introduces definitions
 * that align with the Google Web Toolkit (GWT) conceptual model\n of the
 * elements that comprise GWT applications and the various relationships that
 * exist between\n them. The infrastructure needed to parse, manage and use
 * those definitions to generate code\n and documentation are very similar to
 * those used in the base dark-matter schema mechanisms, but\n they had to be
 * hand built for the domain.\n <p/>\n Other kinds of domain specific
 * definitions started to emerge, Google Protocol Buffer (GPB),\n Simple
 * Network Management Protocol (SNMP) etc. Having to build the infrastructure
 * for these \n definitions each time was tedious and, in the spirit of the
 * rest of dark-matter, lent themselves\n to being defined, generated and
 * extended to make the process the easier.\n <p/>\n Likewise, the code
 * generation mechanisms originally employed have evolved and the more
 * generic\n concept of artifact generation, based on definition sets, was
 * introduced to allow for more rapid\n creation of utilities that generate
 * code or documentation or other types of specifications. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1948)
 */
@SuppressWarnings("serial")
public class DSDefinitionDMO extends DmcObject implements DmcNamedObjectIF, Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
    }


    public DSDefinitionDMO(){
        super("DSDefinition");
    }

    public DSDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DSDefinitionDMO getNew(){
        DSDefinitionDMO rc = new DSDefinitionDMO();
        return(rc);
    }

    @Override
    public DSDefinitionDMO getSlice(DmcSliceInfo info){
        DSDefinitionDMO rc = new DSDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2557)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addExample(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaDMSAG.__example);
        
        attr.add(value);
        add(MetaDMSAG.__example,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setSortName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2131)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public DefinitionName getObjectName(){
        DmcTypeDefinitionName attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        return(attr);
    }

}
