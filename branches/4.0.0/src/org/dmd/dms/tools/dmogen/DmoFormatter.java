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
package org.dmd.dms.tools.dmogen;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.extended.ActionDefinition;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;
import org.dmd.dms.shared.types.BooleanVar;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.formatting.CodeFormatter;
import org.dmd.util.runtime.DebugInfo;


/**
 * The DmoFormatter class takes a ClassDefinition and generates the associated
 * DarkMatter Object.
 */
public class DmoFormatter {
	
	// Header for all generated files
	static String fileHeader = "";
	
	static ArrayList<AttributeDefinition>	allAttr;
	

	/**
	 * For all ClassDefinitions in the module, this method dumps the dark-matter objects that
	 * represent them.
	 * @param module The dark-matter schema module
	 * @param dmodir The output directory.
	 * @param fh     The file header or null.
	 * @throws IOException 
	 * @throws DMFeedbackSet 
	 */
	static public void dumpDMOs(DmsModule module, String dmodir, String fh) throws IOException, DMFeedbackSet {
		if (fh == null)
			fileHeader = "";
		else
			fileHeader = fh;
		
		if (module.getClassDefinitionCount() > 0){
			Iterator<ClassDefinition>	cdit = module.getAllClassDefinition();
			while(cdit.hasNext()){
				ClassDefinition cd = cdit.next();
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					dumpAUX(cd, dmodir);
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
	 * @throws DMFeedbackSet 
	 * @throws ResultException 
	 */
	static private void dumpDMO(ClassDefinition cd, String outdir) throws IOException, DMFeedbackSet {
		allAttr = new ArrayList<AttributeDefinition>();
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cd.getName().getNameString() + "DMO.java");
        
        out.write(fileHeader);

        out.write("package " + cd.getDefinedInDmsModule().getSchemaPackage() + ".generated.dmo;\n\n");
        
        BooleanVar anyMVAttributes = new BooleanVar(false);
        BooleanVar anySVAttributes = new BooleanVar(false);

        ImportManager imports = new ImportManager();
        getImports(imports,cd,anySVAttributes,anyMVAttributes);
        out.write(imports.getFormattedImports());
        
        out.write(getClassHeader(cd,DebugInfo.getWhereWeAreNow()));
        
        out.write(" {\n\n");
     
        out.write("    public final static String constructionClassName = \"" + cd.getName().getNameString() + "\";\n\n");
        
        StringBuffer staticInit = new StringBuffer();
        
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
	        
	        if (cd.getIsNamedBy() == null){
		        out.write("    public " + cd.getName() + "DMO getModificationRecorder(){\n");
		        out.write("        " + cd.getName() + "DMO rc = new " + cd.getName() + "DMO();\n");
		        out.write("        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));\n");
		        out.write("        rc.modrec(true);\n");
		        out.write("        return(rc);\n");
		        out.write("    }\n\n");
	        }
	        else{
	        	String upper = Manipulator.capFirstChar(cd.getIsNamedBy().getObjectName().toString());
	        	
		        out.write("    public " + cd.getName() + "DMO getModificationRecorder(){\n");
		        out.write("        " + cd.getName() + "DMO rc = new " + cd.getName() + "DMO();\n");
		        out.write("        rc.set" + upper + "(get" + upper + "());\n");
		        out.write("        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));\n");
		        out.write("        rc.modrec(true);\n");
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
	
	
	static private String getATIFunctions(ClassDefinition cd){
		StringBuffer sb = new StringBuffer();
		
		Iterator<ActionDefinition> actions = cd.getActions();
		if (actions != null){
			while(actions.hasNext()){
				ActionDefinition ad = actions.next();
				String capped = Manipulator.capFirstChar(ad.getName().getNameString());
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
	 * @throws DMFeedbackSet 
	 * @throws ResultException 
	 */
	static private void dumpAUX(ClassDefinition cd, String outdir) throws IOException, DMFeedbackSet {
		allAttr = new ArrayList<AttributeDefinition>();
		
		BooleanVar	anyMVAttributes = new BooleanVar(false);
		BooleanVar	anySVAttributes = new BooleanVar(false);
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cd.getName().getNameString() + "DMO.java");
        
        out.write(fileHeader);

        out.write("package " + cd.getDefinedInDmsModule().getSchemaPackage() + ".generated.dmo;\n\n");
        
        ImportManager imports = new ImportManager();
        getImports(imports,cd,anySVAttributes,anyMVAttributes);
        out.write(imports.getFormattedImports());
        
        out.write(getClassHeader(cd,DebugInfo.getWhereWeAreNow()));
        
        out.write(" {\n\n");
        
        out.write("    public final static String _auxClass = \"" + cd.getName() + "\";\n");
        
        StringBuffer staticInit = new StringBuffer();
        
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
	
	static private String getCommonAUXFunctions(boolean anySVAttributes, boolean anyMVAttributes){
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
			sb.append("        if (core.get(" + ad.getCompactSchemaReference() + ") != null)\n");
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
	 * @throws DMFeedbackSet 
	 * @throws ResultException 
	 */
	static private void getImports(ImportManager imports, ClassDefinition cd, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws DMFeedbackSet{
		Iterator<AttributeDefinition> may = cd.getMay();
		Iterator<AttributeDefinition> must = cd.getMust();
		
		ImportUtil.getImports(imports, cd, may, must, allAttr, anySVAttributes, anyMVAttributes);
	}
	
	static private String getClassHeader(ClassDefinition cd, String where){
		StringBuffer sb = new StringBuffer();
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescriptionWithNewlines(),sb," * ");
        sb.append(" * <P>\n");
        sb.append(" * Generated from the " + cd.getDefinedInDmsModule().getName() + " schema\n");
        sb.append(" * <P>\n");
        sb.append(" * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!\n");
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
		case INTERFACE:
			// Not currently using this - may get rid of it
			break;
		case UNKNOWN:
			// Shouldn't ever happen
			break;
		}
		
		sb.append(cd.getName() + "DMO ");
		
		if (cd.getClassType() != ClassTypeEnum.AUXILIARY){
			if (cd.getDerivedFrom() == null){
				sb.append(" extends DmcObject ");
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
				
				if (cd.getIsNamedBy().getType().getIsHierarchicName()){
					sb.append(", DmcHierarchicNamedObjectIF");
				}
				
				if (cd.getUsesInterface() == null)
					sb.append(", ");
				else
					sb.append("," + cd.getUsesInterface() + ", ");
				
			}
			
			sb.append("Serializable ");
		
		}
		
		return(sb.toString());
	}
	
	static private String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		
		if (cd.getIsNamedBy() != null){
			String tn = cd.getIsNamedBy().getType().getName().getNameString();
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + tn + " getObjectName(){\n");
			sb.append("        DmcAttribute<?> name = get(" + cd.getIsNamedBy().getCompactSchemaReference() + ");\n");
			sb.append("        if (name != null)\n");
			sb.append("            return((" + tn + ")name.getSV());\n");
			sb.append("    \n");
			sb.append("        return(null);\n");
			sb.append("    }\n\n");
			
			if (cd.getIsNamedBy().getType().getIsHierarchicName()){
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + tn + " getHierarchicObjectName(){\n");
				sb.append("        return(getObjectName());\n");
				sb.append("    }\n\n");
			}
			
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> getObjectNameAttribute(){\n");
			sb.append("        DmcAttribute<?> name = get(" + cd.getIsNamedBy().getCompactSchemaReference() + ");\n");
			sb.append("        return(name);\n");
			sb.append("    }\n\n");
			
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public boolean equals(Object obj){\n");
			sb.append("        if (obj instanceof " + cd.getName()+ "DMO){\n");
			sb.append("            return( getObjectName().equals( ((" + cd.getName() + "DMO) obj).getObjectName()) );\n");
			sb.append("        }\n");
			sb.append("        return(false);\n");
			sb.append("    }\n\n");
			
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public int hashCode(){\n");
			sb.append("        " + tn + " objn = getObjectName();\n");
			sb.append("        if (objn == null)\n");
			sb.append("            return(0);\n");
			sb.append("        \n");
			sb.append("        return(objn.hashCode());\n");
			sb.append("    }\n\n");
		}
		
		for(AttributeDefinition ad : allAttr){
			switch(ad.getValueType()){
			case SINGLE:
				AccessFunctionFormatter.formatSV(ad, sb);
				break;
			case MULTI:
			case HASHSET:
			case TREESET:
				AccessFunctionFormatter.formatMV(ad, sb);
				break;
			case HASHMAPPED:
				AccessFunctionFormatter.formatMAPPED(ad, sb);
				break;
			case TREEMAPPED:
				AccessFunctionFormatter.formatMAPPED(ad, sb);
				break;
			}
		}
		
		return(sb.toString());
	}
	
	static private String getAUXAccessFunctions(ClassDefinition cd){
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
			case TREEMAPPED:
			case HASHSET:
			case TREESET:
				throw(new IllegalStateException("Mapped and Set attributes aren't currently supported on AUXILIARY classes. Occurred with:\n" + cd.toOIF()));
			}
		}
		
		return(sb.toString());
	}
	
	
	static private void formatSVAUX(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String nullReturnValue = ad.getType().getNullReturnValue();
    	String typeName = ad.getType().getName().getNameString();
    	
    	if (ad.getNullReturnValue() != null){
    		nullReturnValue = ad.getNullReturnValue();
    	}
    	
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
    	
    	attrType = attrType + "SV";
		
    	// Remove attribute
    	
    	sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> rem" + functionName + "(DmcObject core){\n");
		sb.append("        if (core == null)\n");
		sb.append("            return(null);\n");
		sb.append("        DmcAttribute<?> rc = core.rem(" + ad.getCompactSchemaReference() + ");\n");
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
    		sb.append("        " + attrType + " attr = (" + attrType + ") get(core, " + ad.getCompactSchemaReference() + ");\n");
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
    		sb.append("        " + attrType + " attr = (" + attrType + ") get(core, " + ad.getCompactSchemaReference() + ");\n");
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
    	sb.append("        DmcAttribute<?> attr = get(core, " + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(core, " + ad.getCompactSchemaReference() + ",attr);\n");
    	sb.append("    }\n\n");
    	
    	// Type specific setter
    	if (ad.getType().getIsRefType()){
        	sb.append("    /**\n");
        	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
        	sb.append("     * @param value A value compatible with " + attrType + "\n");
        	sb.append("     */\n");
    		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        	sb.append("    static public void set" + functionName + "(DmcObject core, " + ad.getType().getOriginalClass().getName() + "DMO value){\n");
        	sb.append("        DmcAttribute<?> attr = get(core, " + ad.getCompactSchemaReference() + ");\n");
        	sb.append("        if (attr == null)\n");
        	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
        	sb.append("        \n");
        	sb.append("        try {\n");
        	sb.append("            attr.set(value);\n");
        	sb.append("            set(core, " + ad.getCompactSchemaReference() + ",attr);\n");
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
        	sb.append("        DmcAttribute<?> attr = get(core, " + ad.getCompactSchemaReference() + ");\n");
        	sb.append("        if (attr == null)\n");
        	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
        	sb.append("        \n");
        	sb.append("        try {\n");
        	sb.append("            attr.set(value);\n");
        	sb.append("            set(core, " + ad.getCompactSchemaReference() + ",attr);\n");
        	sb.append("        } catch (DmcValueException e) {\n");
        	sb.append("            throw(new IllegalStateException(\"Type specific modification shouldn't cause an error.\", e));\n");
        	sb.append("        }\n");
        	sb.append("    }\n\n");    		
    	}
	}
	
	static private void formatMVAUX(AttributeDefinition ad, StringBuffer sb){
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
		sb.append("        DmcAttribute<?> rc = core.rem(" + ad.getCompactSchemaReference() + ");\n");
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
			sb.append("        " + attrType + " attr = (" + attrType + ") get(core, " + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		else{
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public Iterator<" + typeName + "> get" + functionName + "(DmcObject core){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(core, " + ad.getCompactSchemaReference() + ");\n");
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
    	sb.append("        DmcAttribute<?> attr = get(core, " + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        attr.add(value);\n");
    	sb.append("        add(core, " + ad.getCompactSchemaReference() + ",attr);\n");
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
		sb.append("        return(del(core, " + ad.getCompactSchemaReference() + ", value));\n");
		sb.append("    }\n\n");

	}

}
