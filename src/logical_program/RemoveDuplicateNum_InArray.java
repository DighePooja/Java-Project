package logical_program;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateNum_InArray 
{
  public static void main(String[] args) 
  {
	 int ar[]= {1,1,2,2,3,3,4,4,5,5,};
	 HashSet<Integer> hs=new HashSet();
	 
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 hs.add(ar[i]);
	 }
	 for( Integer s1: hs)
	 {
		 System.out.println(s1);
	 }
	 System.out.println("==========");
	 //By using Iterator
	  Iterator<Integer> itr = hs.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
  }
}
