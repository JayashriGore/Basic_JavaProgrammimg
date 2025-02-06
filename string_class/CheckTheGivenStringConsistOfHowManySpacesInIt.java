package string_class;

public class CheckTheGivenStringConsistOfHowManySpacesInIt {
	static int countofspace=0;  
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  String input = "kv no 2";
			char [] c1=input.toCharArray();
			for(int i=0;i<c1.length;i++)
			{
			   
				boolean b2=Character.isWhitespace(c1[i]);
			   if(b2==true) 
			{
				countofspace++;
			}
			
			}	
			
			System.out.println("The total count of spaces are-->"+countofspace);     // print outside of for loop because no need to print count ever time like count1, counr2,count3.check also op by printing inside for loop
		}

	}


