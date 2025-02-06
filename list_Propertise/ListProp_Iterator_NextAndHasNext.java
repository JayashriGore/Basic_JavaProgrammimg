package list_Propertise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProp_Iterator_NextAndHasNext {

	public static void main(String[] args) 
	{
		List<String>l=new ArrayList<String>();
        l.add("Amit");               
        l.add("Akshay");
        l.add("Nisha");
        l.add("Nupur");                
        System.out.println(l);
        
        Iterator<String> ite=l.iterator();
        
        while(ite.hasNext()) 
        {
        	
        	System.out.println(ite.next());	
        }
        
        

	}

}
