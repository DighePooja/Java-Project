package logical_program;

public class PrimeNum_InArray 
{
  public static void main(String[] args) 
  {
	  int[] ar= {1,2,1,9,8,5,6,7,3,4};
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  int count=0;
		  for(int j=1;j<=ar[i];j++)
		  {
			 if(ar[i]%j==0)
			 {
				 count++;
			 }
		  }
		  if(count==2)
		  {
			  System.out.println(ar[i]+"  is prime num");
		  }
	  }
  }
}
