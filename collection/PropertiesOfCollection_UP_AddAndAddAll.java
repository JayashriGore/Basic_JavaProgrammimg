package collection;

import java.util.ArrayList;
import java.util.Collection;

public class PropertiesOfCollection_UP_AddAndAddAll {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Collection<String> c1 = new ArrayList<String>();    //Upcasting
		c1.add("Ram");
		c1.add("Laxman");
		c1.add("Sita");
		c1.add("Hanuaman");
		c1.add("Ravan");
		c1.add("Vibhishan");
		System.out.println(c1);
		
		Collection<String> c2 = new ArrayList<String>();    //Upcasting
		c2.add("Krishna");
		c2.addAll(c1);
		System.out.println(c2);
		
		
		
		

	}

}
