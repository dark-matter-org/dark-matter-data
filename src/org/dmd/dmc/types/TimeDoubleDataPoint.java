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
package org.dmd.dmc.types;

import java.io.Serializable;
import java.util.Date;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.util.DateUtil;


/**
 * The TimeDataPoint class allows for the representation of a single data point
 * at a given point in time. 
 */
@SuppressWarnings("serial")
public class TimeDoubleDataPoint implements DmcMappedAttributeIF, Serializable {
	
	// The label
	Date 	date;
	
	// The value
//	int 	value;
	double 	value;
	 
	public TimeDoubleDataPoint(){
		date = null;
		value = 0;
	}
	
	public TimeDoubleDataPoint(TimeDoubleDataPoint original){
		date = original.date;
		value = original.value;
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception{
		dos.writeLong(date.getTime());
		dos.writeDouble(value);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception{
		date = new Date(dis.readLong());
		value = dis.readDouble();
	}
	 
	/**
	 * Constructs a new time data point.
	 * @param d The date.
	 * @param v The value.
	 * @throws DmcValueException
	 */
	public TimeDoubleDataPoint(Date d, int v){
		date = d;
		value = v;
	}
	
	/**
	 * Constructs a new integer data point.
	 * @param v The string representation of the value.
	 * @throws DmcValueException
	 */
	public TimeDoubleDataPoint(String v) throws DmcValueException {
		set(v);
	}
	
	/**
	 * Sets the value of the data point based on a date and a value in the form: YYYYMMDD:HHMMSS VALUE
	 * @param val The data point.
	 * @throws DmcValueException
	 */
	public void set(String val) throws DmcValueException {
		if (val == null){
			throw(new DmcValueException("null value passed to TimeDataPoint.set()"));
		}
		
		String v = val.trim();
		int space = v.lastIndexOf(" ");
		
		if (space == -1){
			throw(new DmcValueException("Incorrect number of tokens for an TimeDataPoint: " + v));
		}
		
		date = DateUtil.parse(v.substring(0,space));
		
		try{
//			value = Integer.parseInt(v.substring(space+1));
			value = Double.parseDouble(v.substring(space+1));
		}
		catch(NumberFormatException ex){
			throw(new DmcValueException("Invalid Y value for an TimeDataPoint: " + v.substring(space+1)));
		}
	}
	
	public Date getDate(){
		return(date);
	}
	
//	public int getValue(){
//		return(value);
//	}
	
	public double getValue(){
		return(value);
	}
	
	@Override
	public String toString(){
		return(DateUtil.formatComplete(date) + " " + value);
	}
	
	
	@Override
	public boolean equals(Object v){
		if (v instanceof TimeDoubleDataPoint){
			if (date.equals(((TimeDoubleDataPoint) v).date)){
				if (value == ((TimeDoubleDataPoint) v).value){
					return(true);
				}
			}
		}
		return(false);
	}

	@Override
	public Object getKey() {
		return(date);
	}

	@Override
	public String getKeyAsString() {
		return(DateUtil.formatComplete(date));
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		if (obj instanceof TimeDoubleDataPoint){
			TimeDoubleDataPoint other = (TimeDoubleDataPoint)obj;
			if (date.equals(other.date)){
				if (value == other.value)
					return(true);
			}
		}
		return false;
	}

}
