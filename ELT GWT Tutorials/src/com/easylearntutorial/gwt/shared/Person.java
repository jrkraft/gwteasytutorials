package com.easylearntutorial.gwt.shared;

public class Person {
	private String firstname;
	private String lastname;



		public Person() {
			this("FOO","PAA");
	}
		public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getFullName() {
			String names = getFirstname() + " " + getLastname();
			return names;
		}
			
		

}
