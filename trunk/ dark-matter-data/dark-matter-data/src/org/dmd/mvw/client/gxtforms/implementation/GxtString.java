package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.DmcAttribute;
import org.dmd.mvw.client.mvwforms.interfaces.FieldInstanceIF;

import com.extjs.gxt.ui.client.widget.form.TextField;

public class GxtString extends TextField<String >implements FieldInstanceIF {
	
	boolean mandatory;

	public GxtString(){
		mandatory = false;
	}

	@Override
	public void setLabel(String label){
		setFieldLabel(label);
	}

	@Override
	public void setMandatory(boolean mandatory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(DmcAttribute<?> value) {
		setValue(value.getSV().toString());
	}
	
	
}
