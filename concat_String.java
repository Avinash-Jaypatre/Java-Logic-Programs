package PTC;

public class concat_String 
{
	public static void main(String[] args) 
	{
		//first way
		String name="Avinash";
		String Lname = " Jaypatre";
		System.out.println(name.concat(Lname));
		
		//second way
		String s2 = name + Lname;
		System.out.println(s2);
		
	}

}
