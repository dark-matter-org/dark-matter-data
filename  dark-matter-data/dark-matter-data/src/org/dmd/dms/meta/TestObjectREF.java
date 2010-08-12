package org.dmd.dms.meta;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;

public class TestObjectREF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DmcObject obj = new DmcObject();
		
		try {
			obj.set("classRef", DmcTypeClassDefREF.class, "someClass");
			
			System.out.println(obj.toOIF(10));
			
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
