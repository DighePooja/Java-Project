package logical_program;

public class ArmstrongNum 
{
   public static void main(String[] args) 
   {
	 int num=153;
	 int arm=0;
	 
	 for(int i=num;i>0;i=i/10);
	 {
		// int rem=i%10;      
		// arm=arm+rem*rem*rem;		 
	 }
	 System.out.println(arm);
	 if(num==arm)  
	 {
		 System.out.println(num +" is Armstrong num");
	 }
	 else
	 {
		 System.out.println(num +" is not Armstrong num");
	 }	   
   }
}
