package exception;
import java.util.EmptyStackException;
import java.util.Stack;
public class Checked_EmptyStackException {

	public static void main(String[] args) 
	{
		try {
     Stack<Integer> stack = new Stack<>();
     System.out.println(stack.pop()); // Throws EmptyStackException
      }  
	 catch(EmptyStackException e)
	 {
		System.out.println("Cannot pop from an empty stack.");
	 }
			
	}
}



