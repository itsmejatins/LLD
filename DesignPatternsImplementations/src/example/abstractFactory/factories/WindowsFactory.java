package example.abstractFactory.factories;

import example.abstractFactory.elements.Button;
import example.abstractFactory.elements.TextBox;
import example.abstractFactory.elements.WindowsButton;
import example.abstractFactory.elements.WindowsTextBox;

public class WindowsFactory implements Factory
{

	@Override
	public Button getButton()
	{
		return new WindowsButton();
	}

	@Override
	public TextBox getTextBox()
	{
		return new WindowsTextBox();
	}

}
