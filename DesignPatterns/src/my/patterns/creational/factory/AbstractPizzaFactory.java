package my.patterns.creational.factory;

public interface AbstractPizzaFactory {
	
	public Dough getDough();
	public Sauce getSauce();
	public Cheese getCheese();

}
