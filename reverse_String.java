package PTC;

public class reverse_String 
{
	public static void main(String[] args) 
	{
		String str= "Avinash";
		char ch[]= str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
