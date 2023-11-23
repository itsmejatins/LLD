package example.strategy.strategies;

import example.strategy.classes.DriveStyle;

public class RoughDrive implements DriveStyle
{

	@Override
	public void startDriving()
	{
		System.out.println("Rough drive");
		
	}

}
