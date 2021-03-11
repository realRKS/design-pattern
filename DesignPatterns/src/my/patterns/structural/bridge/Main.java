package my.patterns.structural.bridge;

public class Main {
	
	public static void main(String args[])throws Exception{
		SuperDomain domain1=new TypeOneDomain();
		SuperDomain domain2=new TypeTwoDomain();
		DomainFunc func=new TypeOneFunc(domain1);
		func.job();
		func=new TypeTwoFunc(domain2);
		func.job();
		
	}

}
