package example.strategy.strategies;

import example.strategy.classes.DriveStyle;

public class SmoothDrive implements DriveStyle
{

	@Override
	public void startDriving()
	{
		System.out.println("Smooth drive");
		
	}

}
