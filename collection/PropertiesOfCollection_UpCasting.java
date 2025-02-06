package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PropertiesOfCollection_UpCasting 
{
public static void main(String[] args) 
	{
	Collection<Integer> c1 = new ArrayList<Integer>();    //Upcasting
	c1.add(90000);
	c1.add(536);
	c1.add(743);
	c1.add(11);
	c1.add(4);
	c1.add(123);
	System.out.println(c1);
	
	
	
	
	
	
	
	
	
	
	
		//Collection c1 = new ArrayList();    //Upcasting
		//c1.add("dad");
		//c1.add(true);
		//c1.add(3.1456);
		//c1.add('A');
		//c1.add(90000);
		//c1.add(98.9);
		//System.out.println(c1);
	//It show yellow line warning msg becuse of diffrent data type
		
		
		
		
	}

}
