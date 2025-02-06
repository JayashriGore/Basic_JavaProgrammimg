package pro_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Add_AddAll {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("Amit");                //Add Method
        a1.add("Akshay");
        a1.add("Nisha");
        a1.add("Nupur");          //3)Adding somethin at Index position zero
        System.out.println(a1);
        
        List a2=new ArrayList();
        a2.add("geetha");
        a2.add("sireesha");
        a2.addAll(a1);         //Add All Method -Add Collecton in another collecton
        System.out.println(a2);   

	}

}
