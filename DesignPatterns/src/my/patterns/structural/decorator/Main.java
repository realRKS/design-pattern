package my.patterns.structural.decorator;

public class Main {
	
	public static void main(String args[])throws Exception{
		
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDesc()+", "+beverage.cost());
		
		beverage=new Mocha(beverage);
		System.out.println(beverage.getDesc()+", "+beverage.cost());
	}

}
