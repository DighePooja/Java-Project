package loop_statements;

public class Sample_1 
{
public static void main(String[] args) 
{
    for(int i=1; i<=5; i++)	
    {
    	System.out.println(i);
    }
    
    
    System.out.println("-----");
    
    for(int i=2; i<=10; i=i+2)
    {
    	System.out.println(i);
    }
    
    for(int i=1; i<=50; i++)
    {
    	if(i%2!=0)
        System.out.println(i);
    }
    
}
}
