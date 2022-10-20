public class SwapWithoutAdditionVariable
	{
	public static void main(String args[]) {
	int a=40;
	int b=10;
	a=a+b;
	b=a-b;
	a=b-a;
	System.out.println("after swapping:"+a+"and"+b);
	}
	}