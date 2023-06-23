package constructor;
                     
public class Sample2 
{
 static int num1;
 static int num2;                       //static globle variable can access directly into non static method
	
 Sample2()
 {
	 num1=10;
	 num2=20;
 }
 
	public void m1() 
    {
	   System.out.println(num1+num2);	
	}
	
	
	public static void main(String[] args) 
	{
		Sample2 s1=new Sample2();
		s1.m1();
	}
}
