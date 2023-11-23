package example.adapterPattern;

import example.adapterPattern.adapter.Emulator;
import example.adapterPattern.game.Contra;
import example.adapterPattern.game.IosGame;
import example.adapterPattern.screen.Screen;

public class Game
{
	public static void main(String[] args)
	{
		IosGame game1 = new Contra();
		Screen screen = new Screen();
		
		game1.fire(screen);
		game1.aim(screen);
		
		// Play this game on keyboard
		System.out.println("Starting the game using emulator");
		
		IosGame game2 = new Contra();
		Screen emulator = new Emulator();
		game2.fire(emulator);
		game2.aim(emulator);
		
	}
}
