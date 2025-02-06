package string_class;

public class CheckTheGivenStringConsistOfHowManyAlphabets 
{
      static int countofalpha=0;            //taken as a global veriable becuse in this only we going to stoare the count of total alphabate that i have in this given string
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "kv no 2";
		char [] c1=input.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
		   
			boolean b1=Character.isAlphabetic(c1[i]);
		    //System.out.println(b1);
		if(b1==true) 
		{
			countofalpha++;
		}
		
		}	
		
		System.out.println("The total count of alphabates are-->"+countofalpha);     // print outside of for loop because no need to print count ever time like count1, counr2,count3.check also op by printing inside for loop
	}
	
}
