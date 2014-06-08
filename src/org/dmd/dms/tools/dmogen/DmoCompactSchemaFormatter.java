//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.tools.dmogen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.SchemaManager;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.server.extended.RuleDefinition;
import org.dmd.dms.server.extended.SliceDefinition;
import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.shared.generated.dmo.RuleDataDMO;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.dms.tools.util.CompactSchemaHelper;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.runtime.DebugInfo;

/**
 * The DmoCompactSchemaFormatter is used to generate a compact form of the Dark Matter Schema
 * for use in restricted Java environments, such as GWT.
 */
public class DmoCompactSchemaFormatter {

//	PrintStream	progress;
	
	// This value is incremented as we format non-native attributes on extensible classes
	// so that their temporary container attribute instances have unique names.
	static int	uniqueNum;
	
	public DmoCompactSchemaFormatter(PrintStream p){
//		progress = p;
		uniqueNum = 1;
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 */
	static public void dumpCompactSchema(DmsModule module, String dmodir) throws IOException, IllegalArgumentException {
		uniqueNum = 1;

		String schemaName = Manipulator.dotNameToCamelCase(module.getName().getNameString()) + "CompactSchema";
		
//		TreeMap<String,ClassDefinition> classes = new TreeMap<String, ClassDefinition>();
//		
//		TreeMap<String,AttributeDefinition> attributes = new TreeMap<String, AttributeDefinition>();
//		
//		TreeMap<String,TypeDefinition> types = new TreeMap<String, TypeDefinition>();
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        StringBuffer nameBuilders = new StringBuffer();
        
        StringBuffer filterBuilders = new StringBuffer();
        
        dumpHeaderDMSAG(out, module, nameBuilders, filterBuilders);
        
//        Iterator<ClassDefinition> cds = sd.getClassDefList();
//		if (cds != null){
//			while(cds.hasNext()){
//				ClassDefinition cd = cds.next();
//				classes.put(cd.getName().getNameString(), cd);
//			}
//		}
//			
//        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
//		if (ads != null){
//			while(ads.hasNext()){
//				AttributeDefinition ad = ads.next();
//				attributes.put(ad.getName().getNameString(), ad);
//			}
//		}
//			
//        Iterator<TypeDefinition> tds = sd.getTypeDefList();
//		if (tds != null){
//			while(tds.hasNext()){
//				TypeDefinition td = tds.next();
//				types.put(td.getName().getNameString(), td);
//			}
//		}
//		
//		tds = sd.getInternalTypeDefList();
//		if (tds != null){
//			while(tds.hasNext()){
//				TypeDefinition td = tds.next();
//				types.put(td.getName().getNameString(), td);
//			}
//		}
		
        // Dump the separate class that initializes the _SmAp
        dumpAttributeMapInitializer(module, dmodir);
        
        // Dump the separate class that initializes the _CmAp;
        dumpClassMapInitializer(module, dmodir);
		
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcCompactSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + module.getName().getNameString() + "\";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaBaseID = " + module.getSchemaBaseID() + ";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaIDRange = " + module.getSchemaIDRange() + ";\n");
        out.write("\n");

        int max = module.getSchemaBaseID() + module.getSchemaIDRange();
        
        out.write("\n");
        out.write("    static int schemaMaxID = " + max + ";\n");
        out.write("\n");

        Iterator<AttributeDefinition> adit = module.getAllAttributeDefinition();
        while(adit.hasNext()){
        	AttributeDefinition ad = adit.next();
        	
			//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
			out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
			out.write("\"" + ad.getDefinedInDmsModule().getName() + "\"");
			out.write(", \"" + ad.getName().getNameString() + "\"");
			out.write(", " + ad.getDmdID());
			out.write(", \"" + ad.getType().getName().getNameString() + "\"");
			out.write(", ValueTypeEnum." + ad.getValueType());
			out.write(", DataTypeEnum." + ad.getDataType());
			
			String indexSize		= ", 0";
			String weakReference	= ", false";
			
			if (ad.getIndexSize() != null)
				indexSize = ", " + ad.getIndexSize();
			
			if (ad.getWeakReference() != null)
				weakReference = ", " + ad.getWeakReference();
			
			out.write(indexSize + weakReference + ");\n");
			
		}
        
        if (module.getTypeDefinitionCount() > 0){
            out.write("\n");
    		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		Iterator<TypeDefinition> typeit = module.getAllTypeDefinition();
    		while(typeit.hasNext()){
    			TypeDefinition td = typeit.next();
    			
	        	if (td.getInternallyGenerated() == false){
	        		// This is a straightforward type definition
	        		
	        		if (td.getIsNameType() == false)
	        			out.write("    public final static DmcTypeInfo __type_" + td.getName().getNameString() + " = new DmcTypeInfo(\"" + td.getName().getNameString() + "\", OriginalTypeEnum.TYPE);\n");
	        		else
	        			out.write("    public final static DmcTypeInfo __type_" + td.getName().getNameString() + " = new DmcTypeInfo(\"" + td.getName().getNameString() + "\", OriginalTypeEnum.NAMETYPE);\n");

	        	}
	        	else{
	        		// Have to check extended ref before ref type since both values are set of extended refs.
	        		
	        		if (td.getIsEnumType())
	        			out.write("    public final static DmcTypeInfo __type_" + td.getName().getNameString() + " = new DmcTypeInfo(\"" + td.getName().getNameString() + "\", OriginalTypeEnum.ENUM);\n");
	        		else if (td.getIsExtendedRefType())
	        			out.write("    public final static DmcTypeInfo __type_" + td.getName().getNameString() + " = new DmcTypeInfo(\"" + td.getName().getNameString() + "\", OriginalTypeEnum.EXTREF);\n");
	        		else if (td.getIsRefType()){
	        			// We actually want to distinguish between unnamed objects and named objects
	        			if (td.getOriginalClass().getIsNamedBy() == null)
		        			out.write("    public final static DmcTypeInfo __type_" + td.getOriginalClass().getName().getNameString() + " = new DmcTypeInfo(\"" + td.getOriginalClass().getName().getNameString() + "\", OriginalTypeEnum.OBJECT);\n");
	        			else
	        				out.write("    public final static DmcTypeInfo __type_" + td.getOriginalClass().getName().getNameString() + " = new DmcTypeInfo(\"" + td.getOriginalClass().getName().getNameString() + "\", OriginalTypeEnum.REFERENCE);\n");
	        		}
	        		else{
	        			// Fixed 20130121 for references to classes
	        			if (td.getOriginalClass() == null)
		        			out.write("    public final static DmcTypeInfo __type_" + td.getName().getNameString() + " = new DmcTypeInfo(\"" + td.getName().getNameString() + "\", OriginalTypeEnum.COMPLEXTYPE);\n");
	        			else
	        				out.write("    public final static DmcTypeInfo __type_" + td.getOriginalClass().getName().getNameString() + " = new DmcTypeInfo(\"" + td.getOriginalClass().getName().getNameString() + "\", OriginalTypeEnum.COMPLEXTYPE);\n");
	        		}
	        	}
	        	
//	        	System.out.println("HERE\n\n" + td.toOIF());
    		}
        }
        
        if (module.getClassDefinitionCount() > 0){
            out.write("\n");
    		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        TreeMap<String,ClassNode> hierarchy = getHierarchy(module.getAllClassDefinition());
	        for(ClassNode cn: hierarchy.values()){
	        	cn.writeClassInfo(out);
			}
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        if (module.getSliceDefinitionCount() > 0){
	        out.write("\n");
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			Iterator<SliceDefinition> sliceit = module.getAllSliceDefinition();
			while(sliceit.hasNext()){
	        	SliceDefinition slice = sliceit.next();
	        	
				out.write("    public final static DmcSliceInfo __" + slice.getName() + " = new DmcSliceInfo(\"" + slice.getName() + "\");\n");
	        	for(AttributeDefinition ad: slice.getSelectAttribute()){
					out.write("    // " + ad.getName() + "\n");
	        	}
	        	out.write("\n");
				
	        }
        }
        
        ///////////////////////////////////////////////////////////////////////
        
		System.err.println(DebugInfo.getWhereWeAreNow() + "     NOT DUMPING RULE STUFF!!!");
        
//        Iterator<DMUncheckedObject>	rules = sd.getParsedRules();
//        
//        if (rules != null){
//        	out.write("\n");
//			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//        	while(rules.hasNext()){
//				DMUncheckedObject ruleData = rules.next();
//				
//				String dataName 	= ruleData.getConstructionClass();
//				int dataPos 		= dataName.indexOf("Data");
//				String ruleClass 	= dataName.substring(0, dataPos);
//				String ruleName		= ruleData.getSV("ruleName");
//				
//				out.write("    public final static " + ruleClass + " __" + ruleName + ";\n");
//        	}
//        }
        
        ///////////////////////////////////////////////////////////////////////
        // Static initializer

        CompactSchemaHelper.writeCommonPart1(out);
        
        // Inside the static initializer
        
		out.write("        " + schemaName + "AMAP.initSmAp(_SmAp);\n\n");
        
        out.write("        " + schemaName + "CMAP.initCmAp(_CmAp);\n\n");
        
		out.write("    }\n\n");
		
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    static {\n\n");
		
		out.write(nameBuilders.toString());

		Iterator<SliceDefinition> sliceit = module.getAllSliceDefinition();
		while(sliceit.hasNext()){
        	SliceDefinition slice = sliceit.next();
        	
	        out.write("\n");
            // _SmAp.put(__jobName.name,__jobName);
        	for(AttributeDefinition ad: slice.getSelectAttribute()){
				out.write("        __" + slice.getName().getNameString() + ".addAttributeID(" + ad.getDmdID() + ");\n");
        	}
        	
			out.write("        _SImAp.put(\"" + slice.getName() + "\",__" + slice.getName().getNameString() + ");\n");
		}
        
		if (module.getClassDefinitionCount() > 0){
			Iterator<ClassDefinition> cdit = module.getAllClassDefinition();
			while(cdit.hasNext()){
				ClassDefinition cd = cdit.next();
				out.write("\n");
				
				String attr = null;
				for (AttributeDefinition ad: cd.getMust()){
					if (ad.getDefinedInDmsModule() == cd.getDefinedInDmsModule())
						attr = "__" + ad.getName();
					else
						attr = ad.getDefinedInDmsModule().getCompactSchemaName() + ".__" + ad.getName();
					out.write("        __" + cd.getName() + ".addMust(" + attr + ");\n");
				}
				
				for (AttributeDefinition ad: cd.getMay()){
					if (ad.getDefinedInDmsModule() == cd.getDefinedInDmsModule())
						attr = "__" + ad.getName();
					else
						attr = ad.getDefinedInDmsModule().getCompactSchemaName() + ".__" + ad.getName();
					out.write("        __" + cd.getName() + ".addMay(" + attr + ");\n");
				}
				
			}
			out.write("\n");
		}
			
		
		
		out.write("    }\n\n");
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    static {\n\n");
		
		System.err.println(DebugInfo.getWhereWeAreNow() + "     NOT DUMPING RULE STUFF!!!");

//		if (sd.getRuleDefinitionListSize() > 0){
//			out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//			out.write("        // These instantiations are merely meant to ensure that you've overloaded\n");
//			out.write("        // the base rule implementations\n");
//			for(RuleDefinition rd : sd.getRuleDefinitionList()){
//				out.write("        @SuppressWarnings(\"unused\")\n");
//				out.write("        " + rd.getName() + " " + rd.getName() + "Instance = new " + rd.getName() + "(new " + rd.getName() + "DataDMO());\n");
//			}
//		}
//		
//		DebugInfo.debug("\n\n\n*** NEW RULE INSTANCE FORMATTING ***\n\n\n");
//		TreeMap<RuleName,RuleIF> resolvedRules = sd.getResolvedRules();
//		
//		if ((resolvedRules != null) && (resolvedRules.size()>0) ){
//			out.write("\n");
//			PrintfFormat pf = new PrintfFormat("%-28s");
//			out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//			out.write("        try{\n");
//			
//			for(RuleIF rule: resolvedRules.values()){
//				RuleDataDMO rd = rule.getRuleDataDMO();
//				int dataPos 		= rd.getConstructionClassName().lastIndexOf("Data");
//				String ruleClass 	= rd.getConstructionClassName().substring(0, dataPos);
//				
//				out.write("            " + rd.getConstructionClassName() + "DMO _" + rd.getRuleName() + "Data = new " + rd.getConstructionClassName() + "DMO();\n");
//				
//				setAttributeValues(out, sm, rd, pf);
//
//				out.write("            __" + rd.getRuleName() + " = new " + ruleClass + "(_" + rd.getRuleName() + "Data);\n\n");
//				out.write("            _RmAp.add(__" + rd.getRuleName() + ");\n\n");
//			}
//			out.write("        } catch(DmcValueException ex){\n");
//			out.write("            throw(new IllegalStateException(ex));\n");
//			out.write("        }\n");
//		}
		
        // End of static initializer

		CompactSchemaHelper.writeCommonPart2(out, schemaName);
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * Generally, it's good to break your schemas down into functional areas, but, when schemas grow too large,
	 * they result in the creation of very large static initialization methods that can cause problems in
	 * some SDEs, for example, Eclipse. This method was added to split the initialization of the attribute map
	 * into a separate class.
	 * <p/>
	 * Although having separate static initialization functions is possible, the Java compiler gathers all 
	 * static initializations into a single method and when that method exceeds a size threshold, we run into problems.
	 * @param sd the schema definition
	 * @param dmodir the generation location
	 * @param attributes 
	 * @throws IOException
	 * @throws ResultException
	 */
	static private void dumpAttributeMapInitializer(DmsModule module, String dmodir) throws IOException {
		String schemaName = Manipulator.dotNameToCamelCase(module.getName().getNameString()) + "CompactSchema";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + "AMAP.java");
        
        out.write("package " + module.getSchemaPackage() + ".generated.dmo;\n\n");

    	ImportManager manager = new ImportManager();

    	manager.addImport("java.util.HashMap","For storage of schema info");
    	manager.addImport("org.dmd.core.schema.DmcAttributeInfo","To allow population of the attribute map");
    	
		out.write(manager.getFormattedImports());

		out.write("\n\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + "AMAP {\n\n");
        
        out.write("    static protected void initSmAp(HashMap<Integer, DmcAttributeInfo> _SmAp){\n");
        
        Iterator<AttributeDefinition> atit = module.getAllAttributeDefinition();
        while(atit.hasNext()){
        	AttributeDefinition ad = atit.next();
			out.write("        _SmAp.put(" + schemaName+ ".__" + ad.getName().getNameString() + ".id," + schemaName+ ".__" + ad.getName().getNameString() + ");\n");
		}

		out.write("    }\n\n");
		
		out.write("}\n\n");
		
        out.close();
	}
	
	/**
	 * Similar to the attribute map initializer, but for the class map.
	 * @param sd the schema definition
	 * @param dmodir the output directory
	 * @param classes the set of classes in the schema
	 * @throws IOException
	 * @throws ResultException
	 */
	static private void dumpClassMapInitializer(DmsModule module, String dmodir) throws IOException {
		String schemaName = Manipulator.dotNameToCamelCase(module.getName().getNameString()) + "CompactSchema";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + "CMAP.java");
        
        out.write("package " + module.getSchemaPackage() + ".generated.dmo;\n\n");

    	ImportManager manager = new ImportManager();

    	manager.addImport("java.util.HashMap","For storage of schema info");
    	manager.addImport("org.dmd.core.schema.DmcClassInfo","To support population of the class map");
    	
		out.write(manager.getFormattedImports());

		out.write("\n\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + "CMAP {\n\n");
        
        out.write("    static protected void initCmAp(HashMap<Integer, DmcClassInfo> _CmAp){\n");
        
        Iterator<ClassDefinition> cdit = module.getAllClassDefinition();
        while(cdit.hasNext()){
        	ClassDefinition cd = cdit.next();
			out.write("        _CmAp.put(" + schemaName+ ".__" + cd.getName().getNameString() + ".id," + schemaName+ ".__" + cd.getName().getNameString() + ");\n");
		}

		out.write("    }\n\n");
		
		out.write("}\n\n");
		
        out.close();
	}
	
	static private void setAttributeValues(BufferedWriter out, SchemaManager sm, RuleDataDMO rd, PrintfFormat pf) throws IllegalArgumentException, IOException {
//		String          	objName		= rd.getRuleName().getNameString() + "Data";
//		ClassDefinition		cd			= sm.getClassDefinition(rd.getConstructionClassName());
//		AttributeDefinition	attrDef		= null;
//				
//		Iterator<DmcAttribute<?>> attributes = rd.getAttributeIterator();
//		while(attributes.hasNext()){
//			DmcAttribute<?> attr = attributes.next();
//			attrDef = sm.isAttribute(attr.getID());
//			
//			// Skip the object class
//			if (attr.getAttributeInfo().id == MetaCompactSchema.__objectClass.id)
//				continue;
//			
//			DefinitionName adn = getDefinitionName(rd.getConstructionClassName(), attr.getName());
//			
//			if (cd.isAllowedAttribute(adn)){
//				String attrNameCapped = Manipulator.capFirstChar(attr.getName());
//				if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
//		            out.write("            _" + pf.sprintf(objName));
//					out.write(".set" + attrNameCapped + "(");
//					out.write("\"" + attr.getSV().toString() + "\");\n");
//				}
//				else{
//					Iterator<?> vals = attr.getMV();
//					while(vals.hasNext()){
//						Object val = vals.next();
//			            out.write("            _" + pf.sprintf(objName));
//						out.write(".add" + attrNameCapped + "(");
//						out.write("\"" + val.toString() + "\");\n");
//					}
//				}
//			}
//			else{
//				out.write(attrDef.getValueModificationStatement(uniqueNum,"            ","            _" + objName, attr));
//				uniqueNum++;
//			}
//		}
//				
//		
//		out.write("\n");
		
	}
	
	static private DefinitionName getDefinitionName(String cn, String dn) throws DMFeedbackSet  {
		DefinitionName rc = null;
		
//		try {
			rc = new DefinitionName(dn);
//		} catch (DmcValueException e) {
//			ResultException ex = new ResultException("This is not a legal attribute name: " + dn);
//			ex.moreMessages("DefinitionNames must begin with an alpha character and contain only leters and numbers.");
//			ex.moreMessages("This occurred while formatting the compact schema for class: " + cn);
//			throw(ex);
//		}
		
		return(rc);
	}

	
//    public void getAllMustAndMay(DMUncheckedObject uco, TreeSet<String> must, TreeSet<String> may, TreeMap<String,DMUncheckedObject> classDefs) throws ResultException{
//    	String derivedFrom = uco.getSV("derivedFrom");
//   
//    	if (derivedFrom != null){
//    		DMUncheckedObject base = classDefs.get(derivedFrom);
//    		getAllMustAndMay(base, must, may, classDefs);
//    	}
//    	
//    	NamedStringArray mustAttr = uco.get("must");
//    	if (mustAttr != null){
//    		for(String name: mustAttr){
//    			must.add(name);
//    		}
//    	}
//    	
//    	NamedStringArray mayAttr = uco.get("may");
//    	if (mayAttr != null){
//    		for(String name: mayAttr){
//    			may.add(name);
//    		}
//    	}
//    }
//    

	
	
	
	static private void dumpHeaderDMSAG(BufferedWriter out, DmsModule module, StringBuffer nameBuilders, StringBuffer filterBuilders) throws IOException {
        out.write("package " + module.getSchemaPackage() + ".generated.dmo;\n\n");

    	ImportManager manager = new ImportManager();

    	manager.addImport("java.util.HashMap","For storage of schema info");
    	manager.addImport("java.util.ArrayList","For storage of schema info");
    	manager.addImport("java.util.Iterator","For access of schema info");
    	manager.addImport("org.dmd.core.schema.*","Core schema");
    	manager.addImport("org.dmd.core.rules.RuleIF","For rule info");
    	manager.addImport("org.dmd.core.interfaces.DmcNameBuilderIF","To support name builders");
    	manager.addImport("org.dmd.core.interfaces.DmcFilterBuilderIF","To support filter builders");
        
        if (module.getClassDefinitionCount() > 0){
        	manager.addImport("org.dmd.dms.shared.generated.enums.ClassTypeEnum", "Have class definitions");
        	manager.addImport("org.dmd.dms.shared.generated.enums.DataTypeEnum", "Have class/attribute definitions");
        }
        
        if (module.getTypeDefinitionCount() > 0){
        	manager.addImport("org.dmd.dms.shared.generated.enums.OriginalTypeEnum", "Have type/internal type definitions");
        }
            	 	
        Iterator<ClassDefinition> cdit = module.getAllClassDefinition();
        while(cdit.hasNext()){
        	ClassDefinition cd = cdit.next();
    		for(AttributeDefinition ad: cd.getMust()){
    			if (ad.getDefinedInDmsModule() != module)
    				manager.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Required attribute from " + ad.getDefinedInDmsModule().getCompactSchemaName());
    		}
    		for(AttributeDefinition ad: cd.getMay()){
    			if (ad.getDefinedInDmsModule() != module)
    				manager.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Optional attribute from " + ad.getDefinedInDmsModule().getCompactSchemaName());
    		}
    		if (cd.getDerivedFrom() != null){
    			if (cd.getDerivedFrom().getDefinedInDmsModule() != module)
       				manager.addImport(cd.getDerivedFrom().getDefinedInDmsModule().getCompactSchemaImport(), "Base class from " + cd.getDerivedFrom().getDefinedInDmsModule().getCompactSchemaName());    				
    		}
    	}
    	
//        DmcAttribute<?> adef = module.getDMO().get(MetaCompactSchema.__attributeDefList);
//        if (adef != null){
        if (module.getAttributeDefinitionCount() > 0){
        	manager.addImport("org.dmd.dms.shared.generated.enums.DataTypeEnum", "Have class/attribute definitions");
        	manager.addImport("org.dmd.dms.shared.generated.enums.ValueTypeEnum", "Have attribute definitions");
        }

        ///////////////////////////////////////////////////////////////////////
        // Rule definitions
        Iterator<RuleDefinition> ruleit = module.getAllRuleDefinition();
        while(ruleit.hasNext()){
        	RuleDefinition rd = ruleit.next();
			manager.addImport(rd.getRuleDefinitionImport(), "To support instantiations of " + rd.getName());
		}

		///////////////////////////////////////////////////////////////////////
		// Rule instances
        
		System.err.println(DebugInfo.getWhereWeAreNow() + "     NOT DUMPING RULE STUFF!!!");
        
//		Iterator<DMUncheckedObject> rules = module.getParsedRules();
//		if (rules != null){
//			while(rules.hasNext()){
//				DMUncheckedObject rule = rules.next();
//				ClassDefinition ruleDataCD = sm.isClass(rule.getConstructionClass());
//				
//				if (ruleDataCD == null){
//					ResultException ex = new ResultException();
//					ex.addError("Unknown rule data class. For Rule instance: \n" + rule.toOIF());
//					throw(ex);
//				}
//				manager.addImport(ruleDataCD.getDmoImport(), "To instantiate " + rule.getConstructionClass() + " rule data");
//				manager.addImport(ruleDataCD.getRuleDefinition().getRuleDefinitionImport(), "To instantiate rules of this type");
//				
//				ruleDataCD.addImportsForAdditionalAttributes(sm,manager, rule);
//			}
//		}
		
        out.write(manager.getFormattedImports());
    	out.write("\n");
        
        Iterator<TypeDefinition> typeit = module.getAllTypeDefinition();
        while(typeit.hasNext()){
        	TypeDefinition td = typeit.next();
			if (td.getIsNameType()){
				if (td.getNameAttributeDef() == null)
					throw(new IllegalStateException("TypeDefinition " + td.getName() + "  does not have a designated naming attribute."));
				
				String adn = td.getName().getNameString();
				nameBuilders.append("        _NmAp.put(DmcType" + adn + "STATIC.instance.getNameClass(),DmcType" + adn + "STATIC.instance);\n");
			}
			else if (td.getIsFilterType()){
				if (td.getFilterAttributeDef() == null)
					throw(new IllegalStateException("TypeDefinition " + td.getName() + "  does not have a designated filter attribute."));
				
				String adn = td.getName().getNameString();
				nameBuilders.append("        _FmAp.put(DmcType" + adn + "STATIC.instance.getFilterClass(),DmcType" + adn + "STATIC.instance);\n");
			}
		}
		
		if (nameBuilders.length() > 0)
	        out.write("import " + module.getSchemaPackage() + ".generated.types.*;\n");
		
        out.write("\n");
        
	}
	

    static private TreeMap<String,ClassNode> getHierarchy(Iterator<ClassDefinition> classes){
    	TreeMap<String,ClassNode> sorted = new TreeMap<String, ClassNode>();
    	TreeMap<String,ClassNode> hierarchy = new TreeMap<String, ClassNode>();
    	
    	while(classes.hasNext()){
    		ClassDefinition cd = classes.next();
    		String name = cd.getName().getNameString();
    		sorted.put(name, new ClassNode(name,cd));
    	}
    	
    	for(ClassNode cn: sorted.values()){
    		ClassDefinition cd = cn.cd;
    		ClassDefinition derivedFrom = cd.getDerivedFrom();
    		
    		if (derivedFrom == null)
    			hierarchy.put(cn.name, cn);
    		else{
    			ClassNode parent = sorted.get(derivedFrom.getName().getNameString());
    			if (parent == null){
    				// The parent is defined in another schema
    				String temp = cd.getDerivedFrom().getDefinedInDmsModule().getName().getNameString();
    				String name = Manipulator.dotNameToCamelCase(temp) + "DMSAG";
    				cn.parentRef = name + ".__" + cd.getDerivedFrom().getName();
    				hierarchy.put(cn.name,cn);
    			}
    			else
        			parent.addDerived(cn);
    				
    		}	
    	}
    	
    	return(hierarchy);
    }

//    class ClassNode {
//    	String 						name;
//    	ClassDefinition				cd;
//    	DMUncheckedObject			uco;
//    	TreeMap<String,ClassNode>	derived;
//    	String						parentRef;
//    	
//    	ClassNode(String n, ClassDefinition def){
//    		name 	= n;
//    		cd		= def;
//    		derived	= new TreeMap<String, ClassNode>();
//    	}
//    	
//    	ClassNode(String n, DMUncheckedObject def){
//    		name	= n;
//    		uco		= def;
//    		derived = new TreeMap<String, ClassNode>();
//    	}
//    	
//    	void addDerived(ClassNode cn){
//    		derived.put(cn.name, cn);
//    	}
//    	
//    	/**
//    	 * Recursively writes the class information for this class and all of its derived classes.
//    	 * @param out
//    	 * @throws IOException
//    	 * @throws ResultException
//    	 */
//    	void writeClassInfo(BufferedWriter out) throws IOException {
//    		if (cd == null){
//    			String ID = uco.getSV("dmdID");
//    			String ct = uco.getSV("classType");
//    			String derivedFrom = uco.getSV("derivedFrom");
//    			String isNamedBy = uco.getSV("isNamedBy");
//    			String dmoImport = uco.getSV("dmoImport");
//    			
//    	    	out.write("    public final static DmcClassInfo __" + name + " = new DmcClassInfo(");
//    	    	out.write("\"" + name + "\",");
//    	    	out.write("\"" + dmoImport + "\",");
//    	    	out.write(ID + ",");
//    	   		out.write("ClassTypeEnum." + ct + ",");
//    	   		out.write("DataTypeEnum.PERSISTENT");
//    	   		if (derivedFrom == null)
//    	   			out.write(",null");
//    	   		else
//    	   			out.write(",__" + derivedFrom);
//    	   		
//    	   		if (isNamedBy == null)
//    	   			out.write(",null");
//    	   		else{
//    	   			out.write(",MetaDMSAG.__" + isNamedBy);
//    	   		}
//
//    	    	out.write(");\n");		
//    		}
//    		else{
//    			out.write("    public final static DmcClassInfo __" + cd.getName().getNameString() + " = new DmcClassInfo(");
//    			out.write("\"" + cd.getName().getNameString() + "\"");
//    			out.write(",\"" + cd.getDmoImport() + "\"");
//    			out.write(", " + cd.getDmdID());
//    			out.write(", ClassTypeEnum." + cd.getClassType());
//    			out.write(", DataTypeEnum." + cd.getDataType());
//    			if (cd.getDerivedFrom() == null)
//    	   			out.write(",null");
//    	   		else{
//    	   			if (parentRef == null)
//    	   				out.write(",__" + cd.getDerivedFrom().getName());
//    	   			else
//    	   				out.write("," + parentRef);
//    	   		}
//    	   		if (cd.getIsNamedBy() == null)
//    	   			out.write(",null");
//    	   		else{
//    	   			AttributeDefinition ad = cd.getIsNamedBy();
//    	   			String schema = ad.getDefinedInDmsModule().getCompactSchemaName();
//    	   			out.write("," + schema + ".__" + ad.getName());
//    	   		}
//    			out.write(");\n");
//    		}
//    		
//    		for(ClassNode cn: derived.values()){
//    			cn.writeClassInfo(out);
//    		}
//		}
//    }
			
    
    
	
    
	


}
