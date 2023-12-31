package application;

import observable.IphoneStockObservable;
import observable.StockObservable;
import observer.EmailAltert;
import observer.SmsAltert;

public class NotificationService
{
	public static void main(String[] args)
	{
		StockObservable iphoneStockObservable = new IphoneStockObservable("iPhone");
		iphoneStockObservable.addObserver(new EmailAltert(iphoneStockObservable, "e1@mail.com"));
		iphoneStockObservable.addObserver(new EmailAltert(iphoneStockObservable, "e2@mail.com"));
		iphoneStockObservable.addObserver(new EmailAltert(iphoneStockObservable, "e3@mail.com"));
		
		iphoneStockObservable.addObserver(new SmsAltert(iphoneStockObservable, "9876543210"));
		iphoneStockObservable.addObserver(new SmsAltert(iphoneStockObservable, "1234567890"));
		
		iphoneStockObservable.setStockCount(10);
		iphoneStockObservable.setStockCount(10);
		iphoneStockObservable.setStockCount(0);
		iphoneStockObservable.setStockCount(100);
	}
}
