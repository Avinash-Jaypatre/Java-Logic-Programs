package yes_i_can;

public class Exception_p4
{
	public static void main(String[] args) 
	{
		try
		{
			String a ="123 "; //Exception in thread "main" java.lang.NumberFormatException: For input string: "123 "
			int b = Integer.parseInt(a);
			System.out.println(b);
		}finally
		{
			System.out.println("without exception handled we run ..");
		}
		
		
	}

}
