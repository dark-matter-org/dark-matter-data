package org.dmd.util.parsing;

import java.util.HashMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.shared.types.IntegerVar;
import org.dmd.dms.shared.types.BooleanVar;

/**
 * The CommandLine class allows for the definition of arguments to an application
 * and the parsing of those arguments.
 */

public class CommandLine {

    private HashMap<String,OptionDef>    options;

    /**
     * Default constructor.
     */
    public CommandLine() {
         options = new HashMap<String,OptionDef>();
    }

    /**
     * This addOption method allows you to add the definition of a flag option to the commandline. If the option
     * is present on the commandline, the flag variable will be set to TRUE.
     * @param name          the option name i.e. the part that follows the - (dash)
     * @param var           the Boolean variable that stores the flag value
     * @param helpText      text that describes the meaning of the flag
     */
    public void addOption(String name, BooleanVar var, String helpText) {
        if (!options.containsKey(name)){
            options.put(name,new OptionDef(name,var,helpText));
        }
        else{
            System.out.println("Already have" + name);
        }
    }

    /**
     * Checks whether the given option has been found in the command line.
     * @param name String the option name
     * @return boolean true if so
     */
    public boolean optionFound(String name) {
        boolean found = false;
        OptionDef option = (OptionDef)options.get(name);
        if (option != null) {
            found = option.found();
        }
        return found;
    }

    /**
     * This addOption method allows you to add the definition of an option that specifies a list of strings e.g.
     * a list of file names.
     * @param name          the option name i.e. the part that follows the - (dash)
     * @param var           the string array that stores the values
     * @param helpText      text that describes the usage of the option
     */
    public void addOption(String name, StringArrayList var, String helpText) {
        if (!options.containsKey(name)){
            options.put(name,new OptionDef(name,var,helpText));
        }
        else{
            System.out.println("Already have" + name);
        }
    }

    /**
     * This addOption method allows you to add the definition of an option that specifies a single string.
     * @param name          the option name i.e. the part that follows the - (dash)
     * @param var           the string that stores the value
     * @param helpText      text that describes the usage of the option
     */
    public void addOption(String name, StringBuffer var, String helpText) {
        if (!options.containsKey(name)){
            options.put(name,new OptionDef(name,var,helpText));
        }
        else{
            System.out.println("Already have" + name);
        }
    }

    /**
     * This addOption method allows you to add the definition of an option that specifies a single integer.
     * @param name          the option name i.e. the part that follows the - (dash)
     * @param var           the string that stores the value
     * @param helpText      text that describes the usage of the option
     */
    public void addOption(String name, IntegerVar var, String helpText) {
        if (!options.containsKey(name)){
            options.put(name,new OptionDef(name,var,helpText));
        }
        else{
            System.out.println("Already have" + name);
        }
    }

    /**
     * Parses the argument vector and throws an exception if problems are found. Otherwise, populates the
     * appropriate arguments flags/variables.
     */
    public void parseArgs(String[] args) throws DMFeedbackSet {
        OptionDef od   = null;
        OptionDef prev = null;

        for (int i=0; i<args.length; i++) {
//            DebugInfo.debug("Arg " + i + " is " + args[i]);

            // See if the option has been specified
            if ((od = (OptionDef)options.get(args[i])) != null){
                // System.out.println("Arg " + args[i] + " is valid");

                // Indicate that the option exists
                od.exists();

//                DebugInfo.debug("option type is " + od.option.getClass().getName());

                prev = od;
            }
            else{
                // See if this was intended to be an option i.e. that it started with a - (dash)
                if (args[i].startsWith("-")){
                    throw(new DMFeedbackSet("Arg " + args[i] + " is invalid"));
                }
                else{
                    // This may be an argument to the option
                    if (prev != null){
                        prev.add(args[i]);
                    }
                    else{
                        // This is a floating argument with an option
                    }
                }
            }
        }

    }

//    /**
//     * Parses the argument vector and throws an exception if problems are found.
//     * Otherwise, populates the
//     * appropriate arguments flags/variables.
//     * @param rs Place to return errors
//     * @param args The argument vector.
//     * @return true if the arguments are valid and
//     */
//    public boolean parseArgs(ResultSet rs, String[] args){
//        OptionDef   od      = null;
//        OptionDef   prev    = null;
//        boolean     rc      = true;
//
//        for (int i=0; i<args.length; i++) {
//            // System.out.println("Arg " + i + " is " + args[i]);
//
//            // See if the option has been specified
//            if ((od = (OptionDef)options.get(args[i])) != null){
//                // System.out.println("Arg " + args[i] + " is valid");
//
//                // Indicate that the option exists
//                od.exists();
//
//                // System.out.println("option type is " + od.option.getClass().getName());
//
//                prev = od;
//            }
//            else{
//                // See if this was intended to be an option i.e. that it started with a - (dash)
//                if (args[i].startsWith("-")){
//                    rs.addResult(Result.ERROR,"Unknown option: " + args[i]);
//                    rc = false;
//                }
//                else{
//                    // This may be an argument to the option
//                    if (prev != null){
//                        prev.add(args[i]);
//                    }
//                    else{
//                        // This is a floating argument with an option
//                    }
//                }
//            }
//        }
//
//        return(rc);
//    }

}

