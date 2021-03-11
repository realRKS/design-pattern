package my.patterns.behavioral.iterator;

import java.util.Iterator;

public class Main {
	
	public static void main(String args[])throws Exception{
		
		NotificationCollection nc = new NotificationCollection();
		Iterator iterator = nc.createIterator(); 
        System.out.println("-------NOTIFICATION BAR------------"); 
        while (iterator.hasNext()) 
        { 
            Notification n = (Notification)iterator.next(); 
            System.out.println(n.getNotification()); 
        } 
		
	}

}
