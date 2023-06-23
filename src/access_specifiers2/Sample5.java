package access_specifiers2;

import access_specifiers1.Demo5;

public class Sample5 extends Demo5
{
    
	protected Sample5(int a, int b) 
	{
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		//Demo5 s2=new Demo5(5,6);
		//s2.add();
		
		Sample5 s1=new Sample5(10,15);
		s1.add();
		
		
		
		
		
	}
	
	
	
	
}
