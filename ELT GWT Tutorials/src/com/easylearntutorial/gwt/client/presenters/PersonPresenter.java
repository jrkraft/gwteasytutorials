package com.easylearntutorial.gwt.client.presenters;

import com.easylearntutorial.gwt.events.DisplayNameEvent;
import com.easylearntutorial.gwt.events.DisplayNameEventHandler;
import com.easylearntutorial.gwt.shared.Person;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class PersonPresenter implements Presenter{

	
	 Person person;
	 Display view;
	 private final EventBus eventBus;
	
	 public interface Display{
		 public void clear();
		 public void setName( String name);
		 public Widget asWidget();
		 public void setPresenter(PersonPresenter presenter);  
		 
	 }

	public PersonPresenter(Person person, Display view, EventBus eventBus){
		this.person = person;
		this.view = view;
		this.eventBus = eventBus;
		
		bind();
	}
	@Override
	public void bind() {

		view.setPresenter(this);
		view.clear();
		view.setName(person.getFirstname());
		// code à déplacer dans le gestionnaire général devennement de l'application
		eventBus.addHandler(DisplayNameEvent.TYPE, new DisplayNameEventHandler(){

			@Override
			public void onShowName(DisplayNameEvent event) {
				
				view.setName(person.getFullName());
			}
		});
		
	}

	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());
	}
	
	public void showFullName(){
		eventBus.fireEvent(new DisplayNameEvent());
	}
}
