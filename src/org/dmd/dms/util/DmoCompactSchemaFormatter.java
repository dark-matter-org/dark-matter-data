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
package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

/**
 * The DmoCompactSchemaFormatter is used to generate a compact form of the Dark Matter Schema
 * for use in restricted Java environments, such as GWT.
 */
public class DmoCompactSchemaFormatter {

	PrintStream	progress;
	
	// This value is incremented as we format non-native attributes on extensible classes
	// so that their temporary container attribute instances have unique names.
	int	uniqueNum;
	
	public DmoCompactSchemaFormatter(PrintStream p){
		progress = p;
		uniqueNum = 1;
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 */
	public void dumpSchema(SchemaManager sm, SchemaDefinition sd, String dmodir) throws IOException, ResultException {
		String schemaName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString()) + "DMSAG";
		
		TreeMap<String,ClassDefinition> classes = new TreeMap<String, ClassDefinition>();
		
		TreeMap<String,AttributeDefinition> attributes = new TreeMap<String, AttributeDefinition>();
		
		TreeMap<String,TypeDefinition> types = new TreeMap<String, TypeDefinition>();
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        StringBuffer nameBuilders = new StringBuffer();
        
        StringBuffer filterBuilders = new StringBuffer();
        
        dumpHeaderDMSAG(out, sm, sd.getSchemaPackage(), sd, nameBuilders, filterBuilders);
        
        Iterator<ClassDefinition> cds = sd.getClassDefList();
		if (cds != null){
			while(cds.hasNext()){
				ClassDefinition cd = cds.next();
				classes.put(cd.getName().getNameString(), cd);
			}
		}
			
        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
		if (ads != null){
			while(ads.hasNext()){
				AttributeDefinition ad = ads.next();
				attributes.put(ad.getName().getNameString(), ad);
			}
		}
			
        Iterator<TypeDefinition> tds = sd.getTypeDefList();
		if (tds != null){
			while(tds.hasNext()){
				TypeDefinition td = tds.next();
				types.put(td.getName().getNameString(), td);
			}
		}
		
		tds = sd.getInternalTypeDefList();
		if (tds != null){
			while(tds.hasNext()){
				TypeDefinition td = tds.next();
				types.put(td.getName().getNameString(), td);
			}
		}
		
			
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcCompactSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sd.getName().getNameString() + "\";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaBaseID = " + sd.getSchemaBaseID() + ";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaIDRange = " + sd.getSchemaIDRange() + ";\n");
        out.write("\n");

        int max = sd.getSchemaBaseID() + sd.getSchemaIDRange();
        
        out.write("\n");
        out.write("    static int schemaMaxID = " + max + ";\n");
        out.write("\n");

        for(AttributeDefinition ad: attributes.values()){
			//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
			out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
			out.write("\"" + ad.getDefinedIn().getName() + "\"");
			out.write(", \"" + ad.getName().getNameString() + "\"");
			out.write(", " + ad.getDmdID());
			out.write(", \"" + ad.getType().getName().getNameString() + "\"");
			out.write(", ValueTypeEnum." + ad.getValueType());
			out.write(", DataTypeEnum." + ad.getDataType());
			
			if (ad.getIndexSize() == null)
				out.write(");\n");
			else
				out.write(", " + ad.getIndexSize() + ");\n");
		}
        
        if (types.size() > 0){
            out.write("\n");
    		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		for(TypeDefinition td: types.values()){
	        	
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
        
        if (classes.size() > 0){
            out.write("\n");
    		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        TreeMap<String,ClassNode> hierarchy = getHierarchy(classes.values().iterator());
	        for(ClassNode cn: hierarchy.values()){
	        	cn.writeClassInfo(out);
			}
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        if (sd.getSliceDefListSize() > 0){
	        out.write("\n");
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(SliceDefinition slice: sd.getSliceDefList()){
				out.write("    public final static DmcSliceInfo __" + slice.getName() + " = new DmcSliceInfo(\"" + slice.getName() + "\");\n");
	        	for(AttributeDefinition ad: slice.getSelectAttribute()){
					out.write("    // " + ad.getName() + "\n");
	        	}
	        	out.write("\n");
				
	        }
        }
        
//        DmoObjectFactoryNew	factory = new DmoObjectFactoryNew(sm);
        
        ///////////////////////////////////////////////////////////////////////
        Iterator<DmcUncheckedObject>	rules = sd.getParsedRules();
        
        if (rules != null){
        	out.write("\n");
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        	while(rules.hasNext()){
				DmcUncheckedObject ruleData = rules.next();
				
//				try {
//					RuleDataDMO rdd = (RuleDataDMO) factory.createObject(ruleData);
//					DebugInfo.debugWithTrace(rdd.toOIF());
//				} catch (DmcValueException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				String dataName 	= ruleData.getConstructionClass();
				int dataPos 		= dataName.indexOf("Data");
				String ruleClass 	= dataName.substring(0, dataPos);
				String ruleName		= ruleData.getSV("ruleName");
				
				out.write("    public final static " + ruleClass + " __" + ruleName + ";\n");
        	}
        }
        
        ///////////////////////////////////////////////////////////////////////
        // Static initializer

        writeCommonPart1(out);
        
        // Inside the static initializer
        
        for(AttributeDefinition ad: attributes.values()){
            // _SmAp.put(__jobName.name,__jobName);
			out.write("        _SmAp.put(__" + ad.getName().getNameString() + ".id,__" + ad.getName().getNameString() + ");\n");
		}
        
        for(ClassDefinition cd: classes.values()){
            // _SmAp.put(__jobName.name,__jobName);
			out.write("        _CmAp.put(__" + cd.getName().getNameString() + ".id,__" + cd.getName().getNameString() + ");\n");
		}
        
        out.write(nameBuilders.toString());
        
        for(SliceDefinition slice: sd.getSliceDefList()){
	        out.write("\n");
            // _SmAp.put(__jobName.name,__jobName);
        	for(AttributeDefinition ad: slice.getSelectAttribute()){
				out.write("        __" + slice.getName().getNameString() + ".addAttributeID(" + ad.getDmdID() + ");\n");
        	}
        	
			out.write("        _SImAp.put(\"" + slice.getName() + "\",__" + slice.getName().getNameString() + ");\n");
		}
        
        cds = sd.getClassDefList();
		if (cds != null){
			while(cds.hasNext()){
				out.write("\n");
				ClassDefinition cd = cds.next();
				
				String attr = null;
				for (AttributeDefinition ad: cd.getMust()){
					if (ad.getDefinedIn() == cd.getDefinedIn())
						attr = "__" + ad.getName();
					else
						attr = ad.getDefinedIn().getDMSASGName() + ".__" + ad.getName();
					out.write("        __" + cd.getName() + ".addMust(" + attr + ");\n");
				}
				
				for (AttributeDefinition ad: cd.getMay()){
					if (ad.getDefinedIn() == cd.getDefinedIn())
						attr = "__" + ad.getName();
					else
						attr = ad.getDefinedIn().getDMSASGName() + ".__" + ad.getName();
					out.write("        __" + cd.getName() + ".addMay(" + attr + ");\n");
				}
				
			}
			out.write("\n");
			
		}
		
		if (sd.getRuleDefinitionListSize() > 0){
			out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("        // These instantiations are merely meant to ensure that you've overloaded\n");
			out.write("        // the base rule implementations\n");
			for(RuleDefinition rd : sd.getRuleDefinitionList()){
				out.write("        @SuppressWarnings(\"unused\")\n");
				out.write("        " + rd.getName() + " " + rd.getName() + "Instance = new " + rd.getName() + "(new " + rd.getName() + "DataDMO());\n");
			}
		}
		
		rules = sd.getParsedRules();
		if (rules != null){
			out.write("\n");
			PrintfFormat pf = new PrintfFormat("%-28s");
			out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("        try{\n");
			
			while(rules.hasNext()){
				DmcUncheckedObject ruleData = rules.next();

				String dataName 	= ruleData.getConstructionClass();
				int dataPos 		= dataName.indexOf("Data");
				String ruleClass 	= dataName.substring(0, dataPos);
				String ruleName		= ruleData.getSV("ruleName");
				
				out.write("            " + dataName + "DMO _" + ruleName + "Data = new " + dataName + "DMO();\n");
				
				setAttributeValues(out, sm, ruleData, pf);

				out.write("            __" + ruleName + " = new " + ruleClass + "(_" + ruleName + "Data);\n\n");
				out.write("            _RmAp.add(__" + ruleName + ");\n\n");
			}
			out.write("        } catch(DmcValueException ex){\n");
			out.write("            throw(new IllegalStateException(ex));\n");
			out.write("        }\n");
		}
		

		
//		for(RuleData rd : sd.getR)
        
        // End of static initializer

        writeCommonPart2(out, schemaName);
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory. THIS METHOD IS FOR THE METAGENERATOR.
	 * @param sn  The schema name.
	 * @param schemaPackage The schema package prefix.
	 * @param classes the class definitions.
	 * @param attributes the attribute definitions.
	 * @param types the type definitions.
	 * @param dmodir The output directory.
	 * @param baseID the base ID for the schema
	 * @param idRange the range of IDs permissible
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 * @throws ResultException 
	 */
	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DmcUncheckedObject> classes, TreeMap<String,DmcUncheckedObject> attributes, TreeMap<String,DmcUncheckedObject> types, ArrayList<DmcUncheckedObject> rules, String dmodir, int baseID, int idRange) throws IOException, ResultException{
		String schemaName = GeneratorUtils.dotNameToCamelCase(sn) + "DMSAG";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        dumpHeaderMETA(out,schemaPackage);
        
        StringBuilder nameBuilders = new StringBuilder();
        if (types != null){
	        for(DmcUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isNameType = td.getSV("isNameType");
	        	
	        	if (isNameType != null){
	        		String nameAttributeDef = td.getSV("nameAttributeDef");
	        		
	        		if (nameAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated naming attribute."));
	        		
					nameBuilders.append("        _NmAp.put(DmcType" + tname + "STATIC.instance.getNameClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        StringBuilder filterBuilders = new StringBuilder();
        if (types != null){
	        for(DmcUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isFilterType = td.getSV("isFilterType");
	        	
	        	if (isFilterType != null){
	        		String filterAttributeDef = td.getSV("filterAttributeDef");
	        		
	        		if (filterAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated filter attribute."));
	        		
					filterBuilders.append("        _FmAp.put(DmcType" + tname + "STATIC.instance.getFilterClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcCompactSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sn + "\";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaBaseID = " + baseID + ";\n");
        out.write("\n");

        out.write("\n");
        out.write("    static int schemaIDRange = " + idRange + ";\n");
        out.write("\n");

        int max = baseID + idRange;
        
        out.write("\n");
        out.write("    static int schemaMaxID = " + max + ";\n");
        out.write("\n");

        if (attributes != null){
    		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
            	String t 	= ad.getSV("type");
            	String ID 	= ad.getSV("dmdID");
            	String mv 	= ad.getSV("valueType");
        		
            	writeAttributeInfoMETA(out, n, ID, t, mv, "false");
			}
		}
        
        if (types != null){
            out.write("\n");
    		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
            for(DmcUncheckedObject uco: types.values()){
	        	String name					= uco.getSV("name");
	        	String isRefType			= uco.getSV("isRefType");
	        	String isExtendedRefType	= uco.getSV("isExtendedRefType");
	        	String isEnumType			= uco.getSV("isEnumType");
	        	String isNameType			= uco.getSV("isNameType");
	        	String internallyGenerated	= uco.getSV("internallyGenerated");
	        	String originalClass		= uco.getSV("originalClass");
	        	
	        	if (internallyGenerated == null){
	        		// This is a straightforward type definition
	        		
	        		if (isNameType == null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.TYPE);\n");
	        		else
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.NAMETYPE);\n");

	        	}
	        	else{
	        		if (isEnumType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.ENUM);\n");
	        		else if (isRefType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + originalClass + " = new DmcTypeInfo(\"" + originalClass + "\", OriginalTypeEnum.REFERENCE);\n");
	        		else if (isExtendedRefType != null)
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.EXTREF);\n");
	        		else 
	        			out.write("    public final static DmcTypeInfo __type_" + name + " = new DmcTypeInfo(\"" + name + "\", OriginalTypeEnum.COMPLEXTYPE);\n");
	        	}
//        		System.out.println(uco.toOIF() + "\n");
        	}
        }
        
		if (classes != null){
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			TreeMap<String,ClassNode> hierarchy = getHierarchyMETA(classes.values().iterator());
			out.write("\n");
	        for(ClassNode cn: hierarchy.values()){
            	cn.writeClassInfo(out);
			}
		}
		
		if (rules != null){
			out.write("\n");
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			for(DmcUncheckedObject ruleData: rules){
				String dataName 	= ruleData.getConstructionClass();
				int dataPos 		= dataName.indexOf("Data");
				String ruleClass 	= dataName.substring(0, dataPos);
				String ruleName		= ruleData.getSV("ruleName");
				
				out.write("    public final static " + ruleClass + " " + ruleName + ";\n");
			}
		}

        
        writeCommonPart1(out);
        
        // Inside the static initializer
        
		if (attributes != null){
	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + n + ".id,__" + n + ");\n");
			}
		}
        
		if (classes != null){
	        for(DmcUncheckedObject cd: classes.values()){
	        	String n	= cd.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _CmAp.put(__" + n + ".id,__" + n + ");\n");
			}
	        
	        for(DmcUncheckedObject cd: classes.values()){
	        	out.write("\n");
	        	String cn	= cd.getSV("name");
	            TreeSet<String> 		must 	= new TreeSet<String>();
	            TreeSet<String> 		may		= new TreeSet<String>();

	            getAllMustAndMay(cd, must, may, classes);
	            
	            for(String an: must){
        			out.write("        __" + cn + ".addMust(__" + an + ");\n");
	            }
	            
	            for(String an: may){
        			out.write("        __" + cn + ".addMay(__" + an + ");\n");
	            }
			}
		}
		
		if ((rules != null) && (rules.size() > 0)){
			out.write("\n");
			PrintfFormat pf = new PrintfFormat("%-28s");
			out.write("        try{\n");
			
			for(DmcUncheckedObject ruleData: rules){
				
				
				// ONLY DUMP DMO COMPATIBLE RULES!!!!!!!!!!!!!!!!!!!!!!!!
				
				
				String dataName 	= ruleData.getConstructionClass();
				int dataPos 		= dataName.indexOf("Data");
				String ruleClass 	= dataName.substring(0, dataPos);
				String ruleName		= ruleData.getSV("ruleName");
				
				out.write("            " + dataName + "DMO _" + ruleName + "Data = new " + dataName + "DMO();\n");
				
				setAttributeValuesMETA(out, ruleData, pf, types, attributes);

				out.write("            " + ruleClass + " " + ruleName + " = new " + ruleClass + "(_" + ruleName + "Data);\n\n");
			}
			out.write("        } catch(DmcValueException ex){\n");
			out.write("            throw(new IllegalStateException(ex));\n");
			out.write("        }\n");
		}
		
		out.write("\n");        
        out.write(nameBuilders.toString());
        
        out.write(filterBuilders.toString());
        
        // End of static initializer
        
        writeCommonPart2(out, schemaName);
	        
		
		out.write("}\n\n");
		
		out.close();
	}
	
    public void getAllMustAndMay(DmcUncheckedObject uco, TreeSet<String> must, TreeSet<String> may, TreeMap<String,DmcUncheckedObject> classDefs) throws ResultException{
    	String derivedFrom = uco.getSV("derivedFrom");
   
    	if (derivedFrom != null){
    		DmcUncheckedObject base = classDefs.get(derivedFrom);
    		getAllMustAndMay(base, must, may, classDefs);
    	}
    	
    	NamedStringArray mustAttr = uco.get("must");
    	if (mustAttr != null){
    		for(String name: mustAttr){
    			must.add(name);
    		}
    	}
    	
    	NamedStringArray mayAttr = uco.get("may");
    	if (mayAttr != null){
    		for(String name: mayAttr){
    			may.add(name);
    		}
    	}
    }
    

	
	void writeCommonPart1(BufferedWriter out) throws IOException{
        out.write("\n");
        out.write("    static  HashMap<Integer, DmcClassInfo> _CmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<Integer, DmcAttributeInfo> _SmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcNameBuilderIF> _NmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcFilterBuilderIF> _FmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcSliceInfo> _SImAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcTypeInfo> _TImAp;\n");
        out.write("\n");
        
        out.write("    static  ArrayList<RuleIF>             _RmAp;\n");
        out.write("\n");
        
        out.write("    static {\n");
        out.write("        _CmAp = new HashMap<Integer, DmcClassInfo>();\n");
        
        out.write("\n");
        out.write("        _SmAp = new HashMap<Integer, DmcAttributeInfo>();\n");
        
        out.write("\n");
        out.write("        _NmAp = new HashMap<String, DmcNameBuilderIF>();\n");
        
        out.write("\n");
        out.write("        _FmAp = new HashMap<String, DmcFilterBuilderIF>();\n");
        
        out.write("\n");
        out.write("        _SImAp = new HashMap<String, DmcSliceInfo>();\n");
        
        out.write("\n");
        out.write("        _TImAp = new HashMap<String, DmcTypeInfo>();\n");
        
        out.write("\n");
        out.write("        _RmAp = new ArrayList<RuleIF>();\n");
        
        out.write("\n");
        
	}
	
	void writeCommonPart2(BufferedWriter out, String schemaName) throws IOException{
        out.write("\n");
        out.write("    }\n");

        out.write("\n");
        out.write("    static  " + schemaName + " instance;\n");
        

        out.write("\n");
        out.write("    protected " + schemaName + " (){\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    public synchronized static " + schemaName + " instance(){\n");
        out.write("        if (instance == null)\n");
        out.write("            instance = new " + schemaName + "();\n");
        out.write("        \n");
        out.write("        return(instance);\n");
        out.write("    }\n");
        out.write("\n");

        out.write("\n");
        out.write("    public DmcClassInfo getClassInfo(Integer id){\n");
        out.write("        return(_CmAp.get(id));\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public DmcAttributeInfo getAttributeInfo(Integer id){\n");
        out.write("        return(_SmAp.get(id));\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcAttributeInfo> getAttributeInfo(){\n");
        out.write("        return(_SmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcClassInfo> getClassInfo(){\n");
        out.write("        return(_CmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcNameBuilderIF> getNameBuilders(){\n");
        out.write("        return(_NmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){\n");
        out.write("        return(_FmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcSliceInfo> getSliceInfo(){\n");
        out.write("        return(_SImAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcTypeInfo> getTypeInfo(){\n");
        out.write("        return(_TImAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public String getSchemaName(){\n");
        out.write("        return(schemaName);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaBaseID(){\n");
        out.write("        return(schemaBaseID);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaIDRange(){\n");
        out.write("        return(schemaIDRange);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaMaxID(){\n");
        out.write("        return(schemaMaxID);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<RuleIF> getRules(){\n");
        out.write("        return(_RmAp.iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
		
	}
	
	void dumpHeaderMETA(BufferedWriter out, String schemaPackage) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

        out.write("import java.util.HashMap;\n");
        out.write("import java.util.ArrayList;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.enums.ClassTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.OriginalTypeEnum;\n");
        out.write("import org.dmd.dms.generated.types.*;\n");
//        out.write("import org.dmd.dms.extended.rules.*;\n");
        out.write("import org.dmd.dmc.rules.RuleIF;\n");
        out.write("\n");
        
	}
	
	void dumpHeaderDMSAG(BufferedWriter out, SchemaManager sm, String schemaPackage, SchemaDefinition sd, StringBuffer nameBuilders, StringBuffer filterBuilders) throws IOException, ResultException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

    	ImportManager manager = new ImportManager();

    	manager.addImport("java.util.HashMap","For storage of schema info");
    	manager.addImport("java.util.ArrayList","For storage of schema info");
    	manager.addImport("java.util.Iterator","For access of schema info");
    	manager.addImport("org.dmd.dmc.*","Basic DMC stuff");
    	manager.addImport("org.dmd.dmc.rules.RuleIF","For rule info");
        
        DmcAttribute<?> cdef = sd.getDMO().get(MetaDMSAG.__classDefList);
        if (cdef != null){
        	manager.addImport("org.dmd.dms.generated.enums.ClassTypeEnum", "Have class definitions");
        	manager.addImport("org.dmd.dms.generated.enums.DataTypeEnum", "Have class/attribute definitions");
//        	out.write("import org.dmd.dms.generated.enums.ClassTypeEnum;\n");
        }
        
        if ( (sd.getTypeDefListSize() > 0) || (sd.getInternalTypeDefListSize() > 0)){
        	manager.addImport("org.dmd.dms.generated.enums.OriginalTypeEnum", "Have type/internal type definitions");
        }
            	 	
    	for(ClassDefinition cd: sd.getClassDefList()){
    		for(AttributeDefinition ad: cd.getMust()){
    			if (ad.getDefinedIn() != sd)
    				manager.addImport(ad.getDefinedIn().getDMSASGImport(), "Required attribute from " + ad.getDefinedIn().getDMSASGName());
    		}
    		for(AttributeDefinition ad: cd.getMay()){
    			if (ad.getDefinedIn() != sd)
    				manager.addImport(ad.getDefinedIn().getDMSASGImport(), "Optional attribute from " + ad.getDefinedIn().getDMSASGName());
    		}
    		if (cd.getDerivedFrom() != null){
    			if (cd.getDerivedFrom().getDefinedIn() != sd)
       				manager.addImport(cd.getDerivedFrom().getDefinedIn().getDMSASGImport(), "Base class from " + cd.getDerivedFrom().getDefinedIn().getDMSASGName());    				
    		}
    	}
    	
        DmcAttribute<?> adef = sd.getDMO().get(MetaDMSAG.__attributeDefList);
        if (adef != null){
        	manager.addImport("org.dmd.dms.generated.enums.DataTypeEnum", "Have class/attribute definitions");
        	manager.addImport("org.dmd.dms.generated.enums.ValueTypeEnum", "Have attribute definitions");
//        	out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
//        	out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
        }

        ///////////////////////////////////////////////////////////////////////
        // Rule definitions
        
		for(RuleDefinition rd: sd.getRuleDefinitionList()){
			manager.addImport(rd.getRuleDefinitionImport(), "To support instantiations of " + rd.getName());
		}

		///////////////////////////////////////////////////////////////////////
		// Rule instances
		Iterator<DmcUncheckedObject> rules = sd.getParsedRules();
		if (rules != null){
			while(rules.hasNext()){
				DmcUncheckedObject rule = rules.next();
				ClassDefinition ruleDataCD = sm.isClass(rule.getConstructionClass());
				
				if (ruleDataCD == null){
					ResultException ex = new ResultException();
					ex.addError("Unknown rule data class. For Rule instance: \n" + rule.toOIF());
					throw(ex);
				}
				manager.addImport(ruleDataCD.getDmoImport(), "To instantiate " + rule.getConstructionClass() + " rule data");
				manager.addImport(ruleDataCD.getRuleDefinition().getRuleDefinitionImport(), "To instantiate rules of this type");
				
				ruleDataCD.addImportsForAdditionalAttributes(sm,manager, rule);
			}
		}
		
        out.write(manager.getFormattedImports());
    	out.write("\n");
        
        
        Iterator<TypeDefinition> tds = sd.getTypeDefList();
		if (tds != null){
			while(tds.hasNext()){
				TypeDefinition td = tds.next();
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
		}
		
		if (nameBuilders.length() > 0)
	        out.write("import " + schemaPackage + ".generated.types.*;\n");
		
        out.write("\n");
        
	}
	
	/**
	 * 
	 * @param out
	 * @param n   attribute name
	 * @param ID  ID
	 * @param t   type name
	 * @param mv  valueType
	 * @param opt optional
	 * @throws IOException
	 */
    void writeAttributeInfoMETA(BufferedWriter out, String n, String ID, String t, String mv, String opt) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"meta\",");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
    	
    	if (mv == null)
    		out.write("ValueTypeEnum.SINGLE,");
    	else
    		out.write("ValueTypeEnum.MULTI,");
    	
   		out.write("DataTypeEnum.PERSISTENT");
    	
    	out.write(");\n");

    }

//	/**
//	 * 
//	 * @param out
//	 * @param n   class name
//	 * @param ID  ID
//	 * @param ct  class type
//	 * @throws IOException
//	 */
//    void writeClassInfoMETA(BufferedWriter out, String n, String ID, String ct) throws IOException {
//    	out.write("    public final static DmcClassInfo __" + n + " = new DmcClassInfo(");
//    	out.write("\"" + n + "\",");
//    	out.write(ID + ",");
//   		out.write("ClassTypeEnum." + ct + ",");
//   		out.write("DataTypeEnum.PERSISTENT");
//    	out.write(");\n");
//
//    }
    
    TreeMap<String,ClassNode> getHierarchyMETA(Iterator<DmcUncheckedObject> classes) throws ResultException{
    	TreeMap<String,ClassNode> sorted = new TreeMap<String, ClassNode>();
    	TreeMap<String,ClassNode> hierarchy = new TreeMap<String, ClassNode>();
    	
    	while(classes.hasNext()){
    		DmcUncheckedObject uco = classes.next();
    		String name = uco.getSV("name");
    		sorted.put(name, new ClassNode(name,uco));
    	}
    	
    	for(ClassNode cn: sorted.values()){
    		String derivedFrom = cn.uco.getSV("derivedFrom");
    		
    		if (derivedFrom == null)
    			hierarchy.put(cn.name, cn);
    		else{
    			ClassNode parent = sorted.get(derivedFrom);
    			parent.addDerived(cn);
    		}	
    	}
    	
    	return(hierarchy);
    }

    TreeMap<String,ClassNode> getHierarchy(Iterator<ClassDefinition> classes){
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
    				String temp = cd.getDerivedFrom().getDefinedIn().getName().getNameString();
    				String name = GeneratorUtils.dotNameToCamelCase(temp) + "DMSAG";
    				cn.parentRef = name + ".__" + cd.getDerivedFrom().getName();
    				hierarchy.put(cn.name,cn);
    			}
    			else
        			parent.addDerived(cn);
    				
    		}	
    	}
    	
    	return(hierarchy);
    }

    class ClassNode {
    	String 						name;
    	ClassDefinition				cd;
    	DmcUncheckedObject			uco;
    	TreeMap<String,ClassNode>	derived;
    	String						parentRef;
    	
    	ClassNode(String n, ClassDefinition def){
    		name 	= n;
    		cd		= def;
    		derived	= new TreeMap<String, ClassNode>();
    	}
    	
    	ClassNode(String n, DmcUncheckedObject def){
    		name	= n;
    		uco		= def;
    		derived = new TreeMap<String, ClassNode>();
    	}
    	
    	void addDerived(ClassNode cn){
    		derived.put(cn.name, cn);
    	}
    	
    	/**
    	 * Recursively writes the class information for this class and all of its derived classes.
    	 * @param out
    	 * @throws IOException
    	 * @throws ResultException
    	 */
    	void writeClassInfo(BufferedWriter out) throws IOException {
    		if (cd == null){
    			String ID = uco.getSV("dmdID");
    			String ct = uco.getSV("classType");
    			String derivedFrom = uco.getSV("derivedFrom");
    			String isNamedBy = uco.getSV("isNamedBy");
    			String dmoImport = uco.getSV("dmoImport");
    			
    	    	out.write("    public final static DmcClassInfo __" + name + " = new DmcClassInfo(");
    	    	out.write("\"" + name + "\",");
    	    	out.write("\"" + dmoImport + "\",");
    	    	out.write(ID + ",");
    	   		out.write("ClassTypeEnum." + ct + ",");
    	   		out.write("DataTypeEnum.PERSISTENT");
    	   		if (derivedFrom == null)
    	   			out.write(",null");
    	   		else
    	   			out.write(",__" + derivedFrom);
    	   		
    	   		if (isNamedBy == null)
    	   			out.write(",null");
    	   		else{
    	   			out.write(",MetaDMSAG.__" + isNamedBy);
    	   		}

    	    	out.write(");\n");		
    		}
    		else{
    			out.write("    public final static DmcClassInfo __" + cd.getName().getNameString() + " = new DmcClassInfo(");
    			out.write("\"" + cd.getName().getNameString() + "\"");
    			out.write(",\"" + cd.getDmoImport() + "\"");
    			out.write(", " + cd.getDmdID());
    			out.write(", ClassTypeEnum." + cd.getClassType());
    			out.write(", DataTypeEnum." + cd.getDataType());
    			if (cd.getDerivedFrom() == null)
    	   			out.write(",null");
    	   		else{
    	   			if (parentRef == null)
    	   				out.write(",__" + cd.getDerivedFrom().getName());
    	   			else
    	   				out.write("," + parentRef);
    	   		}
    	   		if (cd.getIsNamedBy() == null)
    	   			out.write(",null");
    	   		else{
    	   			AttributeDefinition ad = cd.getIsNamedBy();
    	   			String schema = ad.getDefinedIn().getDMSASGName();
    	   			out.write("," + schema + ".__" + ad.getName());
    	   		}
    			out.write(");\n");
    		}
    		
    		for(ClassNode cn: derived.values()){
    			cn.writeClassInfo(out);
    		}
		}
    }
			
    
    
    ///////////////////////////////////////////////////////////////////////////
    
	private void setAttributeValuesMETA(BufferedWriter out, DmcUncheckedObject obj, PrintfFormat pf, TreeMap<String,DmcUncheckedObject>	typeDefs, TreeMap<String,DmcUncheckedObject> attributeDefs) throws IOException, ResultException {
		String				attrName	= null;
		String          	objName		= null;
		DmcUncheckedObject 	attrDef		= null;
		String          	typeName    = null;
		DmcUncheckedObject  typeDef     = null;
		boolean				multiValued	= false;
		boolean         	isReference = false;
		boolean         	isEnumType  = false;
		
		objName = obj.getSV("ruleName") + "Data";
		
		Iterator<String> attributeNames = obj.getAttributeNames();
		while(attributeNames.hasNext()){
			NamedStringArray attr = obj.get(attributeNames.next());
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
			
			if (obj.getConstructionClass().equals("InitRuleData")){
				if (attrName.equals("ruleName") || attrName.equals("ruleTitle") || attrName.equals("description") || attrName.equals("applyToClass")){
					// Just keep going
				}
				else{
					formatOtherAttribute(out,pf,typeDefs,attrDef);
					continue;
				}
			}
			
			
			// MULTIVALUED 1
			if (attrDef.getSV("valueType") != null)
				multiValued = true;
			
			typeName = attrDef.getSV("type");
			typeDef = typeDefs.get(typeName);
			
			if (typeDef == null){
				// If this is null, we need to look for an internally generated Reference type
				typeDef = typeDefs.get(typeName + "REF");
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
					typeDef = typeDefs.get(typeName + "REF");
					isReference = true;
					
					if (typeDef.getSV("isEnumType") != null)
						isEnumType = true;
				}
				
	            out.write("            _" + pf.sprintf(objName));
	            
				out.write(".setType(");
				
				if (isReference){
					out.write("_" + obj.getSV(attrName) + "REF);\n");
				}
				else{
					out.write("_" + obj.getSV(attrName) + ");\n");
				}
			}
			else{
				if (multiValued){
					
					for(String attrVal: attr){
			            out.write("            _" + pf.sprintf(objName));
						out.write(".add" + attrNameCapped + "(");
						
						if (isReference){
							if (isEnumType)
								out.write(typeName + "." + attrVal + ");\n");
							else
								out.write("_" + attrVal + ");\n");
						}
						else{
							out.write("\"" + attrVal + "\");\n");
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
						String value = obj.getSV(attrName);
						
						if (attrName.equals("name")){
							String val = obj.getSV(attrName);
							if (val.endsWith("EnumREF")){
//									DebugInfo.debug("Enum name: " + val);
								value = val.replaceFirst("REF", "");
//									DebugInfo.debug("value = " + value);
							}
						}

						out.write("\"" + value + "\");\n");
					}
				}
			}
			
		}
//            out.write("            _" + pf.sprintf(objName));
//            out.write(".setDefinedIn(this);\n");
		
		out.write("\n");
		
	}
	
    
	private void setAttributeValues(BufferedWriter out, SchemaManager sm, DmcUncheckedObject obj, PrintfFormat pf) throws IOException, ResultException {
		String				attrName	= null;
		String          	objName		= null;
		ClassDefinition		cd			= null;
		AttributeDefinition	attrDef		= null;
//		TypeDefinition		typeDef		= null;
//		String          	typeName    = null;
//		boolean				multiValued	= false;
//		boolean         	isReference = false;
//		boolean         	isEnumType  = false;
		
		objName = obj.getSV("ruleName") + "Data";
		
		cd = sm.isClass(obj.getConstructionClass());
		if (cd == null){
			ResultException ex = new ResultException();
			ex.addError("Unknown rule data class: \n" + obj.toOIF());
			throw(ex);
		}
		
//		if (cd.getClassType() == ClassTypeEnum.EXTENSIBLE){
//			DebugInfo.debug("DmoCompactSchemaFormatter.setAttributeValues() " + cd.getName() + " is extensible");
//		}
		
		Iterator<String> attributeNames = obj.getAttributeNames();
		while(attributeNames.hasNext()){
			NamedStringArray attr = obj.get(attributeNames.next());
			attrName = attr.getName();
			if (attrName == null){
				DebugInfo.debugWithTrace("Attr name null");
				continue;
			}
			attrDef  = sm.isAttribute(attrName);
			
			if (attrDef == null){
				ResultException ex = new ResultException();
				ex.addError("Unknown attribute: " + attrName);
				ex.result.lastResult().fileName(obj.getSV(MetaDMSAG.__file.name));
				ex.result.lastResult().lineNumber(obj.lineNumber);
				throw(ex);
			}
			
	    	StringBuffer 	attrNameCapped 	= new StringBuffer();
	    	attrNameCapped.append(attrName);
	    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));
	    	
	    	DefinitionName allowed = null;
	    	try {
				allowed = new DefinitionName(attrName);
			} catch (DmcValueException e) {
				ResultException ex = new ResultException("This is not a legal attribute name: " + attrName);
				ex.moreMessages("DefinitionNames must begin with an alpha character and contain only leters and numbers.");
				ex.moreMessages("This occurred while formatting the compact schema for class: " + cd.getName().getNameString());
				throw(ex);
			}

	    	if (cd.isAllowedAttribute(allowed)){
				if (attrDef.getValueType() == ValueTypeEnum.SINGLE){
					String value = obj.getSV(attrName);
		            out.write("            _" + pf.sprintf(objName));
					out.write(".set" + attrNameCapped + "(");
					out.write("\"" + value + "\");\n");
				}
				else{
					for(String value: attr){
			            out.write("            _" + pf.sprintf(objName));
						out.write(".add" + attrNameCapped + "(");
						out.write("\"" + value + "\");\n");
					}
				}
			}
			else{
//				DebugInfo.debug("Extra attribute: " + attrName);
				out.write(attrDef.getValueModificationStatement(uniqueNum,"            ","            _" + objName, obj.get(attr.getName())));
				uniqueNum++;
			}
			
//			if (attrDef.getValueType() == ValueTypeEnum.SINGLE)
//				multiValued = false;
//			else
//				multiValued = true;
//			
//			if (attrDef.getType().getIsRefType())
//				isReference	= true;
//			else
//				isReference	= false;
//			
//			if (attrDef.getType().getIsEnumType())
//				isEnumType	= true;
//			else
//				isReference	= false;
//			
//			if (obj.getConstructionClass().equals("InitRuleData")){
//				if (attrName.equals(MetaDMSAG.__ruleName.name) || attrName.equals(MetaDMSAG.__ruleTitle.name) || attrName.equals(MetaDMSAG.__description.name) || attrName.equals(MetaDMSAG.__applyToClass.name)){
//					// Just keep going
//				}
//				else{
////					formatOtherAttribute(out,pf,typeDefs,attrDef);
//					continue;
//				}
//			}
//						
//			typeDef = attrDef.getType();
			
		}
		
		out.write("\n");
		
	}
	

	private void formatOtherAttribute(BufferedWriter out, PrintfFormat pf, TreeMap<String,DmcUncheckedObject>	typeDefs, DmcUncheckedObject attribute) throws IOException, ResultException{
		String typeName = attribute.getSV("type");
		DmcUncheckedObject type = typeDefs.get(typeName);
		DebugInfo.debug(type.toOIF() + "\n");
	}


}
