package AccessSpecifier_Methods; //Case2

public class Class2_withinThePackage {

	public static void main(String[] args) 
	{
		// ClassName.MethodName
		Class1_withinThePackage_StaAndNonStatic.addition();  // static methods
		Class1_withinThePackage_StaAndNonStatic.substraction();
		Class1_withinThePackage_StaAndNonStatic .multiplication();
		
		
		//Non_static Methods by creating object
		Class1_withinThePackage_StaAndNonStatic p1 = new Class1_withinThePackage_StaAndNonStatic();
		p1.method1();
		p1.method2();
		p1.method3();
		
		

	}

}
