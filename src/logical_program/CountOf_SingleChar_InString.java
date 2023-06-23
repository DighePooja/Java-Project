package logical_program;

public class CountOf_SingleChar_InString 
{
   public static void main(String[] args) 
   {
	  String s1="aakanksha";
	  char c='a';
	  int count=0;
	  for(int i=0;i<=s1.length()-1;i++)
	  {
		  if(s1.charAt(i)==c)
		  {
			  count++;
		  }
	  }
	  System.out.println(count);
   }
}
