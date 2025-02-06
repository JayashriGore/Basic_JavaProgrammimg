package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_ContainsAndContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
        l.add("Amit");               
        l.add("Akshay");
        l.add("Nisha");
        l.add("Nupur");
        System.out.println(l.contains("Amit")); //check Contains 1
        
        List<String> l2 = new ArrayList<>();
        l2.add("Amit");               
        l2.add("Akshay");
        l2.add("Nisha");
       System.out.println(l.containsAll(l2));  // Check ContainsAll
     }

}
