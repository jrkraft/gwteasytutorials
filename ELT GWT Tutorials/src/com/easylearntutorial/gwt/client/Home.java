package com.easylearntutorial.gwt.client;

import com.easylearntutorial.gwt.client.presenters.PersonPresenter;
import com.easylearntutorial.gwt.client.presenters.Presenter;
import com.easylearntutorial.gwt.client.presenters.PersonPresenter.Display;
import com.easylearntutorial.gwt.client.views.PersonView;
import com.easylearntutorial.gwt.shared.Person;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	
	LittleForm form = new LittleForm();
	Person me;
	Display view;

	public void onModuleLoad() {
		// TODO Auto-generated method stub

		//form.setText("new text"); 
		me = new Person();
		view = new PersonView();
		Presenter presenter = new PersonPresenter(me, view);
		presenter.go(RootPanel.get());
		
		
		
	}

}
