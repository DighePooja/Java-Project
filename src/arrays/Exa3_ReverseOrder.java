package arrays;

public class Exa3_ReverseOrder 
{
public static void main(String[] args) 
{
	int ar []=new int[5];                //array declaration
	
	ar[0]=10;
	ar[1]=20;
	ar[2]=30;                           //array initialization
	ar[3]=40;
	ar[4]=50;
	
	
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
}
}
