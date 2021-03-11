package my.patterns.structural.bridge;

public class TypeTwoFunc implements DomainFunc{
	SuperDomain superDomain;
	
	public TypeTwoFunc(SuperDomain superDomain) {
		this.superDomain=superDomain;
	}

	@Override
	public void job() {
		superDomain.option2();
		superDomain.option3();
		
	}

}
