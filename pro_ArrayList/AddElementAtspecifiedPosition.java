package pro_ArrayList;

import java.util.ArrayList;

public class AddElementAtspecifiedPosition 
{

	public static void main(String[] args) //add(int index, E element)
	{
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Amit");               
		a1.add("Akshay");
		a1.add("Nupur");
		a1.add("Nisha");
		a1.add(0,"Nisha"); //add at indexing zero
		
       System.out.println(a1);
	}

}
