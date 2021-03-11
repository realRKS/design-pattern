package my.patterns.structural.adapter;

public class Main {
	
	public static void main(String args[])throws Exception{
		
		Turkey wild=new WildTurkey();
		Duck mallard=new MallardDuck();
		
		Turkey adtTurkey=new DuckAdapter(mallard);
		
		Duck adtDuck=new TurkeyAdapter(wild);
		
		adtTurkey.fly();
		adtTurkey.gobble();
		adtDuck.fly();
		adtDuck.quack();
		
	}

}
