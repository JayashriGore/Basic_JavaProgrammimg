 package TypeCastingInJava;
public class PrimitiveType_Casting_Widening 
{
public static void main(String[] args) 
{
	int weight=45;
	
	//int into double
	
	double d1 = weight; // widening -implicitly syntax
	System.out.println(d1);
	// widening can be done in 2 ways
	// Implicitly
	//Explicitly
	double d2 =(double)weight;// widening explicitly syntax
	System.out.println(d2);
}
}
