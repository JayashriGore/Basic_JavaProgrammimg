package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_Accept1NULL_2NULL_Duplicate {

	public static void main(String[] args) 
	{    
		List<String>l=new ArrayList<String>();
        l.add("Amit");               //9820081817-ShivTrae Aamdar
        l.add("Akshay");
        l.add("Nupur");
        l.add("Nisha");
        l.add("Nisha");
        l.add(null);
        l.add(null);
       System.out.println(l);

	}

}
