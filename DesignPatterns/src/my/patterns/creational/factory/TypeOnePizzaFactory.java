package my.patterns.creational.factory;

public class TypeOnePizzaFactory implements AbstractPizzaFactory{

	@Override
	public Dough getDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDoughImpl();
	}

	@Override
	public Sauce getSauce() {
		// TODO Auto-generated method stub
		return new TypeOneSauceImpl();
	}

	@Override
	public Cheese getCheese() {
		// TODO Auto-generated method stub
		return new TypeOneCheeseImpl();
	}

}
