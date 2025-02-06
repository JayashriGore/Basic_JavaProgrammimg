package string_class;

public class CheckTheGivenStringConsistOfHowManySpecialCharacters {
	static int countofalpha=0;
	static int countofspace=0;  
	static int countofnumeric=0; 
	static int countofspecialcharacters=0; 
	public static void main(String[] args) 
	{
		String input = "#Hi @Hello *2025!$";
		char [] c1=input.toCharArray();
		for(int i=0;i<c1.length;i++) 
		{
			   
			boolean b1=Character.isAlphabetic(c1[i]);
		    //System.out.println(b1);
		if(b1==true) 
		{
			countofalpha++;
		}
		boolean b2=Character.isWhitespace(c1[i]);
		   if(b2==true) 
		{
			countofspace++;
		}
		   boolean b3=Character.isDigit(c1[i]);
		   if(b3==true) 
		{
			   countofnumeric++;
		}
		
}	
		
	System.out.println("The total count of alphabates are-->"+countofalpha);     // print outside of for loop because no need to print count ever time like count1, counr2,count3.check also op by printing inside for loop
	System.out.println("The total count of spaces are-->"+countofspace);
	System.out.println("The total count of numeric value are-->"+countofnumeric); 
	int countofspecialcharacters= input.length()-(countofalpha+countofspace+countofnumeric);
	System.out.println("The total count of special characters are-->"+countofspecialcharacters);
	
}
}
