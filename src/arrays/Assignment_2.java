package arrays;

public class Assignment_2 
{
	 public static void main(String[] args) 
	   {                                                      
		             //    0           1            2           
		int num[][]= {{-10,50,20},{-40,35,999},{20,25,1000}};       
		             //0   1   2    0  1  2     0   1   2        
		
		int largest=num[0][0];   //10
		int smallest=num[0][0];  //
		
		for(int i=0; i<=2; i++) 
		{
		   for(int j=0; j<=2; j++) 
		   {
			   if(num[i][j]>largest)
			   
				 largest=num[i][j];  
			   
			   else if(num[i][j]<smallest)
			   
				   smallest=num[i][j];
			   
		   }
	    } 
		   System.out.println("Largest number is: "+largest);
		   System.out.println("smallest number is: "+smallest);
		
	   }	
}
