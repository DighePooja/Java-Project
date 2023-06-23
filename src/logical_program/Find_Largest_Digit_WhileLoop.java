package logical_program;

public class Find_Largest_Digit_WhileLoop 
{
   public static void main(String[] args) 
   { 
	   int num=123459;
	   int LargestDigit=0;
	   
	   while(num>0)
	   {
		   int rem=num%10;            //to get the last digit
		   if(LargestDigit<rem)
		   {
			   LargestDigit=rem;
		   }
		   num= num/10;              //to remove the last digit
	   }
	   System.out.println("Largest num is : "+LargestDigit);

   }
}
