package access_specifiers1;

                            //Access specifier--->private  --->scope remains for the class 
public class Demo1 
{
     private int a;
    
     private Demo1()
    {
       	a=10;
    }
	
	 public static void main(String[] args) 
	{
	  Demo1 s1=new Demo1();
	  s1.m1();	
	}
	
	private void m1() 
	{
	  System.out.println(a*a);	
	}
}
