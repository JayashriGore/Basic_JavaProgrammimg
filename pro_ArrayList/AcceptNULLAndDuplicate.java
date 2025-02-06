package pro_ArrayList;

import java.util.ArrayList;

public class AcceptNULLAndDuplicate {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Amit");               
		a1.add("Akshay");
		a1.add("Nupur");
		a1.add("Nisha");
		a1.add("Nisha");
		a1.add(null);
		a1.add(null);
       System.out.println(a1);
		
	}

}
