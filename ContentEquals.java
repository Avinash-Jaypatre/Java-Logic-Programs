package PTC;
public class ContentEquals 
{
	public static void main(String[] args) 
	{
		String name = "Akshay";
		String Lname= "Akshay";
		System.out.println(name.contentEquals(Lname)); //true
		
		String Lname1 = "Mayuri";
		System.out.println(name.contentEquals(Lname1)); //false
		
	}
}
