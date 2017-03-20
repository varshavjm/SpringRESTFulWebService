package org.springFramework.first_rest_Id;

public class Greeting {
	
	private String name, location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public Greeting(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
