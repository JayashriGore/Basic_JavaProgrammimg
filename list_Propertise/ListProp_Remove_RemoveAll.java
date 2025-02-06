package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_Remove_RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
        l.add("Amit");                
        l.add("Akshay");
        l.add("Nisha");
        l.add("Nupur");
        System.out.println(l);
        
        List l1=new ArrayList();
        l1.add("geetha");
        l1.add("sireesha");
        l1.addAll(l);
        System.out.println("before removing"+l1);
        //l1.remove(0);                                 //Remove at given indexing 
        //l1.remove("Amit");
        //l1.removeFirst()
          //l1.removeLast();
         // Remove the object  //Remove AMit
        l1.removeAll(l);
        
        //Remove All -Remove All collection -l Listcollection
        System.out.println("After removing"+l1);
        
        
        

	}

}
