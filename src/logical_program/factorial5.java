package logical_program;

public class factorial5 {
 public static void main(String[] args) {
	 
	 int num=20;
	 int fact=1;
	 
	 for(int i=num; i>=1; i--)
	 {
		 fact=fact*i;   //1*20 20 19*20 
	 }
	 System.out.println(fact);
}
}
