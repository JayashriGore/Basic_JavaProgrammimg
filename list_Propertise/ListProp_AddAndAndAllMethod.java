package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_AddAndAndAllMethod {

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
        l1.add("Amit");                //Add Method
        l1.add("Akshay");
        l1.add("Nisha");
        l1.add(0,"Nupur");          //3)Adding somethin at Index position zero
        System.out.println(l1);
        
        List l2=new ArrayList();
        l2.add("geetha");
        l2.add("sireesha");
        l2.addAll(l1);         //Add All Method -Add Collecton in another collecton
        System.out.println(l2);   
          
          
          
          
          
          

	}

}
