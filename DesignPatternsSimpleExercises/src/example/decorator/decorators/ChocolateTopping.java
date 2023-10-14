package example.decorator.decorators;

import example.decorator.bases.BasePastry;

public class ChocolateTopping extends ToppingDecorator
{
	BasePastry bp;

	@Override
	public int getCost()
	{
		return bp.getCost() + 20;
	}

	public ChocolateTopping(BasePastry bp)
	{
		this.bp = bp;
	}
}
