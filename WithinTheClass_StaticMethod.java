package AccessSpecifier_Methods;
//case1

public class WithinTheClass_StaticMethod 
{
	public static void method1() 
	{
		System.out.println("Static methods can be called without creating objects");
	}
	
	protected static void method2() 
	{
		System.out.println("Jayashri");
	}
	
	 static void method3() 
	{
		 System.out.println("Rajabapu");
	}
	 
	 private static void method4() 
		{
		 System.out.println("Gore");
		}

	
	public static void main(String[] args) 
	{
		WithinTheClass_StaticMethod.method1();      //Class Name.mrthod Name
		WithinTheClass_StaticMethod.method2();
		WithinTheClass_StaticMethod.method3();
		WithinTheClass_StaticMethod.method4();
		
	}

}
