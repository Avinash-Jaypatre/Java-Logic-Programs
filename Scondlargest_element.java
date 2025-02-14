package PTC;

import java.util.Arrays;

public class Scondlargest_element 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,33,22,11,66};
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		for(int num:arr)
		{
			System.out.println(num);
		}
	}

}
