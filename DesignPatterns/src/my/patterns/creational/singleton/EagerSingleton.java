package my.patterns.creational.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable , Cloneable{
	
	private static volatile EagerSingleton instance;
	
	static {
		try {
			instance=new EagerSingleton();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
		
	}
	
	/*
	 * for Serializable
	 * protected Object readResolve() 
    { 
        return instance; 
    }*/

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
	//	return super.clone();
		return instance;
	} 
	
	

}
