package Logic;

public class min_MaxArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {4,8,12,16,20};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			while(arr[i]>max)
			{
				max = arr[i];
			}
			while(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}
	
	

}
