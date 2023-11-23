package example.adapterPattern.game;

import example.adapterPattern.screen.Screen;

public interface IosGame
{
	public abstract void fire(Screen screen);
	public abstract void aim(Screen screen);
}
