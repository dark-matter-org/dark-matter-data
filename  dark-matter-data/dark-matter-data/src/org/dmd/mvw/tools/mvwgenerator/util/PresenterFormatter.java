package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;

public class PresenterFormatter {

	static public void formatPresenterBaseImpl(String outdir, Presenter presenter) throws IOException {
		
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, presenter.getPresenterName() + "BaseImpl.java");

        out.write("package " + presenter.getDefinedInModule().getGenPackage() + ".generated.mvw.presenters;\n\n");
        
        out.write(presenter.getImports());
        
        out.write("\n");
        
        out.write("abstract public class " + presenter.getPresenterName() + "BaseImpl" + presenter.getPresenterInterfaces() + " {\n\n");
        
    	for(RunContextItem rci: presenter.getUseRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    	}
    	out.write("\n");
    	
    	out.write(presenter.getCommsContants());
    	
    	out.write("    public " + presenter.getPresenterName() + "BaseImpl(MvwRunContextIF rc){\n");

    	for(RunContextItem rci: presenter.getUseRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

        out.write("    }\n\n");
        
        out.write(presenter.getCommsMethods());
        
        out.write(presenter.getAbstractMethods());
        
        out.write("}\n\n");
        
        out.close();
	}

}
