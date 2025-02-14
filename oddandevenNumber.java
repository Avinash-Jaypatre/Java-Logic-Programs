package Logic;

public class oddandevenNumber
{
	public static void main(String[] args) 
	{
		int num=135241;
		int odd=0;
		int even=0;
		while(num>0)
		{
			if(num%2==0)
			{
				even++;
			}else
			{
				odd++;
			}
			num=num/10;
			
		}
		System.out.println(even);
		System.out.println(odd);
		
		
	}
	

}
