package hashmap;

import java.util.HashMap;

public class GetOrDefault_Method {

	public static void main(String[] args)      //Return the value of the entry with a specified key 
	                                          //or a default value if the entry is not found
	{
		
		HashMap<String, String> c1 = new HashMap<String, String>();
		c1.put("England", "London");
	    c1.put("Germany", "Berlin");
	    c1.put("Norway", "Oslo");
	    c1.put("USA", "Washington DC");
	    System.out.println(c1.getOrDefault("England", "Unknown"));
	    System.out.println(c1.getOrDefault("Canada", "Unknown"));
	  }

	}


