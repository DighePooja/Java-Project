package logical_program;

import java.util.HashMap;

public class CountDuplicateChar_HashMap2 
{
    public static void CharCount(String name) 
    {
      HashMap<Character, Integer> Hm=new HashMap();      
      char[] ch = name.toCharArray();
      
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
      System.out.println(name+" : "+Hm );
	}  
    
    public static void main(String[] args) 
    {
    	CharCount("poojaa");	
	}
}
