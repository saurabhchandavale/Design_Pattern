package com.observer.pattern;

public class EmailObserverImpl implements NotificationAlertObserver {
	String emailId;
	StockObservable observable;

	public EmailObserverImpl(String emailId, StockObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(emailId, "Product in stock hurry up...!");
		
	}

	private void sendMail(String emailId2, String string) {
		System.out.println("mail sent to emailId : " + emailId);
	}

}
