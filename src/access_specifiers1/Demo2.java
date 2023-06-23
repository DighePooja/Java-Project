package access_specifiers1;

                      //Default Access specifier  --->scope remains for that perticular package
    public class Demo2
{
    int num1; 
	int num2;
	Demo2(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public static void main(String[] args)      
	{
		Demo2 s2=new Demo2(10,20);
		s2.m2();
		
		//Demo1 s1=new Demo1();		     //non static method call from demo 1 
		//s1.m1();
	}
	
	void m2() 
	{
		System.out.println(num1*num2+"\n"+num1+num2+"\n"+num1/num2);
		System.out.println(num1>=num2);  
		System.out.println(num1<=num2);    
	}
	
	
	
	
	
	
}
