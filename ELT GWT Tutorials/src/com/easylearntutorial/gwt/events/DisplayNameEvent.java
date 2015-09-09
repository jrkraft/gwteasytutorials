package com.easylearntutorial.gwt.events;
import com.google.gwt.event.shared.*;

public class DisplayNameEvent extends GwtEvent<DisplayNameEventHandler>{

	public static Type<DisplayNameEventHandler> TYPE = new Type<DisplayNameEventHandler>();
	
	
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DisplayNameEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(DisplayNameEventHandler handler) {

		handler.onShowName(this);
		
	}

}
