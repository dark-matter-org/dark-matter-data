package org.dmd.mvw.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.generated.dmo.MvwEventDMO;
import org.dmd.mvw.generated.dmw.MvwEventDMW;

abstract public class MvwEvent extends MvwEventDMW {

	public MvwEvent(MvwEventDMO eventDMO, ClassDefinition cd) {
		super(eventDMO,cd);
	}

}
