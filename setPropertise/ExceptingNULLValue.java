package setPropertise;

import java.util.HashSet;
import java.util.Set;

public class ExceptingNULLValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=	new HashSet();
		s1.add(45);
		s1.add(85);
		s1.add(15);
		s1.add(99);
		s1.add(null);        //Acceting NULL Value
		s1.add(99);
		System.out.println(s1);

	}

}
