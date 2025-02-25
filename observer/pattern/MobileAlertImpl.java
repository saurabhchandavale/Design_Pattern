package com.observer.pattern;

public class MobileAlertImpl implements NotificationAlertObserver {
	
	String username;
	StockObservable observable;

	public MobileAlertImpl(String emailId, StockObservable observable) {
		this.username = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(username, "Product in stock hurry up...!");
		
	}

	private void sendMail(String emailId2, String string) {
		System.out.println("msg sent to username : " + username);
	}

}
