package hashmap;

import java.util.HashMap;

public class NULL_Value_Key {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ram", 51);             //Use put method to adding elements
		m3.put("Sita", 42); 
		m3.put(null, 45);
		m3.put(null, 48);  // Allow only one Null key
		m3.put("Bhim", null);
		m3.put("Bharat",null); 
		m3.put("Laxman", null); // Allow multiple Null values
		System.out.println(m3);


	}

}
