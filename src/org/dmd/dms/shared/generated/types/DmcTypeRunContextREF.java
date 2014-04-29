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
// Called from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpDmcType(TypeFormatter.java:57)
import java.io.Serializable;                                   // Marker for serializable - (TypeFormatter.java:47)
import org.dmd.core.DmcObjectName;                             // Because we're a named object - (TypeFormatter.java:50)
import org.dmd.core.feedback.DMFeedbackSet;                    // To facilitate error handling - (TypeFormatter.java:49)
import org.dmd.core.interfaces.DmcInputStreamIF;               // To support serialization - (TypeFormatter.java:54)
import org.dmd.core.interfaces.DmcOutputStreamIF;              // To support serialization - (TypeFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                   // Required by DmcAttribute  - (TypeFormatter.java:48)
import org.dmd.dms.shared.generated.dmo.RunContextDMO;         // The type of object we refer to - (TypeFormatter.java:53)
import org.dmd.dms.shared.types.DefinitionName;                // The type of our naming attribute - (TypeFormatter.java:55)
import org.dmd.dms.shared.types.DmcTypeNamedObjectREF;         // Because we extend this - (TypeFormatter.java:52)


/**
 * The DmcTypeRunContextREF class.
 * This code was auto-generated by the MetaGen utility and shouldn't be alterred manually.
 * Generated from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpDmcType(TypeFormatter.java:61)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRunContextREF extends DmcTypeNamedObjectREF<RunContextREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeRunContextREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeRunContextREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a RunContextREF or RunContextDMO.
     */
    public RunContextREF typeCheck(Object value) throws DMFeedbackSet {
        RunContextREF rc = null;
        if (value instanceof RunContextREF)
            rc = (RunContextREF)value;
        else if (value instanceof RunContextDMO)
            rc = new RunContextREF((RunContextDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new RunContextREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new RunContextREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DMFeedbackSet("Object of class:" + value.getClass().getName() + " passed where a RunContextREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected RunContextREF getNewHelper(){
        return( new RunContextREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( RunContextDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RunContextDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public RunContextREF cloneValue(RunContextREF val){
        RunContextREF rc = new RunContextREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RunContextREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RunContextREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RunContextREF rc = new RunContextREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
