package org.dmd.test;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.*;

public class TestDmcObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DmcObject	obj	= new DmcObject();
		
		try {
			
			obj.set("attr1", DmcTypeString.class, "first value");
			obj.set("bool1", DmcTypeBoolean.class, 0);
			
			System.out.println(obj.toOIF());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
