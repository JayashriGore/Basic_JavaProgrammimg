package exception;

public class UnChecked_NullPointerException {

	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length()); // NullPointerException
		str.length();
		//It occurs when you attempt to use an object reference that has not been initialized
              //OR
              //String str = "";
              //System.out.println(str.length())
             
	}

}
