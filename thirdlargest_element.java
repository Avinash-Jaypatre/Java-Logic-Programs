package PTC;

import java.util.Arrays;

public class thirdlargest_element 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,90,22,11,66,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]);
	}

}
