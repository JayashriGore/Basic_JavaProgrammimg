package cursorAndEnumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Ex_Enumeration {

	public static void main(String[] args) 
	{
	   Vector<String> v1 = new Vector<String>();
			v1.addElement("ritu");
			v1.addElement("mohit");
			v1.addElement("rahul");
			v1.addElement("prashant");
			System.out.println(v1);
			
			Enumeration<String> e1=v1.elements();
			while(e1.hasMoreElements())
			{
				System.out.println(e1.nextElement());
			}

	}

}
