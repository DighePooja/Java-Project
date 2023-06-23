package logical_program;

public class Largest_Smallest_secLargest_Num_FromArray 
{
    public static void main(String[] args) 
    {
	   int [] ar={10,20,9,60,90,109};
	   int smallest=ar[0];
	   int largest=ar[0];
	   int seclargest=ar[0];
    
	   for(int i=0;i<=ar.length-1;i++)
	   {
		   for(int j=0;j<=ar.length-1;j++)
		   {
			 if(ar[i]>largest)
			 {
				 largest=ar[i];
			 }
			 if(ar[i]<smallest)
			 {
				 smallest=ar[i];
			 }
			 if(ar[i]>smallest && ar[i]<largest)  
			 {
				 seclargest=ar[i];
			 }
			   
					   
		   }
	   }
	   System.out.println("S");
	}
}
