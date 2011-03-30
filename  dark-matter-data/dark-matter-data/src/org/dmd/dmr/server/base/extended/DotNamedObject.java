//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dmr.server.base.extended;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.server.base.generated.dmw.DotNamedObjectDMW;
import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DotNamedObject extends DotNamedObjectDMW {

	protected DotNamedObject(DotNamedObjectDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
	public DotNamedObject(){
		super();
	}

	@Override
	public void resetParent(HierarchicObject newParent) throws ResultException, DmcValueException {

        if (getName() == null){
        	ResultException ex = new ResultException();
        	ex.addError("Missing value for dotName. You must set dotName on this object.");
        	throw(ex);
        }

        if (newParent == null){
    		this.setFQN(getName());
    		
    		if (parent != null)
    			parent.removeSubComponent(this);
    		
    		parent = newParent;
    	}
    	else{
    		// If the new parent isn't the same as our old parent, remove ourselves from
    		// the old parent (if it wasn't null)
    		if (newParent != parent){
    			if (parent != null)
    				parent.removeSubComponent(this);
    			
    			newParent.addSubComponent(this);
    		}
    		parent = newParent;
    		
    		// Rename ourselves based on the new parent
    		this.setFQN(parent.getFQN() + "." + getName());
//    		this.setParentFQN(parent.getFQN());
    	}
        
        Iterator<HierarchicObject> it = getSubComps();
        while(it.hasNext()){
        	it.next().resetParent(this);
        }
//        if (subcomps != null){
//        	for(int i=0; i<subcomps.size(); i++){
//        		subcomps.get(i).resetParent(this);
//        	}
//        }
	}

	@Override
	public void setParentObject(HierarchicObject p, boolean buildFQN) throws ResultException, DmcValueException {
        
        if ( (p != null) && (p.getFQN() == null)){
        	// The parent hasn't been properly initialized
        	ResultException ex = new ResultException();
        	ex.addErrorWithStack("The object being set as the parent hasn't been properly initialized. Ensure that its setParentObject() function has been called.",DebugInfo.getCurrentStack());
        	throw(ex);
        }
        
    	parent = p;
    	
    	if (!buildFQN)
    		return;

        if (getName() == null){
        	ResultException ex = new ResultException();
        	ex.addError("Missing value for dotName. You must set dotName on this object.");
        	throw(ex);
        }
        
    	if (parent == null){
    		this.setFQN(getName());
    	}
    	else{
    		this.setFQN(parent.getFQN() + "." + this.getName());
//    		this.setParentFQN(parent.getFQN());

    		parent.addSubComponent(this);
    	}
	}


}
