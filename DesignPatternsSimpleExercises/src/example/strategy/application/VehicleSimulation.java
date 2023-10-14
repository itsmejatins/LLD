package example.strategy.application;

import example.strategy.classes.Bus;
import example.strategy.classes.Car;
import example.strategy.classes.Truck;
import example.strategy.classes.Vehicle;

public class VehicleSimulation
{
	public static void main(String[] args)
	{
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		Vehicle bus = new Bus();
		
		car.go();
		truck.go();
		bus.go();
	}
}
