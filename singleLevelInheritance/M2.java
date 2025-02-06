package singleLevelInheritance;

public class M2 extends M1
{
	
	void bark() {
        System.out.println("The dog barks.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M2 m = new M2();
		
		m.eat();
		m.bark();

	}

}
