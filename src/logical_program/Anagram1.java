package logical_program;

public class Anagram1 
{
  public static void main(String[] args)//xxxxxx char order should be same 
  {
	  String s1="peek";
	  String s2="KEEP";
	  
	  // boolean result = s1.equalsIgnoreCase(s2);
	  
	  if(s1==s2)
	  {
		  System.out.println(s1+" and "+s2+" is Anagram");
	  }
	  else
	  {
		  System.out.println(s1+" and "+s2+" is not Anagram");
	  }
  }
}
