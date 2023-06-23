package logical_program;

import java.util.Arrays;

public class Anagram_String 
{
   public static void main(String[] args) 
   {
	   String s1="EARTH";
	   String s2="HEART";
	   
	  char[] ch1 = s1.toCharArray();
	  char[] ch2 = s2.toCharArray(); 
	   
	  Arrays.sort(ch1); 
	  Arrays.sort(ch2); 
	  
	  boolean result = Arrays.equals(ch1, ch2);
	  System.out.println(result); 
	   
	  if(result) 
	  {
		  System.out.println(s1+" and "+s2+" is Anagram " );
	  }
	  else
	  {
		  System.out.println(s1+" and "+s2+" is not Anagram " );

	  }	   
   }
}
