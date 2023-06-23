package logical_program;

public class Duplicate_Character_InString 
{
  public static void main(String[] args) 
  {
	  String s1="poojaa";
	  
	  char[] ar =s1.toCharArray();
	  
	  for(int i=0; i<=s1.length()-1; i++)
	  {
		  for(int j=i+1; j<=s1.length()-1; j++)
		  {
			  if (ar[i]==ar[j])
			  {
				  System.out.println("Duplicate char in String is: "+ar[j]);
			  }
		  }
	  }
  }
}
