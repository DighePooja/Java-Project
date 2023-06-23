package polymorphism;

public class Demo2 extends Demo1
//method overriding 
{
    public void InsurencePolicy2023() 
    {
	   System.out.println("2023: covid coverage and accident coverage");
	}
    
    
    public static void main(String[] args) 
    {
	   Demo2 d2=new Demo2();
	   d2.InsurencePolicy2020();
	   d2.InsurencePolicy2023();
	}
}
