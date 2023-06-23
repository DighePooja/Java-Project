package logical_program;

public class Reverse_num1 
{
    public static void main(String[] args) 
    {
    	int orgnum=1712546;
        int revnum=0;
                              
        //to remove lasr no from org num 
        for(int i=orgnum; i>0; i=i/10) //1234 123.4 123 12.3 12 1.2 1
        {
            int rem=i%10;   //4 3 2 1      //to find last digit 
          
            revnum=revnum*10+ rem;        //to get the last digit and store into revnum
        }         // 432*10  +  1     43     
    	
    	System.out.println(revnum);  //4321
    	
    	
    	
	}
	
	
	
}
