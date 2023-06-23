package string_Class;

public class All_String_Methods 
{
public static void main(String[] args) 
{
           String s1="velocity";
		   String s2="";
		   String s3="ABCD";
		   String s4="abcd";
		   String s5="Mynameispooja";
		   String s6="POOJA";
		   String s7="abcabcdabc";
		   
		   System.out.println(s1.length());        //length()
		   System.out.println(s1.isEmpty());       //isEmpty()
		   System.out.println(s2.isEmpty());
           System.out.println(s3.equals(s4));
           System.out.println(s3.equalsIgnoreCase(s4));
           System.out.println(s5.contains("name"));
           System.out.println(s1.toUpperCase());
           System.out.println(s1);
           s1=s1.toUpperCase();
           System.out.println(s1);
           System.out.println(s6.toLowerCase());
           System.out.println(s1.charAt(1));
           System.out.println(s3.indexOf('B'));
           System.out.println(s5.indexOf("pooja"));
           System.out.println(s7.lastIndexOf('c'));
           System.out.println(s5.startsWith("My"));
           System.out.println(s5.endsWith("pooja"));
           System.out.println(s1.substring(4));
           System.out.println(s7.substring(0, 5));
           System.out.println(s3.concat(s4));
           System.out.println(s3+s4);
           System.out.println(s5.replace("pooja", "PD"));
           
           String s8= "velocity";
           
           String[] ar=s8.split("");
           System.out.println();
           
           for(int i=0; i<=ar.length-1; i++)
           {
        	   System.out.print(ar[i]+"");
           }
           System.out.println();
           
           for(int i=ar.length-1; i>=0; i--)
           {
        	   System.out.print(ar[i]+"");
           }
           
           
           
           
           
           
           
           
}
}
