package constructor;

public class Multiple_constructor2 
{                             //Declaration of globle variable
    int num1;
    int num2;                
    String name;
    float per;
    char grade;
    
    Multiple_constructor2()
    {
    	num1=10;              //initialization of global variable in constructor
    	num2=20;
    	name="pooja";
    	per= 95.5f;
    	grade= 'A';
    }
    Multiple_constructor2(int a,int b ,String s1, float s2,char s3)
    {
       num1=a;
       num2=b;
       name=s1;                 //initialization of globle variable (using local variable--methods with parameter)
       per =s2;
       grade =s3;  	
    }
	public void m1() 
	{
		System.out.println(num1+num2+"\n"+name+"\n"+per+"\n"+grade);        //
			
	}
	public void m2() 
	{
		System.out.println("<----------->");
		System.out.println(num1*num2+"\n"+name+"\n"+per+"\n"+grade);	
	}
	public static void main(String[] args) 
    {
		Multiple_constructor2 obj1=new Multiple_constructor2();
		obj1.m1();			
		
		Multiple_constructor2 obj2=new Multiple_constructor2(5,10,"Pooja Dighe",90.5f,'B');
		obj2.m2();
		
		
		
		Multiple_constructor3 obj3=new Multiple_constructor3();
		obj3.NSRm1();
		
		obj3.NSRm2();
		
		Multiple_constructor3 obj4=new Multiple_constructor3(10,20);
		obj4.NSRm2();
	}
	
	
	
	
	
	
	
	
}
