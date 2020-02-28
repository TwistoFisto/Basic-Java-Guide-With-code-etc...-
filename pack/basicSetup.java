package revisionstuff.pack;
//Name of the package this class java file is in

/**
Java is an object-oriented language, meaning we have to define our classes, objects, and methods
Objects are based off classes
Classes are basically blueprints which the corresponding objects are based off

Java is COMPILED BASED; this means your code must be be ran into a process, sort off like rendering a video from Sony Vegas/Adobe Premiere,
or running a check and assembling it together. This is initially slow, the code will generally run faster in some respect compared to an interpreter
For those that have used Python before, Python is interpreter based, meaning you can run the code without the Development Environment checking it,
	again, has it's own pros and cons.

With Java, there are specifics that you will to know, if you came from Python it may be difficult to adjust because of it's differences.

Here is a basic setup, the primary class, for a primary class it must be public(an access modifier, meaning it can be easily accessed by other classes)
We know it's a class because of the keyword 'class', simple.
This class is somewhat special, because we cannot change the name of the class, this is actually the name of our .java file, which is a class
So if you want to change the name of this particular class, you'll have to change the name
**/
public class basicSetup // See 'notes a1'
{ //See 'notes a2'
	
	/**
	This here is what we call a method(or a function in Python)
	Methods are blocks of code that can be called upon to perform a process
	This method is unique, because this is our 'main' method, the first thing the code will run when opened
		Java MUST have a main method, otherwise code won't run, though there are exceptions to the rule, that's more advanced and won't be in the exam
		This means, the name of this method must be 'main' as well.
	
	To break down the method, we know what public is:
		static - allows the method to be called without creating an object (you can see an example in classAndMethods.java)
		void - means the method won't return a value, all methods are fruitful by default and require something to be returned, void won't return a value
		String[] args - stores Java commandline arguments, the name is args but can be something else, but hey, it's up to you (I'd say, don't bother changing it without good reason)
	Remember this main method, it's essential for java
	 */
	public static void main(String[] args)
	{ //Same case as 'notes a2'
		// Here is where you can begin your primary code, this is what the program will run first, before all your methods and classes
		// On another note, all code must end with a ';' except for creating if statements, methods and classes, you'll see this everywhere, just not here
		

	}

}


/**
Notes:
a1 - You may notice how the 'S' is capitalised, this is called Camel Casing, it's a good to differentiate between words that are usually adjoined

a2 - Classes and methods must be within the assigned brackets, this essentially groups all the code within a class,
	 this may be troublesome to deal with as missing brackets or adding too many will result in syntax errors,
	 but it's better than having indentations from determining which code belongs to what
	 Another thing to note, {} these brackets, not [], or (), okay?

**/