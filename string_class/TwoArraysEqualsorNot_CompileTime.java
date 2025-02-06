package string_class;

import java.util.Arrays;
                                        //Program for check 2 arrays are equals to each other or not
public class TwoArraysEqualsorNot_CompileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]=new int [4];
		rollno[0]=34;
		rollno[1]=35;
		rollno[2]=36;
		rollno[3]=37;
		int rollno1[]=new int [4];
		rollno1[0]=34;
		rollno1[1]=35;
		rollno1[2]=36;
		rollno1[3]=37;
    boolean answer = Arrays.equals(rollno, rollno1);
	System.out.println(answer);

	}

}
