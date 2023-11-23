package example.adapterPattern.button;

public class LeftArrow implements Button
{
	@Override
	public void press()
	{
		System.out.println("Left arrow pressed");
	}
}
