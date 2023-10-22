package example.defaultMethods;

public class CircleInterfaceImpl implements CircleInterface
{
	String color;

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public String getColor()
	{
		return this.color;
	}

}
