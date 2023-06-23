package polymorphism;

public class Sample1 //complile time polymorphism-->Ex method overloading 
{
    public void ArithmeticOperators() 
    {   int a=10;
        int b=20;
	    System.out.println(a+b);
	}
    public void ArithmeticOperators(int a, int b) 
    {
	   	System.out.println(a-b);
	}
    public void ArithmeticOperators(int a, int b, int c) 
    {
    	System.out.println(a*b*c);
    }
    public void ArithmeticOperators(int a, float b) 
    {
		System.out.println(a%b);
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) 
	{
	    Sample1 s1=new Sample1();
	    s1.ArithmeticOperators();
	    s1.ArithmeticOperators(15,5);
	    s1.ArithmeticOperators(7, 8, 9);
	    s1.ArithmeticOperators(10, 5.5f);
	}
}
