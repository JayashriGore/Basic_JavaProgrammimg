package hashmap;

import java.util.HashMap;

public class Size {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ram", 51);             //Use put method to adding elements
		m3.put("Sita", 42);
		m3.put("Bhim", 27);
		m3.put("Laxman", 49);
		System.out.println(m3.size());
	}

}
