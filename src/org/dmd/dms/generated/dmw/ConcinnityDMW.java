//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * When concinnity was conceived, it was conceived as a way of binding
 * knowledge across\n different domains. As the newer approach to generating
 * Domain Specific Definitions arose, it became\n easier to create DSLs for
 * different domains and I wanted concinnity to make use of those
 * mechanisms.\n However, to do that would have required significant changes
 * to the meta schema generator and a great\n deal of hacking. I wanted to be
 * able to refer to concinnity aspects from schema as well, so the\n
 * compromise is to place the base class for Concinnity in the meta schema
 * (so that reference attributes\n may refer to it). \n <p/>\n Mechanisms
 * exist to prevent any class other than ConcinnityDefinition from deriving
 * directly from\n Concinnity, so you can be guaranteed that down casting a
 * Concinnity reference will yield a ConcinnityDefinition. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1643)
 */
@SuppressWarnings("unused")
public abstract class ConcinnityDMW extends org.dmd.dms.DSDefinition {

    private ConcinnityDMO mycore;

    protected ConcinnityDMW() {
        super(new ConcinnityDMO());
        mycore = (ConcinnityDMO) core;
        mycore.setContainer(this);
    }

    protected ConcinnityDMW(DmcObject obj) {
        super(obj);
        mycore = (ConcinnityDMO) core;
        mycore.setContainer(this);
    }

    protected ConcinnityDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ConcinnityDMO) core;
        mycore.setContainer(this);
    }

    public  ConcinnityDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2390)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2463)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1804)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
