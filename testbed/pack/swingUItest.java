package testbed.pack;
import javax.swing.*;
import java.util.Scanner;

//This java class is a basic mess around with java swing, a gui code library that is based off the java awt package.

public class swingUItest 
{
	public static void main(String[] args) 
	{

		System.out.println("nah man"); //log console test
		JFrame f = new JFrame(); //This line creates an instance object of JFrame, the window that we can interact with.
		
		//Over here we are setting some parameters for out new frame object called f
		f.setSize(400,500); //sets the default window size: width,height format (when running the program it can also be manipulated as well, in-built probably)
		f.setLayout(null); //not using any layout managers
		f.setVisible(true); //sets frame visibility, true will show the window
		
		
		Scanner yeet = new Scanner(System.in);
		System.out.println("Console Log: ");
		int test = yeet.nextInt();
		
		//this is extra, we can test and see how we can alter from one frame to another
		if(test == 2)
		{
			System.out.println("nah my dude");
			f.setVisible(false); //turns the f frame invisible so it can no longer be interacted with
			JFrame b = new JFrame(); //making a new frame, and the code below just sets out the parameters
			b.setSize(500,600);
			b.setLayout(null);
			b.setVisible(true);		
		}


	}

}
