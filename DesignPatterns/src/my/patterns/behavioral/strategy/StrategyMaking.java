package my.patterns.behavioral.strategy;

public class StrategyMaking {
	Strategy strategy;
	public StrategyMaking(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void making() {
		strategy.doAlgo();
	}

}
