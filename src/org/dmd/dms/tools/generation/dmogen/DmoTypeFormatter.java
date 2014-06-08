//	---------------------------------------------------------------------------
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
package org.dmd.dms.tools.generation.dmogen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ComplexTypeDefinition;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;
import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;
import org.dmd.dms.tools.util.MAPTypeFormatter;
import org.dmd.dms.tools.util.MVTypeFormatter;
import org.dmd.dms.tools.util.SETTypeFormatter;
import org.dmd.dms.tools.util.SVTypeFormatter;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;

/**
 * The DmoTypeFormatter will generate the various types associated with schema defined
 * enumerations and the object reference types.
 */
public class DmoTypeFormatter {
	
	static private String fileHeader;
		
	/**
	 * Dumps the types associated with enums and object references.
	 * @param module the schema module
	 * @param outdir the output directory
	 * @param fh     the fileheader
	 * @throws IOException
	 */
	static public void dumpTypes(DmsModule module, String outdir, String fh) throws IOException{
		fileHeader = fh;
		
//		Iterator<TypeDefinition> tdl = sd.getInternalTypeDefList();
//		if (tdl != null){
//			while(tdl.hasNext()){
//				TypeDefinition td = tdl.next();
//				
//				if (td.getIsEnumType())
//					dumpEnumType(td,outdir);
//				else if (td.getIsRefType()){
//					if (td.getHelperClassName() == null){
//						dumpNormalREFType(td, outdir);
//					}
//					else{
//						dumpNamedREF(td, outdir);
//						dumpNamedREFHelperType(td,outdir);
//					}
//				}
//			}
//		}
		
		Iterator<TypeDefinition> tdl = module.getAllTypeDefinition();
		while(tdl.hasNext()){
			TypeDefinition td = tdl.next();
			
			
			if (td.getInternallyGenerated()){
				DebugInfo.debug(td.toOIF());
				if (td.getIsEnumType())
					dumpEnumType(td,outdir);
				else if (td.getIsRefType()){
					if (td.getHelperClassName() == null){
						dumpNormalREFType(td, outdir);
					}
					else{
						dumpNamedREF(td, outdir);
						dumpNamedREFHelperType(td,outdir);
					}
				}
				continue;
			}
			
			String tn 				= td.getName().getNameString();
			String primitiveImport 	= td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + tn;
			String schemaPackage	= td.getDefinedInDmsModule().getSchemaPackage();
			String baseTypeImport	= td.getDefinedInDmsModule().getSchemaPackage() + ".generated.types." + tn;
			String nameAttrID		= null;
			
			if (td.getIsEnumType()){
//				primitiveImport 	= td.getDefinedInDmsModule().getSchemaPackage() + ".types.DmcType" + tn;
				baseTypeImport	= td.getDefinedInDmsModule().getSchemaPackage() + ".generated.enums." + tn;
			}
			
			if (td.getIsNameType()){
				nameAttrID = td.getNameAttributeDef().getDmdID().toString();
			}
			if (td.getIsFilterType()){
				nameAttrID = td.getFilterAttributeDef().getDmdID().toString();
			}
			
									// 		dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType			isFilterType			fileHeader
			SVTypeFormatter.dumpSVType(		outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		nameAttrID,	"",		false,	td.getIsNameType(),	td.getIsFilterType(),	fileHeader);
			MVTypeFormatter.dumpMVType(		outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,												fileHeader);
			SETTypeFormatter.dumpSETType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,												fileHeader);

			if (td.getKeyClass() != null){
				String keyClass = td.getKeyClass();
				String keyImport = td.getKeyImport();
									// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	generic	keyClass	keyImport	fileHeader
				MAPTypeFormatter.dumpMAPType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		"",		keyClass,	keyImport,	fileHeader);
			}
		}
		
		Iterator<ComplexTypeDefinition> ctdl = module.getAllComplexTypeDefinition();
		if (ctdl != null){
			while(ctdl.hasNext()){
				ComplexTypeDefinition ctd = ctdl.next();
				
				String tn 				= ctd.getName().getNameString();
				String primitiveImport 	= ctd.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + tn;
				String schemaPackage	= ctd.getDefinedInDmsModule().getSchemaPackage();
				String baseTypeImport	= ctd.getDefinedInDmsModule().getSchemaPackage() + ".generated.types." + tn;
				String nameAttrID		= null;
				
				// 						dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType	isFilterType	fileHeader
				SVTypeFormatter.dumpSVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		nameAttrID,	"",		false,	false,		false,			fileHeader);
				MVTypeFormatter.dumpMVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,								fileHeader);
				SETTypeFormatter.dumpSETType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,								fileHeader);

			}
		}

		Iterator<ExtendedReferenceTypeDefinition> ertdl = module.getAllExtendedReferenceTypeDefinition();
		if (ertdl != null){
			while(ertdl.hasNext()){
				ExtendedReferenceTypeDefinition ertd = ertdl.next();
				
				String tn 				= ertd.getName().getNameString();
				String primitiveImport 	= ertd.getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType" + tn;
				String schemaPackage	= ertd.getDefinedInDmsModule().getSchemaPackage();
				String baseTypeImport	= ertd.getDefinedInDmsModule().getSchemaPackage() + ".generated.types." + tn;
				String nameAttrID		= null;
				
				// 						dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType	isFilterType	fileHeader
				SVTypeFormatter.dumpSVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		nameAttrID,	"",		false,	false,		false,			fileHeader);
				MVTypeFormatter.dumpMVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,								fileHeader);
				SETTypeFormatter.dumpSETType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,					"",		false,								fileHeader);

			}
		}

	}
	
	static private void dumpNormalREFType(TypeDefinition td, String outdir) throws IOException{
		// Don't generate for extended reference types - the original will be null
		if (td.getOriginalClass() == null)
			return;
		
		// We don't generate for extended reference types
		if (td.getIsExtendedRefType())
			return;
		
		// Don't generate for abstracts
		if (td.getOriginalClass().getClassType() == ClassTypeEnum.ABSTRACT)
			return;
		
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, "DmcType" + td.getName().getNameString() + "REF.java");
		
        out.write(fileHeader);

      	String schemaPackage = td.getDefinedInDmsModule().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	ImportManager imports = new ImportManager();
      	
        imports.addImport("java.io.Serializable","Standard marker interface");
        imports.addImport("org.dmd.core.interfaces.DmcInputStreamIF","To allow deserialization");
        imports.addImport("org.dmd.core.interfaces.DmcOutputStreamIF","To allow serialization");
        imports.addImport("org.dmd.core.DmcAttribute","What we're derived from");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","To allow construction");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","To handle errors");
        imports.addImport(schemaPackage + ".generated.dmo." + td.getName() + "DMO","");
      	
      	out.write(imports.getFormattedImports() + "\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedInDmsModule().getName() + " schema at version " + td.getDefinedInDmsModule().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("abstract public class DmcType" + td.getName() + "REF extends DmcAttribute<" + td.getName() + "DMO> implements Serializable {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(DmcAttributeInfo ai){\n");
      	out.write("        super(ai);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + "DMO typeCheck(Object value) throws DMFeedbackSet {\n");
      	out.write("        if (value instanceof " + td.getName() + "DMO)\n");
      	out.write("            return((" + td.getName() + "DMO)value);\n");
      	out.write("        \n");
      	out.write("        throw(new DMFeedbackSet(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + "DMO expected.\"));\n");
      	out.write("    }\n");
      	out.write("\n");
      	
      	out.write("    @Override\n");
      	out.write("    public void serializeValue(DmcOutputStreamIF dos, " + td.getName() + "DMO value) throws Exception {\n");
      	out.write("        value.serializeIt(dos);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public " + td.getName() + "DMO deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        " + td.getName() + "DMO rc = (" + td.getName()+ "DMO)dis.getDMOInstance(dis);\n");
      	out.write("        rc.deserializeIt(dis);\n");
      	out.write("        return(rc);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public " + td.getName() + "DMO cloneValue(" + td.getName() + "DMO value){\n");
      	out.write("        return((" + td.getName() + "DMO)value.cloneIt());\n");
    	out.write("    }\n\n");        		
      	
      	out.write("}\n");

		out.close();
		
		String tn 	= td.getOriginalClass().getName().getNameString();
		String primitiveImport = schemaPackage + ".generated.dmo." + tn;
		
                   				  // dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType			isFilterType			fileHeader
		SVTypeFormatter.dumpSVType(	 outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,		null,		"",		true,	td.getIsNameType(),	td.getIsFilterType(), 	fileHeader);
		MVTypeFormatter.dumpMVType(	 outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,					"",		true,												fileHeader);
		SETTypeFormatter.dumpSETType(outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,					"",		true,												fileHeader);

	}
	
	
	static private void dumpEnumType(TypeDefinition td, String outdir) throws IOException{
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, "DmcType" + td.getName().getNameString() + ".java");
		
        out.write(fileHeader);

      	String schemaPackage = td.getDefinedInDmsModule().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	ImportManager imports = new ImportManager();
      	
        imports.addImport("java.io.Serializable","Standard marker interface");
        imports.addImport("org.dmd.core.interfaces.DmcInputStreamIF","To support deserialization");
        imports.addImport("org.dmd.core.interfaces.DmcOutputStreamIF","To support serialization");
        imports.addImport("org.dmd.core.DmcAttribute","What we derive from");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","To allow construction");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","To handle errors");
        imports.addImport(schemaPackage + ".generated.enums.*","Access to base enum");
      	
      	out.write(imports.getFormattedImports() + "\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedInDmsModule().getName() + " schema at version " + td.getDefinedInDmsModule().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("abstract public class DmcType" + td.getName() + " extends DmcAttribute<" + td.getName() + "> implements Serializable {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "(DmcAttributeInfo ai){\n");
      	out.write("        super(ai);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + " typeCheck(Object value) throws DMFeedbackSet {\n");
      	out.write("        " + td.getName() + " rc = null;\n");
      	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "){\n");
      	out.write("            rc = (" + td.getName() + ")value;\n");
      	out.write("        }\n");
      	out.write("        else if (value instanceof String){\n");
      	out.write("            rc = " + td.getName() + ".get((String)value);\n");
      	out.write("        }\n");
      	out.write("        else if (value instanceof Integer){\n");
      	out.write("            rc = " + td.getName() + ".get((Integer)value);\n");
      	out.write("        }\n");
      	out.write("        else{\n");
      	out.write("            throw(new DMFeedbackSet(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + " expected.\"));\n");
      	out.write("        }\n\n");
      	out.write("        if (rc == null){\n");
      	out.write("            throw(new DMFeedbackSet(\"Value: \" + value.toString() + \" is not a valid " + td.getName() + " value.\"));\n");
      	out.write("        }\n\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n");
      	out.write("\n");
      	
        out.write("    /**\n");
        out.write("     * Returns a clone of a value associated with this type.\n");
        out.write("     */\n");
        out.write("    public " + td.getName() + " cloneValue(" + td.getName() + " val){\n");
    	out.write("        return(val);\n");
    	out.write("    }\n\n");
        		
        out.write("    /**\n");
        out.write("     * Writes a " + td.getName() + ".\n");
        out.write("     */\n");
        out.write("    public void serializeValue(DmcOutputStreamIF dos, " + td.getName() + " value) throws Exception {\n");
    	out.write("        dos.writeShort(value.intValue());\n");
    	out.write("    }\n\n");
        	
        out.write("    /**\n");
        out.write("     * Reads a " + td.getName() + ".\n");
        out.write("     */\n");
        out.write("    public " + td.getName() + " deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
    	out.write("        return(" + td.getName() + ".get(dis.readShort()));\n");
    	out.write("    }\n\n");

      	out.write("}\n");

		out.close();
		
		String tn 				= td.getName().getNameString();
		String primitiveImport 	= schemaPackage + ".generated.enums." + tn;
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType			isFilterType			fileHeader
		SVTypeFormatter.dumpSVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,		null,		"",		false,	td.getIsNameType(),	td.getIsFilterType(),	fileHeader);
		MVTypeFormatter.dumpMVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,					"",		false,												fileHeader);
		SETTypeFormatter.dumpSETType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,					"",		false,												fileHeader);
	}
	
	/**
	 * Dumps the helper class <class name>REF.java for classes that used isNamedBy 
	 * to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	static private void dumpNamedREF(TypeDefinition td, String outdir) throws IOException {
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, td.getName().getNameString() + "REF.java");
		
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedInDmsModule().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	String base = "DmcNamedObjectNontransportableREF";
      	String baseImport = "org.dmd.dmc.DmcNamedObjectNontransportableREF";
      	
      	String nameBaseImport = td.getOriginalClass().getIsNamedBy().getType().getDefinedInDmsModule().getSchemaPackage() + ".generated.types.DmcType";
      	String nameImport = td.getOriginalClass().getIsNamedBy().getType().getName().getNameString() + "SV";
      	
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcObjectName;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
      	out.write("import " + baseImport + "; // base import\n");
      	out.write("import " + td.getPrimitiveType() + "; // primitive type\n");
      	out.write("import " + td.getOriginalClass().getIsNamedBy().getType().getPrimitiveType() + ";\n");
      	out.write("import " + nameBaseImport + nameImport + "; \n\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedInDmsModule().getName() + " schema at version " + td.getDefinedInDmsModule().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class " + td.getName() + "REF extends " + base + "<" + td.getName() + "DMO> {\n");
      	out.write("\n");
      	
      	String nameType = "DmcType" + td.getOriginalClass().getIsNamedBy().getType().getName().getNameString() + "SV";
    	String attrName = td.getOriginalClass().getIsNamedBy().getName().getNameString();
      	
      	appendAttributeInfo(out, td.getOriginalClass().getIsNamedBy());
      	out.write("    \n");
      	
      	out.write("    " + nameType + " myName;");
      	
      	out.write("    \n");
      	out.write("    \n");
      	out.write("    public " + td.getName() + "REF(){\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getName() + "REF(" + td.getName() + "DMO o){\n");
      	out.write("         object = o;\n");
      	out.write("         myName = (" + nameType + ")o.getObjectNameAttribute();\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getName() + "REF(" + td.getOriginalClass().getIsNamedBy().getType().getName().getNameString() + " n) throws DmcValueException {\n");
      	out.write("         object = null;\n");
      	out.write("         myName = new " + nameType + "(__" + attrName + ");\n");
      	out.write("         myName.set(n);\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getName() + "REF(String n) throws DmcValueException {\n");
      	out.write("         object = null;\n");
      	out.write("         myName = new " + nameType + "(__" + attrName + ");\n");
      	out.write("         myName.set(n);\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getName() + "REF("+ td.getName() + "REF original){\n");
        out.write("        myName = original.myName;\n");
        out.write("        object = original.object;\n");
      	out.write("    }\n\n");

      	out.write("    public void setObject(" + td.getName() + "DMO o){\n");
      	out.write("         object = o;\n");
      	out.write("         if (object != null)\n");
      	out.write("             myName = (" + nameType + ")o.getObjectNameAttribute();\n");
      	out.write("    }\n\n");

        out.write("    /**\n");
        out.write("     * Clones this reference.\n");
        out.write("     */\n");
        out.write("    public " + td.getName() + "REF cloneMe(){\n");
        out.write("        " + td.getName() + "REF rc = new " + td.getName() + "REF();\n");
        out.write("        rc.myName = myName;\n");
        out.write("        rc.object = object;\n");
        out.write("        return(rc);\n");
    	out.write("    }\n\n");
        
        out.write("    @Override\n");
      	out.write("    public void setName(DmcObjectName n) throws DmcValueException {\n");
      	out.write("        if (myName == null)\n");
      	out.write("            myName = new " + nameType + "(__" + attrName + ");\n");
      	out.write("        myName.set(n);\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public DmcObjectName getObjectName(){\n");
      	out.write("        if (myName == null)\n");
      	out.write("            throw(new IllegalStateException(\"You've tried to access the name of an object but the name attribute hasn't been set.\"));\n");
      	out.write("        \n");
      	out.write("        return(myName.getSV());\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getOriginalClass().getIsNamedBy().getType().getName() + " getName(){\n");
      	out.write("        if (myName == null)\n");
      	out.write("            throw(new IllegalStateException(\"You've tried to access the name of an object but the name attribute hasn't been set.\"));\n");
      	out.write("        \n");
      	out.write("        return(myName.getSV());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public DmcAttribute<?> getObjectNameAttribute(){\n");
      	out.write("        if (myName == null)\n");
      	out.write("            throw(new IllegalStateException(\"You've tried to access the name of an object but the name attribute hasn't been set.\"));\n");
      	out.write("        \n");
      	out.write("        return(myName);\n");
      	out.write("    }\n\n");
      	
      	out.write("    public void serializeIt(DmcOutputStreamIF dos) throws Exception {\n");
      	out.write("        myName.serializeIt(dos);\n");
      	out.write("    }\n\n");
      	
      	out.write("    public void deserializeIt(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        myName = (" + nameType + ") dis.getAttributeInstance();\n");
      	out.write("        myName.deserializeIt(dis);\n");
      	out.write("    }\n\n");
      	
        out.write("}\n");
        
        out.close();
        
        
		String tn 				= td.getOriginalClass().getName().getNameString() + "REF";
		String nameAttrImport	= td.getOriginalClass().getIsNamedBy().getType().getTypeClassName();
		String nameAttr			= td.getOriginalClass().getIsNamedBy().getType().getName().getNameString();
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport	nameAttrImport 	nameAttr 	nameAttrID	generic	isRef	isNameType			isFilterType			fileHeader
		SVTypeFormatter.dumpSVType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,	null,		"",		true,	td.getIsNameType(),	td.getIsFilterType(),	fileHeader);
		MVTypeFormatter.dumpMVType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,				"",		true,												fileHeader);
		SETTypeFormatter.dumpSETType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,				"",		true,												fileHeader);

		String keyClass 		= nameAttr;
		String keyImport 		= td.getOriginalClass().getIsNamedBy().getType().getPrimitiveType();
//		String primitiveImport 	= td.getDefinedInDmsModule().getSchemaPackage() + ".types.DmcType" + tn;
//		String baseTypeImport	= td.getDefinedInDmsModule().getSchemaPackage() + ".types." + tn;
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport nameAttrImport 	nameAttr 	generic	keyClass	keyImport	fileHeader
		MAPTypeFormatter.dumpMAPType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,		"",	keyClass,	keyImport,	fileHeader);

	}
	
	/**
	 * Dumps the type class DmcType<class name>REF.java to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	static private void dumpNamedREFHelperType(TypeDefinition td, String outdir) throws IOException {
		AttributeDefinition isNamedBy 			= td.getOriginalClass().getIsNamedBy();
		String 				nameAttributeType 	= isNamedBy.getType().getPrimitiveType();
		String 				nameType 			= isNamedBy.getType().getName().getNameString();
		BufferedWriter 		out 				= FileUpdateManager.instance().getWriter(outdir, "DmcType" + td.getName().getNameString() + "REF.java");
		
        out.write(fileHeader);

      	String schemaPackage = td.getDefinedInDmsModule().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
            	
      	out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
      	out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
      	out.write("import org.dmd.dmc.types.DmcTypeNamedObjectREF;\n");
      	out.write("import " + nameAttributeType + ";\n\n");
      	out.write("import " + td.getHelperClassName() + ";\n\n");
      	out.write("import " + schemaPackage + ".generated.dmo." + td.getName() + "DMO;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedInDmsModule().getName() + " schema at version " + td.getDefinedInDmsModule().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("abstract public class DmcType" + td.getName() + "REF extends DmcTypeNamedObjectREF<" + td.getName() + "REF, " + nameType + "> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(){\n");
      	out.write("    \n");
      	out.write("    }\n\n");

      	out.write("    public DmcType" + td.getName() + "REF(DmcAttributeInfo ai){\n");
      	out.write("        super(ai);\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected " + td.getName() + "REF getNewHelper(){\n");
      	out.write("        return(new " + td.getName() + "REF());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected " + nameType + " getNewName(){\n");
      	out.write("        return(new " + nameType + "());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected String getDMOClassName(){\n");
      	out.write("        return( " + td.getName() + "DMO.class.getName());\n");
      	out.write("    }\n\n");
      	
      	out.write("    @Override\n");
      	out.write("    protected boolean isDMO(Object value){\n");
      	out.write("        if (value instanceof " + td.getName() + "DMO)\n");
      	out.write("            return(true);\n");
      	out.write("        return(false);\n");
    	out.write("    }\n\n");

    	String allowed = td.getName() + "REF, " + td.getName() + "DMO or String";
    	
      	out.write("    @Override\n");
      	out.write("    protected " + td.getName() + "REF typeCheck(Object value) throws DmcValueException {\n");
      	out.write("        " + td.getName() + "REF rc = null;\n");
    	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "REF)\n");
      	out.write("            rc = (" + td.getName() + "REF)value;\n");
      	out.write("        else if (value instanceof " + td.getName() + "DMO)\n");
      	out.write("            rc = new " + td.getName() + "REF((" + td.getName() + "DMO)value);\n");
      	out.write("        else if (value instanceof " + nameType + ")\n");
      	out.write("            rc = new " + td.getName() + "REF((" + nameType + ")value);\n");
      	out.write("        else if (value instanceof String)\n");
      	out.write("            rc = new " + td.getName() + "REF((String)value);\n");
    	out.write("        else\n");
    	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + allowed + " expected.\"));\n");
    	out.write("\n");
      	out.write("        return(rc);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public void serializeValue(DmcOutputStreamIF dos, " + td.getName() + "REF value) throws Exception {\n");
      	out.write("        value.serializeIt(dos);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public " + td.getName() + "REF deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        " + td.getName() + "REF rc = new " + td.getName() + "REF();\n");
      	out.write("        rc.deserializeIt(dis);\n");
      	out.write("        return(rc);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public " + td.getName() + "REF cloneValue(" + td.getName() + "REF value){\n");
      	out.write("        return(new " + td.getName() + "REF(value));\n");
    	out.write("    }\n\n");
    	
        out.write("\n\n}\n");
        
        out.close();
	}
	
    static private void appendAttributeInfo(BufferedWriter out, AttributeDefinition ad) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
    	out.write("\"" + ad.getName().getNameString() + "\",");
    	out.write(ad.getDmdID() + ",");
    	out.write("\"" + ad.getType().getName().getNameString() + "\",");
		out.write("ValueTypeEnum." + ad.getValueType() + ",");
		out.write("DataTypeEnum." + ad.getDataType() + ");\n");
    }

}
