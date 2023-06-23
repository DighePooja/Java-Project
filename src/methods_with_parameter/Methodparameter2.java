package methods_with_parameter;

public class Methodparameter2
{
	public static void main(String[] args)
	{
		          //call public static regular method with parameter-classname.methodname();
		   SRM1(30,20,10);     
		   SRM1(40,50,60);
		
		   SRM2("Pooja","Dighe");
		   SRM2("Dighe", "Pooja");
		   
		   Methodparameter2 obj1=new Methodparameter2();                          //1) object creation
		   obj1.NSRM1(20,10);                                                     //method call
		   
		   obj1.NSRM2("Pooja",109,8421075530l,95.5f,'A');  
		  
		   Parametermethod3.SRM3(60,5.6f,"Pooja");                             //SRM from diff class
		   
		   Parametermethod3 obj2=new Parametermethod3();                       //NSRM from diff class
		   obj2.NSRM3("Pooja Dighe",940697401849l,"poojadighe009@gmail.com");
	}
	
	
	                        //int int parameter method
	public static void SRM1(int num1, int num2, int num3)   //declaration	   
	  { 		
		   System.out.println("addition of 3 num :"+ (num1+ num2+ num3) );    //usage(addition)			  
	  }
	                
	                        //string parameter method
	public static void SRM2(String sname, String lname) 
	  {		    
		    System.out.println(sname +" "+lname);		    
	  }
	
	public void NSRM1(int no1,int no2)      //declaration
	  {     
		    System.out.println("<-----------------------NSRM1------------------------->");
		    System.out.println(no1+no2);    //usage
	  }
	public void NSRM2(String sname, int rollnum, long mobnum, float sper, char grade)    ///declaration
	  {
		System.out.println(sname+"\n"+rollnum+"\n"+mobnum+"\n"+sper+"%"+"\n"+grade);
	  }
	
	
	
}
