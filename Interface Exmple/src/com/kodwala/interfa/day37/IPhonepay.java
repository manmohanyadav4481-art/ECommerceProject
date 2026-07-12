package com.kodwala.interfa.day37;

public interface IPhonepay {
 void pay ();
}
@FunctionalInterface
public interface Googlepay extends IPhonepay{
	//void refund ();
	void pay();
}

