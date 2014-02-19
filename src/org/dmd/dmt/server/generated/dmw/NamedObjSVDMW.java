//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Is reference type REF - (BaseDMWGenerator.java:1115)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class NamedObjSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public NamedObjSVDMW() {
        super(new NamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public NamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new NamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public NamedObjSVDMW getModificationRecorder(){
        NamedObjSVDMW rc = new NamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected NamedObjSVDMW(NamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setSvNamedObj(ObjWithRefs value) {
        ((NamedObjSVDMO) core).setSvNamedObj(value.getDMO());
    }

    /**
     * Sets the svNamedObj to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setSvNamedObj(Object value) throws DmcValueException {
        ((NamedObjSVDMO) core).setSvNamedObj(value);
    }

    /**
     * Removes the svNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remSvNamedObj(){
        ((NamedObjSVDMO) core).remSvNamedObj();
    }


}
