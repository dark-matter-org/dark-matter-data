package org.dmd.util.parsing;

import org.dmd.dmc.types.IntegerVar;
import org.dmd.util.BooleanVar;

/**
 * The OptionDef class stores the definition of a command line option.
 */

public class OptionDef {

                                            // Used to set optionType
    public final int    STROPT      = 1;    // String option
    public final int    STRARROPT   = 2;    // Array of strings
    public final int    INTOPT      = 3;    // Integer option
    public final int    INTARROPT   = 4;    // Array of integer
    public final int    FLAGOPT     = 5;    // Flag option - Boolean

    // The name of the option
    public String  		optionName;
    
    // The option variable that will be altered with the option type is
    // specified on the command line
    public Object  		option;

    // Help text for the option.
    public String  		optionHelp;
    
    // The type of the option
    private OptionType	optionType;
    
    // Indicates if the option was found on the command line
    private boolean 	optionFound;

    public OptionDef(String name, BooleanVar var, String helpText) {
        init(name,var,helpText);
		optionType = OptionType.FLAG;
	}

    public OptionDef(String name, IntegerVar var, String helpText) {
        init(name,var,helpText);
		optionType = OptionType.INTEGER;
	}

    public OptionDef(String name, StringBuffer var, String helpText) {
        init(name,var,helpText);
		optionType = OptionType.STRING;
	}

    public OptionDef(String name, IntegerArrayList var, String helpText) {
        init(name,var,helpText);
		optionType = OptionType.INTEGERARRAY;
	}

    public OptionDef(String name, StringArrayList var, String helpText) {
        init(name,var,helpText);
		optionType = OptionType.STRINGARRAY;
	}
    
    void init(String name, Object var, String helpText){
        optionName = new String(name);
        option      = var;
        optionFound = false;
        optionHelp  = new String(helpText);
    }

    /**
      * If the option is a flag, this function sets it to true; otherwise, it has no effect.
      */
    public void exists()
    {
        optionFound = true;
        if (optionType == OptionType.FLAG){
            BooleanVar b = (BooleanVar) option;
            b.set(true);
        }
    }

    /**
     * Checks whether this option has been found by the command line.
     * @return boolean true if so
     */
    public boolean found() {
        return optionFound;
    }

    /**
      * Sets or adds to the variable associated with this option.
      */
    public void add(String str)
    {

        switch(optionType){
            case FLAG:
                // Error
            break;
            case INTEGER:
                IntegerVar i = (IntegerVar) option;
                i.set(str);
            break;
            case STRING:
                StringBuffer s = (StringBuffer) option;
                if (s.length() != 0)
                    s.delete(0,s.length());
                s.append(str);
            break;
            case INTEGERARRAY:
                IntegerArrayList ial = (IntegerArrayList) option;
                ial.add(Integer.valueOf(str));
            break;
            case STRINGARRAY:
                StringArrayList sal = (StringArrayList) option;
                sal.add(new String(str));
            break;
        }
    }

}

