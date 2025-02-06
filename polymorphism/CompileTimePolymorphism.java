package polymorphism;

public class CompileTimePolymorphism 
{
	public void camera() 
	{
		System.out.println("10 MP");
	}
	public void camera(int a) 
	{
		System.out.println(20);
	}
	public void camera(String a) 
	{
		System.out.println("30 MP");
	}
	public static void main(String[] args) 
	{
		CompileTimePolymorphism  p1 = new CompileTimePolymorphism ();
		p1.camera();
		p1.camera(0);
		p1.camera("abc");
	}

}
