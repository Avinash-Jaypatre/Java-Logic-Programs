package PTC;

public class replace_String
{
	public static void main(String[] args) 
	{
		String str = "Vinay";
		String str1 = str.replace("V","E"); //replace
		System.out.println(str1);
		
		String str2 ="Avinash Jayptre";
		String str3 =str2.replaceAll("\\s",""); //remove spacess
		System.out.println(str3);
		
		String special = "@hh$qiwj&n%c#m)";
		String special1 = special.replaceAll("[^a-zA-Z0-9]",""); //remove Special Character
		System.out.println(special1);
	}

}
