package observable;

import java.util.ArrayList;
import java.util.List;

import observer.StockObserver;

public class IphoneStockObservable implements StockObservable
{
	private String itemName;
	private int stockCount;

	public IphoneStockObservable(String itemName)
	{
		this.itemName = itemName;
	}

	private List<StockObserver> observers = new ArrayList<>();

	@Override
	public void notifyObservers()
	{
		for (StockObserver o : observers)
			o.update();
	}
	
	public void addObserver(StockObserver o)
	{
		observers.add(o);
	}

	public void removeObserver(StockObserver o)
	{
		observers.remove(o);
	}
	
	@Override
	public String getStockName()
	{
		return this.itemName;
	}

	public int getStockCount()
	{
		return this.stockCount;
	}

	public void setStockCount(int stock)
	{
		if (this.stockCount == 0 && stock > 0)
		{
			this.stockCount = stock;
			notifyObservers();
		}
		this.stockCount = stock;
	}

}
