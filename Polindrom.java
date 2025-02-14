package Logic;
import java.util.*;
public class Polindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int t1=num;
		int rev=0,rem;
		
		while(t1 !=0)
		{
			rem = t1%10;
			rev = rev*10+rem;
			t1=t1/10;
		}
		if(num==rev)
		{
			System.out.println("Num is Polindrom");
		}else
		{
			System.out.println("Num is not Polindrom");
		}
	}
	

}
