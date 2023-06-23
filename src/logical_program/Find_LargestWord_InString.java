package logical_program;

public class Find_LargestWord_InString 
{
   public static void main(String[] args) 
   {
	   String s1="My name is pooja";
	   String[] s2 = s1.split(" ");
	   
	   String Largestword="";
	   for( String W: s2)
	   {
		   if(W.length()>Largestword.length())
		   {
			   Largestword=W;   
		   }
	   }
	   System.out.println(Largestword);
   }
}

