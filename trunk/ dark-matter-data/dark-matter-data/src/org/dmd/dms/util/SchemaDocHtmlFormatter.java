package org.dmd.dms.util;

import java.util.*;
import java.io.*;

import org.dmd.dms.*;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.exceptions.ResultSet;
import org.dmd.util.parsing.Token;

/**
 * This class generates HTML from Data Model Definitions (DMD) stored in
 * an SchemaDefinition object.
 * <P>
 * Although DMD is readable text, it's not particularly easy to navigate in its
 * textual state. However, when presented in HTML format, the descriptions are
 * much more user friendly.
 */

public class SchemaDocHtmlFormatter {

    /**
     * The schema's classes sorted by name.
     * Key: String
     * Data: ClassDefinition
     */
    TreeMap<String,ClassDefinition> classes;

    /**
     * The schema's types sorted by name.
     * Key: String
     * Data: TypeDefinition
     */
    TreeMap<String,TypeDefinition> types;

    /**
     * The schema's attributes sorted by name.
     * Key: String
     * Data: AttributeDefinition
     */
    TreeMap<String,AttributeDefinition> attrs;

    /**
     * The schema's actions sorted by name.
     * Key: String
     * Data: ActionDefinition
     */
    TreeMap<String, ActionDefinition> actions;

    /**
     * A treemap used to sort various definitions.
     */
    TreeMap<String,DmsDefinition> util;

    /**
     * The global index of all definitions.
     * Key:   String (A-Z)
     * Value: TreeMap
     *
     * TreeMap...
     * Key:   String (uppercase of definition name)
     * Value: Token  (whose value is the mixed case definition name and the
     *                user data is an GenericObject - an IMD definition)
     */
    TreeMap<String,TreeMap<String,Token>>     index;

    /**
     * The string that stores the current index references, one for each letter
     * that has any definitions.
     */
    String      indexRefHTML;

    /**
     * The current HTML directory from the web server where the javadoc is available.
     */
    String      javaDir;

    /**
     * The current schema manager.
     */
    SchemaManager    schema;


    /**
     * The rule manager.
     */
    /**
     * TODO put the rule manager back in
     */
//    PmfRuleManager      rules;
    
    String organization;
    String schemaUser;
    String userEmail;

    /**
     * Constructs a new IMD HTML formatter.
     */
    public SchemaDocHtmlFormatter(String org, String user, String email){
        classes = new TreeMap<String,ClassDefinition>();
        types   = new TreeMap<String,TypeDefinition>();
        attrs   = new TreeMap<String,AttributeDefinition>();
        actions = new TreeMap<String,ActionDefinition>();
        util    = new TreeMap<String,DmsDefinition>();
        schema  = null;
        
        organization = org;
        schemaUser = user;
        userEmail = email;
//        rules   = null;
    }

    /**
     * This dumps all the schema information in the specified schema manager to
     * a set of files in the specified directory.
     * @param sd The schema manager whose data is to be formatted.
     * @param src The source directory.
     * @param dir The directory to which we'll dump.
     * @param jd The javadoc diretory on the webserver.
     */
    public void dumpHtml(SchemaManager sd, String src, String dir, String jd){
//        public void dumpHtml(SchemaManager sd, PmfRuleManager r, String src, String dir, String jd){
        ResultSet   rs = new ResultSet();
        Iterator<SchemaDefinition>    it = null;

        schema  = sd;

        /**
         * TODO put rules back in
         */
//        rules   = r;
//        rules.initRules(rs);

        // Ensure that the schema references are resolved
        if (!schema.resolveSchemaRefs(rs)){
            System.out.println(rs);
        }

//        if (!rules.loadAllRules(rs,src)){
//            System.out.println(rs);
//        }
//
//        it = rules.allRules.values().iterator();
//        while(it.hasNext()){
//            BrfRule rule = (BrfRule)it.next();
//            System.out.println(rule.getRuleTitle() + "   " + rule.loadedFrom());
//        }

        javaDir = jd;

        generateIndex(dir);

        // System.out.println("Dumping " + dir + "/" + MetaSchemaAG.meta_metaSchema.getName() + ".shtml");
        it = schema.getSchemas();
        while(it.hasNext()){
            SchemaDefinition    s = (SchemaDefinition)it.next();
            System.out.println("Dumping " + dir + "/" + s.getName() + ".shtml");
            dumpHtml(s,dir + "/" + s.getName() + ".shtml");
        }

        dumpClassHierarchy(dir);

        dumpInstanceHierarchy(dir);

        dumpClassListing(dir);

    }

    /**
     * This dumps the specified schema definition in HTML format to the specified
     * file.
     * @param sd The schema to be formatted.
     * @param fn The file to which we'll dump.
     */
    void dumpHtml(SchemaDefinition sd, String fn){
        Iterator            it      = null;
        ClassDefinition         cd      = null;
        TypeDefinition          td      = null;
        AttributeDefinition     ad      = null;
        ActionDefinition        acd     = null;
        Iterator            entries = null;

        classes.clear();
        attrs.clear();
        actions.clear();
        types.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fn));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - The " + sd.getName() + " Schema Documentation </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> The " + sd.getName() + " Schema \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            out.write("<TABLE>\n");
            /*
            out.write("<TR WIDTH=100>\n");
            out.write("<TD CLASS=\"stronghead\"> Schema </TD>\n");
            out.write("<TD CLASS=\"pagetext\">");
            out.write(sd.getName() + "\n</TD>\n");
            out.write("</TR>\n");
            */
            out.write("<TR>\n");
            out.write("<TD VALIGN=TOP CLASS=\"stronghead\"> Description </TD>\n");
            out.write("<TD CLASS=\"pagetextUnjust\">\n");
            out.write(sd.getDescription());
            out.write("</TD> </TR> \n");

            if (sd.getSchemaPackage() != null){
                out.write("<TR>\n");
                out.write("<TD VALIGN=TOP CLASS=\"stronghead\"> Package </TD>\n");
                out.write("<TD CLASS=\"pagetextUnjust\">\n");
                String withSlashes = sd.getSchemaPackage().replace('.','/');
                out.write("<A HREF=\"" + javaDir + "/" + withSlashes + "/package-summary.html\"> " + sd.getSchemaPackage() + " </A>\n");
                out.write("</TD> </TR> \n");
            }

            if ( (it = sd.getDependsOn()) != null){
                TreeSet ts = new TreeSet();
                while(it.hasNext()){
                    ts.add(it.next());
                }
                out.write("<TR> <TD VALIGN=TOP CLASS=\"stronghead\"> " + "Depends on </TD>\n");
                out.write("<TD CLASS=\"pagetextUnjust\">\n");
                it = ts.iterator();

                while(it.hasNext()){
                    String s = (String)it.next();
                    out.write("<A HREF=\"" + s + ".shtml\"> " + s + "</A> <BR>\n");
                }
                out.write("</TD> </TR> \n");
            }

            out.write("</TABLE> <P>\n");
            // out.write();

            // out.write("</TABLE>");

            if ((it = sd.getTypeDefList()) != null){
                while(it.hasNext()){
                    td = ((TypeDefinition) it.next());
                    types.put(td.getName(),td);
                }
            }

            if ((it = sd.getAttributeDefList()) != null){
                while(it.hasNext()){
                    ad = ((AttributeDefinition) it.next());
                    attrs.put(ad.getName(),ad);
                }
            }

            if ((it = sd.getActionDefList()) != null){
                while(it.hasNext()){
                    acd = ((ActionDefinition) it.next());
                    actions.put(acd.getName(),acd);
                }
            }

            if ((it = sd.getClassDefList()) != null){
                while(it.hasNext()){
                    cd = ((ClassDefinition) it.next());
                    classes.put(cd.getName(),cd);
                }
            }

            out.write("<P CLASS=\"stronghead\">\nClass Index<BR>Total Classes: ");
            out.write(classes.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = classes.keySet().iterator();
            while(entries.hasNext()){
                cd = (ClassDefinition) classes.get(entries.next());
                out.write("<A HREF=\"#" + cd.getName() + "\"> " + cd.getName() + "</A> <BR>\n");
            }

            out.write("<P CLASS=\"stronghead\">\nAttribute Index<BR>Total Attributes: ");
            out.write(attrs.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = attrs.keySet().iterator();
            while(entries.hasNext()){
                ad = (AttributeDefinition) attrs.get(entries.next());
                out.write("<A HREF=\"#" + ad.getName() + "\"> " + ad.getName() + "</A> <BR>\n");
            }

            out.write("<P CLASS=\"stronghead\"> Action Index<BR>Total Actions: ");
            out.write(actions.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = actions.keySet().iterator();
            while(entries.hasNext()){
                acd = (ActionDefinition) actions.get(entries.next());
                out.write("<A HREF=\"#" + acd.getName() + "\"> " + acd.getName() + "</A> <BR>\n");
            }

            if (types.size() > 0){
                out.write("<P CLASS=\"stronghead\">\nType Index<BR>Total Types: ");
                out.write(types.size() + "\n<P CLASS=\"pagetext\">\n");
                entries = types.keySet().iterator();
                while(entries.hasNext()){
                    td = (TypeDefinition) types.get(entries.next());
                    out.write("<A HREF=\"#" + td.getName() + "\"> " + td.getName() + "</A> <BR>\n");
                }
            }

            this.formatClasses(sd,out);

            this.formatAttributes(sd,out);

            this.formatActions(sd,out);

            this.formatTypes(sd,out);

            out.write(getFooter(sd.getName() + ".shtml"));

            out.write("</TD> </TR> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each class definition.
     */
    private void formatClasses(SchemaDefinition currSchema, BufferedWriter out){
        Iterator            entries = classes.keySet().iterator();
        ClassDefinition         cd      = null;
        Iterator            it      = null;
        AttributeDefinition     ad;

        if (classes.size() == 0)
            return;

        try{
            out.write("<P CLASS=\"stronghead\">\nClass Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                cd = (ClassDefinition) classes.get(entries.next());
                out.write("<TR> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </TR>\n");

                out.write("<TR> <TD WIDTH=100 CLASS=\"stronghead\"> Class </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + cd.getName() + "\">" +  cd.getName() + "</A>\n");
                if (cd.getAbbrev() != null){
                    out.write(" (" + cd.getAbbrev() + ")");
                }
                out.write("</TD></TR><TR>\n");

                if (cd.getJavaClass() != null){
                    out.write("<TR> <TD  CLASS=\"pagetextUnjust\"> Java Class </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    String withSlashes = cd.getJavaClass().replace('.','/');
                    out.write("<A HREF=\"" + javaDir + "/" + withSlashes + ".html\"> " + cd.getJavaClass() + " </A>\n");
                    out.write("</TD></TR><TR>\n");
                }

                out.write("<TR> <TD  CLASS=\"pagetextUnjust\"> Class Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write(cd.getClassType() + "\n");
//                out.write(MetaSchemaAG.meta_CLASSTYPEE.getEnumValue(cd.getClassType()) + "\n");
                out.write("</TD></TR><TR>\n");

                out.write("<TR> <TD  CLASS=\"pagetext\"> Data Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write(cd.getDataType() + "\n");
                out.write("</TD></TR><TR>\n");

                if (cd.getReposName() != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Repository Name </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(cd.getReposName() + "\n");
                    out.write("</TD></TR><TR>\n");
                }

                if (cd.getDerivedFrom() != null){
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Derived from </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    if (cd.getDerivedFrom().getDefinedIn() == currSchema)
                        out.write("<A HREF=\"#" + cd.getDerivedFrom().getName() + "\">" +  cd.getDerivedFrom().getName() + "</A> \n");
                    else
                        out.write("<A HREF=\"" + cd.getDerivedFrom().getDefinedIn().getName() + ".shtml" + "#" + cd.getDerivedFrom().getName() + "\">" +  cd.getDerivedFrom().getName() + "</A> \n");
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = cd.getImplements()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Implements </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if (cd.getAllImplementors() != null) {
                    it = cd.getAllImplementors().iterator();
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Implementors </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = cd.getDerivedClasses()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Derived classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = cd.getMust()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Must have </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = cd.getMay()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> May have </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = cd.getAction()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Actions </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + cd.getDescription() + "\">" +  cd.getDescription() + "</A>\n");
                out.write("</TD></TR><TR>\n");

            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each attribute definition.
     */
    private void formatAttributes(SchemaDefinition currSchema, BufferedWriter out){
        Iterator            entries = attrs.keySet().iterator();
        AttributeDefinition     ad      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nAttribute Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                ad = (AttributeDefinition) attrs.get(entries.next());
                out.write("<TR> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </TR>\n");
                out.write("<TR> <TD CLASS=\"stronghead\"> Attribute </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getName() + "\">" +  ad.getName() + "</A>\n");
                if (ad.getAbbrev() != null){
                    out.write(" (" + ad.getAbbrev() + ")");
                }
                out.write("</TD></TR><TR>\n");

                out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                
                Boolean mv = ad.getIsMultiValued();
                if ( (mv != null) && (mv == true) )
                    out.write("Multi-valued ");
                else
                    out.write("Single-valued ");

                out.write("<A HREF=\"" +  ad.getType().getDefinedIn().getName() + ".shtml#" +  ad.getType().getName() + "\">" +  ad.getType().getName() + "</A>\n");
                out.write("</TD></TR><TR>\n");

                out.write("<TR> <TD  CLASS=\"pagetext\"> Data Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write(ad.getDataType() + "\n");
                out.write("</TD></TR><TR>\n");

                if (ad.getReposName() != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Repository Name </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(ad.getReposName() + "\n");
                    out.write("</TD></TR><TR>\n");
                }

                if (ad.usedByClasses != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Used In Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.usedByClasses.size(); i++)
                        out.write(defLink((ClassDefinition)ad.usedByClasses.get(i),null) + " ");
                    out.write("\n</TD></TR><TR>\n");
                }

                if (ad.usedByActions != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Used In Actions </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.usedByActions.size(); i++)
                        out.write(defLink((ActionDefinition)ad.usedByActions.get(i),null) + " ");
                    out.write("\n</TD></TR><TR>\n");
                }

                out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getDescription() + "\">" +  ad.getDescription() + "</A>\n");
                out.write("</TD></TR><TR>\n");
            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each attribute definition.
     */
    private void formatActions(SchemaDefinition currSchema, BufferedWriter out){
        Iterator        entries = actions.keySet().iterator();
        ActionDefinition    ad      = null;
        Iterator        it      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nAction Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                ad = (ActionDefinition) actions.get(entries.next());
                out.write("<TR> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </TR>\n");
                out.write("<TR> <TD CLASS=\"stronghead\"> Action </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getName() + "\">" +  ad.getName() + "</A>\n");
                out.write("</TD></TR><TR>\n");

                if ((it = ad.getMustParm()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Must parms </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if ((it = ad.getMayParm()) != null){
                    Iterator sorted = sort(it);
                    out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> May parms </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></TR><TR>\n");
                }

                if (ad.usedByClasses != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Used In Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.usedByClasses.size(); i++)
                        out.write(defLink((ClassDefinition)ad.usedByClasses.get(i),null) + " ");
                    out.write("\n</TD></TR><TR>\n");
                }

                if (ad.attachedToClasses != null){
                    out.write("<TR> <TD  CLASS=\"pagetext\"> Attached To Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.attachedToClasses.size(); i++)
                        out.write(defLink((ClassDefinition)ad.attachedToClasses.get(i),null) + " ");
                    out.write("\n</TD></TR><TR>\n");
                }

                out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getDescription() + "\">" +  ad.getDescription() + "</A>\n");
                out.write("</TD></TR><TR>\n");
            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each type definition.
     */
    private void formatTypes(SchemaDefinition currSchema, BufferedWriter out){
        Iterator        entries = types.keySet().iterator();
        TypeDefinition      td      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nType Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                td = (TypeDefinition) types.get(entries.next());
                out.write("<TR> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </TR>\n");
                out.write("<TR> <TD CLASS=\"stronghead\"> Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + td.getName() + "\">" +  td.getName() + "</A>\n");
                out.write("</TD></TR><TR>\n");

                out.write("<TR> <TD CLASS=\"pagetext\" VALIGN=TOP> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + td.getDescription() + "\">" +  td.getDescription() + "</A>\n");
                out.write("</TD></TR><TR>\n");

                // TODO need to dump the enum definitions separately
                
//                if (BooleanVar.equals(true,td.getIsEnumType())){
//                    out.write("<TR>\n");
//                    out.write("<TD VALIGN=TOP CLASS=\"pagetext\"> Values </TD>");
//                    out.write("<TD>\n");
//
//                    Iterator it = td.getEnumTreeMap().values().iterator();
//
//                    if (it != null){
//                        out.write("<TABLE>\n");
//                        while(it.hasNext()){
//                            DmdEnumValueDef evd = (DmdEnumValueDef)it.next();
//                            out.write("<TR>");
//                            out.write("<TD VALIGN=TOP> " + evd.getEnumString() + " </TD>\n");
//                            out.write("<TD VALIGN=TOP> " + evd.getEnumInt().longValue() + " </TD>\n");
//                            out.write("<TD> " + evd.getDescription() + " </TD>\n");
//                            out.write("</TR>");
//                        }
//                        out.write("</TABLE>\n");
//                    }
//
//                    out.write("</TD>\n");
//                    out.write("</TR>\n");
//                }
            }
            out.write("</TABLE>\n\n");

        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Sorts generic objects - schema definitions on the basis of their names.
     */
    public Iterator<DmsDefinition> sort(Iterator<DmsDefinition> it){
        util = new TreeMap<String,DmsDefinition>();
        while(it.hasNext()){
        	
        	DmsDefinition    go = (DmsDefinition)it.next();
            util.put(go.getName(),go);
        }
        return(util.values().iterator());
    }

    /**
     * Formats a table of generic objects.
     * @param it An iterator over a set of generic objects (definitions)
     * @param size The number of elements in the iterator.
     * @param cols The number of columns in the table.
     */
    public String formatTable(Iterator<DmsDefinition> it, int size, int cols){
        int curr    = 1;
        StringBuffer    sb = new StringBuffer();

        sb.append("<TABLE>\n");
        sb.append("<TR>\n");
        while(it.hasNext()){
        	DmsDefinition go = it.next();
            sb.append("  <TD CLASS=\"pagetextUnjust\">\n");
            SchemaDefinition sd = go.getDefinedIn();
            
//            DmdTypeSCHEMAREF ref = (DmdTypeSCHEMAREF)go.getAttr(MetaSchemaAG._definedIn);
//            DmdObjRefValue   val = (DmdObjRefValue)ref.getSV();
            
            sb.append("<A HREF=\"" + sd.getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n");
//            sb.append("<A HREF=\"" + val.getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n");
//            sb.append("<A HREF=\"" + go.getAttr(MetaSchemaAG.meta_definedIn).getDmdObjRef().obj().getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n");
            sb.append("  </TD>\n");
            if ((curr % cols) == 0){
                if (curr < size)
                    sb.append("</TR>\n<TR>\n");
            }
            curr++;
        }
        sb.append("</TR>\n</TABLE>\n");

        return(sb.toString());
    }

    public void generateIndex(String dir){
        Iterator        it  = null;
        StringBuffer    sb  = new StringBuffer();
        initIndex();

        it = schema.allDefs.keySet().iterator();
        while(it.hasNext()){
            String  key         = ((String)it.next());
            String  firstChar   = key.substring(0,1).toUpperCase();
            TreeMap charTree    = (TreeMap)index.get(firstChar);

            charTree.put(key.toUpperCase(), new Token(key,0,schema.allDefs.get(key)));
        }

        // Generate the index reference header in HTML format - this will be
        // placed at the top of each index page.
        sb.append("<P> <HR SIZE=3 NOSHADE>");
        sb.append("<TABLE>\n");
        sb.append("<TR> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"index-allSchemas.shtml\"> Schema Summary </A></TD><TD></TD> </TR>\n");
        sb.append("<TR> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"classHierarchy.shtml\"> Class Hierarchy </A></TD><TD></TD> </TR>\n");
        sb.append("<TR> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"instanceHierarchy.shtml\"> Instance Hierarchy </A></TD><TD></TD> </TR>\n");
        sb.append("<TR> <TD CLASS=\"pagetextUnjust\"> Definitions Index </TD> <TD>\n");

        it = index.keySet().iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            TreeMap     tm = (TreeMap) index.get(key);
            String      fn = new String(dir + "/" + "index-" + key + ".shtml");

            if (tm.size() > 0){
                sb.append("<A HREF=\"index-" + key + ".shtml\">" + key + "</A> \n");
            }
            else{
                sb.append(key + "  ");
            }
        }
        sb.append("</TD> </TR> </TABLE> <HR SIZE=3 NOSHADE> <P>\n");
        indexRefHTML = sb.toString();

        // Generate the schema summary
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/index-allSchemas.shtml"));

            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("<TITLE> " + organization + " - Schema Summary </TITLE>\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR>\n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");

            out.write("<TD>\n\n");

            out.write("<P CLASS=\"pagehead\">" + organization + " Schema Summary\n");
            out.write(indexRefHTML);
            // out.write("<H2> Schema Summary </H2> <P>");

            out.write("<TABLE>\n");

            it = schema.getSchemas();
            while(it.hasNext()){
                SchemaDefinition sd = (SchemaDefinition)it.next();

                out.write("<TR> <TD VALIGN=TOP CLASS=\"pagetextUnjust\">\n");
                out.write(schemaLink(sd));
                out.write("</TD> <TD CLASS=\"pagetextUnjust\">\n");
                out.write(sd.getDescription());
                out.write("</TD> </TR>");
            }

            out.write("</TABLE>");

            out.write("</TD> </TR> </TABLE>");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }


        it = index.keySet().iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            TreeMap     tm = (TreeMap) index.get(key);
            String      fn = new String(dir + "/" + "index-" + key + ".shtml");

            if (tm.size() > 0){
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(fn));
                    Iterator defsIt = tm.values().iterator();

                    System.out.println("Generating index - " + fn);

                    out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
                    out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
                    out.write("<HTML>\n");
                    out.write("<HEAD>\n");
                    out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
                    out.write("<TITLE> " + organization + " - Schema Definitions Starting With The Letter - " + key + "</TITLE>\n");
                    out.write("</HEAD>\n");
                    out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

                    // The whole page is in a table
                    out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

                    out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
                    out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");

                    out.write("<TD>\n\n");
                    out.write(indexRefHTML);
                    out.write("<H1> - " + key + " - </H1> <P>");

                    out.write("<TABLE>\n");

                    while(defsIt.hasNext()){
                        Token               t  = (Token)defsIt.next();
                        DmsDefinition    go = (DmsDefinition) t.getUserData();

                        out.write("<TR> <TD VALIGN=TOP>\n");

                        if (go instanceof AttributeDefinition){
                            AttributeDefinition ad = (AttributeDefinition)go;
                            if (schema.attrAbbrevs.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the abbreviated name of the " + defLink(ad,null) + " attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
                            }
                            else if (schema.reposNames.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the repository name of the " + defLink(ad,null) + " attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
                            }
                            else{
                                out.write(defLink(go,null) + "</TD> <TD>\n");
                                out.write(" an attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
                            }
                        }
                        else if (go instanceof ClassDefinition){
                            ClassDefinition cd = (ClassDefinition)go;
                            if (schema.attrAbbrevs.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the abbreviated name of the " + defLink(cd,null) + " class from the " + schemaLink(cd.getDefinedIn()) + " schema");
                            }
                            else if (schema.reposNames.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the repository name of the " + defLink(cd,null) + " class from the " + schemaLink(cd.getDefinedIn()) + " schema");
                            }
                            else{
                                out.write(defLink(go,null) + "</TD> <TD>\n");
                                out.write(" a class from the " + schemaLink(cd.getDefinedIn()) + " schema");
                            }
                        }
                        else if (go instanceof ActionDefinition){
                            ActionDefinition acd = (ActionDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" an action from the " + schemaLink(acd.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof TypeDefinition){
                            TypeDefinition td = (TypeDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" a type from the " + schemaLink(td.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof EnumDefinition){
                        	EnumDefinition evd = (EnumDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" an enum definition from the " + schemaLink(evd.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof SchemaDefinition){
                            SchemaDefinition sd = (SchemaDefinition)go;
                            out.write(schemaLink(sd) + "</TD> <TD>\n");
                            out.write(" the " + schemaLink(sd) + " schema");
                        }

                        out.write("\n</TD> </TR>\n");

                    }

                    out.write("</TABLE>");

                    out.write("</TD> </TR> </TABLE>");
                    out.write("</BODY>\n");
                    out.write("</HTML>\n");

                    out.close();
                } catch (IOException e) {
                    System.out.println("IO Error:\n" + e);
                }

            } // End size test
        }
    }

    /**
     * This function dumps the class derivation hierarchy. Basically, if a
     * class has derived classes (but no derivedFrom class) it will be
     * dumped.
     * @param dir The output directory.
     */
    void dumpClassHierarchy(String dir){
        Iterator            it      = null;
        ClassDefinition         cd      = null;

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/classHierarchy.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - The Schema Class Derivation Hierarchy </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> The Schema Class Derivation Hierarchy \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            it = schema.classDefs.values().iterator();
            while(it.hasNext()){
                cd = (ClassDefinition)it.next();

                if (cd.getDerivedClasses() != null){
                    // We have derived classes, but are we the base class of
                    // the whole works?
                    if (cd.getDerivedFrom() == null){
                        // Ain't nothin' above us, so we are the base of the base!
                        classes.put(cd.getName(),cd);
                    }
                }
            }

            formatClassHierarchy(classes.values().iterator(),classes.size(),out);

            out.write("</TD> </TR> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * This function dumps all of the classes. if the class has a prodDescr
     * attribute, it is dumped as well.
     * @param dir The output directory.
     */
    void dumpClassListing(String dir){
        Iterator<ClassDefinition>            it      = null;
        ClassDefinition         cd      = null;

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/classListing.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - Class Listing </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> Class Listing \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            it = schema.classDefs.values().iterator();
            while(it.hasNext()){
                cd = it.next();

                classes.put(cd.getName(),cd);
            }

            formatClassList(classes.values().iterator(),classes.size(),out);

            out.write("</TD> </TR> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats a nested set of derived classes
     */
    void formatClassList(Iterator it, int size, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
        Iterator            sub = null;
        try{
            out.write("<UL>");
            for(int i=0; i<size; i++){
                ClassDefinition cd = (ClassDefinition)it.next();
//                ga = cd.getAttr(MetaSchemaAG._description);
                String description = cd.getDescription();

                if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
//                    if (DmdClassTypeEnumAG.isSTRUCTURAL(cd.getClassType().intValue())){
                    if (description == null){
                        out.write("<LI TYPE=\"circle\"> " + cd.getName() + "</LI>\n");
                    }
                    else{
//                        out.write("<LI TYPE=\"circle\"> " + cd.getName() + " - " + ga.getString() + "</LI>\n");
                        out.write("<LI TYPE=\"circle\"> " + cd.getName() + " - " + description + "</LI>\n");
                    }
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * This function dumps the class instance hierarchy. Basically, if a
     * class has any class that indicate that it is an allowedParent, the
     * class and it allowed subcomponents are dumped.
     * @param dir The output directory.
     */
    void dumpInstanceHierarchy(String dir){
        Iterator            it      = null;
        ClassDefinition         cd      = null;

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/instanceHierarchy.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> Class Instance Hierarchy </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> The Class Instance Hierarchy \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            it = schema.classDefs.values().iterator();
            while(it.hasNext()){
                cd = (ClassDefinition)it.next();

                if (cd.getAllowedSubcomps() != null){
                    // We have subcomponent classes, but are we a top level object
                    if (cd.getAllowedParents() == null){
                        // Ain't nothin' above us, so we are top level
                        classes.put(cd.getName(),cd);
                    }
                }
            }

            formatInstanceHierarchy(null,classes.values().iterator(),out);

            out.write("<TD> </TR> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * This function dumps information about the datatype of each class i.e.
     * whether it's persistent, cached, transient etc.
     * @param dir The output directory.
     */
    void dumpDataTypeInfo(String dir){
        Iterator            it      = null;
        ClassDefinition         cd      = null;
        ArrayList           trans       = new ArrayList();
        ArrayList           persistent  = new ArrayList();
        ArrayList           other       = new ArrayList();

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/dataTypeInfo.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - Class Data Types </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <TR> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> Class Data Types \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            it = schema.classDefs.values().iterator();
            while(it.hasNext()){
                cd = (ClassDefinition)it.next();

                if (cd.getAllowedSubcomps() != null){
                    // We have subcomponent classes, but are we a top level object
                    if (cd.getAllowedParents() == null){
                        // Ain't nothin' above us, so we are top level
                        classes.put(cd.getName(),cd);
                    }
                }
            }

            formatInstanceHierarchy(null,classes.values().iterator(),out);

            out.write("<TD> </TR> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats a nested set of derived classes
     */
    void formatClassHierarchy(Iterator<ClassDefinition> it, int size, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
//        Iterator            sub = null;
        
        try{
            out.write("<UL>");
            for(int i=0; i<size; i++){
                ClassDefinition cd = it.next();
                
                Iterator<ClassDefinition> dcit = cd.getDerivedClasses();

                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");
         
//                if ((ga = cd.getAttr(MetaSchemaAG._derivedClasses)) != null){
                if (cd.getDerivedClasses() != null){
//                    formatDerivedClassHierarchy(cd.getDerivedClasses(),ga.size(),out);
                    formatDerivedClassHierarchy(cd.getDerivedClasses(),out);
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

//    void formatDerivedClassHierarchy(Iterator<ClassDefinition> it, int size, BufferedWriter out){
    void formatDerivedClassHierarchy(Iterator<ClassDefinition> it, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
//        Iterator            sub = null;
        try{
            out.write("<UL>");
//            for(int i=0; i<size; i++){
            while(it.hasNext()){
                ClassDefinition cd = it.next();
                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");
                
                if (cd.getDerivedClasses() != null){
                    formatDerivedClassHierarchy(cd.getDerivedClasses(),out);
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats a nested set of derived classes
     */
    void formatInstanceHierarchy(ClassDefinition parent, Iterator<ClassDefinition> it, BufferedWriter out){
//        Iterator            sub = null;
        try{
            out.write("<UL>");
            while(it.hasNext()){
                ClassDefinition cd = it.next();
                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");

                // We check if this class is the same as the parent class in the
                // hierarchy i.e. that this type of object can be created beneath
                // itself - if so, we DON'T recurse.
                if ((cd != parent) && (cd.getAllowedSubcomps() != null)){
                    formatInstanceHierarchy(cd,cd.getAllowedSubcomps().values().iterator(),out);
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    void initIndex(){
        index = new TreeMap();

        index.put(new String("0"),new TreeMap());
        index.put(new String("1"),new TreeMap());
        index.put(new String("2"),new TreeMap());
        index.put(new String("3"),new TreeMap());
        index.put(new String("4"),new TreeMap());
        index.put(new String("5"),new TreeMap());
        index.put(new String("6"),new TreeMap());
        index.put(new String("7"),new TreeMap());
        index.put(new String("8"),new TreeMap());
        index.put(new String("9"),new TreeMap());
        index.put(new String("A"),new TreeMap());
        index.put(new String("B"),new TreeMap());
        index.put(new String("C"),new TreeMap());
        index.put(new String("D"),new TreeMap());
        index.put(new String("E"),new TreeMap());
        index.put(new String("F"),new TreeMap());
        index.put(new String("G"),new TreeMap());
        index.put(new String("H"),new TreeMap());
        index.put(new String("I"),new TreeMap());
        index.put(new String("J"),new TreeMap());
        index.put(new String("K"),new TreeMap());
        index.put(new String("L"),new TreeMap());
        index.put(new String("M"),new TreeMap());
        index.put(new String("N"),new TreeMap());
        index.put(new String("O"),new TreeMap());
        index.put(new String("P"),new TreeMap());
        index.put(new String("Q"),new TreeMap());
        index.put(new String("R"),new TreeMap());
        index.put(new String("S"),new TreeMap());
        index.put(new String("T"),new TreeMap());
        index.put(new String("U"),new TreeMap());
        index.put(new String("V"),new TreeMap());
        index.put(new String("W"),new TreeMap());
        index.put(new String("X"),new TreeMap());
        index.put(new String("Y"),new TreeMap());
        index.put(new String("Z"),new TreeMap());
    }

    /**
     * Returns a link to the specified schema.
     */
    String schemaLink(SchemaDefinition sd){
        return(new String("<A HREF=\"" + sd.getName() + ".shtml\">" + sd.getName() + "</A> \n"));
    }

    /**
     * Returns a link to the specified definition.
     * @param go A definition passed as a generic object.
     * @param alias An alternate name for the definition; if provided, this is
     * used as the string in the reference.
     */
    String defLink(DmsDefinition go, String alias){
    	DmsDefinition def = (DmsDefinition)go;
    	SchemaDefinition sd = def.getDefinedIn();

        if (alias == null)
            return(new String("<A HREF=\"" + sd.getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n"));
        else
            return(new String("<A HREF=\"" + sd.getName() + ".shtml" + "#" + go.getName() + "\">" +  alias + "</A> \n"));
    }

    /**
     * Creates the standard footer.
     */
    String getFooter(String filename){
        StringBuffer sb = new StringBuffer();

        sb.append("<CENTER>\n");
        sb.append("<TABLE> <TR> <TD CLASS=\"smalltext\">\n");
        sb.append("URL: http://www.dark-matter-data.org<!--#echo var=\"DOCUMENT_URI\" -->\n");
        sb.append("<BR>\n");
        sb.append("Comments to: <A HREF=\"mailto:" + userEmail + "\">" + schemaUser + " </A>\n");
        sb.append("<BR>\n");
        sb.append("Modified:\n");
        sb.append("<!--#config timefmt=\"%B %d, %Y\" -->\n");
        sb.append("<!--#flastmod file=\"" + filename + "\" -->\n");
        sb.append("Copyright &#169;\n");
        sb.append("<!--#config timefmt=\"%Y\" -->\n");
        sb.append("<!--#flastmod file=\"" + filename + "\" -->\n");
        sb.append(organization +"\n");
        sb.append("</TD> </TR> </TABLE> \n");

        return(sb.toString());
    }

}



