package arrays;

import java.util.Arrays;

public class Exa4_Sorting 
{
public static void main(String[] args) 
{
   int ar[]=new int[4];
   
   ar[0]=20;
   ar[1]=30;
   ar[2]=40;
   ar[3]=10;
   
   Arrays.sort(ar);                //Arrays--default class  sort--static method  for Sorting
   
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("------------");
	
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
}
}
