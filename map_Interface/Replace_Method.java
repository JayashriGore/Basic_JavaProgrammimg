package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Replace_Method 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ram", 51);             //Use put method to adding elements
		m3.put("Sita", 42);
		m3.put("Bhim", 27);
		m3.put("Laxman", 49);
		//System.out.println(m3);
		
		Map<String,Integer> m4=new HashMap<String,Integer>();
		m4.put("Vishwa", 24);
		m4.putAll(m3);
		System.out.println(m4);
		m4.replace("Ram", 50); //Replace ram age 51 to 50:You can replace only value not key
		m4.replace("Sita", 42, 45);  // anothermrthod old to new
		
		System.out.println("After Rplacing the Ram and sits,the new m4 will be-->"+m4);
		
		
		
		
		
		

	}
}
