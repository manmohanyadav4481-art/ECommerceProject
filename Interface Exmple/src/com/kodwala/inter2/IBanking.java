package com.kodwala.inter2;
//initial method start
interface IBanking {
void pay ();
void settle ();
void cancelTxn ();
//after change method
// void print PassBook ()

  default void printPassBook ()
{
	System.out.println("IBanking.printPassBook()");
}
  default void doKYC ()
  {
	  
  }

}
class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
		
	}

	@Override
	public void settle() {
	System.out.println("HDFC.settle()");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("HDFC.cancelTxn()");
		
	}

	@Override
	public void printPassBook() {
		
		
	}
	
}
class PNB implements IBanking {

	@Override
	public void pay() {
		System.out.println("PNB.pay()");
		
	}

	@Override
	public void settle() {
		System.out.println("PNB.settle()");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("PNB.cancelTxn()");
		
	}

   @Override
   public void doKYC () {
	   System.out.println("PNB.doKYC()");
   }
	
}
class UPGraminBank implements IBanking {
	


@Override
public void pay() {
	System.out.println("UPGraminBank.pay()");
	
}

@Override
public void settle() {
	System.out.println("UPGraminBank.settle()");
	
}

@Override
public void cancelTxn() {
System.out.println("UPGraminBank.cancelTxn()");
	
}
@Override
 public void printPassBook () {
	System.out.println("UPGraminBank.printPassBook()");
}
}

	


		
	
