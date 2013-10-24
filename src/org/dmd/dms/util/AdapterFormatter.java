package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class AdapterFormatter {
	
    public static void dumpAdapterSV(String od, String typename, String genpackage, String REF) throws IOException {
    	dumpAdapter(od, typename, "SV", genpackage, true, REF);
    }

    public static void dumpAdapterMV(String od, String typename, String genpackage, String REF) throws IOException {
    	dumpAdapter(od, typename, "MV", genpackage, false, REF);
    }

    public static void dumpAdapterSET(String od, String typename, String genpackage, String REF) throws IOException {
    	dumpAdapter(od, typename, "SET", genpackage, false, REF);
    }

    public static void dumpAdapterMAP(String od, String typename, String genpackage) throws IOException {
    	dumpAdapter(od, typename, "MAP", genpackage, false, "");
    }

/**
 * 
 * @param od
 * @param typename
 * @param subtype
 * @param genpackage
 * @param SV
 * @param REF indicates if this is a reference to an unnamed DMO. Either REF or empty string.
 * @throws IOException
 */
    static void dumpAdapter(String od, String typename, String subtype, String genpackage, boolean SV, String REF) throws IOException {
    	String 	className 	= typename + subtype + "Adapter";
    	String	packageName = genpackage + ".generated.types.adapters";
    	String	baseClass	= "DmcType" + typename + REF + subtype;
    	String	baseImport	= genpackage + ".generated.types." + baseClass;
    	
        BufferedWriter out = FileUpdateManager.instance().getWriter(od + "/adapters", className + ".java");

        out.write("package " + packageName + ";\n\n");
        
        out.write("import org.dmd.dmc.presentation.DmcAdapterIF;\n");
        out.write("import org.dmd.dmc.DmcAttribute;\n");
        out.write("import org.dmd.dmc.DmcAttributeInfo;\n");
        out.write("import org.dmd.dms.generated.types.DmcTypeModifierMV;\n");
        if (typename.equals("Modifier")){
        	if (!subtype.equals("MV"))
        	out.write("import " + baseImport + ";\n\n");
        }
        else
        	out.write("import " + baseImport + ";\n\n");

        out.write("@SuppressWarnings(\"serial\")\n");
        out.write("// " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("// " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write("public class " + className + " extends " + baseClass + " implements DmcAdapterIF {\n\n");
        
        out.write("    transient " + baseClass + " existingValue;\n\n");
        
        out.write("    public " + className + "(DmcAttributeInfo ai){\n");
        out.write("    	   attrInfo = ai;\n");
        out.write("    }\n\n");
    	
        out.write("    @Override\n");
        out.write("    public void setEmpty(){\n");
        out.write("    	   value = null;\n");
        out.write("    }\n\n");
    	
        out.write("    @Override\n");
        out.write("    public boolean hasValue(){\n");
        out.write("    	   if (value == null)\n");
        out.write("    		   return(false);\n");
        out.write("    	   return(true);\n");
        out.write("    }\n\n");
    	
        out.write("    @Override\n");
        out.write("    public void resetToExisting() {\n");
        out.write("    	if (existingValue == null)\n");
        out.write("    		value = null;\n");
        out.write("    	else\n");
        if (SV)
            out.write("    		value = existingValue.getSVCopy();\n");
        else
        	out.write("    		value = existingValue.getMVCopy();\n");
        out.write("    }\n\n");

        out.write("    @Override\n");
        out.write("    public void setExisting(DmcAttribute<?> attr) {\n");
        out.write("    	existingValue = (" + baseClass + ") attr;\n");
        out.write("    	if (existingValue != null)\n");
        if (SV)
            out.write("    		value = existingValue.getSVCopy();\n");
        else
        	out.write("    		value = existingValue.getMVCopy();\n");
        out.write("    }\n\n");

        out.write("    @Override\n");
        out.write("    public boolean valueChanged(){\n");
        if (SV)
            out.write("    	   return(valueChangedSV(existingValue, this));\n");
        else
        	out.write("    	   return(valueChangedMV(existingValue, this));\n");
        out.write("    }\n\n");
    	
        out.write("    @Override\n");
        out.write("    public void addMods(DmcTypeModifierMV mods){\n");
        if (SV)
        	out.write("    	   addModsSV(mods, existingValue, this);\n");
        else
        	out.write("    	   addModsMV(mods, existingValue, this);\n");
        out.write("    }\n\n");

        out.write("    @Override\n");
        out.write("    public DmcAttribute<?> getExisting() {\n");
        out.write("    	   return(existingValue);\n");
        out.write("    }\n\n");
        
        out.write("    @Override\n");
        out.write("    public Object getValue() {\n");
        out.write("    	   return(value);\n");
        out.write("    }\n\n");
        
        
        out.write("}\n\n");
        
        out.close();
    }
    
}
