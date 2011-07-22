package org.dmd.mvw.client.mvw;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.event.shared.UmbrellaException;

/**
 * The MvwEventBus extends the usual SimpleEventBus to handle the incredibly annoying
 * behaviour of throwing an UmbrellaException when something goes wrong when calling
 * event handlers. The UmbrellaException concept is fine, since there could be multiple
 * exceptions thrown when an event is handled by multiple components, but, in actual
 * usage, you want to be able to easily see where an exception came from.
 * <p />
 * So, the MvwEventBus will catch the UmbrellaException and rethrow the first exception
 * it contains, which will usually make it obvious where things screwed up!
 */
public class MvwEventBus extends SimpleEventBus {
	
	public MvwEventBus(){
		super();
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		try{
			super.fireEvent(event);
		}
		catch(UmbrellaException umbrella){
			int index = 1;
			for(Throwable t: umbrella.getCauses()){
				System.out.println("EXCEPTION " + index + ":\n" + t.getMessage() + "\n" + extractTheStack(t) + "\n\n");
			}
		}
	}
	
	@Override
	public void fireEventFromSource(GwtEvent<?> event, Object source) {
		try{
			super.fireEventFromSource(event,source);
		}
		catch(UmbrellaException umbrella){
			int index = 1;
			for(Throwable t: umbrella.getCauses()){
				System.out.println("EXCEPTION " + index + ":\n" + extractTheStack(t) + "\n\n");
			}
		}
	}
	
    /**
     * A convenience function to extract the stack from an exception as a string.
     */
    private String extractTheStack(Throwable ex){
    	StringBuilder sb = new StringBuilder();
    	StackTraceElement[] elements =  ex.getStackTrace();
    	for(int i=0; i<elements.length; i++){
    		sb.append(elements[i].toString() + "\n");
    	}
        return(sb.toString());
    }


}
