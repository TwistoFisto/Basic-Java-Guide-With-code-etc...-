package testbed.pack;

public class yesno {
	public static void main(String[] args) 
	{
		boolean x = false;
		boolean y = true;
		boolean z = false;
		
		if (!(x||z) && (x &&y))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
