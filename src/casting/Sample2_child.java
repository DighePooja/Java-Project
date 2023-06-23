package casting;

public class Sample2_child extends Sample1_super
{
	public void property4() 
    {
		System.out.println("property4");
	}
	public void property1() 
    {
		System.out.println("property1-->overrided in sub class");
	 
    }
	
	public static void main(String[] args) 
	{
		Sample1_super s1=new Sample2_child();
		s1.property1();
		s1.property2();
		s1.property3();
		//s1.property4();
	}
}
