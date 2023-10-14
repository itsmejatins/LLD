package example.decorator;

import example.decorator.bases.BasePastry;
import example.decorator.bases.ChocolatePastry;
import example.decorator.bases.VanilaPastry;
import example.decorator.decorators.ChocolateTopping;
import example.decorator.decorators.CreamTopping;

public class Shop
{
	public static void main(String[] args)
	{
		BasePastry order1 = new VanilaPastry();
		BasePastry order2 = new CreamTopping(new ChocolatePastry());
		BasePastry order3 = new CreamTopping(new ChocolateTopping(new VanilaPastry()));

		System.out.println(order1.getCost());
		System.out.println(order2.getCost());
		System.out.println(order3.getCost());
	}
}
