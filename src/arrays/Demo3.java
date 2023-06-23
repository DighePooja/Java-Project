package arrays;

public class Demo3 //multidimentional array -->int 
{
public static void main(String[] args) 
{
    int ar[][]= {{10,20,30},{5,15,25},{5,15,20}};	
    
    System.out.println(ar.length-1);
    
    
    for(int i=0;i<=2; i++)
    {
    	for (int j=0; j<=2; j++)
    	{
    		System.out.print(ar[i][j]+" ");
    	}
    	System.out.println("");
    
    }
    
}
}
