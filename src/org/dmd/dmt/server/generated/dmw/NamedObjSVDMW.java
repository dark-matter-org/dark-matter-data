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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class NamedObjSVDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public NamedObjSVDMW() {
        super(new NamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public NamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new NamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public NamedObjSVDMW getModificationRecorder(){
        NamedObjSVDMW rc = new NamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public NamedObjSVDMW(NamedObjSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    public NamedObjSVDMW cloneIt() {
        NamedObjSVDMW rc = new NamedObjSVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjSVDMO getDMO() {
        return((NamedObjSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected NamedObjSVDMW(NamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
    public ObjWithRefs getSvNamedObj(){
        ObjWithRefsREF ref = ((NamedObjSVDMO) core).getSvNamedObj();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * Sets the svNamedObj to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setSvNamedObj(ObjWithRefs value) {
        ((NamedObjSVDMO) core).setSvNamedObj(value.getDMO());
    }

    /**
     * Sets the svNamedObj to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setSvNamedObj(Object value) throws DmcValueException {
        ((NamedObjSVDMO) core).setSvNamedObj(value);
    }

    /**
     * Removes the svNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remSvNamedObj(){
        ((NamedObjSVDMO) core).remSvNamedObj();
    }


}
