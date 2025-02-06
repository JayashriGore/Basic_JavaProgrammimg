package javabasics;
public class ThisCallingOrConstructorChaining {
	
	ThisCallingOrConstructorChaining()
	{
		this(990);
		
		System.out.println("1");
		
	}
	ThisCallingOrConstructorChaining(int a) 
	
		{
			this("MKT","JKT");
		System.out.println("2");
		
	}
		ThisCallingOrConstructorChaining(String a,String b) 
		
		{
			this(false);
		
		System.out.println("3");
		
		}
		
		ThisCallingOrConstructorChaining(boolean answer) {
		}
		{
		System.out.println("4");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ThisCallingOrConstructorChaining();

	}
   



















}
