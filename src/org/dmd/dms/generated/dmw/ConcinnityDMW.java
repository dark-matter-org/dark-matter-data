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


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1638)
import java.util.*;                           // To support access functions - (MetaGenerator.java:1611)
import org.dmd.dmc.*;                         // Basic dark-matter infrastructure - (MetaGenerator.java:1613)
import org.dmd.dmc.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1612)
import org.dmd.dms.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1619)
import org.dmd.dms.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dms.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)
import org.dmd.dmw.*;                         // Base wrapper capabilities - (MetaGenerator.java:1614)
import org.dmd.util.exceptions.*;             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)

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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1647)
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

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (ConcinnityDMO) obj;
        obj.setContainer(this);
    }

    public  ConcinnityDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2400)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2473)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1814)

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
