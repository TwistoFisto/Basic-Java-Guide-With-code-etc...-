package revisionstuff.pack;

//Varables can store values and data, then manipulated through command line arguments

public class variablesConstantsAndArguments 
{
	public static void main(String[] args) 
	{
		//Before we start
		System.out.println("Hello World");
		//This will be your bread and butter command for your beginnings, it will just display whats inside. This will be IMPORTANT from now on.
		
		System.out.println("damn straight" + " joemama"); //The '+'symbol here puts things together, but can also add in some circumstances.
		
		
		
		//Java is statically typed, meaning variables must be defined and declared before being assigned
		//For example
		int yeet = 6;	//Here is variable 'yeet'
		//This is what java generally wants you to do when making variables: define the data type (we'll cover this in a minute), variable name, and optionally an assignment
		
		int yeetagain;	//You can also make a variable without assignment with this line
		
		// yeetnotagain = 6; //This argument will not work because you have not properly declcared the variable
						  	//variable 'yeetnotagain' needs a definition basically
							//Think it this way, you are declaring a variable, but of what kind?
		
		//Using System.out... we can see whats inside of these variables
		System.out.println(yeet); //You will just see '6' in the console log, because that's what it has been assigned
		
		/**
		So what we tried was making int variables, what is int?
		
		
		int is a DATA TYPE
		
		
		this is what we declare a variable with, variables need a data type assigned to them
		int is not the only data type, duh (and I'm just gonna rip values out off w3schools, because it's fairly accurate):
			int		-	integers, whole numbers between -2,147,483,648 to 2,147,483,647
			String	-	for storing text
			boolean	-	yes	or no, true or false
			float	-	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
			byte	-	Stores whole numbers from -128 to 127
			short	-	Stores whole numbers from -32,768 to 32,767
			char	-	Stores a single character/letter or ASCII values
			long	-	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
			double	-	Stores fractional numbers. Sufficient for storing 15 decimal digits
			
		As a side note, there are primitive data types, these specify the limit range, and type of data that can be stored into
		byte		-	1 Byte
		short		-	2 Bytes
		int			-	4 Bytes
		long		-	8 Bytes
		float		-	4 Bytes
		double		-	8 Bytes
		boolean		-	1 Bit
		char		-	2 Bytes
		
		you can also apply 'final' as an attribute to a variable, this acts as a constant, the value stored will not change
		Like this*/
		final int pots = 7;
		// pots = 10; This will throw up an error because you cannot change the value in a constant.
		
		
		//Although variables can be reassigned when ever, if they don't have the 'final' as an attributed, for example:
		yeet = 10;
		//Variable, 'yeet' had the value, 6, NOW, it is 10
		//We can check this using System.out...
		System.out.println(yeet);
		
		
		//String variables are a little weird, sure they are variables, just not primitive
		String yikes = "I like that";
		//Two things,String is also aclass,to which you call up
		//Second, when assigning a string value, you will need "" to further show what is inside, otherwise it will cause a syntax error
		//We can check the value with System.out...
		System.out.println(yikes);
		
		
		float decimals = 5.5f;
		//Example of a float variable, the 'f' at the end of the number is necessity otherwise it will not work.
		
		
		boolean yesno = true;
		boolean maybenot = false;
		//Examples of initialising boolean variables.
		
		//As an added note, you can add "context" to variables by how you display it
		System.out.println("The amount of people died from coronavirus since feburary: " + yeet);
			//This will show the string sentence, but will show an integer alongside, this is an example, not a particularly a true statement, but nonetheless
			
		
		
		//***********************************************************************//
		//Section 2 - Variable clauses
		
		//Java includes basic mathmatical operations,
		int number1 = 10;
		int number2 = 20;
		
		int number3 = number1 + number2;
		//This is similar to high school algebra, you can see it as number3 = 10 + 20, number3 equates to 30 of course.
		
		
		int number4 = number1 * number2; //Multiply
		int number5 = number2/number1; //Division
		int number6 = number2 - number1; //Subtraction
		int number7 = number2 % number1; //Modulo, division, but you are only counting the remainders.
		//Few exmaples of other basic mathematical operations
		
		//Nothing stops you from chaining more variables together them together
		int newNumber1 = 1;
		int newNumber2 = 2;
		int newNumber3 = 3;
		int newNumber4 = newNumber1 + newNumber2 + newNumber3;
		//newNumber4 should equal to 6
		
		//Note that more advanced mathamatical operations, but those requires additional import clauses if you want to 'em.
		
		//You can also "add string" variables
		String number10 = "10";
		String number20 = "20";
		String showAnswer1 = number10 + number20;
		//What I mean by add? I meant CONCATENATE.
		//it would show up as 1020, NOT 30. Because string variables are letters, and you are merely joining them together.
			//Don't believe me? See for yourself, have java print out the variable 'showAnswer1'
		
		
		
		System.out.println(number10 + (newNumber1+newNumber2)); //Remember the GOOD OLD BIDMAS? that's right, you'll need that GOOD STUFF
		/**
		B - BRACKETS
		I - INDICIES (other things like powers and square roots, anything that isn't on the basic operators)
		D - DIVISION
		M - MULTIPLICATION
		A - ADDITION
		S - SUBTRACTION
		*/
		
		
	}

}
