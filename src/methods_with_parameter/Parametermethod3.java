package methods_with_parameter;

public class Parametermethod3
{                                    //SRM call from diff class
	public static void SRM3(int wt, float height, String name)      //declaration
	   {
		System.out.println("<--------------------------SRM3_from diff class------------------------>");
		System.out.println(wt+"\n"+height+"\n"+name);               //usage
	   }

	
	
	public void NSRM3(String fname, long aadharno, String email )
	   {
		
		System.out.println("<---------------------NSRM3_from diff class------------------->");
		System.out.println(fname+"\n"+aadharno+"\n"+email);
		
	   }
	   
	
	
	
	
	
	
	 
	
}
