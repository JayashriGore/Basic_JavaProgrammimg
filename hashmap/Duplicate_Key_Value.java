package hashmap;

import java.util.HashMap;

public class Duplicate_Key_Value {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ram", 51);             //Use put method to adding elements
		m3.put("Sita", 42); // Not allow to duplicate key
		m3.put("Sita", 42);
		m3.put("Bhim", 27);
		m3.put("Bharat",27); // Allow Duplicate value
		m3.put("Laxman", 49);
		System.out.println(m3);

	}

}
