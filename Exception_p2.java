package yes_i_can;
public class Exception_p2
{
	void array()
	{
		System.out.println("Method beggining ..");
		
		int []arr= {10,20,30}; 
		try
		{
			System.out.println(arr[3]);      //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 at yes_i_can.Exception_p2.array(Exception_p2.java:9),at yes_i_can.Exception_p2.main(Exception_p2.java:16)	
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			System.out.println("Method end ..");
	}
	public static void main(String[] args)
	{
		Exception_p2 ref = new Exception_p2();
		ref.array();

	}

}
