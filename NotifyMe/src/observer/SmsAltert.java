package observer;

import observable.StockObservable;

public class SmsAltert implements StockObserver

{
	private StockObservable observable;
	String mobNumber;

	public SmsAltert(StockObservable observable, String email)
	{
		this.observable = observable;
		this.mobNumber = email;
	}

	@Override
	public void update()
	{
		sendSms();
	}

	private void sendSms()
	{
		String message = String.format("Sending SMS to %s, %d %s are available", this.mobNumber, this.observable.getStockCount(), this.observable.getStockName());
		System.out.println(message);
	}

}
