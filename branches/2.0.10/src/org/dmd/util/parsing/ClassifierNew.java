//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.util.parsing;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * The Classifier class takes an input string, breaks it into
 * tokens and classifies each token as either a basic token type
 * eg. (Token.TEXT, Token.INTEGER, Token.FLOAT) or as a
 * custom token type defined by the user. This approach is
 * especially useful when an entire line of input has to parsed
 * and checked against some allowable format.
 * @see org.dmd.util.parsing.Token
 * @see org.dmd.util.parsing.TokenArrayList 
 */

public class ClassifierNew {
    /**
     * This dictionary stores the tokens that are to be considered keywords
     * by the classifier.
     */
    private Dictionary         dict;

    /**
     * These are the additional characters that are to be treated as separators
     * during the parsing of the string. However, unlike our default whitespace
     * delimiters, these separators have an integer type associated with them.
     */
     private Dictionary        separators;

    /**
     * This string buffer is used to store the complete set of separators to
     * be used during parsing.
     */
     private StringBuffer       delimiters;

     /**
      * These are the default whitespace delimiters that we'll use to breakdown
      * the strings to be parsed.
      */
     private static String  defaultDelimiters = new String(" \t\r\n\f");

    /**
     * Default constructor.
     */
    public ClassifierNew() {
        dict = new Dictionary();
        separators = new Dictionary();
        delimiters = new StringBuffer(defaultDelimiters);
    }

    /**
     * Creates a new classifier that recognizes the tokens specified in the
     * given dictionary.
     * @param d The dictionary that contains keyword tokens.
     */
    public ClassifierNew(Dictionary d) {
        dict = d;
        separators = new Dictionary();
        delimiters = new StringBuffer(defaultDelimiters);
    }

    /**
     * Creates a new classifier that recognizes the tokens specified in the
     * given dictionary.
     * @param d The dictionary that contains keyword tokens.
     * @param useDefaults A flag that indicates whether or not we should use the
     * default delimiter characters ' ', \t \r \n \f when tokenizing a string. If
     * this flag is set to false, you should add your own seperator characters using
     * the addSeperator() method.
     */
    public ClassifierNew(Dictionary d, boolean useDefaults) {
        dict = d;
        separators = new Dictionary();

        if (useDefaults)
            delimiters = new StringBuffer(defaultDelimiters);
        else
            delimiters = new StringBuffer();
    }

    /**
     * Adds a new keyword to the classifier's dictionary.
     * <P>
     * The text should be 2 or more characters in length. If you want to recognize
     * a single character as a token, you should add it using the addSeparator()
     * method.
     * @param k The text to be recognized as a keyword.
     * @param i Its unique numeric identifier.
     * @return true if the keyword and its identifier are unique and false otherwise.
     */
    public boolean addKeyword(String k, int i) {
        return(dict.add(k,i));
    }
    
    /**
     * tries to find the keyword in our dictionary.
     * @param k the string to find.
     * @return true if it's a keyword and false otherwise.
     */
    public boolean isKeyWord(String k){
    	if (dict.find(k) == null)
    		return(false);
    	return(true);
    }

    /**
     * Adds a new separator to the classifier.
     * <P>
     * @param c A string containing a single character to be recognized as a separator.
     * @param i Its unique numeric identifier.
     * @return true if the separator and its identifier are unique and false otherwise.
     */
    public boolean addSeparator(String c, int i) {
        boolean rc = true;

        // System.out.println("*** addsep  " + c + "***\n\n");

        rc = separators.add(c,i);

        if (rc == true){
            if (i > dict.getMaxID())
                dict.setMaxID(i);
            delimiters.append(c);
        }

        return(rc);
    }

    /**
     * The classify function breaks down the specified string into tokens and
     * passes back an array of classified tokens.
     * @param s The string to be parsed.
     * @param returnSeps Set to true if the separators should be returned as tokens.
     */
    public ArrayList<Token> classify(String s, boolean returnSeps){
    	ArrayList<Token>  tokens      = new ArrayList<Token>();
        String          curr        = null;
        Token           sep         = null;
        Token           key         = null;

        // Indicates where the current token starts
        int             tokenPos    = 0;
        // The last token added to the token array.
        Token           lastToken   = null;

        // We create a string tokenizer, giving our complete set of delimiters
        // and tell it to return delimiters as tokens. We'll get rid of the
        // whitespace as we go.
        StringTokenizer st      = new StringTokenizer(s,delimiters.toString(),true);

        while(st.hasMoreTokens()){
            lastToken = null;
            curr = st.nextToken();
            key = dict.find(curr);
            if (curr.length() == 1){
                sep = separators.find(curr);
                if (Character.isWhitespace(curr.charAt(0))){
                    // System.out.println("white\n");
                    lastToken = null;
                }
                else if (sep != null){
                    // System.out.println("sep   " + curr + "\n");
                    if (returnSeps){
                        lastToken = new Token(sep);
                        tokens.add(lastToken);
                    }
                }
                else if (key != null){
                    // System.out.println("1key  " + curr + "\n");
                    lastToken = new Token(key);
                    tokens.add(lastToken);
                }
                else{
                    // System.out.println("text  " + curr + "\n");
                    lastToken = new Token(curr,this.getType(curr));
                    tokens.add(lastToken);
                }
            }
            else if (key != null){
                // System.out.println("key   " + curr + "\n");
                lastToken = new Token(key);
                tokens.add(lastToken);
            }
            else{
                // System.out.println("text  " + curr + "\n");
                lastToken = new Token(curr,this.getType(curr));
                tokens.add(lastToken);
            }

            if (lastToken == null){
                // We have a single seperator that we don't want returned
                tokenPos++;
            }
            else{
                // Set the start position of the last token
                lastToken.setPos(tokenPos);

                // Increase the position by the length of the last token token
                tokenPos += lastToken.getValue().length();
            }
        }

        return(tokens);
    }

    /**
     * Returns the basic type of a piece of text that isn't a separator or keyword.
     * @param s The string to be tested.
     * @returns INTEGER if the text represents and integer, FLOAT if it represents
     * a float and TEXT otherwise.
     */
     private int getType(String s){
        int rc = Token.TEXT;

        if (this.isInteger(s))
            rc = Token.INTEGER;
        else if (this.isFloat(s))
            rc = Token.FLOAT;

        return(rc);
     }

    /**
     * Checks to see if the specified string is an integer.
     * @param s The string to be tested.
     * @returns true if the string represents an integer and false otherwise
     */
     private boolean isInteger(String s){
        boolean rc = true;
        try {
            Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            rc = false;
        }
        return(rc);
     }

    /**
     * Checks to see if the specified string is a float value.
     * @param s The string to be tested.
     * @returns true if the string represents a float value and false otherwise
     */
     private boolean isFloat(String s){
        boolean rc = true;
        try {
            Float.parseFloat(s);
        }
        catch (NumberFormatException e) {
            rc = false;
        }
        return(rc);
     }

}
 
