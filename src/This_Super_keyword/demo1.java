package This_Super_keyword;

public class demo1 extends demo2
{
	 int a=9;

    public static void main(String[] args) 
    {
	   demo1 d=new demo1();
	   d.m1();
	 //  System.out.println(super.a);
	 // System.out.println(this.a);
	   
	}
	public void m1() 
	{
	   int a=10;
	   System.out.println("local variable: "+a);
	   System.out.println("globle varible from same class: "+this.a);
	   System.out.println("globle variable from diff class: "+super.a);
	}
    
}
