package string_class;

public class ConcatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Jayashri";
		String name1 = " Rajabapu";
		String name2 = " Gore";

		String fullname = name.concat(name1).concat(name2);
		System.out.println(fullname); 
	}

}
 
 /*String firstname ="Jayashri";  / new String ("Jayashri")              //Imutable
  String fulllname = firstname.concat(name2)

 System.out.println(firstname); */                            // not possible string is immutable