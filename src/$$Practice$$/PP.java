package $$Practice$$;

abstract public class PP 
{
 public static void main(String[] args) 
 {
     String str="1s5s8d4f";
	 String s1 = str.replaceAll("[a-z]", "");
     int sum=0;
	 for(int i=0;i<=s1.length()-1;i++)
	 {
		  sum=sum+Character.getNumericValue(s1.charAt(i));
	 }
	 System.out.println(sum);
 }
}
