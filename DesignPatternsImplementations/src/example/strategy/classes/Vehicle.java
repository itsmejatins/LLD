package example.strategy.classes;

public class Vehicle
{
	DriveStyle driveStyle;
	
	public Vehicle(DriveStyle engine)
	{
		this.driveStyle = engine;
	}
	
	public void go()
	{
		driveStyle.startDriving();
	}
}
