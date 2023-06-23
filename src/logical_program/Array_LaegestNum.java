package logical_program;

public class Array_LaegestNum 
{
  public static void main(String[] args) 
  {
	int[] ar= {0,2,8,9,12,17,19,99,-5};
	int max=0;
	
	for( int w : ar)
	{
		if(w>max)
		{
			max=w;
		}
	}
	System.out.println(max);
  }
}

