package my.patterns.others.immutable;

import java.util.HashMap;
import java.util.Map.Entry;

public final class MyEntity {
	private final HashMap<String, String> data;

	public MyEntity(HashMap<String, String> data) {
		super();
		this.data = data;
	}

	public HashMap<String, String> getData() {
		HashMap<String, String> newdata = new HashMap<String,String>();
		for(Entry<String,String> e:data.entrySet())
			newdata.put(e.getKey(), e.getValue());
		return newdata;
	}
	

}
