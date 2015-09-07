package com.easylearntutorial.gwt.client.presenters;

import com.easylearntutorial.gwt.shared.Person;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class PersonPresenter implements Presenter{

	
	 Person person;
	 Display view;
	
	 public interface Display{
		 public void clear();
		 public void setName( String name);
		 public Widget asWidget();
		 public void setPresenter(PersonPresenter presenter);  
	 }

	public PersonPresenter(Person person, Display view){
		this.person = person;
		this.view = view;
		
		bind();
	}
	@Override
	public void bind() {

		view.setPresenter(this);
		view.clear();
		System.out.println("------------------------------" + person.getFirstname());
		view.setName(person.getFirstname());
		
	}

	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());
	}
	
	public void showFullName(){
		view.setName(person.getFullName());
	}
}
