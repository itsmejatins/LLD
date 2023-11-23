package example.adapterPattern.adapter;

import example.adapterPattern.button.Button;
import example.adapterPattern.button.LeftArrow;
import example.adapterPattern.button.RightArrow;
import example.adapterPattern.screen.Screen;

public class Emulator extends Screen
{

	Button left = new LeftArrow();
	Button right = new RightArrow();

	@Override
	public void touchLeft()
	{
		left.press();
	}

	@Override
	public void touchRight()
	{
		right.press();
	}

}
