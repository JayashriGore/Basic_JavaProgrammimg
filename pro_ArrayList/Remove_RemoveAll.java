package pro_ArrayList;

import java.util.ArrayList;

public class Remove_RemoveAll 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Amit");                
		a1.add("Akshay");
		a1.add("Nisha");
		a1.add("Nupur");
        System.out.println(a1);
        
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("geetha");
        a2.add("sireesha");
        a2.addAll(a1);
        System.out.println("before removing"+a2);
        //l1.remove(0);                                 //Remove at given indexing 
        //l1.remove("Amit");
        //l1.removeFirst()
          //l1.removeLast();
         // Remove the object  //Remove AMit
        a2.removeAll(a1);
        
        //Remove All -Remove All collection -l Listcollection
        System.out.println("After removing"+a2);
        
        

	}

}
