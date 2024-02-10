package firstPkg;

public class MYClass extends DemoAbsClass 
{

	
	public void meth2() 
	{
	
		System.out.println("this is abstract method which is implemented in the child class");
		
	}
	
	public static void main(String[] args)
	{
	
		MYClass mc = new MYClass();
		mc.meth1();
		mc.meth2();
		
	}

}
