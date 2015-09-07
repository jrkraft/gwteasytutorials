package com.easylearntutorial.gwt.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.easylearntutorial.gwt.client.presenters.PersonPresenter;

public class PersonView extends Composite implements PersonPresenter.Display {
	
	private PersonPresenter personPresenter;

	private static PersonViewUiBinder uiBinder = GWT
			.create(PersonViewUiBinder.class);

	interface PersonViewUiBinder extends UiBinder<Widget, PersonView> {
	}

	public PersonView() {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText("click");
	}
@UiField
Label name;
@UiField
Button button;

public PersonView(String firstname) {
	initWidget(uiBinder.createAndBindUi(this));
	button.setText(firstname);
}
@UiHandler("button")
void onClick(ClickEvent e){
	personPresenter.showFullName();
}
@Override
public void clear() {
	name.setText(" ");
	
}
@Override
public void setName(String name) {	
	this.name.setText(name);
	
}
@Override
public void setPresenter(PersonPresenter presenter) {
	this.personPresenter = presenter;
	
}
}
