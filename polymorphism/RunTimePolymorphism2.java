package polymorphism;

class parent 
{
public void add() 
{
	System.out.println("I am parent class");	
}	
}
class child extends parent 
{
	public void add() 
	{
		System.out.println("I am child class");	
	}	
}

public class RunTimePolymorphism2 
{
public static void main(String[] args) 
	{
	child c1 = new child(); // add method for child ,depends on objet cratuin yoy can either called parent class method
	                        //or child cladd methiod is called RTP
	c1.add();
	//parent p1 = new parent ();
	//p1.add();                   // add method for parent class
    
	}

}
