package SibAndIIBBlock;

public class SIB_Block 
{
	static //SIB Block
	{
		System.out.println("SIB Block");   // SIB Block Always execute First before main method
	}
	//IIB Block
	{
		System.out.println("IIB Block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}

}
