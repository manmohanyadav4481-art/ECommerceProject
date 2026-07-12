package com.programe.oops.inherita.overrid.practt;

public class NotificationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NotificationService not = new WhatsApp ();

Notification noti = not.send();

System.out.println(noti.status);
	}

}
