package example.strategy.classes;

import example.strategy.strategies.RoughDrive;

public class Truck extends Vehicle
{
	public Truck()
	{
		super(new RoughDrive());
	}
}
