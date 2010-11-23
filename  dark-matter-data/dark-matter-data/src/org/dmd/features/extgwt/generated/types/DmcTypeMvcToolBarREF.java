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
package org.dmd.features.extgwt.generated.types;

import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.features.extgwt.generated.types.MvcToolBarREF;

import org.dmd.features.extgwt.generated.dmo.MvcToolBarDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcToolBar
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:298)
 */
@SuppressWarnings("serial")
public class DmcTypeMvcToolBarREF extends DmcTypeNamedObjectREF<MvcToolBarREF> {

    public DmcTypeMvcToolBarREF(){
    }

    @Override
    protected MvcToolBarREF getNewHelper(){
        return( new MvcToolBarREF());
    }

    @Override
    protected String getDMOClassName(){
        return( MvcToolBarDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvcToolBarDMO)
            return(true);
        return(false);
    }



}
