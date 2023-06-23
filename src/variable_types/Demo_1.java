package variable_types;

public class Demo_1
{
    int i=5;                                         //non static Globle Variable
    
    public static void main(String[] args) 
    {
    	int a=10;                                     ////Local variable
			
    	System.out.println("local variable a"+" :"+a);
		
    	
		Demo_1 obj1=new Demo_1();                    //object creation of same class(NSRM) to call NS globle variable in to main method
		obj1.m1();
		obj1.m2();
		
	}
    
    public void m1() 
    {
    	int b=20;                                      ////Local variable
		System.out.println("NS globle variable from m1"+" :"+i);
		System.out.println("local variable b"+" :"+b);
	}
   
    public void m2() 
    {
    	int c=30;                                     ////Local variable
		System.out.println("NS globle variable from m2" + ":" +i);
		System.out.println("local variable c"+" :"+c);
	}
    
    public static void m3()
    {
    	Demo_1 d=new Demo_1();
    	System.out.println(d.i);
    	
    }
    
}
