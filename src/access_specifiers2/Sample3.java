package access_specifiers2;

import access_specifiers1.Demo3;

public class Sample3 
{
	public static void main(String[] args)               //   public member access from diff package --->Demo3
	{
	  Demo3 d1=new Demo3();
	  d1.cubeofnum();
	  System.out.println(d1.num1);
	}
	
	
	
}
