package pro_ArrayList;

import java.util.ArrayList;

public class Set_Method {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Amit");               
		a1.add("Akshay");
		a1.add("Nupur");
		a1.add("Nisha");
		a1.add("Riya");
		System.out.println(a1);
		a1.set(0, "Maya");
       System.out.println(a1);

	}

}
