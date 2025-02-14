package PTC;
import java.util.*;
public class Length_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String..!");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(" "+i+" :"+str.charAt(i));
		}
	}

}
