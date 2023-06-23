package logical_program;

public class Evennum1 
{
    public void m1() 
    {
	  for(int i=2; i<=24; i++)	
	  {
		  if(i%2==0) 
		  {
			  System.out.println(i);
		  }
      }
	}
    
    public static void main(String[] args)
    {
    	Evennum1 E1=new Evennum1();
    	E1.m1();
	}
}
