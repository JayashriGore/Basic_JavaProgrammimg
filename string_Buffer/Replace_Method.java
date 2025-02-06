package string_Buffer;

public class Replace_Method {

	public static void main(String[] args) {
StringBuffer s1 = new StringBuffer("Manish");
		
		s1.append(" Tiwari");          //
		System.out.println(s1);
		System.out.println(s1.delete(11, 18));
		System.out.println(s1.replace(7, 11, "Rai"));
		

	}

}
