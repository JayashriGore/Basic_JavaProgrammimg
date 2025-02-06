package collection;

import java.util.ArrayList;
import java.util.Collections;

public class PropertiesOfCollection_Sort {

	public static void main(String[] args) 
	{
	ArrayList a1=new ArrayList();
	a1.add(43);
	a1.add(46);
	a1.add(98);
	a1.add(1);
	System.out.println("Without Sorting"+a1);
	Collections.sort(a1);
	System.out.println("With Sorting-->"+a1);
	

	}

}
