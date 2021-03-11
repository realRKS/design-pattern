package my.patterns.structural.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		desc="Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
