package example.strategy.classes;

import example.strategy.strategies.SmoothDrive;

public class Car extends Vehicle
{
	public Car()
	{
		super(new SmoothDrive());
	}
}
