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
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.BooleanVar;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.CodeFormatter;

/**
 * The DmoFormatter class takes a ClassDefinition and generates the associated
 * DarkMatter Object.
 */
public class DmoFormatter {
	
	String 			fileHeader;
	
	SchemaManager	schema;
	
	ArrayList<AttributeDefinition>	allAttr;
	
	PrintStream		progress;
	
	// These are used when generating AUX classes. We set them in the getImports() method
	// so that we can generate the appropriate private set()/get() methods as required.
//	boolean	anyMVAttributes;
//	boolean anySVAttributes;
	
	public DmoFormatter(){
		progress = null;
	}
	
	public DmoFormatter(PrintStream o){
		progress = o;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	

	/**
	 * For all ClassDefinitions in the schema, this method dumps the DmcObjects that
	 * represent them.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @param auxdir The output directory for auxiliary classes.
	 * @throws IOException 
	 * @throws ResultException 
	 */
	public void dumpDMOs(SchemaManager sm, SchemaDefinition sd, String dmodir, String auxdir) throws IOException, ResultException{
		schema = sm;
		
//		if (progress != null)
//			progress.println("\n");
		
		Iterator<ClassDefinition> cdl = sd.getClassDefList();
		if (cdl != null){
			while(cdl.hasNext()){
				ClassDefinition cd = cdl.next();
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					dumpAUX(cd, auxdir);
				}
				else{
					dumpDMO(cd,dmodir);
				}
			}
		}
	}
	
	/**
	 * Dumps a file named <class name>DMO.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 * @throws ResultException 
	 */
	private void dumpDMO(ClassDefinition cd, String outdir) throws IOException, ResultException {
		allAttr = new ArrayList<AttributeDefinition>();
		
//		String ofn = outdir + File.separator + cd.getName().getNameString() + "DMO.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cd.getName().getNameString() + "DMO.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.dmo;\n\n");
        
        BooleanVar anyMVAttributes = new BooleanVar(false);
        BooleanVar anySVAttributes = new BooleanVar(false);

        out.write(getImports(cd,anySVAttributes,anyMVAttributes));
        
        out.write("import org.dmd.dms.generated.dmo.MetaVCAG;\n");
        out.write("import org.dmd.dmc.DmcAttributeValidator;\n");
        out.write("import org.dmd.dmc.DmcObjectValidator;\n\n");
        
        out.write(getClassHeader(cd,DebugInfo.getWhereWeAreNow()));
        
        out.write(" {\n\n");
     
        out.write("    public final static String constructionClassName = \"" + cd.getName().getNameString() + "\";\n\n");
        
        StringBuffer staticInit = new StringBuffer();
        out.write(getDmcAttributeInfo(cd, staticInit) + "\n");
        
        out.write(getDMOValidatorInfo(cd, staticInit));
        
        out.write("\n");
        out.write("    static {\n");
        out.write(staticInit.toString());
        out.write("    }\n\n");
        
        out.write("    public " + cd.getName() + "DMO() {\n");
        out.write("        super(\"" + cd.getName() + "\");\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    protected " + cd.getName() + "DMO(String oc) {\n");
        out.write("        super(oc);\n");
        out.write("    }\n");
        out.write("\n");
        
        if (cd.getSupportsBackrefTracking() == false){
	        out.write("    @Override\n");
        	out.write("    public boolean supportsBackrefTracking(){\n");
        	out.write("        return(false);\n");
        	out.write("    }\n\n");
        }
        
    	out.write("    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){\n");
    	out.write("        return(_ImAp);\n");
    	out.write("    }\n\n");

    	out.write("    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){\n");
    	out.write("        return(_SmAp);\n");
    	out.write("    }\n\n");

    	out.write("    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){\n");
    	out.write("        return(_AvDmAp);\n");
    	out.write("    }\n\n");

    	out.write("    protected Map<String,DmcObjectValidator> getObjectValidators(){\n");
    	out.write("        return(_OvDmAp);\n");
    	out.write("    }\n\n");

        
        if (cd.getClassType() != ClassTypeEnum.ABSTRACT){
	        out.write("    @Override\n");
	    	out.write("    public " + cd.getName() + "DMO getNew(){\n");
	        out.write("        " + cd.getName() + "DMO rc = new " + cd.getName() + "DMO();\n");
	        out.write("        return(rc);\n");
	    	out.write("    }\n\n");

	        out.write("    @Override\n");
	    	out.write("    public " + cd.getName() + "DMO getSlice(DmcSliceInfo info){\n");
	        out.write("        " + cd.getName() + "DMO rc = new " + cd.getName() + "DMO();\n");
	        out.write("        populateSlice(rc,info);\n");
	        out.write("        return(rc);\n");
	    	out.write("    }\n\n");

	        out.write("    public " + cd.getName() + "DMO(DmcTypeModifierMV mods) {\n");
	        out.write("        super(\"" + cd.getName() + "\");\n");
	        out.write("        modrec(true);\n");
	        out.write("        setModifier(mods);\n");
	        out.write("    }\n");
	        out.write("\n");
	        
	        if (cd.getIsNamedBy() != null){
	        	String upper = GenUtility.capTheName(cd.getIsNamedBy().getObjectName().toString());
	        	
		        out.write("    public " + cd.getName() + "DMO getModificationRecorder(){\n");
		        out.write("        " + cd.getName() + "DMO rc = new " + cd.getName() + "DMO();\n");
		        out.write("        rc.set" + upper + "(get" + upper + "());\n");
		        out.write("        rc.setModifier(new DmcTypeModifierMV());\n");
		        out.write("        return(rc);\n");
		        out.write("    }\n\n");
	        	
	        }
        }
        
        out.write(getAccessFunctions(cd));
        out.write("\n");
        
        out.write(getATIFunctions(cd));
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	String getDmcAttributeInfo(ClassDefinition cd, StringBuffer staticInit){
		StringBuffer rc = new StringBuffer();
		
        rc.append("    static Map<Integer,DmcAttributeInfo> _ImAp;\n\n");
        rc.append("    static Map<String ,DmcAttributeInfo> _SmAp;\n\n");
        
		for(AttributeDefinition ad: cd.getFullAttrMap().values()){
			if (cd.isMust(ad.getName()))
				appendAttributeInfo(rc, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), ad.getDataType(), "true");
			else
				appendAttributeInfo(rc, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), ad.getDataType(), "false");
		}
		
//		rc.append("\n");
//		rc.append("    static {\n");
		
		staticInit.append("        _ImAp = new HashMap<Integer,DmcAttributeInfo>();\n");
        
		for(AttributeDefinition ad: cd.getFullAttrMap().values()){
			staticInit.append("        _ImAp.put(__" + ad.getName() + ".id,__" + ad.getName() + ");\n");
        }

		staticInit.append("\n");

		staticInit.append("        _SmAp = new HashMap<String ,DmcAttributeInfo>();\n");
        
		for(AttributeDefinition ad: cd.getFullAttrMap().values()){
			staticInit.append("        _SmAp.put(__" + ad.getName() + ".name,__" + ad.getName() + ");\n");
        }

//        rc.append("    }\n");

		
		return(rc.toString());
	}
	
	String getDMOValidatorInfo(ClassDefinition cd , StringBuffer staticInit){
		StringBuffer rc = new StringBuffer();
        rc.append("    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;\n\n");
        rc.append("    static Map<String ,DmcObjectValidator> _OvDmAp;\n\n");
        
		staticInit.append("\n");
        staticInit.append("        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();\n");

		staticInit.append("\n");

		staticInit.append("        _OvDmAp = new HashMap<String,DmcObjectValidator>();\n");
        staticInit.append("        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);\n");

        return(rc.toString());
	}
	
    void appendAttributeInfo(StringBuffer out, String n, int ID, String t, ValueTypeEnum vte, DataTypeEnum dte, String opt){
    	out.append("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.append("\"" + n + "\",");
    	out.append(ID + ",");
    	out.append("\"" + t + "\",");
		out.append("ValueTypeEnum." + vte.toString() + ",");
		out.append("DataTypeEnum." + dte.toString() + ",");
    	out.append(opt + ");\n");
    }

	String getATIFunctions(ClassDefinition cd){
		StringBuffer sb = new StringBuffer();
		
		Iterator<ActionDefinition> actions = cd.getActions();
		if (actions != null){
			while(actions.hasNext()){
				ActionDefinition ad = actions.next();
				String capped = GenUtility.capTheName(ad.getName().getNameString());
				sb.append("\n");
				sb.append("    /**\n");
				sb.append("     * Returns the parameter container for the " + ad.getName() + " action.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    static public " + capped + "ATI get" + capped + "ATI(){\n");
				sb.append("        return(new " + capped + "ATI());\n");
				sb.append("    }\n");
			}
		}
		
		return(sb.toString());
	}
	
	/**
	 * Dumps a file named <class name>AUX.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 * @throws ResultException 
	 */
	private void dumpAUX(ClassDefinition cd, String outdir) throws IOException, ResultException {
		allAttr = new ArrayList<AttributeDefinition>();
		
		BooleanVar	anyMVAttributes = new BooleanVar(false);
		BooleanVar	anySVAttributes = new BooleanVar(false);
		
//		String ofn = outdir + File.separator + cd.getName().getNameString() + "DMO.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cd.getName().getNameString() + "DMO.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);

        out.write("package " + cd.getDefinedIn().getSchemaPackage() + ".generated.auxw;\n\n");
        
        // This call updates allAttr and staticNames
        out.write(getImports(cd,anySVAttributes,anyMVAttributes));
        
        out.write(getClassHeader(cd,DebugInfo.getWhereWeAreNow()));
        
        out.write(" {\n\n");
        
        out.write("    public final static String _auxClass = \"" + cd.getName() + "\";\n");
        
        StringBuffer staticInit = new StringBuffer();
        out.write(getDmcAttributeInfo(cd,staticInit) + "\n");
        
        out.write("\n");
        out.write("    static {\n");
        out.write(staticInit.toString());
        out.write("    }\n");

        
       
        out.write(getCommonAUXFunctions(anySVAttributes.booleanValue(),anyMVAttributes.booleanValue()));
        
        out.write(getAUXAccessFunctions(cd));
        
        out.write("\n");
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	String getCommonAUXFunctions(boolean anySVAttributes, boolean anyMVAttributes){
		StringBuffer sb = new StringBuffer();
		sb.append("    /**\n");
		sb.append("     * This method will check to see if the object has any of our attributes.\n");
		sb.append("     * If not, our aux class is automatically removed from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static private void removeAuxIfRequired(DmcObject core){\n");
		sb.append("        boolean anyLeft = false;\n");
		sb.append("\n");
		for(AttributeDefinition ad : allAttr){
			sb.append("        if (core.get(__" + ad.getName() + ") != null)\n");
			sb.append("            anyLeft = true;\n");
		}
		sb.append("\n");
		sb.append("        if (!anyLeft)\n");
		sb.append("            core.removeAux(_auxClass);\n");
		sb.append("    }\n");
		sb.append("\n");
		
		sb.append("    /**\n");
		sb.append("     * This method will check to see if the object has our aux class.\n");
		sb.append("     * If not, we add our aux class the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {\n");
		sb.append("        if (!core.hasAux(_auxClass))\n");
		sb.append("            core.addAux(_auxClass);\n");
		sb.append("    }\n");
		sb.append("\n");

		sb.append("    /**\n");
		sb.append("     * Determines if the specified class is in our ocl.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public boolean hasAux(DmcObject core) throws DmcValueException {\n");
		sb.append("        if (core == null)\n");
		sb.append("            return(false);\n");
		sb.append("        return(core.hasAux(_auxClass));\n");
		sb.append("    }\n");
		sb.append("\n");

		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){\n");
		sb.append("        if (core == null)\n");
		sb.append("            return(null);\n");
		sb.append("        return(core.get(ai));\n");
		sb.append("    }\n");
		sb.append("\n");

		if (anySVAttributes){
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {\n");
			sb.append("        if (core == null)\n");
			sb.append("            return(null);\n");
			sb.append("        addAuxIfRequired(core);\n");
			sb.append("        return(core.set(ai,attr));\n");
			sb.append("    }\n");
			sb.append("\n");
		}

		if (anyMVAttributes){
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static private DmcAttribute<?> add(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {\n");
			sb.append("        if (core == null)\n");
			sb.append("            return(null);\n");
			sb.append("        addAuxIfRequired(core);\n");
			sb.append("        return(core.add(ai,attr));\n");
			sb.append("    }\n");
			sb.append("\n");
			
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static private DmcAttribute<?> del(DmcObject core, DmcAttributeInfo ai, Object value) throws DmcValueException {\n");
			sb.append("        if (core == null)\n");
			sb.append("            return(null);\n");
			sb.append("        DmcAttribute<?> rc = core.del(ai,value);\n");
			sb.append("        removeAuxIfRequired(core);\n");
			sb.append("        return(rc);\n");
			sb.append("    }\n");
			sb.append("\n");
		}
		
		return(sb.toString());
	}
		
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @return
	 * @throws ResultException 
	 */
	String getImports(ClassDefinition cd, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws ResultException{
		
		Iterator<AttributeDefinition> may = cd.getMay();
		Iterator<AttributeDefinition> must = cd.getMust();
		
		return(GenUtility.getImports(cd, may, must, allAttr, anySVAttributes, anyMVAttributes));
		
	}
//		boolean								anyAttributes	= false;
//		boolean								anyAttributesAtThisLevel = false;
//		IntegerVar							longestImport	= new IntegerVar();
//		TreeMap<StringName,TypeDefinition>	types 			= new TreeMap<StringName,TypeDefinition>();
//		TreeMap<String,TypeAndAttr>			typeAndAttr 	= new TreeMap<String,TypeAndAttr>();
//		TreeSet<String>						genericImports	= new TreeSet<String>();
//		
//		// Key: type name
//		// Value: comment
//		TreeMap<String,String>	uniqueImports = new TreeMap<String, String>();
//		
//		Iterator<AttributeDefinition> may = cd.getMay();
//		if (may != null){
//			while(may.hasNext()){
//				AttributeDefinition ad = may.next();
//				anyAttributes = true;
//				
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				
//				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType());
//				typeAndAttr.put(ta.name, ta);
//				
//				switch(ad.getValueType()){
//				case SINGLE:
//					anySVAttributes = true;
//					break;
//				case MULTI:
//				case HASHMAPPED:
//				case TREEMAPPED:
//				case HASHSET:
//				case TREESET:
//					anyMVAttributes = true;
//					break;
//				}
//				
//				if (ad.getGenericArgsImport() != null)
//					genericImports.add(ad.getGenericArgsImport());
//
//				, allAr.add(ad);
//			}
//		}
//		
//		Iterator<AttributeDefinition> must = cd.getMust();
//		if (must != null){
//			while(must.hasNext()){
//				AttributeDefinition ad = must.next();
//				anyAttributes = true;
//				
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				
//				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType());
//				typeAndAttr.put(ta.name, ta);
//				
//				switch(ad.getValueType()){
//				case SINGLE:
//					anySVAttributes = true;
//					break;
//				case MULTI:
//				case HASHMAPPED:
//				case TREEMAPPED:
//				case HASHSET:
//				case TREESET:
//					anyMVAttributes = true;
//					break;
//				}
//								
//				if (ad.getGenericArgsImport() != null)
//					genericImports.add(ad.getGenericArgsImport());
//
//				allAttr.add(ad);
//			}
//		}
//		
//		anyAttributesAtThisLevel = anyAttributes;
//		
//		if (cd.getFullAttrMap().size() > 0)
//			anyAttributes = true;
//		
//		addImport(uniqueImports, longestImport, "java.io.Serializable", "Always required");
//		addImport(uniqueImports, longestImport, "java.util.*", "Always required");
//			
//			
//		if (anyAttributes)
//			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.enums.ValueTypeEnum", "Required if we have any attributes");
//
//		addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttributeInfo", "Always required");
//		
//		if (anyAttributesAtThisLevel){
//			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcAttribute", "Any attributes");
//			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcValueException", "Any attributes");
//		}
//		
//		for(String s: genericImports){
//			addImport(uniqueImports, longestImport, s, "Generic args import");
//		}
//
//		DebugInfo.debug("For class: " + cd.getName());
//		for(TypeAndAttr ta: typeAndAttr.values()){
//			TypeDefinition td = ta.td;
//
//			if ( (td.getPrimitiveType() != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY) ){
//				
//				if (td.getInternallyGenerated() && td.getIsRefType()){
//					// We have an internally generated reference type, only import if
//					// the definition is from a different schema, otherwise, we're
//					// already in the same package and don't need to import it
//					if (cd.getDefinedIn() != td.getDefinedIn()){
//						// NOTE: GetRequest has an unneeded ClassDefinitionDMO import because of this
//						// need to figure out the right criteria
//						
//					}
//				}
//				else{
//					addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type and !auxiliary class");
//				}
//			}
//			
//			
//			if (td.getIsRefType()){
//				addImport(uniqueImports, longestImport, ta.getImport(), "Reference type");
//				
//				addImport(uniqueImports, longestImport, td.getOriginalClass().getDmoImport(), "Type specific set/add");
//				
//				if (td.getOriginalClass().getInternalTypeRef().getHelperClassName() == null){
//					DebugInfo.debug("\n\n*** PROBABLY MISSING isNamedBy FQN on a hierarchic object: " + td.getName() + " ***\n\n");
//				}
//				else{
//					
//					DebugInfo.debug(td.toOIF(20));
//					addImport(uniqueImports, longestImport, td.getOriginalClass().getInternalTypeRef().getHelperClassName(), "Reference type helper class");
//					
//				}
//			}
//			else{
//				addImport(uniqueImports, longestImport, ta.getImport(), "Required type");
//			}
//			
//			if (td.getHelperClassName() != null){
//				addImport(uniqueImports, longestImport, td.getHelperClassName(), "Helper class");
//			}
//		}
//				
//		if (cd.getDerivedFrom() == null){
//			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
//				addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcObject", "Auxiliary class");
//			}
//			else{
//				addImport(uniqueImports, longestImport, "org.dmd.dms.generated.dmo.DmwWrapperDMO", "Structural class");
//			}
//		}
//		else{
//			addImport(uniqueImports, longestImport, cd.getDerivedFrom().getDmoImport(), "Base class");
//		}
//		
//		if (cd.getIsNamedBy() != null){
//			AttributeDefinition isNamedBy = cd.getIsNamedBy();
//			String nameAttributeType = isNamedBy.getType().getPrimitiveType();
//			
//			if (nameAttributeType == null){
//				ResultException ex = new ResultException("Naming attribute for class " + cd.getName() + " must be a complex type.");
//				ex.result.lastResult().moreMessages("Check the type of attribute " + isNamedBy.getName().getNameString());
//				ex.result.lastResult().fileName(isNamedBy.getFile());
//				ex.result.lastResult().lineNumber(isNamedBy.getLineNumber());
//				throw(ex);
//			}
//			
//			addImport(uniqueImports, longestImport, nameAttributeType, "Naming attribute type");
//			addImport(uniqueImports, longestImport, "org.dmd.dmc.DmcNamedObjectIF", "Named object");
//		}
//
//		return(formatImports(uniqueImports, longestImport.intValue()));
//	}
//	
//	void addImport(TreeMap<String,String> map, IntegerVar longest, String i, String c){
//		if (i.length() > longest.intValue())
//			longest.set(i.length());
//		
//		map.put(i,c);
//	}
//	
//	String formatImports(TreeMap<String,String> map, int longest){
//		int padding = longest+17;
//		StringBuffer sb = new StringBuffer();
//		PrintfFormat format = new PrintfFormat("%-" + padding + "s");
//		
//		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//		
//		Iterator<String> keys = map.keySet().iterator();
//		while(keys.hasNext()){
//			String key = keys.next();
//			sb.append(format.sprintf("import " + key + ";") + "// " + map.get(key) + "\n");
//		}
//		
//		sb.append("\n");
//		
//		return(sb.toString());
//	}
	
	String getClassHeader(ClassDefinition cd, String where){
		StringBuffer sb = new StringBuffer();
		
		sb.append("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescription(),sb," * ");
        sb.append(" * <P>\n");
        sb.append(" * Generated from the " + cd.getDefinedIn().getName() + " schema at version " + cd.getDefinedIn().getVersion() + "\n");
        sb.append(" * <P>\n");
        sb.append(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        sb.append(" * Generated from: " + where + "\n");
        sb.append(" */\n");
		
		if (cd.getClassType() != ClassTypeEnum.AUXILIARY)
			sb.append("@SuppressWarnings(\"serial\")\n");
				
		switch(cd.getClassType()){
		case ABSTRACT:
			sb.append("abstract public class ");
			break;
		case AUXILIARY:
		case EXTENSIBLE:
		case STRUCTURAL:
			sb.append("public class ");
			break;
		}
		
		sb.append(cd.getName() + "DMO ");
		
		if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
			if (cd.getDerivedFrom() == null){
				sb.append(" extends DmwWrapperDMO ");
			}
			else
				sb.append(" extends " + cd.getDerivedFrom().getName() + "DMO ");
		
			if (cd.getIsNamedBy() == null){
				if (cd.getUsesInterface() == null)
					sb.append(" implements ");
				else
				sb.append(" implements " + cd.getUsesInterface() + ", ");
			}
			else{
				sb.append(" implements DmcNamedObjectIF");
				if (cd.getUsesInterface() == null)
					sb.append(", ");
				else
					sb.append("," + cd.getUsesInterface() + ", ");
				
			}
			
			sb.append("Serializable ");
		
		}
		
		return(sb.toString());
	}
	
	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		
		if (cd.getIsNamedBy() != null){
			String tn = cd.getIsNamedBy().getType().getName().getNameString();
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + tn + " getObjectName(){\n");
			sb.append("        DmcAttribute<?> name = get(__" + cd.getIsNamedBy().getName() + ");\n");
			sb.append("        if (name != null)\n");
			sb.append("            return((" + tn + ")name.getSV());\n");
			sb.append("    \n");
			sb.append("        return(null);\n");
			sb.append("    }\n\n");
			
			sb.append("    public DmcAttribute<?> getObjectNameAttribute(){\n");
			sb.append("        DmcAttribute<?> name = get(__" + cd.getIsNamedBy().getName() + ");\n");
			sb.append("        return(name);\n");
			sb.append("    }\n\n");
			
			sb.append("    public boolean equals(Object obj){\n");
			sb.append("        if (obj instanceof " + cd.getName()+ "DMO){\n");
			sb.append("            return( getObjectName().equals( ((" + cd.getName() + "DMO) obj).getObjectName()) );\n");
			sb.append("        }\n");
			sb.append("        return(false);\n");
			sb.append("    }\n\n");
		}
		
		for(AttributeDefinition ad : allAttr){
			switch(ad.getValueType()){
			case SINGLE:
				GenUtility.formatSV(ad, sb);
				break;
			case MULTI:
			case HASHSET:
			case TREESET:
				GenUtility.formatMV(ad, sb);
				break;
			case HASHMAPPED:
				GenUtility.formatMAPPED(ad, sb);
				break;
			case TREEMAPPED:
				GenUtility.formatMAPPED(ad, sb);
				break;
			}
		}
		
		return(sb.toString());
	}
	
	String getAUXAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
				
		for(AttributeDefinition ad : allAttr){
			switch(ad.getValueType()){
			case SINGLE:
				formatSVAUX(ad,sb);
				break;
			case MULTI:
				formatMVAUX(ad,sb);
				break;
			case HASHMAPPED:
				break;
			case TREEMAPPED:
				break;
			}
		}
		
		return(sb.toString());
	}
	
	
	void formatSVAUX(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String nullReturnValue = ad.getType().getNullReturnValue();
    	String typeName = ad.getType().getName().getNameString();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
//    		typeName = typeName + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	attrType = attrType + "SV";
		
    	// Remove attribute
    	
    	sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> rem" + functionName + "(DmcObject core){\n");
		sb.append("        if (core == null)\n");
		sb.append("            return(null);\n");
		sb.append("        DmcAttribute<?> rc = core.rem(__" + ad.getName() + ");\n");
		sb.append("        removeAuxIfRequired(core);\n");
		sb.append("        return(rc);\n");
		sb.append("    }\n");
		sb.append("\n");

		
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	
    	
    	if (ad.getType().getIsRefType()){
    		typeName = ad.getType().getOriginalClass().getName() + "REF";
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    static public " + typeName + " get" + functionName + "(DmcObject core){\n");
    		sb.append("        " + attrType + " attr = (" + attrType + ") get(core, __" + ad.getName() + ");\n");
    		sb.append("        if (attr == null)\n");
    		
        	if (nullReturnValue == null)
        		sb.append("            return(null);\n");
        	else
        		sb.append("            return(" + nullReturnValue + ");\n");

        	sb.append("\n");
        	sb.append("        return(attr.getSV());\n");
        	sb.append("    }\n\n");    		
    	}
    	else{
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    static public " + typeName + " get" + functionName + "(DmcObject core){\n");
    		sb.append("        " + attrType + " attr = (" + attrType + ") get(core, __" + ad.getName() + ");\n");
    		sb.append("        if (attr == null)\n");
    		
        	if (nullReturnValue == null)
        		sb.append("            return(null);\n");
        	else
        		sb.append("            return(" + nullReturnValue + ");\n");

        	sb.append("\n");
        	sb.append("        return(attr.getSV());\n");
        	sb.append("    }\n\n");    		
    	}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    static public void set" + functionName + "(DmcObject core, Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(core, __" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(core, __" + ad.getName() + ",attr);\n");
    	sb.append("    }\n\n");
    	
    	// Type specific setter
    	if (ad.getType().getIsRefType()){
        	sb.append("    /**\n");
        	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
        	sb.append("     * @param value A value compatible with " + attrType + "\n");
        	sb.append("     */\n");
    		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        	sb.append("    static public void set" + functionName + "(DmcObject core, " + ad.getType().getOriginalClass().getName() + "DMO value){\n");
        	sb.append("        DmcAttribute<?> attr = get(core, __" + ad.getName() + ");\n");
        	sb.append("        if (attr == null)\n");
        	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
        	sb.append("        \n");
        	sb.append("        try {\n");
        	sb.append("            attr.set(value);\n");
        	sb.append("            set(core, __" + ad.getName() + ",attr);\n");
        	sb.append("        } catch (DmcValueException e) {\n");
        	sb.append("            throw(new IllegalStateException(\"Type specific modification shouldn't cause an error.\", e));\n");
        	sb.append("        }\n");
        	sb.append("    }\n\n");    		
    	}
    	else{
        	sb.append("    /**\n");
        	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
        	sb.append("     * @param value A value compatible with " + attrType + "\n");
        	sb.append("     */\n");
    		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        	sb.append("    static public void set" + functionName + "(DmcObject core, " + ad.getType().getName() + " value){\n");
        	sb.append("        DmcAttribute<?> attr = get(core, __" + ad.getName() + ");\n");
        	sb.append("        if (attr == null)\n");
        	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
        	sb.append("        \n");
        	sb.append("        try {\n");
        	sb.append("            attr.set(value);\n");
        	sb.append("            set(core, __" + ad.getName() + ",attr);\n");
        	sb.append("        } catch (DmcValueException e) {\n");
        	sb.append("            throw(new IllegalStateException(\"Type specific modification shouldn't cause an error.\", e));\n");
        	sb.append("        }\n");
        	sb.append("    }\n\n");    		
    	}
	}
	
	void formatMVAUX(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	attrType = attrType + "MV";
    	
    	// Remove attribute
  
    	sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> rem" + functionName + "(DmcObject core){\n");
		sb.append("        if (core == null)\n");
		sb.append("            return(null);\n");
		sb.append("        DmcAttribute<?> rc = core.rem(__" + ad.getName() + ");\n");
		sb.append("        removeAuxIfRequired(core);\n");
		sb.append("        return(rc);\n");
		sb.append("    }\n");
		sb.append("\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	sb.append("    /**\n");
		
		if (ad.getType().getIsRefType()){
			sb.append("     * @return An Iterator of " + typeName + "REF objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public Iterator<" + typeName + "REF> get" + functionName + "(DmcObject core){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(core, __" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		else{
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public Iterator<" + typeName + "> get" + functionName + "(DmcObject core){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(core, __" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator() );\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> add" + functionName + "(DmcObject core, Object value) throws DmcValueException {\n");
    	sb.append("        DmcAttribute<?> attr = get(core, __" + ad.getName() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(__" + ad.getName() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(core, __" + ad.getName() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		sb.append("    /**\n");
		sb.append("     * Deletes a " + ad.getName() + " value.\n");
		sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> del" + functionName + "(DmcObject core, Object value) throws DmcValueException {\n");
		sb.append("        return(del(core, __" + ad.getName() + ", value));\n");
		sb.append("    }\n\n");

	}

}
