package com.kodwala.inter2;

public class Driver {

	public static void main(String[] args) {
		
//		IBanking ib =
//				new PNB ();
//		ib.pay();
//		ib.settle();
//		ib.cancelTxn();
//		ib.printPassBook();
//		
//		System.out.println("*********************");
//		
//		IBanking i = new HDFC ();
//		i.pay();
//		i.settle();
//		i.cancelTxn();
//		i.printPassBook();
//		
//		System.out.println("******************");
//		
//		IBanking obj = new UPGraminBank ();
//		obj.pay();
//		obj.settle();
//		obj.cancelTxn();
//		obj.printPassBook();
//	
		IBanking [] ibanking = {new PNB(), new HDFC(),new  UPGraminBank () };  
     for(IBanking v : ibanking) {
    	 v.cancelTxn();
    	 v.doKYC();
    	 v.pay();
    	 v.printPassBook();
    	 System.out.println("--------------------");
     }
	}

}
