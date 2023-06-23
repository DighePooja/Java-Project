package logical_program;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar_fromString 
	{
	   public static void main(String[] args) 
	   { 
		  String str="ppuujjaa";
		  char[] ar = str.toCharArray();
		  
		  LinkedHashSet<Character> lhs=new LinkedHashSet();
		  for(int i=0;i<=str.length()-1;i++)
		  {
			  lhs.add(ar[i]);  
		  }
		  for(Character W : lhs)
		  {
			  System.out.print(W);
		  }
		  //OR
		  System.out.println();
		  System.out.println("--using iterator--");
		  
		  Iterator itr = lhs.iterator();	  
		  while(itr.hasNext())
		  {
			  System.out.print(itr.next());
		  }
	   }	  
	}	

