package SurpriseTest_JAVA;

public class Local_Global 
{
	static int a=10;
	int a2=100;
	static int a3;
	static int s=90;

	public static void main(String[] args) 
	{
		Local_Global l1 = new Local_Global ();
		s=900;
		int a1=20;
		a=19;
		a1=20;
		
		System.out.println(a); 
		
		System.out.println(l1.a2); 
		

	}

}
