package AccessSpecifier_Methods;

public class WithinTheClass_NonStaticMethod 
{
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
		 System.out.println("Rajabapu");
	}
	 
	 private void method4() 
		{
		 System.out.println("Gore");
		}

	public static void main(String[] args) 
	{
		WithinTheClass_NonStaticMethod m1=new WithinTheClass_NonStaticMethod ();
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();

	}

}
