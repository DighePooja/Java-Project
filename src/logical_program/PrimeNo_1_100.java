package logical_program;

public class PrimeNo_1_100 
{
  public static void main(String[] args) 
  {
	  for(int i=2;i<=100;i++)
	  {
		  int count=0;
		  for(int j=2;j<=i;j++)  //or j<i
		  {
			  if(i%j==0)
			  {
				  count++;
			  }
		  }
	  
	  if(count==1)               //or count==0
	  {
		 System.out.println(i+ "  Prime Num"); 
	  }	
	  }
  }
}
