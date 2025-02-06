package singleLevelInheritance;

class ClassA
{
	
	   void login()
	
	{
		System.out.println("This is parent class method1");
	}
	
            void logout()
	
	{
	System.out.println("This is parent class method2");
	}

         void sensetiveinfo()

{
	System.out.println("Do not access its sensetive information"); 
}
	
}
public class ClassB_Nonstatic extends ClassA { 


       void testcase1()
   {
	   
   System.out.println("This is child class method1"); 
	}
  
        void testcase2()
	
	{
	  System.out.println("This is child class method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB_Nonstatic b = new ClassB_Nonstatic();
		
		b.login();
		b.sensetiveinfo();
		b.testcase1();
		b.testcase2();
		b.logout();
		
		
	}
	
}
	
	











	
	