package vector_properties;

import java.util.Vector;

public class FirstElement_LastElement_Method {

	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<String>();
		v1.addElement("ritu");
		v1.addElement("mohit");
		v1.addElement("rahul");
		v1.addElement("prashant");
		//v1.firstElement();
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());

	}

}
