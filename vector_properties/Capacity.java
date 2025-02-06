package vector_properties;

import java.util.Vector;

public class Capacity {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("ritu");
		v1.addElement("mohit");
		v1.addElement("rahul");
		v1.addElement("prashant");
		v1.addElement("diya");
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		

	}

}
