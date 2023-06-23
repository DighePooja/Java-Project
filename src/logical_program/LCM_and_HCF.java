package logical_program;

public class LCM_and_HCF 
{
  public static void main(String[] args) 
  {
	int a=15;
	int b=10;
	int c=12;
    
	int lcm;
	int hcf=0;
	
	for(int i=1;i<=15;i++)
	{
		if(a%i==0 && b%i==0 && c%i==0)
		{
		   hcf=i;	 //gcd
		}
	}
    System.out.println("HCF/GCD of " +a+ " and " +b+"= "+hcf);
    lcm=a*b*c/hcf;
    System.out.println("LCM= "+lcm);
  }
}