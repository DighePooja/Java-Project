package controlstatements;

public class Nested_if 
{
public static void main(String[] args) 
{
     int TotalAmmount=1000;
     
     if(TotalAmmount>=500)
     {
    	 System.out.println("Eligible for free Delivery");
    	    
    	 if(TotalAmmount>=700)
    	 {
    		 System.out.println("Additional 10% Discount");
    	 }
    	 
    	 else
    	 {
    		System.out.println("No Disccount applicable");
    	 }
    	 
    	 if(TotalAmmount>=1000)
    	 {
    		 System.out.println("Flat 400rs OFF");
    	 }
    	  
    	 else
    	 {
    		 System.out.println("You have to pay 1000rs ");
    	 }
    	 	 
     }
     
     else 
     {
    	 System.out.println("No free delivery available");
     }
}
}
