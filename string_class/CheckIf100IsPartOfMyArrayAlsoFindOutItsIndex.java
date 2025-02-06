package string_class;
public class CheckIf100IsPartOfMyArrayAlsoFindOutItsIndex 
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
	array1[0]=78;	
	array1[1]=100;
	array1[2]=45;
	array1[3]=46;
	
	int notocheck=100;
	
	for(int i=0;i<array1.length;i++)
	{
	if(notocheck==array1[i])
	{
		System.out.println("Yes 100 is a part of the array and its index is "+i);
	//	System.out.println(" And its index is-> "+ i);
	}
	else
	{
		System.out.println("No, 100 is not a part of array");
	}
	}								

	
	
}
}
