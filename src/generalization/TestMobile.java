package generalization;

public class TestMobile 
{
   public static void main(String[] args) 
   {
	Vivo v=new Vivo();
	v.Price();
	v.camera();
	v.RAM();
	v.ROM();
	System.out.println("------");
	
	Oppo v1=new Oppo();
	v1.Price();
	v1.camera();
	v1.RAM();
	v1.ROM();
	System.out.println("------");
	
	OnePlus v2=new OnePlus();
	v2.price();
	v2.camera();
	v2.RAM();
	v2.ROM();
   }
}
