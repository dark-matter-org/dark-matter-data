package org.dmd.dmt.client.editors;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;
import org.dmd.dmt.shared.generated.types.adapters.TestBasicObjectFixedMVAdapter;

public class DMTBasicObjectField implements DmcPresentationIF {
	
	// Our Unique ID assigned by the tracker
	int								ID;

	// The thing that may be tracking our state of readiness
	DmcPresentationTrackerIF		tracker;

	// Our attribute value adapter that also contains the original value (if any)
	TestBasicObjectFixedMVAdapter 	tboAdapter;

	// A convenience handle to the adapter cast to an attribute
	DmcAttribute<?>					attribute;

	// This is only set if we're handling an indexed attribute, otherwise it's -1
	int								attrIndex;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	TestBasicObjectFixedDMO			initialValue;

	DmcObject						DMO;
	
	///////////////////////////////////////////////////////////////////////////
	// For testing purposes - 
	TestBasicObjectFixedDMO			displayedValue;
	

	public DMTBasicObjectField(){
		attrIndex = -1;

	}

	@Override
	public DmcAdapterIF getAdapter() {
		return(tboAdapter);
	}

	@Override
	public DmcObject getDMO() {
		return(DMO);
	}

	@Override
	public int getID() {
		return(ID);
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReady() {
		return(true);
	}

	@Override
	public void resetToExisting() {
		tboAdapter.resetToExisting();
		
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		tboAdapter 	= (TestBasicObjectFixedMVAdapter) adapter;
		attribute 	= (DmcAttribute<?>) adapter;
		setDisplayValue();
	}

	@Override
	public void setDMO(DmcObject dmo) {
		DMO = dmo;
	}

	@Override
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMandatory(boolean mandatory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReadOnly(boolean readonly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setToolTip(String tooltip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTracker(DmcPresentationTrackerIF t, int id) {
		tracker = t;
		ID = id;
	}

	@Override
	public void setValueIndex(int index) {
		attrIndex = index;
	}

	@Override
	public boolean valueChanged() {
		return(tboAdapter.valueChanged());
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public void setEnabled(boolean flag){
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Helper methods
	
	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() == null){
				displayedValue = null;
				initialValue = null;
			}
			else{
				displayedValue = (TestBasicObjectFixedDMO) attribute.getSV();
				initialValue = displayedValue;
			}
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null){
				displayedValue = null;
				initialValue = null;
			}
			else{
				displayedValue = (TestBasicObjectFixedDMO) attribute.getMVnth(attrIndex);
				initialValue = displayedValue;
			}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Testing methods to simulate user interaction
	
	public void showDisplayValue(){
		if (displayedValue == null)
			System.out.println("EMPTY");
		else
			System.out.println(displayedValue.toOIF());
	}
	
	public void setValue(TestBasicObjectFixedDMO newvalue){
		if (attrIndex >= 0){
			// we have an indexed attribute
			try {
				attribute.setMVnth(attrIndex, newvalue);
				displayedValue = newvalue;
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
				try {
					attribute.set(newvalue);
					displayedValue = newvalue;
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				throw(new IllegalStateException("Can't use setValue() on attribute of value type: " + attribute.getAttributeInfo().valueType));
			}
		}
	}
	
	public void addValue(TestBasicObjectFixedDMO newvalue){
		// Not supported at the moment
		throw(new IllegalStateException("addValue not implemented for attribute of value type: " + attribute.getAttributeInfo().valueType));
	}
	
	public void delValue(TestBasicObjectFixedDMO newvalue){
		// Not supported at the moment
		throw(new IllegalStateException("delValue not implemented for attribute of value type: " + attribute.getAttributeInfo().valueType));
	}

}
