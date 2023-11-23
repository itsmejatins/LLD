package example.abstractFactory.elements;

public class WindowsButton implements Button
{
	@Override
	public void press()
	{
		System.out.println("Windows button");
	}
}
