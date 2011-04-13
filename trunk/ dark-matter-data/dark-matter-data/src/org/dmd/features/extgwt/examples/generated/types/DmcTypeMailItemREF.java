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
package org.dmd.features.extgwt.examples.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.IntegerName;

import org.dmd.features.extgwt.examples.generated.types.MailItemREF;

import org.dmd.features.extgwt.examples.generated.dmo.MailItemDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MailItem
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMailItemREF extends DmcTypeNamedObjectREF<MailItemREF, IntegerName> {

    public DmcTypeMailItemREF(){
    
    }

    public DmcTypeMailItemREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MailItemREF getNewHelper(){
        return(new MailItemREF());
    }

    @Override
    protected IntegerName getNewName(){
        return(new IntegerName());
    }

    @Override
    protected String getDMOClassName(){
        return( MailItemDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MailItemDMO)
            return(true);
        return(false);
    }

    @Override
    protected MailItemREF typeCheck(Object value) throws DmcValueException {
        MailItemREF rc = null;

        if (value instanceof MailItemREF)
            rc = (MailItemREF)value;
        else if (value instanceof MailItemDMO)
            rc = new MailItemREF((MailItemDMO)value);
        else if (value instanceof String)
            rc = new MailItemREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MailItemREF, MailItemDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MailItemREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MailItemREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MailItemREF rc = new MailItemREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MailItemREF cloneValue(MailItemREF value){
        return(new MailItemREF(value));
    }



}
