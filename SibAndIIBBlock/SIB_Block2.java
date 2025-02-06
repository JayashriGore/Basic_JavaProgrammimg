package SibAndIIBBlock;

public class SIB_Block2 
{
	//IIB Block
		{
			System.out.println("IIB Block");
		}
	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
	}
	static //SIB Block1
	{
		System.out.println("SIB Block1");   // SIB Block Always execute First before main method
	}
	static //SIB Block2
	{
		System.out.println("SIB Block2");   // SIB Block Always execute First before main method
	}
}
