package string_class;
public class Reverse_Method 
{
public static void main(String[] args) 
{
        String input ="auto";
        String output = "";               //or output=output+c1;
        for (int i=input.length()-1; i>=0;i--) 
        {
        char c1=input.charAt(i);
        output=output+c1;
        
        }
        System.out.println(output);
	}
}

//i=3
//output=+o=o
//i=2
//output=o+t=ot
//i=1
//output=ot+u=otu
//i=0
//output=otu+a=otua
