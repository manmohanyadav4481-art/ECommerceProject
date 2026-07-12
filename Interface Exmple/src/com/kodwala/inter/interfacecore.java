package com.kodwala.inter;


interface Ott {
	void signUp ();
	void login ();
	void subscribe();
	void cancelsubscription();
}
class Hotstar implements Ott {
	public void signUp () {
		System.out.println("Hotstar.signUp()");
	}

	@Override
	public void login() {
		System.out.println("Hotstar.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Hotstar.subscribe()");
		
	}

	@Override
	public void cancelsubscription() {
		System.out.println("Hotstar.cancelsubscription()");
		
	}
}
class Netflix implements Ott {

	@Override
	public void signUp() {
System.out.println("Netflix.signUp()");
		
	}

	@Override
	public void login() {
		System.out.println("Netflix.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Netflix.subscribe()");
		
	}

	@Override
	public void cancelsubscription() {
		System.out.println("Netflix.cancelsubscription()");
		
	}
	
}
class Sonyliv implements Ott {

	@Override
	public void signUp() {
		System.out.println("Sonyliv.signUp()");
		
	}

	@Override
	public void login() {
		System.out.println("Sonyliv.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Sonyliv.subscribe()");
		
	}

	@Override
	public void cancelsubscription() {
	System.out.println("Sonyliv.cancelsubscription()");
		
	}
	
}