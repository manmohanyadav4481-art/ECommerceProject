package com.programe.oops.inherita.overrid.practt;

class NotificationService {
	Notification send () {
		System.out.println("Notificaton . send()");
	return new Notification ("sent");
	}
}
class WhatsApp extends NotificationService {
	@Override
	WhatsAppNotification send () {
		System.out.println("WhatsApp . send ()");
		return new WhatsAppNotification ("Delivery", "Blue tick");
	}
}
class Notification {
	String status;
	Notification(String status){
		this.status = status;
	}
}
class WhatsAppNotification extends Notification {
	String readStatus;
	WhatsAppNotification (String status, String readStatus){
		super(status);
		
		this.readStatus = readStatus;
	}
}