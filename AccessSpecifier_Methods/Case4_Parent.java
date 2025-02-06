package AccessSpecifier_Methods; //Case4 without Relation or no subclass

public class Case4_Parent {

	public static void addition() 
		{
			System.out.println("This method is public");
		}
		
		protected static void substraction() 
		{
			System.out.println("2nd method is protected");
		}
		

		 static void multiplication() 
		{
			System.out.println("Default method is not accessible outsise the package using sub class ");
		}
		 
		 private static void division()  
			{
				System.out.println("Private method is not accessible outsise the package using sub class  ");
			}
		 
		 public void method1() 
			{
				System.out.println("Non Static methods can be called by creating objects of Parent class if no subclass");
			}
			
			protected  void method2() 
			{
				System.out.println("Jayashri Gore");
			}
			
			  void method3() 
			{
				 System.out.println("Gore");
			}


	}


