package string_Buffer;

public class Delete_Method {

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Automation");
		
		s1.append(" Testing");          //
		System.out.println(s1);
		System.out.println(s1.delete(11, 18));// Delete char index last index-1 becuse of subtring always-1
		
	}

}
