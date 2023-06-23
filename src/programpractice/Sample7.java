package programpractice;

public class Sample7 
{                   //combine example of regular method call in main method
     public static void main(String[] args) 
     {
		System.out.println("main nmethod statements");
		
		            //call static regular method from same class
			Sample7.SRmethod1();
		
			        //call non static regular method from same class
			        //step-1: create an object------(sameclassname objectname=new sameclassname)			
			Sample7 NSRMobj1=new Sample7(); 
			        //step-2: method call-----------( objectname.methodname(); )
			NSRMobj1.NSRmethod1();
			
			        //call static regular method from diff class
			Sample8.SRmethod2();
			       
			        //call non static regular method from diff class
			        //step1-: create an object-----(diffclasname objectname=new diffclassname)
			Sample8 NSRMobj2=new Sample8();
			        //step2-: method call------->(objectname.methodname();)
			NSRMobj2.NSRmethod2();
	 }
	              
     
                     //static regular method 
     public static void SRmethod1() 
     {
		System.out.println("(1) SRM call from same class");
		System.out.println("method call----->classname.methodname();");
	 }
	                 //non static regular method
     public void NSRmethod1()
     {
    	 System.out.println("(2) NSRM call from same class");
         System.out.println("1-create an object---->classname objectname=new classname();");
         System.out.println("2-method call--------->objectname.methodname();");     
     }
	
	
	
	
	
	
	
	
}
