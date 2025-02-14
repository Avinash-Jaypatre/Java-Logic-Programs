package PTC;

public class RemoveSpecial_character 
{
	public static void main(String[] args) 
	{
		String str= "@hy@19#ja**";
		
		String plainstr = str.replaceAll("[^a-z0-9A-Z]","");
		System.out.println(plainstr);
	}

}
