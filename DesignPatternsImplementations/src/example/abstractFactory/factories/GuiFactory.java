package example.abstractFactory.factories;

public class GuiFactory
{
	public static Factory getFactory(String os)
	{
		if(os.toLowerCase().equals("windows"))
			return new WindowsFactory();
		else if(os.toLowerCase().equals("mac"))
			return new MacFactory();
		else
			throw new RuntimeException("Os not supported");
	}
}
