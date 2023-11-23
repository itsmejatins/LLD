package example.adapterPattern.button;

public class RightArrow implements Button
{
	@Override
	public void press()
	{
		System.out.println("Right arrow pressed.");
	}
}
