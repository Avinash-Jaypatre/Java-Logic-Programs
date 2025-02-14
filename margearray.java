package Logic;

public class margearray 
{
	public static void main(String[] args) 
	{
		int arr1[]= {10,20,30,40};
		int arr2[]= {50,60,70,80};
		
		int marged[]  = new int [arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			marged[i] = arr1[i]; 
		}
		for(int i=0;i<arr2.length;i++)
		{
			marged[arr1.length+i] = arr2[i];
		}
		
		for(int i=0;i<marged.length;i++ )
		{
			System.out.print(" "+marged[i]);
		}
		
	}
	

}
