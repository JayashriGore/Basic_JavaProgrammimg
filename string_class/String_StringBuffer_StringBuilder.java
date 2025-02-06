package string_class;

public class String_StringBuffer_StringBuilder 
{       //Conccat method for all 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstname = new String ("Jayashri");             
		  String fulllname = firstname.concat("Gore");
		   System.out.println(firstname);
		   //Immutable
		   
		   StringBuffer n2 = new StringBuffer ("Jayashri");             
			  n2.append(" Gore");
			   System.out.println(n2);
			   //Mutable
			   
			   StringBuilder s1 = new StringBuilder ("Vijay");             
				  s1.append(" Borde");
				   System.out.println(s1);
				   //Mutable
			   
			   
		   
		   
	}

}
