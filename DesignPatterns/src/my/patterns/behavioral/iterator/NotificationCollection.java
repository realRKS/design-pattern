package my.patterns.behavioral.iterator;

import java.util.Collection;
import java.util.Iterator;

class NotificationCollection implements Collection 
{ 
    static final int MAX_ITEMS = 6; 
    int numberOfItems = 0; 
    Notification[] notificationList; 
  
    public NotificationCollection() 
    { 
        notificationList = new Notification[MAX_ITEMS]; 
  
        // Let us add some dummy notifications 
        addItem("Notification 1"); 
        addItem("Notification 2"); 
        addItem("Notification 3"); 
    } 
  
    public void addItem(String str) 
    { 
        Notification notification = new Notification(str); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("Full"); 
        else
        { 
            notificationList[numberOfItems] = notification; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
  
    public Iterator createIterator() 
    { 
        return new NotificationIterator(notificationList); 
    }

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	} 
} 