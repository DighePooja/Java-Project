package logical_program;

public class PrimeNo_Or_Not 
{
  public static void main(String[] args) 
  {
	int n=4;  
	int count=0;
	
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
	    count++;
	}
	
		if(count==2)
		{
			System.out.println(n +" is prime num");
		}
		else
		{
		   System.out.println(n +" is not prime num");	
		}
	
  }
}
