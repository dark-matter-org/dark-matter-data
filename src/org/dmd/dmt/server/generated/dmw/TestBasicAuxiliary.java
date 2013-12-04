//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:706)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.enums.DataTypeEnum;            // For AUX base functionality - (BaseDMWGenerator.java:704)
import org.dmd.dms.generated.enums.ValueTypeEnum;           // For AUX base functionality - (BaseDMWGenerator.java:703)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class - (BaseDMWGenerator.java:1077)
import org.dmd.dmw.DmwWrapper;                              // Unnamed object wrapper - (BaseDMWGenerator.java:1159)



/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:708)
 */
public class TestBasicAuxiliary {

    public final static ClassDefinition _auxClass = org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicAuxiliary;
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10141,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2637)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__svString) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2655)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2665)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the svString attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2760)
    static public DmcAttribute<?> remSvString(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__svString);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2791)
    static public String getSvString(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2831)
    static public void setSvString(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__svString);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__svString,attr);
    }




}
