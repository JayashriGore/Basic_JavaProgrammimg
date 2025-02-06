package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_ClearMethod {

	public static void main(String[] args) 
	{
		List<String>l=new ArrayList<String>();
        l.add("Amit");               
        l.add("Akshay");
        l.add("Nisha");
        l.add("Nupur"); 
        l.clear();              //clear All means  Deleting everting
        System.out.println(l);

	}

}
