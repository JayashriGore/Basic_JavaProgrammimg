package AccessSpecifier_Methods;     //Case2

public class Class1_withinThePackage_StaAndNonStatic 
{
	public static void addition() 
	{
		System.out.println("1st method is public");
	}
	
	protected static void substraction() 
	{
		System.out.println("2nd method is protected");
	}
	

	 static void multiplication() 
	{
		System.out.println("3rd method is defult or package ");
	}
	 
	 private static void division() 
		{
			System.out.println("4th method is private ");
		}
	 
	 public void method1() 
		{
			System.out.println("Non Static methods can be called by creating objects");
		}
		
		protected  void method2() 
		{
			System.out.println("Jayashri");
		}
		
		  void method3() 
		{
			 System.out.println("Gore");
		}
		 
		 //private void method4()  // not accessible outsise the class
			//{
			// System.out.println("Gore");
			//}


	

}
