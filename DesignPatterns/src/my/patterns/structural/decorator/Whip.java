package my.patterns.structural.decorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return beverage.getDesc()+", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+.4;
	}

}
