package example.adapterPattern.game;

import example.adapterPattern.screen.Screen;

public class Contra implements IosGame
{

	@Override
	public void fire(Screen screen)
	{
		screen.touchRight();
	}

	@Override
	public void aim(Screen screen)
	{
		screen.touchLeft();
	} 

}
