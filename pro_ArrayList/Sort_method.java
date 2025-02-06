package pro_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_method 
{
	public static void main(String[] args) 
	{
		
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(43);
	a1.add(46);
	a1.add(98);
	a1.add(1);
	//System.out.println("Without Sorting"+a1);
	Collections.sort(a1);
	//System.out.println("With Sorting-->"+a1);
	
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("Esha");
	a2.add("Deepak");
	a2.add("Baban");
	a2.add("Akash");
	System.out.println("Without Sortin stringg"+a2);
	Collections.sort(a2);
	System.out.println("With Sorting string-->"+a2);	
	
	
	
}
}
