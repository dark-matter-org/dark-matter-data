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
package org.dmd.dms.generated.dmw;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1637)
import java.util.*;                           // To support access functions - (MetaGenerator.java:1610)
import org.dmd.dmc.*;                         // Basic dark-matter infrastructure - (MetaGenerator.java:1612)
import org.dmd.dmc.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1611)
import org.dmd.dms.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1614)
import org.dmd.dms.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dmw.*;                         // Base wrapper capabilities - (MetaGenerator.java:1613)
import org.dmd.util.exceptions.*;             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)

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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1646)
 */
@SuppressWarnings("unused")
public abstract class DSDefinitionDMW extends DmwNamedObjectWrapper {

    private DSDefinitionDMO mycore;

    protected DSDefinitionDMW() {
        super(new DSDefinitionDMO());
        mycore = (DSDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (DSDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DSDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  DSDefinitionDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2616)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A comment or note associated with the definition of something. For\n code
     * that's generated from a definition, comments may be added to the code, as
     * opposed to \n descriptions which are meant to assist in generating
     * documentation. In the end, it's up to\n the designer of a DSL to determine
     * how comments are used. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__comment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another comment value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addComment(Object value) throws DmcValueException {
        mycore.addComment(value);
    }

    /**
     * Returns the number of comment values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getCommentSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__comment);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A question associated with the definition of something. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getQuestion(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__question);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another question value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addQuestion(Object value) throws DmcValueException {
        mycore.addQuestion(value);
    }

    /**
     * Returns the number of question values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getQuestionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__question);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) mycore.get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addExample(Object value) throws DmcValueException {
        mycore.addExample(value);
    }

    /**
     * Returns the number of example values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getExampleSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__example);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something.\n For longer explanations, use the description attribute. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public String getHint(){
        return(mycore.getHint());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setHint(Object value) throws DmcValueException {
        mycore.setHint(value);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public DotName getSortName(){
        return(mycore.getSortName());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setSortName(Object value) throws DmcValueException {
        mycore.setSortName(value);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addTags(Object value) throws DmcValueException {
        mycore.addTags(value);
    }

    /**
     * Returns the number of tags values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getTagsSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__tags);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) mycore.get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addNvp(Object value) throws DmcValueException {
        mycore.addNvp(value);
    }

    /**
     * Returns the number of nvp values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getNvpSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__nvp);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Depending on what you're modelling, you often come across\n places where
     * you can see an opportunity to optimize, streamline or improve something
     * e.g. merging\n concepts together, representing something differently,
     * adding a relationship - whatever.\n However, these ideas often get lost in
     * the shuffle or, if you add them into an overall\n description of
     * something, they don't stand out.\n <p/>\n Any dark-matter definition can
     * be decorated with optimize notes. These notes provide 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addOptimize(Object value) throws DmcValueException {
        mycore.addOptimize(value);
    }

    /**
     * Returns the number of optimize values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getOptimizeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__optimize);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The version at which something was introduced. Version names\n are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral\n sort order that increases. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public String getVersion(){
        return(mycore.getVersion());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setVersion(Object value) throws DmcValueException {
        mycore.setVersion(value);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included\n in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2602)
    public Iterator<String> getSkip(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__skip);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another skip value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2682)
    public void addSkip(Object value) throws DmcValueException {
        mycore.addSkip(value);
    }

    /**
     * Returns the number of skip values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getSkipSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__skip);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The version at which something became obsolete. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public String getObsolete(){
        return(mycore.getObsolete());
    }

    /**
     * Sets obsolete to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setObsolete(Object value) throws DmcValueException {
        mycore.setObsolete(value);
    }

    /**
     * An indication of why something was added to a specification or a system.\n
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context.\n Due to the fact that it is a weak
     * reference, you may also just put in free form text, since it\n will simply
     * be treated as an unresolved reference. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public Concinnity getWhy(){
        DmcTypeConcinnityREFSV attr = (DmcTypeConcinnityREFSV) mycore.get(MetaDMSAG.__why);
        if (attr == null)
            return(null);
        ConcinnityDMO obj = attr.getSV().getObject();
        return((Concinnity)obj.getContainer());
    }

    /**
     * Sets why to the specified value.
     * @param value A value compatible with Concinnity
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2453)
    public void setWhy(Concinnity value) throws DmcValueException {
        mycore.setWhy(value.getDmcObject());
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2453)
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public DotName getDotName(){
        return(mycore.getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setDotName(Object value) throws DmcValueException {
        mycore.setDotName(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1807)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
