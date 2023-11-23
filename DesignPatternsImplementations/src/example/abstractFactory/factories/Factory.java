package example.abstractFactory.factories;

import example.abstractFactory.elements.Button;
import example.abstractFactory.elements.TextBox;

public interface Factory
{
	public Button getButton();
	public TextBox getTextBox();
}
