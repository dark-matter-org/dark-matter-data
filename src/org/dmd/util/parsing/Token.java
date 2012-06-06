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

/**
 * The Token class is used to represent a string fragment and a
 * type designation. The type designation is usually assigned by
 * a parsing algorithm, such as that used in the Classifier
 * class; see the Classifier description for more details.
 * <P>
 * Token defines a set of constant properties that indicate basic token types.
 * If you wish to define your own identifiers for tokens, you should start at
 * Token.CUSTOM + 1.
 * @see org.dmd.util.parsing.Classifier
 */

public class Token {

    /**
     * EMPTY indicates an empty or unassigned token.
     */
    public final static int	EMPTY       = 0;
    /**
     * IGNORED indicates that the token should be ignored during parsing.
     */
    public final static int	IGNORED     = 1;

    /**
     * TEXT indicates that the token is just a piece of text as opposed to a number.
     */
    public final static int	TEXT        = 2;
    /**
     * QUOTEDTEXT indicates that the token represents a chunk of text that was enclosed
     * in double quotes.
     */
    public final static int	QUOTEDTEXT  = 3;
    /**
     * INTEGER indicates that the token is an integer.
     */
    public final static int	INTEGER     = 4;
    /**
     * FLOAT indicates that the token is an floating point number i.e. with
     * embedded decimal point.
     */
    public final static int	FLOAT       = 5;

    /**
     * DQUOTE indicates that the token is a double quote character. This is included
     * here to facilitate the representation of QUOTEDTEXT.
     */
    public final static int	DQUOTE      = 6;
    /**
     * CUSTOM is simply an indicator of where you should start assigning identifiers
     * to your own custom tokens. This prevents clashing of the identifier space.
     */
    public final static int	CUSTOM      = 7;

    /**
     * The token value.
     */
    private String  value;

    /**
     * The token's classification.
     */
    private int     type;

    /**
     * Additional information associated with the token.
     */
    private Object  userData;

    /**
     * The position of the token within a larger string, if known. Otherwise
     * this will be -1.
     */
    private int     position;

    /**
      * Creates a new token of the specified type.
      * @param v The string value of the token.
      * @param t The type indicator.
      */
    public Token(String v, int t) {
        value       = new String(v);
        type        = t;
        userData    = null;
        position    = -1;
    }

    /**
      * Creates a new token of the specified type.
      * @param v The string value of the token.
      * @param t The type indicator.
      * @param u The user data.
      */
    public Token(String v, int t, Object u) {
        value       = new String(v);
        type        = t;
        userData    = u;
        position    = -1;
    }

    /**
      * Creates a new token that's a copy of the supplied token.
      * @param t The existing token.
      */
    public Token(Token t) {
        value       = new String(t.value);
        type        = t.type;
        userData    = t.userData;
        position    = t.position;
    }

    /**
      * Returns the string value of the token.
      */
    public String getValue() {
        return(value);
    }

    /**
      * Returns the classified type of the token.
      */
    public int getType() {
        return(type);
    }

    /**
      * Returns the userdata associated with the token.
      */
    public Object getUserData() {
        return(userData);
    }

    /**
      * Sets the position.
      */
    public void setPos(int p){
        position = p;
    }

    /**
      * Sets the position.
      */
    public int getPos(){
        return(position);
    }

    /**
      * Sets the userdata.
      */
    public void setUserData(Object o){
        userData = o;
    }

    /**
      * Formats the token as a String. The format is <type> <value> \n
      */
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(type + " ");
        sb.append(value + "\n");

        return(new String(sb));
    }

    public boolean isKeyWord(){
    	if (type > CUSTOM)
    		return(true);
    	return(false);
    }
}
 
