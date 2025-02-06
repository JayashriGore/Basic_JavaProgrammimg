package collection;

import java.util.ArrayList;
import java.util.Collection;

public class PropertiesOfCollection_UP_IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c1 = new ArrayList<String>();    //Upcasting
		c1.add("Ram");
		c1.add("Laxman");
		c1.add("Sita");
		c1.add("Hanuaman");
		c1.add("Ravan");
		c1.add("Vibhishan");
		
		boolean b1=c1.isEmpty();
		System.out.println(b1);
		
		System.out.println(c1);
		

	}

}
