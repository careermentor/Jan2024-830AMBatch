package firstPkg;

public abstract class DemoAbsClass    //concrete class
{

	int a = 50;
	//a = 300;
	
	public void meth1()     //concrete method
	{
		System.out.println("this is a concrete method");
		
		int a = 100;
		a = 200;
		System.out.println(a);
	}
	
	public abstract void meth2();
	
	public static void main(String[] args) 
	{
	
		//DemoAbsClass dac = new DemoAbsClass();
		//dac.meth1();
		
	}
	
}
