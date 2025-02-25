package com.observer.pattern;

public class Store {

	public static void main(String[] args) {
		StockObservable observable = new IphoneObservableimpl();
		
		NotificationAlertObserver observer1 = new EmailObserverImpl("xyz@gmail.com", observable);;
		NotificationAlertObserver observer2 = new MobileAlertImpl("Saurabh", observable);
		
		observable.add(observer2);
		observable.add(observer1);
		
		observable.setStockCount(10);
	}

}
