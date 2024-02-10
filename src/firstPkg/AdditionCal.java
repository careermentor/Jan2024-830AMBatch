package firstPkg;

public class AdditionCal 
{

	public AdditionCal()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("this is a constructor");
		
		System.out.println("Sum of a&b: " +  c  );
		
	}
	
	public AdditionCal(int a, int b)
	{
		int c = a*b;
		System.out.println("multiplication of a&b: " + c);
		
	}
	
	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		//System.out.println("Sum of a&b: ");
		//System.out.println(c);
		
		System.out.println("Sum of a&b: " +  c  );
		return c;
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " +  c  );
		return c;
	}
	
	//30+40+50
	//int x = 30+40;
	//x+50;
	
	
	
	public static void main(String[] args) 
	{
	
		AdditionCal cal = new AdditionCal(20,30);  //consructor will be called automatically
		
		AdditionCal cal1 = new AdditionCal();
		cal.sum();
		
		/*
		cal.sum();
		cal.add(40, 50);
		cal.add(60, 70);
		int x = cal.add(30, 40);
		cal.add(x, 50);
		*/
		
	}
	
}
