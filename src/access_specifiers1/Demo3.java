package access_specifiers1;
                                //access specifier -->public ---->scope remains in overall project

public class Demo3 
{
   public int num1;
   
   public Demo3()
   {
	   num1=10;
   }
	
	public static void main(String[] args) 
	{
	  Demo3 d1=new Demo3();
	  d1.cubeofnum();
	}
	
	public void cubeofnum() 
	{
	  System.out.println(num1*num1*num1);	
	}
	
	
	
}
