package my.patterns.creational.factory;

public class Main {
	
	public static void main(String args[])throws Exception{
		
		createPizza("TypeI");
		
		createPizza("TypeII");
	}

	private static void createPizza(String string) {
		AbstractPizzaFactory factory=null;
		if(string.equals("TypeI"))
			factory=new TypeOnePizzaFactory();
		else if(string.equals("TypeII"))
			factory=new TypeTwoPizzaFactory();
		else
			System.out.println("No Options");
		
		
		if(factory!=null) {
			factory.getCheese().createCheese();
			factory.getDough().createDough();
			factory.getSauce().createSauce();
		}
		
	}

}
