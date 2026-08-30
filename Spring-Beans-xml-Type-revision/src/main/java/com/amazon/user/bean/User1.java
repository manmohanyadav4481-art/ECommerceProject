package com.amazon.user.bean;

public class User1 {

	private String Username;
	private String Type;
	private String Location;
	
	public void display () {
		System.out.println("user1 [Username=" + Username + ", Type=" + Type + ", Location=" + Location + "]");
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
