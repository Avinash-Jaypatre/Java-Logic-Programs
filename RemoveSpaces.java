package PTC;

public class RemoveSpaces 
{
	public static void main(String[] args) 
	{
		String str="Akshay Deshmukh on the job";
		
		String removespace=str.replaceAll("\\s","");
		System.out.println(removespace);
		
	}

}
