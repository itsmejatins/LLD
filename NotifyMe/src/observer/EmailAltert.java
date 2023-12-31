package observer;

import observable.StockObservable;

public class EmailAltert implements StockObserver

{
	private StockObservable observable;
	String email;

	public EmailAltert(StockObservable observable, String email)
	{
		this.observable = observable;
		this.email = email;
	}

	@Override
	public void update()
	{
		sendEmail();
	}

	private void sendEmail()
	{
		String message = String.format("Sending email to %s, %s is available", this.email, this.observable.getStockName());
		System.out.println(message);
	}

}
