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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpREF(TypeFormatter.java:184)
import java.io.Serializable;                                   // Marker for serializable - (TypeFormatter.java:167)
import org.dmd.core.DmcAttribute;                              // Used when retrieving the naming attribute - (TypeFormatter.java:168)
import org.dmd.core.DmcNamedObjectREF;                         // Our base type - (TypeFormatter.java:177)
import org.dmd.core.DmcObjectName;                             // Because we're a named object - (TypeFormatter.java:170)
import org.dmd.core.feedback.DMFeedbackSet;                    // To facilitate error handling - (TypeFormatter.java:169)
import org.dmd.core.interfaces.DmcInputStreamIF;               // To support serialization - (TypeFormatter.java:174)
import org.dmd.core.interfaces.DmcOutputStreamIF;              // To support serialization - (TypeFormatter.java:171)
import org.dmd.dms.shared.generated.dmo.ConcinnityDMO;         // The type of object we refer to - (TypeFormatter.java:173)
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;             // dark-matter core - (TypeFormatter.java:178)
import org.dmd.dms.shared.types.DefinitionName;                // The base type of our naming attribute - (TypeFormatter.java:176)
import org.dmd.dms.shared.types.DmcTypeDefinitionName;         // The type of our naming attribute - (TypeFormatter.java:175)


/**
 * The ConcinnityREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred manually
 * Generated from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpREF(TypeFormatter.java:189)
 */
@SuppressWarnings("serial")
public class ConcinnityREF extends DmcNamedObjectREF<ConcinnityDMO> implements Serializable {

    DmcTypeDefinitionName myName;

    /**
     * Default constructor.
     */
    public ConcinnityREF(){
        myName = null;
    }

    /**
     * Copy constructor.
     */
    public ConcinnityREF(ConcinnityREF original){
        myName = original.myName;
        object = original.object;
    }

    /**
     * Wrapper constructor.
     */
    public ConcinnityREF(ConcinnityDMO dmo){
        myName = (DmcTypeDefinitionName) dmo.getObjectNameAttribute();
        object = dmo;
    }

    /**
     * Sets our object.
     */
    @Override
    public void setObject(ConcinnityDMO o){
        object = o;
    }

    /**
     * Clones this reference.
     */
    public ConcinnityREF cloneMe(){
        ConcinnityREF rc = new ConcinnityREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DMFeedbackSet {
        if (myName == null);
            myName = new  DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        myName.set(n);
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
         return(myName);
    }

    @Override
    public DmcObjectName getObjectName(){
         return(myName.getSV());
    }

    public DefinitionName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        return(myName.getSV());
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
         myName.serializeIt(dos);
         // the object goes nowhere
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeDefinitionName) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
