package logical_program;

public class EvenOdd3 
{
  public void m1() 
  {
	for(int i=1; i<=100; i++)
	{
		if(i%2==0)
		{
			System.out.println(i+" Is Even Number"+"\n"+"<-------->");
		}
		
		else  
			
		{
			System.out.println(i+" Is Odd Number"+"\n"+"<--------->");
		}
	}
  }
  
  public static void main(String[] args) 
  {
	  EvenOdd3 E1=new EvenOdd3(); 
	  E1.m1();
  }
}
