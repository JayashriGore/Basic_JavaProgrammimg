package linklist_prop;

import java.util.LinkedList;

public class ToArray {

	public static void main(String[] args) 
	{
		
		LinkedList<Character> charList = new LinkedList<>();
        charList.add('J');
        charList.add('A');
        charList.add('V');
        charList.add('A');

        // Convert LinkedList to char[]
        char[] charArray = toCharArray(charList);

       
        System.out.println(charArray);
    }

    public static char[] toCharArray(LinkedList<Character> list) {
        // Create a char array with the size of the LinkedList
        char[] array = new char[list.size()];

        // Iterate through the LinkedList and fill the char array
        int i = 0;
        for (Character c : list) 
        {
            array[i++] = c;
        }

        return array;
	}

}
