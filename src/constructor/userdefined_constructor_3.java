
package constructor;

public class userdefined_constructor_3 
{
   String sname;
   String city;
   
   userdefined_constructor_3()
   {
	   sname="Pooja";
	   city="Ahmednagar" ;
   }
   
	public static void main(String[] args) 
	{
		userdefined_constructor_3 s3=new userdefined_constructor_3();
		s3.m1();	
	}
	
	public void m1()
	{
		System.out.println(sname+"\n"+city);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
