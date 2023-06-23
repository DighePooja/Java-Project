package logical_program;

public class SumOfDigits_InString1 //Without replace and split
{
  public static void main(String[] args) 
  {
      String str="P7o9o2j5a1";
      int sum=0;
      for(int i=0;i<=str.length()-1;i++)
      {
    	  if(Character.isDigit(str.charAt(i)))
    	  {
    		  sum=sum+Character.getNumericValue(str.charAt(i));
    	  }
      }
  	      System.out.println(sum);    
  }
}
