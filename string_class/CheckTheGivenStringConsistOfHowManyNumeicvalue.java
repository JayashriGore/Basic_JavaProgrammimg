package string_class;

public class CheckTheGivenStringConsistOfHowManyNumeicvalue {
	static int countofnumeric=0;  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String input = "kv no 2025";
			char [] c1=input.toCharArray();
			for(int i=0;i<c1.length;i++)
			{
			   boolean b3=Character.isDigit(c1[i]);
			   if(b3==true) 
			{
				   countofnumeric++;
			}
			
			}	
			 System.out.println("The total count of numeric value are-->"+countofnumeric);     // print outside of for loop because no need to print count ever time like count1, counr2,count3.check also op by printing inside for loop

	}

}
