 package SibAndIIBBlock;

public class ExecutionHirarchyofALL 
{
	static //SIB Block
	{
		System.out.println("this is SIB block");   // SIB Block Always execute First before main method
	}
	ExecutionHirarchyofALL()
	
	{
		System.out.println("this is constructor"); //constroctor execute 4 th
	}
	{
		System.out.println("this is IIB block"); //IIB Block exceute 3 rd
	}
	
	public static void main(String[] args) //Main mathod execute second
	{
		System.out.println("Main Method");
		new ExecutionHirarchyofALL();
		
	}
	

}
