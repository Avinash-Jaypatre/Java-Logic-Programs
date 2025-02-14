package Logic;

public class sumofdigit 
{
	public static void main(String[] args) 
	{
		int num=1213;
		int sum=0;
		while(num>0)
		{
			sum=sum + num%10;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
