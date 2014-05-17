package org.dmd.util.parsing;

import java.util.ArrayList;

/**
 * The IntegerArrayList class is used to get around type erasure funnies with the OptionDef class.
 * <p>
 * See the following article for the explanation:
 * http://stackoverflow.com/questions/1998544/method-has-the-same-erasure-as-another-method-in-type
 */
@SuppressWarnings("serial")
public class IntegerArrayList extends ArrayList<Integer>{

}
