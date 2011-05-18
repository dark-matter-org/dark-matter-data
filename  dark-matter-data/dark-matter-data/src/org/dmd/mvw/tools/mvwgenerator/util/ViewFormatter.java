package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;

public class ViewFormatter {

	static public void formatView(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + ".java");

        ImportManager.reset();
        view.getInterfaceImports();

        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");
        
        out.write(ImportManager.getFormattedImports() + "\n");
        
        out.write("public interface " + view.getViewName() + " {\n\n");
        
        out.write("    public interface Presenter {\n\n");
        
        out.write(view.getPresenterMethods());
        
        out.write("    }\n\n");
        
        out.write("    public void setPresenter(Presenter presenter);\n\n");
        
        out.write(view.getDataMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	
}
