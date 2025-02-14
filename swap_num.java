package Logic;
public class swap_num 
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=3;
		
		 int temp = a;
		 a=b;
		 b=temp;
		
		 System.out.println("a :"+a+" b :"+b);
		 
		 System.out.println("*************");
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a :"+a+" b :"+b);
	
	}

}
