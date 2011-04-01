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
package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmoTypeFormatter will generate the various types associated with schema defined
 * enumerations and the object reference types.
 */
public class DmoTypeFormatter {
	
	String fileHeader;
	
	PrintStream	progress;

	public DmoTypeFormatter(){
		
	}
	
	public DmoTypeFormatter(PrintStream o){
		progress = o;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	
	public void dumpTypes(SchemaDefinition sd, String outdir) throws IOException{
		if (progress != null){
			progress.println("\n");
		}

		Iterator<TypeDefinition> tdl = sd.getInternalTypeDefList();
		if (tdl != null){
			while(tdl.hasNext()){
				TypeDefinition td = tdl.next();
				
				if (td.getIsEnumType())
					dumpEnumType(td,outdir);
				else{
					if (td.getHelperClassName() == null){
						dumpNormalREFType(td, outdir);
					}
					else{
						dumpNamedREF(td, outdir);
						dumpNamedREFHelperType(td,outdir);
					}
				}
			}
		}
		
		tdl = sd.getTypeDefList();
		if (tdl != null){
			while(tdl.hasNext()){
				TypeDefinition td = tdl.next();
				
//				DebugInfo.debug("ITS A USER DEFINED TYPE: " + td.getName());
				
				String tn 				= td.getName().getNameString();
				String primitiveImport 	= td.getDefinedIn().getSchemaPackage() + ".types.DmcType" + tn;
				String schemaPackage	= td.getDefinedIn().getSchemaPackage();
				String baseTypeImport	= td.getDefinedIn().getSchemaPackage() + ".types." + tn;
				
									// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	generic	isRef	fileHeader 	progress
				GenUtility.dumpSVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);
				GenUtility.dumpMVType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);
				GenUtility.dumpSETType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);

				if (td.getKeyClass() != null){
					String keyClass = td.getKeyClass();
					String keyImport = td.getKeyImport();
										// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	generic	keyClass	keyImport	fileHeader 	progress
					GenUtility.dumpMAPType(	outdir, 		schemaPackage,	baseTypeImport,	tn,			primitiveImport,	null,			null,		"",		keyClass,	keyImport,	fileHeader,	progress);
				}
			}
		}

	}
	
	private void dumpNormalREFType(TypeDefinition td, String outdir) throws IOException{
		String ofn = outdir + File.separator + "DmcType" + td.getName().getNameString() + "REF.java";
		
		// Don't generate for abstracts
		if (td.getOriginalClass().getClassType() == ClassTypeEnum.ABSTRACT)
			return;
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
     	out.write("import org.dmd.dmc.DmcAttribute;\n");
     	out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import " + schemaPackage + ".generated.dmo." + td.getName() + "DMO;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("abstract public class DmcType" + td.getName() + "REF extends DmcAttribute<" + td.getName() + "DMO> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(DmcAttributeInfo ai){\n");
      	out.write("        super(ai);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + "DMO typeCheck(Object value) throws DmcValueException {\n");
      	out.write("        " + td.getName() + "DMO rc = null;\n");
      	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "DMO){\n");
      	out.write("            rc = (" + td.getName() + "DMO)value;\n");
      	out.write("        }\n");
      	out.write("        else{\n");
      	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + "DMO expected.\"));\n");
      	out.write("        }\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n");
      	out.write("\n");
      	
      	out.write("    @Override\n");
      	out.write("    public void serializeValue(DmcOutputStreamIF dos, " + td.getName() + "DMO value) throws Exception {\n");
      	out.write("        value.serializeIt(dos);\n");
    	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public " + td.getName() + "DMO deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
      	out.write("        " + td.getName() + "DMO rc = new " + td.getName() + "DMO();\n");
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
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport	nameAttrImport 	nameAttr 	generic	isRef	fileHeader 	progress
		GenUtility.dumpSVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,		"",		true,	fileHeader,	progress);
		GenUtility.dumpMVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,		"",		true,	fileHeader,	progress);
		GenUtility.dumpSETType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,null,			null,		"",		true,	fileHeader,	progress);

	}
	
	
	private void dumpEnumType(TypeDefinition td, String outdir) throws IOException{
		String ofn = outdir + File.separator + "DmcType" + td.getName().getNameString() + ".java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
     	out.write("import org.dmd.dmc.DmcAttribute;\n");
     	out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import " + schemaPackage + ".generated.enums.*;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("abstract public class DmcType" + td.getName() + " extends DmcAttribute<" + td.getName() + "> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "(DmcAttributeInfo ai){\n");
      	out.write("        super(ai);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + " typeCheck(Object value) throws DmcValueException {\n");
      	out.write("        " + td.getName() + " rc = null;\n");
      	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "){\n");
      	out.write("            rc = (" + td.getName() + ")value;\n");
      	out.write("        }\n");
      	out.write("        else if (value instanceof String){\n");
      	out.write("            rc = " + td.getName() + ".get((String)value);\n");
      	out.write("            if (rc == null){\n");
      	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + td.getName() + " value.\"));\n");
      	out.write("            }\n");
      	out.write("        }\n");
      	out.write("        else if (value instanceof Integer){\n");
      	out.write("            rc = " + td.getName() + ".get((Integer)value);\n");
      	out.write("            if (rc == null){\n");
      	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + td.getName() + " value.\"));\n");
      	out.write("            }\n");
      	out.write("        }\n");
      	out.write("        else{\n");
      	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + " expected.\"));\n");
      	out.write("        }\n");
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
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport 	nameAttrImport 	nameAttr 	generic	isRef	fileHeader 	progress
		GenUtility.dumpSVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);
		GenUtility.dumpMVType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);
		GenUtility.dumpSETType(	outdir, 		schemaPackage,	null,			tn,			primitiveImport,	null,			null,		"",		false,	fileHeader,	progress);
	}
	
	/**
	 * Dumps the helper class <class name>REF.java for classes that used isNamedBy 
	 * to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpNamedREF(TypeDefinition td, String outdir) throws IOException {
		String ofn = outdir + File.separator + td.getName().getNameString() + "REF.java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	String base = "DmcNamedObjectNontransportableREF";
      	String baseImport = "org.dmd.dmc.DmcNamedObjectNontransportableREF";
      	
      	if (td.getOriginalClass().getIsTransportable()){
//      	if (td.getIsTransportable()){
      		base = "DmcNamedObjectTransportableREF";
      		baseImport = "org.dmd.dmc.DmcNamedObjectTransportableREF";
      	}
      	
      	String nameBaseImport = td.getOriginalClass().getIsNamedBy().getType().getDefinedIn().getSchemaPackage() + ".generated.types.DmcType";
      	String nameImport = td.getOriginalClass().getIsNamedBy().getType().getName().getNameString() + "SV";
      	
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dmc.DmcObjectNameIF;\n");
        out.write("import org.dmd.dmc.DmcValueException;\n");
        out.write("import org.dmd.dmc.DmcOutputStreamIF;\n");
        out.write("import org.dmd.dmc.DmcInputStreamIF;\n");
      	out.write("import " + baseImport + ";\n");
      	out.write("import " + td.getPrimitiveType() + ";\n");
//      	out.write("import " + td.getOriginalClass().getIsNamedBy().getType().getTypeClassName() + "SV;\n\n");
      	out.write("import " + nameBaseImport + nameImport + ";\n\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class " + td.getName() + "REF extends " + base + "<" + td.getName() + "DMO> {\n");
      	out.write("\n");
      	
      	String nameType = "DmcType" + td.getOriginalClass().getIsNamedBy().getType().getName().getNameString() + "SV";
      	
      	GenUtility.appendAttributeInfo(out, td.getOriginalClass().getIsNamedBy(), "false");
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

      	out.write("    public " + td.getName() + "REF(String n) throws DmcValueException {\n");
      	out.write("         object = null;\n");
      	out.write("         myName = new " + nameType + "();\n");
      	out.write("         myName.set(n);\n");
      	out.write("    }\n\n");

      	out.write("    public " + td.getName() + "REF("+ td.getName() + "REF original){\n");
        out.write("        myName = original.myName;\n");
        out.write("        object = original.object;\n");
      	out.write("    }\n\n");

      	out.write("    public void setObject(" + td.getName() + "DMO o){\n");
      	out.write("         object = o;\n");
      	out.write("         myName = (" + nameType + ")o.getObjectNameAttribute();\n");
      	out.write("    }\n\n");

        out.write("    /**\n");
        out.write("     * Clones this reference.\n");
        out.write("     */\n");
//        out.write("    @Override\n");
        out.write("    public " + td.getName() + "REF cloneMe(){\n");
        out.write("        " + td.getName() + "REF rc = new " + td.getName() + "REF();\n");
        out.write("        rc.myName = myName;\n");
        out.write("        rc.object = object;\n");
        out.write("        return(rc);\n");
    	out.write("    }\n\n");
        
    	String attrName = td.getOriginalClass().getIsNamedBy().getName().getNameString();

        out.write("    @Override\n");
      	out.write("    public void setName(DmcObjectNameIF n) throws DmcValueException {\n");
      	out.write("        if (myName == null);\n");
      	out.write("            myName = new " + nameType + "(__" + attrName + ");\n");
      	out.write("        myName.set(n);\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public DmcObjectNameIF getObjectName(){\n");
      	out.write("        return(myName.getSV());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    public DmcAttribute<?> getObjectNameAttribute(){\n");
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
//		String primitiveImport 	= schemaPackage + ".generated.enums." + tn;
		String nameAttrImport	= td.getOriginalClass().getIsNamedBy().getType().getTypeClassName();
		String nameAttr			= td.getOriginalClass().getIsNamedBy().getType().getName().getNameString();
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport	nameAttrImport 	nameAttr 	generic	isRef	fileHeader 	progress
		GenUtility.dumpSVType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,	"",		true,	fileHeader,	progress);
		GenUtility.dumpMVType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,	"",		true,	fileHeader,	progress);
		GenUtility.dumpSETType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,	"",		true,	fileHeader,	progress);

		String keyClass 		= nameAttr;
		String keyImport 		= td.getOriginalClass().getIsNamedBy().getType().getPrimitiveType();
//		String primitiveImport 	= td.getDefinedIn().getSchemaPackage() + ".types.DmcType" + tn;
//		String baseTypeImport	= td.getDefinedIn().getSchemaPackage() + ".types." + tn;
		
							// 	dmotypedir 		basePackage 	baseTypeImport 	typeName 	primitiveImport nameAttrImport 	nameAttr 	generic	keyClass	keyImport	fileHeader 	progress
		GenUtility.dumpMAPType(	outdir, 		schemaPackage,	null,			tn,			null,			nameAttrImport,	nameAttr,		"",	keyClass,	keyImport,	fileHeader,	progress);

	}
	
	/**
	 * Dumps the type class DmcType<class name>REF.java to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpNamedREFHelperType(TypeDefinition td, String outdir) throws IOException {
		String ofn = outdir + File.separator + "DmcType" + td.getName().getNameString() + "REF.java";
		
		AttributeDefinition isNamedBy = td.getOriginalClass().getIsNamedBy();
		String nameAttributeType = isNamedBy.getType().getPrimitiveType();
		String nameType = isNamedBy.getType().getName().getNameString();
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
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
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
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


    	
    	//        out.write("    @Override\n");
//        out.write("    /**\n");
//        out.write("     * Returns a clone of this attribute.\n");
//        out.write("     */\n");
//        out.write("    public DmcType" + td.getName() + "REF cloneMe(){\n");
//    	out.write("        DmcType" + td.getName() + "REF rc = new DmcType" + td.getName() + "REF();\n");
//    	out.write("        if (mv == null){\n");
//    	out.write("            rc.sv = sv.cloneMe();\n");
//    	out.write("        }\n");
//    	out.write("        else{\n");
//    	out.write("            rc.mv = new ArrayList<" + td.getName() + "REF>();\n");
//    	out.write("            for(" + td.getName() + "REF val : mv){\n");
//    	out.write("                rc.mv.add(val.cloneMe());\n");
//    	out.write("            }\n");
//    	out.write("        }\n");
//    	out.write("        return(rc);\n");
//    	out.write("    }\n\n");
//        		
//        out.write("    /**\n");
//        out.write("     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.\n");
//        out.write("     */\n");
//        out.write("    public DmcType" + td.getName() + "REF getOneOfMe(){\n");
//    	out.write("        DmcType" + td.getName() + "REF rc = new DmcType" + td.getName() + "REF();\n");
//    	out.write("        return(rc);\n");
//    	out.write("    }\n\n");
//        		
//        out.write("    /**\n");
//        out.write("     * Returns a clone of a value associated with this type.\n");
//        out.write("     */\n");
//        out.write("    public " + td.getName() + "REF cloneValue(" + td.getName() + "REF val){\n");
//    	out.write("        " + td.getName() + "REF rc = new " + td.getName() + "REF(val);\n");
//    	out.write("        return(rc);\n");
//    	out.write("    }\n\n");
//        		
//        out.write("    /**\n");
//        out.write("     * Returns the object associated with the name.\n");
//        out.write("     */\n");
//        out.write("    public " + td.getName() + "REF getByKey(Object key){\n");
//    	out.write("        \n");
//    	out.write("        return(null);\n");
//    	out.write("    }\n\n");
        		
        out.write("\n\n}\n");
        
        out.close();
	}
	

}
