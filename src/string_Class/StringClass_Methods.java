package string_Class;

public class StringClass_Methods{
 public static void main(String[] args) 
  {
	 String s1="abc";
	 String s2="";
	 String s3=" ";
	 String s4="pd";
	 String s5="my name is pooja";
	 String s6="abcd";
	 String s7="ABCD";
	 String s8="velocity";
	 String s9="abcabcab";
	 String str="SoftwareTesting";
	 System.out.println(s1.length()+"  -->length()");   
	
	 System.out.println(s2.isEmpty()+"  -->isEmpty()");  
	 System.out.println(s3.isEmpty());
	 System.out.println(s4.isEmpty());
	
     System.out.println(s5.contains("my ")+"  -->contains()");
	 
	 System.out.println(s6.equals(s7)+"  -->equals()");
	 System.out.println("compair address of two string: "+(s6==s7));
	
     System.out.println(s6.equalsIgnoreCase(s7)+"  -->equalsIgnoreCase()");
         
     System.out.println(s8.toUpperCase()+"  -->toUpperCase()");  //temporary
     s8=s8.toUpperCase();                                        //reinitialization
     System.out.println(s8.toUpperCase());                       //permanant
     
     System.out.println(s1.charAt(1)+"  -->charAt()");   
     
     System.out.println(s8.indexOf('C'));     //**VELOCITY
     System.out.println(s9.lastIndexOf('b')); 
     
     System.out.println(s5.startsWith("my")+"  -->startsWith()");  
     System.out.println(s5.endsWith("Pooja")+"  -->endsWith()");
     
     System.out.println(s5.substring(2)+"  -->substring(startindex)");
     System.out.println(s8.substring(0, 4)+"  -->substring(startindex),endindex"); //reinitialization of s8   
     
     System.out.println(s6.concat(s7).concat(s1)+"  -->concat()");
     System.out.println(s6+s7+s1);                 //same output -concatinatio symbol
     
     System.out.println(s5.replace("pooja","PD"));
     
     String[] ar= s5.split(" ");       //splits()
     System.out.println(ar[2]); 
     System.out.println(ar.length);
     System.out.println(ar.length-1); 
     
     for(int i=0; i<=ar.length-1; i++)
     {
    	 System.out.print(ar[i]+" ");
     }
     System.out.println();   
     for(int i=ar.length-1; i>=0; i--)
     {
    	 System.out.print(ar[i]+" ");
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	
	
	
	
	
	
	
	
}	
}
