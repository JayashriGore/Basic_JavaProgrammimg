package concept_Interface;                            // Single level example

interface API  
{
	void apikey();  //abstract method
}


public class Amazon implements API
{

	public static void main(String[] args) 
	{
		Amazon a = new Amazon();
		a.apikey();
	}

	@Override
	public void apikey()
	{
		System.out.println(" Write the logic here"); 
		
	}

}
