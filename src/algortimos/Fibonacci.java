package algortimos;

public class Fibonacci 
{
	static int r1=0,r2=1,r3=0;
	
	public static void fibonacciNormal(int count) 
	{
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);

		for (int index = 0; index < count; ++index) 
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	
	
	public static void fibonacciRecursivo(int count)
	{
		System.out.print(r1+" "+r2);
		fibonacci(count);
	}
	
	
	public static void fibonacci(int count)
	{
		if(count>0)
		{
			r3 = r1 + r2;
			r1 = r2;
			r2 = r3;
			System.out.print(" "+r3);
			fibonacci(count-1);
		}
	}

	public static void main(String[] args) 
	{
		System.out.print("Normal: "); fibonacciNormal(10);
		System.out.print("\nRecursive: "); fibonacciRecursivo(10);
	}
}
