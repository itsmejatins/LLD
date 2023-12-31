package observable;

import observer.StockObserver;

public interface StockObservable
{
	public void notifyObservers();
	public String getStockName();
	public void addObserver(StockObserver o);
	public void removeObserver(StockObserver o);
	public int getStockCount();
	public void setStockCount(int count);
}
