package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dmc.types.CamelCaseName;
import org.dmd.mvw.tools.mvwgenerator.extended.Place;
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;

public class PlaceFormatter {

	public static void formatPlace(String outdir, Place place) throws IOException {
		
		if (place.getRunsActivity().isCodeSplit())
			formatAsynchPlace(outdir, place);
		else
			formatStandardPlace(outdir, place);

	}
	
	static void formatStandardPlace(String outdir, Place place) throws IOException {

        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, place.getPlaceName() + ".java");

        out.write("package " + place.getDefinedInModule().getGenPackage() + ".generated.mvw.places;\n\n");
        
        out.write("\n");
        out.write(place.getImports());
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + place.getPlaceName() + " extends MvwPlace {\n\n");

        out.write("    public " + place.getPlaceName() + "(String t){\n");
        out.write("        super(t);\n");
        out.write("    }\n\n");
        
        out.write("    @Prefix(value = \"" + place.getPlacePrefix() + "\")\n");
        out.write("    public static class Tokenizer implements PlaceTokenizer<" + place.getPlaceName() + "> {\n");
        out.write("    \n");
        out.write("        @Override\n");
        out.write("        public String getToken(" + place.getPlaceName() + " place){\n");
        out.write("            return(place.getToken());\n");
        out.write("        }\n");
        out.write("\n");
        out.write("        @Override\n");
        out.write("        public " + place.getPlaceName() + " getPlace(String t){\n");
        out.write("            return(new " + place.getPlaceName() + "(t));\n");
        out.write("        }\n");
        out.write("    }\n\n");
        
        out.write("    public " + place.getRunsActivity().getActivityName() + " getActivity(MvwRunContextIF context){\n");
        out.write("        return( new " + place.getRunsActivity().getActivityName() + "(context));\n");
        out.write("    }\n");
        out.write("\n");


        out.write("}\n\n");
        
        out.close();
	}
	
	static void formatAsynchPlace(String outdir, Place place) throws IOException {

        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, place.getPlaceName() + ".java");

        out.write("package " + place.getDefinedInModule().getGenPackage() + ".generated.mvw.places;\n\n");
        
        out.write("\n");
        out.write(place.getImports());
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + place.getPlaceName() + " extends MvwAsyncPlace {\n\n");

        out.write("    public " + place.getPlaceName() + "(String t){\n");
        out.write("        super(t);\n");
        out.write("    }\n\n");
        
        out.write("    @Prefix(value = \"" + place.getPlacePrefix() + "\")\n");
        out.write("    public static class Tokenizer implements PlaceTokenizer<" + place.getPlaceName() + "> {\n");
        out.write("    \n");
        out.write("        @Override\n");
        out.write("        public String getToken(" + place.getPlaceName() + " place){\n");
        out.write("            return(place.getToken());\n");
        out.write("        }\n");
        out.write("\n");
        out.write("        @Override\n");
        out.write("        public " + place.getPlaceName() + " getPlace(String t){\n");
        out.write("            return(new " + place.getPlaceName() + "(t));\n");
        out.write("        }\n");
        out.write("    }\n\n");
        
        out.write("    public Activity getActivity(MvwRunContextIF context){\n");
        out.write("        return(activity);\n");
        out.write("    }\n");
        out.write("\n");

        out.write("    public void initActivity(final MvwAsyncPlaceController apc, final MvwRunContextIF context){\n");
        out.write("        final MvwAsyncPlace thisPlace = this;\n");
        out.write("        GWT.runAsync(new RunAsyncCallback() {\n");
        out.write("        	\n");
        out.write("        	@Override\n");
        out.write("        	public void onSuccess() {\n");
        out.write("        		activity = new " + place.getRunsActivity().getActivityName()+ "(context);\n");
        out.write("        		apc.asyncPlaceReady(thisPlace);\n");
        out.write("        	}\n");
        out.write("        	\n");
        out.write("        	@Override\n");
        out.write("        	public void onFailure(Throwable reason) {\n");
        out.write("        		context.getCentralAsyncErrorHandler().handleAsyncCodeError(\"" + place.getRunsActivity().getImplementationClass() + "\",reason);\n");
        out.write("        	}\n");
        out.write("        });\n");
        out.write("        \n");
        out.write("    }\n");
        out.write("\n");


        out.write("}\n\n");
        
        out.close();
	}
	
	public static void formatPlaceHistoryMapper(String outdir, WebApplication app, TreeMap<CamelCaseName, Place> places) throws IOException {
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, app.getAppName() + "PlaceHistoryMapper.java");
        ImportManager imports = new ImportManager();
        getImports(imports,app,places);

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw.places;\n\n");
        
        out.write("\n");
        out.write(imports.getFormattedImports());
        out.write("\n");
        out.write("@WithTokenizers({\n");
        int count = 1;
        for(Place place: places.values()){
        	out.write("                    " + place.getPlaceName() + ".Tokenizer.class");
        	if (count < places.size())
        		out.write(",");
        	out.write("\n");
        	count++;
        }
        out.write("                })\n\n");
        
        out.write("public interface " + app.getAppName() + "PlaceHistoryMapper extends PlaceHistoryMapper {\n");
        out.write("}\n");
        out.write("\n");

        out.close();
	}
	
	private static void getImports(ImportManager imports, WebApplication app, TreeMap<CamelCaseName, Place> places){
		imports.addImport("com.google.gwt.place.shared.PlaceHistoryMapper", "Base class");
		imports.addImport("com.google.gwt.place.shared.WithTokenizers", "Required annotation");
		
		for(Place place: places.values()){
			imports.addImport(place.getPlaceImport(), "Required place");
		}
	}
}
