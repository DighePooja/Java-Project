package logical_program;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountDuplicateChar_Hashmap1 
{
  public static void main(String[] args) 
  {
	String str="abcdefabcdef";
	char[] ch = str.toCharArray();
	
	HashMap<Character, Integer> Hm=new HashMap();
	
	for(char s1 : ch)  
	{
		if(Hm.containsKey(s1))
		{
			Hm.put(s1, Hm.get(s1)+1);
		}
		else
		{
		   Hm.put(s1,1);	
		}
	}
	
	System.out.println(Hm);
	
	for( Entry<Character, Integer> s2 : Hm.entrySet())
	{
		System.out.print(s2.getKey());
		System.out.print(s2.getValue()+" ");
	}
  }
}
