package logical_program;

public class SumOfDigits_InString3 
{
   public static void main(String[] args) 
   {
	   String str="p1o7o1o2j9a8";
	   String s1 = str.replaceAll("[a-z]","");
	   int sum=0;
	   for(int i=0;i<=s1.length()-1;i++)
	   {
		   sum+=Character.getNumericValue(s1.charAt(i));
	   }
	   System.out.println(sum);
   }
}
