package TypeCastingInJava;

public class PrimitiveType_Casting_Narrowing {

	public static void main(String[] args) {
		//Double into int
		//Narowing Explicitly
		double a = 87.45;
		int manishwt=(int)a; // Narrowing-only done with Explicitly 
		System.out.println(manishwt);
		
		//OR
		byte dp = (byte) 96.65; //converting double to byte type
		System.out.println(dp); // Narrowing explicitly
		
		

	}

}
