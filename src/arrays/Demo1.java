package arrays;

public class Demo1 //single dimenstional String array
{
  public static void main(String[] args) 
  {
	 String []str=new String [5];
	 
	 str[0]="pooja";
	 str[1]="arti";
	 str[2]="anni";
	 
	 System.out.println(str[0]);
	 System.out.println(str.length-1);
	 System.out.println(str.length);
	 
	 for(int i=0; i<=str.length-1; i++)
	 {
		 System.out.println(str[i]);
	 }
	 
	 System.out.println("-------------");
	 
	 for(int i=str.length-1; i>=0; i--)
	 {
		 System.out.println(str[i]);
	 }
  }
}
