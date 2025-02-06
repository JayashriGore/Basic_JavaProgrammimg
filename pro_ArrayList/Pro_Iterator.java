package pro_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro_Iterator {

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
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
