package variable_types;

public class Demo_2              
{   
	static int a=20;

    public static void main(String[] args) 
    {
    	
		
		System.out.println("----SG variable of static main method of same class"); 
		System.out.println(a);                           //---->variable name 
		
		Demo_2 obj1=new Demo_2();                        //Non static method of same class--->1) Object creation of class
		System.out.println("----SG variable of non static regular method of same class"); 
		obj1.m1();                                                                         // 2) method call ?
		
		
		System.out.println("----SG variable of static regular method of same class"); 
		Demo_2.m2();                                      //class name.method name();		
		
		System.out.println("----static globle variable call from diff class");
		System.out.println(Demo_3.b);                    // diffclassname.variable name
		
	}
	
	
	public void m1() 
	{
		
		System.out.println(a);
		
	}
	
	public static void m2() 
	{
		System.out.println(a);
	}
}
