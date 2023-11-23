package example.strategy.classes;

import example.strategy.strategies.RoughDrive;

public class Bus extends Vehicle 
{
	public Bus()
	{
		super(new RoughDrive());
	}
}
