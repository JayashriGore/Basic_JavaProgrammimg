package vector_properties;

import java.util.Vector;

public class RemoveElement_RemoveElementAt_RemoveAllElement {

	public static void main(String[] args) 
	{
		
		Vector<String> v1 = new Vector<String>();
		v1.addElement("ritu");
		v1.addElement("mohit");
		v1.addElement("rahul");
		v1.addElement("prashant");
		System.out.println("Before Removing the element"+v1);
		
		v1.removeElement("ritu"); // object obj
		System.out.println(v1);
		
		v1.removeElementAt(1);
		System.out.println(v1);// int index
		
		v1.removeAllElements();
		System.out.println(v1);    // Remove all elements
		
		
		
		
	}

}
