package my.patterns.behavioral.strategy;

public class Main {
	
	public static void main(String args[])throws Exception{
		StrategyMaking strategy=new StrategyMaking(new ImplOne());
		strategy.making();
		strategy=new StrategyMaking(new ImplTwo());
		strategy.making();
	}

}
