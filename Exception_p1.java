package yes_i_can;

public class Exception_p1
{
	void add()
	{
		System.out.println("Method start ..");
		int a =10;
		try
		{
			int result = a/0;   
			System.out.println(result);
		}catch (ArithmeticException e)
		{
			System.out.println("Exception handel ..");
		}
		System.out.println("Method End ..");
	}

	public static void main(String[] args) 
	{
		Exception_p1 ref = new Exception_p1();
		ref.add();

	}

}
