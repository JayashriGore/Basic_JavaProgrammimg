package string_class;

public class Palindrome_Function {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String input = "madam";
	        String output = "";
	        for (int i =input.length()-1; i>=0;i--) 
	        {
	        char c1=input.charAt(i);
	        output=output+c1;
	        }
	        System.out.println("Input is -->"+input);
	        System.out.println("Output is -->"+output);
	        if(input.equals(output));
	        {
	        	 System.out.println("It is a palindrome");
	        }
	        //else 
	        //{
	        //	 System.out.println("It is not a palindrome");
	       // }
	}

}

