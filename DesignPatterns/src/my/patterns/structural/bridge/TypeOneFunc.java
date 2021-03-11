package my.patterns.structural.bridge;

public class TypeOneFunc implements DomainFunc{

	SuperDomain superDomain;
	
	public TypeOneFunc(SuperDomain superDomain) {
		this.superDomain=superDomain;
	}
	@Override
	public void job() {
		superDomain.option1();
		
	}

}
