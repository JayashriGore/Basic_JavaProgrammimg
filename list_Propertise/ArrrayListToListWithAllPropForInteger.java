package list_Propertise;
import java.util.ArrayList;
import java.util.List;

public class ArrrayListToListWithAllPropForInteger {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Converting ArrayList to List
        List<Integer> list = arrayList;

        // Display the original list
        System.out.println("Original List: " + list);

        // Using List methods

        // 1. Adding an element at the end
        list.add(50);
        System.out.println("After adding an element: " + list);

        // 2. Removing an element by index
        list.remove(2); // Removes element at index 2
        System.out.println("After removing element at index 2: " + list);

        // 3. Checking if an element exists
        boolean contains = list.contains(30); 
        System.out.println("List contains 30: " + contains);

        // 4. Accessing an element by index
        Integer element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // 5. Setting an element at a specific index
        list.set(1, 100);
        System.out.println("After setting element at index 1: " + list);

        // 6. Iterating through the list using for-each loop
        System.out.println("Iterating through the list:");
        for (Integer value : list) {
            System.out.println(value);
        }

        // 7. Getting the size of the list
        System.out.println("Size of the list: " + list.size());
		

	}

}
