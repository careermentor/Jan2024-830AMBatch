package firstPkg;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth3() {
	
		System.out.println("this is interface method3");
	}

	
	public void meth4() {
	
		System.out.println("this is interface method4");
		
	}

	public static void main(String[] args) {
		
		CallDemoInterface cd = new CallDemoInterface();
		cd.meth3();
		cd.meth4();
		
	}
	
}
