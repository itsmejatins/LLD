package example.abstractFactory.factories;

import example.abstractFactory.elements.Button;
import example.abstractFactory.elements.MacButton;
import example.abstractFactory.elements.MacTextBox;
import example.abstractFactory.elements.TextBox;

public class MacFactory implements Factory
{

	@Override
	public Button getButton()
	{
		return new MacButton();
	}

	@Override
	public TextBox getTextBox()
	{
		return new MacTextBox();
	}

}
