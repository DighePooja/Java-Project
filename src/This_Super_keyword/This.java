package This_Super_keyword;

public class This extends Super
{
    int num=9;
    
	
	
	public static void main(String[] args) 
	{
		This t=new This();
		t.m1();
	}
	
	public void m1() 
	{
		int num=5;
		
		System.out.println("local variable: "+num);
		System.out.println("VAriable call from same class: "+this.num);
		System.out.println("Variable call from diff class: "+super.num);
	}
	
	
	
	
	
	
	
	
}
