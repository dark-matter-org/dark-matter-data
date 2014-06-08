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
// Called from: org.dmd.dms.tools.meta.TypeFormatter.dumpDmcType(TypeFormatter.java:57)
import java.io.Serializable;                                                        // Marker for serializable - (TypeFormatter.java:47)
import org.dmd.core.DmcObjectName;                                                  // Because we're a named object - (TypeFormatter.java:50)
import org.dmd.core.feedback.DMFeedbackSet;                                         // To facilitate error handling - (TypeFormatter.java:49)
import org.dmd.core.interfaces.DmcInputStreamIF;                                    // To support serialization - (TypeFormatter.java:54)
import org.dmd.core.interfaces.DmcOutputStreamIF;                                   // To support serialization - (TypeFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                                        // Required by DmcAttribute  - (TypeFormatter.java:48)
import org.dmd.dms.shared.generated.dmo.ExtendedReferenceTypeDefinitionDMO;         // The type of object we refer to - (TypeFormatter.java:53)
import org.dmd.dms.shared.types.DefinitionName;                                     // The type of our naming attribute - (TypeFormatter.java:55)
import org.dmd.dms.shared.types.DmcTypeNamedObjectREF;                              // Because we extend this - (TypeFormatter.java:52)


/**
 * The DmcTypeExtendedReferenceTypeDefinitionREF class.
 * This code was auto-generated by the MetaGen utility and shouldn't be alterred manually.
 * Generated from: org.dmd.dms.tools.meta.TypeFormatter.dumpDmcType(TypeFormatter.java:61)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeExtendedReferenceTypeDefinitionREF extends DmcTypeNamedObjectREF<ExtendedReferenceTypeDefinitionREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeExtendedReferenceTypeDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeExtendedReferenceTypeDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a ExtendedReferenceTypeDefinitionREF or ExtendedReferenceTypeDefinitionDMO.
     */
    public ExtendedReferenceTypeDefinitionREF typeCheck(Object value) throws DMFeedbackSet {
        ExtendedReferenceTypeDefinitionREF rc = null;
        if (value instanceof ExtendedReferenceTypeDefinitionREF)
            rc = (ExtendedReferenceTypeDefinitionREF)value;
        else if (value instanceof ExtendedReferenceTypeDefinitionDMO)
            rc = new ExtendedReferenceTypeDefinitionREF((ExtendedReferenceTypeDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new ExtendedReferenceTypeDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new ExtendedReferenceTypeDefinitionREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DMFeedbackSet("Object of class:" + value.getClass().getName() + " passed where a ExtendedReferenceTypeDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected ExtendedReferenceTypeDefinitionREF getNewHelper(){
        return( new ExtendedReferenceTypeDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ExtendedReferenceTypeDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ExtendedReferenceTypeDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public ExtendedReferenceTypeDefinitionREF cloneValue(ExtendedReferenceTypeDefinitionREF val){
        ExtendedReferenceTypeDefinitionREF rc = new ExtendedReferenceTypeDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ExtendedReferenceTypeDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ExtendedReferenceTypeDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ExtendedReferenceTypeDefinitionREF rc = new ExtendedReferenceTypeDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
