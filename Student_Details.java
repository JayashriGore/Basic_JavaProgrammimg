package thiskeyword;

public class Student_Details 
{
   String  name; // Global Veriable
   double salary;
   int empid;
   void details(String name,double salary,int empid) 
   {
	   System.out.println("student name is:"+name); // assign Local Veriable to global veriable
   }
    public static void main(String[] args) 
	{
    	Student_Details s1=new Student_Details();
    	s1.details("sita", 63.63, 111);
    	System.out.println(s1.name);
    	System.out.println(s1.salary);
    	System.out.println(s1.empid);
    	

	}

}
