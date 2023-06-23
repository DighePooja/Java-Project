
package all_program_practice;

public class Method_call1
{
    public static void main(String[] args) 
    {
		m1();                                 //static regular method call from same class
		
		Method_call1 s1=new Method_call1();   //non static regular method call from same class
		s1.m2();
		
		Method_call2.m5();
		 
		Method_call2 s2=new Method_call2();
		s2.m3();
		s2.m4();
		
	}
    public static void m1() 
    {
    	int a=10;
        int b=20;
		System.out.println(a+b);
		System.out.println("-------------");
	}
    
    public void m2() 
    {
    	String name;
    	int rollnum;
    	
    	name= "Pooja";
    	rollnum=109;
    	System.out.println(name+"\n"+rollnum);
		
	}
    
    
    
    
    
    
    
    
    
}
