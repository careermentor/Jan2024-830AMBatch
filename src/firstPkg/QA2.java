package firstPkg;

public class QA2 extends QA1
{

	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("addition of a&b = " + c);
	}
	
	int x = 100;
	
	public void printVar()
	{
		final int x = 200;
		//x = 300;
		
		System.out.println(x);  //200
		System.out.println(this.x);  //100
		System.out.println(super.x);  //500
		
		super.sum(20, 30);
	}
	
	
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b = " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(30, 10);
		
		
		q2.sum(20, 30);
		q2.printVar();
		
	}

	
	public void mQA1I() {
		System.out.println("this is a method of QA1I");
		
	}
	
}
