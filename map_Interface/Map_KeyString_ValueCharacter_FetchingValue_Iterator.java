package map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_KeyString_ValueCharacter_FetchingValue_Iterator 
{

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("student1",'f');
		m1.put("student2",'m');
		m1.put("student3",'f');
		m1.put("student4",'m');
		m1.put("student5",'f');
		m1.put("student6",'m');
		
		//Set<String>s1=m1.keySet();  //fecting key value only
		System.out.println("Fetching all Keys-->");
		
		for (String key : m1.keySet())     //String Key becuse RT of key is String
		                                      // for loop for printing the Key
		{
			System.out.println(key);
		}
		
		System.out.println("Fetching all Values-->");
		
		for (Character value : m1.values())    // for loop for Fetching printing the value
			{                                        //Character value : RT of vlaue is Character 
				System.out.println(value);
			}
				
	   System.out.println("Fetching all Values-->");
	    Set<Entry<String,Character>> kv=m1.entrySet(); //Set<Entry<String,Character>>is RT of entryset
	    
	    Iterator<Entry<String,Character>> i1= kv.iterator();                                                                                                    //Whichver method RT is set that means Iterator concept involved here
	    while(i1.hasNext()) 
	    {
	    	System.out.println(i1.next());
	    }
	    
	    
			
		}
		

	} 

	

