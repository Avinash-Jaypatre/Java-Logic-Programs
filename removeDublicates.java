package PTC;
import java.util.*;
public class removeDublicates 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,10,11,55,11,88};
		
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
