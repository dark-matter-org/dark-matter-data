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
package org.dmd.dmc.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeDmcAttribute type is meant to allow you to refer to attributes from other attributes,
 * This may seem weird, but it allows for things like object naming; trust me, it's cool!
 * accept DmcObjects or a DmcContainerIF.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDmcAttribute extends DmcAttribute<DmcAttribute<?>> {
	
	/**
	 * Constructs a new Long attribute.
	 */
	public DmcTypeDmcAttribute(){
	}
	
	public DmcTypeDmcAttribute(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	protected DmcAttribute<?> typeCheck(Object value) throws DmcValueException {
		DmcAttribute<?> rc = null;
		
        if (value instanceof DmcAttribute<?>){
            rc = (DmcAttribute<?>)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcAttribute<?> expected."));
        }
        
        return(rc);
	}

	@Override
	protected DmcAttribute<?> cloneValue(DmcAttribute<?> original) {
		
		System.out.println("\n\n***\n\nAround and around we go... Haven't implemnted object cloning yet\n\n\n***\n\n\n");
		return null;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a DmcAttribute<?>.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, DmcAttribute<?> value) throws Exception {
    	value.serializeIt(dos);
    }

    /**
     * Read a DmcAttribute<?>.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public DmcAttribute<?> deserializeValue(DmcInputStreamIF dis) throws Exception {
    	DmcAttribute<?> rc = dis.getAttributeInstance();
    	rc.deserializeIt(dis);
    	return(rc);
    }


    
//    ////////////////////////////////////////////////////////////////////////////////
//	// OBSOLETE
//	
//	
//	@Override
//	public String getString() {
//		if (sv == null){
//			StringBuffer sb = new StringBuffer();
//			for (DmcAttribute<?> d : mv){
//				sb.append(d + ", ");
//			}
//			return(sb.toString());
//		}
//		else{
//			return(sv.toString());
//		}
//
//	}
//
////	@Override
////	protected DmcAttribute<?> getOneOfMe() {
////		return(new DmcTypeDmcAttribute());
////	}
//
//    /**
//     * This method may be overloaded to properly format attributes that refer directly
//     * to DmcObjects or that are object references.
//     */
//	@Override
//    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
////    	if (mv == null){
////    		sb.append(sv.toJSON());
////    	}
////    	else {
////    		int max = mv.size()-1;
////    		for(int i=0; i<mv.size(); i++){
////        		sb.append(mv.get(i).toJSON(padding,indent));
////        		if (i < max)
////        			sb.append(", \n");
////    		}
////    	}
//    }
//    
//    /**
//     * This method may be overloaded to properly format attributes that refer directly
//     * to DmcObjects or that are object references.
//     */
//	@Override
//    protected void formatValueAsCompactJSON(StringBuffer sb) {
////    	if (mv == null){
////    		sb.append(sv.toJSON());
////    	}
////    	else {
////    		int max = mv.size()-1;
////    		for(int i=0; i<mv.size(); i++){
//////        		sb.append(mv.get(i).toCompactJSON(sb));
////        		mv.get(i).toCompactJSON(sb);
////        		if (i < max)
////        			sb.append(",");
////    		}
////    	}
//    }
//    
//	////////////////////////////////////////////////////////////////////////////////
//	// Serialization
//	
//	@Override
//    public void serializeType(DmcOutputStreamIF dos) throws Exception {
//    	if (sv == null){
////			for (DmcObject d : mv){
////				
////			}
//    	}
//    	else{
////    		dos.writeUTF(sv);
//    	}
//    }
//	
//	@Override
//    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
////    	sv = dis.readUTF();
//    }
//
//	@Override
//    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
////    	mv.add(dis.readUTF());
//    }

}
