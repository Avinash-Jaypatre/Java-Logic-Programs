package yes_i_can;

public class Exception_p3 
{

	public static void main(String[] args) 
	{
		System.out.println("Method beggining ..");
		int []arr=null;
		try
		{
			System.out.println(arr[0]);   //Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr" is null at yes_i_can.Exception_p3.main(Exception_p3.java:9)
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("I dont care Exception handle or not i am always run ..");
		}
		System.out.println("Method Ending..");
		
		
	}

}
