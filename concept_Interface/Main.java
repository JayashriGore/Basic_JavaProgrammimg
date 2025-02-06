package concept_Interface;

interface Employee
{
    void printEmpName();  // Abstract Method
    void printEmpId();    // Abstract Method
}
interface Departement
{
    void printEmpDept();   // Abstract Method
}
class Salary
{
	void printEmpSal()                              // Concrete non-static method
	{
		 System.out.println("The Employee Salary is confendetial");  
	}
}
public class Main extends Salary implements Employee,Departement         //class to class -->extends
                                                                        //class to interface-->implements
{
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
        Main m1 = new Main();
		m1.printEmpName();
		m1.printEmpId();
		m1.printEmpDept();
		m1.printEmpSal();
}
    @Override
	public void printEmpDept() {
		 System.out.println("Employee Dept is Testing");  
		
	}

	@Override
	public void printEmpName() {
		 System.out.println("Employee Name is Jayashri"); 
	}

	@Override
	public void printEmpId() {
		 System.out.println("Employee Id is 12345"); 
		
	}

}
