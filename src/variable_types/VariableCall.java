package variable_types;

public class VariableCall 
{
   int x=9;
   int y=6;
	
	public static void m1()
	{
		VariableCall v=new VariableCall();
		System.out.println(v.y);
		System.out.println(v.x);
	}
	
	public void m2()
	{
		System.out.println(x+"\n"+y);
	}
	
	public static void main (String[] args)
	{
		
		m1();
		
		VariableCall v=new VariableCall();
		v.m2();
		
		VariableCall2.m3();
		
	 	VariableCall2 j=new VariableCall2();
	 	j.m4();
		
		
	}
	
	
	
}
