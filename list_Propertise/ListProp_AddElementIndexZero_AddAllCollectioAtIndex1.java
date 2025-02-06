package list_Propertise;

import java.util.ArrayList;
import java.util.List;

public class ListProp_AddElementIndexZero_AddAllCollectioAtIndex1 {

	public static void main(String[] args) {
		List l1=new ArrayList();
        l1.add("Amit");                //Add Method
        l1.add("Akshay");
        l1.add("Nisha");
        l1.add(0,"Nupur");          //3)Adding somethin at Index position zero
        System.out.println(l1);
        
        List l2=new ArrayList();
        l2.add("geetha");
        l2.add("sireesha");            
                             
        l2.addAll(1, l1);  //l2->1+l1+l2->2           4) // Add all at index 1 Add l1; Means adding l1 at index 1 Instead of sireesha will add l1 element
                                                                        //AddAll Int Index Collection  
        System.out.println(l2);   
        
        

	}

}
