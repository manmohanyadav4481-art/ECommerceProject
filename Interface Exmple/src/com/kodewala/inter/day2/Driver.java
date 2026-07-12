package com.kodewala.inter.day2;



interface EcomDelivery {
	void placeOrder ();
	void cancelOrder ();
	void editOrder ();
	 default void generateInvoice ()
	 {
		 //500+send sms 
		 sendSms ();
	 }
	
	public static void printPDF () {//common functionality
	
		connectServer ();   //--> init print --> write to file-->
		notifyCustomers ();
		
	}
	public static void sendNotification () //common functionality
	{
		connectServer ();  //--> draft email -->
		notifyCustomers ();
		
	}
	private static void connectServer () {
		System.out.println("EcomDelivery.connectServer()");
		// 50 lines
		
	}
	private static void notifyCustomers () {
		System.out.println("EcomDelivery.notifyCustomers()");
		//50 line
	}
	private void sendSms () {
		System.out.println("EcomDelivery.sendSms()");
		//50 line
	}
}
class Amazon implements EcomDelivery {

	@Override
	public void placeOrder() {
		System.out.println("Amazon.placeOrder()");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Amazon.cancelOrder()");
		
	}

	@Override
	public void editOrder() {
	System.out.println("Amazon.editOrder()");
		
	}

	@Override
	public void generateInvoice() {
		System.out.println("Amazon.generateInvoice()");
		printPDF ("path to store pdf file", "seller logo");
	}
	private void printPDF(String path, String companylogo) {
		
		System.out.println("Amazon.printPDF()");//200 line
		EcomDelivery.printPDF();//dublicatcy is awarded here
	}
	
}
class Flipkart implements EcomDelivery {

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Flipkart.cancelOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("Flipkart.editOrder()");
		
	}

	@Override
	public void generateInvoice() {
		System.out.println("Flipkart.generateInvoice()");
		printPDF ("path to store pdf file", "seller logo");
	}
	private void printPDF (String path, String companylogo) {
		System.out.println("Flipkart.printPDF()");//250 line
	}
}





public class Driver {

	public static void main(String[] args) {

       EcomDelivery ec = new Amazon ();
       ec.placeOrder();
       ec.editOrder();
       ec.cancelOrder();
       ec.generateInvoice();
       
		
       EcomDelivery eco = new Flipkart ();
       eco.cancelOrder();
       eco.editOrder();
       eco.generateInvoice();
       eco.placeOrder();
 
	}

}
