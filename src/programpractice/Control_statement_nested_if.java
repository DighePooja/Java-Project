package programpractice;

public class Control_statement_nested_if 
{
	
	public static void main(String[] args) 
	{
		int price=1500;
		
		if(price>=800)
		{
			  System.out.println("FREE Delivery");
			
	      if(price>=1000)
	        {
	    	  System.out.println("You will get 10% instant discount");
	        }
	      else
	        {
	    	  System.out.println("No coupons available");
	        }
	      if(price>=1400)
	        {
	    	   System.out.println("Flat Rs.200 cashback");
	        }
	      else
	        {
	    	   System.out.println("Add more items to avail this offer.");
	        }
	    	
		}
		else
		{
			System.out.println("Delivery charges will apply");
		}
		
		
		
	}
	
	
	
	

}
