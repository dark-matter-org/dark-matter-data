//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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

import java.util.*;

import org.dmd.util.formatting.PrintfFormat;

/**
 * The TokenArrayList class extends ArrayList and provides an interface for
 * storing only Tokens.
 * @see org.dmd.util.parsing.Token
 */

@SuppressWarnings({ "serial", "unchecked" })
public class TokenArrayList extends ArrayList {

    /**
      * Default constructor.
      */
    public TokenArrayList() {
    }

    /**
      * Inserts the specified Token at the specified position in this list.
      */
    public void add(int index, Token element){
        super.add(index,element);
    }

    /**
      * Appends the specified Token to the end of this list.
      */
    public boolean add(Token element){
        return(super.add(element));
    }

    /**
      * Returns the nth Token in the array - this is a convenience function that
      * casts the result of the get() call to ArrayList superclass.
      */
    public Token nth(int i){
        return((Token)super.get(i));
    }

    /**
     * Formats the token list as a String.
     */
    public String toString(){
        PrintfFormat formatid = new PrintfFormat("%-6d");
        PrintfFormat formatud = new PrintfFormat("%-15s");
        StringBuffer    sb = new StringBuffer();

        sb.append("#     Type  Pos   UserData       \n");
        for(int i=0; i<size(); i++){
            Token t = (Token)get(i);
            sb.append(formatid.sprintf(i));
            sb.append(formatid.sprintf(t.getType()));
            sb.append(formatid.sprintf(t.getPos()));
            if (t.getUserData() == null)
                sb.append(formatud.sprintf("null"));
            else{
                String cn = t.getUserData().getClass().getName();

                sb.append(formatud.sprintf(cn.substring(cn.lastIndexOf(".")+1)));
            }
            sb.append(" " + t.getValue() + "\n");
        }
        return(sb.toString());
    }

}
 
