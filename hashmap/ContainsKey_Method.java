package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey_Method {

	public static void main(String[] args) {
		HashMap<String,String> m2=new HashMap<String,String>();
		m2.put("name1", "Geetha");
		m2.put("name2", "Apurva");
		m2.put("name3", "Amit");
		m2.put("name4", "Suraj");
		
		 System.out.println(m2.containsKey("name1"));
		 System.out.println(m2.containsKey("name5"));



	}

}
