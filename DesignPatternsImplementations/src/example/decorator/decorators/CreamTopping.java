package example.decorator.decorators;

import example.decorator.bases.BasePastry;

public class CreamTopping extends ToppingDecorator
{
	BasePastry bp;

	@Override
	public int getCost()
	{
		return bp.getCost() + 10;
	}

	public CreamTopping(BasePastry bp)
	{
		this.bp = bp;
	}
}
