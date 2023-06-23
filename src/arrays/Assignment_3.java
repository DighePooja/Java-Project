package arrays;

public class Assignment_3 
{
	public static void main(String[] args) 
	   {                                                         //  0   1  2
		             //    0           1            2            //0  10 50 -20
		int num[][]= {{40,50,20},{10,35,999},{-20,25,1000}};     //1  40 35  999
		             //0   1   2    0  1  2     0   1   2        //2  20 25  100
		
		int largest=num[0][0];   //10
		int smallest=num[0][0];  //
		
		for(int i=0; i<=2; i++) 
		{
		   for(int j=0; j<=2; j++) 
		   {
			 // for(int k=0; k<=2; k++)
				   
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
