package my.patterns.creational.factory;

public class TypeTwoPizzaFactory implements AbstractPizzaFactory{

	@Override
	public Dough getDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDoughImpl();
	}

	@Override
	public Sauce getSauce() {
		// TODO Auto-generated method stub
		return new TypeTwoSauceImpl();
	}

	@Override
	public Cheese getCheese() {
		// TODO Auto-generated method stub
		return new TypeTwoCheeseImpl();
	}

}
