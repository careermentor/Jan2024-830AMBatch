package firstPkg;

public class QA4 extends QA2 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of a&b = " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		//q4.sum(20, 30);
		q4.sub(30, 10);
		//q4.mul(20, 30);
		q4.div(40, 20);
		q4.mQA1I();
		q4.mQA3I();
		
	}

	
	public void mQA3I() {
		System.out.println("this is method of QA3I interface");
		
	}
	
}
