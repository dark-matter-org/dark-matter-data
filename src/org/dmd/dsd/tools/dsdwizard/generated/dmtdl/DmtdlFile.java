package org.dmd.dsd.tools.dsdwizard.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                         // To store values - (Section.java:102)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DmtdlFile implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public DmtdlFile(){
    }

    /**
     * Constructs a new DmtdlFile section.
     * @param dslName_ The DSL name
     * @param package_ The package name of the DSL's html doc generator.
     * @param comment_ This is an embedded value that will be replaced by ::comment::
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public DmtdlFile(String dslName_, String package_, String comment_){
        if (dslName_ != null)
            values.put("dslName", dslName_);

        if (package_ != null)
            values.put("package", package_);

        if (comment_ != null)
            values.put("comment", comment_);

    }

    public DmtdlFile setDslName(String dslName_){
        if (dslName_ != null)
            values.put("dslName", dslName_);
        return(this);
    }

    public DmtdlFile setPackage(String package_){
        if (package_ != null)
            values.put("package", package_);
        return(this);
    }

    public DmtdlFile setComment(String comment_){
        if (comment_ != null)
            values.put("comment", comment_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {

        DsdwizardTemplateLoader.DmtdlFile.format(this,artifact, DsdwizardTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}