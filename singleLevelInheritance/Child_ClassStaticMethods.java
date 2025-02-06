package singleLevelInheritance;

class Parent_Class
{
	
	static void login()
	
	{
		System.out.println("This is parent class method1");
	}
	
static void logout()
	
	{
	System.out.println("This is parent class method2");
	}

static void sensetiveinfo()

{
	System.out.println("This is parent class method3"); 
}
	
}


public class Child_ClassStaticMethods extends Parent_Class

{

	
	
  static void testcase1()
	
	{
	  System.out.println("This is child class method1"); 
	}
  
  static void testcase2()
	
	{
	  System.out.println("This is child class method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
		testcase1();
		logout();
		testcase2();

	}

}
