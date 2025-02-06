package StringBuilder;

public class SB_Method {

	public static void main(String[] args) 
	{  //Append Method
		StringBuilder s1 = new StringBuilder("Automation");
		s1.append(" Testing");          //
		System.out.println(s1);
		
		//Replace method start and endIndex
		System.out.println(s1.replace(11, 18, "Manish"));
		
		//delete method start and endIndex
		StringBuilder s2 = new StringBuilder("Core Java");
		System.out.println(s2.delete(0, 5));
		
		//Insert mathod start and endIndex
		StringBuilder s3 = new StringBuilder("My Brother");
		System.out.println(s3.insert(2, " Dear"));
		
		
		


	}

}
