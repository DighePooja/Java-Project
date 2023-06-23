package logical_program;

public class SumOfDigits_InString2 //By replace and Split
{
   public static void main(String[] args) 
   {
	      String str="9p2o7o1j6a5";
		  String s1 = str.replaceAll("[a-z]", "");
		   		  
		  String[] s2 = s1.split(""); 
		   
		  int sum=0;
		  for(int i=0;i<=s2.length-1;i++)
		  {
			  sum=sum+Character.getNumericValue(s1.charAt(i));
		  }
		   System.out.println(sum);	
		   
   }
}
