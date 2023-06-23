package logical_program;

public class LargestNum_FromThreeNumbers 
{
   public static void main(String[] args) 
   {
	  int a=10;
	  int b=90;
	  int c=60;
	   
	  if(a>b && a>c) 
	  {
		System.out.println("Largest num is "+a);  
	  }
	  else if(b>a && b>c)
	  {
		  System.out.println("Largest num is "+b);
	  }
	  else if (c>a && c>b)
	  {
		  System.out.println("Largest num is "+c);
	  }
		    
   }
}
