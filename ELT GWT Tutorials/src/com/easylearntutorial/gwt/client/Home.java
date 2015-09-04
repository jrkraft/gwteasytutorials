package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	
	private LittleForm form = new LittleForm();

	public void onModuleLoad() {
		// TODO Auto-generated method stub

		form.setText("new text");
		RootPanel.get().add((form));
		
		
		
	}

}
