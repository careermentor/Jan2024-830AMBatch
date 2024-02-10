package firstPkg;

public class SimpleClass 
{
	
	int a = 30;
	

	public void printVar()
	{
		final int a = 20;   //constant
		//a=40;
		System.out.println(a);  //20  //40
		
		System.out.println(this.a);  //30
	}
	
	
	public void printGlbVar()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
	
		SimpleClass sc = new SimpleClass();
		sc.printVar();
		sc.printGlbVar();
		
	}
	
}
