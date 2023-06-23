package inheritance;

public class Hierarchical5 
{
	public static void main(String[] args) 
	{
		System.out.println("----------Features of son 1------------");
		Hierarchical2 s1=new Hierarchical2();
		s1.Home();
		s1.Car();
		s1.Money();
		s1.Son1();
		
		System.out.println("----------Features of son 2------------");
		Hierarchical3 s2=new Hierarchical3();
		s2.Home();
		s2.Car();
		s2.Money();
		s2.Son2();
		
		System.out.println("----------Features of son 3------------");
		Hierarchical4 s3=new Hierarchical4();
		s3.Home();
		s3.Car();   
		s3.Money();
		s3.Son3();
  		   
  	 }  
                   
	     
	     
	     
	     
	    
	      
	
	
	
	
	
}
