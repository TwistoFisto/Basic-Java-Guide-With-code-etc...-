package revisionstuff.pack;

public class loopsAndIfStatementsAndCases 
{

	public static void main(String[] args) 
	{
		//Have you ever wondered why rpg quest objects need to be completed? or how does software cater to multiple use cases?
		//it's thanks to loops, and if statements that allows us to compare values, validate and states of said values.
		
		/*************************************************************/
		// If statements
		
		//Before tackling this, there's something you'll need to know
		/**
		 * Logic Operations, ones that COMPARE between variables, constances and values.
		 * a <  b		a is less than b, or wording it differently, b is bigger than a
		 * a <= b		a equates or less than b, or wording it differently, b equates or is bigger than a
		 * a >  b		a is bigger than b, or alternatively, b is smaller than a
		 * a >= b		a equates to or is bigger than b, or alternatively, b equates or is smaller than a
		 * a == b		a is equal to b, don't get it confused with a = b (because it's an assignment)
		 * a != b		a is not equal to b
		 */
		
		/**
		|If statements| 
		these are blocks of code that can only run if the statement/condition is true
		*/
		int state1 = 25;
		int kek = 30;
		
		if(state1 < kek)
		{
			System.out.println("Deported");
		}
		
		//Now the code will run obviously, but what happens when the condition is not true
		if(kek == state1)
		{
			System.out.println("nah mate");
		}
		System.out.println("?");
		//As you can see, it just skips the code block, which is usually fine unless you don't want that to happen
		//As for this we'll need to use 'else if' and else statements
		//an 'else' statement runs when the if statement's condition before it is false,
			//as an added note, the else statement doesn't need a condition, as it runs when other if statements are false
		
		//else if statements are a mix between the aforementioned statements, it's an else statement with a condition
		
		int state2 = 20;
		
		if(kek == state1)
		{
			System.out.println("You wot mate");
		}
		else if(kek == state2)
		{
			System.out.println("nah man wut duh?");
		}
		
		else
		{
			System.out.println("If all fails, run this code");
		}
		
		
		
	}

}
