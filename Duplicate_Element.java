package PTC;

public class Duplicate_Element
{
	public static void main(String[] args) 
	{
		int arr[]= {20,11,14,16,22,11,20};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					count++;
				}
			}
			
		}
		
		
	}

}
