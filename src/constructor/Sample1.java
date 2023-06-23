package constructor;
                       //User defined comstructor with parameter
public class Sample1
{
    String empname;
    int empID;
    
   Sample1(String a,int b)
   {
	   empname=a;
	   empID= b;
   }
    
    public void m1() 
    {
		System.out.println("Employe name"+"="+empname+"\n"+"Employe ID"+"="+empID);
	}
	
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1("Pooja",109);
		
		s1.m1();
	}
	
	
	
	
	
	
	
	
	
}
