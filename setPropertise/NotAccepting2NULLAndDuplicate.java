package setPropertise;

import java.util.HashSet;
import java.util.Set;

public class NotAccepting2NULLAndDuplicate {

	public static void main(String[] args) 
	{
		Set s1=	new HashSet();
		s1.add(45);
		s1.add(85);
		s1.add(15);
		s1.add(99);  //Duplicate
		s1.add(99);  //Duplicate
		s1.add(null);  //1NULL
		s1.add(null);  //2 NULL
		System.out.println(s1);

	}

}
