package org.dmd.dsd.tools.dsdwizard.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:72)
import java.io.IOException;                                           // Thrown by formatting - (TextualArtifact.java:40)
import org.dmd.dsd.tools.dsdwizard.generated.dmtdl.DmtdlFile;         // To access static Section: DmtdlFile - (TextualArtifact.java:43)
import org.dmd.templates.server.util.FormattedArtifactIF;             // Common interface for gathering formatted output - (TextualArtifact.java:39)



    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:74)
    /**
     * The structure of the DslDmtdlFile TextualArtifact is as follows:
     * 
     * [] : many Sections
     * ++ : an optional Section
     * -- : a static Section
     * <- : values can be inserted
     * xx : extension hook can be inserted
     * 
     * DslDmtdlFile
     *   -- DmtdlFile  <-
     */
    public class DslDmtdlFile {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:78)
    DmtdlFile    _DmtdlFile;         // A single static instance of DmtdlFile


    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:81)
    public DslDmtdlFile(){
        _DmtdlFile = new DmtdlFile(); // Static Section
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:137)
    public void format(FormattedArtifactIF artifact) throws IOException {

        _DmtdlFile.format(artifact);

    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:51)
    /**
     * @return the DmtdlFile Section at: _DmtdlFile
     */
    public DmtdlFile getDmtdlFile(){
        return(_DmtdlFile);
    }

}