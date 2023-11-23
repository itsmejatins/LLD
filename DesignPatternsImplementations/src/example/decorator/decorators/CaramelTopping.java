package example.decorator.decorators;

import example.decorator.bases.BasePastry;

public class CaramelTopping extends ToppingDecorator
{
	BasePastry bp;

	@Override
	public int getCost()
	{
		return bp.getCost() + 20;
	}

	public CaramelTopping(BasePastry bp)
	{
		this.bp = bp;
	}
}
