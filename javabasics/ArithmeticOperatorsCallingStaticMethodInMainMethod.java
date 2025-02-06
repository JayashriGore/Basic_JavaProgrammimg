package javabasics;

public class ArithmeticOperatorsCallingStaticMethodInMainMethod {
	 static void addition()
	 {
		    int a=10;
		    int b=20;
			int sum=a+b;
			System.out.println("Addition is "+sum);
			
		}
	 static void subtraction()
	 {
		    int a=10;
		    int b=20;
			int sub=a-b;
			System.out.println("subtraction is "+sub);
			
		}

	 static void divide()
	 {
		    int a=10;
		    int b=20;
			int div=a/b;
			System.out.println("Division is "+div);
			
		}
	 static void mutiplication()
	 {
		    int a=10;
		    int b=20;
			int mul=a*b;
			System.out.println("Multiplication is "+mul);
			
		}
	 static void modulus()
	 {
		    int a=20;
		    int b=10;
			int mod=a%b;
			System.out.println("Modulus is "+mod);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		
		addition();
		subtraction();
		divide();
		mutiplication();
		modulus();
		
		
		
		

	}

}
