//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dms.meta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.dms.types.EnumValue;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;


/**
 * The MetaGenerator class is used to bootstrap the entire GDO mechanism by
 * generating the initial schema definition mechanism classes from a standard
 * Data Model Definition (DMD) description.
 */
public class MetaGenerator implements DmcUncheckedOIFHandlerIF {
	
	// Offset to the source directory for the meta generator
	private final static String METADIR = "/src/org/dmd/dms/meta";
	
	// Offset to the source directory for the meta generator
//	private final static String GENDIR = "/src/org/dmd/dms/generated";
	
	// Offset to the source directory for dark matter wrappers
	private final static String DMWDIR = "/src/org/dmd/dms/generated/dmw";
	
	// Offset to the source directory for dark matter wrappers
	private final static String ENUMDIR = "/src/org/dmd/dms/generated/enums";
	
	// Offset to the Dark Matter Object generation directory
	private final static String DMODIR = "/src/org/dmd/dms/generated/dmo";
	
	// Offset to the generated types
	private final static String TYPEDIR = "/src/org/dmd/dms/generated/types";
	
	// Offset to the gdo source directory
	private final static String DMSDIR = "/src/org/dmd/dms";
	
	private StringBuffer LGPL;
	
	// All definitions of the metaschema
	TreeMap<String,DmcUncheckedObject>	allDefs;

	// Type definitions
	TreeMap<String,DmcUncheckedObject>	typeDefs;

	// Enumeration definitions
	TreeMap<String,DmcUncheckedObject>	enumDefs;

	// Attribute definitions
	TreeMap<String,DmcUncheckedObject>	attributeDefs;

	// Class definitions
	TreeMap<String,DmcUncheckedObject>	classDefs;
	
    // Some of the definitions have to be defined in a particular order, so
    // we maintain the order in which they appear in the Dmd file.
    ArrayList<String>   			origOrderClasses;
    ArrayList<String>   			origOrderAttrs;
    ArrayList<String>   			origOrderTypes;
    ArrayList<String>   			origOrderEnums;
	

	// Handle to the source directory name
	String sourceDir;
	
	DmcUncheckedOIFParser	parser;

	public MetaGenerator(){
		allDefs 			= new TreeMap<String,DmcUncheckedObject>();
		typeDefs 			= new TreeMap<String,DmcUncheckedObject>();
		enumDefs 			= new TreeMap<String,DmcUncheckedObject>();
		attributeDefs 		= new TreeMap<String,DmcUncheckedObject>();
		classDefs 			= new TreeMap<String,DmcUncheckedObject>();
		
        origOrderClasses    = new ArrayList<String>();
        origOrderAttrs      = new ArrayList<String>();
        origOrderTypes      = new ArrayList<String>();
        origOrderEnums      = new ArrayList<String>();
		
		parser 				= new DmcUncheckedOIFParser(this);
	}
	
	public void run(String[] args) throws DmcValueException{		
		
        try{
            File curr = new File(".");
            sourceDir = curr.getCanonicalPath() + METADIR;
            
            // Read the license header
            LGPL = new StringBuffer();
            LineNumberReader in = new LineNumberReader(new FileReader(sourceDir + "/LGPL.txt"));
            String str;
            while ((str = in.readLine()) != null) {
            	LGPL.append(str + "\n");
            }
            
            parser.parseFile(sourceDir + "/metaSchema.dms");
            
            createInternalReferenceTypes();
            
            Iterator<DmcUncheckedObject> enums = enumDefs.values().iterator();
            while(enums.hasNext()){
            	dumpEnumClass(curr.getCanonicalPath() + ENUMDIR, enums.next());
            }
            
            dumpDmcTypes(curr.getCanonicalPath() + TYPEDIR);
            
            dumpDMOClasses(curr.getCanonicalPath() + DMODIR);
            
            dumpDMWClasses(curr.getCanonicalPath() + DMWDIR);
            
            dumpMetaSchema(curr.getCanonicalPath() + DMSDIR);
            
        }
        catch(IOException e){
        	System.err.println(e);
        }
        catch(ResultException ex){
        	System.err.println(ex);
        }
	}

	/**
	 * 
	 */
	public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException {
		String 	objClass = obj.classes.get(0);
		String	name;
		
		name = obj.getSV("name");
		
		if (name == null){
			ResultException ex = new ResultException("No name for object: " + objClass);
			ex.result.lastResult().lineNumber(obj.lineNumber);
			throw(ex);
		}
		
		if (objClass.equals("TypeDefinition")){
			typeDefs.put(name, obj);
			origOrderTypes.add(name);
		}
		else if (objClass.equals("EnumDefinition")){
			enumDefs.put(name, obj);
			origOrderEnums.add(name);
		}
		else if (objClass.equals("AttributeDefinition")){
			attributeDefs.put(name, obj);
			origOrderAttrs.add(name);
		}
		else if (objClass.equals("ClassDefinition")){
			classDefs.put(name, obj);
			origOrderClasses.add(name);
		}
		else{
			ResultException ex = new ResultException("Unknown definition type: " + objClass);
			ex.result.lastResult().lineNumber(obj.lineNumber);
		}
		
		allDefs.put(name, obj);
		
	}
	
	/**
	 * In order to allow for references to our classes, we create TypeDefinitions for each 
	 * ClassDefinition. 
	 */
	void createInternalReferenceTypes() throws ResultException {
		Iterator<DmcUncheckedObject> it = classDefs.values().iterator();
		while(it.hasNext()){
			DmcUncheckedObject 		classDef = it.next();
			
			String cn = classDef.getSV("name");
			String isNamedBy = classDef.getSV("isNamedBy");
			String				tn 		= null;
			DmcUncheckedObject	typeDef = null;
			
			if (isNamedBy == null){
// TODO: removed this for DmwWrapper for now
//				tn = cn + "Reference";
//				ArrayList<String> 	objClasses = new ArrayList<String>();
//				objClasses.add("TypeDefinition");
//				typeDef = new DmcUncheckedObject(objClasses,0);
//				typeDef.addValue("name", tn);
//				typeDef.addValue("typeClassName", "org.dmd.dms.generated.types.DmcType" + cn);
//				typeDef.addValue("primitiveType", "org.dmd.dms." + cn);
//				typeDef.addValue("description",   "This is an internally generated type to allow references to " + cn + " objects.");
//				
//				typeDefs.put(tn, typeDef);
//				origOrderTypes.add(tn);

			}
			else{
				tn = cn + "Reference";
				ArrayList<String> 	objClasses = new ArrayList<String>();
				objClasses.add("TypeDefinition");
				typeDef = new DmcUncheckedObject(objClasses,0);
				typeDef.addValue("name", cn + "Reference");
				typeDef.addValue("typeClassName", "org.dmd.dms.generated.types.DmcType" + cn + "REF");
				typeDef.addValue("wrapperClassName", classDef.getSV("javaClass"));
				typeDef.addValue("internallyGenerated", "true");
				typeDef.addValue("isRefType", "true");
				typeDef.addValue("description", "This is an internally generated type to allow references to " + cn + " objects.");
				typeDef.addValue("originalClass", cn);
				
				typeDefs.put(tn, typeDef);
				origOrderTypes.add(tn);
			}
		}
		Iterator<DmcUncheckedObject> ite = enumDefs.values().iterator();
		while(ite.hasNext()){
			DmcUncheckedObject 		enumDef = ite.next();
			String cn = enumDef.getSV("name");
			String tn = cn + "Reference";
			ArrayList<String> 	objClasses = new ArrayList<String>();
			objClasses.add("TypeDefinition");
			DmcUncheckedObject 		typeDef = new DmcUncheckedObject(objClasses,0);
			typeDef.addValue("name", cn + "Reference");
			typeDef.addValue("typeClassName", "org.dmd.dms.generated.types.DmcType" + cn);
			typeDef.addValue("internallyGenerated", "true");
			// Need to know if it's an enum type so that we can set values properly later
			typeDef.addValue("isEnumType", "true");
			typeDef.addValue("description", "This is an internally generated type to allow references to " + cn + " objects.");

			typeDefs.put(tn, typeDef);
			origOrderTypes.add(tn);
		}
	}
	
    /**
     * This method dumps a Java enum for the specified type definition.
     * @param od      The output directory.
     * @param enumObj The enumeration definition object.
     * @throws IOException If we have problems dumping to the file.
     * @throws ResultException 
     * @throws DmcValueException 
     */
    private void dumpEnumClass(String od, DmcUncheckedObject enumObj) throws IOException, ResultException, DmcValueException {
        DmcTypeString					al      		= null;
        BufferedWriter  			enumClassDef	= null;
        TreeMap<Integer,EnumValue>	byId			= new TreeMap<Integer,EnumValue>();	
        TreeMap<String,EnumValue>	byName			= new TreeMap<String,EnumValue>();	
        
        String cp = "org.dmd.dms";
        String cn = enumObj.getSV("name");
        
        // Get the enumValues attribute
        if ( (al = (DmcTypeString) enumObj.get("enumValue")) == null){
            System.out.println("Couldn't get enumValues from:\n" + enumObj);
            return;
        }
        
        for(int i=0; i<al.getMVSize(); i++){
        	EnumValue ev = new EnumValue(al.getMVnth(i));
        	
        	if (byId.get(ev.getId()) != null){
        		ResultException ex = new ResultException();
        		ex.addError("Duplicate enum id: " + ev.getId());
        		ex.result.lastResult().lineNumber(enumObj.lineNumber);
        		throw(ex);
        	}
        	byId.put(ev.getId(), ev);
        	
        	if (byName.get(ev.getName()) != null){
        		ResultException ex = new ResultException();
        		ex.addError("Duplicate enum name: " + ev.getName());
        		ex.result.lastResult().lineNumber(enumObj.lineNumber);
        		throw(ex);
        	}
        	byName.put(ev.getName(), ev);
        }

DebugInfo.debug("Generating: " + od + File.separator + cn + ".java");
        enumClassDef = new BufferedWriter(new FileWriter(od + File.separator + cn + ".java"));

        enumClassDef.write(LGPL.toString());
        enumClassDef.write("package " + cp + ".generated.enums;\n\n");

        enumClassDef.write("import java.util.*;\n\n");

        enumClassDef.write("/**\n * The " + cn + " enumeration.\n");
        enumClassDef.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
        enumClassDef.write(" * manually.\n");
        enumClassDef.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        enumClassDef.write(" */\n");
        enumClassDef.write("public enum " + cn + "\n{\n");

        Iterator<EnumValue> enumit = byId.values().iterator();
        while(enumit.hasNext()){
        	EnumValue ev = enumit.next();
        	
            enumClassDef.write("    /**\n");
            this.dumpCodeComment(ev.getDescription(),enumClassDef,"     * ");
            enumClassDef.write("     */\n");
            
            enumClassDef.write("    " + ev.getName() + "(" + ev.getId() + ")");
            if (enumit.hasNext())
            	enumClassDef.write(",\n\n");
            else
            	enumClassDef.write(";\n\n");
        }
        
        enumClassDef.write("    // Maps our integer value to the enumeration value\n");
        enumClassDef.write("    private static final Map<Integer," + cn + "> lookup = new HashMap<Integer," + cn + ">();\n\n");

        enumClassDef.write("    static {\n");
      	enumClassDef.write("        for(" + cn + " s : EnumSet.allOf(" + cn + ".class))\n");
      	enumClassDef.write("            lookup.put(s.intValue(), s);\n");
     	enumClassDef.write("    }\n\n");
        
        enumClassDef.write("    // Maps our enumeration (string) value to the enumeration value\n");
        enumClassDef.write("    private static final Map<String," + cn + "> lookupString = new HashMap<String, " + cn + ">();\n\n");

        enumClassDef.write("    static {\n");
      	enumClassDef.write("        for(" + cn + " s : EnumSet.allOf(" + cn + ".class))\n");
      	enumClassDef.write("            lookupString.put(s.name(), s);\n");
     	enumClassDef.write("    }\n\n");
        
        enumClassDef.write("    // Our current value as an int - normally, this isn't available in an enum\n");
        enumClassDef.write("    private int ival;\n\n");
        
        enumClassDef.write("    /**\n");
        enumClassDef.write("     * This private constructor allows us to access our int value when required.\n");
        enumClassDef.write("     */\n");
        enumClassDef.write("    private " + cn + "(int i){\n");
        enumClassDef.write("        ival = i;\n");
        enumClassDef.write("    }\n\n");
        
        enumClassDef.write("    /**\n");
        enumClassDef.write("     * Returns the value of this enum value as an int.\n");
        enumClassDef.write("     */\n");
        enumClassDef.write("    public int intValue(){\n");
        enumClassDef.write("        return(ival);\n");
        enumClassDef.write("    }\n\n");
        
        enumClassDef.write("    /**\n");
        enumClassDef.write("     * Returns the enum value of the specified int or null if it's not valid.\n");
        enumClassDef.write("     */\n");
        enumClassDef.write("    public static " + cn + " get(int code) {\n");
        enumClassDef.write("        return(lookup.get(code));\n"); 
        enumClassDef.write("    }\n\n");
       
        enumClassDef.write("    /**\n");
        enumClassDef.write("     * Returns a value for this enum or throws an exception if the String value isn't\n");
        enumClassDef.write("     * a valid member of this enum.\n");
        enumClassDef.write("     */\n");
        enumClassDef.write("    public static " + cn + " get(String str) {\n");
        enumClassDef.write("        return(lookupString.get(str));\n");
      	enumClassDef.write("    }\n\n");
        
        enumClassDef.write("}");
        enumClassDef.close();
    }
    	

	
    /**
     * This function dumps the description of a class as a code comment. Long lines are
     * folded to 75 characters.
     * @param comment The comment to be written
     * @out The place to write the output
     * @indent A string that is written at the beginning of each line to indent it
     */
   private void dumpCodeComment(String comment, BufferedWriter out, String indent){
       StringBuffer sb = new StringBuffer();
       int             offset;

       sb.append(comment);
       try {
           while(sb.length() > 75){
               offset = 74;
               // Move back until we find a space
               while(sb.charAt(offset) != ' '){
                   offset--;
               }

               out.write(indent);
               for(int i=0;i<offset;i++){
                   out.write(sb.charAt(i));
               }
               out.write("\n");
               // The subString(int,int) method seems to be missing
               // out.write(" * " + sb.subString(start,offset) + "\n");
               sb.delete(0,offset+1);
           }
           out.write(indent + sb + "\n");
       } catch (IOException e) {
           System.out.println("IO Error:\n" + e);
       }
   }

	void dumpMetaSchema(String od) throws IOException, ResultException  {
        BufferedWriter 	out = null;
        PrintfFormat 	pf	= null;
        
        out = new BufferedWriter(new FileWriter(od + "/MetaSchemaAG.java"));
        
        out.write(LGPL.toString());
        out.write("package org.dmd.dms;\n\n");

        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dms.generated.enums.*;\n");

        out.write("\n");

        out.write("/**\n");
        out.write("  * This class creates the basic definitions that allow for the definition of schemas.\n");
        out.write("  * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("  */\n");

        out.write("abstract public class MetaSchemaAG extends SchemaDefinition {\n");

        out.write("    public static SchemaDefinition    _metaSchema;\n\n");
        
        for(int i=0;i<origOrderClasses.size();i++){
            out.write("    public static ClassDefinition     _" + origOrderClasses.get(i) + ";\n");
        }
        out.write("\n");

        for(int i=0;i<origOrderEnums.size();i++)
            out.write("    public static EnumDefinition      _" + origOrderEnums.get(i) + ";\n");
        out.write("\n");

        for(int i=0;i<origOrderTypes.size();i++)
            out.write("    public static TypeDefinition      _" + origOrderTypes.get(i) + ";\n");
        out.write("\n");

        for(int i=0;i<origOrderAttrs.size();i++)
            out.write("    public static AttributeDefinition _" + origOrderAttrs.get(i) + ";\n");
        out.write("\n");
        
        // METASCHEMA START
        out.write("    public MetaSchemaAG() throws DmcValueException {\n\n");
        out.write("        super(\"metaSchema\");\n\n");
        out.write("        staticRefName = new String(\"MetaSchema._\");\n\n");

        pf = new PrintfFormat("%-28s");

        out.write("        // We only ever want to initialize the schema once, so check\n");
        out.write("        // to see if we've initialized the first class definition\n");
        
        // START INIT METASCHEMA
        out.write("        if (_metaSchema == null){\n");

        
        out.write("            try{\n");
        
        out.write("            // Create the class definitions\n");
        out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        for(int i=0;i<origOrderClasses.size();i++){
        	String defn = origOrderClasses.get(i);
            out.write("            _" + pf.sprintf(defn));
            out.write("= new ClassDefinition(\"" + defn + "\");\n");
        }
        out.write("\n");
        
        
        out.write("            // Create the enum definitions\n");
        out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        for(int i=0;i<origOrderEnums.size();i++){
        	String defn = origOrderEnums.get(i);
            out.write("            _" + pf.sprintf(defn));
            out.write("= new EnumDefinition(\"" + defn + "\");\n");
        }
        out.write("\n");
        
        
        out.write("            // Create the type definitions\n");
        out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        for(int i=0;i<origOrderTypes.size();i++){
        	String defn = origOrderTypes.get(i);
        	
        	
        	DmcUncheckedObject typeObj = typeDefs.get(defn);
        	String typeClassName = typeObj.getSV("typeClassName");
        	String wrapperClassName = typeObj.getSV("wrapperClassName");
            out.write("            _" + pf.sprintf(defn));
            if (wrapperClassName == null)
            	out.write("= new TypeDefinition(\"" + defn + "\", " + typeClassName + ".class);\n");
            else
            	out.write("= new TypeDefinition(\"" + defn + "\", " + typeClassName + ".class, " + wrapperClassName + ".class);\n");
        }
        out.write("\n");
        
        
        out.write("            // Create the attribute definitions\n");
        out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        for(int i=0;i<origOrderAttrs.size();i++){
        	String 			attrName = origOrderAttrs.get(i);
        	String 			mediatorName = null;
        	
        	DmcUncheckedObject 	attrDef  = attributeDefs.get(attrName);
        	String          typeName = attrDef.getSV("type");
        	DmcUncheckedObject 	typeDef  = typeDefs.get(typeName);
        	
	        // If we couldn't find the type by its name, it's because its a reference
	        // to a class or enum, and the actual TypeDefinition name will be _<ClassName>Reference
	        if (typeDef == null){
	            mediatorName = typeName + "Reference";
	        }
	        else{
	            mediatorName = typeName;
	        }
        	
	        out.write("            _" + pf.sprintf(attrName));
	        out.write("= new AttributeDefinition(\"" + attrName + "\", _" + mediatorName + ");\n");
        }
        out.write("\n");
        
        // Set the attribute values on all objects
        out.write("            // Set attribute values on all objects\n");
        out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        
        setAttributeValues(out, typeDefs, pf);
        
        setAttributeValues(out, enumDefs, pf);
        
        setAttributeValues(out, attributeDefs, pf);
        
        setAttributeValues(out, classDefs, pf);
        
        
        out.write("        // Add the definitions to the schema object\n");
        out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        // Set class, type and attribute definition lists of this schema definition
        for(int i=0;i<origOrderClasses.size();i++)
        	out.write("            this.addClassDefList(_" + origOrderClasses.get(i) + ");\n");

        for(int i=0;i<origOrderEnums.size();i++)
            out.write("            this.addEnumDefList(_" + origOrderEnums.get(i) + ");\n");

        for(int i=0;i<origOrderTypes.size();i++)
            out.write("            this.addTypeDefList(_" + origOrderTypes.get(i) + ");\n");

        for(int i=0;i<origOrderAttrs.size();i++)
            out.write("            this.addAttributeDefList(_" + origOrderAttrs.get(i) + ");\n");

        // Set the schema instances' name and description
        out.write("            this.setName(\"metaSchema\");\n");
        out.write("            this.setDescription(\"The metaSchema schema defines the elements used to define schemas.\");\n");

        // Set the prefix for the generated output directory and the generated
        // package prefixes
        out.write("            this.setSchemaPackage(\"org.dmd.dms\");\n");
        out.write("            this.setDmwPackage(\"org.dmd.dms\");\n");
        
        out.write("            this.setSchemaBaseID(0);\n");
        out.write("            this.setSchemaIDRange(200);\n");

        // Set the construction class of this valid object instance
//        out.write("            this.addObjectClass(_SchemaDefinition);\n");
        
        out.write("            }\n");
        out.write("            catch(Exception ex){\n");
        out.write("                ex.printStackTrace();\n");
        out.write("            }\n");
    	
        // END INIT METASCHEMA
        out.write("        }\n\n");

        // METASCHEMA END
        out.write("    }\n\n");

        out.write("}\n\n");
        
        out.close();
	}
	
	private void setAttributeValues(BufferedWriter out, TreeMap<String,DmcUncheckedObject> objects, PrintfFormat pf) throws IOException, ResultException {
		String			attrName	= null;
		String          objName		= null;
		DmcUncheckedObject 	attrDef		= null;
		String          typeName    = null;
		DmcUncheckedObject  typeDef     = null;
		boolean			multiValued	= false;
		boolean         isReference = false;
		boolean         isEnumType  = false;
		
		Iterator<DmcUncheckedObject> it = objects.values().iterator();
		while(it.hasNext()){
			DmcUncheckedObject obj = it.next();
			objName = obj.getSV("name");
			
			
			
			// Set the object class of this definition
//			out.write("            _" + pf.sprintf(objName));
//			out.write(".addObjectClass(_" + obj.classes.get(0) + ");\n");
			
			Iterator<String> attributeNames = obj.getAttributeNames();
			while(attributeNames.hasNext()){
				DmcTypeString attr = (DmcTypeString) obj.get(attributeNames.next());
				attrName = attr.getName();
				if (attrName == null){
					DebugInfo.debug("Attr name null");
					continue;
				}
				attrDef  = attributeDefs.get(attrName);
				multiValued = false;
				isReference	= false;
				isEnumType  = false;
				
				if (attrDef == null){
					ResultException ex = new ResultException();
					ex.addError("Unknown attribute: " + attrName);
					ex.result.lastResult().fileName("metaSchema.dms");
					ex.result.lastResult().lineNumber(obj.lineNumber);
					throw(ex);
				}
				
				// MULTIVALUED 1
//				if (attrDef.getSV("isMultiValued") != null)
				if (attrDef.getSV("valueType") != null)
					multiValued = true;
				
				typeName = attrDef.getSV("type");
				typeDef = typeDefs.get(typeName);
				
				if (typeDef == null){
					// If this is null, we need to look for an internally generated Reference type
					typeDef = typeDefs.get(typeName + "Reference");
					isReference = true;
					
					if (typeDef.getSV("isEnumType") != null)
						isEnumType = true;
				}
				
		    	StringBuffer 	attrNameCapped 	= new StringBuffer();
		    	attrNameCapped.append(attrName);
		    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));
				
				if (attrName.equals("type")){
					// The type attribute has to be handled slightly differently than most attributes
					// to adjust for the fact that we create those internal Reference types to handle
					// references to definitions.
					isReference = false;
					isEnumType  = false;
					typeName = obj.getSV("type");
					typeDef = typeDefs.get(typeName);
					
					if (typeDef == null){
						// If this is null, we need to look for an internally generated Reference type
						typeDef = typeDefs.get(typeName + "Reference");
						isReference = true;
						
						if (typeDef.getSV("isEnumType") != null)
							isEnumType = true;
					}
					
		            out.write("            _" + pf.sprintf(objName));
		            
					out.write(".setType(");
					
					if (isReference){
						out.write("_" + obj.getSV(attrName) + "Reference);\n");
					}
					else{
						out.write("_" + obj.getSV(attrName) + ");\n");
					}
				}
				else{
					if (multiValued){
						
						for(int i=0; i<attr.getMVSize(); i++){
				            out.write("            _" + pf.sprintf(objName));
							out.write(".add" + attrNameCapped + "(");
							
							if (isReference){
								if (isEnumType)
									out.write(typeName + "." + attr.getMVnth(i) + ");\n");
								else
									out.write("_" + attr.getMVnth(i) + ");\n");
							}
							else{
								out.write("\"" + attr.getMVnth(i) + "\");\n");
							}
						}
					}
					else{
			            out.write("            _" + pf.sprintf(objName));
						out.write(".set" + attrNameCapped + "(");
						
						if (isReference){
							if (isEnumType)
								out.write(typeName + "." + obj.getSV(attrName) + ");\n");
							else
								out.write("_" + obj.getSV(attrName) + ");\n");
						}
						else{
							out.write("\"" + obj.getSV(attrName) + "\");\n");
						}
					}
				}
				
			}
            out.write("            _" + pf.sprintf(objName));
            out.write(".setDefinedIn(this);\n");
			
			out.write("\n");
		}
	}

    private void dumpDMWClasses(String dmwdir) throws ResultException {
        DmcUncheckedObject   	go;
        DmcUncheckedObject   	attrObj;
        DmcTypeString 			must;
        DmcTypeString 			may;
        ArrayList<String> 	atlist;
        String          	currAttr;
        String              cn;
        String              classType;
        String				baseClass;
        String				derivedFrom;

        for(int i=0;i<origOrderClasses.size();i++){
            go = (DmcUncheckedObject) classDefs.get(origOrderClasses.get(i));
            
            derivedFrom = go.getSV("derivedFrom");

            System.out.println("*** Formatting class definition for: " + origOrderClasses.get(i));

            if ( (cn = go.getSV("name")) == null){
                System.out.println("Couldn't get name for class definition:\n" + go);
            }
            else{
                try {                	
                    BufferedWriter out = new BufferedWriter(new FileWriter(dmwdir + File.separator + cn + "DMW.java"));
                    
                    out.write(LGPL.toString());
                    out.write("package org.dmd.dms.generated.dmw;\n\n");

                    out.write("import java.util.*;\n\n");

                    out.write("import org.dmd.dmc.types.*;\n");
                    out.write("import org.dmd.dmc.*;\n");
                    if (derivedFrom == null){
                    	out.write("import org.dmd.dmw.*;\n");
                    }
                    
                    if (cn.equals("EnumDefinition")){
                    	out.write("import org.dmd.dms.types.*;\n");
                    }
                    out.write("import org.dmd.dms.generated.dmo.*;\n");
                    out.write("import org.dmd.dms.generated.enums.*;\n");
                    out.write("import org.dmd.dms.generated.types.*;\n");
                    out.write("import org.dmd.util.exceptions.*;\n");
                    out.write("import org.dmd.dms.*;\n");
                    
                    if (cn.equals("ActionTriggerInfo")){
                    	// this is a complete friggin' hack!
                    	out.write("import org.dmd.dms.extended.ActionTriggerInfo;\n");
                    }
//                    out.write("import org.dmd.dms.mediators.*;\n");

                    out.write("\n");

                    out.write("/**\n");
//                    dumpCodeComment(((ArrayList<String>)go.attributes.get("description")).get(0),out," * ");
                    dumpCodeComment(go.getSV("description"),out," * ");
                    
                    out.write(" * @author Auto Generated\n");
                    out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                    out.write(" */\n");
                    out.write("@SuppressWarnings(\"unused\")\n");
                    
                    // See if we're derived from anything. If not, just use DmwWrapperBase as the base class
                    if (derivedFrom == null){
//                    	baseClass = "GenericObject";
                    	baseClass = "DmwWrapperBase";
                    }
                    else{
                    	// Otherwise, we look up the derived from class and use its javaClass
                    	// as the base class
                    	DmcUncheckedObject bc = classDefs.get(derivedFrom);
                    	
                    	if (bc == null){
                    		ResultException ex = new ResultException();
                    		ex.addError("Unknown base class: " + derivedFrom + " for class: " + cn);
                    		ex.result.lastResult().lineNumber(go.lineNumber);
                    		throw(ex);
                    	}
                    	baseClass = bc.getSV("javaClass");
                    }
                    
                    classType = go.getSV("classType");
                    
                    if (classType.equals("ABSTRACT"))
                    	out.write("public abstract class " + cn + "DMW extends " + baseClass + " {\n\n");
                    else
                    	out.write("public class " + cn + "DMW extends " + baseClass + " {\n\n");
                    
                    out.write("    private " + cn + "DMO mycore;\n\n");

                    // All dark matter wrappers have to have a standard constructor that takes no
                    // arguments and constructs the appropriate DMO for the wrapper.
                    out.write("    protected " + cn + "DMW() {\n");
                    out.write("        super(new " + cn + "DMO());\n");
                    out.write("        mycore = (" + cn + "DMO) core;\n");
                    out.write("        mycore.setContainer(this);\n");
                    out.write("    }\n\n");

                    out.write("    protected " + cn + "DMW(DmcObject obj) {\n");
                    out.write("        super(obj);\n");
                    out.write("        mycore = (" + cn + "DMO) core;\n");
                    out.write("        mycore.setContainer(this);\n");
                    out.write("    }\n\n");
                    
                    out.write("    protected " + cn + "DMW(DmcObject obj, ClassDefinition cd) {\n");
                    out.write("        super(obj,cd);\n");
                    out.write("        mycore = (" + cn + "DMO) core;\n");
                    out.write("        mycore.setContainer(this);\n");
                    out.write("    }\n\n");
                    
                    out.write("    @SuppressWarnings(\"unchecked\")\n");
                    out.write("    @Override\n");
                    out.write("    protected ArrayList getAuxDataHolder() {\n");
                    out.write("        return(new ArrayList<" + cn + ">());\n");
                    out.write("    }\n\n");
                    

                    // NOTE: tricky bit here, for all derived classes of DmsDefinition (but not for DmsDefinition itself)
                    // we provide constructors that takes the name of the definition so that the metaname 
                    // in org.dmd.dms.DmsDefinition gets a value. See DmsDefinition for more info.
//                    if (derivedFrom != null){
                    if ((derivedFrom != null) && derivedFrom.equals("DmsDefinition")){
	                    out.write("    protected " + cn + "DMW(ClassDefinition cd) {\n");
	                    out.write("        super(cd);\n");
	                    out.write("    }\n\n");
	                    
                        out.write("    protected " + cn + "DMW(String mn) throws DmcValueException {\n");
                        out.write("        super(new " + cn + "DMO());\n");
                        out.write("        mycore = (" + cn + "DMO) core;\n");
                        out.write("        mycore.setContainer(this);\n");
                        out.write("        mycore.setName(mn);\n");
                        out.write("        metaname = mn;\n");
                        out.write("    }\n\n");
                    }

                    
//                    if (!cn.equals("GdoDefinition")){
                        
                        // This is a specialized constructor used by the generated schema code. It allows for the instantiation
                        // of generated schema instances manually - i.e. not through the default constructor.
                        // We may not need this anymore, but we need it until we get code generation figured out.
//                        out.write("    protected " + cn + "AG(ResultSet rs) {\n");
//                        out.write("        super();\n");
//                        out.write("        if ((MetaSchemaAG._objectClass != null) && (MetaSchemaAG._" + origOrderClasses.get(i) + " != null)){\n");
//                        out.write("            try {\n");
//                        out.write("                \n");
//                        out.write("                this.add(MetaSchemaAG._objectClass,MetaSchemaAG._" + origOrderClasses.get(i) + ");\n");
//                        out.write("            }\n");
//                        out.write("            catch(ResultException ex){\n");
//                        out.write("                MetaSchema.logException(ex);\n");
//                        out.write("            }\n");
//                        out.write("        }\n");
//                        out.write("    }\n\n");

//                    }
                    
                    // Gather the attributes together
                    must 	= (DmcTypeString) go.get("must");
                    may		= (DmcTypeString) go.get("may");
                    atlist 	= new ArrayList<String>();
                    
                    if (must != null){
                    	for(int a=0; a<must.getMVSize(); a++)	
                    		atlist.add(must.getMVnth(a));
                    }
                    
                    if (may != null){
                    	for(int a=0; a<may.getMVSize(); a++)	
                    		atlist.add(may.getMVnth(a));
                    }
                    
//                    atlist = (ArrayList<String>)reqAttrs.get(origOrderClasses.get(i));
                    
                    

                    // Write the attribute access functions
                    for(int j=0;j<atlist.size();j++){
                        currAttr = ((String)atlist.get(j)).trim();

                        out.write("    /**\n");

                        if ( (attrObj = (DmcUncheckedObject)attributeDefs.get(currAttr.trim())) == null){
                        	System.err.println("Missing attribute definition for: " + currAttr.trim() + " in class definition: " + cn);
                        	System.exit(1);
                        }
                        
                        // MULTIVALUED 2
//                        String multiValued = attrObj.getSV("isMultiValued");
                        String multiValued = attrObj.getSV("valueType");
                        
//                        dumpCodeComment(((ArrayList<String>)attrObj.attributes.get("description")).get(0),out,"     * ");
                        dumpCodeComment(attrObj.getSV("description"),out,"     * ");

                        if(multiValued != null){
                        	dumpMVAccessFunction(out, currAttr, false, cn + "DMO");
                        }
                        else{

//                            if (currAttr.equals("name")){
//                            	// NOTE: we don't generate this the GdoDefinitionAG - it's defined on the derived
//                            	// class so that the derived classes can use it.
//                            	if (!cn.equals("DmsDefinition")){
//	                            	// For names, we force it to use the base class getName() function that handles
//	                            	// the metaname properly
//	                            	out.write("     *\n");
//	                            	out.write("     * This method calls the super.getName() in order to work properly with the metaschema.\n");
//	                            	out.write("     */\n");
//	                            	out.write("     public String getName(){\n");
//	                            	out.write("         return(super.getName());\n");
//	                            	out.write("     }\n\n");
//                            	}
//                            }
//                            else{
//	                            if (enumTypes.contains(attrTypes.get(currAttr))){
//	                                out.write("     * @see " + enumTypeCodeNames.get(attrTypes.get(currAttr)) + " The " + enumTypeCodeNames.get(attrTypes.get(currAttr)) + " enumeration for details.\n");
//	                            }
	                            out.write("     */\n");
	                        	dumpSVAccessFunction(out, currAttr, false, cn + "DMO");
//                            }
                        }

                    }
                    out.write("\n");

                    out.write("}\n");

                    out.close();
                } catch (IOException e) {
                    System.out.println("IO Error:\n" + e);
                }
            }
        }
    }
    
    private void dumpDMOClasses(String od) throws ResultException {
        DmcUncheckedObject   	go;
        DmcUncheckedObject   	attrObj;
        DmcTypeString 			must;
        DmcTypeString 			may;
        ArrayList<String> 	atlist;
        String          	currAttr;
        String              cn;
//        String              classType;
        String				baseClass;
        String				derivedFrom;
        String				isNamedBy;
        boolean				isDmsDefinition = false;

        for(int i=0;i<origOrderClasses.size();i++){
            go = (DmcUncheckedObject) classDefs.get(origOrderClasses.get(i));
            
            derivedFrom = go.getSV("derivedFrom");
            isNamedBy = go.getSV("isNamedBy");

            System.out.println("*** Formatting DMO for: " + origOrderClasses.get(i));

            if ( (cn = go.getSV("name")) == null){
                System.out.println("Couldn't get name for class definition:\n" + go);
            }
            else{
                try {                	
                    BufferedWriter out = new BufferedWriter(new FileWriter(od + File.separator + cn + "DMO.java"));

                    out.write(LGPL.toString());
                    out.write("package org.dmd.dms.generated.dmo;\n\n");

//                    if (cn.equals("DmwWrapper")){
//                    	out.write("import java.io.DataOutputStream;\n");
//                    	out.write("import java.io.IOException;\n");
//
//                    }
                    out.write("import java.util.*;\n\n");
                    out.write("import org.dmd.dmc.types.*;\n");
//                    if (derivedFrom == null){
                    	out.write("import org.dmd.dmc.*;\n");
//                    }
                    if (cn.equals("EnumDefinition")){
                    	out.write("import org.dmd.dms.types.*;\n");
                    }

                    out.write("import org.dmd.dms.generated.types.*;\n");
                    out.write("import org.dmd.dms.generated.enums.*;\n");
//                    out.write("import org.dmd.util.exceptions.*;\n");
//                    out.write("import org.dmd.dms.*;\n");

                    out.write("\n");

                    out.write("/**\n");

                    dumpCodeComment(go.getSV("description"),out," * ");
                    
                    out.write(" * @author Auto Generated\n");
                    out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                    out.write(" */\n");
                    
                    if (cn.equals("ClassDefinition"))
                    	out.write("@SuppressWarnings({\"serial\"})\n");
                    else
                    	out.write("@SuppressWarnings({\"unused\", \"serial\"})\n");
                    
                    // See if we're derived from anything. If not, just use generic object as the base.
                    // The only case of this is the DmsDefinition object and we have to do some additional
                    // stuff when we generate the DmsDefinition
                    
//                    if (derivedFrom == null){
//                    	baseClass = "DmcObject implements DmcNamedObjectIF";
//                    	isDmsDefinition = true;
//                    }
                    
                    if (cn.equals("DmsDefinition")){
                    	baseClass = "DmwWrapperDMO implements DmcNamedObjectIF";
                    	isDmsDefinition = true;
                    }
                    else if (cn.equals("DmwWrapper")){
                    	baseClass = "DmcObject";
                    }
                    else{
                    	// Otherwise, we look up the derived from class and use its javaClass
                    	// as the base class
                    	DmcUncheckedObject bc = classDefs.get(derivedFrom);
                    	
                    	if (bc == null){
                    		ResultException ex = new ResultException();
                    		ex.addError("Unknown base class: " + derivedFrom + " for class: " + cn);
                    		ex.result.lastResult().lineNumber(go.lineNumber);
                    		throw(ex);
                    	}
                    	
//                    	baseClass = bc.getSV("javaClass");
                    	baseClass = bc.getSV("dmoImport");
                    }
                    
//                    classType = go.getSV("classType");
                    
//                    if (classType.equals("ABSTRACT"))
//                    	out.write("public abstract class " + cn + "AG extends " + baseClass + " {\n\n");
//                    else
                    	out.write("public class " + cn + "DMO extends " + baseClass + " {\n\n");

                    
                    // Gather the attributes together
                    must 	= (DmcTypeString) go.get("must");
                    may		= (DmcTypeString) go.get("may");
                    atlist 	= new ArrayList<String>();
                    
                    if (must != null){
                    	for(int a=0; a<must.getMVSize(); a++)	
                    		atlist.add(must.getMVnth(a));
                    }
                    
                    if (may != null){
                    	for(int a=0; a<may.getMVSize(); a++)	
                    		atlist.add(may.getMVnth(a));
                    }
                    
                    // Dump the static string that represent all of our attributes. this prevents having
                    // to instantiate new strings when we access the attributes
//                    for(String n : atlist){
//                    	out.write("    public final static String _" + n + " = \"" + n + "\";\n");
//                    }
                    out.write("\n\n");
                    
                    // TODO: SERIALIZATION
                    // Dump the DmcAttributeInfo that provides hints for serialization/deserialization
                    out.write("    static Map<Integer,DmcAttributeInfo> _ImAp;\n\n");
                    out.write("    static Map<String ,DmcAttributeInfo> _SmAp;\n\n");
                    
                    if (must != null){
                    	for(int a=0; a<must.getMVSize(); a++){
                    		String n = must.getMVnth(a);
                        	DmcUncheckedObject attrDef = attributeDefs.get(n);
                        	String t = attrDef.getSV("type");
                        	String ID = attrDef.getSV("dmdID");
                        	
                        	// MULTIVALUED 3
//                        	String mv = attrDef.getSV("isMultiValued");
                        	String mv = attrDef.getSV("valueType");
                    		
                        	writeAttributeInfo(out, n, ID, t, mv, "false");

                    	}
                    }
                    
                    if (may != null){
                    	for(int a=0; a<may.getMVSize(); a++){
                    		String n = may.getMVnth(a);
                        	DmcUncheckedObject attrDef = attributeDefs.get(n);
                        	String t = attrDef.getSV("type");
                        	String ID = attrDef.getSV("dmdID");
                        	
                        	// MULTIVALUED 4
//                        	String mv = attrDef.getSV("isMultiValued");
                        	String mv = attrDef.getSV("valueType");
                    		
                        	writeAttributeInfo(out, n, ID, t, mv, "true");

                    	}
                    }
                    
                    out.write("\n");
                    out.write("    static {\n");
                    out.write("        _ImAp = new HashMap<Integer,DmcAttributeInfo>();\n");
                    
                    for(String n : atlist){
                    	out.write("        _ImAp.put(__" + n + ".id,__" + n + ");\n");
                    }

                    out.write("\n");

                    out.write("        _SmAp = new HashMap<String ,DmcAttributeInfo>();\n");
                    
                    for(String n : atlist){
                    	out.write("        _SmAp.put(__" + n + ".name,__" + n + ");\n");
                    }

                    out.write("    }\n");

                    out.write("\n\n");
                    
                    // Dump the constructors
                    
                    // TODO: SERIALIZATION
                	out.write("    public " + cn + "DMO(){\n");
                	out.write("        super(\"" + cn + "\",_ImAp,_SmAp);\n");
                	out.write("    }\n\n");

//                	out.write("    public " + cn + "DMO(){\n");
//                	out.write("        super(\"" + cn + "\");\n");
//                	out.write("    }\n\n");

                	out.write("    public " + cn + "DMO(String oc){\n");
                	out.write("        super(oc);\n");
                	out.write("    }\n\n");
                    
                    // TODO: SERIALIZATION
                	out.write("    public " + cn + "DMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){\n");
                	out.write("        super(oc,im,sm);\n");
                	out.write("    }\n\n");
                    
                    out.write("    @Override\n");
                	out.write("    public " + cn + "DMO getOneOfMe(){\n");
                    out.write("        " + cn + "DMO rc = new " + cn + "DMO();\n");
                    out.write("        return(rc);\n");
                	out.write("    }\n\n");
                    
                    if (isDmsDefinition){
                    	out.write("     public String getConstructionClassName(){\n");
                    	out.write("         return(\"" + cn + "\");\n");
                    	out.write("     }\n\n");
                    }
                    
                    // Write the attribute access functions
                    for(int j=0;j<atlist.size();j++){
                        currAttr = ((String)atlist.get(j)).trim();

                        out.write("    /**\n");

                        if ( (attrObj = (DmcUncheckedObject)attributeDefs.get(currAttr.trim())) == null){
                        	System.err.println("Missing attribute definition for: " + currAttr.trim() + " in class definition: " + cn);
                        	System.exit(1);
                        }
                        
                        // MULTIVALUED 5
//                        String multiValued = attrObj.getSV("isMultiValued");
                        String multiValued = attrObj.getSV("valueType");
                        
                        dumpCodeComment(attrObj.getSV("description"),out,"     * ");

                        if(multiValued != null){
                        	dumpMVAccessFunction(out, currAttr, true, cn + "DMO");
                        }
                        else{
                            out.write("     */\n");
                        	dumpSVAccessFunction(out,currAttr,true, cn + "DMO");
                        }

                    }
                    out.write("\n");
                    
                    if (isNamedBy != null){
                        out.write("    ////////////////////////////////////////////////////////////////////////////////\n");
                        out.write("    // DmcNamedObjectIF implementation\n");
                        out.write("    /**\n");
                        out.write("     * @return The name of this object from the " + isNamedBy + " attribute.\n");
                        out.write("     */\n");
                        out.write("    @Override\n");
                        out.write("    public StringName getObjectName(){\n");
                        out.write("        DmcTypeStringName attr = (DmcTypeStringName) get(__" + isNamedBy + ");\n");
                        out.write("        if (attr == null)\n");
                        out.write("            return(null);\n");
                        out.write("        return(attr.getSV());\n");
                        out.write("    }\n\n");
                    }
                    
                    out.write("}\n");

                    out.close();
                } catch (IOException e) {
                    System.out.println("IO Error:\n" + e);
                }
            }
        }
    }
    
    // MULTIVALUED 6
    void writeAttributeInfo(BufferedWriter out, String n, String ID, String t, String mv, String opt) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
    	
//    	if (mv == null)
//    		out.write("false,");
//    	else
//    		out.write("true,");
    	
    	if (mv == null)
    		out.write("ValueTypeEnum.SINGLE,");
    	else
    		out.write("ValueTypeEnum.MULTI,");
    	
    	out.write(opt + ");\n");

    }

    /**
     * This method dumps a single valued attribute getter.
     * @param out Our output writer.
     * @param attrname The name of the attribute for which we're dumping the access function.
     * @throws IOException
     * @throws ResultException
     */
	void dumpSVAccessFunction(BufferedWriter out, String attrname, boolean DMO, String dmoClass) throws IOException, ResultException {
    	DmcUncheckedObject  	attributeDef	= attributeDefs.get(attrname);
    	String              typeName		= attributeDef.getSV("type");
    	boolean				isObjREF		= false;
//    	boolean				isEnumREF		= false;
    	
    	if (typeName == null){
    		ResultException ex = new ResultException();
    		ex.addError("No type specified for attribute: " + attrname);
    		ex.result.lastResult().lineNumber(attributeDef.lineNumber);
    		throw(ex);
    	}
    	
    	DmcUncheckedObject	typeDef		= typeDefs.get(typeName);
    	
    	// If we can't find this as a type def, look for it as an enum def
    	if (typeDef == null){
    		typeDef = enumDefs.get(typeName);
//    		if (typeDef != null)
//    			isEnumREF = true;
    	}
    	
    	// Or, look for it as a class - it may be a reference
    	if (typeDef == null){
    		typeDef = classDefs.get(typeName);
    		if (typeDef != null);
    			isObjREF = true;
    	}
    	
    	if (typeDef == null){
    		ResultException ex = new ResultException();
    		ex.addError("Unknown type: " + typeName + " for attribute: " + attrname);
    		ex.result.lastResult().lineNumber(attributeDef.lineNumber);
    		throw(ex);
    	}
    	
    	String typeClassName = typeDef.getSV("typeClassName");
    	String attrType = "DmcType" + typeName;
    	
    	if (isObjREF)
    		attrType = attrType + "REF";

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(attrname);
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	if (DMO){
    		if (isObjREF)
            	out.write("    public " + typeName + "REF get" + functionName + "(){\n");
    		else
    			out.write("    public " + typeName + " get" + functionName + "(){\n");
        	
        	out.write("        " + attrType + " attr = (" + attrType + ") get(__" + attrname + ");\n");
        	out.write("        if (attr == null)\n");
        	
        	String nullReturnValue = typeDef.getSV("nullReturnValue");

        	if (nullReturnValue == null)
        		out.write("            return(null);\n");
        	else
        		out.write("            return(" + nullReturnValue + ");\n");
        	
        	out.write("\n");
        	out.write("        return(attr.getSV());\n");
        	out.write("    }\n\n");
    	}
    	else{
    		if (isObjREF){
	        	out.write("    public " + typeName + " get" + functionName + "(){\n");
//	    		out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(" + dmoClass + "._" + attrname + ");\n");
	    		out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(" + dmoClass + ".__" + attrname + ");\n");
	    		
	        	out.write("        if (attr == null)\n");
	        	out.write("            return(null);\n");
	        	
	        	out.write("        " + typeName + "DMO obj = attr.getSV().getObject();\n");
	        	out.write("        return((" + typeName + ")obj.getContainer());\n");
	        	out.write("    }\n\n");
    		}
    		else{
	        	out.write("    public " + typeName + " get" + functionName + "(){\n");
	        	out.write("        return(mycore.get" + functionName + "());\n");
	        	out.write("    }\n\n");
    		}
    	}
    	
    	
    	if (DMO){
        	out.write("    /**\n");
        	out.write("     * Sets " + attrname + " to the specified value.\n");
        	out.write("     * @param value A value compatible with " + attrType + "\n");
        	out.write("     */\n");
        	out.write("    @SuppressWarnings(\"unchecked\")\n");
        	out.write("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
        	out.write("        DmcAttribute attr = get(__" + attrname + ");\n");
        	out.write("        if (attr == null)\n");
        	out.write("            attr = new " + attrType + "(__" + attrname + ");\n");
        	out.write("        \n");
        	out.write("        attr.set(value);\n");
        	out.write("        set(__" + attrname + ",attr);\n");
        	out.write("    }\n\n");
        	
//        	out.write("        try{\n");
//        	out.write("            set(_" + attrname + ", " + attrType + ".class, value);\n");
//        	out.write("        }\n");
//        	out.write("        catch(Exception ex){\n");
//        	out.write("            ex.printStackTrace();\n");
//        	out.write("        }\n");
//        	out.write("    }\n\n");
    	}
    	else{
    		if (isObjREF){
	        	out.write("    /**\n");
	        	out.write("     * Sets " + attrname + " to the specified value.\n");
	        	out.write("     * @param value A value compatible with " + typeName + "\n");
	        	out.write("     */\n");
	        	out.write("    public void set" + functionName + "(" + typeName + " value) throws DmcValueException {\n");
	    		out.write("        mycore.set" + functionName + "(value.getDmcObject());\n");
	        	out.write("    }\n\n");
    		}
    		else{
	        	out.write("    /**\n");
	        	out.write("     * Sets " + attrname + " to the specified value.\n");
	        	out.write("     * @param value A value compatible with " + attrType + "\n");
	        	out.write("     */\n");
	        	out.write("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
	    		out.write("        mycore.set" + functionName + "(value);\n");
	        	out.write("    }\n\n");
    		}
    	}
    }
    
	void dumpMVAccessFunction(BufferedWriter out, String attrname, boolean DMO, String dmoClass) throws IOException, ResultException {
    	DmcUncheckedObject  	attributeDef	= attributeDefs.get(attrname);
    	String              typeName		= attributeDef.getSV("type");
    	boolean				isObjREF		= false;
    	
    	if (typeName == null){
    		ResultException ex = new ResultException();
    		ex.addError("No type specified for attribute: " + attrname);
    		ex.result.lastResult().lineNumber(attributeDef.lineNumber);
    		throw(ex);
    	}
    	
    	DmcUncheckedObject	typeDef		= typeDefs.get(typeName);
    	
    	// If we can't find this as a type def, look for it as an enum def
    	if (typeDef == null){
    		typeDef = enumDefs.get(typeName);
    	}
    	
    	// Or, look for it as a class - it may be a reference
    	if (typeDef == null){
    		typeDef = classDefs.get(typeName);
    		if (typeDef != null)
    			isObjREF = true;
    	}
    	
    	if (typeDef == null){
    		ResultException ex = new ResultException();
    		ex.addError("Unknown type: " + typeName + " for attribute: " + attrname);
    		ex.result.lastResult().lineNumber(attributeDef.lineNumber);
    		throw(ex);
    	}
    	
    	String attrType = "DmcType" + typeName;
    	
    	if (isObjREF)
    		attrType = attrType + "REF";
    	    	
    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(attrname);
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	if (DMO){
    		if (isObjREF){
	        	out.write("     * @return An Iterator of " + typeName + "DMO objects.\n");
	        	out.write("     */\n");
	        	out.write("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
    		}
    		else{
	        	out.write("     * @return An Iterator of " + typeName + " objects.\n");
	        	out.write("     */\n");
	        	out.write("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
    		}
        	out.write("        " + attrType + " attr = (" + attrType + ") get(__" + attrname + ");\n");
        	out.write("        if (attr == null)\n");
        	out.write("            return(null);\n");
        	out.write("\n");
        	out.write("        return(attr.getMV());\n");
        	out.write("    }\n\n");
    	}
    	else{
    		if (isObjREF){
	        	out.write("     * @return An Iterator of " + typeName + " objects.\n");
	        	out.write("     */\n");
	        	out.write("    @SuppressWarnings(\"unchecked\")\n");
	        	out.write("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
	    		out.write("        DmcAttribute attr = (" + attrType + ") mycore.get(" + dmoClass + ".__" + attrname + ");\n");
	        	out.write("        if (attr == null)\n");
	        	out.write("            return(null);\n");
	        	out.write("\n");
	        	out.write("        ArrayList<" + typeName + "> refs = (ArrayList<" + typeName + ">) attr.getAuxData();\n");
	        	out.write("\n");
	        	out.write("        if (refs == null)\n");
	        	out.write("            return(null);\n");
	        	out.write("\n");
	        	out.write("        return(refs.iterator());\n");
	        	out.write("    }\n\n");
    		}
    		else{
	        	out.write("     * @return An Iterator of " + typeName + " objects.\n");
	        	out.write("     */\n");
	        	out.write("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
	    		out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(" + dmoClass + ".__" + attrname + ");\n");
	        	out.write("        if (attr == null)\n");
	        	out.write("            return(null);\n");
	        	out.write("\n");
	        	out.write("        return(attr.getMV());\n");
	        	out.write("    }\n\n");
    		}
    	}
    	
    	if (DMO){
        	out.write("    /**\n");
        	out.write("     * Adds another " + attrname + " value.\n");
        	out.write("     * @param value A value compatible with " + attrType + "\n");
        	out.write("     */\n");
        	out.write("    @SuppressWarnings(\"unchecked\")\n");
        	out.write("    public DmcAttribute add" + functionName + "(Object value) throws DmcValueException {\n");
        	out.write("        DmcAttribute attr = get(__" + attrname + ");\n");
        	out.write("        if (attr == null)\n");
        	out.write("            attr = new " + attrType + "(__" + attrname + ");\n");
        	out.write("        \n");
        	out.write("        attr.add(value);\n");
        	out.write("        add(__" + attrname + ",attr);\n");
        	out.write("        return(attr);\n");
        	out.write("    }\n\n");
        	
//        	out.write("    /**\n");
//        	out.write("     * Adds another " + attrname + " value.\n");
//        	out.write("     * @param value A value compatible with " + attrType + "\n");
//        	out.write("     */\n");
//        	out.write("    public void add" + functionName + "(Object value){\n");
//        	out.write("        try{\n");
//        	out.write("            add(_" + attrname + ", " + attrType + ".class, value);\n");
//        	out.write("        }\n");
//        	out.write("        catch(Exception ex){\n");
//        	out.write("            ex.printStackTrace();\n");
//        	out.write("        }\n");
//        	out.write("    }\n\n");
    	}
    	else{
    		if (isObjREF){
	        	out.write("    /**\n");
	        	out.write("     * Adds another " + attrname + " value.\n");
	        	out.write("     * @param value A value compatible with " + typeName + "\n");
	        	out.write("     */\n");
	        	out.write("    @SuppressWarnings(\"unchecked\")\n");
	        	out.write("    public DmcAttribute add" + functionName + "(" + typeName + " value) throws DmcValueException {\n");
	    		out.write("        DmcAttribute attr = mycore.add" + functionName + "(value.getDmcObject());\n");
	        	out.write("        ArrayList<" + typeName + "> refs = (ArrayList<" + typeName + ">) attr.getAuxData();\n");
	        	out.write("        \n");
	        	out.write("        if (refs == null){\n");
	        	out.write("            refs = new ArrayList<" + typeName + ">();\n");
	        	out.write("            attr.setAuxData(refs);\n");
	        	out.write("        }\n");
	        	out.write("        refs.add(value);\n");
	        	out.write("        return(attr);\n");
	        	out.write("    }\n\n");
    		}
    		else{
	        	out.write("    /**\n");
	        	out.write("     * Adds another " + attrname + " value.\n");
	        	out.write("     * @param value A value compatible with " + attrType + "\n");
	        	out.write("     */\n");
	        	out.write("    @SuppressWarnings(\"unchecked\")\n");
	        	out.write("    public DmcAttribute add" + functionName + "(Object value) throws DmcValueException {\n");
	    		out.write("        return(mycore.add" + functionName + "(value));\n");
	        	out.write("    }\n\n");
    		}
    	}
//    	out.write("        }\n");
//    	out.write("        catch(Exception ex){\n");
//    	out.write("            ex.printStackTrace();\n");
//    	out.write("        }\n");
//    	out.write("    }\n\n");
    	

    }
	
//    /**
//     * We automatically generate mediator classes for our enumerations and class definitions.
//     * @param od
//     * @throws IOException
//     * @throws ResultException
//     */
//    private void dumpMediators(String od) throws IOException, ResultException {
//        DmcUncheckedObject   	go;
//        String              cn;
//
//        for(int i=0;i<origOrderClasses.size();i++){
//            go = (DmcUncheckedObject) classDefs.get(origOrderClasses.get(i));
//
//            System.out.println("*** Formatting mediator for: " + origOrderClasses.get(i));
//
//            if ( (cn = go.getSV("name")) == null){
//                System.out.println("Couldn't get name for class definition:\n" + go);
//            }
//            else{
//                BufferedWriter out = new BufferedWriter(new FileWriter(od + File.separator + cn + "MediatorAG.java"));
//
//                out.write(LGPL.toString());
//                out.write("package org.dmd.dms.generated;\n\n");
//
//                out.write("import java.util.*;\n");
//
//                out.write("import org.dmd.dms.*;\n");
//                out.write("import org.dmd.util.exceptions.*;\n\n");
//
//                out.write("public class " + cn + "MediatorAG extends AttributeMediator {\n\n");
//                	
//                out.write("    /**\n");
//                out.write("     * Default constructor.\n");
//                out.write("     */\n");
//                out.write("    public " + cn + "MediatorAG(){\n");
//            	out.write("    }\n\n");
//                		
//                out.write("    public void set(GenericObject go, AttributeDefinition ad, Object existing, Object value) throws ResultException {\n");
//                out.write("        if (value instanceof " + cn + "){\n");
//            	out.write("            super.updateObjectSet(go, ad, existing, value);\n");
//            	out.write("        }\n");
//            	out.write("        else{\n");
//            	out.write("            ResultException ex = new ResultException();\n");
//            	out.write("            ex.addError(\"Object of class: \" + value.getClass().getName() + \" passed where object of class " + cn + " expected.\");\n");
//            	out.write("            ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());\n");
//            	out.write("            throw(ex);\n");
//            	out.write("        }\n");
//            	out.write("    }\n\n");
//
//            	out.write("    public void add(GenericObject go, AttributeDefinition ad, ArrayList<Object> existing, Object value) throws ResultException {\n");
//                out.write("        if (value instanceof " + cn + "){\n");
//            	out.write("            if (existing == null)\n");
//            	out.write("                existing = new ArrayList<Object>();\n");
//            	out.write("            \n");
//            	out.write("            existing.add(value);\n");
//            	out.write("            \n");
//            	out.write("            super.updateObjectAdd(go, ad, existing, value);\n");
//            	out.write("        }\n");
//            	out.write("        else{\n");
//            	out.write("            ResultException ex = new ResultException();\n");
//            	out.write("            ex.addError(\"Object of class: \" + value.getClass().getName() + \" passed where object of class " + cn + " expected.\");\n");
//            	out.write("            ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());\n");
//            	out.write("            throw(ex);\n");
//            	out.write("        }\n");
//            	out.write("    }\n\n");
//
//            	out.write("    public String getString(AttributeDefinition ad, Object value){\n");
//                out.write("        return(((" + cn + ")value).getName());\n");
//            	out.write("    }\n");
//                out.write("\n");
//
//                out.write("}\n");
//
//                out.close();
//            }
//        }
//        
//        for(int i=0;i<origOrderEnums.size();i++){
//            go = (DmcUncheckedObject) enumDefs.get(origOrderEnums.get(i));
//
//            System.out.println("*** Formatting mediator for: " + origOrderEnums.get(i));
//
//            if ( (cn = go.getSV("name")) == null){
//                System.out.println("Couldn't get name for enum definition:\n" + go);
//            }
//            else{
//                BufferedWriter out = new BufferedWriter(new FileWriter(od + File.separator + cn + "MediatorAG.java"));
//
//                out.write(LGPL.toString());
//                out.write("package org.dmd.dms.generated;\n\n");
//
//                out.write("import java.util.*;\n");
//
//                out.write("import org.dmd.dms.*;\n");
//                out.write("import org.dmd.util.exceptions.*;\n\n");
//
//                out.write("public class " + cn + "MediatorAG extends AttributeMediator {\n\n");
//                	
//                out.write("    /**\n");
//                out.write("     * Default constructor.\n");
//                out.write("     */\n");
//                out.write("    public " + cn + "MediatorAG(){\n");
//            	out.write("    }\n\n");
//                		
//            	out.write("    public void set(GenericObject go, AttributeDefinition ad, Object existing, Object value) throws ResultException {\n");
//            	out.write("        " + cn + " v = typeCheck(value);\n");
//            	out.write("    	   super.updateObjectSet(go, ad, existing, v);\n");
//            	out.write("    }\n\n");
//
//            	out.write("    public void add(GenericObject go, AttributeDefinition ad, ArrayList<Object> existing, Object value) throws ResultException {\n");
//            	out.write("        " + cn + " v = typeCheck(value);\n\n");
//            		
//            	out.write("    	if (existing == null)\n");
//            	out.write("    		existing = new ArrayList<Object>();\n\n");
//            		
//            	out.write("    	existing.add(v);\n");
//            	out.write("    	super.updateObjectAdd(go, ad, existing, v);\n");
//            	out.write("    }\n\n");
//            	
//            	out.write("    private " + cn + " typeCheck(Object value) throws ResultException {\n");
//            	out.write("        " + cn + " rc = null;\n\n");
//            		
//            	out.write("        if (value instanceof " + cn + "){\n");
//            	out.write("            rc = (" + cn + ")value;\n");
//            	out.write("        }\n");
//            	out.write("        else if (value instanceof String){\n");
//            	out.write("        		rc = " + cn + ".get((String)value);\n");
//            	out.write("        		if (rc == null){\n");
//            	out.write("                ResultException ex = new ResultException();\n");
//            	out.write("                ex.addError(\"Value: \" + value.toString() + \" is not a valid " + cn + " value.\");\n");
//            	out.write("                ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());\n");
//            	out.write("                throw(ex);\n");
//            	out.write("             }\n");
//            	out.write("        }\n");
//            	out.write("        else{\n");
//            	out.write("            ResultException ex = new ResultException();\n");
//            	out.write("            ex.addError(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + cn + " expected.\");\n");
//            	out.write("            ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());\n");
//            	out.write("            throw(ex);\n");
//            	out.write("        }\n");
//                    
//            	out.write("        return(rc);\n");
//            	out.write("    }\n");
//
//            	out.write("    public String getString(AttributeDefinition ad, Object value){\n");
//                out.write("        return(((" + cn + ")value).toString());\n");
//            	out.write("    }\n");
//                out.write("\n");
//
////            	out.write("    public void set(GenericObject go, AttributeDefinition ad, Object existing, Object value) throws ResultException {\n");
////                out.write("        if (value instanceof " + cn + "){\n");
////            	out.write("            super.updateObjectSet(go, ad, existing, value);\n");
////            	out.write("        }\n");
////            	out.write("        else{\n");
////            	out.write("            ResultException ex = new ResultException();\n");
////            	out.write("            ex.addError(\"Object of class: \" + value.getClass().getName() + \" passed where object of class " + cn + " expected.\");\n");
////            	out.write("            throw(ex);\n");
////            	out.write("        }\n");
////            	out.write("    }\n\n");
////
////            	out.write("    public void add(GenericObject go, AttributeDefinition ad, ArrayList<Object> existing, Object value) throws ResultException {\n");
////                out.write("        if (value instanceof " + cn + "){\n");
////            	out.write("            if (existing == null)\n");
////            	out.write("                existing = new ArrayList<Object>();\n");
////            	out.write("            \n");
////            	out.write("            existing.add(value);\n");
////            	out.write("            \n");
////            	out.write("            super.updateObjectAdd(go, ad, existing, value);\n");
////            	out.write("        }\n");
////            	out.write("        else{\n");
////            	out.write("            ResultException ex = new ResultException();\n");
////            	out.write("            ex.addError(\"Object of class: \" + value.getClass().getName() + \" passed where object of class " + cn + " expected.\");\n");
////            	out.write("            throw(ex);\n");
////            	out.write("        }\n");
////            	out.write("    }\n\n");
//
//                out.write("\n");
//
//                out.write("}\n");
//
//                out.close();
//            }
//        }
//    }
	
    /**
     * We automatically generate DmcAttribute classes for our enumerations and class definitions.
     * @param od
     * @throws IOException
     * @throws ResultException
     */
    private void dumpDmcTypes(String od) throws IOException, ResultException {
        DmcUncheckedObject   	go;
        String              cn;

        for(int i=0;i<origOrderClasses.size();i++){
            go = (DmcUncheckedObject) classDefs.get(origOrderClasses.get(i));

            System.out.println("*** Formatting DmcAttribute for: " + origOrderClasses.get(i));

            if ( (cn = go.getSV("name")) == null){
                System.out.println("Couldn't get name for class definition:\n" + go);
            }
            else{
            	// We only generate the type ref for objects that are named - otherwise,
            	// we just dump the DmcType for the object
            	if (go.getSV("isNamedBy") == null){
// TODO: removed the type generation for DmwWrapper
//            		dumpDmcType(od, cn, false);
            		continue;
            	}
            	
                BufferedWriter out = null;
                
                
                out = new BufferedWriter(new FileWriter(od + "/DmcType" + cn + "REF.java"));

                out.write(LGPL.toString());
                out.write("package org.dmd.dms.generated.types;\n\n");

                out.write("import java.util.ArrayList;\n");
                out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
                out.write("import org.dmd.dmc.types.DmcTypeNamedObjectREF;\n");
                out.write("import org.dmd.dms.generated.dmo.*;\n");
                out.write("import org.dmd.dmc.types.StringName;\n");

                out.write("/**\n * The DmcType" + cn + "REF class.\n");
                out.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
                out.write(" * manually.\n");
                out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write(" */\n");

                out.write("@SuppressWarnings(\"serial\")\n");
                out.write("public class DmcType" + cn + "REF extends DmcTypeNamedObjectREF<" + cn + "REF, StringName> {\n\n");
                	
                out.write("    /**\n");
                out.write("     * Default constructor.\n");
                out.write("     */\n");
                out.write("    public DmcType" + cn + "REF(){\n");
            	out.write("    }\n\n");
        		
                out.write("    /**\n");
                out.write("     * Default constructor.\n");
                out.write("     */\n");
                out.write("    public DmcType" + cn + "REF(DmcAttributeInfo ai){\n");
            	out.write("        super(ai);\n");
            	out.write("    }\n\n");
        		
                out.write("    @Override\n");
                out.write("    protected " + cn + "REF " + "getNewHelper(){\n");
            	out.write("        return( new " + cn + "REF());\n");
            	out.write("    }\n\n");
        		
                out.write("    @Override\n");
                out.write("    protected StringName " + "getNewName(){\n");
            	out.write("        return( new StringName());\n");
            	out.write("    }\n\n");
        		
                out.write("    @Override\n");
                out.write("    protected String getDMOClassName(){\n");
            	out.write("        return( " + cn + "DMO.class.getName());\n");
            	out.write("    }\n\n");
        		
                out.write("    @Override\n");
                out.write("    protected boolean isDMO(Object value){\n");
            	out.write("        if (value instanceof " + cn + "DMO)\n");
            	out.write("            return(true);\n");
            	out.write("        return(false);\n");
            	out.write("    }\n\n");
                		
//                out.write("    @Override\n");
                out.write("    public DmcType" + cn + "REF cloneMe(){\n");
            	out.write("        DmcType" + cn + "REF rc = new DmcType" + cn + "REF();\n");
            	out.write("        if (mv == null){\n");
            	out.write("            rc.sv = sv.cloneMe();\n");
            	out.write("        }\n");
            	out.write("        else{\n");
            	out.write("            rc.mv = new ArrayList<" + cn + "REF>();\n");
            	out.write("            for(" + cn + "REF val : mv){\n");
            	out.write("                rc.mv.add(val.cloneMe());\n");
            	out.write("            }\n");
            	out.write("        }\n");
            	out.write("        return(rc);\n");
            	out.write("    }\n\n");
                		
                out.write("    /**\n");
                out.write("     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.\n");
                out.write("     */\n");
                out.write("    public DmcType" + cn + "REF getOneOfMe(){\n");
            	out.write("        DmcType" + cn + "REF rc = new DmcType" + cn + "REF();\n");
            	out.write("        return(rc);\n");
            	out.write("    }\n\n");
                		
                out.write("    /**\n");
                out.write("     * Returns a clone of a value associated with this type.\n");
                out.write("     */\n");
                out.write("    public " + cn + "REF cloneValue(" + cn + "REF val){\n");
            	out.write("        " + cn + "REF rc = new " + cn + "REF(val);\n");
            	out.write("        return(rc);\n");
            	out.write("    }\n\n");
                		
                out.write("}\n");

                out.close();
                
                // Generate the reference container
                
                out = new BufferedWriter(new FileWriter(od + File.separator + cn + "REF.java"));

                out.write(LGPL.toString());
                out.write("package org.dmd.dms.generated.types;\n\n");

                out.write("import org.dmd.dmc.DmcNamedObjectNontransportableREF;\n");
                out.write("import org.dmd.dms.generated.dmo.*;\n");

                out.write("/**\n * The " + cn + "REF class.\n");
                out.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
                out.write(" * manually.\n");
                out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write(" */\n");

                out.write("@SuppressWarnings(\"serial\")\n");
                out.write("public class " + cn + "REF extends DmcNamedObjectNontransportableREF<" + cn + "DMO> {\n\n");
                	
                out.write("    /**\n");
                out.write("     * Default constructor.\n");
                out.write("     */\n");
                out.write("    public " + cn + "REF(){\n");
            	out.write("    }\n\n");
                		
                out.write("    /**\n");
                out.write("     * Copy constructor.\n");
                out.write("     */\n");
                out.write("    public " + cn + "REF(" + cn + "REF original){\n");
            	out.write("        name = original.name;\n");
            	out.write("        object = original.object;\n");
            	out.write("    }\n\n");
                		
                out.write("    /**\n");
                out.write("     * Sets our object.\n");
                out.write("     */\n");
                out.write("    @Override\n");
                out.write("    public void setObject(" + cn + "DMO o){\n");
                out.write("        object = o;\n");
            	out.write("    }\n\n");
                		
                out.write("    /**\n");
                out.write("     * Clones this reference.\n");
                out.write("     */\n");
//                out.write("    @Override\n");
                out.write("    public " + cn + "REF cloneMe(){\n");
                out.write("        " + cn + "REF rc = new " + cn + "REF();\n");
                out.write("        rc.name   = name;\n");
                out.write("        rc.object = object;\n");
                out.write("        return(rc);\n");
            	out.write("    }\n\n");
                		
                out.write("}\n");

                out.close();
                
                
            }
        }
        
        for(int i=0;i<origOrderEnums.size();i++){
            go = (DmcUncheckedObject) enumDefs.get(origOrderEnums.get(i));

            System.out.println("*** Formatting mediator for: " + origOrderEnums.get(i));

            if ( (cn = go.getSV("name")) == null){
                System.out.println("Couldn't get name for enum definition:\n" + go);
            }
            else{
            	dumpDmcType(od, cn, true);
            	
//                BufferedWriter out = new BufferedWriter(new FileWriter(od + "/DmcType" + cn + ".java"));
//
//                out.write(LGPL.toString());
//                out.write("package org.dmd.dms.generated.types;\n\n");
//
//                out.write("import org.dmd.dmc.DmcAttribute;\n");
//                out.write("import org.dmd.dmc.DmcValueException;\n");
//                out.write("import org.dmd.dms.generated.enums.*;\n\n");
//
//                out.write("@SuppressWarnings(\"serial\")\n");
//
//                out.write("public class DmcType" + cn + " extends DmcAttribute<" + cn + ">" + "{\n\n");
//                	
//                out.write("    /**\n");
//                out.write("     * Default constructor.\n");
//                out.write("     */\n");
//                out.write("    public DmcType" + cn + "(){\n");
//            	out.write("    }\n\n");
//                		            	
//            	out.write("    protected " + cn + " typeCheck(Object value) throws DmcValueException {\n");
//            	out.write("        " + cn + " rc = null;\n\n");
//            		
//            	out.write("        if (value instanceof " + cn + "){\n");
//            	out.write("            rc = (" + cn + ")value;\n");
//            	out.write("        }\n");
//            	out.write("        else if (value instanceof String){\n");
//            	out.write("        		rc = " + cn + ".get((String)value);\n");
//            	out.write("        		if (rc == null){\n");
//            	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + cn + " value.\"));\n");
//            	out.write("             }\n");
//            	out.write("        }\n");
//            	out.write("        else{\n");
//            	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + cn + " expected.\"));\n");
//            	out.write("        }\n");
//                    
//            	out.write("        return(rc);\n");
//            	out.write("    }\n");
//
//                out.write("\n");
//
//                out.write("    public String getString(){\n");
//            	out.write("        if (sv == null){\n");
//            	out.write("    	       StringBuffer sb = new StringBuffer();\n");
//            	out.write("    	       for (" + cn + " t : mv){\n");
//            	out.write("    		       sb.append(t + \", \");\n");
//            	out.write("    	       }\n");
//            	out.write("    	       return(sb.toString());\n");
//            	out.write("        }\n");
//            	out.write("        else{\n");
//            	out.write("    	       return(sv.toString());\n");
//            	out.write("        }\n");
//            	out.write("    }\n");
//
//                out.write("\n");
//
//
//                out.write("\n");
//
//                out.write("}\n");
//
//                out.close();
            }
        }
    }
	

    void dumpDmcType(String od, String cn, boolean supportsString) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(od + "/DmcType" + cn + ".java"));

        out.write(LGPL.toString());
        out.write("package org.dmd.dms.generated.types;\n\n");

        out.write("import java.util.ArrayList;\n");
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");

        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        
        if (supportsString)
        	out.write("import org.dmd.dms.generated.enums.*;\n\n");
        else
    		out.write("import org.dmd.dms.*;\n\n");

        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("/**\n * The DmcType" + cn + " class.\n");
        out.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
        out.write(" * manually.\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        out.write("public class DmcType" + cn + " extends DmcAttribute<" + cn + ">" + "{\n\n");
        	
        out.write("    /**\n");
        out.write("     * Default constructor.\n");
        out.write("     */\n");
        out.write("    public DmcType" + cn + "(){\n");
    	out.write("    }\n\n");
        		            	
        out.write("    /**\n");
        out.write("     * Default constructor.\n");
        out.write("     */\n");
        out.write("    public DmcType" + cn + "(DmcAttributeInfo ai){\n");
    	out.write("        super(ai);\n");
    	out.write("    }\n\n");
        		            	
    	out.write("    protected " + cn + " typeCheck(Object value) throws DmcValueException {\n");
    	out.write("        " + cn + " rc = null;\n\n");
    		
    	out.write("        if (value instanceof " + cn + "){\n");
    	out.write("            rc = (" + cn + ")value;\n");
    	out.write("        }\n");
    	
    	if (supportsString){
	    	out.write("        else if (value instanceof String){\n");
	    	out.write("            rc = " + cn + ".get((String)value);\n");
	    	out.write("            if (rc == null){\n");
	    	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + cn + " value.\"));\n");
	    	out.write("            }\n");
	    	out.write("        }\n");
	    	out.write("        else if (value instanceof Integer){\n");
	    	out.write("            rc = " + cn + ".get((Integer)value);\n");
	    	out.write("            if (rc == null){\n");
	    	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + cn + " value.\"));\n");
	    	out.write("            }\n");
	    	out.write("        }\n");
    	}
    	out.write("        else{\n");
    	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + cn + " expected.\"));\n");
    	out.write("        }\n");
            
    	out.write("        return(rc);\n");
    	out.write("    }\n");

        out.write("\n");

        out.write("    public String getString(){\n");
    	out.write("        if (sv == null){\n");
    	out.write("    	       StringBuffer sb = new StringBuffer();\n");
    	out.write("    	       for (" + cn + " t : mv){\n");
    	out.write("    		       sb.append(t + \", \");\n");
    	out.write("    	       }\n");
    	out.write("    	       return(sb.toString());\n");
    	out.write("        }\n");
    	out.write("        else{\n");
    	out.write("    	       return(sv.toString());\n");
    	out.write("        }\n");
    	out.write("    }\n");

        out.write("    /**\n");
        out.write("     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.\n");
        out.write("     */\n");
        out.write("    public DmcType" + cn + " getOneOfMe(){\n");
    	out.write("        DmcType" + cn + " rc = new DmcType" + cn + "();\n");
    	out.write("        return(rc);\n");
    	out.write("    }\n\n");
        		
        out.write("    /**\n");
        out.write("     * Returns a clone of a value associated with this type.\n");
        out.write("     */\n");
        out.write("    public " + cn + " cloneValue(" + cn + " val){\n");
    	out.write("        " + cn + " rc = val;\n");
    	out.write("        return(rc);\n");
    	out.write("    }\n\n");
        	
    	// TODO: SERIALIZATION
    	out.write("    ////////////////////////////////////////////////////////////////////////////////\n");
    	out.write("    // Serialization\n");
    	out.write("    \n");
    	out.write("    @Override\n");
    	out.write("    public void serializeType(DmcOutputStreamIF dos) throws Exception {\n");
    	out.write("    	   if (sv == null){\n");
    	out.write("    		   for (" + cn + " d : mv){\n");
    	out.write("    			   dos.writeShort(d.intValue());\n");
    	out.write("    		   }\n");
    	out.write("    	   }\n");
    	out.write("    	   else{\n");
    	out.write("    		   dos.writeShort(sv.intValue());\n");
    	out.write("    	   }\n");
    	out.write("    }\n");
    	out.write("    \n");
    	out.write("    @Override\n");
    	out.write("    public void deserializeSV(DmcInputStreamIF dis) throws Exception {\n");
    	out.write("        sv = " + cn + ".get(dis.readShort());\n");
    	out.write("    }\n");
    	out.write("    \n");
    	out.write("    @Override\n");
    	out.write("    public void deserializeMV(DmcInputStreamIF dis) throws Exception {\n");
    	out.write("        if (mv == null)\n");
    	out.write("            mv = new ArrayList<" + cn + ">();\n");
    	out.write("        \n");
    	out.write("        mv.add(" + cn + ".get(dis.readShort()));\n");
    	out.write("    }\n");


    	

        out.write("\n");
        out.write("\n");

        out.write("}\n");

        out.close();

    }
}
