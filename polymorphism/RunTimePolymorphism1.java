package polymorphism;

class Parents {
public void showcase () {
System.out.println("I am Parent");
}
}
class Children extends Parents {
@Override
public void showcase () {
System.out.println("I am Children");
}
}
public class RunTimePolymorphism1 // why this class?
{
 public static void main(String args[]) {
 Parents p1 = new Parents();
 p1.showcase(); //method of parent class is called
 Parents p2 = new Children(); // upcasting
 p2.showcase();//method of child class is called by Parent reference, this is called "Run time Polymorphism"
 Children c1 = new Children();
 c1.showcase(); //method of child class is called
}
}