package logical_program;

import java.util.LinkedHashSet;

public class Duplicate_Character_Remove_LinkedHashSet 
{
   public static void main(String[] args) 
   {
	   String str="poojaa";
	   char[] ch = str.toCharArray();
	   
	   LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	   
	   for(int i=0;i<=ch.length-1;i++)
	   {
		   lhs.add(ch[i]);
	   }
	   System.out.println(lhs);
	   for( Character s1 : lhs)
	   {
		  System.out.print(s1);   
	   }	   
   }
}
