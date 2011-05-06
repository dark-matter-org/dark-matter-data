package org.dmd.mvw.client.selectionmanager.generated.mvw.events;

// Generated from: Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:40)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

public class SingleDMOSelectedEvent extends GwtEvent<SingleDMOSelectedEventHandler> {

  public static Type<SingleDMOSelectedEventHandler> TYPE = new Type<SingleDMOSelectedEventHandler>();

  @Override
  public Type<SingleDMOSelectedEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(SingleDMOSelectedEventHandler handler) {
    handler.onSingleDMOSelected(this);
  }

}
