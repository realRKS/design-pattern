package my.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ReflectionTest {
	
	public static void main(String[] args)throws IOException{
		
		try {
			EagerSingleton instance1=	EagerSingleton.getInstance();
			EagerSingleton instance2=null;
			Constructor constructor = EagerSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			
			instance2=(EagerSingleton) constructor.newInstance();
			
			System.out.println("instance1 hashCode:- "+instance1.hashCode());
			System.out.println("instance2 hashCode:- "+instance2.hashCode());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			EagerSingleton instance1 = EagerSingleton.getInstance(); 
            ObjectOutput out 
                = new ObjectOutputStream(new FileOutputStream("file.text")); 
            out.writeObject(instance1); 
            out.close(); 
       
            ObjectInput in  
                = new ObjectInputStream(new FileInputStream("file.text")); 
              
            EagerSingleton instance2 = (EagerSingleton) in.readObject(); 
            in.close(); 
      
            System.out.println("instance1 hashCode:- "
                                                 + instance1.hashCode()); 
            System.out.println("instance2 hashCode:- " 
                                                 + instance2.hashCode()); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			EagerSingleton instance1 = EagerSingleton.getInstance(); 
		    EagerSingleton instance2 = (EagerSingleton) instance1.clone(); 
		    System.out.println("instance1 hashCode:- "
		                           + instance1.hashCode());
		    System.out.println("instance2 hashCode:- " 
		                           + instance2.hashCode());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
