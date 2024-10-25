package Workset;

@FunctionalInterface
interface Test1 {
	
	public String returnHello();
	
	default int returnDefault(int a ,int b) {
		return a+b;
	}
	
	static int Product(int a,int b) {
		return a*b;
	}
}
 public class TestMain implements Test1{
	 @Override
	public String returnHello() {
			// TODO Auto-generated method stub
			return null;
		}
	public static void main(String[] args) {
		TestMain m=new TestMain();
		System.out.println(m.returnDefault(2, 4));
		
		System.out.println(Test1.Product(3, 5));
	}
	
	 
 }
