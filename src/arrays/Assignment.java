package arrays;

public class Assignment 
{
   public static void main(String[] args) 
   {
	          //0  1   2  3   4
	int num[]= {10,30,60,-25,-40,190};
	   	
	int largest= num[0];
	int smallest= num[0];
	              
	for(int i=1; i<=4; i++)
	{
		if(num[i]>largest)
			
	    largest=num[i];  //190
		
		else if (num[i]<smallest)
			
		smallest=num[i];   //-25
	}
	System.out.println("Largest number is: "+largest);
	System.out.println("smallest number is: "+smallest);
   }   
}
