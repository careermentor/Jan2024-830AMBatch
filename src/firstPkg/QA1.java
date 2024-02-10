package firstPkg;

public class QA1 
{

	int x = 500;
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b = " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("addition of a&b&c = " + d);
	}
	
	public void sum(int a, float b) // 10+20.5 = 30.5
	{
		float c = a+b;
		System.out.println("addition of a&b = " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		
		q1.sum(20, 30.5f);
		
		q1.sum(10, 20, 30);
		
	}
	
}
