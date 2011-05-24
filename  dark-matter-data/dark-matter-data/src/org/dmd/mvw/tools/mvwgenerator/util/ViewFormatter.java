package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.util.FileUpdateManager;

public class ViewFormatter {

	static public void formatViewInterface(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + ".java");

//        ImportManager.reset();
//        view.getInterfaceImports();

        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");
        
        out.write(view.getInterfaceImports() + "\n");
        
        out.write("public interface " + view.getViewName() + " {\n\n");
        
        out.write("    public interface " + view.getViewName() + "Presenter {\n\n");
        
        out.write(view.getPresenterMethods());
        
        out.write("    }\n\n");
        
        out.write("    public void setPresenter(" + view.getViewName() + "Presenter presenter);\n\n");
        
        out.write(view.getViewMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static public void formatViewBaseImpl(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + "BaseImpl.java");
		
        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");

        out.write(view.getViewImplImports() + "\n");
        
        out.write("abstract public class " + view.getViewName() + "BaseImpl implements " + view.getViewName() + " {\n\n");
        
        out.write("    " + view.getViewName() + "Presenter presenter;\n\n");
        
        if (view.getUseRunContextItemHasValue()){
        	for(RunContextItem rci: view.getUseRunContextItemIterable()){
        		out.write(rci.getImplVariable());
        	}
        	out.write("\n");
        }
        
        if (view.getUseRunContextItemHasValue()){
            out.write("    protected " + view.getViewName() + "BaseImpl(MvwRunContextIF rc){\n");
            out.write("        presenter = null;\n\n");
            if (view.getUseRunContextItemHasValue()){
            	for(RunContextItem rci: view.getUseRunContextItemIterable()){
            		out.write(rci.getImplVariableAssignment());
            	}
            }
            out.write("    }\n\n");
        }
        else{
            out.write("    protected " + view.getViewName() + "BaseImpl(){");
            out.write("        presenter = null;\n\n");
            out.write("    }\n\n");
        }
        
        out.write("    public void setPresenter(" + view.getViewName() + "Presenter p){\n");
        out.write("        presenter = p;\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write(view.getViewImplMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
}
