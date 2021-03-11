package my.patterns.structural.decorator;

public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return beverage.getDesc()+", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+.20;
	}

}
