package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_KeyString_ValueInteger 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m3=new HashMap<String,Integer>();
		m3.put("Ram", 51);             //Use put method to adding elements
		m3.put("Sita", 42);
		m3.put("Bhim", 27);
		m3.put("Laxman", 49);
		System.out.println(m3);
		
		Map<String,Integer> m4=new HashMap<String,Integer>();
		m4.put("Vishwa", 24);
		m4.putAll(m3);
		System.out.println(m4);
		
		
		
		
		

	}

}
