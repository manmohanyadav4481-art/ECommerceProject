package com.kodewala.object.iib.sib.day19;

class User {
	
	public static int totalliveUsers =0;
	
	private String mobile;

	public User (String mobile) {
		this.mobile = mobile;
	}
	{
		totalliveUsers = totalliveUsers +1;
	}
}

public class JioHotStar {

	public static void main(String[] args) {
	
		User u = new User ("4232828");
		User u0 = new User ("4232828");
		User u1 = new User ("4232828");
		User u2 = new User ("4232828");
		User u3 = new User ("4232828");
		User u4 = new User ("4232828");
		System.out.println("total live viwers : "+User.totalliveUsers);

	}

}
