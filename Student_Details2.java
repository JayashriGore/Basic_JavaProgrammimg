package thiskeyword;

public class Student_Details2 
{
	String  name; // Global Veriable
	   double salary;
	   int empid;
	   void details(String name,double salary,int empid) 
	   {  
		   //Syantax this keyword-->this.globalveribale=localveriable;
		   this.name=name; // now global veriable not longer avilabel it assign to the local 
		              // value to global global veriable now become local veriable
		   this.salary=salary;
		   this.empid=empid;
		   
		   
		   System.out.println("student name is:"+name); // assign Local Veriable to global veriable
	   }
	   void detailsup(double salary,int empid,String name) 
	   {  
		   this.salary=salary; // can use same veiable   order of occurence only change
		   this.empid=empid;
		   this.name=name;
		   System.out.println("student salary is:"+salary);
	   }
	    public static void main(String[] args) 
		{
	    	Student_Details2 s1=new Student_Details2();
	    	s1.details("sita", 63.63, 111);
	    	System.out.println(s1.name);  // all local veriable has been assind to global using this keyword
	    	System.out.println(s1.salary);
	    	System.out.println(s1.empid);
	    	
	    	Student_Details2 s2=new Student_Details2();
	    	s2.detailsup(12.12, 123, "Ram");
	    	System.out.println(s2.salary);                             // all local veriable has been assind to global using this keywordSystem.out.println(s1.salary);
	    	System.out.println(s2.empid);
	    	System.out.println(s2.name);
	    }
	 }
