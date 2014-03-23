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
package org.dmd.dms.meta;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class TestMetaMain {

    public static void main(String[] args) {

    	try{
    		SchemaManager sm = new SchemaManager();
    		
    		DebugInfo.debug(sm.toString());
    		
//    		SchemaDocHtmlFormatter	formatter = new SchemaDocHtmlFormatter("Dark Matter Data", "Admin", "admin@dark-matter-data.org");
    		
    		// TODO: old stuff to be removed
//    		formatter.dumpHtml(sm, "NONE", "C:/Program Files/Apache Software Foundation/Apache2.2/htdocs/schema", "NONE");
    	}
    	catch(ResultException ex){
    		DebugInfo.debug(ex.toString());
    	} catch (DmcValueException e) {
			e.printStackTrace();
		} catch (DmcNameClashException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        System.exit(0);
    }

}
