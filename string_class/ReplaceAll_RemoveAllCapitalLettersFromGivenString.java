package string_class;

public class ReplaceAll_RemoveAllCapitalLettersFromGivenString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String input = "Manish Kumar Tiwari";
		//System.out.println(input.replace('M', 'A'));
		//System.out.println(input.replace("Tiwari","rai"));
		//1.Program -lets remove all capital letters from the given string
		System.out.println(input.replaceAll("[A-Z]", "")); //  only want remove
		//System.out.println(input.replaceAll("[A-Z]", "K"));  // We can replace also with new char
		//2.Letes remove all lower lettters from the given string
		System.out.println(input.replaceAll("[a-z]", ""));
		//3.Letes remove all the numeric value from the given string
		String s1 = "KV No 2";
		System.out.println(s1.replaceAll("[0-9]", ""));
		
		
		
		
		
		

	}

}
