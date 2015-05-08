package hashtableCerto;

import java.util.Hashtable;

public class PropertiesCerto {
	
	private Hashtable<Object,Object> table;
	
	public PropertiesCerto() {
		table = new Hashtable<Object, Object>();
	}
	
	public void put(Object key, Object value) {
		table.put(key, value);
	}
	
	public void setProperty(String key, String value) {
		put(key, value);
	}
	
	public Object getProperty(Object key) {
		return table.get(key);
	}
	
	public Object get(Object key) {
		return getProperty(key);
	}


}
