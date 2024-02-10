package demoPkg;


public class DemoClass 
{

	static int a=10;
	String name = "Santosh";
	int age = 40;
	char b = 'X';
	float c = 20.5f;
	boolean d = true;
	
	
	public static void printVar()
	{
		System.out.println(a);
		
	}
	
	public void meth2()
	{
		System.out.println("this is non static method");
	}
	
	
	public static void main(String[] args) 
	{
	
		DemoClass abc = new DemoClass();  //object of the class
		abc.meth2();
		
		DemoClass.printVar();
		
	}
	
	
	
	
	
	
	
	
	
}
