package pro_ArrayList;

import java.util.ArrayList;

public class ArrayList_With3Constructor {

	public static void main(String[] args) 
	{
		//Default Constructor
	ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);

    // Constructor with initial capacity
    ArrayList<Integer> list2 = new ArrayList<>(15);
    list2.add(30);
    list2.add(40);

    // Constructor with a collection
    ArrayList<Integer> list3 = new ArrayList<>(list2);
    list3.add(50);

    // Print lists
    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);
    System.out.println("List 3: " + list3);
  }
}
