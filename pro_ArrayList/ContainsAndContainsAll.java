package pro_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainsAndContainsAll {

	public static void main(String[] args) 
	{
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Amit");               
		a2.add("Akshay");
		a2.add("Nisha");
		a2.add("Nupur");
        System.out.println(a2.contains("Amit")); //check Contains 1
        
        List<String> a3 = new ArrayList<>();
        a3.add("Amit");               
        a3.add("Akshay");
        a3.add("Nisha");
       System.out.println(a2.containsAll(a3));  // Check ContainsAll

	}

}
